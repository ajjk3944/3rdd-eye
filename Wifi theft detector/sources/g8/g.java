package g8;

import java.io.Closeable;
import java.io.IOException;

/* loaded from: classes3.dex */
public abstract class g {
    public static void a(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e10) {
                e10.printStackTrace();
            }
        }
    }
}
