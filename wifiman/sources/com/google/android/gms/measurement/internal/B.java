package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;
import o.C7010a;
import s3.AbstractC7901p;

/* loaded from: classes.dex */
public final class B extends AbstractC4845f1 {

    /* renamed from: b, reason: collision with root package name */
    private final Map f35790b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f35791c;

    /* renamed from: d, reason: collision with root package name */
    private long f35792d;

    public B(C4976v3 c4976v3) {
        super(c4976v3);
        this.f35791c = new C7010a();
        this.f35790b = new C7010a();
    }

    private final void t(long j10, C4970u5 c4970u5) {
        if (c4970u5 == null) {
            zzj().G().a("Not logging ad exposure. No active activity");
            return;
        }
        if (j10 < 1000) {
            zzj().G().b("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j10));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("_xt", j10);
        x7.T(c4970u5, bundle, true);
        n().c1("am", "_xa", bundle);
    }

    static /* synthetic */ void v(B b10, String str, long j10) {
        b10.j();
        AbstractC7901p.f(str);
        if (b10.f35791c.isEmpty()) {
            b10.f35792d = j10;
        }
        Integer num = (Integer) b10.f35791c.get(str);
        if (num != null) {
            b10.f35791c.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (b10.f35791c.size() >= 100) {
            b10.zzj().H().a("Too many ads visible");
        } else {
            b10.f35791c.put(str, 1);
            b10.f35790b.put(str, Long.valueOf(j10));
        }
    }

    private final void x(String str, long j10, C4970u5 c4970u5) {
        if (c4970u5 == null) {
            zzj().G().a("Not logging ad unit exposure. No active activity");
            return;
        }
        if (j10 < 1000) {
            zzj().G().b("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j10));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("_ai", str);
        bundle.putLong("_xt", j10);
        x7.T(c4970u5, bundle, true);
        n().c1("am", "_xu", bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y(long j10) {
        Iterator it = this.f35790b.keySet().iterator();
        while (it.hasNext()) {
            this.f35790b.put((String) it.next(), Long.valueOf(j10));
        }
        if (this.f35790b.isEmpty()) {
            return;
        }
        this.f35792d = j10;
    }

    static /* synthetic */ void z(B b10, String str, long j10) {
        b10.j();
        AbstractC7901p.f(str);
        Integer num = (Integer) b10.f35791c.get(str);
        if (num == null) {
            b10.zzj().C().b("Call to endAdUnitExposure for unknown ad unit id", str);
            return;
        }
        C4970u5 c4970u5Z = b10.p().z(false);
        int iIntValue = num.intValue() - 1;
        if (iIntValue != 0) {
            b10.f35791c.put(str, Integer.valueOf(iIntValue));
            return;
        }
        b10.f35791c.remove(str);
        Long l10 = (Long) b10.f35790b.get(str);
        if (l10 == null) {
            b10.zzj().C().a("First ad unit exposure time was never set");
        } else {
            long jLongValue = j10 - l10.longValue();
            b10.f35790b.remove(str);
            b10.x(str, jLongValue, c4970u5Z);
        }
        if (b10.f35791c.isEmpty()) {
            long j11 = b10.f35792d;
            if (j11 == 0) {
                b10.zzj().C().a("First ad exposure time was never set");
            } else {
                b10.t(j10 - j11, c4970u5Z);
                b10.f35792d = 0L;
            }
        }
    }

    public final void A(String str, long j10) {
        if (str == null || str.length() == 0) {
            zzj().C().a("Ad unit id must be a non-empty string");
        } else {
            zzl().z(new E0(this, str, j10));
        }
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

    public final void s(long j10) {
        C4970u5 c4970u5Z = p().z(false);
        for (String str : this.f35790b.keySet()) {
            x(str, j10 - ((Long) this.f35790b.get(str)).longValue(), c4970u5Z);
        }
        if (!this.f35790b.isEmpty()) {
            t(j10 - this.f35792d, c4970u5Z);
        }
        y(j10);
    }

    public final void w(String str, long j10) {
        if (str == null || str.length() == 0) {
            zzj().C().a("Ad unit id must be a non-empty string");
        } else {
            zzl().z(new RunnableC4798a(this, str, j10));
        }
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
