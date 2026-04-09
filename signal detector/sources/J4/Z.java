package j4;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import o4.C2762a;
import o4.C2764c;

/* loaded from: classes.dex */
public class Z extends g4.z {
    @Override // g4.z
    public final Object b(C2762a c2762a) {
        try {
            return new AtomicInteger(c2762a.t());
        } catch (NumberFormatException e6) {
            throw new g4.p(e6);
        }
    }

    @Override // g4.z
    public final void c(C2764c c2764c, Object obj) throws IOException {
        c2764c.u(((AtomicInteger) obj).get());
    }
}
