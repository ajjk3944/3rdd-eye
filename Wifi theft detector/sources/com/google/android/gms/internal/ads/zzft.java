package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public final class zzft implements zzao {
    public final int zza;

    public zzft(int i10) {
        this.zza = i10;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zzft) && this.zza == ((zzft) obj).zza;
    }

    public final int hashCode() {
        return this.zza;
    }

    public final String toString() {
        int i10 = this.zza;
        StringBuilder sb = new StringBuilder(String.valueOf(i10).length() + 19);
        sb.append("Mp4AlternateGroup: ");
        sb.append(i10);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzao
    public /* synthetic */ void zza(zzam zzamVar) {
        r.a(this, zzamVar);
    }
}
