package o4;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class p0 implements androidx.lifecycle.h, l7.e, androidx.lifecycle.w0 {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.fragment.app.b f18839a;

    /* renamed from: d, reason: collision with root package name */
    public final androidx.lifecycle.v0 f18840d;

    /* renamed from: g, reason: collision with root package name */
    public final j4.o f18841g;

    /* renamed from: r, reason: collision with root package name */
    public androidx.lifecycle.x f18842r = null;

    /* renamed from: x, reason: collision with root package name */
    public i4.b f18843x = null;

    public p0(androidx.fragment.app.b bVar, androidx.lifecycle.v0 v0Var, j4.o oVar) {
        this.f18839a = bVar;
        this.f18840d = v0Var;
        this.f18841g = oVar;
    }

    @Override // androidx.lifecycle.h
    public final v4.c a() {
        Application application;
        androidx.fragment.app.b bVar = this.f18839a;
        Context applicationContext = bVar.X().getApplicationContext();
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
        v4.c cVar = new v4.c();
        LinkedHashMap linkedHashMap = cVar.f23843a;
        if (application != null) {
            linkedHashMap.put(androidx.lifecycle.o0.f1508r, application);
        }
        linkedHashMap.put(androidx.lifecycle.o0.f1505a, bVar);
        linkedHashMap.put(androidx.lifecycle.o0.f1506d, this);
        Bundle bundle = bVar.B;
        if (bundle != null) {
            linkedHashMap.put(androidx.lifecycle.o0.f1507g, bundle);
        }
        return cVar;
    }

    public final void b(androidx.lifecycle.m mVar) {
        this.f18842r.v1(mVar);
    }

    public final void c() {
        if (this.f18842r == null) {
            this.f18842r = new androidx.lifecycle.x(this);
            i4.b bVar = new i4.b(new n7.b(this, new androidx.lifecycle.p0(10, this)));
            this.f18843x = bVar;
            bVar.J();
            this.f18841g.run();
        }
    }

    @Override // androidx.lifecycle.w0
    public final androidx.lifecycle.v0 d() {
        c();
        return this.f18840d;
    }

    @Override // l7.e
    public final io.sentry.t f() {
        c();
        return (io.sentry.t) this.f18843x.f11197d;
    }

    @Override // androidx.lifecycle.v
    public final androidx.lifecycle.o h() {
        c();
        return this.f18842r;
    }
}
