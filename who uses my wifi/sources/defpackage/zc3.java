package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.WeakHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class zc3 {
    public static final zc3 g = new zc3();
    public static final Handler h = new Handler(Looper.getMainLooper());
    public static Handler i = null;
    public static final vr j = new vr(7);
    public static final vr k = new vr(8);
    public long f;
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public final x03 d = new x03();
    public final mr2 c = new mr2(10);
    public final lv2 e = new lv2(new t83(29));

    public static void b() {
        if (i == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            i = handler;
            handler.post(j);
            i.postDelayed(k, 200L);
        }
    }

    public final void a(View view, rc3 rc3Var, JSONObject jSONObject, boolean z) {
        Object obj;
        boolean z2;
        int i2;
        if (pu1.q(view) == null) {
            x03 x03Var = this.d;
            char c = ((HashSet) x03Var.j).contains(view) ? (char) 1 : x03Var.f ? (char) 2 : (char) 3;
            if (c == 3) {
                return;
            }
            JSONObject jSONObjectF = rc3Var.f(view);
            vc3.c(jSONObject, jSONObjectF);
            HashMap map = (HashMap) x03Var.g;
            if (map.size() == 0) {
                obj = null;
            } else {
                Object obj2 = (String) map.get(view);
                if (obj2 != null) {
                    map.remove(view);
                }
                obj = obj2;
            }
            boolean z3 = false;
            if (obj != null) {
                try {
                    jSONObjectF.put("adSessionId", obj);
                } catch (JSONException e) {
                    ob1.w("Error with setting ad session id", e);
                }
                WeakHashMap weakHashMap = (WeakHashMap) x03Var.o;
                if (weakHashMap.containsKey(view)) {
                    weakHashMap.put(view, Boolean.TRUE);
                } else {
                    z3 = true;
                }
                try {
                    jSONObjectF.put("hasWindowFocus", Boolean.valueOf(z3));
                } catch (JSONException e2) {
                    ob1.w("Error with setting has window focus", e2);
                }
                boolean zContains = ((HashSet) x03Var.n).contains(obj);
                Object objValueOf = Boolean.valueOf(zContains);
                if (zContains) {
                    try {
                        jSONObjectF.put("isPipActive", objValueOf);
                    } catch (JSONException e3) {
                        ob1.w("Error with setting is picture-in-picture active", e3);
                    }
                }
                x03Var.f = true;
                return;
            }
            HashMap map2 = (HashMap) x03Var.h;
            xc3 xc3Var = (xc3) map2.get(view);
            if (xc3Var != null) {
                map2.remove(view);
            }
            if (xc3Var != null) {
                lc3 lc3Var = xc3Var.a;
                JSONArray jSONArray = new JSONArray();
                ArrayList arrayList = xc3Var.b;
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    jSONArray.put((String) arrayList.get(i3));
                }
                try {
                    jSONObjectF.put("isFriendlyObstructionFor", jSONArray);
                    jSONObjectF.put("friendlyObstructionClass", lc3Var.b);
                    jSONObjectF.put("friendlyObstructionPurpose", lc3Var.c);
                    jSONObjectF.put("friendlyObstructionReason", lc3Var.d);
                } catch (JSONException e4) {
                    ob1.w("Error with setting friendly obstruction", e4);
                }
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z4 = z || z2;
            boolean z5 = c == 1;
            rc3Var.getClass();
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (!z5) {
                    for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                        a(viewGroup.getChildAt(i4), rc3Var, jSONObjectF, z4);
                    }
                    return;
                }
                HashMap map3 = new HashMap();
                for (int i5 = 0; i5 < viewGroup.getChildCount(); i5++) {
                    View childAt = viewGroup.getChildAt(i5);
                    ArrayList arrayList2 = (ArrayList) map3.get(Float.valueOf(childAt.getZ()));
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        map3.put(Float.valueOf(childAt.getZ()), arrayList2);
                    }
                    arrayList2.add(childAt);
                }
                ArrayList arrayList3 = new ArrayList(map3.keySet());
                Collections.sort(arrayList3);
                int size2 = arrayList3.size();
                int i6 = 0;
                while (i6 < size2) {
                    ArrayList arrayList4 = (ArrayList) map3.get((Float) arrayList3.get(i6));
                    int size3 = arrayList4.size();
                    int i7 = 0;
                    while (true) {
                        i2 = i6 + 1;
                        if (i7 < size3) {
                            a((View) arrayList4.get(i7), rc3Var, jSONObjectF, z4);
                            i7++;
                        }
                    }
                    i6 = i2;
                }
            }
        }
    }
}
