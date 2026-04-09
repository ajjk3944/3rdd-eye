package k0;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.lifecycle.C0300w;
import androidx.lifecycle.EnumC0291m;
import androidx.lifecycle.InterfaceC0287i;
import androidx.lifecycle.Y;
import androidx.lifecycle.a0;
import androidx.lifecycle.b0;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class S implements InterfaceC0287i, F0.g, b0 {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractComponentCallbacksC2617v f21569a;

    /* renamed from: b, reason: collision with root package name */
    public final a0 f21570b;

    /* renamed from: c, reason: collision with root package name */
    public final A3.z f21571c;

    /* renamed from: d, reason: collision with root package name */
    public C0300w f21572d = null;

    /* renamed from: e, reason: collision with root package name */
    public A1.w f21573e = null;

    public S(AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v, a0 a0Var, A3.z zVar) {
        this.f21569a = abstractComponentCallbacksC2617v;
        this.f21570b = a0Var;
        this.f21571c = zVar;
    }

    public final void a(EnumC0291m enumC0291m) {
        this.f21572d.d(enumC0291m);
    }

    public final void b() {
        if (this.f21572d == null) {
            this.f21572d = new C0300w(this);
            A1.w wVar = new A1.w(this);
            this.f21573e = wVar;
            wVar.c();
            this.f21571c.run();
        }
    }

    @Override // androidx.lifecycle.InterfaceC0287i
    public final n0.d c() {
        Application application;
        AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v = this.f21569a;
        Context applicationContext = abstractComponentCallbacksC2617v.R().getApplicationContext();
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
        n0.d dVar = new n0.d(0);
        LinkedHashMap linkedHashMap = dVar.f22143a;
        if (application != null) {
            linkedHashMap.put(Y.f5231e, application);
        }
        linkedHashMap.put(androidx.lifecycle.Q.f5209a, abstractComponentCallbacksC2617v);
        linkedHashMap.put(androidx.lifecycle.Q.f5210b, this);
        Bundle bundle = abstractComponentCallbacksC2617v.f21712f;
        if (bundle != null) {
            linkedHashMap.put(androidx.lifecycle.Q.f5211c, bundle);
        }
        return dVar;
    }

    @Override // androidx.lifecycle.b0
    public final a0 d() {
        b();
        return this.f21570b;
    }

    @Override // F0.g
    public final F0.f f() {
        b();
        return (F0.f) this.f21573e.f139b;
    }

    @Override // androidx.lifecycle.InterfaceC0298u
    public final C0300w j() {
        b();
        return this.f21572d;
    }
}
