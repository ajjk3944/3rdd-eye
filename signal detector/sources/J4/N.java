package j4;

import com.google.android.gms.internal.ads.AbstractC1135f5;
import java.io.IOException;
import java.util.Currency;
import o4.C2762a;
import o4.C2764c;

/* loaded from: classes.dex */
public class N extends g4.z {
    @Override // g4.z
    public final Object b(C2762a c2762a) throws IOException {
        String strZ = c2762a.z();
        try {
            return Currency.getInstance(strZ);
        } catch (IllegalArgumentException e6) {
            StringBuilder sbQ = AbstractC1135f5.q("Failed parsing '", strZ, "' as Currency; at path ");
            sbQ.append(c2762a.n(true));
            throw new g4.p(sbQ.toString(), e6);
        }
    }

    @Override // g4.z
    public final void c(C2764c c2764c, Object obj) throws IOException {
        c2764c.w(((Currency) obj).getCurrencyCode());
    }
}
