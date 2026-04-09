package com.google.android.gms.internal.ads;

import B4.f;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzfsp extends zzftr {
    private final int zza;
    private final String zzb;

    public /* synthetic */ zzfsp(int i, String str, zzfso zzfsoVar) {
        this.zza = i;
        this.zzb = str;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzftr) {
            zzftr zzftrVar = (zzftr) obj;
            if (this.zza == zzftrVar.zza() && ((str = this.zzb) != null ? str.equals(zzftrVar.zzb()) : zzftrVar.zzb() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zzb;
        return (str == null ? 0 : str.hashCode()) ^ ((this.zza ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OverlayDisplayState{statusCode=");
        sb.append(this.zza);
        sb.append(", sessionToken=");
        return f.c(sb, this.zzb, "}");
    }

    @Override // com.google.android.gms.internal.ads.zzftr
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzftr
    public final String zzb() {
        return this.zzb;
    }
}
