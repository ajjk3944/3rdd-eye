package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzfen implements zzfel {
    private final String zza;

    public zzfen(String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzfel
    public final boolean equals(Object obj) {
        if (obj instanceof zzfen) {
            return this.zza.equals(((zzfen) obj).zza);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfel
    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return this.zza;
    }
}
