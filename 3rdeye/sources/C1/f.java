package C1;

import C1.g;
import E.u;
import c9.C2092m;
import c9.C2097r;
import com.github.appintro.AppIntroBaseFragmentKt;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import d9.C4284b;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import t4.C5606d;

/* compiled from: SchemaInfoUtil.kt */
/* loaded from: classes.dex */
public final class f {

    /* compiled from: Comparisons.kt */
    public static final class a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return com.google.gson.internal.c.g((Integer) ((Map.Entry) t10).getKey(), (Integer) ((Map.Entry) t11).getKey());
        }
    }

    /* compiled from: Comparisons.kt */
    public static final class b<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return com.google.gson.internal.c.g((Integer) ((Map.Entry) t10).getKey(), (Integer) ((Map.Entry) t11).getKey());
        }
    }

    public static final List<c> a(E1.c cVar) {
        int iO = C5606d.o(cVar, FacebookMediationAdapter.KEY_ID);
        int iO2 = C5606d.o(cVar, "seq");
        int iO3 = C5606d.o(cVar, "from");
        int iO4 = C5606d.o(cVar, "to");
        C4284b c4284bU = u.u();
        while (cVar.x()) {
            c4284bU.add(new c((int) cVar.getLong(iO), (int) cVar.getLong(iO2), cVar.g0(iO3), cVar.g0(iO4)));
        }
        return C2097r.B0(u.m(c4284bU));
    }

    public static final g.d b(E1.a aVar, String str, boolean z10) throws Exception {
        E1.c cVarK0 = aVar.K0("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int iO = C5606d.o(cVarK0, "seqno");
            int iO2 = C5606d.o(cVarK0, "cid");
            int iO3 = C5606d.o(cVarK0, AppMeasurementSdk.ConditionalUserProperty.NAME);
            int iO4 = C5606d.o(cVarK0, AppIntroBaseFragmentKt.ARG_DESC);
            if (iO != -1 && iO2 != -1 && iO3 != -1 && iO4 != -1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                while (cVarK0.x()) {
                    if (((int) cVarK0.getLong(iO2)) >= 0) {
                        int i = (int) cVarK0.getLong(iO);
                        String strG0 = cVarK0.g0(iO3);
                        String str2 = cVarK0.getLong(iO4) > 0 ? "DESC" : "ASC";
                        linkedHashMap.put(Integer.valueOf(i), strG0);
                        linkedHashMap2.put(Integer.valueOf(i), str2);
                    }
                }
                List listC0 = C2097r.C0(new a(), linkedHashMap.entrySet());
                ArrayList arrayList = new ArrayList(C2092m.T(listC0, 10));
                Iterator it = listC0.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((Map.Entry) it.next()).getValue());
                }
                List listG0 = C2097r.G0(arrayList);
                List listC02 = C2097r.C0(new b(), linkedHashMap2.entrySet());
                ArrayList arrayList2 = new ArrayList(C2092m.T(listC02, 10));
                Iterator it2 = listC02.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((String) ((Map.Entry) it2.next()).getValue());
                }
                g.d dVar = new g.d(str, z10, listG0, C2097r.G0(arrayList2));
                cVarK0.close();
                return dVar;
            }
            cVarK0.close();
            return null;
        } finally {
        }
    }
}
