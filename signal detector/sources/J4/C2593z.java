package j4;

import java.io.IOException;
import o4.C2762a;
import o4.C2764c;

/* renamed from: j4.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2593z extends g4.z {
    @Override // g4.z
    public final Object b(C2762a c2762a) {
        if (c2762a.B() != 9) {
            return Float.valueOf((float) c2762a.s());
        }
        c2762a.x();
        return null;
    }

    @Override // g4.z
    public final void c(C2764c c2764c, Object obj) throws IOException {
        Number numberValueOf = (Number) obj;
        if (numberValueOf == null) {
            c2764c.o();
            return;
        }
        if (!(numberValueOf instanceof Float)) {
            numberValueOf = Float.valueOf(numberValueOf.floatValue());
        }
        c2764c.v(numberValueOf);
    }
}
