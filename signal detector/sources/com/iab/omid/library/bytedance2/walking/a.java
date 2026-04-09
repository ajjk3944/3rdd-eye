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

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap<View, String> f18724a = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private final HashMap<View, C0109a> f18725b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private final HashMap<String, View> f18726c = new HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private final HashSet<View> f18727d = new HashSet<>();

    /* renamed from: e, reason: collision with root package name */
    private final HashSet<String> f18728e = new HashSet<>();

    /* renamed from: f, reason: collision with root package name */
    private final HashSet<String> f18729f = new HashSet<>();

    /* renamed from: g, reason: collision with root package name */
    private final HashMap<String, String> f18730g = new HashMap<>();

    /* renamed from: h, reason: collision with root package name */
    private final Map<View, Boolean> f18731h = new WeakHashMap();
    private boolean i;

    /* renamed from: com.iab.omid.library.bytedance2.walking.a$a, reason: collision with other inner class name */
    public static class C0109a {

        /* renamed from: a, reason: collision with root package name */
        private final e f18732a;

        /* renamed from: b, reason: collision with root package name */
        private final ArrayList<String> f18733b = new ArrayList<>();

        public C0109a(e eVar, String str) {
            this.f18732a = eVar;
            a(str);
        }

        public e a() {
            return this.f18732a;
        }

        public ArrayList<String> b() {
            return this.f18733b;
        }

        public void a(String str) {
            this.f18733b.add(str);
        }
    }

    private Boolean b(View view) {
        if (view.hasWindowFocus()) {
            this.f18731h.remove(view);
            return Boolean.FALSE;
        }
        if (this.f18731h.containsKey(view)) {
            return this.f18731h.get(view);
        }
        Map<View, Boolean> map = this.f18731h;
        Boolean bool = Boolean.FALSE;
        map.put(view, bool);
        return bool;
    }

    public View a(String str) {
        return this.f18726c.get(str);
    }

    public C0109a c(View view) {
        C0109a c0109a = this.f18725b.get(view);
        if (c0109a != null) {
            this.f18725b.remove(view);
        }
        return c0109a;
    }

    public String d(View view) {
        if (this.f18724a.size() == 0) {
            return null;
        }
        String str = this.f18724a.get(view);
        if (str != null) {
            this.f18724a.remove(view);
        }
        return str;
    }

    public c e(View view) {
        return this.f18727d.contains(view) ? c.PARENT_VIEW : this.i ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public boolean f(View view) {
        if (!this.f18731h.containsKey(view)) {
            return true;
        }
        this.f18731h.put(view, Boolean.TRUE);
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
        this.f18727d.addAll(hashSet);
        return null;
    }

    public String b(String str) {
        return this.f18730g.get(str);
    }

    public HashSet<String> c() {
        return this.f18728e;
    }

    public void d() {
        this.i = true;
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
                            this.f18728e.add(adSessionId);
                            this.f18724a.put(viewC, adSessionId);
                            a(aVar);
                        } else if (strA != "noWindowFocus") {
                            this.f18729f.add(adSessionId);
                            this.f18726c.put(adSessionId, viewC);
                            this.f18730g.put(adSessionId, strA);
                        }
                    } else {
                        this.f18729f.add(adSessionId);
                        this.f18730g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    public void a() {
        this.f18724a.clear();
        this.f18725b.clear();
        this.f18726c.clear();
        this.f18727d.clear();
        this.f18728e.clear();
        this.f18729f.clear();
        this.f18730g.clear();
        this.i = false;
    }

    public HashSet<String> b() {
        return this.f18729f;
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
        C0109a c0109a = this.f18725b.get(view);
        if (c0109a != null) {
            c0109a.a(aVar.getAdSessionId());
        } else {
            this.f18725b.put(view, new C0109a(eVar, aVar.getAdSessionId()));
        }
    }
}
