package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzefb implements zzdgg {
    private final Context zza;
    private final VersionInfoParcel zzb;
    private final A4.a zzc;
    private final zzfbt zzd;
    private final zzcfe zze;
    private final zzfco zzf;
    private final zzbkg zzg;
    private final boolean zzh;
    private final zzecd zzi;
    private final zzdsc zzj;

    public zzefb(Context context, VersionInfoParcel versionInfoParcel, A4.a aVar, zzfbt zzfbtVar, zzcfe zzcfeVar, zzfco zzfcoVar, boolean z10, zzbkg zzbkgVar, zzecd zzecdVar, zzdsc zzdscVar) {
        this.zza = context;
        this.zzb = versionInfoParcel;
        this.zzc = aVar;
        this.zzd = zzfbtVar;
        this.zze = zzcfeVar;
        this.zzf = zzfcoVar;
        this.zzg = zzbkgVar;
        this.zzh = z10;
        this.zzi = zzecdVar;
        this.zzj = zzdscVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdgg
    public final zzfbt zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzdgg
    public final void zzb(boolean z10, Context context, zzcwe zzcweVar) throws NumberFormatException {
        zzdev zzdevVar = (zzdev) zzgdb.zzq(this.zzc);
        zzcfe zzcfeVar = this.zze;
        zzcfeVar.zzaq(true);
        boolean z11 = this.zzh;
        boolean zZze = z11 ? this.zzg.zze(false) : false;
        com.google.android.gms.ads.internal.zzv.zzr();
        boolean zZzJ = com.google.android.gms.ads.internal.util.zzs.zzJ(this.zza);
        boolean z12 = z11 && this.zzg.zzd();
        float fZza = z11 ? this.zzg.zza() : 0.0f;
        zzfbt zzfbtVar = this.zzd;
        com.google.android.gms.ads.internal.zzl zzlVar = new com.google.android.gms.ads.internal.zzl(zZze, zZzJ, z12, fZza, -1, z10, zzfbtVar.zzO, false);
        if (zzcweVar != null) {
            zzcweVar.zzf();
        }
        com.google.android.gms.ads.internal.zzv.zzj();
        zzdfv zzdfvVarZzh = zzdevVar.zzh();
        int i = zzfbtVar.zzQ;
        VersionInfoParcel versionInfoParcel = this.zzb;
        String str = zzfbtVar.zzB;
        zzfby zzfbyVar = zzfbtVar.zzs;
        com.google.android.gms.ads.internal.overlay.zzn.zza(context, new AdOverlayInfoParcel(null, zzdfvVarZzh, null, zzcfeVar, i, versionInfoParcel, str, zzlVar, zzfbyVar.zzb, zzfbyVar.zza, this.zzf.zzf, zzcweVar, zzfbtVar.zzb() ? this.zzi : null, zzcfeVar.zzr()), true, this.zzj);
    }
}
