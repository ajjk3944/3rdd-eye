package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.ar.core.ImageMetadata;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import s3.AbstractC7901p;

/* loaded from: classes.dex */
public final class C5 extends I2 {

    /* renamed from: c, reason: collision with root package name */
    private final ServiceConnectionC4868h6 f35812c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC4951s2 f35813d;

    /* renamed from: e, reason: collision with root package name */
    private volatile Boolean f35814e;

    /* renamed from: f, reason: collision with root package name */
    private final A f35815f;

    /* renamed from: g, reason: collision with root package name */
    private final H6 f35816g;

    /* renamed from: h, reason: collision with root package name */
    private final List f35817h;

    /* renamed from: i, reason: collision with root package name */
    private final A f35818i;

    protected C5(C4976v3 c4976v3) {
        super(c4976v3);
        this.f35817h = new ArrayList();
        this.f35816g = new H6(c4976v3.zzb());
        this.f35812c = new ServiceConnectionC4868h6(this);
        this.f35815f = new I5(this, c4976v3);
        this.f35818i = new V5(this, c4976v3);
    }

    static /* synthetic */ void K(C5 c52, ComponentName componentName) {
        c52.j();
        if (c52.f35813d != null) {
            c52.f35813d = null;
            c52.zzj().G().b("Disconnected from device MeasurementService", componentName);
            c52.j();
            c52.b0();
        }
    }

    public static /* synthetic */ void M(C5 c52, t7 t7Var, C4861h c4861h) {
        InterfaceC4951s2 interfaceC4951s2 = c52.f35813d;
        if (interfaceC4951s2 == null) {
            c52.zzj().C().a("[sgtm] Discarding data. Failed to update batch upload status.");
            return;
        }
        try {
            interfaceC4951s2.N(t7Var, c4861h);
            c52.m0();
        } catch (RemoteException e10) {
            c52.zzj().C().c("[sgtm] Failed to update batch upload status, rowId, exception", Long.valueOf(c4861h.f36469a), e10);
        }
    }

    public static /* synthetic */ void N(C5 c52, AtomicReference atomicReference, t7 t7Var, Bundle bundle) {
        InterfaceC4951s2 interfaceC4951s2;
        synchronized (atomicReference) {
            try {
                interfaceC4951s2 = c52.f35813d;
            } catch (RemoteException e10) {
                c52.zzj().C().b("Failed to request trigger URIs; remote exception", e10);
                atomicReference.notifyAll();
            }
            if (interfaceC4951s2 == null) {
                c52.zzj().C().a("Failed to request trigger URIs; not connected to service");
                return;
            }
            AbstractC7901p.l(t7Var);
            interfaceC4951s2.g0(t7Var, bundle, new N5(c52, atomicReference));
            c52.m0();
        }
    }

    public static /* synthetic */ void O(C5 c52, AtomicReference atomicReference, t7 t7Var, Q6 q62) {
        InterfaceC4951s2 interfaceC4951s2;
        synchronized (atomicReference) {
            try {
                interfaceC4951s2 = c52.f35813d;
            } catch (RemoteException e10) {
                c52.zzj().C().b("[sgtm] Failed to get upload batches; remote exception", e10);
                atomicReference.notifyAll();
            }
            if (interfaceC4951s2 == null) {
                c52.zzj().C().a("[sgtm] Failed to get upload batches; not connected to service");
                return;
            }
            AbstractC7901p.l(t7Var);
            interfaceC4951s2.O(t7Var, q62, new P5(c52, atomicReference));
            c52.m0();
        }
    }

    private final void Q(Runnable runnable) {
        j();
        if (g0()) {
            runnable.run();
        } else {
            if (this.f35817h.size() >= 1000) {
                zzj().C().a("Discarding data. Max runnable queue size reached");
                return;
            }
            this.f35817h.add(runnable);
            this.f35818i.b(60000L);
            b0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l0() {
        j();
        zzj().G().b("Processing queued up service tasks", Integer.valueOf(this.f35817h.size()));
        Iterator it = this.f35817h.iterator();
        while (it.hasNext()) {
            try {
                ((Runnable) it.next()).run();
            } catch (RuntimeException e10) {
                zzj().C().b("Task exception while flushing queue", e10);
            }
        }
        this.f35817h.clear();
        this.f35818i.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m0() {
        j();
        this.f35816g.c();
        this.f35815f.b(((Long) N.f36057Y.a(null)).longValue());
    }

    private final t7 p0(boolean z10) {
        return l().y(z10 ? zzj().K() : null);
    }

    public static /* synthetic */ void q0(C5 c52) {
        InterfaceC4951s2 interfaceC4951s2 = c52.f35813d;
        if (interfaceC4951s2 == null) {
            c52.zzj().C().a("Failed to send storage consent settings to service");
            return;
        }
        try {
            t7 t7VarP0 = c52.p0(false);
            AbstractC7901p.l(t7VarP0);
            interfaceC4951s2.D(t7VarP0);
            c52.m0();
        } catch (RemoteException e10) {
            c52.zzj().C().b("Failed to send storage consent settings to the service", e10);
        }
    }

    public static /* synthetic */ void r0(C5 c52) {
        InterfaceC4951s2 interfaceC4951s2 = c52.f35813d;
        if (interfaceC4951s2 == null) {
            c52.zzj().C().a("Failed to send Dma consent settings to service");
            return;
        }
        try {
            t7 t7VarP0 = c52.p0(false);
            AbstractC7901p.l(t7VarP0);
            interfaceC4951s2.Q(t7VarP0);
            c52.m0();
        } catch (RemoteException e10) {
            c52.zzj().C().b("Failed to send Dma consent settings to the service", e10);
        }
    }

    static /* synthetic */ void t0(C5 c52) {
        c52.j();
        if (c52.g0()) {
            c52.zzj().G().a("Inactivity, disconnecting from the service");
            c52.c0();
        }
    }

    public final void A(com.google.android.gms.internal.measurement.U0 u02) {
        j();
        u();
        Q(new T5(this, p0(false), u02));
    }

    public final void B(com.google.android.gms.internal.measurement.U0 u02, L l10, String str) {
        j();
        u();
        if (g().q(12451000) == 0) {
            Q(new Z5(this, l10, str, u02));
        } else {
            zzj().H().a("Not bundling data. Service unavailable or out of date");
            g().R(u02, new byte[0]);
        }
    }

    protected final void C(com.google.android.gms.internal.measurement.U0 u02, String str, String str2) {
        j();
        u();
        Q(new RunnableC4850f6(this, str, str2, p0(false), u02));
    }

    protected final void D(com.google.android.gms.internal.measurement.U0 u02, String str, String str2, boolean z10) {
        j();
        u();
        Q(new K5(this, str, str2, p0(false), z10, u02));
    }

    protected final void E(final C4861h c4861h) {
        j();
        u();
        final t7 t7VarP0 = p0(true);
        AbstractC7901p.l(t7VarP0);
        Q(new Runnable() { // from class: com.google.android.gms.measurement.internal.H5
            @Override // java.lang.Runnable
            public final void run() {
                C5.M(this.f35919a, t7VarP0, c4861h);
            }
        });
    }

    protected final void F(C4877j c4877j) {
        AbstractC7901p.l(c4877j);
        j();
        u();
        Q(new RunnableC4832d6(this, true, p0(true), m().B(c4877j), new C4877j(c4877j), c4877j));
    }

    protected final void G(L l10, String str) {
        AbstractC7901p.l(l10);
        j();
        u();
        Q(new RunnableC4805a6(this, true, p0(true), m().D(l10), l10, str));
    }

    protected final void H(InterfaceC4951s2 interfaceC4951s2) {
        j();
        AbstractC7901p.l(interfaceC4951s2);
        this.f35813d = interfaceC4951s2;
        m0();
        l0();
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x016b A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void I(com.google.android.gms.measurement.internal.InterfaceC4951s2 r37, t3.AbstractC8026a r38, com.google.android.gms.measurement.internal.t7 r39) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 376
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C5.I(com.google.android.gms.measurement.internal.s2, t3.a, com.google.android.gms.measurement.internal.t7):void");
    }

    protected final void J(C4970u5 c4970u5) {
        j();
        u();
        Q(new X5(this, c4970u5));
    }

    protected final void P(r7 r7Var) {
        j();
        u();
        Q(new O5(this, p0(true), m().E(r7Var), r7Var));
    }

    public final void R(AtomicReference atomicReference) {
        j();
        u();
        Q(new Q5(this, atomicReference, p0(false)));
    }

    protected final void S(final AtomicReference atomicReference, final Bundle bundle) {
        j();
        u();
        final t7 t7VarP0 = p0(false);
        if (a().p(N.f36090j1)) {
            Q(new Runnable() { // from class: com.google.android.gms.measurement.internal.G5
                @Override // java.lang.Runnable
                public final void run() {
                    C5.N(this.f35881a, atomicReference, t7VarP0, bundle);
                }
            });
        } else {
            Q(new L5(this, atomicReference, t7VarP0, bundle));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void T(final AtomicReference atomicReference, final Q6 q62) {
        j();
        u();
        final t7 t7VarP0 = p0(false);
        Q(new Runnable() { // from class: com.google.android.gms.measurement.internal.J5
            @Override // java.lang.Runnable
            public final void run() {
                C5.O(this.f35948a, atomicReference, t7VarP0, q62);
            }
        });
    }

    protected final void U(AtomicReference atomicReference, String str, String str2, String str3) {
        j();
        u();
        Q(new RunnableC4823c6(this, atomicReference, str, str2, str3, p0(false)));
    }

    protected final void V(AtomicReference atomicReference, String str, String str2, String str3, boolean z10) {
        j();
        u();
        Q(new RunnableC4841e6(this, atomicReference, str, str2, str3, p0(false), z10));
    }

    protected final void W(boolean z10) {
        j();
        u();
        if (i0()) {
            Q(new RunnableC4814b6(this, p0(false)));
        }
    }

    protected final C4917o X() {
        j();
        u();
        InterfaceC4951s2 interfaceC4951s2 = this.f35813d;
        if (interfaceC4951s2 == null) {
            b0();
            zzj().B().a("Failed to get consents; not connected to service yet.");
            return null;
        }
        t7 t7VarP0 = p0(false);
        AbstractC7901p.l(t7VarP0);
        try {
            C4917o c4917oH = interfaceC4951s2.H(t7VarP0);
            m0();
            return c4917oH;
        } catch (RemoteException e10) {
            zzj().C().b("Failed to get consents; remote exception", e10);
            return null;
        }
    }

    final Boolean Y() {
        return this.f35814e;
    }

    protected final void Z() {
        j();
        u();
        Q(new U5(this, p0(true)));
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4
    public final /* bridge */ /* synthetic */ C4893l a() {
        return super.a();
    }

    protected final void a0() {
        j();
        u();
        t7 t7VarP0 = p0(true);
        m().G();
        Q(new S5(this, t7VarP0));
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4
    public final /* bridge */ /* synthetic */ F b() {
        return super.b();
    }

    final void b0() {
        j();
        u();
        if (g0()) {
            return;
        }
        if (k0()) {
            this.f35812c.a();
            return;
        }
        if (a().V()) {
            return;
        }
        List<ResolveInfo> listQueryIntentServices = zza().getPackageManager().queryIntentServices(new Intent().setClassName(zza(), "com.google.android.gms.measurement.AppMeasurementService"), ImageMetadata.CONTROL_AE_ANTIBANDING_MODE);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            zzj().C().a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            return;
        }
        Intent intent = new Intent("com.google.android.gms.measurement.START");
        intent.setComponent(new ComponentName(zza(), "com.google.android.gms.measurement.AppMeasurementService"));
        this.f35812c.d(intent);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4
    public final /* bridge */ /* synthetic */ D2 c() {
        return super.c();
    }

    public final void c0() {
        j();
        u();
        this.f35812c.g();
        try {
            v3.b.b().c(zza(), this.f35812c);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f35813d = null;
    }

    protected final void d0() {
        j();
        u();
        t7 t7VarP0 = p0(false);
        m().F();
        Q(new R5(this, t7VarP0));
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4
    public final /* bridge */ /* synthetic */ X2 e() {
        return super.e();
    }

    protected final void e0() {
        j();
        u();
        Q(new Runnable() { // from class: com.google.android.gms.measurement.internal.E5
            @Override // java.lang.Runnable
            public final void run() {
                C5.r0(this.f35856a);
            }
        });
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4
    public final /* bridge */ /* synthetic */ C4915n5 f() {
        return super.f();
    }

    protected final void f0() {
        j();
        u();
        Q(new Y5(this, p0(true)));
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4
    public final /* bridge */ /* synthetic */ x7 g() {
        return super.g();
    }

    public final boolean g0() {
        j();
        u();
        return this.f35813d != null;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4845f1, com.google.android.gms.measurement.internal.AbstractC4803a4
    public final /* bridge */ /* synthetic */ void h() {
        super.h();
    }

    final boolean h0() {
        j();
        u();
        return !k0() || g().E0() >= 200900;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4845f1, com.google.android.gms.measurement.internal.AbstractC4803a4
    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    final boolean i0() {
        j();
        u();
        return !k0() || g().E0() >= ((Integer) N.f36026I0.a(null)).intValue();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4845f1, com.google.android.gms.measurement.internal.AbstractC4803a4
    public final /* bridge */ /* synthetic */ void j() {
        super.j();
    }

    final boolean j0() {
        j();
        u();
        return !k0() || g().E0() >= 241200;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4845f1
    public final /* bridge */ /* synthetic */ B k() {
        return super.k();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final boolean k0() {
        /*
            Method dump skipped, instructions count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C5.k0():boolean");
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4845f1
    public final /* bridge */ /* synthetic */ C5007z2 l() {
        return super.l();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4845f1
    public final /* bridge */ /* synthetic */ C2 m() {
        return super.m();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4845f1
    public final /* bridge */ /* synthetic */ C4945r4 n() {
        return super.n();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4845f1
    public final /* bridge */ /* synthetic */ C4939q5 o() {
        return super.o();
    }

    protected final void o0(boolean z10) {
        j();
        u();
        Q(new Runnable() { // from class: com.google.android.gms.measurement.internal.F5
            @Override // java.lang.Runnable
            public final void run() {
                C5.q0(this.f35871a);
            }
        });
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4845f1
    public final /* bridge */ /* synthetic */ C4994x5 p() {
        return super.p();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4845f1
    public final /* bridge */ /* synthetic */ C5 q() {
        return super.q();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4845f1
    public final /* bridge */ /* synthetic */ C4987w6 r() {
        return super.r();
    }

    @Override // com.google.android.gms.measurement.internal.I2
    protected final boolean t() {
        return false;
    }

    public final void z(Bundle bundle) {
        j();
        u();
        K k10 = new K(bundle);
        Q(new W5(this, true, p0(false), a().p(N.f36102n1) && m().C(k10), k10, bundle));
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4, com.google.android.gms.measurement.internal.InterfaceC4821c4
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4, com.google.android.gms.measurement.internal.InterfaceC4821c4
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.util.d zzb() {
        return super.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4, com.google.android.gms.measurement.internal.InterfaceC4821c4
    public final /* bridge */ /* synthetic */ C4834e zzd() {
        return super.zzd();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4, com.google.android.gms.measurement.internal.InterfaceC4821c4
    public final /* bridge */ /* synthetic */ L2 zzj() {
        return super.zzj();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4, com.google.android.gms.measurement.internal.InterfaceC4821c4
    public final /* bridge */ /* synthetic */ C4952s3 zzl() {
        return super.zzl();
    }
}
