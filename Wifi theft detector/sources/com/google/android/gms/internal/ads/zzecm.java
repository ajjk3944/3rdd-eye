package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.VisibleForTesting;

/* loaded from: classes2.dex */
public final class zzecm {

    @VisibleForTesting
    zzbyr zza;

    @VisibleForTesting
    zzbyr zzb;
    private final Context zzc;
    private final zzecj zzd;
    private final zzdxz zze;
    private final com.google.android.gms.ads.internal.util.zzg zzf;

    public zzecm(zzecj zzecjVar, zzdxz zzdxzVar, Context context, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zzd = zzecjVar;
        this.zze = zzdxzVar;
        this.zzc = context;
        this.zzf = zzgVar;
    }

    public final void zza() {
        try {
            if (this.zzf.zzP()) {
                return;
            }
            zzecj zzecjVar = this.zzd;
            zzecjVar.zza();
            zzecjVar.zzb(new zzecl(this));
        } catch (Exception e10) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfP)).booleanValue()) {
                if (this.zzb == null) {
                    this.zzb = zzbyp.zzc(this.zzc);
                }
                this.zzb.zzh(e10, "InstallReferrerUnsampled.initializeAndReport");
            } else {
                if (this.zza == null) {
                    this.zza = zzbyp.zza(this.zzc);
                }
                this.zza.zzh(e10, "InstallReferrer.initializeAndReport");
            }
        }
    }

    public final /* synthetic */ Context zzb() {
        return this.zzc;
    }

    public final /* synthetic */ zzecj zzc() {
        return this.zzd;
    }

    public final /* synthetic */ zzdxz zzd() {
        return this.zze;
    }

    public final /* synthetic */ com.google.android.gms.ads.internal.util.zzg zze() {
        return this.zzf;
    }
}
