package com.google.android.gms.internal.ads;

import java.nio.charset.StandardCharsets;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzafr implements zzafh {
    public final String zza;

    private zzafr(String str) {
        this.zza = str;
    }

    public static zzafr zzb(zzen zzenVar) {
        return new zzafr(zzenVar.zzB(zzenVar.zza(), StandardCharsets.UTF_8));
    }

    @Override // com.google.android.gms.internal.ads.zzafh
    public final int zza() {
        return 1852994675;
    }
}
