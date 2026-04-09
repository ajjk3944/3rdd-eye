package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzcei;

/* loaded from: classes2.dex */
public abstract class zzb {
    private final Runnable zza = new zza(this);
    private volatile Thread zzb;

    public abstract void zza();

    public com.google.common.util.concurrent.a zzb() {
        return zzcei.zza.zza(this.zza);
    }

    public final /* synthetic */ void zzc(Thread thread) {
        this.zzb = thread;
    }
}
