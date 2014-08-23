package juanllado.countryips.utils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

public class FileDownloader {

    public FileDownloader() {
    }

    public FileDownloader(boolean proxy) {
        if (proxy) {
            loadProxyConfig();
        }
    }

    public File download(String fromUrl, String toPath)
            throws MalformedURLException, IOException {

        ReadableByteChannel rbc = Channels.newChannel(new URL(fromUrl).openStream());
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(toPath);
            fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try { fos.close(); } catch (IOException e) { /* IGNORE */ }
        }
        File file = new File(toPath);
        return file;
    }

    public void loadProxyConfig() {
        System.setProperty("http.proxyHost", "");
        System.setProperty("http.proxyPort", "");
        System.setProperty("http.proxyUser", "");
        System.setProperty("http.proxyPassword", "");
    }

}