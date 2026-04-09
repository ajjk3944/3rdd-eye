package j4;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import o4.C2762a;
import o4.C2764c;

/* loaded from: classes.dex */
public class K extends g4.z {
    @Override // g4.z
    public final Object b(C2762a c2762a) throws IOException {
        if (c2762a.B() == 9) {
            c2762a.x();
            return null;
        }
        try {
            String strZ = c2762a.z();
            if (strZ.equals("null")) {
                return null;
            }
            return new URI(strZ);
        } catch (URISyntaxException e6) {
            throw new g4.p(e6);
        }
    }

    @Override // g4.z
    public final void c(C2764c c2764c, Object obj) throws IOException {
        URI uri = (URI) obj;
        c2764c.w(uri == null ? null : uri.toASCIIString());
    }
}
