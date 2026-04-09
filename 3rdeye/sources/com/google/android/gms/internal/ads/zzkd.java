package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.view.SurfaceHolder;
import android.view.TextureView;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzkd implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener, zzaci, zzqh, zzxn, zzuf, zzhw {
    public static final /* synthetic */ int zzb = 0;
    final /* synthetic */ zzkh zza;

    public /* synthetic */ zzkd(zzkh zzkhVar, zzkg zzkgVar) {
        this.zza = zzkhVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i10) {
        zzkh zzkhVar = this.zza;
        zzkh.zzP(zzkhVar, surfaceTexture);
        zzkhVar.zzac(i, i10);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        zzkh zzkhVar = this.zza;
        zzkhVar.zzae(null);
        zzkhVar.zzac(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i10) {
        this.zza.zzac(i, i10);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i10, int i11) {
        this.zza.zzac(i10, i11);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.zza.zzac(0, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzqh
    public final void zza(Exception exc) {
        this.zza.zzr.zzw(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzqh
    public final void zzb(String str, long j4, long j10) {
        this.zza.zzr.zzx(str, j4, j10);
    }

    @Override // com.google.android.gms.internal.ads.zzqh
    public final void zzc(String str) {
        this.zza.zzr.zzy(str);
    }

    @Override // com.google.android.gms.internal.ads.zzqh
    public final void zzd(zzid zzidVar) {
        this.zza.zzr.zzz(zzidVar);
    }

    @Override // com.google.android.gms.internal.ads.zzqh
    public final void zze(zzid zzidVar) {
        this.zza.zzr.zzA(zzidVar);
    }

    @Override // com.google.android.gms.internal.ads.zzqh
    public final void zzf(zzz zzzVar, zzie zzieVar) {
        this.zza.zzr.zzB(zzzVar, zzieVar);
    }

    @Override // com.google.android.gms.internal.ads.zzqh
    public final void zzg(long j4) {
        this.zza.zzr.zzC(j4);
    }

    @Override // com.google.android.gms.internal.ads.zzqh
    public final void zzh(final int i) {
        this.zza.zzA.zzf(new zzfut() { // from class: com.google.android.gms.internal.ads.zzjz
            @Override // com.google.android.gms.internal.ads.zzfut
            public final Object apply(Object obj) {
                return Integer.valueOf(i);
            }
        }, new zzfut() { // from class: com.google.android.gms.internal.ads.zzka
            @Override // com.google.android.gms.internal.ads.zzfut
            public final Object apply(Object obj) {
                return Integer.valueOf(i);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzqh
    public final void zzi(Exception exc) {
        this.zza.zzr.zzD(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzqh
    public final void zzj(zzqi zzqiVar) {
        this.zza.zzr.zzE(zzqiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzqh
    public final void zzk(zzqi zzqiVar) {
        this.zza.zzr.zzF(zzqiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzqh
    public final void zzl(int i, long j4, long j10) {
        this.zza.zzr.zzG(i, j4, j10);
    }

    @Override // com.google.android.gms.internal.ads.zzaci
    public final void zzm(int i, long j4) {
        this.zza.zzr.zzH(i, j4);
    }

    @Override // com.google.android.gms.internal.ads.zzaci
    public final void zzn(Object obj, long j4) {
        zzkh zzkhVar = this.zza;
        zzkhVar.zzr.zzI(obj, j4);
        if (zzkhVar.zzJ == obj) {
            zzdz zzdzVar = zzkhVar.zzm;
            zzdzVar.zzd(26, new zzdw() { // from class: com.google.android.gms.internal.ads.zzjy
                @Override // com.google.android.gms.internal.ads.zzdw
                public final void zza(Object obj2) {
                }
            });
            zzdzVar.zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqh
    public final void zzo(final boolean z10) {
        zzkh zzkhVar = this.zza;
        if (zzkhVar.zzP == z10) {
            return;
        }
        zzkhVar.zzP = z10;
        zzdz zzdzVar = zzkhVar.zzm;
        zzdzVar.zzd(23, new zzdw() { // from class: com.google.android.gms.internal.ads.zzkb
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj) {
                ((zzbe) obj).zzo(z10);
            }
        });
        zzdzVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzaci
    public final void zzp(Exception exc) {
        this.zza.zzr.zzK(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzaci
    public final void zzq(String str, long j4, long j10) {
        this.zza.zzr.zzL(str, j4, j10);
    }

    @Override // com.google.android.gms.internal.ads.zzaci
    public final void zzr(String str) {
        this.zza.zzr.zzM(str);
    }

    @Override // com.google.android.gms.internal.ads.zzaci
    public final void zzs(zzid zzidVar) {
        this.zza.zzr.zzN(zzidVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaci
    public final void zzt(zzid zzidVar) {
        this.zza.zzr.zzO(zzidVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaci
    public final void zzu(long j4, int i) {
        this.zza.zzr.zzP(j4, i);
    }

    @Override // com.google.android.gms.internal.ads.zzaci
    public final void zzv(zzz zzzVar, zzie zzieVar) {
        this.zza.zzr.zzQ(zzzVar, zzieVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaci
    public final void zzw(final zzcd zzcdVar) {
        zzdz zzdzVar = this.zza.zzm;
        zzdzVar.zzd(25, new zzdw() { // from class: com.google.android.gms.internal.ads.zzkc
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj) {
                ((zzbe) obj).zzs(zzcdVar);
            }
        });
        zzdzVar.zzc();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }
}
