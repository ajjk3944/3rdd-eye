package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzamn implements zzakm {
    private final List zza;
    private final long[] zzb;
    private final long[] zzc;

    public zzamn(List list) {
        this.zza = Collections.unmodifiableList(new ArrayList(list));
        int size = list.size();
        this.zzb = new long[size + size];
        for (int i = 0; i < list.size(); i++) {
            zzamc zzamcVar = (zzamc) list.get(i);
            long[] jArr = this.zzb;
            int i10 = i + i;
            jArr[i10] = zzamcVar.zzb;
            jArr[i10 + 1] = zzamcVar.zzc;
        }
        long[] jArr2 = this.zzb;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.zzc = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    @Override // com.google.android.gms.internal.ads.zzakm
    public final int zza() {
        return this.zzc.length;
    }

    @Override // com.google.android.gms.internal.ads.zzakm
    public final long zzb(int i) {
        zzdd.zzd(i >= 0);
        long[] jArr = this.zzc;
        zzdd.zzd(i < jArr.length);
        return jArr[i];
    }

    @Override // com.google.android.gms.internal.ads.zzakm
    public final List zzc(long j4) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        while (true) {
            List list = this.zza;
            if (i >= list.size()) {
                break;
            }
            long[] jArr = this.zzb;
            int i10 = i + i;
            if (jArr[i10] <= j4 && j4 < jArr[i10 + 1]) {
                zzamc zzamcVar = (zzamc) list.get(i);
                zzcu zzcuVar = zzamcVar.zza;
                if (zzcuVar.zze == -3.4028235E38f) {
                    arrayList2.add(zzamcVar);
                } else {
                    arrayList.add(zzcuVar);
                }
            }
            i++;
        }
        Collections.sort(arrayList2, new Comparator() { // from class: com.google.android.gms.internal.ads.zzamm
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Long.compare(((zzamc) obj).zzb, ((zzamc) obj2).zzb);
            }
        });
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            zzcs zzcsVarZzb = ((zzamc) arrayList2.get(i11)).zza.zzb();
            zzcsVarZzb.zze((-1) - i11, 1);
            arrayList.add(zzcsVarZzb.zzq());
        }
        return arrayList;
    }
}
