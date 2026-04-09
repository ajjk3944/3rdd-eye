package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes2.dex */
final class zzgvs extends zzgvr {
    final /* synthetic */ zzgvt zza;

    public zzgvs(zzgvt zzgvtVar, int i10) {
        Objects.requireNonNull(zzgvtVar);
        this.zza = zzgvtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgvr
    public final zzgva zza() {
        return new zzgvv(this.zza.zza(), new zzgvq(2));
    }
}
