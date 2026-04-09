package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzamg implements Comparable {
    public final int zza;
    public final zzamb zzb;

    public zzamg(int i, zzamb zzambVar) {
        this.zza = i;
        this.zzb = zzambVar;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Integer.compare(this.zza, ((zzamg) obj).zza);
    }
}
