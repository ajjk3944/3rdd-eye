package j4;

import java.io.IOException;
import o4.C2762a;
import o4.C2764c;

/* loaded from: classes.dex */
public class U extends g4.z {
    @Override // g4.z
    public final Object b(C2762a c2762a) throws IOException {
        int iB = c2762a.B();
        if (iB != 9) {
            return iB == 6 ? Boolean.valueOf(Boolean.parseBoolean(c2762a.z())) : Boolean.valueOf(c2762a.r());
        }
        c2762a.x();
        return null;
    }

    @Override // g4.z
    public final void c(C2764c c2764c, Object obj) throws IOException {
        Boolean bool = (Boolean) obj;
        if (bool == null) {
            c2764c.o();
            return;
        }
        c2764c.y();
        c2764c.a();
        c2764c.f22718a.write(bool.booleanValue() ? "true" : "false");
    }
}
