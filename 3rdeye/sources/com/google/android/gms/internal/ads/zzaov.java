package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzaov {
    public final int zza;
    public final long zzb;

    private zzaov(int i, long j4) {
        this.zza = i;
        this.zzb = j4;
    }

    public static zzaov zza(zzadu zzaduVar, zzen zzenVar) throws IOException {
        zzaduVar.zzh(zzenVar.zzN(), 0, 8);
        zzenVar.zzL(0);
        return new zzaov(zzenVar.zzg(), zzenVar.zzs());
    }
}
