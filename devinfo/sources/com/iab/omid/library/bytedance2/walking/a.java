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
    private final HashMap<View, String> f21120a = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private final HashMap<View, C0132a> f21121b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private final HashMap<String, View> f21122c = new HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private final HashSet<View> f21123d = new HashSet<>();

    /* renamed from: e, reason: collision with root package name */
    private final HashSet<String> f21124e = new HashSet<>();

    /* renamed from: f, reason: collision with root package name */
    private final HashSet<String> f21125f = new HashSet<>();
    private final HashMap<String, String> g = new HashMap<>();

    /* renamed from: h, reason: collision with root package name */
    private final Map<View, Boolean> f21126h = new WeakHashMap();

    /* renamed from: i, reason: collision with root package name */
    private boolean f21127i;

    /* renamed from: com.iab.omid.library.bytedance2.walking.a$a, reason: collision with other inner class name */
    public static class C0132a {

        /* renamed from: a, reason: collision with root package name */
        private final e f21128a;

        /* renamed from: b, reason: collision with root package name */
        private final ArrayList<String> f21129b = new ArrayList<>();

        public C0132a(e eVar, String str) {
            this.f21128a = eVar;
            a(str);
        }

        public e a() {
            return this.f21128a;
        }

        public ArrayList<String> b() {
            return this.f21129b;
        }

        public void a(String str) {
            this.f21129b.add(str);
        }
    }

    private Boolean b(View view) {
        if (view.hasWindowFocus()) {
            this.f21126h.remove(view);
            return Boolean.FALSE;
        }
        if (this.f21126h.containsKey(view)) {
            return this.f21126h.get(view);
        }
        Map<View, Boolean> map = this.f21126h;
        Boolean bool = Boolean.FALSE;
        map.put(view, bool);
        return bool;
    }

    public View a(String str) {
        return this.f21122c.get(str);
    }

    public C0132a c(View view) {
        C0132a c0132a = this.f21121b.get(view);
        if (c0132a != null) {
            this.f21121b.remove(view);
        }
        return c0132a;
    }

    public String d(View view) {
        if (this.f21120a.size() == 0) {
            return null;
        }
        String str = this.f21120a.get(view);
        if (str != null) {
            this.f21120a.remove(view);
        }
        return str;
    }

    public c e(View view) {
        return this.f21123d.contains(view) ? c.PARENT_VIEW : this.f21127i ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public boolean f(View view) {
        if (!this.f21126h.containsKey(view)) {
            return true;
        }
        this.f21126h.put(view, Boolean.TRUE);
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
        this.f21123d.addAll(hashSet);
        return null;
    }

    public String b(String str) {
        return this.g.get(str);
    }

    public HashSet<String> c() {
        return this.f21124e;
    }

    public void d() {
        this.f21127i = true;
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
                            this.f21124e.add(adSessionId);
                            this.f21120a.put(viewC, adSessionId);
                            a(aVar);
                        } else if (strA != "noWindowFocus") {
                            this.f21125f.add(adSessionId);
                            this.f21122c.put(adSessionId, viewC);
                            this.g.put(adSessionId, strA);
                        }
                    } else {
                        this.f21125f.add(adSessionId);
                        this.g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    public void a() {
        this.f21120a.clear();
        this.f21121b.clear();
        this.f21122c.clear();
        this.f21123d.clear();
        this.f21124e.clear();
        this.f21125f.clear();
        this.g.clear();
        this.f21127i = false;
    }

    public HashSet<String> b() {
        return this.f21125f;
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
        C0132a c0132a = this.f21121b.get(view);
        if (c0132a != null) {
            c0132a.a(aVar.getAdSessionId());
        } else {
            this.f21121b.put(view, new C0132a(eVar, aVar.getAdSessionId()));
        }
    }
}
