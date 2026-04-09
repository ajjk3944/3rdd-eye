package com.google.android.gms.internal.ads;

import F3.h;
import N7.C1154e9;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
abstract class zzgby extends zzgcr implements Runnable {
    public static final /* synthetic */ int zzc = 0;
    A4.a zza;
    Object zzb;

    public zzgby(A4.a aVar, Object obj) {
        aVar.getClass();
        this.zza = aVar;
        this.zzb = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        A4.a aVar = this.zza;
        Object obj = this.zzb;
        if ((isCancelled() | (aVar == null)) || (obj == null)) {
            return;
        }
        this.zza = null;
        if (aVar.isCancelled()) {
            zzn(aVar);
            return;
        }
        try {
            try {
                Object objZze = zze(obj, zzgdb.zzp(aVar));
                this.zzb = null;
                zzf(objZze);
            } catch (Throwable th) {
                try {
                    zzgdu.zza(th);
                    zzd(th);
                } finally {
                    this.zzb = null;
                }
            }
        } catch (Error e4) {
            zzd(e4);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e10) {
            zzd(e10.getCause());
        } catch (Exception e11) {
            zzd(e11);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgbp
    public final String zza() {
        A4.a aVar = this.zza;
        Object obj = this.zzb;
        String strZza = super.zza();
        String strI = aVar != null ? C1154e9.i("inputFuture=[", aVar.toString(), "], ") : "";
        if (obj != null) {
            return h.i(strI, "function=[", obj.toString(), "]");
        }
        if (strZza != null) {
            return strI.concat(strZza);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzgbp
    public final void zzb() {
        zzl(this.zza);
        this.zza = null;
        this.zzb = null;
    }

    public abstract Object zze(Object obj, Object obj2) throws Exception;

    public abstract void zzf(Object obj);
}
