package com.google.android.gms.internal.ads;

import N7.C1154e9;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes2.dex */
final class zzfvj extends zzfvc {
    private final Object zza;

    public zzfvj(Object obj) {
        this.zza = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzfvj) {
            return this.zza.equals(((zzfvj) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 1502476572;
    }

    public final String toString() {
        return C1154e9.i("Optional.of(", this.zza.toString(), ")");
    }

    @Override // com.google.android.gms.internal.ads.zzfvc
    public final zzfvc zza(zzfut zzfutVar) {
        Object objApply = zzfutVar.apply(this.zza);
        zzfve.zzc(objApply, "the Function passed to Optional.transform() must not return null.");
        return new zzfvj(objApply);
    }

    @Override // com.google.android.gms.internal.ads.zzfvc
    public final Object zzb(Object obj) {
        return this.zza;
    }
}
