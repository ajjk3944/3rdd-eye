package U1;

import A9.InterfaceC0594o0;
import T1.InterfaceC1591c;
import T1.l;
import T1.n;
import T1.r;
import T1.y;
import X1.b;
import X1.e;
import X1.h;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.m;
import androidx.work.t;
import b2.C1834o;
import b2.C1842w;
import c2.q;
import e2.InterfaceC4306b;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: GreedyScheduler.java */
/* loaded from: classes.dex */
public final class c implements n, X1.d, InterfaceC1591c {

    /* renamed from: p, reason: collision with root package name */
    public static final String f12357p = m.g("GreedyScheduler");

    /* renamed from: b, reason: collision with root package name */
    public final Context f12358b;

    /* renamed from: d, reason: collision with root package name */
    public final b f12360d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f12361e;

    /* renamed from: h, reason: collision with root package name */
    public final l f12364h;
    public final y i;

    /* renamed from: j, reason: collision with root package name */
    public final androidx.work.b f12365j;

    /* renamed from: l, reason: collision with root package name */
    public Boolean f12367l;

    /* renamed from: m, reason: collision with root package name */
    public final e f12368m;

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC4306b f12369n;

    /* renamed from: o, reason: collision with root package name */
    public final d f12370o;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f12359c = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final Object f12362f = new Object();

    /* renamed from: g, reason: collision with root package name */
    public final E7.b f12363g = new E7.b(6);

    /* renamed from: k, reason: collision with root package name */
    public final HashMap f12366k = new HashMap();

    /* compiled from: GreedyScheduler.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f12371a;

        /* renamed from: b, reason: collision with root package name */
        public final long f12372b;

        public a(int i, long j4) {
            this.f12371a = i;
            this.f12372b = j4;
        }
    }

    public c(Context context, androidx.work.b bVar, G5.c cVar, l lVar, y yVar, InterfaceC4306b interfaceC4306b) {
        this.f12358b = context;
        H7.e eVar = bVar.f16870f;
        this.f12360d = new b(this, eVar, bVar.f16867c);
        this.f12370o = new d(eVar, yVar);
        this.f12369n = interfaceC4306b;
        this.f12368m = new e(cVar);
        this.f12365j = bVar;
        this.f12364h = lVar;
        this.i = yVar;
    }

    @Override // X1.d
    public final void a(C1842w c1842w, X1.b bVar) {
        C1834o c1834oL = B7.d.l(c1842w);
        boolean z10 = bVar instanceof b.a;
        y yVar = this.i;
        d dVar = this.f12370o;
        String str = f12357p;
        E7.b bVar2 = this.f12363g;
        if (z10) {
            if (bVar2.h(c1834oL)) {
                return;
            }
            m.e().a(str, "Constraints met: Scheduling work ID " + c1834oL);
            r rVarR = bVar2.r(c1834oL);
            dVar.b(rVarR);
            yVar.b(rVarR);
            return;
        }
        m.e().a(str, "Constraints not met: Cancelling work ID " + c1834oL);
        r rVarO = bVar2.o(c1834oL);
        if (rVarO != null) {
            dVar.a(rVarO);
            yVar.c(rVarO, ((b.C0195b) bVar).f13539a);
        }
    }

    @Override // T1.n
    public final void b(C1842w... c1842wArr) {
        if (this.f12367l == null) {
            this.f12367l = Boolean.valueOf(q.a(this.f12358b, this.f12365j));
        }
        if (!this.f12367l.booleanValue()) {
            m.e().f(f12357p, "Ignoring schedule request in a secondary process");
            return;
        }
        if (!this.f12361e) {
            this.f12364h.a(this);
            this.f12361e = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (C1842w c1842w : c1842wArr) {
            if (!this.f12363g.h(B7.d.l(c1842w))) {
                long jMax = Math.max(c1842w.a(), g(c1842w));
                this.f12365j.f16867c.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (c1842w.f17139b == t.b.ENQUEUED) {
                    if (jCurrentTimeMillis < jMax) {
                        b bVar = this.f12360d;
                        if (bVar != null) {
                            HashMap map = bVar.f12356d;
                            Runnable runnable = (Runnable) map.remove(c1842w.f17138a);
                            H7.e eVar = bVar.f12354b;
                            if (runnable != null) {
                                eVar.a(runnable);
                            }
                            U1.a aVar = new U1.a(0, bVar, c1842w);
                            map.put(c1842w.f17138a, aVar);
                            bVar.f12355c.getClass();
                            eVar.g(aVar, jMax - System.currentTimeMillis());
                        }
                    } else if (c1842w.c()) {
                        int i = Build.VERSION.SDK_INT;
                        androidx.work.d dVar = c1842w.f17146j;
                        if (dVar.f16884c) {
                            m.e().a(f12357p, "Ignoring " + c1842w + ". Requires device idle.");
                        } else if (i < 24 || !dVar.a()) {
                            hashSet.add(c1842w);
                            hashSet2.add(c1842w.f17138a);
                        } else {
                            m.e().a(f12357p, "Ignoring " + c1842w + ". Requires ContentUri triggers.");
                        }
                    } else if (!this.f12363g.h(B7.d.l(c1842w))) {
                        m.e().a(f12357p, "Starting work for " + c1842w.f17138a);
                        E7.b bVar2 = this.f12363g;
                        bVar2.getClass();
                        r rVarR = bVar2.r(B7.d.l(c1842w));
                        this.f12370o.b(rVarR);
                        this.i.b(rVarR);
                    }
                }
            }
        }
        synchronized (this.f12362f) {
            try {
                if (!hashSet.isEmpty()) {
                    m.e().a(f12357p, "Starting tracking for " + TextUtils.join(StringUtils.COMMA, hashSet2));
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        C1842w c1842w2 = (C1842w) it.next();
                        C1834o c1834oL = B7.d.l(c1842w2);
                        if (!this.f12359c.containsKey(c1834oL)) {
                            this.f12359c.put(c1834oL, h.a(this.f12368m, c1842w2, this.f12369n.a(), this));
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // T1.InterfaceC1591c
    public final void c(C1834o c1834o, boolean z10) {
        r rVarO = this.f12363g.o(c1834o);
        if (rVarO != null) {
            this.f12370o.a(rVarO);
        }
        f(c1834o);
        if (z10) {
            return;
        }
        synchronized (this.f12362f) {
            this.f12366k.remove(c1834o);
        }
    }

    @Override // T1.n
    public final boolean d() {
        return false;
    }

    @Override // T1.n
    public final void e(String str) {
        Runnable runnable;
        if (this.f12367l == null) {
            this.f12367l = Boolean.valueOf(q.a(this.f12358b, this.f12365j));
        }
        boolean zBooleanValue = this.f12367l.booleanValue();
        String str2 = f12357p;
        if (!zBooleanValue) {
            m.e().f(str2, "Ignoring schedule request in non-main process");
            return;
        }
        if (!this.f12361e) {
            this.f12364h.a(this);
            this.f12361e = true;
        }
        m.e().a(str2, "Cancelling work ID " + str);
        b bVar = this.f12360d;
        if (bVar != null && (runnable = (Runnable) bVar.f12356d.remove(str)) != null) {
            bVar.f12354b.a(runnable);
        }
        for (r rVar : this.f12363g.p(str)) {
            this.f12370o.a(rVar);
            this.i.a(rVar);
        }
    }

    public final void f(C1834o c1834o) {
        InterfaceC0594o0 interfaceC0594o0;
        synchronized (this.f12362f) {
            interfaceC0594o0 = (InterfaceC0594o0) this.f12359c.remove(c1834o);
        }
        if (interfaceC0594o0 != null) {
            m.e().a(f12357p, "Stopping tracking for " + c1834o);
            interfaceC0594o0.c(null);
        }
    }

    public final long g(C1842w c1842w) {
        long jMax;
        synchronized (this.f12362f) {
            try {
                C1834o c1834oL = B7.d.l(c1842w);
                a aVar = (a) this.f12366k.get(c1834oL);
                if (aVar == null) {
                    int i = c1842w.f17147k;
                    this.f12365j.f16867c.getClass();
                    aVar = new a(i, System.currentTimeMillis());
                    this.f12366k.put(c1834oL, aVar);
                }
                jMax = (Math.max((c1842w.f17147k - aVar.f12371a) - 5, 0) * 30000) + aVar.f12372b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return jMax;
    }
}
