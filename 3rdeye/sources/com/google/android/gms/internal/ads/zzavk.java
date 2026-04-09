package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzavk implements zzavn {
    private static zzavk zzb;
    private final Context zzc;
    private final zzfpm zzd;
    private final zzfpt zze;
    private final zzfpv zzf;
    private final zzawp zzg;
    private final zzfnz zzh;
    private final Executor zzi;
    private final zzfps zzj;
    private final zzaxe zzl;
    private final zzaww zzm;
    private final zzawn zzn;
    private volatile boolean zzp;
    private volatile boolean zzq;
    private final int zzr;
    volatile long zza = 0;
    private final Object zzo = new Object();
    private final CountDownLatch zzk = new CountDownLatch(1);

    public zzavk(Context context, zzfnz zzfnzVar, zzfpm zzfpmVar, zzfpt zzfptVar, zzfpv zzfpvVar, zzawp zzawpVar, Executor executor, zzfnu zzfnuVar, int i, zzaxe zzaxeVar, zzaww zzawwVar, zzawn zzawnVar) {
        this.zzq = false;
        this.zzc = context;
        this.zzh = zzfnzVar;
        this.zzd = zzfpmVar;
        this.zze = zzfptVar;
        this.zzf = zzfpvVar;
        this.zzg = zzawpVar;
        this.zzi = executor;
        this.zzr = i;
        this.zzl = zzaxeVar;
        this.zzm = zzawwVar;
        this.zzn = zzawnVar;
        this.zzq = false;
        this.zzj = new zzavi(this, zzfnuVar);
    }

    public static synchronized zzavk zza(Context context, zzarv zzarvVar, boolean z10) {
        zzfoa zzfoaVarZzc;
        zzfoaVarZzc = zzfob.zzc();
        zzfoaVarZzc.zza(zzarvVar.zzf());
        zzfoaVarZzc.zzg(zzarvVar.zzi());
        return zzs(context, Executors.newCachedThreadPool(), zzfoaVarZzc.zzh(), z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00fc A[Catch: all -> 0x009d, zzgzk -> 0x00a0, TryCatch #0 {zzgzk -> 0x00a0, blocks: (B:6:0x0021, B:8:0x0032, B:12:0x0038, B:13:0x0044, B:15:0x0052, B:17:0x0060, B:20:0x006d, B:32:0x00a3, B:36:0x00bc, B:42:0x00d5, B:43:0x00e2, B:45:0x00e8, B:47:0x00f0, B:48:0x00f2, B:39:0x00c6, B:40:0x00cd, B:23:0x0074, B:25:0x008a, B:49:0x00fc, B:50:0x0109, B:51:0x0116), top: B:58:0x0021, outer: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* bridge */ /* synthetic */ void zzj(com.google.android.gms.internal.ads.zzavk r12) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzavk.zzj(com.google.android.gms.internal.ads.zzavk):void");
    }

    private static synchronized zzavk zzs(Context context, Executor executor, zzfob zzfobVar, boolean z10) {
        try {
            if (zzb == null) {
                zzfnz zzfnzVarZza = zzfnz.zza(context, executor, z10);
                zzavy zzavyVarZzc = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzdE)).booleanValue() ? zzavy.zzc(context) : null;
                zzaxe zzaxeVarZzd = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzdF)).booleanValue() ? zzaxe.zzd(context, executor) : null;
                zzaww zzawwVar = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzcT)).booleanValue() ? new zzaww() : null;
                zzawn zzawnVar = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzdb)).booleanValue() ? new zzawn() : null;
                zzfoq zzfoqVarZzc = zzfoq.zzc(context, executor, zzfnzVarZza, zzfobVar);
                zzawo zzawoVar = new zzawo(context);
                zzawp zzawpVar = new zzawp(zzfobVar, zzfoqVarZzc, new zzaxc(context, zzawoVar), zzawoVar, zzavyVarZzc, zzaxeVarZzd, zzawwVar, zzawnVar);
                int iZzb = zzfoz.zzb(context, zzfnzVarZza);
                zzfnu zzfnuVar = new zzfnu();
                zzavk zzavkVar = new zzavk(context, zzfnzVarZza, new zzfpm(context, iZzb), new zzfpt(context, iZzb, new zzavh(zzfnzVarZza), ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzcD)).booleanValue()), new zzfpv(context, zzawpVar, zzfnzVarZza, zzfnuVar, false), zzawpVar, executor, zzfnuVar, iZzb, zzaxeVarZzd, zzawwVar, zzawnVar);
                zzb = zzavkVar;
                zzavkVar.zzm();
                zzb.zzp();
            }
        } catch (Throwable th) {
            throw th;
        }
        return zzb;
    }

    private final void zzt() {
        zzaxe zzaxeVar = this.zzl;
        if (zzaxeVar != null) {
            zzaxeVar.zzh();
        }
    }

    private final zzfpl zzu(int i) {
        if (zzfoz.zza(this.zzr)) {
            return ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzcB)).booleanValue() ? this.zze.zzc(1) : this.zzd.zzc(1);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzavn
    public final String zzd(Context context, String str, View view) {
        return zze(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzavn
    public final String zze(Context context, String str, View view, Activity activity) {
        zzt();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzcT)).booleanValue()) {
            this.zzm.zzi();
        }
        zzp();
        zzfoc zzfocVarZza = this.zzf.zza();
        if (zzfocVarZza == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strZza = zzfocVarZza.zza(context, null, str, view, activity);
        this.zzh.zzf(5000, System.currentTimeMillis() - jCurrentTimeMillis, strZza, null);
        return strZza;
    }

    @Override // com.google.android.gms.internal.ads.zzavn
    public final String zzf(Context context) {
        zzt();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzcT)).booleanValue()) {
            this.zzm.zzj();
        }
        zzp();
        zzfoc zzfocVarZza = this.zzf.zza();
        if (zzfocVarZza == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strZzc = zzfocVarZza.zzc(context, null);
        this.zzh.zzf(5001, System.currentTimeMillis() - jCurrentTimeMillis, strZzc, null);
        return strZzc;
    }

    @Override // com.google.android.gms.internal.ads.zzavn
    public final String zzg(Context context) {
        return "19";
    }

    @Override // com.google.android.gms.internal.ads.zzavn
    public final String zzh(Context context, View view, Activity activity) {
        zzt();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzcT)).booleanValue()) {
            this.zzm.zzk(context, view);
        }
        zzp();
        zzfoc zzfocVarZza = this.zzf.zza();
        if (zzfocVarZza == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strZzb = zzfocVarZza.zzb(context, null, view, activity);
        this.zzh.zzf(5002, System.currentTimeMillis() - jCurrentTimeMillis, strZzb, null);
        return strZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzavn
    public final void zzk(MotionEvent motionEvent) {
        zzfoc zzfocVarZza = this.zzf.zza();
        if (zzfocVarZza != null) {
            try {
                zzfocVarZza.zzd(null, motionEvent);
            } catch (zzfpu e4) {
                this.zzh.zzc(e4.zza(), -1L, e4);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzavn
    public final void zzl(int i, int i10, int i11) {
        DisplayMetrics displayMetrics;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzmj)).booleanValue() || (displayMetrics = this.zzc.getResources().getDisplayMetrics()) == null) {
            return;
        }
        float f10 = i;
        float f11 = displayMetrics.density;
        float f12 = i10;
        MotionEvent motionEventObtain = MotionEvent.obtain(0L, 0L, 0, f10 * f11, f12 * f11, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        zzk(motionEventObtain);
        motionEventObtain.recycle();
        float f13 = displayMetrics.density;
        MotionEvent motionEventObtain2 = MotionEvent.obtain(0L, 0L, 2, f10 * f13, f12 * f13, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        zzk(motionEventObtain2);
        motionEventObtain2.recycle();
        float f14 = displayMetrics.density;
        MotionEvent motionEventObtain3 = MotionEvent.obtain(0L, i11, 1, f10 * f14, f12 * f14, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        zzk(motionEventObtain3);
        motionEventObtain3.recycle();
    }

    public final synchronized void zzm() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        zzfpl zzfplVarZzu = zzu(1);
        if (zzfplVarZzu == null) {
            this.zzh.zzd(4013, System.currentTimeMillis() - jCurrentTimeMillis);
        } else if (this.zzf.zzc(zzfplVarZzu)) {
            this.zzq = true;
            this.zzk.countDown();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzavn
    public final void zzn(StackTraceElement[] stackTraceElementArr) {
        zzawn zzawnVar = this.zzn;
        if (zzawnVar != null) {
            zzawnVar.zzb(Arrays.asList(stackTraceElementArr));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzavn
    public final void zzo(View view) {
        this.zzg.zzd(view);
    }

    public final void zzp() {
        if (this.zzp) {
            return;
        }
        synchronized (this.zzo) {
            try {
                if (!this.zzp) {
                    if ((System.currentTimeMillis() / 1000) - this.zza < 3600) {
                        return;
                    }
                    zzfpl zzfplVarZzb = this.zzf.zzb();
                    if ((zzfplVarZzb == null || zzfplVarZzb.zzd(3600L)) && zzfoz.zza(this.zzr)) {
                        this.zzi.execute(new zzavj(this));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized boolean zzr() {
        return this.zzq;
    }
}
