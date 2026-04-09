package com.iab.omid.library.bytedance2.walking;

import android.view.View;
import com.iab.omid.library.bytedance2.internal.e;
import com.iab.omid.library.bytedance2.utils.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap<View, String> f12427a = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private final HashMap<View, C0229a> f12428b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private final HashMap<String, View> f12429c = new HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private final HashSet<View> f12430d = new HashSet<>();

    /* renamed from: e, reason: collision with root package name */
    private final HashSet<String> f12431e = new HashSet<>();

    /* renamed from: f, reason: collision with root package name */
    private final HashSet<String> f12432f = new HashSet<>();

    /* renamed from: g, reason: collision with root package name */
    private final HashMap<String, String> f12433g = new HashMap<>();

    /* renamed from: h, reason: collision with root package name */
    private final Map<View, Boolean> f12434h = new WeakHashMap();

    /* renamed from: i, reason: collision with root package name */
    private boolean f12435i;

    /* renamed from: com.iab.omid.library.bytedance2.walking.a$a, reason: collision with other inner class name */
    public static class C0229a {

        /* renamed from: a, reason: collision with root package name */
        private final e f12436a;

        /* renamed from: b, reason: collision with root package name */
        private final ArrayList<String> f12437b = new ArrayList<>();

        public C0229a(e eVar, String str) {
            this.f12436a = eVar;
            a(str);
        }

        public e a() {
            return this.f12436a;
        }

        public ArrayList<String> b() {
            return this.f12437b;
        }

        public void a(String str) {
            this.f12437b.add(str);
        }
    }

    private Boolean b(View view) {
        if (view.hasWindowFocus()) {
            this.f12434h.remove(view);
            return Boolean.FALSE;
        }
        if (this.f12434h.containsKey(view)) {
            return this.f12434h.get(view);
        }
        Map<View, Boolean> map = this.f12434h;
        Boolean bool = Boolean.FALSE;
        map.put(view, bool);
        return bool;
    }

    public View a(String str) {
        return this.f12429c.get(str);
    }

    public C0229a c(View view) {
        C0229a c0229a = this.f12428b.get(view);
        if (c0229a != null) {
            this.f12428b.remove(view);
        }
        return c0229a;
    }

    public String d(View view) {
        if (this.f12427a.size() == 0) {
            return null;
        }
        String str = this.f12427a.get(view);
        if (str != null) {
            this.f12427a.remove(view);
        }
        return str;
    }

    public c e(View view) {
        return this.f12430d.contains(view) ? c.PARENT_VIEW : this.f12435i ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public boolean f(View view) {
        if (!this.f12434h.containsKey(view)) {
            return true;
        }
        this.f12434h.put(view, Boolean.TRUE);
        return false;
    }

    private String a(View view) {
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        if (b(view).booleanValue()) {
            return "noWindowFocus";
        }
        HashSet hashSet = new HashSet();
        while (view != null) {
            String strA = h.a(view);
            if (strA != null) {
                return strA;
            }
            hashSet.add(view);
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        this.f12430d.addAll(hashSet);
        return null;
    }

    public String b(String str) {
        return this.f12433g.get(str);
    }

    public HashSet<String> c() {
        return this.f12431e;
    }

    public void d() {
        this.f12435i = true;
    }

    public void e() {
        com.iab.omid.library.bytedance2.internal.c cVarC = com.iab.omid.library.bytedance2.internal.c.c();
        if (cVarC != null) {
            for (com.iab.omid.library.bytedance2.adsession.a aVar : cVarC.a()) {
                View viewC = aVar.c();
                if (aVar.f()) {
                    String adSessionId = aVar.getAdSessionId();
                    if (viewC != null) {
                        String strA = a(viewC);
                        if (strA == null) {
                            this.f12431e.add(adSessionId);
                            this.f12427a.put(viewC, adSessionId);
                            a(aVar);
                        } else if (strA != "noWindowFocus") {
                            this.f12432f.add(adSessionId);
                            this.f12429c.put(adSessionId, viewC);
                            this.f12433g.put(adSessionId, strA);
                        }
                    } else {
                        this.f12432f.add(adSessionId);
                        this.f12433g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    public void a() {
        this.f12427a.clear();
        this.f12428b.clear();
        this.f12429c.clear();
        this.f12430d.clear();
        this.f12431e.clear();
        this.f12432f.clear();
        this.f12433g.clear();
        this.f12435i = false;
    }

    public HashSet<String> b() {
        return this.f12432f;
    }

    private void a(com.iab.omid.library.bytedance2.adsession.a aVar) {
        Iterator<e> it = aVar.d().iterator();
        while (it.hasNext()) {
            a(it.next(), aVar);
        }
    }

    private void a(e eVar, com.iab.omid.library.bytedance2.adsession.a aVar) {
        View view = eVar.c().get();
        if (view == null) {
            return;
        }
        C0229a c0229a = this.f12428b.get(view);
        if (c0229a != null) {
            c0229a.a(aVar.getAdSessionId());
        } else {
            this.f12428b.put(view, new C0229a(eVar, aVar.getAdSessionId()));
        }
    }
}
