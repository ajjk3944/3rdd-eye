package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzfmh implements zzfma {
    private static zzfmh zza;
    private float zzb = 0.0f;
    private zzflv zzc;
    private zzflz zzd;

    public zzfmh(zzflw zzflwVar, zzflt zzfltVar) {
    }

    public static zzfmh zzb() {
        if (zza == null) {
            zza = new zzfmh(new zzflw(), new zzflt());
        }
        return zza;
    }

    public final float zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfma
    public final void zzc(boolean z10) {
        if (z10) {
            zzfnj.zzd().zzi();
        } else {
            zzfnj.zzd().zzh();
        }
    }

    public final void zzd(Context context) {
        this.zzc = new zzflv(new Handler(), context, new zzfls(), this);
    }

    public final void zze(float f10) {
        this.zzb = f10;
        if (this.zzd == null) {
            this.zzd = zzflz.zza();
        }
        Iterator it = this.zzd.zzb().iterator();
        while (it.hasNext()) {
            ((zzflh) it.next()).zzg().zzl(f10);
        }
    }

    public final void zzf() {
        zzfly.zza().zze(this);
        zzfly.zza().zzf();
        zzfnj.zzd().zzi();
        this.zzc.zzc();
    }

    public final void zzg() {
        zzfnj.zzd().zzj();
        zzfly.zza().zzg();
        this.zzc.zzd();
    }
}
