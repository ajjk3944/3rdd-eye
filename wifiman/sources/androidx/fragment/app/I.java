package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.lifecycle.AbstractC4013k;
import androidx.lifecycle.C4018p;
import androidx.lifecycle.InterfaceC4011i;
import androidx.lifecycle.P;
import androidx.lifecycle.Q;
import androidx.lifecycle.S;
import b2.AbstractC4056a;
import b2.C4057b;
import q2.C7416d;
import q2.C7417e;
import q2.InterfaceC7418f;

/* loaded from: classes.dex */
class I implements InterfaceC4011i, InterfaceC7418f, S {

    /* renamed from: a, reason: collision with root package name */
    private final Fragment f31329a;

    /* renamed from: b, reason: collision with root package name */
    private final Q f31330b;

    /* renamed from: c, reason: collision with root package name */
    private P.c f31331c;

    /* renamed from: d, reason: collision with root package name */
    private C4018p f31332d = null;

    /* renamed from: e, reason: collision with root package name */
    private C7417e f31333e = null;

    I(Fragment fragment, Q q10) {
        this.f31329a = fragment;
        this.f31330b = q10;
    }

    @Override // androidx.lifecycle.InterfaceC4017o
    public AbstractC4013k O() {
        c();
        return this.f31332d;
    }

    void a(AbstractC4013k.a aVar) {
        this.f31332d.h(aVar);
    }

    void c() {
        if (this.f31332d == null) {
            this.f31332d = new C4018p(this);
            C7417e c7417eA = C7417e.a(this);
            this.f31333e = c7417eA;
            c7417eA.c();
            androidx.lifecycle.H.c(this);
        }
    }

    boolean d() {
        return this.f31332d != null;
    }

    void e(Bundle bundle) {
        this.f31333e.d(bundle);
    }

    void f(Bundle bundle) {
        this.f31333e.e(bundle);
    }

    @Override // androidx.lifecycle.InterfaceC4011i
    public P.c g() {
        Application application;
        P.c cVarG = this.f31329a.g();
        if (!cVarG.equals(this.f31329a.f31256m1)) {
            this.f31331c = cVarG;
            return cVarG;
        }
        if (this.f31331c == null) {
            Context applicationContext = this.f31329a.p1().getApplicationContext();
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
            this.f31331c = new androidx.lifecycle.K(application, this, this.f31329a.q());
        }
        return this.f31331c;
    }

    @Override // androidx.lifecycle.InterfaceC4011i
    public AbstractC4056a h() {
        Application application;
        Context applicationContext = this.f31329a.p1().getApplicationContext();
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
        C4057b c4057b = new C4057b();
        if (application != null) {
            c4057b.c(P.a.f31628h, application);
        }
        c4057b.c(androidx.lifecycle.H.f31605a, this);
        c4057b.c(androidx.lifecycle.H.f31606b, this);
        if (this.f31329a.q() != null) {
            c4057b.c(androidx.lifecycle.H.f31607c, this.f31329a.q());
        }
        return c4057b;
    }

    void i(AbstractC4013k.b bVar) {
        this.f31332d.m(bVar);
    }

    @Override // androidx.lifecycle.S
    public Q o() {
        c();
        return this.f31330b;
    }

    @Override // q2.InterfaceC7418f
    public C7416d t() {
        c();
        return this.f31333e.b();
    }
}
