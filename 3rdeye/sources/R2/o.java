package R2;

import R2.p;
import java.util.ArrayDeque;

/* compiled from: ModelCache.java */
/* loaded from: classes.dex */
public final class o extends h3.i<p.a<Object>, Object> {
    @Override // h3.i
    public final void c(p.a<Object> aVar, Object obj) {
        p.a<Object> aVar2 = aVar;
        aVar2.getClass();
        ArrayDeque arrayDeque = p.a.f11684b;
        synchronized (arrayDeque) {
            arrayDeque.offer(aVar2);
        }
    }
}
