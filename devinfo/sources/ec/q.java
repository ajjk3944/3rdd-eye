package ec;

import android.os.Bundle;
import android.text.TextUtils;
import java.io.IOException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class q implements vl.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22994a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final long f22995b;

    /* renamed from: c, reason: collision with root package name */
    public long f22996c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f22997d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f22998e;

    /* renamed from: f, reason: collision with root package name */
    public final Serializable f22999f;
    public final Iterable g;

    public q(o1 o1Var, String str, String str2, String str3, long j, long j8, Bundle bundle) {
        t tVar;
        pb.y.e(str2);
        pb.y.e(str3);
        this.f22997d = str2;
        this.f22998e = str3;
        this.f22999f = true == TextUtils.isEmpty(str) ? null : str;
        this.f22995b = j;
        this.f22996c = j8;
        if (j8 != 0 && j8 > j) {
            s0 s0Var = o1Var.f22954f;
            o1.m(s0Var);
            s0Var.j.e(s0.J(str2), "Event created with reverse previous/current timestamps. appId");
        }
        if (bundle == null || bundle.isEmpty()) {
            tVar = new t(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    s0 s0Var2 = o1Var.f22954f;
                    o1.m(s0Var2);
                    s0Var2.g.d("Param name can't be null");
                    it.remove();
                } else {
                    l4 l4Var = o1Var.f22956i;
                    o1.k(l4Var);
                    Object objI = l4Var.I(bundle2.get(next), next);
                    if (objI == null) {
                        s0 s0Var3 = o1Var.f22954f;
                        o1.m(s0Var3);
                        s0Var3.j.e(o1Var.j.b(next), "Param value can't be null");
                        it.remove();
                    } else {
                        l4 l4Var2 = o1Var.f22956i;
                        o1.k(l4Var2);
                        l4Var2.Q(next, objI, bundle2);
                    }
                }
            }
            tVar = new t(bundle2);
        }
        this.g = tVar;
    }

    public void a() {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.f22999f;
        Iterator it = copyOnWriteArrayList.iterator();
        nk.k.d(it, "iterator(...)");
        while (it.hasNext()) {
            vl.r rVar = (vl.r) it.next();
            rVar.cancel();
            vl.r rVarA = rVar.a();
            if (rVarA != null) {
                ((vl.o) this.f22997d).f36375p.addLast(rVarA);
            }
        }
        copyOnWriteArrayList.clear();
    }

    @Override // vl.g
    public vl.n b() throws IOException {
        vl.q qVarC;
        long j;
        vl.q qVar;
        IOException iOException = null;
        while (true) {
            try {
                if (((CopyOnWriteArrayList) this.f22999f).isEmpty() && !((vl.o) this.f22997d).a(null)) {
                    a();
                    nk.k.b(iOException);
                    throw iOException;
                }
                if (((vl.o) this.f22997d).f36370k.f36345p) {
                    throw new IOException("Canceled");
                }
                km.y yVar = ((ul.d) this.f22998e).f35544a;
                long jNanoTime = System.nanoTime();
                long j8 = this.f22996c - jNanoTime;
                if (((CopyOnWriteArrayList) this.f22999f).isEmpty() || j8 <= 0) {
                    qVarC = c();
                    j = this.f22995b;
                    this.f22996c = jNanoTime + j;
                } else {
                    j = j8;
                    qVarC = null;
                }
                if (qVarC == null) {
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.f22999f;
                    if (copyOnWriteArrayList.isEmpty() || (qVar = (vl.q) ((LinkedBlockingDeque) this.g).poll(j, timeUnit)) == null) {
                        qVarC = null;
                    } else {
                        copyOnWriteArrayList.remove(qVar.f36377a);
                        qVarC = qVar;
                    }
                    if (qVarC == null) {
                    }
                }
                boolean z3 = false;
                if (qVarC.f36378b == null && qVarC.f36379c == null) {
                    a();
                    if (!qVarC.f36377a.c()) {
                        qVarC = qVarC.f36377a.f();
                    }
                    if (qVarC.f36378b == null && qVarC.f36379c == null) {
                        z3 = true;
                    }
                    if (z3) {
                        return qVarC.f36377a.b();
                    }
                }
                Throwable th2 = qVarC.f36379c;
                if (th2 != null) {
                    if (!(th2 instanceof IOException)) {
                        throw th2;
                    }
                    if (iOException == null) {
                        iOException = (IOException) th2;
                    } else {
                        wd.b.a(iOException, th2);
                    }
                }
                vl.r rVar = qVarC.f36378b;
                if (rVar != null) {
                    ((vl.o) this.f22997d).f36375p.addFirst(rVar);
                }
            } finally {
                a();
            }
        }
    }

    public vl.q c() {
        vl.r hVar;
        vl.o oVar = (vl.o) this.f22997d;
        if (oVar.a(null)) {
            try {
                hVar = oVar.b();
            } catch (Throwable th2) {
                hVar = new vl.h(th2);
            }
            if (hVar.c()) {
                return new vl.q(hVar, (Throwable) null, 6);
            }
            if (hVar instanceof vl.h) {
                return ((vl.h) hVar).f36324a;
            }
            ((CopyOnWriteArrayList) this.f22999f).add(hVar);
            ((ul.d) this.f22998e).d().d(new vl.i(sl.h.f33838b + " connect " + oVar.f36369i.f33026h.g(), hVar, this), 0L);
        }
        return null;
    }

    public q d(o1 o1Var, long j) {
        return new q(o1Var, (String) this.f22999f, (String) this.f22997d, (String) this.f22998e, this.f22995b, j, (t) this.g);
    }

    @Override // vl.g
    public vl.o g() {
        return (vl.o) this.f22997d;
    }

    public String toString() {
        switch (this.f22994a) {
            case 0:
                String string = ((t) this.g).toString();
                String str = (String) this.f22997d;
                int length = String.valueOf(str).length();
                String str2 = (String) this.f22998e;
                StringBuilder sb2 = new StringBuilder(length + 22 + String.valueOf(str2).length() + 10 + string.length() + 1);
                je.u.B(sb2, "Event{appId='", str, "', name='", str2);
                return r5.c.m(sb2, "', params=", string, "}");
            default:
                return super.toString();
        }
    }

    public q(o1 o1Var, String str, String str2, String str3, long j, long j8, t tVar) {
        pb.y.e(str2);
        pb.y.e(str3);
        pb.y.h(tVar);
        this.f22997d = str2;
        this.f22998e = str3;
        this.f22999f = true == TextUtils.isEmpty(str) ? null : str;
        this.f22995b = j;
        this.f22996c = j8;
        if (j8 != 0 && j8 > j) {
            s0 s0Var = o1Var.f22954f;
            o1.m(s0Var);
            s0Var.j.f(s0.J(str2), s0.J(str3), "Event created with reverse previous/current timestamps. appId, name");
        }
        this.g = tVar;
    }

    public q(vl.o oVar, ul.d dVar) {
        nk.k.e(dVar, "taskRunner");
        this.f22997d = oVar;
        this.f22998e = dVar;
        this.f22995b = TimeUnit.MILLISECONDS.toNanos(250L);
        this.f22996c = Long.MIN_VALUE;
        this.f22999f = new CopyOnWriteArrayList();
        this.g = new LinkedBlockingDeque();
    }
}
