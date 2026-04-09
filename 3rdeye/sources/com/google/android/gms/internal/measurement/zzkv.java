package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.1.1 */
/* loaded from: classes2.dex */
final class zzkv extends zzkz {
    private static final Class zza = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    public /* synthetic */ zzkv(zzku zzkuVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.measurement.zzkz
    public final void zza(Object obj, long j4) {
        Object objUnmodifiableList;
        List list = (List) zzmx.zzf(obj, j4);
        if (list instanceof zzkt) {
            objUnmodifiableList = ((zzkt) list).zze();
        } else {
            if (zza.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof zzls) && (list instanceof zzkl)) {
                zzkl zzklVar = (zzkl) list;
                if (zzklVar.zzc()) {
                    zzklVar.zzb();
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        zzmx.zzs(obj, j4, objUnmodifiableList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.zzkz
    public final void zzb(Object obj, Object obj2, long j4) {
        zzks zzksVar;
        List list = (List) zzmx.zzf(obj2, j4);
        int size = list.size();
        List listZzd = (List) zzmx.zzf(obj, j4);
        if (listZzd.isEmpty()) {
            listZzd = listZzd instanceof zzkt ? new zzks(size) : ((listZzd instanceof zzls) && (listZzd instanceof zzkl)) ? ((zzkl) listZzd).zzd(size) : new ArrayList(size);
            zzmx.zzs(obj, j4, listZzd);
        } else {
            if (zza.isAssignableFrom(listZzd.getClass())) {
                ArrayList arrayList = new ArrayList(listZzd.size() + size);
                arrayList.addAll(listZzd);
                zzmx.zzs(obj, j4, arrayList);
                zzksVar = arrayList;
            } else if (listZzd instanceof zzms) {
                zzks zzksVar2 = new zzks(listZzd.size() + size);
                zzksVar2.addAll(zzksVar2.size(), (zzms) listZzd);
                zzmx.zzs(obj, j4, zzksVar2);
                zzksVar = zzksVar2;
            } else if ((listZzd instanceof zzls) && (listZzd instanceof zzkl)) {
                zzkl zzklVar = (zzkl) listZzd;
                if (!zzklVar.zzc()) {
                    listZzd = zzklVar.zzd(listZzd.size() + size);
                    zzmx.zzs(obj, j4, listZzd);
                }
            }
            listZzd = zzksVar;
        }
        int size2 = listZzd.size();
        int size3 = list.size();
        if (size2 > 0 && size3 > 0) {
            listZzd.addAll(list);
        }
        if (size2 > 0) {
            list = listZzd;
        }
        zzmx.zzs(obj, j4, list);
    }

    private zzkv() {
        super(null);
    }
}
