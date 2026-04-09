package com.google.android.gms.internal.ads;

import N7.C1154e9;
import io.appmetrica.analytics.impl.Oo;
import java.util.concurrent.ExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
abstract class zzgbo extends zzgcr implements Runnable {
    public static final /* synthetic */ int zzd = 0;
    A4.a zza;
    Class zzb;
    Object zzc;

    public zzgbo(A4.a aVar, Class cls, Object obj) {
        aVar.getClass();
        this.zza = aVar;
        this.zzb = cls;
        this.zzc = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        A4.a aVar = this.zza;
        Class cls = this.zzb;
        Object obj = this.zzc;
        if (((obj == null) || ((aVar == 0) | (cls == null))) || isCancelled()) {
            return;
        }
        this.zza = null;
        try {
            th = aVar instanceof zzgef ? ((zzgef) aVar).zzi() : null;
        } catch (ExecutionException e4) {
            Throwable cause = e4.getCause();
            if (cause == null) {
                cause = new NullPointerException(Oo.h("Future type ", String.valueOf(aVar.getClass()), " threw ", String.valueOf(e4.getClass()), " without a cause"));
            }
            th = cause;
        } catch (Throwable th) {
            th = th;
        }
        Object objZzp = th == null ? zzgdb.zzp(aVar) : null;
        if (th == null) {
            zzc(objZzp);
            return;
        }
        if (!cls.isInstance(th)) {
            zzn(aVar);
            return;
        }
        try {
            Object objZze = zze(obj, th);
            this.zzb = null;
            this.zzc = null;
            zzf(objZze);
        } catch (Throwable th2) {
            try {
                zzgdu.zza(th2);
                zzd(th2);
            } finally {
                this.zzb = null;
                this.zzc = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgbp
    public final String zza() {
        A4.a aVar = this.zza;
        Class cls = this.zzb;
        Object obj = this.zzc;
        String strZza = super.zza();
        String strI = aVar != null ? C1154e9.i("inputFuture=[", aVar.toString(), "], ") : "";
        if (cls == null || obj == null) {
            if (strZza != null) {
                return strI.concat(strZza);
            }
            return null;
        }
        return strI + "exceptionType=[" + cls.toString() + "], fallback=[" + obj.toString() + "]";
    }

    @Override // com.google.android.gms.internal.ads.zzgbp
    public final void zzb() {
        zzl(this.zza);
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
    }

    public abstract Object zze(Object obj, Throwable th) throws Exception;

    public abstract void zzf(Object obj);
}
