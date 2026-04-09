package zh;

import ch.n;
import i3.g;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Random;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f27419a = Charset.forName("UTF-8");

    /* renamed from: b, reason: collision with root package name */
    public static final Random f27420b = new Random();

    public static String a(File file) {
        StringBuilder sb2 = new StringBuilder();
        FileInputStream fileInputStreamJ = null;
        try {
            try {
                fileInputStreamJ = xu.d.j(file, new FileInputStream(file));
                sb2.append(b(fileInputStreamJ));
            } catch (FileNotFoundException e4) {
                e = e4;
                n.e("StringUtils", e);
                sb2.setLength(0);
            } catch (IOException e10) {
                n.e("StringUtils", e10);
                sb2.setLength(0);
            } catch (SecurityException e11) {
                e = e11;
                n.e("StringUtils", e);
                sb2.setLength(0);
            }
            return sb2.toString();
        } finally {
            g.e(fileInputStreamJ);
        }
    }

    public static String b(FileInputStream fileInputStream) throws IOException {
        StringBuilder sb2 = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream, f27419a));
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                return sb2.toString();
            }
            sb2.append(line);
        }
    }
}
