package com.iab.omid.library.applovin.walking;

import android.view.View;
import com.iab.omid.library.applovin.internal.e;
import com.iab.omid.library.applovin.utils.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap<View, String> f12297a = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private final HashMap<View, C0225a> f12298b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private final HashMap<String, View> f12299c = new HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private final HashSet<View> f12300d = new HashSet<>();

    /* renamed from: e, reason: collision with root package name */
    private final HashSet<String> f12301e = new HashSet<>();

    /* renamed from: f, reason: collision with root package name */
    private final HashSet<String> f12302f = new HashSet<>();

    /* renamed from: g, reason: collision with root package name */
    private final HashMap<String, String> f12303g = new HashMap<>();

    /* renamed from: h, reason: collision with root package name */
    private final HashSet<String> f12304h = new HashSet<>();

    /* renamed from: i, reason: collision with root package name */
    private final Map<View, Boolean> f12305i = new WeakHashMap();

    /* renamed from: j, reason: collision with root package name */
    private boolean f12306j;

    /* renamed from: com.iab.omid.library.applovin.walking.a$a, reason: collision with other inner class name */
    public static class C0225a {

        /* renamed from: a, reason: collision with root package name */
        private final e f12307a;

        /* renamed from: b, reason: collision with root package name */
        private final ArrayList<String> f12308b = new ArrayList<>();

        public C0225a(e eVar, String str) {
            this.f12307a = eVar;
            a(str);
        }

        public e a() {
            return this.f12307a;
        }

        public ArrayList<String> b() {
            return this.f12308b;
        }

        public void a(String str) {
            this.f12308b.add(str);
        }
    }

    public View a(String str) {
        return this.f12299c.get(str);
    }

    public C0225a b(View view) {
        C0225a c0225a = this.f12298b.get(view);
        if (c0225a != null) {
            this.f12298b.remove(view);
        }
        return c0225a;
    }

    public String c(View view) {
        if (this.f12297a.size() == 0) {
            return null;
        }
        String str = this.f12297a.get(view);
        if (str != null) {
            this.f12297a.remove(view);
        }
        return str;
    }

    public c d(View view) {
        return this.f12300d.contains(view) ? c.PARENT_VIEW : this.f12306j ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public void e() {
        com.iab.omid.library.applovin.internal.c cVarC = com.iab.omid.library.applovin.internal.c.c();
        if (cVarC != null) {
            for (com.iab.omid.library.applovin.adsession.a aVar : cVarC.a()) {
                View viewE = aVar.e();
                if (aVar.h()) {
                    String strC = aVar.c();
                    if (viewE != null) {
                        boolean zE = h.e(viewE);
                        if (zE) {
                            this.f12304h.add(strC);
                        }
                        String strA = a(viewE, zE);
                        if (strA == null) {
                            this.f12301e.add(strC);
                            this.f12297a.put(viewE, strC);
                            a(aVar);
                        } else if (strA != "noWindowFocus") {
                            this.f12302f.add(strC);
                            this.f12299c.put(strC, viewE);
                            this.f12303g.put(strC, strA);
                        }
                    } else {
                        this.f12302f.add(strC);
                        this.f12303g.put(strC, "noAdView");
                    }
                }
            }
        }
    }

    private Boolean a(View view) {
        if (view.hasWindowFocus()) {
            this.f12305i.remove(view);
            return Boolean.FALSE;
        }
        if (this.f12305i.containsKey(view)) {
            return this.f12305i.get(view);
        }
        Map<View, Boolean> map = this.f12305i;
        Boolean bool = Boolean.FALSE;
        map.put(view, bool);
        return bool;
    }

    public String b(String str) {
        return this.f12303g.get(str);
    }

    public HashSet<String> c() {
        return this.f12301e;
    }

    public void d() {
        this.f12306j = true;
    }

    public boolean e(View view) {
        if (!this.f12305i.containsKey(view)) {
            return true;
        }
        this.f12305i.put(view, Boolean.TRUE);
        return false;
    }

    private String a(View view, boolean z10) {
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        if (a(view).booleanValue() && !z10) {
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
        this.f12300d.addAll(hashSet);
        return null;
    }

    public HashSet<String> b() {
        return this.f12302f;
    }

    public boolean c(String str) {
        return this.f12304h.contains(str);
    }

    public void a() {
        this.f12297a.clear();
        this.f12298b.clear();
        this.f12299c.clear();
        this.f12300d.clear();
        this.f12301e.clear();
        this.f12302f.clear();
        this.f12303g.clear();
        this.f12306j = false;
        this.f12304h.clear();
    }

    private void a(com.iab.omid.library.applovin.adsession.a aVar) {
        Iterator<e> it = aVar.f().iterator();
        while (it.hasNext()) {
            a(it.next(), aVar);
        }
    }

    private void a(e eVar, com.iab.omid.library.applovin.adsession.a aVar) {
        View view = eVar.c().get();
        if (view == null) {
            return;
        }
        C0225a c0225a = this.f12298b.get(view);
        if (c0225a != null) {
            c0225a.a(aVar.c());
        } else {
            this.f12298b.put(view, new C0225a(eVar, aVar.c()));
        }
    }
}
