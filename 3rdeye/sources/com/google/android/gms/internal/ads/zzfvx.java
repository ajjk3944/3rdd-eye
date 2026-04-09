package com.google.android.gms.internal.ads;

import N7.C1154e9;
import java.io.Serializable;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes2.dex */
final class zzfvx implements Serializable, zzfvw {
    final zzfvw zza;
    volatile transient boolean zzb;
    transient Object zzc;
    private final transient zzfwd zzd = new zzfwd();

    public zzfvx(zzfvw zzfvwVar) {
        this.zza = zzfvwVar;
    }

    public final String toString() {
        return C1154e9.i("Suppliers.memoize(", (this.zzb ? C1154e9.i("<supplier that returned ", String.valueOf(this.zzc), ">") : this.zza).toString(), ")");
    }

    @Override // com.google.android.gms.internal.ads.zzfvw
    public final Object zza() {
        if (!this.zzb) {
            synchronized (this.zzd) {
                try {
                    if (!this.zzb) {
                        Object objZza = this.zza.zza();
                        this.zzc = objZza;
                        this.zzb = true;
                        return objZza;
                    }
                } finally {
                }
            }
        }
        return this.zzc;
    }
}
