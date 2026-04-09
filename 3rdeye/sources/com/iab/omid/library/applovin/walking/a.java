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

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap<View, String> f23621a = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private final HashMap<View, C0360a> f23622b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private final HashMap<String, View> f23623c = new HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private final HashSet<View> f23624d = new HashSet<>();

    /* renamed from: e, reason: collision with root package name */
    private final HashSet<String> f23625e = new HashSet<>();

    /* renamed from: f, reason: collision with root package name */
    private final HashSet<String> f23626f = new HashSet<>();

    /* renamed from: g, reason: collision with root package name */
    private final HashMap<String, String> f23627g = new HashMap<>();

    /* renamed from: h, reason: collision with root package name */
    private final HashSet<String> f23628h = new HashSet<>();
    private final Map<View, Boolean> i = new WeakHashMap();

    /* renamed from: j, reason: collision with root package name */
    private boolean f23629j;

    /* renamed from: com.iab.omid.library.applovin.walking.a$a, reason: collision with other inner class name */
    public static class C0360a {

        /* renamed from: a, reason: collision with root package name */
        private final e f23630a;

        /* renamed from: b, reason: collision with root package name */
        private final ArrayList<String> f23631b = new ArrayList<>();

        public C0360a(e eVar, String str) {
            this.f23630a = eVar;
            a(str);
        }

        public e a() {
            return this.f23630a;
        }

        public ArrayList<String> b() {
            return this.f23631b;
        }

        public void a(String str) {
            this.f23631b.add(str);
        }
    }

    public View a(String str) {
        return this.f23623c.get(str);
    }

    public C0360a b(View view) {
        C0360a c0360a = this.f23622b.get(view);
        if (c0360a != null) {
            this.f23622b.remove(view);
        }
        return c0360a;
    }

    public String c(View view) {
        if (this.f23621a.size() == 0) {
            return null;
        }
        String str = this.f23621a.get(view);
        if (str != null) {
            this.f23621a.remove(view);
        }
        return str;
    }

    public c d(View view) {
        return this.f23624d.contains(view) ? c.PARENT_VIEW : this.f23629j ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
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
                            this.f23628h.add(strC);
                        }
                        String strA = a(viewE, zE);
                        if (strA == null) {
                            this.f23625e.add(strC);
                            this.f23621a.put(viewE, strC);
                            a(aVar);
                        } else if (strA != "noWindowFocus") {
                            this.f23626f.add(strC);
                            this.f23623c.put(strC, viewE);
                            this.f23627g.put(strC, strA);
                        }
                    } else {
                        this.f23626f.add(strC);
                        this.f23627g.put(strC, "noAdView");
                    }
                }
            }
        }
    }

    private Boolean a(View view) {
        if (view.hasWindowFocus()) {
            this.i.remove(view);
            return Boolean.FALSE;
        }
        if (this.i.containsKey(view)) {
            return this.i.get(view);
        }
        Map<View, Boolean> map = this.i;
        Boolean bool = Boolean.FALSE;
        map.put(view, bool);
        return bool;
    }

    public String b(String str) {
        return this.f23627g.get(str);
    }

    public HashSet<String> c() {
        return this.f23625e;
    }

    public void d() {
        this.f23629j = true;
    }

    public boolean e(View view) {
        if (!this.i.containsKey(view)) {
            return true;
        }
        this.i.put(view, Boolean.TRUE);
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
        this.f23624d.addAll(hashSet);
        return null;
    }

    public HashSet<String> b() {
        return this.f23626f;
    }

    public boolean c(String str) {
        return this.f23628h.contains(str);
    }

    public void a() {
        this.f23621a.clear();
        this.f23622b.clear();
        this.f23623c.clear();
        this.f23624d.clear();
        this.f23625e.clear();
        this.f23626f.clear();
        this.f23627g.clear();
        this.f23629j = false;
        this.f23628h.clear();
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
        C0360a c0360a = this.f23622b.get(view);
        if (c0360a != null) {
            c0360a.a(aVar.c());
        } else {
            this.f23622b.put(view, new C0360a(eVar, aVar.c()));
        }
    }
}
