package com.google.android.gms.measurement;

import android.os.Bundle;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.internal.C4945r4;
import com.google.android.gms.measurement.internal.C4976v3;
import java.util.List;
import java.util.Map;
import s3.AbstractC7901p;

/* loaded from: classes.dex */
final class b extends AppMeasurement.a {

    /* renamed from: a, reason: collision with root package name */
    private final C4976v3 f35766a;

    /* renamed from: b, reason: collision with root package name */
    private final C4945r4 f35767b;

    public b(C4976v3 c4976v3) {
        super();
        AbstractC7901p.l(c4976v3);
        this.f35766a = c4976v3;
        this.f35767b = c4976v3.E();
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4883j5
    public final void a(Bundle bundle) {
        this.f35767b.I(bundle);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4883j5
    public final void b(String str) {
        this.f35766a.v().A(str, this.f35766a.zzb().c());
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4883j5
    public final void c(String str, String str2, Bundle bundle) {
        this.f35766a.E().j0(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4883j5
    public final List d(String str, String str2) {
        return this.f35767b.E(str, str2);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4883j5
    public final Map e(String str, String str2, boolean z10) {
        return this.f35767b.F(str, str2, z10);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4883j5
    public final void f(String str, String str2, Bundle bundle) {
        this.f35767b.W0(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4883j5
    public final int zza(String str) {
        return C4945r4.B(str);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4883j5
    public final void zzb(String str) {
        this.f35766a.v().w(str, this.f35766a.zzb().c());
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4883j5
    public final long zzf() {
        return this.f35766a.K().M0();
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4883j5
    public final String zzg() {
        return this.f35767b.v0();
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4883j5
    public final String zzh() {
        return this.f35767b.w0();
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4883j5
    public final String zzi() {
        return this.f35767b.x0();
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4883j5
    public final String zzj() {
        return this.f35767b.v0();
    }
}
