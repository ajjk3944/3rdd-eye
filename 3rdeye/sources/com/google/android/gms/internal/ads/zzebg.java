package com.google.android.gms.internal.ads;

import N7.C1154e9;
import android.graphics.drawable.Drawable;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzebg extends zzebk {
    private final String zza;
    private final String zzb;
    private final Drawable zzc;

    public zzebg(String str, String str2, Drawable drawable) {
        this.zza = str;
        if (str2 == null) {
            throw new NullPointerException("Null imageUrl");
        }
        this.zzb = str2;
        this.zzc = drawable;
    }

    public final boolean equals(Object obj) {
        Drawable drawable;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzebk) {
            zzebk zzebkVar = (zzebk) obj;
            String str = this.zza;
            if (str != null ? str.equals(zzebkVar.zzb()) : zzebkVar.zzb() == null) {
                if (this.zzb.equals(zzebkVar.zzc()) && ((drawable = this.zzc) != null ? drawable.equals(zzebkVar.zza()) : zzebkVar.zza() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zza;
        int iHashCode = (((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.zzb.hashCode();
        Drawable drawable = this.zzc;
        return (iHashCode * 1000003) ^ (drawable != null ? drawable.hashCode() : 0);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zzc);
        StringBuilder sb = new StringBuilder("OfflineAdAssets{advertiserName=");
        sb.append(this.zza);
        sb.append(", imageUrl=");
        return C1154e9.j(sb, this.zzb, ", icon=", strValueOf, "}");
    }

    @Override // com.google.android.gms.internal.ads.zzebk
    public final Drawable zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzebk
    public final String zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzebk
    public final String zzc() {
        return this.zzb;
    }
}
