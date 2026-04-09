package O6;

import java.util.Iterator;
import java.util.concurrent.PriorityBlockingQueue;

/* loaded from: classes3.dex */
class h {

    /* renamed from: a, reason: collision with root package name */
    private final PriorityBlockingQueue f17617a = new PriorityBlockingQueue();

    h() {
    }

    public void a(g gVar) {
        this.f17617a.add(gVar);
    }

    public boolean b() {
        return this.f17617a.isEmpty();
    }

    public boolean c(g gVar) {
        Iterator it = this.f17617a.iterator();
        while (it.hasNext()) {
            g gVar2 = (g) it.next();
            if (gVar2 == gVar) {
                return this.f17617a.remove(gVar2);
            }
        }
        return false;
    }

    public g d() {
        return (g) this.f17617a.take();
    }

    public g e() {
        return (g) this.f17617a.poll();
    }
}
