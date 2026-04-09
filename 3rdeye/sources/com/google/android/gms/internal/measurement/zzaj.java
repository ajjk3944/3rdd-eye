package com.google.android.gms.internal.measurement;

import N7.G8;
import androidx.work.s;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@21.1.1 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zzaj {
    public static zzap zza(zzal zzalVar, zzap zzapVar, zzg zzgVar, List list) {
        if (zzalVar.zzt(zzapVar.zzi())) {
            zzap zzapVarZzf = zzalVar.zzf(zzapVar.zzi());
            if (zzapVarZzf instanceof zzai) {
                return ((zzai) zzapVarZzf).zza(zzgVar, list);
            }
            throw new IllegalArgumentException(G8.s(zzapVar.zzi(), " is not a function"));
        }
        if (!"hasOwnProperty".equals(zzapVar.zzi())) {
            throw new IllegalArgumentException(s.d("Object has no function ", zzapVar.zzi()));
        }
        zzh.zzh("hasOwnProperty", 1, list);
        return zzalVar.zzt(zzgVar.zzb((zzap) list.get(0)).zzi()) ? zzap.zzk : zzap.zzl;
    }

    public static Iterator zzb(Map map) {
        return new zzak(map.keySet().iterator());
    }
}
