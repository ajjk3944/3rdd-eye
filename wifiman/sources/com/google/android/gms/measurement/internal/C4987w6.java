package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;

/* renamed from: com.google.android.gms.measurement.internal.w6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4987w6 extends I2 {

    /* renamed from: c, reason: collision with root package name */
    private Handler f36852c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f36853d;

    /* renamed from: e, reason: collision with root package name */
    protected final E6 f36854e;

    /* renamed from: f, reason: collision with root package name */
    protected final C6 f36855f;

    /* renamed from: g, reason: collision with root package name */
    private final C4995x6 f36856g;

    C4987w6(C4976v3 c4976v3) {
        super(c4976v3);
        this.f36853d = true;
        this.f36854e = new E6(this);
        this.f36855f = new C6(this);
        this.f36856g = new C4995x6(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D() {
        j();
        if (this.f36852c == null) {
            this.f36852c = new com.google.android.gms.internal.measurement.N0(Looper.getMainLooper());
        }
    }

    static /* synthetic */ void F(C4987w6 c4987w6, long j10) {
        c4987w6.j();
        c4987w6.D();
        c4987w6.zzj().G().b("Activity resumed, time", Long.valueOf(j10));
        if (c4987w6.a().p(N.f36066b1)) {
            if (c4987w6.a().T() || c4987w6.f36853d) {
                c4987w6.f36855f.f(j10);
            }
        } else if (c4987w6.a().T() || c4987w6.e().f36281u.b()) {
            c4987w6.f36855f.f(j10);
        }
        c4987w6.f36856g.a();
        E6 e62 = c4987w6.f36854e;
        e62.f35857a.j();
        if (e62.f35857a.f36331a.n()) {
            e62.b(e62.f35857a.zzb().a(), false);
        }
    }

    static /* synthetic */ void z(C4987w6 c4987w6, long j10) {
        c4987w6.j();
        c4987w6.D();
        c4987w6.zzj().G().b("Activity paused, time", Long.valueOf(j10));
        c4987w6.f36856g.b(j10);
        if (c4987w6.a().T()) {
            c4987w6.f36855f.e(j10);
        }
    }

    final void A(boolean z10) {
        j();
        this.f36853d = z10;
    }

    public final boolean B(boolean z10, boolean z11, long j10) {
        return this.f36855f.d(z10, z11, j10);
    }

    final boolean C() {
        j();
        return this.f36853d;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4
    public final /* bridge */ /* synthetic */ C4893l a() {
        return super.a();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4
    public final /* bridge */ /* synthetic */ F b() {
        return super.b();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4
    public final /* bridge */ /* synthetic */ D2 c() {
        return super.c();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4
    public final /* bridge */ /* synthetic */ X2 e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4
    public final /* bridge */ /* synthetic */ C4915n5 f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4
    public final /* bridge */ /* synthetic */ x7 g() {
        return super.g();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4845f1, com.google.android.gms.measurement.internal.AbstractC4803a4
    public final /* bridge */ /* synthetic */ void h() {
        super.h();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4845f1, com.google.android.gms.measurement.internal.AbstractC4803a4
    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4845f1, com.google.android.gms.measurement.internal.AbstractC4803a4
    public final /* bridge */ /* synthetic */ void j() {
        super.j();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4845f1
    public final /* bridge */ /* synthetic */ B k() {
        return super.k();
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
