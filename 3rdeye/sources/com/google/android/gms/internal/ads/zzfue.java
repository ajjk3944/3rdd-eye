package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzfue {
    private final zzfvw zza;
    private final Context zzb;
    private final zzfuf zzc;
    private boolean zzf;
    private final Intent zzg;
    private ServiceConnection zzi;
    private IInterface zzj;
    private final List zze = new ArrayList();
    private final String zzd = "OverlayDisplayService";
    private final IBinder.DeathRecipient zzh = new IBinder.DeathRecipient() { // from class: com.google.android.gms.internal.ads.zzftw
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            zzfue.zzh(this.zza);
        }
    };

    public zzfue(Context context, zzfuf zzfufVar, String str, Intent intent, zzftj zzftjVar) {
        this.zzb = context;
        this.zzc = zzfufVar;
        final String str2 = "OverlayDisplayService";
        this.zzg = intent;
        this.zza = zzfwa.zza(new zzfvw(str2) { // from class: com.google.android.gms.internal.ads.zzftv
            public final /* synthetic */ String zza = "OverlayDisplayService";

            @Override // com.google.android.gms.internal.ads.zzfvw
            public final Object zza() {
                HandlerThread handlerThread = new HandlerThread(this.zza, 10);
                handlerThread.start();
                return new Handler(handlerThread.getLooper());
            }
        });
    }

    public static /* synthetic */ void zzf(zzfue zzfueVar, Runnable runnable) {
        try {
            runnable.run();
        } catch (RuntimeException e4) {
            zzfueVar.zzc.zza("error caused by ", e4);
        }
    }

    public static /* synthetic */ void zzg(zzfue zzfueVar, Runnable runnable) {
        if (zzfueVar.zzj != null || zzfueVar.zzf) {
            if (!zzfueVar.zzf) {
                runnable.run();
                return;
            }
            zzfueVar.zzc.zzc("Waiting to bind to the service.", new Object[0]);
            List list = zzfueVar.zze;
            synchronized (list) {
                list.add(runnable);
            }
            return;
        }
        zzfueVar.zzc.zzc("Initiate binding to the service.", new Object[0]);
        List list2 = zzfueVar.zze;
        synchronized (list2) {
            list2.add(runnable);
        }
        zzfuc zzfucVar = new zzfuc(zzfueVar, null);
        zzfueVar.zzi = zzfucVar;
        zzfueVar.zzf = true;
        if (zzfueVar.zzb.bindService(zzfueVar.zzg, zzfucVar, 1)) {
            return;
        }
        zzfueVar.zzc.zzc("Failed to bind to the service.", new Object[0]);
        zzfueVar.zzf = false;
        List list3 = zzfueVar.zze;
        synchronized (list3) {
            list3.clear();
        }
    }

    public static /* synthetic */ void zzh(zzfue zzfueVar) {
        zzfueVar.zzc.zzc("%s : Binder has died.", zzfueVar.zzd);
        List list = zzfueVar.zze;
        synchronized (list) {
            list.clear();
        }
    }

    public static /* synthetic */ void zzi(zzfue zzfueVar) {
        if (zzfueVar.zzj != null) {
            zzfueVar.zzc.zzc("Unbind from service.", new Object[0]);
            Context context = zzfueVar.zzb;
            ServiceConnection serviceConnection = zzfueVar.zzi;
            serviceConnection.getClass();
            context.unbindService(serviceConnection);
            zzfueVar.zzf = false;
            zzfueVar.zzj = null;
            zzfueVar.zzi = null;
            List list = zzfueVar.zze;
            synchronized (list) {
                list.clear();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzo(final Runnable runnable) {
        ((Handler) this.zza.zza()).post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzftx
            @Override // java.lang.Runnable
            public final void run() {
                zzfue.zzf(this.zza, runnable);
            }
        });
    }

    public final IInterface zzc() {
        return this.zzj;
    }

    public final void zzm(final Runnable runnable) {
        zzo(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfty
            @Override // java.lang.Runnable
            public final void run() {
                zzfue.zzg(this.zza, runnable);
            }
        });
    }

    public final void zzn() {
        zzo(new Runnable() { // from class: com.google.android.gms.internal.ads.zzftz
            @Override // java.lang.Runnable
            public final void run() {
                zzfue.zzi(this.zza);
            }
        });
    }
}
