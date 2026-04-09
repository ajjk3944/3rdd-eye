package com.google.android.gms.internal.ads;

import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzdxc implements zzhfy {
    public static zzdxc zza() {
        return zzdxb.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, com.google.android.gms.internal.ads.zzhgm
    public final /* synthetic */ Object zzb() {
        com.google.android.gms.ads.internal.zzv.zzr();
        String string = UUID.randomUUID().toString();
        zzhgg.zzb(string);
        return string;
    }
}
