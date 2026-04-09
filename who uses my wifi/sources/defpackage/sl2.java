package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class sl2 implements fd1 {
    public final ul2 f;
    public final l83 g;

    public sl2(ul2 ul2Var, l83 l83Var) {
        this.f = ul2Var;
        this.g = l83Var;
    }

    @Override // defpackage.fd1
    public final void C() {
        l83 l83Var = this.g;
        ul2 ul2Var = this.f;
        String str = l83Var.g;
        synchronized (ul2Var.a) {
            try {
                ConcurrentHashMap concurrentHashMap = ul2Var.b;
                Integer num = (Integer) concurrentHashMap.get(str);
                concurrentHashMap.put(str, num == null ? 1 : Integer.valueOf(num.intValue() + 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
