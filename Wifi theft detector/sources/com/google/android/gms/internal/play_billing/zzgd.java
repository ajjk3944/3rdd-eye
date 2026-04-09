package com.google.android.gms.internal.play_billing;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
final class zzgd extends zzge {
    final /* synthetic */ zzgk zza;
    private int zzb = 0;
    private final int zzc;

    public zzgd(zzgk zzgkVar) {
        this.zza = zzgkVar;
        this.zzc = zzgkVar.zzd();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgg
    public final byte zza() {
        int i10 = this.zzb;
        if (i10 >= this.zzc) {
            throw new NoSuchElementException();
        }
        this.zzb = i10 + 1;
        return this.zza.zzb(i10);
    }
}
