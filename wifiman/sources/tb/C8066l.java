package tb;

import Sj.a;
import Zg.AbstractC3689v;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;

/* renamed from: tb.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8066l {

    /* renamed from: a, reason: collision with root package name */
    private final int f62033a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC6824a f62034b;

    /* renamed from: c, reason: collision with root package name */
    private final List f62035c;

    /* renamed from: d, reason: collision with root package name */
    private final ArrayBlockingQueue f62036d;

    public C8066l(int i10, InterfaceC6824a requesterFactory) {
        AbstractC6492s.i(requesterFactory, "requesterFactory");
        this.f62033a = i10;
        this.f62034b = requesterFactory;
        this.f62035c = new ArrayList();
        this.f62036d = new ArrayBlockingQueue(i10);
    }

    private final C8071q c() {
        synchronized (this) {
            if (this.f62035c.size() >= this.f62033a) {
                Yg.J j10 = Yg.J.f24997a;
                return null;
            }
            Object objInvoke = this.f62034b.invoke();
            C8071q c8071q = (C8071q) objInvoke;
            Sj.a.f20830a.a("createRequester: " + c8071q.d(), new Object[0]);
            this.f62035c.add(c8071q);
            g();
            return (C8071q) objInvoke;
        }
    }

    private final void g() {
        a.b bVar = Sj.a.f20830a;
        bVar.a("requestersPool: %s %s", Integer.valueOf(this.f62035c.size()), AbstractC3689v.z0(this.f62035c, null, null, null, 0, null, new InterfaceC6835l() { // from class: tb.j
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return C8066l.h((C8071q) obj);
            }
        }, 31, null));
        bVar.a("requestersFree: %s", AbstractC3689v.z0(this.f62036d, null, null, null, 0, null, new InterfaceC6835l() { // from class: tb.k
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return C8066l.i((C8071q) obj);
            }
        }, 31, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence h(C8071q it) {
        AbstractC6492s.i(it, "it");
        return it.d() + "(" + it.f() + ")";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence i(C8071q c8071q) {
        return c8071q.d();
    }

    public final void d(C8071q requester) {
        AbstractC6492s.i(requester, "requester");
        Sj.a.f20830a.a("disposeRequester: %s", requester.d());
        synchronized (this) {
            this.f62035c.remove(requester);
            this.f62036d.remove(requester);
            g();
            Yg.J j10 = Yg.J.f24997a;
        }
    }

    public final C8071q e() {
        C8071q c8071qC = (C8071q) this.f62036d.poll();
        if (c8071qC == null) {
            c8071qC = c();
        }
        return c8071qC == null ? (C8071q) this.f62036d.poll(10L, TimeUnit.SECONDS) : c8071qC;
    }

    public final void f(C8071q requester) {
        AbstractC6492s.i(requester, "requester");
        requester.o(null);
        synchronized (this) {
            requester.n(false);
            this.f62036d.add(requester);
            Sj.a.f20830a.a("pushFreeRequester: %s", requester.d());
            g();
            Yg.J j10 = Yg.J.f24997a;
        }
    }
}
