package com.google.android.gms.internal.ads;

import g0.C4356c;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzqn extends Exception {
    public final int zza;
    public final boolean zzb;
    public final zzz zzc;

    public zzqn(int i, zzz zzzVar, boolean z10) {
        super(C4356c.h(i, "AudioTrack write failed: "));
        this.zzb = z10;
        this.zza = i;
        this.zzc = zzzVar;
    }
}
