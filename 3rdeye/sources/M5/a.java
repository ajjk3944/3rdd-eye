package M5;

import M5.b;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: h, reason: collision with root package name */
    public static final a f4180h = new a();
    public static final Handler i = new Handler(Looper.getMainLooper());

    /* renamed from: j, reason: collision with root package name */
    public static Handler f4181j = null;

    /* renamed from: k, reason: collision with root package name */
    public static final c f4182k = new c();

    /* renamed from: l, reason: collision with root package name */
    public static final d f4183l = new d();

    /* renamed from: b, reason: collision with root package name */
    public int f4185b;

    /* renamed from: f, reason: collision with root package name */
    public final M5.c f4189f;

    /* renamed from: g, reason: collision with root package name */
    public long f4190g;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f4184a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f4186c = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final M5.b f4188e = new M5.b();

    /* renamed from: d, reason: collision with root package name */
    public final E7.b f4187d = new E7.b(4);

    /* renamed from: M5.a$a, reason: collision with other inner class name */
    public interface InterfaceC0075a extends b {
        void a();
    }

    public interface b {
        void b();
    }

    public class c implements Runnable {
        /* JADX WARN: Removed duplicated region for block: B:29:0x0096  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0107  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x012c  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void run() throws org.json.JSONException {
            /*
                Method dump skipped, instructions count: 868
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: M5.a.c.run():void");
        }
    }

    public class d implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            Handler handler = a.f4181j;
            if (handler != null) {
                handler.post(a.f4182k);
                a.f4181j.postDelayed(a.f4183l, 200L);
            }
        }
    }

    public a() {
        N5.c cVar = new N5.c();
        cVar.f4675c = new ArrayDeque();
        cVar.f4676d = null;
        cVar.f4674b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        this.f4189f = new M5.c(cVar);
    }

    public static void b() {
        if (f4181j == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f4181j = handler;
            handler.post(f4182k);
            f4181j.postDelayed(f4183l, 200L);
        }
    }

    public final void a(View view, J5.a aVar, JSONObject jSONObject, boolean z10) throws JSONException {
        String str;
        if (L5.d.a(view) == null) {
            M5.b bVar = this.f4188e;
            M5.d dVar = bVar.f4194d.contains(view) ? M5.d.PARENT_VIEW : bVar.f4199j ? M5.d.OBSTRUCTION_VIEW : M5.d.UNDERLYING_VIEW;
            if (dVar == M5.d.UNDERLYING_VIEW) {
                return;
            }
            JSONObject jSONObjectA = aVar.a(view);
            L5.a.c(jSONObject, jSONObjectA);
            HashMap<View, String> map = bVar.f4191a;
            if (map.size() == 0) {
                str = null;
            } else {
                str = map.get(view);
                if (str != null) {
                    map.remove(view);
                }
            }
            if (str != null) {
                try {
                    jSONObjectA.put("adSessionId", str);
                } catch (JSONException e4) {
                    Log.e("OMIDLIB", "Error with setting ad session id", e4);
                }
                WeakHashMap weakHashMap = bVar.i;
                if (weakHashMap.containsKey(view)) {
                    weakHashMap.put(view, Boolean.TRUE);
                } else {
                    z = true;
                }
                try {
                    jSONObjectA.put("hasWindowFocus", Boolean.valueOf(z));
                } catch (JSONException e10) {
                    Log.e("OMIDLIB", "Error with setting has window focus", e10);
                }
                boolean zContains = bVar.f4198h.contains(str);
                Boolean boolValueOf = Boolean.valueOf(zContains);
                if (zContains) {
                    try {
                        jSONObjectA.put("isPipActive", boolValueOf);
                    } catch (JSONException e11) {
                        Log.e("OMIDLIB", "Error with setting is picture-in-picture active", e11);
                    }
                }
                bVar.f4199j = true;
            } else {
                HashMap<View, b.a> map2 = bVar.f4192b;
                b.a aVar2 = map2.get(view);
                if (aVar2 != null) {
                    map2.remove(view);
                }
                if (aVar2 != null) {
                    new JSONArray();
                    throw null;
                }
                z = dVar == M5.d.PARENT_VIEW;
                aVar.getClass();
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    int i10 = 0;
                    if (z) {
                        HashMap map3 = new HashMap();
                        while (i10 < viewGroup.getChildCount()) {
                            View childAt = viewGroup.getChildAt(i10);
                            ArrayList arrayList = (ArrayList) map3.get(Float.valueOf(childAt.getZ()));
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                map3.put(Float.valueOf(childAt.getZ()), arrayList);
                            }
                            arrayList.add(childAt);
                            i10++;
                        }
                        ArrayList arrayList2 = new ArrayList(map3.keySet());
                        Collections.sort(arrayList2);
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            Iterator it2 = ((ArrayList) map3.get((Float) it.next())).iterator();
                            while (it2.hasNext()) {
                                a((View) it2.next(), aVar, jSONObjectA, z10);
                            }
                        }
                    } else {
                        while (i10 < viewGroup.getChildCount()) {
                            a(viewGroup.getChildAt(i10), aVar, jSONObjectA, z10);
                            i10++;
                        }
                    }
                }
            }
            this.f4185b++;
        }
    }
}
