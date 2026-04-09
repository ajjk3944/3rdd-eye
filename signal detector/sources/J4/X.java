package j4;

import com.google.android.gms.internal.ads.AbstractC1135f5;
import java.io.IOException;
import o4.C2762a;
import o4.C2764c;

/* loaded from: classes.dex */
public class X extends g4.z {
    @Override // g4.z
    public final Object b(C2762a c2762a) throws IOException {
        if (c2762a.B() == 9) {
            c2762a.x();
            return null;
        }
        try {
            int iT = c2762a.t();
            if (iT <= 65535 && iT >= -32768) {
                return Short.valueOf((short) iT);
            }
            StringBuilder sbP = AbstractC1135f5.p(iT, "Lossy conversion from ", " to short; at path ");
            sbP.append(c2762a.n(true));
            throw new g4.p(sbP.toString());
        } catch (NumberFormatException e6) {
            throw new g4.p(e6);
        }
    }

    @Override // g4.z
    public final void c(C2764c c2764c, Object obj) throws IOException {
        if (((Number) obj) == null) {
            c2764c.o();
        } else {
            c2764c.u(r4.shortValue());
        }
    }
}
