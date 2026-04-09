package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
final class zzkt extends zzkx {
    private static final Class zza = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    public /* synthetic */ zzkt(zzks zzksVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.measurement.zzkx
    public final void zza(Object obj, long j10) {
        Object objUnmodifiableList;
        List list = (List) zzmv.zzf(obj, j10);
        if (list instanceof zzkr) {
            objUnmodifiableList = ((zzkr) list).zze();
        } else {
            if (zza.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof zzlq) && (list instanceof zzkj)) {
                zzkj zzkjVar = (zzkj) list;
                if (zzkjVar.zzc()) {
                    zzkjVar.zzb();
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        zzmv.zzs(obj, j10, objUnmodifiableList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.zzkx
    public final void zzb(Object obj, Object obj2, long j10) {
        zzkq zzkqVar;
        List list = (List) zzmv.zzf(obj2, j10);
        int size = list.size();
        List listZzd = (List) zzmv.zzf(obj, j10);
        if (listZzd.isEmpty()) {
            listZzd = listZzd instanceof zzkr ? new zzkq(size) : ((listZzd instanceof zzlq) && (listZzd instanceof zzkj)) ? ((zzkj) listZzd).zzd(size) : new ArrayList(size);
            zzmv.zzs(obj, j10, listZzd);
        } else {
            if (zza.isAssignableFrom(listZzd.getClass())) {
                ArrayList arrayList = new ArrayList(listZzd.size() + size);
                arrayList.addAll(listZzd);
                zzmv.zzs(obj, j10, arrayList);
                zzkqVar = arrayList;
            } else if (listZzd instanceof zzmq) {
                zzkq zzkqVar2 = new zzkq(listZzd.size() + size);
                zzkqVar2.addAll(zzkqVar2.size(), (zzmq) listZzd);
                zzmv.zzs(obj, j10, zzkqVar2);
                zzkqVar = zzkqVar2;
            } else if ((listZzd instanceof zzlq) && (listZzd instanceof zzkj)) {
                zzkj zzkjVar = (zzkj) listZzd;
                if (!zzkjVar.zzc()) {
                    listZzd = zzkjVar.zzd(listZzd.size() + size);
                    zzmv.zzs(obj, j10, listZzd);
                }
            }
            listZzd = zzkqVar;
        }
        int size2 = listZzd.size();
        int size3 = list.size();
        if (size2 > 0 && size3 > 0) {
            listZzd.addAll(list);
        }
        if (size2 > 0) {
            list = listZzd;
        }
        zzmv.zzs(obj, j10, list);
    }

    private zzkt() {
        super(null);
    }
}
