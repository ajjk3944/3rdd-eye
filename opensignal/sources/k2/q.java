package k2;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f13998a;

    public q(p... pVarArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (pVarArr.length > 0) {
            p pVar = pVarArr[0];
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            if (list.size() != 1) {
                throw new IllegalArgumentException(h0.b.r(c7.a.u("'", str, "' must be unique. Actual [ ["), mq.o.x0(list, null, null, null, null, 63), ']').toString());
            }
            mq.t.d0(arrayList, list);
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.f13998a = arrayList2;
        if (arrayList2.size() > 0) {
            throw h0.b.e(0, arrayList2);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q) {
            return br.l.a(this.f13998a, ((q) obj).f13998a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f13998a.hashCode();
    }
}
