package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzgcp implements Comparable {
    final Runnable zza;
    final long zzb;

    public zzgcp(Runnable runnable, long j10) {
        this.zza = runnable;
        this.zzb = j10;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Long.compare(this.zzb, ((zzgcp) obj).zzb);
    }
}
