package com.google.android.gms.internal.ads;

import G0.p;
import android.media.MediaCodec;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzhn {
    private final MediaCodec.CryptoInfo zza;
    private final MediaCodec.CryptoInfo.Pattern zzb = p.c();

    public /* synthetic */ zzhn(MediaCodec.CryptoInfo cryptoInfo, zzho zzhoVar) {
        this.zza = cryptoInfo;
    }

    public static /* bridge */ /* synthetic */ void zza(zzhn zzhnVar, int i, int i10) {
        MediaCodec.CryptoInfo.Pattern pattern = zzhnVar.zzb;
        pattern.set(i, i10);
        zzhnVar.zza.setPattern(pattern);
    }
}
