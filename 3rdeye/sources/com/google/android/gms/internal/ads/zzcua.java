package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzcua implements zzcyt, zzdei {
    private final Context zza;
    private final zzfco zzb;
    private final VersionInfoParcel zzc;
    private final com.google.android.gms.ads.internal.util.zzg zzd;
    private final zzdug zze;
    private final zzfhp zzf;
    private final zzdvb zzg;

    public zzcua(Context context, zzfco zzfcoVar, VersionInfoParcel versionInfoParcel, com.google.android.gms.ads.internal.util.zzg zzgVar, zzdug zzdugVar, zzfhp zzfhpVar, zzdvb zzdvbVar) {
        this.zza = context;
        this.zzb = zzfcoVar;
        this.zzc = versionInfoParcel;
        this.zzd = zzgVar;
        this.zze = zzdugVar;
        this.zzf = zzfhpVar;
        this.zzg = zzdvbVar;
    }

    private final void zzc() throws JSONException {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzej)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zzg zzgVar = this.zzd;
            Context context = this.zza;
            VersionInfoParcel versionInfoParcel = this.zzc;
            zzfco zzfcoVar = this.zzb;
            zzfhp zzfhpVar = this.zzf;
            zzdvb zzdvbVar = this.zzg;
            com.google.android.gms.ads.internal.zzv.zza().zze(context, versionInfoParcel, zzfcoVar.zzf, zzgVar.zzg(), zzfhpVar, zzdvbVar.zzq());
        }
        this.zze.zzr();
    }

    @Override // com.google.android.gms.internal.ads.zzcyt
    public final void zzdn(zzbvo zzbvoVar) throws JSONException {
        zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzdei
    public final void zze(com.google.android.gms.ads.nonagon.signalgeneration.zzbk zzbkVar) throws JSONException {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzek)).booleanValue()) {
            zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcyt
    public final void zzdo(zzfcf zzfcfVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdei
    public final void zzf(String str) {
    }
}
