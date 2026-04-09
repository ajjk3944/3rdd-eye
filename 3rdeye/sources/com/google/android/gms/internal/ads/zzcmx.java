package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzcmx implements zzcvr, zzcxf, zzcwl, com.google.android.gms.ads.internal.client.zza, zzcwh, zzddn, zzcyh {
    private final Context zza;
    private final Executor zzb;
    private final Executor zzc;
    private final ScheduledExecutorService zzd;
    private final zzfcf zze;
    private final zzfbt zzf;
    private final zzfjm zzg;
    private final zzfda zzh;
    private final zzavs zzi;
    private final zzbej zzj;
    private final WeakReference zzk;
    private final WeakReference zzl;
    private final zzcur zzm;
    private final zzcyb zzn;
    private boolean zzo;
    private final AtomicBoolean zzp = new AtomicBoolean();

    public zzcmx(Context context, Executor executor, Executor executor2, ScheduledExecutorService scheduledExecutorService, zzfcf zzfcfVar, zzfbt zzfbtVar, zzfjm zzfjmVar, zzfda zzfdaVar, View view, zzcfe zzcfeVar, zzavs zzavsVar, zzbej zzbejVar, zzbel zzbelVar, zzfhm zzfhmVar, zzcur zzcurVar, zzcyb zzcybVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = executor2;
        this.zzd = scheduledExecutorService;
        this.zze = zzfcfVar;
        this.zzf = zzfbtVar;
        this.zzg = zzfjmVar;
        this.zzh = zzfdaVar;
        this.zzi = zzavsVar;
        this.zzk = new WeakReference(view);
        this.zzl = new WeakReference(zzcfeVar);
        this.zzj = zzbejVar;
        this.zzm = zzcurVar;
        this.zzn = zzcybVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List zzw() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzlF)).booleanValue()) {
            com.google.android.gms.ads.internal.zzv.zzr();
            Context context = this.zza;
            if (com.google.android.gms.ads.internal.util.zzs.zzC(context)) {
                com.google.android.gms.ads.internal.zzv.zzr();
                Integer numZzt = com.google.android.gms.ads.internal.util.zzs.zzt(context);
                if (numZzt != null) {
                    int iMin = Math.min(numZzt.intValue(), 20);
                    ArrayList arrayList = new ArrayList();
                    Iterator it = this.zzf.zzd.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Uri.parse((String) it.next()).buildUpon().appendQueryParameter("dspct", Integer.toString(iMin)).toString());
                    }
                    return arrayList;
                }
            }
        }
        return this.zzf.zzd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzx() {
        String strZzh;
        int i;
        zzfbt zzfbtVar = this.zzf;
        List list = zzfbtVar.zzd;
        if (list == null || list.isEmpty()) {
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzdM)).booleanValue()) {
            strZzh = this.zzi.zzc().zzh(this.zza, (View) this.zzk.get(), null);
        } else {
            strZzh = null;
        }
        if ((((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzaF)).booleanValue() && this.zze.zzb.zzb.zzh) || !((Boolean) zzbfb.zzh.zze()).booleanValue()) {
            this.zzh.zza(this.zzg.zze(this.zze, zzfbtVar, false, strZzh, null, zzw()), this.zzn);
            return;
        }
        if (((Boolean) zzbfb.zzg.zze()).booleanValue() && ((i = zzfbtVar.zzb) == 1 || i == 2 || i == 5)) {
        }
        zzgdb.zzr((zzgcs) zzgdb.zzo(zzgcs.zzw(zzgdb.zzh(null)), ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzbg)).longValue(), TimeUnit.MILLISECONDS, this.zzd), new zzcmw(this, strZzh), this.zzb);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzy(final int i, final int i10) {
        View view;
        if (i <= 0 || !((view = (View) this.zzk.get()) == null || view.getHeight() == 0 || view.getWidth() == 0)) {
            zzx();
        } else {
            this.zzd.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcmt
                @Override // java.lang.Runnable
                public final void run() {
                    zzcmx zzcmxVar = this.zza;
                    zzcmxVar.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcmu
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzcmxVar.zzy(i - 1, i);
                        }
                    });
                }
            }, i10, TimeUnit.MILLISECONDS);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if (!(((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzaF)).booleanValue() && this.zze.zzb.zzb.zzh) && ((Boolean) zzbfb.zzd.zze()).booleanValue()) {
            zzgdb.zzr((zzgcs) zzgdb.zze(zzgcs.zzw(this.zzj.zza()), Throwable.class, new zzfut() { // from class: com.google.android.gms.internal.ads.zzcmr
                @Override // com.google.android.gms.internal.ads.zzfut
                public final Object apply(Object obj) {
                    return "failure_click_attok";
                }
            }, zzcad.zzg), new zzcmv(this), this.zzb);
            return;
        }
        zzfda zzfdaVar = this.zzh;
        zzfjm zzfjmVar = this.zzg;
        zzfcf zzfcfVar = this.zze;
        zzfbt zzfbtVar = this.zzf;
        zzfdaVar.zzc(zzfjmVar.zzd(zzfcfVar, zzfbtVar, zzfbtVar.zzc), true == com.google.android.gms.ads.internal.zzv.zzp().zzA(this.zza) ? 2 : 1);
    }

    @Override // com.google.android.gms.internal.ads.zzcvr
    public final void zzdu(zzbwa zzbwaVar, String str, String str2) {
        zzfjm zzfjmVar = this.zzg;
        zzfda zzfdaVar = this.zzh;
        zzfbt zzfbtVar = this.zzf;
        zzfdaVar.zza(zzfjmVar.zzf(zzfbtVar, zzfbtVar.zzh, zzbwaVar), null);
    }

    @Override // com.google.android.gms.internal.ads.zzcvr
    public final void zze() {
        zzfjm zzfjmVar = this.zzg;
        zzfcf zzfcfVar = this.zze;
        zzfda zzfdaVar = this.zzh;
        zzfbt zzfbtVar = this.zzf;
        zzfdaVar.zza(zzfjmVar.zzd(zzfcfVar, zzfbtVar, zzfbtVar.zzi), null);
    }

    @Override // com.google.android.gms.internal.ads.zzcvr
    public final void zzf() {
        zzfjm zzfjmVar = this.zzg;
        zzfcf zzfcfVar = this.zze;
        zzfda zzfdaVar = this.zzh;
        zzfbt zzfbtVar = this.zzf;
        zzfdaVar.zza(zzfjmVar.zzd(zzfcfVar, zzfbtVar, zzfbtVar.zzg), null);
    }

    @Override // com.google.android.gms.internal.ads.zzcwh
    public final void zzr(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzbF)).booleanValue()) {
            int i = zzeVar.zza;
            zzfbt zzfbtVar = this.zzf;
            ArrayList arrayList = new ArrayList();
            Iterator it = zzfbtVar.zzo.iterator();
            while (it.hasNext()) {
                arrayList.add(zzfjm.zzc((String) it.next(), "@gw_mpe@", "2." + i));
            }
            this.zzh.zza(this.zzg.zzd(this.zze, zzfbtVar, arrayList), null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwl
    public final void zzs() {
        if (this.zzp.compareAndSet(false, true)) {
            int iIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzdV)).intValue();
            if (iIntValue > 0) {
                zzy(iIntValue, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzdW)).intValue());
                return;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzdU)).booleanValue()) {
                this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcmq
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzcmx zzcmxVar = this.zza;
                        zzcmxVar.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcms
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzcmxVar.zzx();
                            }
                        });
                    }
                });
            } else {
                zzx();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxf
    public final synchronized void zzt() {
        zzcur zzcurVar;
        try {
            if (this.zzo) {
                ArrayList arrayList = new ArrayList(zzw());
                zzfbt zzfbtVar = this.zzf;
                arrayList.addAll(zzfbtVar.zzf);
                this.zzh.zza(this.zzg.zze(this.zze, zzfbtVar, true, null, null, arrayList), null);
            } else {
                zzfda zzfdaVar = this.zzh;
                zzfjm zzfjmVar = this.zzg;
                zzfcf zzfcfVar = this.zze;
                zzfbt zzfbtVar2 = this.zzf;
                zzfdaVar.zza(zzfjmVar.zzd(zzfcfVar, zzfbtVar2, zzfbtVar2.zzm), null);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzdR)).booleanValue() && (zzcurVar = this.zzm) != null) {
                    List list = zzcurVar.zzb().zzm;
                    String strZzg = zzcurVar.zza().zzg();
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(zzfjm.zzc((String) it.next(), "@gw_adnetstatus@", strZzg));
                    }
                    long jZza = zzcurVar.zza().zza();
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        arrayList3.add(zzfjm.zzc((String) it2.next(), "@gw_ttr@", Long.toString(jZza, 10)));
                    }
                    zzfdaVar.zza(zzfjmVar.zzd(zzcurVar.zzc(), zzcurVar.zzb(), arrayList3), null);
                }
                zzfdaVar.zza(zzfjmVar.zzd(zzfcfVar, zzfbtVar2, zzfbtVar2.zzf), null);
            }
            this.zzo = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcyh
    public final void zzu() {
        zzfbt zzfbtVar = this.zzf;
        if (zzfbtVar.zze == 4) {
            this.zzh.zza(this.zzg.zzd(this.zze, zzfbtVar, zzfbtVar.zzaA), null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddn
    public final void zzv() {
        zzfjm zzfjmVar = this.zzg;
        zzfcf zzfcfVar = this.zze;
        zzfda zzfdaVar = this.zzh;
        zzfbt zzfbtVar = this.zzf;
        zzfdaVar.zza(zzfjmVar.zzd(zzfcfVar, zzfbtVar, zzfbtVar.zzau), null);
    }

    @Override // com.google.android.gms.internal.ads.zzcvr
    public final void zza() {
    }

    @Override // com.google.android.gms.internal.ads.zzcvr
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.zzcvr
    public final void zzc() {
    }
}
