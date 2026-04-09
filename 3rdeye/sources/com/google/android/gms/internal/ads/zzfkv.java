package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.ClientApi;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public abstract class zzfkv {
    protected final ClientApi zza;
    protected final Context zzb;
    protected final int zzc;
    protected final zzbpo zzd;
    protected com.google.android.gms.ads.internal.client.zzfv zze;
    protected AtomicBoolean zzf;
    protected com.google.android.gms.ads.internal.client.zzch zzg;
    private com.google.android.gms.ads.internal.client.zzce zzh;
    private final Queue zzi;
    private final zzfjy zzj;
    private final String zzk;
    private AtomicBoolean zzl;
    private final ScheduledExecutorService zzm;
    private AtomicBoolean zzn;
    private AtomicBoolean zzo;
    private zzfkd zzp;
    private final Clock zzq;
    private final zzfkl zzr;

    public zzfkv(ClientApi clientApi, Context context, int i, zzbpo zzbpoVar, com.google.android.gms.ads.internal.client.zzfv zzfvVar, com.google.android.gms.ads.internal.client.zzce zzceVar, ScheduledExecutorService scheduledExecutorService, zzfjy zzfjyVar, Clock clock) {
        this("none", clientApi, context, i, zzbpoVar, zzfvVar, scheduledExecutorService, zzfjyVar, clock);
        this.zzh = zzceVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String zzD() {
        return true != "none".equals(this.zzk) ? "2" : "1";
    }

    private final synchronized void zzE(Object obj) {
        try {
            Clock clock = this.zzq;
            zzfkm zzfkmVar = new zzfkm(obj, clock);
            this.zzi.add(zzfkmVar);
            com.google.android.gms.ads.internal.client.zzea zzeaVarZza = zza(obj);
            long jCurrentTimeMillis = clock.currentTimeMillis();
            if (this.zzn.get()) {
                com.google.android.gms.ads.internal.util.zzs.zza.post(new zzfkq(this, zzeaVarZza));
            }
            ScheduledExecutorService scheduledExecutorService = this.zzm;
            scheduledExecutorService.execute(new zzfkr(this, jCurrentTimeMillis, zzeaVarZza));
            scheduledExecutorService.schedule(new zzfkp(this), zzfkmVar.zza(), TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzF(Throwable th) {
        try {
            this.zzl.set(false);
            if ((th instanceof zzfjs) && ((zzfjs) th).zza() == 0) {
                throw null;
            }
            zzN(true);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzG(Object obj) {
        try {
            this.zzl.set(false);
            if (obj != null) {
                this.zzj.zzc();
                this.zzo.set(true);
                zzE(obj);
            }
            zzN(obj == null);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0028 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0018 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void zzH(com.google.android.gms.ads.internal.client.zzea r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.ads.internal.client.zzce r0 = r2.zzh     // Catch: java.lang.Throwable -> Lb
            if (r0 == 0) goto L14
            com.google.android.gms.ads.internal.client.zzfv r1 = r2.zze     // Catch: java.lang.Throwable -> Lb android.os.RemoteException -> Ld
            r0.zze(r1)     // Catch: java.lang.Throwable -> Lb android.os.RemoteException -> Ld
            goto L14
        Lb:
            r3 = move-exception
            goto L2a
        Ld:
            int r0 = com.google.android.gms.ads.internal.util.zze.zza     // Catch: java.lang.Throwable -> Lb
            java.lang.String r0 = "Failed to call onAdsAvailable"
            com.google.android.gms.ads.internal.util.client.zzo.zzj(r0)     // Catch: java.lang.Throwable -> Lb
        L14:
            com.google.android.gms.ads.internal.client.zzch r0 = r2.zzg     // Catch: java.lang.Throwable -> Lb
            if (r0 == 0) goto L28
            java.lang.String r1 = r2.zzk     // Catch: java.lang.Throwable -> Lb android.os.RemoteException -> L1f
            r0.zzf(r1, r3)     // Catch: java.lang.Throwable -> Lb android.os.RemoteException -> L1f
            monitor-exit(r2)
            return
        L1f:
            int r3 = com.google.android.gms.ads.internal.util.zze.zza     // Catch: java.lang.Throwable -> Lb
            java.lang.String r3 = "Failed to call onAdPreloaded"
            com.google.android.gms.ads.internal.util.client.zzo.zzj(r3)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r2)
            return
        L28:
            monitor-exit(r2)
            return
        L2a:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lb
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfkv.zzH(com.google.android.gms.ads.internal.client.zzea):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0028 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0018 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void zzI() {
        /*
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.ads.internal.client.zzce r0 = r2.zzh     // Catch: java.lang.Throwable -> Lb
            if (r0 == 0) goto L14
            com.google.android.gms.ads.internal.client.zzfv r1 = r2.zze     // Catch: java.lang.Throwable -> Lb android.os.RemoteException -> Ld
            r0.zzf(r1)     // Catch: java.lang.Throwable -> Lb android.os.RemoteException -> Ld
            goto L14
        Lb:
            r0 = move-exception
            goto L2a
        Ld:
            int r0 = com.google.android.gms.ads.internal.util.zze.zza     // Catch: java.lang.Throwable -> Lb
            java.lang.String r0 = "Failed to call onAdsExhausted"
            com.google.android.gms.ads.internal.util.client.zzo.zzj(r0)     // Catch: java.lang.Throwable -> Lb
        L14:
            com.google.android.gms.ads.internal.client.zzch r0 = r2.zzg     // Catch: java.lang.Throwable -> Lb
            if (r0 == 0) goto L28
            java.lang.String r1 = r2.zzk     // Catch: java.lang.Throwable -> Lb android.os.RemoteException -> L1f
            r0.zzg(r1)     // Catch: java.lang.Throwable -> Lb android.os.RemoteException -> L1f
            monitor-exit(r2)
            return
        L1f:
            int r0 = com.google.android.gms.ads.internal.util.zze.zza     // Catch: java.lang.Throwable -> Lb
            java.lang.String r0 = "Failed to call onAdsExhausted"
            com.google.android.gms.ads.internal.util.client.zzo.zzj(r0)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r2)
            return
        L28:
            monitor-exit(r2)
            return
        L2a:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lb
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfkv.zzI():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzJ(com.google.android.gms.ads.internal.client.zze zzeVar) {
        com.google.android.gms.ads.internal.client.zzch zzchVar = this.zzg;
        if (zzchVar != null) {
            try {
                zzchVar.zze(this.zzk, zzeVar);
            } catch (RemoteException unused) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to call onAdFailedToPreload");
            }
        }
    }

    private final synchronized void zzK() {
        try {
            if (this.zzo.get() && this.zzi.isEmpty()) {
                this.zzo.set(false);
                if (this.zzn.get()) {
                    com.google.android.gms.ads.internal.util.zzs.zza.post(new zzfkt(this));
                }
                this.zzm.execute(new zzfku(this));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzL(com.google.android.gms.ads.internal.client.zze zzeVar) {
        try {
            if (this.zzn.get()) {
                com.google.android.gms.ads.internal.util.zzs.zza.post(new zzfks(this, zzeVar));
            }
            this.zzl.set(false);
            int i = zzeVar.zza;
            if (i != 1 && i != 8 && i != 10 && i != 11) {
                zzN(true);
                return;
            }
            com.google.android.gms.ads.internal.client.zzfv zzfvVar = this.zze;
            String str = "Preloading " + zzfvVar.zzb + ", for adUnitId:" + zzfvVar.zza + ", Ad load failed. Stop preloading due to non-retriable error:";
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi(str);
            this.zzf.set(false);
            zzfkj zzfkjVar = new zzfkj(this.zze.zza, zze());
            zzfkjVar.zzb(this.zzk);
            this.zzp.zzk(this.zzq.currentTimeMillis(), new zzfkl(zzfkjVar, null), zzeVar, this.zze.zzd, zzd(), zzD());
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized void zzM() {
        Iterator it = this.zzi.iterator();
        while (it.hasNext()) {
            if (((zzfkm) it.next()).zzd()) {
                it.remove();
            }
        }
    }

    private final synchronized void zzN(boolean z10) {
        try {
            zzfjy zzfjyVar = this.zzj;
            if (zzfjyVar.zze()) {
                return;
            }
            if (z10) {
                zzfjyVar.zzb();
            }
            this.zzm.schedule(new zzfkp(this), zzfjyVar.zza(), TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String zzO(com.google.android.gms.ads.internal.client.zzea zzeaVar) {
        if (zzeaVar instanceof zzcvk) {
            return ((zzcvk) zzeaVar).zzl();
        }
        return null;
    }

    public static /* bridge */ /* synthetic */ double zzc(zzfkv zzfkvVar, com.google.android.gms.ads.internal.client.zzea zzeaVar) {
        if (zzeaVar instanceof zzcvk) {
            return ((zzcvk) zzeaVar).zzc();
        }
        return 0.0d;
    }

    public final void zzA() {
        this.zzf.set(false);
        this.zzn.set(false);
    }

    public final void zzB(int i) {
        Preconditions.checkArgument(i > 0);
        AdFormat adFormat = AdFormat.getAdFormat(this.zze.zzb);
        int i10 = this.zze.zzd;
        synchronized (this) {
            try {
                com.google.android.gms.ads.internal.client.zzfv zzfvVar = this.zze;
                this.zze = new com.google.android.gms.ads.internal.client.zzfv(zzfvVar.zza, zzfvVar.zzb, zzfvVar.zzc, i > 0 ? i : zzfvVar.zzd);
                Queue queue = this.zzi;
                if (queue.size() > i) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzu)).booleanValue()) {
                        ArrayList arrayList = new ArrayList();
                        for (int i11 = 0; i11 < i; i11++) {
                            zzfkm zzfkmVar = (zzfkm) queue.poll();
                            if (zzfkmVar != null) {
                                arrayList.add(zzfkmVar);
                            }
                        }
                        queue.clear();
                        queue.addAll(arrayList);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zzfkd zzfkdVar = this.zzp;
        if (zzfkdVar == null || adFormat == null) {
            return;
        }
        zzfkdVar.zza(i10, i, this.zzq.currentTimeMillis(), new zzfkl(new zzfkj(this.zze.zza, adFormat), null));
    }

    public final synchronized boolean zzC() {
        zzM();
        return !this.zzi.isEmpty();
    }

    public abstract com.google.android.gms.ads.internal.client.zzea zza(Object obj);

    public abstract A4.a zzb(Context context);

    public final synchronized int zzd() {
        return this.zzi.size();
    }

    public final AdFormat zze() {
        return AdFormat.getAdFormat(this.zze.zzb);
    }

    public final synchronized zzfkv zzh() {
        this.zzm.submit(new zzfkp(this));
        return this;
    }

    public final synchronized Object zzj() {
        zzfkm zzfkmVar = (zzfkm) this.zzi.peek();
        if (zzfkmVar == null) {
            return null;
        }
        return zzfkmVar.zzc();
    }

    public final synchronized Object zzk() {
        try {
            this.zzj.zzc();
            Queue queue = this.zzi;
            zzfkm zzfkmVar = (zzfkm) queue.poll();
            this.zzo.set(zzfkmVar != null);
            if (zzfkmVar == null) {
                zzfkmVar = null;
            } else if (!queue.isEmpty()) {
                zzfkm zzfkmVar2 = (zzfkm) queue.peek();
                AdFormat adFormat = AdFormat.getAdFormat(this.zze.zzb);
                String strZzO = zzO(zza(zzfkmVar.zzc()));
                if (zzfkmVar2 != null && adFormat != null && strZzO != null && zzfkmVar2.zzb() < zzfkmVar.zzb()) {
                    this.zzp.zzn(this.zzq.currentTimeMillis(), this.zze.zzd, zzd(), strZzO, this.zzr, zzD());
                }
            }
            zzw();
            if (zzfkmVar == null) {
                return null;
            }
            return zzfkmVar.zzc();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final String zzn() {
        return this.zzk;
    }

    public final synchronized String zzo() {
        Object objZzj;
        objZzj = zzj();
        return zzO(objZzj == null ? null : zza(objZzj));
    }

    public final void zzv() {
        this.zzi.clear();
    }

    public final synchronized void zzw() {
        A4.a aVarZzb;
        try {
            zzM();
            zzK();
            if (!this.zzl.get() && this.zzf.get() && this.zzi.size() < this.zze.zzd) {
                this.zzl.set(true);
                Activity activityZza = com.google.android.gms.ads.internal.zzv.zzb().zza();
                if (activityZza == null) {
                    String strValueOf = String.valueOf(this.zze.zza);
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzj("Empty activity context at preloading: ".concat(strValueOf));
                    aVarZzb = zzb(this.zzb);
                } else {
                    aVarZzb = zzb(activityZza);
                }
                zzgdb.zzr(aVarZzb, new zzfkn(this), this.zzm);
            }
        } finally {
        }
    }

    public final synchronized void zzx(int i) {
        Preconditions.checkArgument(i >= 5);
        this.zzj.zzd(i);
    }

    public final synchronized void zzy() {
        this.zzf.set(true);
        this.zzn.set(true);
        this.zzm.submit(new zzfkp(this));
    }

    public final void zzz(zzfkd zzfkdVar) {
        this.zzp = zzfkdVar;
    }

    public zzfkv(String str, ClientApi clientApi, Context context, int i, zzbpo zzbpoVar, com.google.android.gms.ads.internal.client.zzfv zzfvVar, com.google.android.gms.ads.internal.client.zzch zzchVar, ScheduledExecutorService scheduledExecutorService, zzfjy zzfjyVar, Clock clock) {
        this(str, clientApi, context, i, zzbpoVar, zzfvVar, scheduledExecutorService, zzfjyVar, clock);
        this.zzg = zzchVar;
    }

    private zzfkv(String str, ClientApi clientApi, Context context, int i, zzbpo zzbpoVar, com.google.android.gms.ads.internal.client.zzfv zzfvVar, ScheduledExecutorService scheduledExecutorService, zzfjy zzfjyVar, Clock clock) {
        this.zzk = str;
        this.zza = clientApi;
        this.zzb = context;
        this.zzc = i;
        this.zzd = zzbpoVar;
        this.zze = zzfvVar;
        this.zzi = new PriorityQueue(Math.max(1, zzfvVar.zzd), new zzfko(this));
        this.zzf = new AtomicBoolean(true);
        this.zzl = new AtomicBoolean(false);
        this.zzm = scheduledExecutorService;
        this.zzj = zzfjyVar;
        this.zzn = new AtomicBoolean(true);
        this.zzo = new AtomicBoolean(false);
        this.zzq = clock;
        zzfkj zzfkjVar = new zzfkj(zzfvVar.zza, AdFormat.getAdFormat(this.zze.zzb));
        zzfkjVar.zzb(str);
        this.zzr = new zzfkl(zzfkjVar, null);
    }
}
