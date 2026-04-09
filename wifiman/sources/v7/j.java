package v7;

import Yg.J;
import Zg.AbstractC3689v;
import gg.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6835l;

/* loaded from: classes3.dex */
public final class j implements e {

    /* renamed from: a, reason: collision with root package name */
    private final y f63494a;

    /* renamed from: b, reason: collision with root package name */
    private final List f63495b;

    /* renamed from: c, reason: collision with root package name */
    private final Fg.c f63496c;

    static final class a extends AbstractC6494u implements InterfaceC6835l {
        a() {
            super(1);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(f it) {
            AbstractC6492s.i(it, "it");
            return Boolean.valueOf(it.a() <= j.this.f());
        }
    }

    public j(y expirationScheduler) {
        AbstractC6492s.i(expirationScheduler, "expirationScheduler");
        this.f63494a = expirationScheduler;
        this.f63495b = new ArrayList();
        Fg.c cVarJ2 = Fg.c.j2();
        AbstractC6492s.h(cVarJ2, "create<Unit>()");
        this.f63496c = cVarJ2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long f() {
        return this.f63494a.d(TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(j this$0) {
        AbstractC6492s.i(this$0, "this$0");
        this$0.f63496c.k2(J.f24997a);
    }

    @Override // v7.e
    public List a() {
        ArrayList arrayList;
        synchronized (this.f63495b) {
            AbstractC3689v.K(this.f63495b, new a());
            List list = this.f63495b;
            arrayList = new ArrayList(AbstractC3689v.w(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((f) it.next()).b());
            }
        }
        return arrayList;
    }

    @Override // v7.e
    public void b(long j10, Object obj) {
        synchronized (this.f63495b) {
            this.f63495b.add(new f(f() + j10, obj));
        }
        this.f63494a.f(new Runnable() { // from class: v7.i
            @Override // java.lang.Runnable
            public final void run() {
                j.g(this.f63493a);
            }
        }, j10, TimeUnit.MILLISECONDS);
    }

    @Override // v7.e
    public gg.i c() {
        return this.f63496c;
    }
}
