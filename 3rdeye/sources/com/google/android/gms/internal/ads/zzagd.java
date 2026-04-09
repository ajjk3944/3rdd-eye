package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
abstract class zzagd {
    protected final zzaez zza;

    public zzagd(zzaez zzaezVar) {
        this.zza = zzaezVar;
    }

    public abstract boolean zza(zzen zzenVar) throws zzaz;

    public abstract boolean zzb(zzen zzenVar, long j4) throws zzaz;

    public final boolean zzf(zzen zzenVar, long j4) throws zzaz {
        return zza(zzenVar) && zzb(zzenVar, j4);
    }
}
