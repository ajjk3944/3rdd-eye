package com.google.android.gms.internal.ads;

import java.util.LinkedHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public class zzhft {
    final LinkedHashMap zza;

    public zzhft(int i) {
        this.zza = zzhfv.zzb(i);
    }

    public final zzhft zza(Object obj, zzhgh zzhghVar) {
        zzhgg.zza(obj, "key");
        zzhgg.zza(zzhghVar, "provider");
        this.zza.put(obj, zzhghVar);
        return this;
    }
}
