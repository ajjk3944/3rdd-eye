package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public final class zzaix implements zzao {
    public final float zza;
    public final int zzb;

    public zzaix(float f10, int i10) {
        this.zza = f10;
        this.zzb = i10;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaix.class == obj.getClass()) {
            zzaix zzaixVar = (zzaix) obj;
            if (this.zza == zzaixVar.zza && this.zzb == zzaixVar.zzb) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.floatToIntBits(this.zza) + 527) * 31) + this.zzb;
    }

    public final String toString() {
        float f10 = this.zza;
        int length = String.valueOf(f10).length();
        int i10 = this.zzb;
        StringBuilder sb = new StringBuilder(length + 47 + String.valueOf(i10).length());
        sb.append("smta: captureFrameRate=");
        sb.append(f10);
        sb.append(", svcTemporalLayerCount=");
        sb.append(i10);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzao
    public /* synthetic */ void zza(zzam zzamVar) {
        r.a(this, zzamVar);
    }
}
