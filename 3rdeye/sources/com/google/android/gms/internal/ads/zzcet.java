package com.google.android.gms.internal.ads;

import B4.g;
import android.content.Context;
import android.net.Uri;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzcet extends zzcbf {
    private final zzcca zzc;
    private zzceu zzd;
    private Uri zze;
    private zzcbe zzf;
    private boolean zzg;
    private int zzh;

    public zzcet(Context context, zzcca zzccaVar) {
        super(context);
        this.zzh = 1;
        this.zzg = false;
        this.zzc = zzccaVar;
        zzccaVar.zza(this);
    }

    public static /* synthetic */ void zzi(zzcet zzcetVar) {
        zzcbe zzcbeVar = zzcetVar.zzf;
        if (zzcbeVar != null) {
            if (!zzcetVar.zzg) {
                zzcbeVar.zzg();
                zzcetVar.zzg = true;
            }
            zzcetVar.zzf.zze();
        }
    }

    public static /* synthetic */ void zzk(zzcet zzcetVar) {
        zzcbe zzcbeVar = zzcetVar.zzf;
        if (zzcbeVar != null) {
            zzcbeVar.zzd();
        }
    }

    public static /* synthetic */ void zzl(zzcet zzcetVar) {
        zzcbe zzcbeVar = zzcetVar.zzf;
        if (zzcbeVar != null) {
            zzcbeVar.zzf();
        }
    }

    private final boolean zzm() {
        int i = this.zzh;
        return (i == 1 || i == 2 || this.zzd == null) ? false : true;
    }

    private final void zzv(int i) {
        if (i == 4) {
            this.zzc.zzc();
            this.zzb.zzb();
        } else if (this.zzh == 4) {
            this.zzc.zze();
            this.zzb.zzc();
        }
        this.zzh = i;
    }

    @Override // android.view.View
    public final String toString() {
        return g.o(zzcet.class.getName(), "@", Integer.toHexString(hashCode()));
    }

    @Override // com.google.android.gms.internal.ads.zzcbf
    public final int zza() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcbf
    public final int zzb() {
        return zzm() ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcbf
    public final int zzc() {
        return zzm() ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcbf
    public final int zzd() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcbf
    public final int zze() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcbf
    public final long zzf() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcbf
    public final long zzg() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcbf
    public final long zzh() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcbf
    public final String zzj() {
        return "ImmersivePlayer";
    }

    @Override // com.google.android.gms.internal.ads.zzcbf, com.google.android.gms.internal.ads.zzccc
    public final void zzn() {
        if (this.zzd != null) {
            this.zzb.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbf
    public final void zzo() {
        com.google.android.gms.ads.internal.util.zze.zza("AdImmersivePlayerView pause");
        if (zzm() && this.zzd.zzd()) {
            this.zzd.zza();
            zzv(5);
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzces
                @Override // java.lang.Runnable
                public final void run() {
                    zzcet.zzk(this.zza);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbf
    public final void zzp() {
        com.google.android.gms.ads.internal.util.zze.zza("AdImmersivePlayerView play");
        if (zzm()) {
            this.zzd.zzb();
            zzv(4);
            this.zza.zzb();
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcer
                @Override // java.lang.Runnable
                public final void run() {
                    zzcet.zzi(this.zza);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbf
    public final void zzq(int i) {
        com.google.android.gms.ads.internal.util.zze.zza("AdImmersivePlayerView seek " + i);
    }

    @Override // com.google.android.gms.internal.ads.zzcbf
    public final void zzr(zzcbe zzcbeVar) {
        this.zzf = zzcbeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcbf
    public final void zzs(String str) {
        if (str != null) {
            Uri uri = Uri.parse(str);
            this.zze = uri;
            this.zzd = new zzceu(uri.toString());
            zzv(3);
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzceq
                @Override // java.lang.Runnable
                public final void run() {
                    zzcet.zzl(this.zza);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbf
    public final void zzt() {
        com.google.android.gms.ads.internal.util.zze.zza("AdImmersivePlayerView stop");
        zzceu zzceuVar = this.zzd;
        if (zzceuVar != null) {
            zzceuVar.zzc();
            this.zzd = null;
            zzv(1);
        }
        this.zzc.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzcbf
    public final void zzu(float f10, float f11) {
    }
}
