package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.WeakHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class yu0 {
    public static final yu0 g = new yu0();

    /* renamed from: h, reason: collision with root package name */
    public static final Handler f18866h = new Handler(Looper.getMainLooper());

    /* renamed from: i, reason: collision with root package name */
    public static Handler f18867i = null;
    public static final ce j = new ce(7);

    /* renamed from: k, reason: collision with root package name */
    public static final ce f18868k = new ce(8);

    /* renamed from: f, reason: collision with root package name */
    public long f18874f;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f18869a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f18870b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final xu0 f18872d = new xu0();

    /* renamed from: c, reason: collision with root package name */
    public final rt f18871c = new rt(22);

    /* renamed from: e, reason: collision with root package name */
    public final l90 f18873e = new l90(new av0(0));

    public static void b() {
        if (f18867i == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f18867i = handler;
            handler.post(j);
            f18867i.postDelayed(f18868k, 200L);
        }
    }

    public final void a(View view, rg0 rg0Var, JSONObject jSONObject, boolean z3) {
        Object obj;
        boolean z10;
        int i4;
        if (mq0.f(view) == null) {
            xu0 xu0Var = this.f18872d;
            char c9 = xu0Var.f18503d.contains(view) ? (char) 1 : xu0Var.j ? (char) 2 : (char) 3;
            if (c9 == 3) {
                return;
            }
            JSONObject jSONObjectL = rg0Var.l(view);
            uu0.c(jSONObject, jSONObjectL);
            HashMap map = xu0Var.f18500a;
            if (map.size() == 0) {
                obj = null;
            } else {
                Object obj2 = (String) map.get(view);
                if (obj2 != null) {
                    map.remove(view);
                }
                obj = obj2;
            }
            boolean z11 = false;
            if (obj != null) {
                try {
                    jSONObjectL.put("adSessionId", obj);
                } catch (JSONException e2) {
                    yo0.k("Error with setting ad session id", e2);
                }
                WeakHashMap weakHashMap = xu0Var.f18507i;
                if (weakHashMap.containsKey(view)) {
                    weakHashMap.put(view, Boolean.TRUE);
                } else {
                    z11 = true;
                }
                try {
                    jSONObjectL.put("hasWindowFocus", Boolean.valueOf(z11));
                } catch (JSONException e10) {
                    yo0.k("Error with setting has window focus", e10);
                }
                boolean zContains = xu0Var.f18506h.contains(obj);
                Object objValueOf = Boolean.valueOf(zContains);
                if (zContains) {
                    try {
                        jSONObjectL.put("isPipActive", objValueOf);
                    } catch (JSONException e11) {
                        yo0.k("Error with setting is picture-in-picture active", e11);
                    }
                }
                xu0Var.j = true;
                return;
            }
            HashMap map2 = xu0Var.f18501b;
            wu0 wu0Var = (wu0) map2.get(view);
            if (wu0Var != null) {
                map2.remove(view);
            }
            if (wu0Var != null) {
                ku0 ku0Var = wu0Var.f18195a;
                JSONArray jSONArray = new JSONArray();
                ArrayList arrayList = wu0Var.f18196b;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    jSONArray.put((String) arrayList.get(i10));
                }
                try {
                    jSONObjectL.put("isFriendlyObstructionFor", jSONArray);
                    jSONObjectL.put("friendlyObstructionClass", ku0Var.f13254b);
                    jSONObjectL.put("friendlyObstructionPurpose", ku0Var.f13255c);
                    jSONObjectL.put("friendlyObstructionReason", ku0Var.f13256d);
                } catch (JSONException e12) {
                    yo0.k("Error with setting friendly obstruction", e12);
                }
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z12 = z3 || z10;
            boolean z13 = c9 == 1;
            rg0Var.getClass();
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (!z13) {
                    for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                        a(viewGroup.getChildAt(i11), rg0Var, jSONObjectL, z12);
                    }
                    return;
                }
                HashMap map3 = new HashMap();
                for (int i12 = 0; i12 < viewGroup.getChildCount(); i12++) {
                    View childAt = viewGroup.getChildAt(i12);
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
                int i13 = 0;
                while (i13 < size2) {
                    ArrayList arrayList4 = (ArrayList) map3.get((Float) arrayList3.get(i13));
                    int size3 = arrayList4.size();
                    int i14 = 0;
                    while (true) {
                        i4 = i13 + 1;
                        if (i14 < size3) {
                            a((View) arrayList4.get(i14), rg0Var, jSONObjectL, z12);
                            i14++;
                        }
                    }
                    i13 = i4;
                }
            }
        }
    }
}
