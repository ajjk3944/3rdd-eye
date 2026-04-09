package com.google.android.gms.ads.internal.util.client;

import androidx.work.s;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes.dex */
final class zzn extends zzx {
    private final int zza;
    private final int zzb;
    private final double zzc;
    private final boolean zzd;

    public zzn(int i, int i10, double d10, boolean z10) {
        this.zza = i;
        this.zzb = i10;
        this.zzc = d10;
        this.zzd = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzx) {
            zzx zzxVar = (zzx) obj;
            if (this.zza == zzxVar.zzc() && this.zzb == zzxVar.zzb() && Double.doubleToLongBits(this.zzc) == Double.doubleToLongBits(zzxVar.zza()) && this.zzd == zzxVar.zzd()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        double d10 = this.zzc;
        return ((((int) (Double.doubleToLongBits(d10) ^ (Double.doubleToLongBits(d10) >>> 32))) ^ ((((this.zza ^ 1000003) * 1000003) ^ this.zzb) * 1000003)) * 1000003) ^ (true != this.zzd ? 1237 : 1231);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PingStrategy{maxAttempts=");
        sb.append(this.zza);
        sb.append(", initialBackoffMs=");
        sb.append(this.zzb);
        sb.append(", backoffMultiplier=");
        sb.append(this.zzc);
        sb.append(", bufferAfterMaxAttempts=");
        return s.h(sb, this.zzd, "}");
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzx
    public final double zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzx
    public final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzx
    public final int zzc() {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzx
    public final boolean zzd() {
        return this.zzd;
    }
}
