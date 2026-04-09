package com.google.firebase.analytics;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.C4371i1;
import com.google.android.gms.measurement.internal.InterfaceC4883j5;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
final class a implements InterfaceC4883j5 {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ C4371i1 f38612a;

    a(C4371i1 c4371i1) {
        this.f38612a = c4371i1;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4883j5
    public final void a(Bundle bundle) {
        this.f38612a.k(bundle);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4883j5
    public final void b(String str) {
        this.f38612a.D(str);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4883j5
    public final void c(String str, String str2, Bundle bundle) {
        this.f38612a.t(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4883j5
    public final List d(String str, String str2) {
        return this.f38612a.g(str, str2);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4883j5
    public final Map e(String str, String str2, boolean z10) {
        return this.f38612a.h(str, str2, z10);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4883j5
    public final void f(String str, String str2, Bundle bundle) {
        this.f38612a.B(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4883j5
    public final int zza(String str) {
        return this.f38612a.a(str);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4883j5
    public final void zzb(String str) {
        this.f38612a.z(str);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4883j5
    public final long zzf() {
        return this.f38612a.b();
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4883j5
    public final String zzg() {
        return this.f38612a.H();
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4883j5
    public final String zzh() {
        return this.f38612a.I();
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4883j5
    public final String zzi() {
        return this.f38612a.J();
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4883j5
    public final String zzj() {
        return this.f38612a.K();
    }
}
