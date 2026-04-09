package F2;

import java.util.Queue;

/* loaded from: classes.dex */
abstract class c {

    /* renamed from: a, reason: collision with root package name */
    private final Queue f5806a = W2.l.f(20);

    c() {
    }

    abstract l a();

    l b() {
        l lVar = (l) this.f5806a.poll();
        return lVar == null ? a() : lVar;
    }

    public void c(l lVar) {
        if (this.f5806a.size() < 20) {
            this.f5806a.offer(lVar);
        }
    }
}
