package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzcqx implements zzcqy {
    private final Map zza;

    public zzcqx(Map map) {
        this.zza = map;
    }

    @Override // com.google.android.gms.internal.ads.zzcqy
    public final zzede zza(int i, String str) {
        return (zzede) this.zza.get(str);
    }
}
