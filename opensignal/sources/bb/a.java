package bb;

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
    public final HashMap f2500a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f2501b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f2502c;

    /* renamed from: d, reason: collision with root package name */
    public final Random f2503d;

    public a() {
        Random random = new Random();
        this.f2502c = new HashMap();
        this.f2503d = random;
        this.f2500a = new HashMap();
        this.f2501b = new HashMap();
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
        HashMap map = this.f2500a;
        b(jElapsedRealtime, map);
        HashMap map2 = this.f2501b;
        b(jElapsedRealtime, map2);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            cb.b bVar = (cb.b) list.get(i10);
            if (!map.containsKey(bVar.f3531b) && !map2.containsKey(Integer.valueOf(bVar.f3532c))) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    public final cb.b c(List list) {
        cb.b bVar;
        ArrayList arrayListA = a(list);
        if (arrayListA.size() < 2) {
            return (cb.b) s.h(null, arrayListA);
        }
        Collections.sort(arrayListA, new androidx.media3.exoplayer.trackselection.d(8));
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        int i11 = ((cb.b) arrayListA.get(0)).f3532c;
        int i12 = 0;
        while (true) {
            if (i12 >= arrayListA.size()) {
                break;
            }
            cb.b bVar2 = (cb.b) arrayListA.get(i12);
            if (i11 == bVar2.f3532c) {
                arrayList.add(new Pair(bVar2.f3531b, Integer.valueOf(bVar2.f3533d)));
                i12++;
            } else if (arrayList.size() == 1) {
                return (cb.b) arrayListA.get(0);
            }
        }
        HashMap map = this.f2502c;
        cb.b bVar3 = (cb.b) map.get(arrayList);
        if (bVar3 != null) {
            return bVar3;
        }
        List listSubList = arrayListA.subList(0, arrayList.size());
        int i13 = 0;
        for (int i14 = 0; i14 < listSubList.size(); i14++) {
            i13 += ((cb.b) listSubList.get(i14)).f3533d;
        }
        int iNextInt = this.f2503d.nextInt(i13);
        int i15 = 0;
        while (true) {
            if (i10 >= listSubList.size()) {
                bVar = (cb.b) s.i(listSubList);
                break;
            }
            bVar = (cb.b) listSubList.get(i10);
            i15 += bVar.f3533d;
            if (iNextInt < i15) {
                break;
            }
            i10++;
        }
        map.put(arrayList, bVar);
        return bVar;
    }
}
