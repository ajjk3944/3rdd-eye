package j4;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import o4.C2762a;
import o4.C2764c;

/* loaded from: classes.dex */
public class a0 extends g4.z {
    @Override // g4.z
    public final Object b(C2762a c2762a) {
        return new AtomicBoolean(c2762a.r());
    }

    @Override // g4.z
    public final void c(C2764c c2764c, Object obj) throws IOException {
        c2764c.x(((AtomicBoolean) obj).get());
    }
}
