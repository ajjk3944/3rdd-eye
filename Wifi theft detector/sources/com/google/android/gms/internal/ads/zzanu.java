package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzanu implements Comparable {
    public final int zza;
    public final zzanp zzb;

    public zzanu(int i10, zzanp zzanpVar) {
        this.zza = i10;
        this.zzb = zzanpVar;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Integer.compare(this.zza, ((zzanu) obj).zza);
    }
}
