package com.applovin.impl.sdk;

import androidx.lifecycle.o0;
import com.applovin.impl.g7;
import com.applovin.impl.sdk.a;
import com.applovin.impl.t1;
import com.applovin.impl.x4;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final k f5451a;

    /* renamed from: b, reason: collision with root package name */
    private final WeakReference f5452b;

    /* renamed from: c, reason: collision with root package name */
    private final WeakReference f5453c;

    /* renamed from: d, reason: collision with root package name */
    private g7 f5454d;

    private b(t1 t1Var, a.InterfaceC0018a interfaceC0018a, k kVar) {
        this.f5452b = new WeakReference(t1Var);
        this.f5453c = new WeakReference(interfaceC0018a);
        this.f5451a = kVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        d();
        this.f5451a.f().a(this);
    }

    public t1 b() {
        return (t1) this.f5452b.get();
    }

    public void d() {
        a();
        t1 t1VarB = b();
        if (t1VarB == null) {
            return;
        }
        t1VarB.setExpired();
        a.InterfaceC0018a interfaceC0018a = (a.InterfaceC0018a) this.f5453c.get();
        if (interfaceC0018a == null) {
            return;
        }
        interfaceC0018a.onAdExpired(t1VarB);
    }

    public static b a(t1 t1Var, a.InterfaceC0018a interfaceC0018a, k kVar) {
        b bVar = new b(t1Var, interfaceC0018a, kVar);
        bVar.a(t1Var.getTimeToLiveMillis());
        return bVar;
    }

    public void a(long j) {
        a();
        if (((Boolean) this.f5451a.a(x4.f5995b1)).booleanValue() || !this.f5451a.m0().isApplicationPaused()) {
            this.f5454d = g7.a(j, this.f5451a, new o0(11, this));
        }
    }

    public void a() {
        g7 g7Var = this.f5454d;
        if (g7Var != null) {
            g7Var.a();
            this.f5454d = null;
        }
    }
}
