package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes2.dex */
final class zzfvo extends zzfvr {
    final /* synthetic */ zzfuq zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfvo(zzfvt zzfvtVar, CharSequence charSequence, zzfuq zzfuqVar) {
        super(zzfvtVar, charSequence);
        this.zza = zzfuqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfvr
    public final int zzc(int i) {
        return ((zzfuu) this.zza).zza.end();
    }

    @Override // com.google.android.gms.internal.ads.zzfvr
    public final int zzd(int i) {
        Matcher matcher = ((zzfuu) this.zza).zza;
        if (matcher.find(i)) {
            return matcher.start();
        }
        return -1;
    }
}
