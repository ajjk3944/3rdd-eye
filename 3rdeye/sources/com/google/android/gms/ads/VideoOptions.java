package com.google.android.gms.ads;

import com.google.android.gms.ads.internal.client.zzgc;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes.dex */
public final class VideoOptions {
    private final boolean zza;
    private final boolean zzb;
    private final boolean zzc;

    /* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
    public static final class Builder {
        private boolean zza = true;
        private boolean zzb = false;
        private boolean zzc = false;

        public VideoOptions build() {
            return new VideoOptions(this, null);
        }

        public Builder setClickToExpandRequested(boolean z10) {
            this.zzc = z10;
            return this;
        }

        public Builder setCustomControlsRequested(boolean z10) {
            this.zzb = z10;
            return this;
        }

        public Builder setStartMuted(boolean z10) {
            this.zza = z10;
            return this;
        }
    }

    public /* synthetic */ VideoOptions(Builder builder, zzj zzjVar) {
        this.zza = builder.zza;
        this.zzb = builder.zzb;
        this.zzc = builder.zzc;
    }

    public boolean getClickToExpandRequested() {
        return this.zzc;
    }

    public boolean getCustomControlsRequested() {
        return this.zzb;
    }

    public boolean getStartMuted() {
        return this.zza;
    }

    public VideoOptions(zzgc zzgcVar) {
        this.zza = zzgcVar.zza;
        this.zzb = zzgcVar.zzb;
        this.zzc = zzgcVar.zzc;
    }
}
