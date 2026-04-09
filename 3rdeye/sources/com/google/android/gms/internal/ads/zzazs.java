package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzazs implements Runnable {
    final /* synthetic */ zzazt zza;

    public zzazs(zzazt zzaztVar) {
        this.zza = zzaztVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzazt zzaztVar = this.zza;
        synchronized (zzaztVar.zzc) {
            if (zzaztVar.zzd && zzaztVar.zze) {
                zzaztVar.zzd = false;
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zze("App went background");
                Iterator it = zzaztVar.zzf.iterator();
                while (it.hasNext()) {
                    try {
                        ((zzazu) it.next()).zza(false);
                    } catch (Exception e4) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzh("", e4);
                    }
                }
            } else {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zze("App is still foreground");
            }
        }
    }
}
