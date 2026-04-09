package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzhgc extends zzhfu {
    static {
        zzhfz.zza(Collections.EMPTY_MAP);
    }

    public /* synthetic */ zzhgc(Map map, zzhga zzhgaVar) {
        super(map);
    }

    public static zzhgb zzc(int i) {
        return new zzhgb(i, null);
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, com.google.android.gms.internal.ads.zzhgm
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final Map zzb() {
        LinkedHashMap linkedHashMapZzb = zzhfv.zzb(zza().size());
        for (Map.Entry entry : zza().entrySet()) {
            linkedHashMapZzb.put(entry.getKey(), ((zzhgh) entry.getValue()).zzb());
        }
        return Collections.unmodifiableMap(linkedHashMapZzb);
    }
}
