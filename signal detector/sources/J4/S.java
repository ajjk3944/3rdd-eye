package j4;

import com.google.android.gms.internal.ads.AbstractC1135f5;
import java.io.IOException;
import java.util.BitSet;
import o4.AbstractC2763b;
import o4.C2762a;
import o4.C2764c;
import x.AbstractC2984e;

/* loaded from: classes.dex */
public class S extends g4.z {
    @Override // g4.z
    public final Object b(C2762a c2762a) throws IOException, NumberFormatException {
        boolean zR;
        BitSet bitSet = new BitSet();
        c2762a.a();
        int iB = c2762a.B();
        int i = 0;
        while (iB != 2) {
            int iC = AbstractC2984e.c(iB);
            if (iC == 5 || iC == 6) {
                int iT = c2762a.t();
                if (iT == 0) {
                    zR = false;
                } else {
                    if (iT != 1) {
                        StringBuilder sbP = AbstractC1135f5.p(iT, "Invalid bitset value ", ", expected 0 or 1; at path ");
                        sbP.append(c2762a.n(true));
                        throw new g4.p(sbP.toString());
                    }
                    zR = true;
                }
            } else {
                if (iC != 7) {
                    throw new g4.p("Invalid bitset value type: " + AbstractC2763b.j(iB) + "; at path " + c2762a.n(false));
                }
                zR = c2762a.r();
            }
            if (zR) {
                bitSet.set(i);
            }
            i++;
            iB = c2762a.B();
        }
        c2762a.h();
        return bitSet;
    }

    @Override // g4.z
    public final void c(C2764c c2764c, Object obj) throws IOException {
        BitSet bitSet = (BitSet) obj;
        c2764c.b();
        int length = bitSet.length();
        for (int i = 0; i < length; i++) {
            c2764c.u(bitSet.get(i) ? 1L : 0L);
        }
        c2764c.h();
    }
}
