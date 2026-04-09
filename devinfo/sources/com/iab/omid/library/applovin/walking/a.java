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
    private final HashMap<View, String> f20999a = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private final HashMap<View, C0128a> f21000b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private final HashMap<String, View> f21001c = new HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private final HashSet<View> f21002d = new HashSet<>();

    /* renamed from: e, reason: collision with root package name */
    private final HashSet<String> f21003e = new HashSet<>();

    /* renamed from: f, reason: collision with root package name */
    private final HashSet<String> f21004f = new HashSet<>();
    private final HashMap<String, String> g = new HashMap<>();

    /* renamed from: h, reason: collision with root package name */
    private final HashSet<String> f21005h = new HashSet<>();

    /* renamed from: i, reason: collision with root package name */
    private final Map<View, Boolean> f21006i = new WeakHashMap();
    private boolean j;

    /* renamed from: com.iab.omid.library.applovin.walking.a$a, reason: collision with other inner class name */
    public static class C0128a {

        /* renamed from: a, reason: collision with root package name */
        private final e f21007a;

        /* renamed from: b, reason: collision with root package name */
        private final ArrayList<String> f21008b = new ArrayList<>();

        public C0128a(e eVar, String str) {
            this.f21007a = eVar;
            a(str);
        }

        public e a() {
            return this.f21007a;
        }

        public ArrayList<String> b() {
            return this.f21008b;
        }

        public void a(String str) {
            this.f21008b.add(str);
        }
    }

    public View a(String str) {
        return this.f21001c.get(str);
    }

    public C0128a b(View view) {
        C0128a c0128a = this.f21000b.get(view);
        if (c0128a != null) {
            this.f21000b.remove(view);
        }
        return c0128a;
    }

    public String c(View view) {
        if (this.f20999a.size() == 0) {
            return null;
        }
        String str = this.f20999a.get(view);
        if (str != null) {
            this.f20999a.remove(view);
        }
        return str;
    }

    public c d(View view) {
        return this.f21002d.contains(view) ? c.PARENT_VIEW : this.j ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
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
                            this.f21005h.add(strC);
                        }
                        String strA = a(viewE, zE);
                        if (strA == null) {
                            this.f21003e.add(strC);
                            this.f20999a.put(viewE, strC);
                            a(aVar);
                        } else if (strA != "noWindowFocus") {
                            this.f21004f.add(strC);
                            this.f21001c.put(strC, viewE);
                            this.g.put(strC, strA);
                        }
                    } else {
                        this.f21004f.add(strC);
                        this.g.put(strC, "noAdView");
                    }
                }
            }
        }
    }

    private Boolean a(View view) {
        if (view.hasWindowFocus()) {
            this.f21006i.remove(view);
            return Boolean.FALSE;
        }
        if (this.f21006i.containsKey(view)) {
            return this.f21006i.get(view);
        }
        Map<View, Boolean> map = this.f21006i;
        Boolean bool = Boolean.FALSE;
        map.put(view, bool);
        return bool;
    }

    public String b(String str) {
        return this.g.get(str);
    }

    public HashSet<String> c() {
        return this.f21003e;
    }

    public void d() {
        this.j = true;
    }

    public boolean e(View view) {
        if (!this.f21006i.containsKey(view)) {
            return true;
        }
        this.f21006i.put(view, Boolean.TRUE);
        return false;
    }

    private String a(View view, boolean z3) {
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        if (a(view).booleanValue() && !z3) {
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
        this.f21002d.addAll(hashSet);
        return null;
    }

    public HashSet<String> b() {
        return this.f21004f;
    }

    public boolean c(String str) {
        return this.f21005h.contains(str);
    }

    public void a() {
        this.f20999a.clear();
        this.f21000b.clear();
        this.f21001c.clear();
        this.f21002d.clear();
        this.f21003e.clear();
        this.f21004f.clear();
        this.g.clear();
        this.j = false;
        this.f21005h.clear();
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
        C0128a c0128a = this.f21000b.get(view);
        if (c0128a != null) {
            c0128a.a(aVar.c());
        } else {
            this.f21000b.put(view, new C0128a(eVar, aVar.c()));
        }
    }
}
