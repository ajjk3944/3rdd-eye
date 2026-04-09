package com.google.android.gms.internal.ads;

import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public final class zzfx implements zzao {
    public final float zza;
    public final float zzb;

    public zzfx(@FloatRange(from = -90.0d, to = 90.0d) float f10, @FloatRange(from = -180.0d, to = 180.0d) float f11) {
        boolean z10 = false;
        if (f10 >= -90.0f && f10 <= 90.0f && f11 >= -180.0f && f11 <= 180.0f) {
            z10 = true;
        }
        zzgrc.zzb(z10, "Invalid latitude or longitude");
        this.zza = f10;
        this.zzb = f11;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzfx.class == obj.getClass()) {
            zzfx zzfxVar = (zzfx) obj;
            if (this.zza == zzfxVar.zza && this.zzb == zzfxVar.zzb) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.floatToIntBits(this.zza) + 527) * 31) + Float.floatToIntBits(this.zzb);
    }

    public final String toString() {
        float f10 = this.zza;
        int length = String.valueOf(f10).length();
        float f11 = this.zzb;
        StringBuilder sb = new StringBuilder(length + 26 + String.valueOf(f11).length());
        sb.append("xyz: latitude=");
        sb.append(f10);
        sb.append(", longitude=");
        sb.append(f11);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzao
    public /* synthetic */ void zza(zzam zzamVar) {
        r.a(this, zzamVar);
    }
}
