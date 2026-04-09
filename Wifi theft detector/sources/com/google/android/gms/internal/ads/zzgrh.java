package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzgrh extends zzgra {
    private final Object zza;

    public zzgrh(Object obj) {
        this.zza = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzgrh) {
            return this.zza.equals(((zzgrh) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 1502476572;
    }

    public final String toString() {
        String string = this.zza.toString();
        StringBuilder sb = new StringBuilder(string.length() + 13);
        sb.append("Optional.of(");
        sb.append(string);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgra
    public final Object zza(Object obj) {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgra
    public final zzgra zzb(zzgqt zzgqtVar) {
        Object objApply = zzgqtVar.apply(this.zza);
        zzgrc.zzk(objApply, "the Function passed to Optional.transform() must not return null.");
        return new zzgrh(objApply);
    }
}
