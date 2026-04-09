package com.google.android.gms.internal.ads;

import N7.C1154e9;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes2.dex */
final class zzfvz implements zzfvw {
    private static final zzfvw zza = new zzfvw() { // from class: com.google.android.gms.internal.ads.zzfvy
        @Override // com.google.android.gms.internal.ads.zzfvw
        public final Object zza() {
            throw new IllegalStateException();
        }
    };
    private final zzfwd zzb = new zzfwd();
    private volatile zzfvw zzc;
    private Object zzd;

    public zzfvz(zzfvw zzfvwVar) {
        this.zzc = zzfvwVar;
    }

    public final String toString() {
        Object objI = this.zzc;
        if (objI == zza) {
            objI = C1154e9.i("<supplier that returned ", String.valueOf(this.zzd), ">");
        }
        return C1154e9.i("Suppliers.memoize(", String.valueOf(objI), ")");
    }

    @Override // com.google.android.gms.internal.ads.zzfvw
    public final Object zza() {
        zzfvw zzfvwVar = this.zzc;
        zzfvw zzfvwVar2 = zza;
        if (zzfvwVar != zzfvwVar2) {
            synchronized (this.zzb) {
                try {
                    if (this.zzc != zzfvwVar2) {
                        Object objZza = this.zzc.zza();
                        this.zzd = objZza;
                        this.zzc = zzfvwVar2;
                        return objZza;
                    }
                } finally {
                }
            }
        }
        return this.zzd;
    }
}
