package com.google.android.gms.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzfy;
import com.google.android.gms.measurement.internal.zzgy;
import com.google.android.gms.measurement.internal.zzgz;
import com.google.android.gms.measurement.internal.zzid;
import com.google.android.gms.measurement.internal.zzlc;
import java.util.List;
import java.util.Map;
import m0.C5308a;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: classes2.dex */
final class zza extends zzd {
    private final zzfy zza;
    private final zzid zzb;

    public zza(zzfy zzfyVar) {
        super(null);
        Preconditions.checkNotNull(zzfyVar);
        this.zza = zzfyVar;
        this.zzb = zzfyVar.zzq();
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final int zza(String str) {
        this.zzb.zzh(str);
        return 25;
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final long zzb() {
        return this.zza.zzv().zzq();
    }

    @Override // com.google.android.gms.measurement.zzd
    public final Boolean zzc() {
        return this.zzb.zzi();
    }

    @Override // com.google.android.gms.measurement.zzd
    public final Double zzd() {
        return this.zzb.zzj();
    }

    @Override // com.google.android.gms.measurement.zzd
    public final Integer zze() {
        return this.zzb.zzl();
    }

    @Override // com.google.android.gms.measurement.zzd
    public final Long zzf() {
        return this.zzb.zzm();
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final Object zzg(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? this.zzb.zzi() : this.zzb.zzl() : this.zzb.zzj() : this.zzb.zzm() : this.zzb.zzr();
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final String zzh() {
        return this.zzb.zzo();
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final String zzi() {
        return this.zzb.zzp();
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final String zzj() {
        return this.zzb.zzq();
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final String zzk() {
        return this.zzb.zzo();
    }

    @Override // com.google.android.gms.measurement.zzd
    public final String zzl() {
        return this.zzb.zzr();
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final List zzm(String str, String str2) {
        return this.zzb.zzs(str, str2);
    }

    @Override // com.google.android.gms.measurement.zzd
    public final Map zzn(boolean z10) {
        List<zzlc> listZzt = this.zzb.zzt(z10);
        C5308a c5308a = new C5308a(listZzt.size());
        for (zzlc zzlcVar : listZzt) {
            Object objZza = zzlcVar.zza();
            if (objZza != null) {
                c5308a.put(zzlcVar.zzb, objZza);
            }
        }
        return c5308a;
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final Map zzo(String str, String str2, boolean z10) {
        return this.zzb.zzu(str, str2, z10);
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final void zzp(String str) throws IllegalStateException {
        this.zza.zzd().zzd(str, this.zza.zzav().elapsedRealtime());
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final void zzq(String str, String str2, Bundle bundle) throws IllegalStateException {
        this.zza.zzq().zzA(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final void zzr(String str) throws IllegalStateException {
        this.zza.zzd().zze(str, this.zza.zzav().elapsedRealtime());
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final void zzs(String str, String str2, Bundle bundle) throws IllegalStateException {
        this.zzb.zzD(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final void zzt(String str, String str2, Bundle bundle, long j4) throws IllegalStateException {
        this.zzb.zzE(str, str2, bundle, true, false, j4);
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final void zzu(zzgz zzgzVar) {
        this.zzb.zzJ(zzgzVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final void zzv(Bundle bundle) throws IllegalStateException {
        this.zzb.zzP(bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final void zzw(zzgy zzgyVar) {
        this.zzb.zzT(zzgyVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final void zzx(zzgz zzgzVar) {
        this.zzb.zzZ(zzgzVar);
    }
}
