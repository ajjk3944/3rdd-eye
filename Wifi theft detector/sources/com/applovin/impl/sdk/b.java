package com.applovin.impl.sdk;

import com.applovin.impl.g7;
import com.applovin.impl.sdk.a;
import com.applovin.impl.x4;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final k f7720a;

    /* renamed from: b, reason: collision with root package name */
    private final WeakReference f7721b;

    /* renamed from: c, reason: collision with root package name */
    private final WeakReference f7722c;

    /* renamed from: d, reason: collision with root package name */
    private g7 f7723d;

    private b(com.applovin.impl.t1 t1Var, a.InterfaceC0082a interfaceC0082a, k kVar) {
        this.f7721b = new WeakReference(t1Var);
        this.f7722c = new WeakReference(interfaceC0082a);
        this.f7720a = kVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        d();
        this.f7720a.f().a(this);
    }

    public com.applovin.impl.t1 b() {
        return (com.applovin.impl.t1) this.f7721b.get();
    }

    public void d() {
        a();
        com.applovin.impl.t1 t1VarB = b();
        if (t1VarB == null) {
            return;
        }
        t1VarB.setExpired();
        a.InterfaceC0082a interfaceC0082a = (a.InterfaceC0082a) this.f7722c.get();
        if (interfaceC0082a == null) {
            return;
        }
        interfaceC0082a.onAdExpired(t1VarB);
    }

    public static b a(com.applovin.impl.t1 t1Var, a.InterfaceC0082a interfaceC0082a, k kVar) {
        b bVar = new b(t1Var, interfaceC0082a, kVar);
        bVar.a(t1Var.getTimeToLiveMillis());
        return bVar;
    }

    public void a(long j10) {
        a();
        if (((Boolean) this.f7720a.a(x4.f8425b1)).booleanValue() || !this.f7720a.m0().isApplicationPaused()) {
            this.f7723d = g7.a(j10, this.f7720a, new Runnable() { // from class: com.applovin.impl.sdk.z
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8121a.c();
                }
            });
        }
    }

    public void a() {
        g7 g7Var = this.f7723d;
        if (g7Var != null) {
            g7Var.a();
            this.f7723d = null;
        }
    }
}
