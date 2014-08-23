package juanllado.countryips.utils;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.io.File;
import java.io.IOException;

import juanllado.countryips.utils.FileUnzipper;

import org.apache.commons.io.FileUtils;
import org.junit.Before;
import org.junit.Test;

public class FileUnzipperTest extends FileUnzipper {

    private FileUnzipper descompresor;
    private static String TMP_DIRECTORY = "tmp";

    @Before
    public void setUp() throws IOException {
        descompresor = new FileUnzipper();
        FileUtils.deleteDirectory(new File(TMP_DIRECTORY));
    }

    @Test
    public void testDescomprimir() {
        descompresor.unzip("GeoIPCountryCSV.zip", TMP_DIRECTORY);
        assertThat(new File(TMP_DIRECTORY).list().length > 0, is(true));
    }

}
