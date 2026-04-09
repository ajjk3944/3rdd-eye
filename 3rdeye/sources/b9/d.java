package B9;

import A9.C0583j;
import T1.K;
import a2.C1645b;
import android.os.Bundle;
import androidx.work.m;
import b2.C1842w;
import b9.C1992A;
import d2.AbstractC4266a;
import d2.C4268c;
import s.BinderC5541e;

/* compiled from: Runnable.kt */
/* loaded from: classes3.dex */
public final class d implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f594b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f595c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f596d;

    public /* synthetic */ d(int i, Object obj, Object obj2) {
        this.f594b = i;
        this.f596d = obj;
        this.f595c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f594b) {
            case 0:
                ((C0583j) this.f595c).B((f) this.f596d, C1992A.f18074a);
                return;
            case 1:
                if (((K) this.f596d).f12155r.f37349b instanceof AbstractC4266a.b) {
                    return;
                }
                try {
                    ((C4268c) this.f595c).get();
                    m.e().a(K.f12139t, "Starting work for " + ((K) this.f596d).f12143e.f17140c);
                    K k10 = (K) this.f596d;
                    k10.f12155r.k(k10.f12144f.startWork());
                    return;
                } catch (Throwable th) {
                    ((K) this.f596d).f12155r.j(th);
                    return;
                }
            case 2:
                C1842w c1842wC = ((C1645b) this.f596d).f14097b.f12235f.c((String) this.f595c);
                if (c1842wC == null || !c1842wC.c()) {
                    return;
                }
                synchronized (((C1645b) this.f596d).f14099d) {
                    ((C1645b) this.f596d).f14102g.put(B7.d.l(c1842wC), c1842wC);
                    C1645b c1645b = (C1645b) this.f596d;
                    ((C1645b) this.f596d).f14103h.put(B7.d.l(c1842wC), X1.h.a(c1645b.i, c1842wC, c1645b.f14098c.a(), (C1645b) this.f596d));
                }
                return;
            default:
                ((BinderC5541e) this.f596d).f45882c.onUnminimized((Bundle) this.f595c);
                return;
        }
    }

    public d(C0583j c0583j, f fVar) {
        this.f594b = 0;
        this.f595c = c0583j;
        this.f596d = fVar;
    }
}
