package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzcbo {
    private final Context zza;
    private final zzcbz zzb;
    private final ViewGroup zzc;
    private final zzdsc zzd;
    private zzcbn zze;

    public zzcbo(Context context, ViewGroup viewGroup, zzcfe zzcfeVar, zzdsc zzdscVar) {
        this.zza = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzc = viewGroup;
        this.zzb = zzcfeVar;
        this.zze = null;
        this.zzd = zzdscVar;
    }

    public final zzcbn zza() {
        return this.zze;
    }

    public final Integer zzb() {
        zzcbn zzcbnVar = this.zze;
        if (zzcbnVar != null) {
            return zzcbnVar.zzl();
        }
        return null;
    }

    public final void zzc(int i, int i10, int i11, int i12) {
        Preconditions.checkMainThread("The underlay may only be modified from the UI thread.");
        zzcbn zzcbnVar = this.zze;
        if (zzcbnVar != null) {
            zzcbnVar.zzF(i, i10, i11, i12);
        }
    }

    public final void zzd(int i, int i10, int i11, int i12, int i13, boolean z10, zzcby zzcbyVar) {
        if (this.zze != null) {
            return;
        }
        zzcbz zzcbzVar = this.zzb;
        zzbdj.zza(zzcbzVar.zzl().zza(), zzcbzVar.zzk(), "vpr2");
        zzcbn zzcbnVar = new zzcbn(this.zza, zzcbzVar, i13, z10, zzcbzVar.zzl().zza(), zzcbyVar, this.zzd);
        this.zze = zzcbnVar;
        this.zzc.addView(zzcbnVar, 0, new ViewGroup.LayoutParams(-1, -1));
        this.zze.zzF(i, i10, i11, i12);
        zzcbzVar.zzz(false);
    }

    public final void zze() {
        Preconditions.checkMainThread("onDestroy must be called from the UI thread.");
        zzcbn zzcbnVar = this.zze;
        if (zzcbnVar != null) {
            zzcbnVar.zzq();
            this.zzc.removeView(this.zze);
            this.zze = null;
        }
    }

    public final void zzf() {
        Preconditions.checkMainThread("onPause must be called from the UI thread.");
        zzcbn zzcbnVar = this.zze;
        if (zzcbnVar != null) {
            zzcbnVar.zzu();
        }
    }

    public final void zzg(int i) {
        zzcbn zzcbnVar = this.zze;
        if (zzcbnVar != null) {
            zzcbnVar.zzC(i);
        }
    }
}
