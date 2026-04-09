package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzbdd {
    public static List zza() {
        ArrayList arrayList = new ArrayList();
        zzc(arrayList, zzbem.zzc("gad:dynamite_module:experiment_id", ""));
        zzc(arrayList, zzbez.zza);
        zzc(arrayList, zzbez.zzb);
        zzc(arrayList, zzbez.zzc);
        zzc(arrayList, zzbez.zzd);
        zzc(arrayList, zzbez.zze);
        zzc(arrayList, zzbez.zzu);
        zzc(arrayList, zzbez.zzf);
        zzc(arrayList, zzbez.zzm);
        zzc(arrayList, zzbez.zzn);
        zzc(arrayList, zzbez.zzo);
        zzc(arrayList, zzbez.zzp);
        zzc(arrayList, zzbez.zzq);
        zzc(arrayList, zzbez.zzr);
        zzc(arrayList, zzbez.zzs);
        zzc(arrayList, zzbez.zzt);
        zzc(arrayList, zzbez.zzg);
        zzc(arrayList, zzbez.zzh);
        zzc(arrayList, zzbez.zzi);
        zzc(arrayList, zzbez.zzj);
        zzc(arrayList, zzbez.zzk);
        zzc(arrayList, zzbez.zzl);
        return arrayList;
    }

    public static List zzb() {
        ArrayList arrayList = new ArrayList();
        zzc(arrayList, zzbfn.zza);
        return arrayList;
    }

    private static void zzc(List list, zzbem zzbemVar) {
        String str = (String) zzbemVar.zze();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        list.add(str);
    }
}
