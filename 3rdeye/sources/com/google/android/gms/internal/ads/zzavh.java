package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzavh implements zzfpa {
    final /* synthetic */ zzfnz zza;

    public zzavh(zzfnz zzfnzVar) {
        this.zza = zzfnzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfpa
    public final void zza(int i, long j4) {
        this.zza.zzd(i, System.currentTimeMillis() - j4);
    }

    @Override // com.google.android.gms.internal.ads.zzfpa
    public final void zzb(int i, long j4, String str) {
        this.zza.zze(i, System.currentTimeMillis() - j4, str);
    }
}
