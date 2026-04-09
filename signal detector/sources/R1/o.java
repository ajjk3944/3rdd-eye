package r1;

import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class o extends H1.l {
    @Override // H1.l
    public final void c(Object obj, Object obj2) {
        p pVar = (p) obj;
        pVar.getClass();
        ArrayDeque arrayDeque = p.f23366b;
        synchronized (arrayDeque) {
            arrayDeque.offer(pVar);
        }
    }
}
