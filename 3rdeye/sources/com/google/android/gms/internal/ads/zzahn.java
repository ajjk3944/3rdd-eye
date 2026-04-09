package com.google.android.gms.internal.ads;

import N7.B8;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzahn implements zzau {
    public final float zza;
    public final int zzb;

    public zzahn(float f10, int i) {
        this.zza = f10;
        this.zzb = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzahn.class == obj.getClass()) {
            zzahn zzahnVar = (zzahn) obj;
            if (this.zza == zzahnVar.zza && this.zzb == zzahnVar.zzb) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return B8.g(this.zza, 527, 31) + this.zzb;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.zza + ", svcTemporalLayerCount=" + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzau
    public final /* synthetic */ void zza(zzar zzarVar) {
    }
}
