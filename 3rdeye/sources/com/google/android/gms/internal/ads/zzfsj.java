package com.google.android.gms.internal.ads;

import B4.f;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzfsj extends zzfsu {
    private final String zza;
    private final String zzb;

    public /* synthetic */ zzfsj(String str, String str2, zzfsi zzfsiVar) {
        this.zza = str;
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfsu) {
            zzfsu zzfsuVar = (zzfsu) obj;
            String str = this.zza;
            if (str != null ? str.equals(zzfsuVar.zzb()) : zzfsuVar.zzb() == null) {
                String str2 = this.zzb;
                if (str2 != null ? str2.equals(zzfsuVar.zza()) : zzfsuVar.zza() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zza;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.zzb;
        return ((iHashCode ^ 1000003) * 1000003) ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OverlayDisplayDismissRequest{sessionToken=");
        sb.append(this.zza);
        sb.append(", appId=");
        return f.c(sb, this.zzb, "}");
    }

    @Override // com.google.android.gms.internal.ads.zzfsu
    public final String zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfsu
    public final String zzb() {
        return this.zza;
    }
}
