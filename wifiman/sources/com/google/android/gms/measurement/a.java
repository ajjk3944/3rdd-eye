package com.google.android.gms.measurement;

import android.os.Bundle;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.internal.InterfaceC4883j5;
import java.util.List;
import java.util.Map;
import s3.AbstractC7901p;

/* loaded from: classes.dex */
final class a extends AppMeasurement.a {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4883j5 f35765a;

    public a(InterfaceC4883j5 interfaceC4883j5) {
        super();
        AbstractC7901p.l(interfaceC4883j5);
        this.f35765a = interfaceC4883j5;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4883j5
    public final void a(Bundle bundle) {
        this.f35765a.a(bundle);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4883j5
    public final void b(String str) {
        this.f35765a.b(str);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4883j5
    public final void c(String str, String str2, Bundle bundle) {
        this.f35765a.c(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4883j5
    public final List d(String str, String str2) {
        return this.f35765a.d(str, str2);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4883j5
    public final Map e(String str, String str2, boolean z10) {
        return this.f35765a.e(str, str2, z10);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4883j5
    public final void f(String str, String str2, Bundle bundle) {
        this.f35765a.f(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4883j5
    public final int zza(String str) {
        return this.f35765a.zza(str);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4883j5
    public final void zzb(String str) {
        this.f35765a.zzb(str);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4883j5
    public final long zzf() {
        return this.f35765a.zzf();
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4883j5
    public final String zzg() {
        return this.f35765a.zzg();
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4883j5
    public final String zzh() {
        return this.f35765a.zzh();
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4883j5
    public final String zzi() {
        return this.f35765a.zzi();
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4883j5
    public final String zzj() {
        return this.f35765a.zzj();
    }
}
