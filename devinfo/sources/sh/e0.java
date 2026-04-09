package sh;

import android.content.SharedPreferences;
import com.liuzh.deviceinfo.R;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class e0 {

    /* renamed from: a, reason: collision with root package name */
    public static final List f33672a;

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f33673b;

    /* renamed from: c, reason: collision with root package name */
    public static final HashMap f33674c;

    /* renamed from: d, reason: collision with root package name */
    public static final LinkedHashSet f33675d;

    static {
        List<c0> listT = cm.g.t(new c0(l.class, R.string.tab_dashboard, "TAB_DASHBOARD", true), new c0(p.class, R.string.tab_device, "TAB_DEVICE", true), new c0(q0.class, R.string.system, "TAB_SYSTEM", true), new c0(uh.a.class, R.string.tab_cpu, "TAB_CPU", true), new c0(a0.class, R.string.tab_gps, "TAB_GPS", true), new c0(k0.class, R.string.network, "TAB_NETWORK", true), new c0(p0.class, R.string.storage, "TAB_STORAGE", true), new c0(b.class, R.string.battery, "TAB_BATTERY", true), new c0(q.class, R.string.display, "TAB_DISPLAY", true), new c0(d.class, R.string.camera, "TAB_CAMERA", true), new c0(c1.class, R.string.temperature, "TAB_THERMAL", true), new c0(n0.class, R.string.sensors, "TAB_SENSORS", true), new c0(th.f.class, R.string.apps, "TAB_APPS", true), new c0(x0.class, R.string.testes, "TAB_TESTS", true));
        f33672a = listT;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        for (c0 c0Var : listT) {
            map.put(c0Var.f33652a, c0Var);
            map2.put(c0Var.f33654c, c0Var);
        }
        f33673b = map;
        f33674c = map2;
        f33675d = new LinkedHashSet();
    }

    public static ArrayList a() {
        File[] fileArrListFiles;
        boolean zBooleanValue;
        ArrayList arrayList = new ArrayList();
        for (c0 c0Var : f33672a) {
            if (!nk.k.a(c0Var.f33654c, "TAB_CAMERA") || !com.liuzh.deviceinfo.utilities.d.k()) {
                if (nk.k.a(c0Var.f33654c, "TAB_THERMAL")) {
                    Boolean bool = com.liuzh.deviceinfo.utilities.l.f21278a;
                    if (bool != null) {
                        zBooleanValue = bool.booleanValue();
                    } else {
                        File file = new File("/sys/devices/virtual/thermal/");
                        if (!file.exists() || (fileArrListFiles = file.listFiles()) == null || fileArrListFiles.length == 1) {
                            com.liuzh.deviceinfo.utilities.l.f21278a = Boolean.FALSE;
                            zBooleanValue = false;
                        } else {
                            com.liuzh.deviceinfo.utilities.l.f21278a = Boolean.TRUE;
                            zBooleanValue = true;
                        }
                    }
                    if (!zBooleanValue) {
                    }
                }
                arrayList.add(c0Var);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.List] */
    public static List b() {
        Object objH;
        ArrayList<c0> arrayListA = a();
        ArrayList arrayList = new ArrayList(zj.o.T(arrayListA, 10));
        int size = arrayListA.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayListA.get(i4);
            i4++;
            arrayList.add(((c0) obj).f33654c);
        }
        Set setV0 = zj.n.v0(arrayList);
        com.liuzh.deviceinfo.utilities.f fVar = com.liuzh.deviceinfo.utilities.f.f21256b;
        SharedPreferences sharedPreferences = com.liuzh.deviceinfo.utilities.f.f21257c;
        String string = sharedPreferences.getString("custom_tabs_new", null);
        String string2 = sharedPreferences.getString("custom_tabs", null);
        HashMap map = f33674c;
        if (string != null) {
            try {
                Object objC = new com.google.gson.j().c(string, new xf.a(new d0().f37088b));
                nk.k.d(objC, "fromJson(...)");
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : (Iterable) objC) {
                    if (setV0.contains(((b0) obj2).f33647a)) {
                        arrayList2.add(obj2);
                    }
                }
                ArrayList arrayList3 = new ArrayList(zj.o.T(arrayList2, 10));
                int size2 = arrayList2.size();
                int i10 = 0;
                while (i10 < size2) {
                    Object obj3 = arrayList2.get(i10);
                    i10++;
                    b0 b0Var = (b0) obj3;
                    Object obj4 = map.get(b0Var.f33647a);
                    nk.k.b(obj4);
                    arrayList3.add(c0.a((c0) obj4, b0Var.f33648b));
                }
                ArrayList arrayList4 = new ArrayList();
                int size3 = arrayListA.size();
                int i11 = 0;
                while (i11 < size3) {
                    Object obj5 = arrayListA.get(i11);
                    i11++;
                    c0 c0Var = (c0) obj5;
                    if (!arrayList3.isEmpty()) {
                        int size4 = arrayList3.size();
                        int i12 = 0;
                        while (i12 < size4) {
                            Object obj6 = arrayList3.get(i12);
                            i12++;
                            if (nk.k.a(((c0) obj6).f33654c, c0Var.f33654c)) {
                                break;
                            }
                        }
                    }
                    arrayList4.add(obj5);
                }
                objH = zj.n.j0(arrayList3, arrayList4);
            } catch (Throwable th2) {
                objH = ci.b.h(th2);
            }
            ?? r62 = (List) (objH instanceof yj.k ? null : objH);
            if (r62 != 0) {
                arrayListA = r62;
            }
        } else if (string2 != null && !vk.i.H0(string2)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            List listQ0 = vk.i.Q0(string2, new String[]{"#"});
            ArrayList arrayList5 = new ArrayList();
            for (Object obj7 : listQ0) {
                String str = (String) obj7;
                boolean z3 = map.containsKey(str) && setV0.contains(str) && !linkedHashSet.contains(str);
                if (z3) {
                    linkedHashSet.add(str);
                }
                if (z3) {
                    arrayList5.add(obj7);
                }
            }
            ArrayList arrayList6 = new ArrayList(zj.o.T(arrayList5, 10));
            int size5 = arrayList5.size();
            int i13 = 0;
            while (i13 < size5) {
                Object obj8 = arrayList5.get(i13);
                i13++;
                Object obj9 = map.get((String) obj8);
                nk.k.b(obj9);
                arrayList6.add((c0) obj9);
            }
            ArrayList arrayList7 = new ArrayList();
            int size6 = arrayListA.size();
            int i14 = 0;
            while (i14 < size6) {
                Object obj10 = arrayListA.get(i14);
                i14++;
                if (!linkedHashSet.contains(((c0) obj10).f33654c)) {
                    arrayList7.add(obj10);
                }
            }
            ArrayList arrayListJ0 = zj.n.j0(arrayList6, arrayList7);
            arrayListA = new ArrayList(zj.o.T(arrayListJ0, 10));
            int size7 = arrayListJ0.size();
            int i15 = 0;
            while (i15 < size7) {
                Object obj11 = arrayListJ0.get(i15);
                i15++;
                c0 c0Var2 = (c0) obj11;
                arrayListA.add(c0.a(c0Var2, linkedHashSet.contains(c0Var2.f33654c)));
            }
        }
        if (string == null) {
            com.google.gson.j jVar = new com.google.gson.j();
            ArrayList arrayList8 = new ArrayList(zj.o.T(arrayListA, 10));
            for (c0 c0Var3 : arrayListA) {
                arrayList8.add(new b0(c0Var3.f33654c, c0Var3.f33655d));
            }
            com.liuzh.deviceinfo.utilities.f.m("custom_tabs_new", jVar.g(arrayList8));
        }
        if (string2 != null) {
            com.liuzh.deviceinfo.utilities.f.f21257c.edit().remove("custom_tabs").apply();
        }
        return arrayListA;
    }
}
