package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes2.dex */
final class zzfvp extends zzfvr {
    public zzfvp(zzfvt zzfvtVar, CharSequence charSequence, int i) {
        super(zzfvtVar, charSequence);
    }

    @Override // com.google.android.gms.internal.ads.zzfvr
    public final int zzd(int i) {
        int i10 = i + 4000;
        if (i10 < ((zzfvr) this).zzb.length()) {
            return i10;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzfvr
    public final int zzc(int i) {
        return i;
    }
}
