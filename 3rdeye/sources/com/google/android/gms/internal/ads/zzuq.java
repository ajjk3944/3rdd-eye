package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzuq implements zzxb {
    private final zzxb zza;
    private final zzfyf zzb;

    public zzuq(zzxb zzxbVar, List list) {
        this.zza = zzxbVar;
        this.zzb = zzfyf.zzl(list);
    }

    public final zzfyf zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzxb
    public final long zzb() {
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzxb
    public final long zzc() {
        return this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzxb
    public final void zzm(long j4) {
        this.zza.zzm(j4);
    }

    @Override // com.google.android.gms.internal.ads.zzxb
    public final boolean zzo(zzla zzlaVar) {
        return this.zza.zzo(zzlaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzxb
    public final boolean zzp() {
        return this.zza.zzp();
    }
}
