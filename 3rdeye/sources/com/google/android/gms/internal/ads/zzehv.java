package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzehv implements zzdgg {
    private final Context zza;
    private final zzdpc zzb;
    private final zzfco zzc;
    private final VersionInfoParcel zzd;
    private final zzfbt zze;
    private final A4.a zzf;
    private final zzcfe zzg;
    private final zzbkg zzh;
    private final boolean zzi;
    private final zzecd zzj;
    private final zzdrw zzk;
    private final zzdsc zzl;

    public zzehv(Context context, zzdpc zzdpcVar, zzfco zzfcoVar, VersionInfoParcel versionInfoParcel, zzfbt zzfbtVar, A4.a aVar, zzcfe zzcfeVar, zzbkg zzbkgVar, boolean z10, zzecd zzecdVar, zzdrw zzdrwVar, zzdsc zzdscVar) {
        this.zza = context;
        this.zzb = zzdpcVar;
        this.zzc = zzfcoVar;
        this.zzd = versionInfoParcel;
        this.zze = zzfbtVar;
        this.zzf = aVar;
        this.zzg = zzcfeVar;
        this.zzh = zzbkgVar;
        this.zzi = z10;
        this.zzj = zzecdVar;
        this.zzk = zzdrwVar;
        this.zzl = zzdscVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdgg
    public final zzfbt zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzdgg
    public final void zzb(boolean z10, Context context, zzcwe zzcweVar) throws NumberFormatException {
        zzdoh zzdohVar = (zzdoh) zzgdb.zzq(this.zzf);
        try {
            zzfbt zzfbtVar = this.zze;
            final zzcfe zzcfeVarZza = this.zzg;
            if (zzcfeVarZza.zzaG()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzaZ)).booleanValue()) {
                    zzcfeVarZza = this.zzb.zza(this.zzc.zze, null, null);
                    zzbkv.zzb(zzcfeVarZza, zzdohVar.zzg());
                    final zzdpg zzdpgVar = new zzdpg();
                    zzdpgVar.zza(this.zza, zzcfeVarZza.zzF());
                    zzdohVar.zzl().zzi(zzcfeVarZza, true, this.zzi ? this.zzh : null, this.zzk.zza());
                    zzcfeVarZza.zzN().zzC(new zzcgu() { // from class: com.google.android.gms.internal.ads.zzeht
                        @Override // com.google.android.gms.internal.ads.zzcgu
                        public final void zza(boolean z11, int i, String str, String str2) {
                            zzdpgVar.zzb();
                            zzcfe zzcfeVar = zzcfeVarZza;
                            zzcfeVar.zzab();
                            zzcfeVar.zzN().zzs();
                        }
                    });
                    zzcfeVarZza.zzN().zzK(new zzcgv() { // from class: com.google.android.gms.internal.ads.zzehu
                        @Override // com.google.android.gms.internal.ads.zzcgv
                        public final void zza() {
                            zzcfeVarZza.zzaa();
                        }
                    });
                    zzfby zzfbyVar = zzfbtVar.zzs;
                    zzcfeVarZza.zzae(zzfbyVar.zzb, zzfbyVar.zza, null);
                }
            }
            zzcfe zzcfeVar = zzcfeVarZza;
            zzcfeVar.zzaq(true);
            boolean z11 = this.zzi;
            boolean z12 = false;
            boolean zZze = z11 ? this.zzh.zze(false) : false;
            com.google.android.gms.ads.internal.zzv.zzr();
            boolean zZzJ = com.google.android.gms.ads.internal.util.zzs.zzJ(this.zza);
            if (z11 && this.zzh.zzd()) {
                z12 = true;
            }
            float fZza = z11 ? this.zzh.zza() : 0.0f;
            zzfbt zzfbtVar2 = this.zze;
            com.google.android.gms.ads.internal.zzl zzlVar = new com.google.android.gms.ads.internal.zzl(zZze, zZzJ, z12, fZza, -1, z10, zzfbtVar2.zzO, zzfbtVar2.zzP);
            if (zzcweVar != null) {
                zzcweVar.zzf();
            }
            com.google.android.gms.ads.internal.zzv.zzj();
            zzdfv zzdfvVarZzh = zzdohVar.zzh();
            int i = zzfbtVar2.zzQ;
            VersionInfoParcel versionInfoParcel = this.zzd;
            String str = zzfbtVar2.zzB;
            zzfby zzfbyVar2 = zzfbtVar2.zzs;
            com.google.android.gms.ads.internal.overlay.zzn.zza(context, new AdOverlayInfoParcel(null, zzdfvVarZzh, null, zzcfeVar, i, versionInfoParcel, str, zzlVar, zzfbyVar2.zzb, zzfbyVar2.zza, this.zzc.zzf, zzcweVar, zzfbtVar2.zzb() ? this.zzj : null, zzcfeVar.zzr()), true, this.zzl);
        } catch (zzcfq e4) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e4);
        }
    }
}
