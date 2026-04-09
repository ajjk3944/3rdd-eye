package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public final class zzfy implements zzao {
    public final long zza;
    public final long zzb;
    public final long zzc;

    public zzfy(long j10, long j11, long j12) {
        this.zza = j10;
        this.zzb = j11;
        this.zzc = j12;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzfy)) {
            return false;
        }
        zzfy zzfyVar = (zzfy) obj;
        return this.zza == zzfyVar.zza && this.zzb == zzfyVar.zzb && this.zzc == zzfyVar.zzc;
    }

    public final int hashCode() {
        return ((((androidx.privacysandbox.ads.adservices.topics.d.a(this.zza) + 527) * 31) + androidx.privacysandbox.ads.adservices.topics.d.a(this.zzb)) * 31) + androidx.privacysandbox.ads.adservices.topics.d.a(this.zzc);
    }

    public final String toString() {
        long j10 = this.zza;
        int length = String.valueOf(j10).length();
        long j11 = this.zzb;
        int length2 = String.valueOf(j11).length();
        long j12 = this.zzc;
        StringBuilder sb = new StringBuilder(length + 48 + length2 + 12 + String.valueOf(j12).length());
        sb.append("Mp4Timestamp: creation time=");
        sb.append(j10);
        sb.append(", modification time=");
        sb.append(j11);
        sb.append(", timescale=");
        sb.append(j12);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzao
    public /* synthetic */ void zza(zzam zzamVar) {
        r.a(this, zzamVar);
    }
}
