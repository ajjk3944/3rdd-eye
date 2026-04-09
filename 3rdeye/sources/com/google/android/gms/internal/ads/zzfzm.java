package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzfzm extends zzfwg {
    final transient zzfvw zza;

    public zzfzm(Map map, zzfvw zzfvwVar) {
        super(map);
        this.zza = zzfvwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfwg, com.google.android.gms.internal.ads.zzfwx
    public final /* bridge */ /* synthetic */ Collection zza() {
        return (List) this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzfwx, com.google.android.gms.internal.ads.zzfxa
    public final Map zzj() {
        return zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzfwx, com.google.android.gms.internal.ads.zzfxa
    public final Set zzl() {
        return zzm();
    }
}
