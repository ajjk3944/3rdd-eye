package com.yandex.mobile.ads.impl;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public final class on2 {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap<View, String> f31445a = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private final HashMap<View, a> f31446b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private final HashMap<String, View> f31447c = new HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private final HashSet<View> f31448d = new HashSet<>();

    /* renamed from: e, reason: collision with root package name */
    private final HashSet<String> f31449e = new HashSet<>();

    /* renamed from: f, reason: collision with root package name */
    private final HashSet<String> f31450f = new HashSet<>();

    /* renamed from: g, reason: collision with root package name */
    private final HashMap<String, String> f31451g = new HashMap<>();

    /* renamed from: h, reason: collision with root package name */
    private final WeakHashMap f31452h = new WeakHashMap();
    private boolean i;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final ao2 f31453a;

        /* renamed from: b, reason: collision with root package name */
        private final ArrayList<String> f31454b = new ArrayList<>();

        public a(ao2 ao2Var, String str) {
            this.f31453a = ao2Var;
            a(str);
        }

        public final ao2 a() {
            return this.f31453a;
        }

        public final ArrayList<String> b() {
            return this.f31454b;
        }

        public final void a(String str) {
            this.f31454b.add(str);
        }
    }

    public final String a(View view) {
        if (this.f31445a.size() == 0) {
            return null;
        }
        String str = this.f31445a.get(view);
        if (str != null) {
            this.f31445a.remove(view);
        }
        return str;
    }

    public final View b(String str) {
        return this.f31447c.get(str);
    }

    public final int c(View view) {
        if (this.f31448d.contains(view)) {
            return 1;
        }
        return this.i ? 2 : 3;
    }

    public final void d() {
        this.f31445a.clear();
        this.f31446b.clear();
        this.f31447c.clear();
        this.f31448d.clear();
        this.f31449e.clear();
        this.f31450f.clear();
        this.f31451g.clear();
        this.i = false;
    }

    public final void e() {
        this.i = true;
    }

    public final String a(String str) {
        return this.f31451g.get(str);
    }

    public final a b(View view) {
        a aVar = this.f31446b.get(view);
        if (aVar != null) {
            this.f31446b.remove(view);
        }
        return aVar;
    }

    public final void c() {
        Boolean bool;
        String str;
        jn2 jn2VarA = jn2.a();
        if (jn2VarA != null) {
            for (in2 in2Var : jn2VarA.c()) {
                View viewF = in2Var.f();
                if (in2Var.g()) {
                    String strI = in2Var.i();
                    if (viewF != null) {
                        if (viewF.isAttachedToWindow()) {
                            if (viewF.hasWindowFocus()) {
                                this.f31452h.remove(viewF);
                                bool = Boolean.FALSE;
                            } else if (this.f31452h.containsKey(viewF)) {
                                bool = (Boolean) this.f31452h.get(viewF);
                            } else {
                                WeakHashMap weakHashMap = this.f31452h;
                                Boolean bool2 = Boolean.FALSE;
                                weakHashMap.put(viewF, bool2);
                                bool = bool2;
                            }
                            if (!bool.booleanValue()) {
                                HashSet hashSet = new HashSet();
                                View view = viewF;
                                while (true) {
                                    if (view == null) {
                                        this.f31448d.addAll(hashSet);
                                        str = null;
                                        break;
                                    }
                                    String strC = no2.c(view);
                                    if (strC != null) {
                                        str = strC;
                                        break;
                                    } else {
                                        hashSet.add(view);
                                        Object parent = view.getParent();
                                        view = parent instanceof View ? (View) parent : null;
                                    }
                                }
                            } else {
                                str = "noWindowFocus";
                            }
                        } else {
                            str = "notAttached";
                        }
                        if (str == null) {
                            this.f31449e.add(strI);
                            this.f31445a.put(viewF, strI);
                            Iterator it = in2Var.c().iterator();
                            while (it.hasNext()) {
                                ao2 ao2Var = (ao2) it.next();
                                View view2 = ao2Var.a().get();
                                if (view2 != null) {
                                    a aVar = this.f31446b.get(view2);
                                    if (aVar != null) {
                                        aVar.a(in2Var.i());
                                    } else {
                                        this.f31446b.put(view2, new a(ao2Var, in2Var.i()));
                                    }
                                }
                            }
                        } else if (str != "noWindowFocus") {
                            this.f31450f.add(strI);
                            this.f31447c.put(strI, viewF);
                            this.f31451g.put(strI, str);
                        }
                    } else {
                        this.f31450f.add(strI);
                        this.f31451g.put(strI, "noAdView");
                    }
                }
            }
        }
    }

    public final boolean d(View view) {
        if (!this.f31452h.containsKey(view)) {
            return true;
        }
        this.f31452h.put(view, Boolean.TRUE);
        return false;
    }

    public final HashSet<String> a() {
        return this.f31449e;
    }

    public final HashSet<String> b() {
        return this.f31450f;
    }
}
