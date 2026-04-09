package ak;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class g0 {
    public static h0 a(List list) {
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((h0) obj).a() > 0) {
                arrayList.add(obj);
            }
        }
        int iA = 0;
        for (h0 h0Var : mq.o.M0(arrayList, new f0())) {
            iA += h0Var.a();
            map.put(Integer.valueOf(iA), h0Var);
        }
        int iE = fr.d.f9050a.e(100) + 1;
        for (Map.Entry entry : new TreeMap(map).entrySet()) {
            Integer num = (Integer) entry.getKey();
            h0 h0Var2 = (h0) entry.getValue();
            br.l.b(num);
            if (iE <= num.intValue()) {
                br.l.b(h0Var2);
                return h0Var2;
            }
        }
        fr.a aVar = fr.d.f9050a;
        return (h0) mq.o.G0(list);
    }
}
