package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzavj implements Runnable {
    final /* synthetic */ zzavk zza;

    public zzavj(zzavk zzavkVar) {
        this.zza = zzavkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzavk zzavkVar = this.zza;
        synchronized (zzavkVar.zzo) {
            if (zzavkVar.zzp) {
                return;
            }
            zzavkVar.zzp = true;
            try {
                zzavk.zzj(zzavkVar);
            } catch (Exception e4) {
                this.zza.zzh.zzc(2023, -1L, e4);
            }
            zzavk zzavkVar2 = this.zza;
            synchronized (zzavkVar2.zzo) {
                zzavkVar2.zzp = false;
            }
        }
    }
}
