package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public final class zzahx implements zzao {
    public final long zza;

    public zzahx(long j10) {
        this.zza = j10;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && zzahx.class == obj.getClass() && this.zza == ((zzahx) obj).zza;
    }

    public final int hashCode() {
        return androidx.privacysandbox.ads.adservices.topics.d.a(this.zza) + 527;
    }

    public final String toString() {
        long j10 = this.zza;
        StringBuilder sb = new StringBuilder(String.valueOf(j10).length() + 38);
        sb.append("ThumbnailMetadata: presentationTimeUs=");
        sb.append(j10);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzao
    public /* synthetic */ void zza(zzam zzamVar) {
        r.a(this, zzamVar);
    }
}
