package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzfye extends zzfyf {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzfyf zzc;

    public zzfye(zzfyf zzfyfVar, int i, int i10) {
        this.zzc = zzfyfVar;
        this.zza = i;
        this.zzb = i10;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzfve.zza(i, this.zzb, "index");
        return this.zzc.get(i + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public final boolean zzf() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public final Object[] zzg() {
        return this.zzc.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzfyf, java.util.List
    /* renamed from: zzh */
    public final zzfyf subList(int i, int i10) {
        zzfve.zzk(i, i10, this.zzb);
        int i11 = this.zza;
        return this.zzc.subList(i + i11, i10 + i11);
    }
}
