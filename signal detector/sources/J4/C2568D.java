package j4;

import com.google.android.gms.internal.ads.AbstractC1135f5;
import java.io.IOException;
import java.math.BigDecimal;
import o4.C2762a;
import o4.C2764c;

/* renamed from: j4.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2568D extends g4.z {
    @Override // g4.z
    public final Object b(C2762a c2762a) throws IOException {
        if (c2762a.B() == 9) {
            c2762a.x();
            return null;
        }
        String strZ = c2762a.z();
        try {
            return i4.i.i(strZ);
        } catch (NumberFormatException e6) {
            StringBuilder sbQ = AbstractC1135f5.q("Failed parsing '", strZ, "' as BigDecimal; at path ");
            sbQ.append(c2762a.n(true));
            throw new g4.p(sbQ.toString(), e6);
        }
    }

    @Override // g4.z
    public final void c(C2764c c2764c, Object obj) throws IOException {
        c2764c.v((BigDecimal) obj);
    }
}
