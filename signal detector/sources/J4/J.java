package j4;

import java.io.IOException;
import java.net.URL;
import o4.C2762a;
import o4.C2764c;

/* loaded from: classes.dex */
public class J extends g4.z {
    @Override // g4.z
    public final Object b(C2762a c2762a) throws IOException {
        if (c2762a.B() == 9) {
            c2762a.x();
            return null;
        }
        String strZ = c2762a.z();
        if (strZ.equals("null")) {
            return null;
        }
        return new URL(strZ);
    }

    @Override // g4.z
    public final void c(C2764c c2764c, Object obj) throws IOException {
        URL url = (URL) obj;
        c2764c.w(url == null ? null : url.toExternalForm());
    }
}
