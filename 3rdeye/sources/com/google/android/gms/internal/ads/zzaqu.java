package com.google.android.gms.internal.ads;

import g0.C4356c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzaqu {
    long zza;
    final String zzb;
    final String zzc;
    final long zzd;
    final long zze;
    final long zzf;
    final long zzg;
    final List zzh;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v2 */
    public zzaqu(String str, zzapk zzapkVar) {
        String str2 = zzapkVar.zzb;
        long j4 = zzapkVar.zzc;
        long j10 = zzapkVar.zzd;
        long j11 = zzapkVar.zze;
        long j12 = zzapkVar.zzf;
        List arrayList = zzapkVar.zzh;
        if (arrayList == 0) {
            Map map = zzapkVar.zzg;
            arrayList = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add(new zzapt((String) entry.getKey(), (String) entry.getValue()));
            }
        }
        this(str, str2, j4, j10, j11, j12, arrayList);
    }

    public static zzaqu zza(zzaqv zzaqvVar) throws IOException {
        if (zzaqx.zze(zzaqvVar) != 538247942) {
            throw new IOException();
        }
        String strZzh = zzaqx.zzh(zzaqvVar);
        String strZzh2 = zzaqx.zzh(zzaqvVar);
        long jZzf = zzaqx.zzf(zzaqvVar);
        long jZzf2 = zzaqx.zzf(zzaqvVar);
        long jZzf3 = zzaqx.zzf(zzaqvVar);
        long jZzf4 = zzaqx.zzf(zzaqvVar);
        int iZze = zzaqx.zze(zzaqvVar);
        if (iZze < 0) {
            throw new IOException(C4356c.h(iZze, "readHeaderList size="));
        }
        List arrayList = iZze == 0 ? Collections.EMPTY_LIST : new ArrayList();
        for (int i = 0; i < iZze; i++) {
            arrayList.add(new zzapt(zzaqx.zzh(zzaqvVar).intern(), zzaqx.zzh(zzaqvVar).intern()));
        }
        return new zzaqu(strZzh, strZzh2, jZzf, jZzf2, jZzf3, jZzf4, arrayList);
    }

    private zzaqu(String str, String str2, long j4, long j10, long j11, long j12, List list) {
        this.zzb = str;
        this.zzc = true == "".equals(str2) ? null : str2;
        this.zzd = j4;
        this.zze = j10;
        this.zzf = j11;
        this.zzg = j12;
        this.zzh = list;
    }
}
