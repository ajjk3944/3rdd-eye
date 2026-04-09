package com.applovin.impl.sdk;

import com.applovin.impl.l4;
import com.applovin.impl.o1;
import com.applovin.impl.sdk.a;
import com.applovin.impl.t6;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final k f21090a;

    /* renamed from: b, reason: collision with root package name */
    private final WeakReference f21091b;

    /* renamed from: c, reason: collision with root package name */
    private final WeakReference f21092c;

    /* renamed from: d, reason: collision with root package name */
    private t6 f21093d;

    private b(o1 o1Var, a.InterfaceC0316a interfaceC0316a, k kVar) {
        this.f21091b = new WeakReference(o1Var);
        this.f21092c = new WeakReference(interfaceC0316a);
        this.f21090a = kVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        d();
        this.f21090a.f().a(this);
    }

    public o1 b() {
        return (o1) this.f21091b.get();
    }

    public void d() {
        a();
        o1 o1VarB = b();
        if (o1VarB == null) {
            return;
        }
        o1VarB.setExpired();
        a.InterfaceC0316a interfaceC0316a = (a.InterfaceC0316a) this.f21092c.get();
        if (interfaceC0316a == null) {
            return;
        }
        interfaceC0316a.onAdExpired(o1VarB);
    }

    public static b a(o1 o1Var, a.InterfaceC0316a interfaceC0316a, k kVar) {
        b bVar = new b(o1Var, interfaceC0316a, kVar);
        bVar.a(o1Var.getTimeToLiveMillis());
        return bVar;
    }

    public void a(long j4) {
        a();
        if (((Boolean) this.f21090a.a(l4.f19861X0)).booleanValue() || !this.f21090a.m0().isApplicationPaused()) {
            this.f21093d = t6.a(j4, this.f21090a, new C2.h(this, 19));
        }
    }

    public void a() {
        t6 t6Var = this.f21093d;
        if (t6Var != null) {
            t6Var.a();
            this.f21093d = null;
        }
    }
}
