package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Iterator;
import m0.C5308a;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzdgh implements zzcxf, com.google.android.gms.ads.internal.overlay.zzr, zzcwl {
    zzecz zza;
    private final Context zzb;
    private final zzcfe zzc;
    private final zzfbt zzd;
    private final VersionInfoParcel zze;
    private final zzecx zzf;

    public zzdgh(Context context, zzcfe zzcfeVar, zzfbt zzfbtVar, VersionInfoParcel versionInfoParcel, zzecx zzecxVar) {
        this.zzb = context;
        this.zzc = zzcfeVar;
        this.zzd = zzfbtVar;
        this.zze = versionInfoParcel;
        this.zzf = zzecxVar;
    }

    private final boolean zzg() {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzfx)).booleanValue() && this.zzf.zzd();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdt() {
        zzcfe zzcfeVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzfA)).booleanValue() || (zzcfeVar = this.zzc) == null) {
            return;
        }
        if (this.zza != null || zzg()) {
            if (this.zza != null) {
                zzcfeVar.zzd("onSdkImpression", new C5308a());
            } else {
                this.zzf.zzb();
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdw(int i) {
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzcwl
    public final void zzs() {
        zzcfe zzcfeVar;
        if (zzg()) {
            this.zzf.zzb();
        } else {
            if (this.zza == null || (zzcfeVar = this.zzc) == null) {
                return;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzfA)).booleanValue()) {
                zzcfeVar.zzd("onSdkImpression", new C5308a());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxf
    public final void zzt() {
        zzcfe zzcfeVar;
        zzecw zzecwVar;
        zzecv zzecvVar;
        zzfbt zzfbtVar = this.zzd;
        if (!zzfbtVar.zzT || (zzcfeVar = this.zzc) == null) {
            return;
        }
        if (com.google.android.gms.ads.internal.zzv.zzC().zzl(this.zzb)) {
            if (zzg()) {
                this.zzf.zzc();
                return;
            }
            VersionInfoParcel versionInfoParcel = this.zze;
            String str = versionInfoParcel.buddyApkVersion + "." + versionInfoParcel.clientJarVersion;
            zzfcr zzfcrVar = zzfbtVar.zzV;
            String strZza = zzfcrVar.zza();
            if (zzfcrVar.zzc() == 1) {
                zzecvVar = zzecv.VIDEO;
                zzecwVar = zzecw.DEFINED_BY_JAVASCRIPT;
            } else {
                zzecwVar = zzfbtVar.zzY == 2 ? zzecw.UNSPECIFIED : zzecw.BEGIN_TO_RENDER;
                zzecvVar = zzecv.HTML_DISPLAY;
            }
            zzecz zzeczVarZza = com.google.android.gms.ads.internal.zzv.zzC().zza(str, zzcfeVar.zzG(), "", "javascript", strZza, zzecwVar, zzecvVar, zzfbtVar.zzal);
            this.zza = zzeczVarZza;
            if (zzeczVarZza != null) {
                zzfld zzfldVarZza = zzeczVarZza.zza();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzfw)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzv.zzC().zzj(zzfldVarZza, zzcfeVar.zzG());
                    Iterator it = zzcfeVar.zzV().iterator();
                    while (it.hasNext()) {
                        com.google.android.gms.ads.internal.zzv.zzC().zzg(zzfldVarZza, (View) it.next());
                    }
                } else {
                    com.google.android.gms.ads.internal.zzv.zzC().zzj(zzfldVarZza, zzcfeVar.zzF());
                }
                zzcfeVar.zzat(this.zza);
                com.google.android.gms.ads.internal.zzv.zzC().zzk(zzfldVarZza);
                zzcfeVar.zzd("onSdkLoaded", new C5308a());
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdH() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdk() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzds() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdv() {
    }
}
