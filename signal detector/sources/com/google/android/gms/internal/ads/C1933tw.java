package com.google.android.gms.internal.ads;

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

/* renamed from: com.google.android.gms.internal.ads.tw, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1933tw {

    /* renamed from: g, reason: collision with root package name */
    public static final C1933tw f16994g = new C1933tw();

    /* renamed from: h, reason: collision with root package name */
    public static final Handler f16995h = new Handler(Looper.getMainLooper());
    public static Handler i = null;

    /* renamed from: j, reason: collision with root package name */
    public static final RunnableC1944u6 f16996j = new RunnableC1944u6(7);

    /* renamed from: k, reason: collision with root package name */
    public static final RunnableC1944u6 f16997k = new RunnableC1944u6(8);

    /* renamed from: f, reason: collision with root package name */
    public long f17003f;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f16998a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f16999b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final C0447Bq f17001d = new C0447Bq();

    /* renamed from: c, reason: collision with root package name */
    public final Vu f17000c = new Vu(1);

    /* renamed from: e, reason: collision with root package name */
    public final C1879sw f17002e = new C1879sw(new C2041vw(0));

    public static void b() {
        if (i == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            i = handler;
            handler.post(f16996j);
            i.postDelayed(f16997k, 200L);
        }
    }

    public final void a(View view, C1014cu c1014cu, JSONObject jSONObject, boolean z6) {
        Object obj;
        boolean z7;
        int i3;
        if (AbstractC0582Jp.f(view) == null) {
            C0447Bq c0447Bq = this.f17001d;
            char c6 = ((HashSet) c0447Bq.f7449e).contains(view) ? (char) 1 : c0447Bq.f7445a ? (char) 2 : (char) 3;
            if (c6 == 3) {
                return;
            }
            JSONObject jSONObjectD = c1014cu.d(view);
            AbstractC1718pw.c(jSONObject, jSONObjectD);
            HashMap map = (HashMap) c0447Bq.f7446b;
            if (map.size() == 0) {
                obj = null;
            } else {
                Object obj2 = (String) map.get(view);
                if (obj2 != null) {
                    map.remove(view);
                }
                obj = obj2;
            }
            boolean z8 = false;
            if (obj != null) {
                try {
                    jSONObjectD.put("adSessionId", obj);
                } catch (JSONException e6) {
                    AbstractC1984ut.l("Error with setting ad session id", e6);
                }
                WeakHashMap weakHashMap = (WeakHashMap) c0447Bq.f7453j;
                if (weakHashMap.containsKey(view)) {
                    weakHashMap.put(view, Boolean.TRUE);
                } else {
                    z8 = true;
                }
                try {
                    jSONObjectD.put("hasWindowFocus", Boolean.valueOf(z8));
                } catch (JSONException e7) {
                    AbstractC1984ut.l("Error with setting has window focus", e7);
                }
                boolean zContains = ((HashSet) c0447Bq.i).contains(obj);
                Object objValueOf = Boolean.valueOf(zContains);
                if (zContains) {
                    try {
                        jSONObjectD.put("isPipActive", objValueOf);
                    } catch (JSONException e8) {
                        AbstractC1984ut.l("Error with setting is picture-in-picture active", e8);
                    }
                }
                c0447Bq.f7445a = true;
                return;
            }
            HashMap map2 = (HashMap) c0447Bq.f7447c;
            C1825rw c1825rw = (C1825rw) map2.get(view);
            if (c1825rw != null) {
                map2.remove(view);
            }
            if (c1825rw != null) {
                C1180fw c1180fw = c1825rw.f16645a;
                JSONArray jSONArray = new JSONArray();
                ArrayList arrayList = c1825rw.f16646b;
                int size = arrayList.size();
                for (int i6 = 0; i6 < size; i6++) {
                    jSONArray.put((String) arrayList.get(i6));
                }
                try {
                    jSONObjectD.put("isFriendlyObstructionFor", jSONArray);
                    jSONObjectD.put("friendlyObstructionClass", c1180fw.f14176b);
                    jSONObjectD.put("friendlyObstructionPurpose", c1180fw.f14177c);
                    jSONObjectD.put("friendlyObstructionReason", c1180fw.f14178d);
                } catch (JSONException e9) {
                    AbstractC1984ut.l("Error with setting friendly obstruction", e9);
                }
                z7 = true;
            } else {
                z7 = false;
            }
            boolean z9 = z6 || z7;
            boolean z10 = c6 == 1;
            c1014cu.getClass();
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (!z10) {
                    for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                        a(viewGroup.getChildAt(i7), c1014cu, jSONObjectD, z9);
                    }
                    return;
                }
                HashMap map3 = new HashMap();
                for (int i8 = 0; i8 < viewGroup.getChildCount(); i8++) {
                    View childAt = viewGroup.getChildAt(i8);
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
                int i9 = 0;
                while (i9 < size2) {
                    ArrayList arrayList4 = (ArrayList) map3.get((Float) arrayList3.get(i9));
                    int size3 = arrayList4.size();
                    int i10 = 0;
                    while (true) {
                        i3 = i9 + 1;
                        if (i10 < size3) {
                            a((View) arrayList4.get(i10), c1014cu, jSONObjectD, z9);
                            i10++;
                        }
                    }
                    i9 = i3;
                }
            }
        }
    }
}
