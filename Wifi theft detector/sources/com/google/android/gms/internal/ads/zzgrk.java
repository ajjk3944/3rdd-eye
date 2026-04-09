package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzgrk extends zzgrp {
    public zzgrk(zzgrr zzgrrVar, CharSequence charSequence, int i10) {
        super(zzgrrVar, charSequence);
    }

    @Override // com.google.android.gms.internal.ads.zzgrp
    public final int zzc(int i10) {
        int i11 = i10 + 4000;
        if (i11 < ((zzgrp) this).zzb.length()) {
            return i11;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzgrp
    public final int zzd(int i10) {
        return i10;
    }
}
