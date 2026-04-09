package i7;

import io.sentry.android.core.e0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f11274a;

    public m(int i10) {
        switch (i10) {
            case 1:
                this.f11274a = new LinkedHashMap();
                break;
            case 2:
                this.f11274a = new LinkedHashMap();
                break;
            default:
                this.f11274a = new LinkedHashMap();
                break;
        }
    }

    public void a(bm.a... aVarArr) {
        br.l.e(aVarArr, "migrations");
        for (bm.a aVar : aVarArr) {
            int i10 = aVar.f2820a;
            int i11 = aVar.f2821b;
            Integer numValueOf = Integer.valueOf(i10);
            LinkedHashMap linkedHashMap = this.f11274a;
            Object treeMap = linkedHashMap.get(numValueOf);
            if (treeMap == null) {
                treeMap = new TreeMap();
                linkedHashMap.put(numValueOf, treeMap);
            }
            TreeMap treeMap2 = (TreeMap) treeMap;
            if (treeMap2.containsKey(Integer.valueOf(i11))) {
                e0.p("ROOM", "Overriding migration " + treeMap2.get(Integer.valueOf(i11)) + " with " + aVar);
            }
            treeMap2.put(Integer.valueOf(i11), aVar);
        }
    }

    public List b() {
        List listQ0;
        synchronized (this.f11274a) {
            listQ0 = mq.o.Q0(this.f11274a.values());
        }
        return listQ0;
    }
}
