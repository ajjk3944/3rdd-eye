package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzdzb extends zzdzf {
    private final long zza;
    private final int zzb;

    public /* synthetic */ zzdzb(long j10, int i10, byte[] bArr) {
        this.zza = j10;
        this.zzb = i10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzdzf) {
            zzdzf zzdzfVar = (zzdzf) obj;
            if (this.zza == zzdzfVar.zza() && this.zzb == zzdzfVar.zzb()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.zza;
        return ((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.zzb;
    }

    public final String toString() {
        long j10 = this.zza;
        int length = String.valueOf(j10).length();
        int i10 = this.zzb;
        StringBuilder sb = new StringBuilder(length + 34 + String.valueOf(i10).length() + 1);
        sb.append("OnDeviceStorageKey{id=");
        sb.append(j10);
        sb.append(", eventType=");
        sb.append(i10);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzdzf
    public final long zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzdzf
    public final int zzb() {
        return this.zzb;
    }
}
