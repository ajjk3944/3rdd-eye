package t5;

import android.os.Looper;
import c0.h0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public cl.d f34279a;

    /* renamed from: b, reason: collision with root package name */
    public Executor f34280b;

    /* renamed from: c, reason: collision with root package name */
    public c7.l f34281c;

    /* renamed from: d, reason: collision with root package name */
    public p f34282d;

    /* renamed from: e, reason: collision with root package name */
    public g f34283e;
    public boolean g;

    /* renamed from: f, reason: collision with root package name */
    public final km.n f34284f = new km.n(new h0(0, this, s.class, "onClosed", "onClosed()V", 0, 0, 3));

    /* renamed from: h, reason: collision with root package name */
    public final ThreadLocal f34285h = new ThreadLocal();

    /* renamed from: i, reason: collision with root package name */
    public final LinkedHashMap f34286i = new LinkedHashMap();
    public boolean j = true;

    public final void a() {
        if (this.g) {
            return;
        }
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public final void b() {
        a();
        a();
        e6.a aVarZ = g().z();
        if (!aVarZ.K()) {
            cm.g.J(new al.k(f(), null, 14));
        }
        if (aVarZ.M()) {
            aVarZ.u();
        } else {
            aVarZ.f();
        }
    }

    public List c(LinkedHashMap linkedHashMap) {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(zj.w.H(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(pk.a.h((tk.b) entry.getKey()), entry.getValue());
        }
        return zj.s.f38317a;
    }

    public abstract g d();

    public t e() {
        throw new yj.h();
    }

    public final g f() {
        g gVar = this.f34283e;
        if (gVar != null) {
            return gVar;
        }
        nk.k.k("internalTracker");
        throw null;
    }

    public final e6.c g() {
        p pVar = this.f34282d;
        if (pVar == null) {
            nk.k.k("connectionManager");
            throw null;
        }
        e6.c cVarC = pVar.c();
        if (cVarC != null) {
            return cVarC;
        }
        throw new IllegalStateException("Cannot return a SupportSQLiteOpenHelper since no SupportSQLiteOpenHelper.Factory was configured with Room.");
    }

    public Set h() {
        return zj.n.v0(new ArrayList(zj.o.T(zj.u.f38319a, 10)));
    }

    public LinkedHashMap i() {
        int iH = zj.w.H(zj.o.T(zj.u.f38319a, 10));
        if (iH < 16) {
            iH = 16;
        }
        return new LinkedHashMap(iH);
    }

    public final boolean j() {
        p pVar = this.f34282d;
        if (pVar != null) {
            return pVar.c() != null;
        }
        nk.k.k("connectionManager");
        throw null;
    }

    public final boolean k() {
        return m() && g().z().K();
    }

    public final void l() {
        g().z().B();
        if (k()) {
            return;
        }
        g gVarF = f();
        gVarF.f34236b.e(gVarF.f34239e, gVarF.f34240f);
    }

    public final boolean m() {
        p pVar = this.f34282d;
        if (pVar == null) {
            nk.k.k("connectionManager");
            throw null;
        }
        e6.a aVar = (e6.a) pVar.g;
        if (aVar != null) {
            return aVar.isOpen();
        }
        return false;
    }

    public final Object n(Callable callable) {
        b();
        try {
            Object objCall = callable.call();
            p();
            return objCall;
        } finally {
            l();
        }
    }

    public final void o(Runnable runnable) {
        b();
        try {
            runnable.run();
            p();
        } finally {
            l();
        }
    }

    public final void p() {
        g().z().t();
    }

    public final Object q(boolean z3, mk.e eVar, ek.c cVar) {
        p pVar = this.f34282d;
        if (pVar != null) {
            return ((v5.b) pVar.f34257f).I(z3, eVar, cVar);
        }
        nk.k.k("connectionManager");
        throw null;
    }
}
