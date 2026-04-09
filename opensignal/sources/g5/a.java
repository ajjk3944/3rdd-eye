package g5;

import android.os.SystemClock;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import oe.s;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f9333a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f9334b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f9335c;

    /* renamed from: d, reason: collision with root package name */
    public final Random f9336d;

    public a() {
        Random random = new Random();
        this.f9335c = new HashMap();
        this.f9336d = random;
        this.f9333a = new HashMap();
        this.f9334b = new HashMap();
    }

    public static void b(long j, HashMap map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            if (((Long) entry.getValue()).longValue() <= j) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            map.remove(arrayList.get(i10));
        }
    }

    public final ArrayList a(List list) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        HashMap map = this.f9333a;
        b(jElapsedRealtime, map);
        HashMap map2 = this.f9334b;
        b(jElapsedRealtime, map2);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            h5.b bVar = (h5.b) list.get(i10);
            if (!map.containsKey(bVar.f9905b) && !map2.containsKey(Integer.valueOf(bVar.f9906c))) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    public final h5.b c(List list) {
        h5.b bVar;
        ArrayList arrayListA = a(list);
        if (arrayListA.size() < 2) {
            return (h5.b) s.h(null, arrayListA);
        }
        Collections.sort(arrayListA, new androidx.media3.exoplayer.trackselection.d(12));
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        int i11 = ((h5.b) arrayListA.get(0)).f9906c;
        int i12 = 0;
        while (true) {
            if (i12 >= arrayListA.size()) {
                break;
            }
            h5.b bVar2 = (h5.b) arrayListA.get(i12);
            if (i11 == bVar2.f9906c) {
                arrayList.add(new Pair(bVar2.f9905b, Integer.valueOf(bVar2.f9907d)));
                i12++;
            } else if (arrayList.size() == 1) {
                return (h5.b) arrayListA.get(0);
            }
        }
        HashMap map = this.f9335c;
        h5.b bVar3 = (h5.b) map.get(arrayList);
        if (bVar3 != null) {
            return bVar3;
        }
        List listSubList = arrayListA.subList(0, arrayList.size());
        int i13 = 0;
        for (int i14 = 0; i14 < listSubList.size(); i14++) {
            i13 += ((h5.b) listSubList.get(i14)).f9907d;
        }
        int iNextInt = this.f9336d.nextInt(i13);
        int i15 = 0;
        while (true) {
            if (i10 >= listSubList.size()) {
                bVar = (h5.b) s.i(listSubList);
                break;
            }
            bVar = (h5.b) listSubList.get(i10);
            i15 += bVar.f9907d;
            if (iNextInt < i15) {
                break;
            }
            i10++;
        }
        map.put(arrayList, bVar);
        return bVar;
    }
}
