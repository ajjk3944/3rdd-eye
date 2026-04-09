package j4;

import com.google.android.gms.internal.ads.AbstractC1135f5;
import java.io.IOException;
import o4.C2762a;
import o4.C2764c;

/* renamed from: j4.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2566B extends g4.z {
    @Override // g4.z
    public final Object b(C2762a c2762a) throws IOException {
        if (c2762a.B() == 9) {
            c2762a.x();
            return null;
        }
        String strZ = c2762a.z();
        if (strZ.length() == 1) {
            return Character.valueOf(strZ.charAt(0));
        }
        StringBuilder sbQ = AbstractC1135f5.q("Expecting character, got: ", strZ, "; at ");
        sbQ.append(c2762a.n(true));
        throw new g4.p(sbQ.toString());
    }

    @Override // g4.z
    public final void c(C2764c c2764c, Object obj) throws IOException {
        Character ch = (Character) obj;
        c2764c.w(ch == null ? null : String.valueOf(ch));
    }
}
