package j4;

import java.io.IOException;
import o4.C2762a;
import o4.C2764c;

/* loaded from: classes.dex */
public class Y extends g4.z {
    @Override // g4.z
    public final Object b(C2762a c2762a) {
        if (c2762a.B() == 9) {
            c2762a.x();
            return null;
        }
        try {
            return Integer.valueOf(c2762a.t());
        } catch (NumberFormatException e6) {
            throw new g4.p(e6);
        }
    }

    @Override // g4.z
    public final void c(C2764c c2764c, Object obj) throws IOException {
        if (((Number) obj) == null) {
            c2764c.o();
        } else {
            c2764c.u(r4.intValue());
        }
    }
}
