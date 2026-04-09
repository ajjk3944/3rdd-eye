package com.google.android.gms.internal.ads;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzepd implements zzhfy {
    public static zzepd zza() {
        return zzepc.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, com.google.android.gms.internal.ads.zzhgm
    public final /* synthetic */ Object zzb() {
        List arrayList = new ArrayList();
        zzbct zzbctVar = zzbdc.zzlX;
        if (!((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbctVar)).isEmpty()) {
            arrayList = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbctVar)).split(StringUtils.COMMA));
        }
        zzhgg.zzb(arrayList);
        return arrayList;
    }
}
