package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

@Deprecated
/* loaded from: classes2.dex */
public class zzaiu implements zzao {
    public final long zza;
    public final long zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;

    public zzaiu(long j10, long j11, long j12, long j13, long j14) {
        this.zza = j10;
        this.zzb = j11;
        this.zzc = j12;
        this.zzd = j13;
        this.zze = j14;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzaiu zzaiuVar = (zzaiu) obj;
            if (this.zza == zzaiuVar.zza && this.zzb == zzaiuVar.zzb && this.zzc == zzaiuVar.zzc && this.zzd == zzaiuVar.zzd && this.zze == zzaiuVar.zze) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((androidx.privacysandbox.ads.adservices.topics.d.a(this.zza) + 527) * 31) + androidx.privacysandbox.ads.adservices.topics.d.a(this.zzb)) * 31) + androidx.privacysandbox.ads.adservices.topics.d.a(this.zzc)) * 31) + androidx.privacysandbox.ads.adservices.topics.d.a(this.zzd)) * 31) + androidx.privacysandbox.ads.adservices.topics.d.a(this.zze);
    }

    public final String toString() {
        long j10 = this.zza;
        int length = String.valueOf(j10).length();
        long j11 = this.zzb;
        int length2 = String.valueOf(j11).length();
        long j12 = this.zzc;
        int length3 = String.valueOf(j12).length();
        long j13 = this.zzd;
        int length4 = String.valueOf(j13).length();
        long j14 = this.zze;
        StringBuilder sb = new StringBuilder(length + 54 + length2 + 31 + length3 + 21 + length4 + 12 + String.valueOf(j14).length());
        sb.append("Motion photo metadata: photoStartPosition=");
        sb.append(j10);
        sb.append(", photoSize=");
        sb.append(j11);
        sb.append(", photoPresentationTimestampUs=");
        sb.append(j12);
        sb.append(", videoStartPosition=");
        sb.append(j13);
        sb.append(", videoSize=");
        sb.append(j14);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzao
    public /* synthetic */ void zza(zzam zzamVar) {
        r.a(this, zzamVar);
    }
}
