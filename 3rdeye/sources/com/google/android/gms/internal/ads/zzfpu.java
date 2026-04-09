package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzfpu extends Exception {
    private final int zza;

    public zzfpu(int i, String str) {
        super(str);
        this.zza = i;
    }

    public final int zza() {
        return this.zza;
    }

    public zzfpu(int i, Throwable th) {
        super(th);
        this.zza = i;
    }
}
