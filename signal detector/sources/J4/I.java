package j4;

import java.io.IOException;
import o4.C2762a;
import o4.C2764c;

/* loaded from: classes.dex */
public class I extends g4.z {
    @Override // g4.z
    public final Object b(C2762a c2762a) {
        if (c2762a.B() != 9) {
            return new StringBuffer(c2762a.z());
        }
        c2762a.x();
        return null;
    }

    @Override // g4.z
    public final void c(C2764c c2764c, Object obj) throws IOException {
        StringBuffer stringBuffer = (StringBuffer) obj;
        c2764c.w(stringBuffer == null ? null : stringBuffer.toString());
    }
}
