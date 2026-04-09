package j4;

import java.io.IOException;
import o4.C2762a;
import o4.C2764c;

/* renamed from: j4.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2592y extends g4.z {
    @Override // g4.z
    public final Object b(C2762a c2762a) {
        if (c2762a.B() == 9) {
            c2762a.x();
            return null;
        }
        try {
            return Long.valueOf(c2762a.u());
        } catch (NumberFormatException e6) {
            throw new g4.p(e6);
        }
    }

    @Override // g4.z
    public final void c(C2764c c2764c, Object obj) throws IOException {
        Number number = (Number) obj;
        if (number == null) {
            c2764c.o();
        } else {
            c2764c.u(number.longValue());
        }
    }
}
