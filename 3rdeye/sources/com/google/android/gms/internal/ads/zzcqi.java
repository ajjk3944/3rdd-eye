package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Iterator;
import m0.C5308a;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzcqi implements zzcxf, zzcwl {
    private final Context zza;
    private final zzcfe zzb;
    private final zzfbt zzc;
    private final VersionInfoParcel zzd;
    private zzecz zze;
    private boolean zzf;
    private final zzecx zzg;

    public zzcqi(Context context, zzcfe zzcfeVar, zzfbt zzfbtVar, VersionInfoParcel versionInfoParcel, zzecx zzecxVar) {
        this.zza = context;
        this.zzb = zzcfeVar;
        this.zzc = zzfbtVar;
        this.zzd = versionInfoParcel;
        this.zzg = zzecxVar;
    }

    private final synchronized void zza() {
        zzcfe zzcfeVar;
        zzecw zzecwVar;
        zzecv zzecvVar;
        try {
            zzfbt zzfbtVar = this.zzc;
            if (zzfbtVar.zzT && (zzcfeVar = this.zzb) != null) {
                if (com.google.android.gms.ads.internal.zzv.zzC().zzl(this.zza)) {
                    VersionInfoParcel versionInfoParcel = this.zzd;
                    String str = versionInfoParcel.buddyApkVersion + "." + versionInfoParcel.clientJarVersion;
                    zzfcr zzfcrVar = zzfbtVar.zzV;
                    String strZza = zzfcrVar.zza();
                    if (zzfcrVar.zzc() == 1) {
                        zzecvVar = zzecv.VIDEO;
                        zzecwVar = zzecw.DEFINED_BY_JAVASCRIPT;
                    } else {
                        int i = zzfbtVar.zze;
                        zzecv zzecvVar2 = zzecv.HTML_DISPLAY;
                        zzecwVar = i == 1 ? zzecw.ONE_PIXEL : zzecw.BEGIN_TO_RENDER;
                        zzecvVar = zzecvVar2;
                    }
                    zzecz zzeczVarZza = com.google.android.gms.ads.internal.zzv.zzC().zza(str, zzcfeVar.zzG(), "", "javascript", strZza, zzecwVar, zzecvVar, zzfbtVar.zzal);
                    this.zze = zzeczVarZza;
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
                        zzcfeVar.zzat(this.zze);
                        com.google.android.gms.ads.internal.zzv.zzC().zzk(zzfldVarZza);
                        this.zzf = true;
                        zzcfeVar.zzd("onSdkLoaded", new C5308a());
                    }
                }
            }
        } finally {
        }
    }

    private final boolean zzb() {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzfx)).booleanValue() && this.zzg.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzcwl
    public final synchronized void zzs() {
        zzcfe zzcfeVar;
        if (zzb()) {
            this.zzg.zzb();
            return;
        }
        if (!this.zzf) {
            zza();
        }
        if (!this.zzc.zzT || this.zze == null || (zzcfeVar = this.zzb) == null) {
            return;
        }
        zzcfeVar.zzd("onSdkImpression", new C5308a());
    }

    @Override // com.google.android.gms.internal.ads.zzcxf
    public final synchronized void zzt() {
        if (zzb()) {
            this.zzg.zzc();
        } else {
            if (this.zzf) {
                return;
            }
            zza();
        }
    }
}
