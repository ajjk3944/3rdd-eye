package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzfg implements zzau {
    public final float zza;
    public final float zzb;

    public zzfg(float f10, float f11) {
        boolean z10 = false;
        if (f10 >= -90.0f && f10 <= 90.0f && f11 >= -180.0f && f11 <= 180.0f) {
            z10 = true;
        }
        zzdd.zze(z10, "Invalid latitude or longitude");
        this.zza = f10;
        this.zzb = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzfg.class == obj.getClass()) {
            zzfg zzfgVar = (zzfg) obj;
            if (this.zza == zzfgVar.zza && this.zzb == zzfgVar.zzb) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iFloatToIntBits = Float.floatToIntBits(this.zza) + 527;
        return Float.floatToIntBits(this.zzb) + (iFloatToIntBits * 31);
    }

    public final String toString() {
        return "xyz: latitude=" + this.zza + ", longitude=" + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzau
    public final /* synthetic */ void zza(zzar zzarVar) {
    }
}
