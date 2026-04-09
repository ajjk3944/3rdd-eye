package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes2.dex */
final class zzfvn extends zzfvr {
    final /* synthetic */ zzfup zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfvn(zzfvt zzfvtVar, CharSequence charSequence, zzfup zzfupVar) {
        super(zzfvtVar, charSequence);
        this.zza = zzfupVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfvr
    public final int zzc(int i) {
        return i + 1;
    }

    @Override // com.google.android.gms.internal.ads.zzfvr
    public final int zzd(int i) {
        CharSequence charSequence = ((zzfvr) this).zzb;
        int length = charSequence.length();
        zzfve.zzb(i, length, "index");
        while (i < length) {
            if (this.zza.zzb(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
