package C0;

import androidx.lifecycle.C;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class w extends C {

    /* renamed from: l, reason: collision with root package name */
    public final p f1116l;

    /* renamed from: m, reason: collision with root package name */
    public final V2.h f1117m;

    /* renamed from: n, reason: collision with root package name */
    public final Callable f1118n;

    /* renamed from: o, reason: collision with root package name */
    public final v f1119o;

    /* renamed from: p, reason: collision with root package name */
    public final AtomicBoolean f1120p;

    /* renamed from: q, reason: collision with root package name */
    public final AtomicBoolean f1121q;

    /* renamed from: r, reason: collision with root package name */
    public final AtomicBoolean f1122r;

    /* renamed from: s, reason: collision with root package name */
    public final u f1123s;

    /* renamed from: t, reason: collision with root package name */
    public final u f1124t;

    public w(p pVar, V2.h hVar, Callable callable, String[] strArr) {
        q5.i.e(hVar, "container");
        this.f1116l = pVar;
        this.f1117m = hVar;
        this.f1118n = callable;
        this.f1119o = new v(strArr, this);
        this.f1120p = new AtomicBoolean(true);
        this.f1121q = new AtomicBoolean(false);
        this.f1122r = new AtomicBoolean(false);
        this.f1123s = new u(this, 0);
        this.f1124t = new u(this, 1);
    }

    @Override // androidx.lifecycle.C
    public final void f() {
        V2.h hVar = this.f1117m;
        hVar.getClass();
        ((Set) hVar.f3876c).add(this);
        Executor executor = this.f1116l.f1088b;
        if (executor != null) {
            executor.execute(this.f1123s);
        } else {
            q5.i.g("internalQueryExecutor");
            throw null;
        }
    }

    @Override // androidx.lifecycle.C
    public final void g() {
        V2.h hVar = this.f1117m;
        hVar.getClass();
        ((Set) hVar.f3876c).remove(this);
    }
}
