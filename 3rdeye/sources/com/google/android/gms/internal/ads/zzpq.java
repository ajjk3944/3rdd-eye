package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzpq {
    private boolean zza;
    private boolean zzb;
    private boolean zzc;

    public final zzpq zza(boolean z10) {
        this.zza = true;
        return this;
    }

    public final zzpq zzb(boolean z10) {
        this.zzb = z10;
        return this;
    }

    public final zzpq zzc(boolean z10) {
        this.zzc = z10;
        return this;
    }

    public final zzps zzd() {
        if (this.zza || !(this.zzb || this.zzc)) {
            return new zzps(this, null);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
    }
}
