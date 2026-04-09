package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzart;
import com.google.android.gms.internal.ads.zzarv;
import com.google.android.gms.internal.ads.zzavg;
import com.google.android.gms.internal.ads.zzavk;
import com.google.android.gms.internal.ads.zzavn;
import com.google.android.gms.internal.ads.zzavp;
import com.google.android.gms.internal.ads.zzavr;
import com.google.android.gms.internal.ads.zzbdc;
import com.google.android.gms.internal.ads.zzcad;
import com.google.android.gms.internal.ads.zzfnz;
import com.google.android.gms.internal.ads.zzfoz;
import com.google.android.gms.internal.ads.zzfpt;
import com.google.android.gms.internal.ads.zzgdb;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes.dex */
public final class zzk implements Runnable, zzavn {
    private static final long zzc = System.currentTimeMillis();
    protected boolean zza;
    private final boolean zzg;
    private final boolean zzh;
    private final Executor zzi;
    private final zzfnz zzj;
    private Context zzk;
    private final Context zzl;
    private VersionInfoParcel zzm;
    private final VersionInfoParcel zzn;
    private final boolean zzo;
    private int zzp;
    private final List zzd = new Vector();
    private final AtomicReference zze = new AtomicReference();
    private final AtomicReference zzf = new AtomicReference();
    final CountDownLatch zzb = new CountDownLatch(1);

    public zzk(Context context, VersionInfoParcel versionInfoParcel) {
        this.zzk = context;
        this.zzl = context;
        this.zzm = versionInfoParcel;
        this.zzn = versionInfoParcel;
        ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool();
        this.zzi = executorServiceNewCachedThreadPool;
        boolean zBooleanValue = ((Boolean) zzbd.zzc().zzb(zzbdc.zzcF)).booleanValue();
        this.zzo = zBooleanValue;
        this.zzj = zzfnz.zza(context, executorServiceNewCachedThreadPool, zBooleanValue);
        this.zzg = ((Boolean) zzbd.zzc().zzb(zzbdc.zzcC)).booleanValue();
        this.zzh = ((Boolean) zzbd.zzc().zzb(zzbdc.zzcG)).booleanValue();
        if (((Boolean) zzbd.zzc().zzb(zzbdc.zzcE)).booleanValue()) {
            this.zzp = 2;
        } else {
            this.zzp = 1;
        }
        if (!((Boolean) zzbd.zzc().zzb(zzbdc.zzdI)).booleanValue()) {
            this.zza = zzi();
        }
        if (((Boolean) zzbd.zzc().zzb(zzbdc.zzdC)).booleanValue()) {
            zzcad.zza.execute(this);
            return;
        }
        zzbb.zzb();
        if (com.google.android.gms.ads.internal.util.client.zzf.zzz()) {
            zzcad.zza.execute(this);
        } else {
            run();
        }
    }

    public static /* synthetic */ void zzc(zzk zzkVar, boolean z10) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            zzu(zzkVar.zzl, zzkVar.zzn, z10, zzkVar.zzo).zzp();
        } catch (NullPointerException e4) {
            zzkVar.zzj.zzc(2027, System.currentTimeMillis() - jCurrentTimeMillis, e4);
        }
    }

    private final zzavn zzq() {
        return zzm() == 2 ? (zzavn) this.zzf.get() : (zzavn) this.zze.get();
    }

    private final void zzr() {
        List<Object[]> list = this.zzd;
        zzavn zzavnVarZzq = zzq();
        if (list.isEmpty() || zzavnVarZzq == null) {
            return;
        }
        for (Object[] objArr : list) {
            int length = objArr.length;
            if (length == 1) {
                zzavnVarZzq.zzk((MotionEvent) objArr[0]);
            } else if (length == 3) {
                zzavnVarZzq.zzl(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
            }
        }
        list.clear();
    }

    private final void zzs(boolean z10) {
        String str = this.zzm.afmaVersion;
        Context contextZzt = zzt(this.zzk);
        zzart zzartVarZza = zzarv.zza();
        zzartVarZza.zza(z10);
        zzartVarZza.zzb(str);
        this.zze.set(zzavr.zzt(contextZzt, new zzavp((zzarv) zzartVarZza.zzbr())));
    }

    private static final Context zzt(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    private static final zzavk zzu(Context context, VersionInfoParcel versionInfoParcel, boolean z10, boolean z11) {
        zzart zzartVarZza = zzarv.zza();
        zzartVarZza.zza(z10);
        zzartVarZza.zzb(versionInfoParcel.afmaVersion);
        return zzavk.zza(zzt(context), (zzarv) zzartVarZza.zzbr(), z11);
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (((Boolean) zzbd.zzc().zzb(zzbdc.zzdI)).booleanValue()) {
                this.zza = zzi();
            }
            boolean z10 = this.zzm.isClientJar;
            final boolean z11 = false;
            if (!((Boolean) zzbd.zzc().zzb(zzbdc.zzbh)).booleanValue() && z10) {
                z11 = true;
            }
            if (zzm() == 1) {
                zzs(z11);
                if (this.zzp == 2) {
                    this.zzi.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.zzi
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzk.zzc(this.zza, z11);
                        }
                    });
                }
            } else {
                long jCurrentTimeMillis = System.currentTimeMillis();
                try {
                    zzavk zzavkVarZzu = zzu(this.zzk, this.zzm, z11, this.zzo);
                    this.zzf.set(zzavkVarZzu);
                    if (this.zzh && !zzavkVarZzu.zzr()) {
                        this.zzp = 1;
                        zzs(z11);
                    }
                } catch (NullPointerException e4) {
                    this.zzp = 1;
                    zzs(z11);
                    this.zzj.zzc(2031, System.currentTimeMillis() - jCurrentTimeMillis, e4);
                }
            }
            this.zzb.countDown();
            this.zzk = null;
            this.zzm = null;
        } catch (Throwable th) {
            this.zzb.countDown();
            this.zzk = null;
            this.zzm = null;
            throw th;
        }
    }

    public final String zzb(Context context, byte[] bArr) {
        zzavn zzavnVarZzq;
        if (!zzj() || (zzavnVarZzq = zzq()) == null) {
            return "";
        }
        zzr();
        return zzavnVarZzq.zzf(zzt(context));
    }

    @Override // com.google.android.gms.internal.ads.zzavn
    public final String zzd(Context context, String str, View view) {
        return zze(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzavn
    public final String zze(Context context, String str, View view, Activity activity) {
        if (!zzj()) {
            return "";
        }
        zzavn zzavnVarZzq = zzq();
        if (((Boolean) zzbd.zzc().zzb(zzbdc.zzkT)).booleanValue()) {
            zzv.zzr();
            com.google.android.gms.ads.internal.util.zzs.zzK(view, 4, null);
        }
        if (zzavnVarZzq == null) {
            return "";
        }
        zzr();
        return zzavnVarZzq.zze(zzt(context), str, view, activity);
    }

    @Override // com.google.android.gms.internal.ads.zzavn
    public final String zzf(Context context) {
        return zzb(context, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzavn
    public final String zzg(final Context context) {
        try {
            return (String) zzgdb.zzj(new Callable() { // from class: com.google.android.gms.ads.internal.zzh
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.zza.zzb(context, null);
                }
            }, this.zzi).get(((Integer) zzbd.zzc().zzb(zzbdc.zzcW)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException unused) {
            return Integer.toString(17);
        } catch (TimeoutException unused2) {
            return zzavg.zza(context, this.zzn.afmaVersion, zzc, true);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzavn
    public final String zzh(Context context, View view, Activity activity) {
        if (!((Boolean) zzbd.zzc().zzb(zzbdc.zzkS)).booleanValue()) {
            zzavn zzavnVarZzq = zzq();
            if (((Boolean) zzbd.zzc().zzb(zzbdc.zzkT)).booleanValue()) {
                zzv.zzr();
                com.google.android.gms.ads.internal.util.zzs.zzK(view, 2, null);
            }
            return zzavnVarZzq != null ? zzavnVarZzq.zzh(context, view, activity) : "";
        }
        if (!zzj()) {
            return "";
        }
        zzavn zzavnVarZzq2 = zzq();
        if (((Boolean) zzbd.zzc().zzb(zzbdc.zzkT)).booleanValue()) {
            zzv.zzr();
            com.google.android.gms.ads.internal.util.zzs.zzK(view, 2, null);
        }
        return zzavnVarZzq2 != null ? zzavnVarZzq2.zzh(context, view, activity) : "";
    }

    public final boolean zzi() {
        Context context = this.zzk;
        zzj zzjVar = new zzj(this);
        zzfnz zzfnzVar = this.zzj;
        return new zzfpt(this.zzk, zzfoz.zzb(context, zzfnzVar), zzjVar, ((Boolean) zzbd.zzc().zzb(zzbdc.zzcD)).booleanValue()).zzd(1);
    }

    public final boolean zzj() throws InterruptedException {
        try {
            this.zzb.await();
            return true;
        } catch (InterruptedException e4) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Interrupted during GADSignals creation.", e4);
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzavn
    public final void zzk(MotionEvent motionEvent) {
        zzavn zzavnVarZzq = zzq();
        if (zzavnVarZzq == null) {
            this.zzd.add(new Object[]{motionEvent});
        } else {
            zzr();
            zzavnVarZzq.zzk(motionEvent);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzavn
    public final void zzl(int i, int i10, int i11) {
        zzavn zzavnVarZzq = zzq();
        if (zzavnVarZzq == null) {
            this.zzd.add(new Object[]{Integer.valueOf(i), Integer.valueOf(i10), Integer.valueOf(i11)});
        } else {
            zzr();
            zzavnVarZzq.zzl(i, i10, i11);
        }
    }

    public final int zzm() {
        if (!this.zzg || this.zza) {
            return this.zzp;
        }
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzavn
    public final void zzn(StackTraceElement[] stackTraceElementArr) {
        zzavn zzavnVarZzq;
        zzavn zzavnVarZzq2;
        if (((Boolean) zzbd.zzc().zzb(zzbdc.zzdc)).booleanValue()) {
            if (this.zzb.getCount() != 0 || (zzavnVarZzq2 = zzq()) == null) {
                return;
            }
            zzavnVarZzq2.zzn(stackTraceElementArr);
            return;
        }
        if (!zzj() || (zzavnVarZzq = zzq()) == null) {
            return;
        }
        zzavnVarZzq.zzn(stackTraceElementArr);
    }

    @Override // com.google.android.gms.internal.ads.zzavn
    public final void zzo(View view) {
        zzavn zzavnVarZzq = zzq();
        if (zzavnVarZzq != null) {
            zzavnVarZzq.zzo(view);
        }
    }

    public final int zzp() {
        return this.zzp;
    }
}
