package b5;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.lifecycle.j1;
import androidx.lifecycle.k1;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class d1 implements androidx.lifecycle.n, a6.f, k1 {

    /* renamed from: a, reason: collision with root package name */
    public final z f1770a;

    /* renamed from: b, reason: collision with root package name */
    public final j1 f1771b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.lifecycle.o0 f1772c;

    /* renamed from: d, reason: collision with root package name */
    public androidx.lifecycle.h1 f1773d;

    /* renamed from: e, reason: collision with root package name */
    public androidx.lifecycle.c0 f1774e = null;

    /* renamed from: f, reason: collision with root package name */
    public y4.a f1775f = null;

    public d1(z zVar, j1 j1Var, androidx.lifecycle.o0 o0Var) {
        this.f1770a = zVar;
        this.f1771b = j1Var;
        this.f1772c = o0Var;
    }

    public final void a(androidx.lifecycle.r rVar) {
        this.f1774e.e(rVar);
    }

    @Override // androidx.lifecycle.n
    public final androidx.lifecycle.h1 b() {
        Application application;
        z zVar = this.f1770a;
        androidx.lifecycle.h1 h1VarB = zVar.b();
        if (!h1VarB.equals(zVar.T)) {
            this.f1773d = h1VarB;
            return h1VarB;
        }
        if (this.f1773d == null) {
            Context applicationContext = zVar.W().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            this.f1773d = new androidx.lifecycle.b1(application, zVar, zVar.g);
        }
        return this.f1773d;
    }

    @Override // androidx.lifecycle.n
    public final h5.c c() {
        Application application;
        z zVar = this.f1770a;
        Context applicationContext = zVar.W().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        h5.c cVar = new h5.c(0);
        LinkedHashMap linkedHashMap = cVar.f24880a;
        if (application != null) {
            linkedHashMap.put(androidx.lifecycle.g1.f1141e, application);
        }
        linkedHashMap.put(androidx.lifecycle.y0.f1201a, zVar);
        linkedHashMap.put(androidx.lifecycle.y0.f1202b, this);
        Bundle bundle = zVar.g;
        if (bundle != null) {
            linkedHashMap.put(androidx.lifecycle.y0.f1203c, bundle);
        }
        return cVar;
    }

    public final void d() {
        if (this.f1774e == null) {
            this.f1774e = new androidx.lifecycle.c0(this, true);
            y4.a aVar = new y4.a(new c6.a(this, new a6.e(0, this)));
            this.f1775f = aVar;
            aVar.n();
            this.f1772c.run();
        }
    }

    @Override // androidx.lifecycle.k1
    public final j1 e() {
        d();
        return this.f1771b;
    }

    @Override // a6.f
    public final yb.i g() {
        d();
        return (yb.i) this.f1775f.f37324b;
    }

    @Override // androidx.lifecycle.a0
    public final androidx.lifecycle.c0 j() {
        d();
        return this.f1774e;
    }
}
