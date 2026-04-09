package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.common.util.Clock;
import com.vungle.ads.internal.presenter.g;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.impl.Oo;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzcdu extends zzcdl implements zzcbp {
    public static final /* synthetic */ int zzd = 0;
    private zzcbq zze;
    private String zzf;
    private boolean zzg;
    private boolean zzh;
    private zzcdd zzi;
    private long zzj;
    private long zzk;

    public zzcdu(zzcbz zzcbzVar, zzcby zzcbyVar) {
        super(zzcbzVar);
        zzcem zzcemVar = new zzcem(zzcbzVar.getContext(), zzcbyVar, (zzcbz) this.zzc.get(), null);
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("ExoPlayerAdapter initialized.");
        this.zze = zzcemVar;
        zzcemVar.zzL(this);
    }

    public static /* synthetic */ void zzb(zzcdu zzcduVar) {
        long jLongValue;
        long jIntValue;
        boolean zBooleanValue;
        long j4;
        long j10;
        long j11;
        String strZzc = zzc(zzcduVar.zzf);
        try {
            jLongValue = ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzN)).longValue() * 1000;
            jIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzt)).intValue();
            zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzca)).booleanValue();
        } catch (Exception e4) {
            String strF = Oo.f("Failed to preload url ", zzcduVar.zzf, " Exception: ", e4.getMessage());
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj(strF);
            com.google.android.gms.ads.internal.zzv.zzp().zzv(e4, "VideoStreamExoPlayerCache.preload");
            zzcduVar.release();
            zzcduVar.zzg(zzcduVar.zzf, strZzc, g.ERROR, zzd(g.ERROR, e4));
        }
        synchronized (zzcduVar) {
            try {
                if (com.google.android.gms.ads.internal.zzv.zzD().currentTimeMillis() - zzcduVar.zzj > jLongValue) {
                    throw new IOException("Timeout reached. Limit: " + jLongValue + " ms");
                }
                if (zzcduVar.zzg) {
                    throw new IOException("Abort requested before buffering finished. ");
                }
                if (!zzcduVar.zzh) {
                    if (!zzcduVar.zze.zzV()) {
                        throw new IOException("ExoPlayer was released during preloading.");
                    }
                    long jZzz = zzcduVar.zze.zzz();
                    if (jZzz > 0) {
                        long jZzv = zzcduVar.zze.zzv();
                        if (jZzv != zzcduVar.zzk) {
                            j10 = jZzz;
                            j11 = jZzv;
                            j4 = jIntValue;
                            zzcduVar.zzo(zzcduVar.zzf, strZzc, j11, j10, jZzv > 0, zBooleanValue ? zzcduVar.zze.zzA() : -1L, zBooleanValue ? zzcduVar.zze.zzx() : -1L, zBooleanValue ? zzcduVar.zze.zzB() : -1L, zzcbq.zzs(), zzcbq.zzu());
                            zzcduVar.zzk = j11;
                        } else {
                            j4 = jIntValue;
                            j10 = jZzz;
                            j11 = jZzv;
                        }
                        if (j11 >= j10) {
                            zzcduVar.zzj(zzcduVar.zzf, strZzc, j10);
                        } else if (zzcduVar.zze.zzw() >= j4 && j11 > 0) {
                        }
                    }
                    zzcduVar.zzx(((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzO)).longValue());
                    return;
                }
                com.google.android.gms.ads.internal.zzv.zzA().zzc(zzcduVar.zzi);
            } finally {
            }
        }
    }

    public static final String zzc(String str) {
        return "cache:".concat(String.valueOf(com.google.android.gms.ads.internal.util.client.zzf.zzk(str)));
    }

    private static String zzd(String str, Exception exc) {
        return str + "/" + exc.getClass().getCanonicalName() + StringUtils.PROCESS_POSTFIX_DELIMITER + exc.getMessage();
    }

    private final void zzx(long j4) {
        com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcdt
            @Override // java.lang.Runnable
            public final void run() {
                zzcdu.zzb(this.zza);
            }
        }, j4);
    }

    @Override // com.google.android.gms.internal.ads.zzcdl, com.google.android.gms.common.api.Releasable
    public final void release() {
        zzcbq zzcbqVar = this.zze;
        if (zzcbqVar != null) {
            zzcbqVar.zzL(null);
            this.zze.zzH();
        }
    }

    public final zzcbq zza() {
        synchronized (this) {
            this.zzh = true;
            notify();
        }
        this.zze.zzL(null);
        zzcbq zzcbqVar = this.zze;
        this.zze = null;
        return zzcbqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcdl
    public final void zzf() {
        synchronized (this) {
            this.zzg = true;
            notify();
            release();
        }
        String str = this.zzf;
        if (str != null) {
            zzg(this.zzf, zzc(str), "externalAbort", "Programmatic precache abort.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final void zzi(final boolean z10, final long j4) {
        final zzcbz zzcbzVar = (zzcbz) this.zzc.get();
        if (zzcbzVar != null) {
            zzcad.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcds
                @Override // java.lang.Runnable
                public final void run() {
                    zzcbzVar.zzv(z10, j4);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final void zzk(String str, Exception exc) {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzk("Precache error", exc);
        com.google.android.gms.ads.internal.zzv.zzp().zzv(exc, "VideoStreamExoPlayerCache.onError");
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final void zzl(String str, Exception exc) {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzk("Precache exception", exc);
        com.google.android.gms.ads.internal.zzv.zzp().zzv(exc, "VideoStreamExoPlayerCache.onException");
    }

    @Override // com.google.android.gms.internal.ads.zzcdl
    public final void zzp(int i) {
        this.zze.zzJ(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcdl
    public final void zzq(int i) {
        this.zze.zzK(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcdl
    public final void zzr(int i) {
        this.zze.zzM(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcdl
    public final void zzs(int i) {
        this.zze.zzN(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcdl
    public final boolean zzt(String str) {
        return zzu(str, new String[]{str});
    }

    @Override // com.google.android.gms.internal.ads.zzcdl
    public final boolean zzu(String str, String[] strArr) {
        long j4;
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        boolean z10;
        this.zzf = str;
        String strZzc = zzc(str);
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                uriArr[i] = Uri.parse(strArr[i]);
            }
            this.zze.zzF(uriArr, this.zzb);
            zzcbz zzcbzVar = (zzcbz) this.zzc.get();
            if (zzcbzVar != null) {
                zzcbzVar.zzt(strZzc, this);
            }
            Clock clockZzD = com.google.android.gms.ads.internal.zzv.zzD();
            long jCurrentTimeMillis = clockZzD.currentTimeMillis();
            long jLongValue = ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzO)).longValue();
            long jLongValue2 = ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzN)).longValue() * 1000;
            long jIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzt)).intValue();
            boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzca)).booleanValue();
            long j15 = -1;
            while (true) {
                synchronized (this) {
                    try {
                        if (clockZzD.currentTimeMillis() - jCurrentTimeMillis > jLongValue2) {
                            throw new IOException("Timeout reached. Limit: " + jLongValue2 + " ms");
                        }
                        if (this.zzg) {
                            throw new IOException("Abort requested before buffering finished. ");
                        }
                        if (!this.zzh) {
                            if (!this.zze.zzV()) {
                                throw new IOException("ExoPlayer was released during preloading.");
                            }
                            long jZzz = this.zze.zzz();
                            if (jZzz > 0) {
                                long jZzv = this.zze.zzv();
                                if (jZzv != j15) {
                                    if (jZzv > 0) {
                                        j14 = jIntValue;
                                        z10 = true;
                                    } else {
                                        j14 = jIntValue;
                                        z10 = false;
                                    }
                                    long j16 = jLongValue;
                                    j13 = jZzv;
                                    long jZzA = zBooleanValue ? this.zze.zzA() : -1L;
                                    j10 = j14;
                                    j4 = jLongValue2;
                                    j12 = jZzz;
                                    j11 = j16;
                                    zzo(str, strZzc, j13, j12, z10, jZzA, zBooleanValue ? this.zze.zzx() : -1L, zBooleanValue ? this.zze.zzB() : -1L, zzcbq.zzs(), zzcbq.zzu());
                                    j15 = j13;
                                } else {
                                    j11 = jLongValue;
                                    j4 = jLongValue2;
                                    j10 = jIntValue;
                                    j12 = jZzz;
                                    j13 = jZzv;
                                }
                                if (j13 >= j12) {
                                    zzj(str, strZzc, j12);
                                } else if (this.zze.zzw() < j10 || j13 <= 0) {
                                    jLongValue = j11;
                                }
                            } else {
                                j4 = jLongValue2;
                                j10 = jIntValue;
                            }
                            try {
                                wait(jLongValue);
                            } catch (InterruptedException unused) {
                                throw new IOException("Wait interrupted.");
                            }
                        }
                    } finally {
                    }
                }
                jIntValue = j10;
                jLongValue2 = j4;
            }
            return true;
        } catch (Exception e4) {
            String strF = Oo.f("Failed to preload url ", str, " Exception: ", e4.getMessage());
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj(strF);
            com.google.android.gms.ads.internal.zzv.zzp().zzv(e4, "VideoStreamExoPlayerCache.preload");
            release();
            zzg(str, strZzc, g.ERROR, zzd(g.ERROR, e4));
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final void zzv() {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzj("Precache onRenderedFirstFrame");
    }

    @Override // com.google.android.gms.internal.ads.zzcdl
    public final boolean zzw(String str, String[] strArr, zzcdd zzcddVar) {
        this.zzf = str;
        this.zzi = zzcddVar;
        String strZzc = zzc(str);
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                uriArr[i] = Uri.parse(strArr[i]);
            }
            this.zze.zzF(uriArr, this.zzb);
            zzcbz zzcbzVar = (zzcbz) this.zzc.get();
            if (zzcbzVar != null) {
                zzcbzVar.zzt(strZzc, this);
            }
            this.zzj = com.google.android.gms.ads.internal.zzv.zzD().currentTimeMillis();
            this.zzk = -1L;
            zzx(0L);
            return true;
        } catch (Exception e4) {
            String strF = Oo.f("Failed to preload url ", str, " Exception: ", e4.getMessage());
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj(strF);
            com.google.android.gms.ads.internal.zzv.zzp().zzv(e4, "VideoStreamExoPlayerCache.preload");
            release();
            zzg(str, strZzc, g.ERROR, zzd(g.ERROR, e4));
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final void zzm(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final void zzD(int i, int i10) {
    }
}
