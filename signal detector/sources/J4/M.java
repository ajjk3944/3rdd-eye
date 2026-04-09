package j4;

import com.google.android.gms.internal.ads.AbstractC1135f5;
import java.io.IOException;
import java.util.UUID;
import o4.C2762a;
import o4.C2764c;

/* loaded from: classes.dex */
public class M extends g4.z {
    @Override // g4.z
    public final Object b(C2762a c2762a) throws IOException {
        if (c2762a.B() == 9) {
            c2762a.x();
            return null;
        }
        String strZ = c2762a.z();
        try {
            return UUID.fromString(strZ);
        } catch (IllegalArgumentException e6) {
            StringBuilder sbQ = AbstractC1135f5.q("Failed parsing '", strZ, "' as UUID; at path ");
            sbQ.append(c2762a.n(true));
            throw new g4.p(sbQ.toString(), e6);
        }
    }

    @Override // g4.z
    public final void c(C2764c c2764c, Object obj) throws IOException {
        UUID uuid = (UUID) obj;
        c2764c.w(uuid == null ? null : uuid.toString());
    }
}
