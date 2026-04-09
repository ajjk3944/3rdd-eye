package com.yandex.mobile.ads.impl;

import android.view.View;
import b9.C1992A;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public final class y61 {

    /* renamed from: b, reason: collision with root package name */
    private static final Object f35649b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static volatile y61 f35650c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f35651d = 0;

    /* renamed from: a, reason: collision with root package name */
    private final Map<View, p81> f35652a;

    public static final class a {
        public static y61 a() {
            y61 y61Var;
            y61 y61Var2 = y61.f35650c;
            if (y61Var2 != null) {
                return y61Var2;
            }
            synchronized (y61.f35649b) {
                y61Var = y61.f35650c;
                if (y61Var == null) {
                    y61Var = new y61(new WeakHashMap());
                    y61.f35650c = y61Var;
                }
            }
            return y61Var;
        }
    }

    public y61(Map<View, p81> nativeAdViews) {
        kotlin.jvm.internal.l.f(nativeAdViews, "nativeAdViews");
        this.f35652a = nativeAdViews;
    }

    public final p81 a(View view) {
        p81 p81Var;
        kotlin.jvm.internal.l.f(view, "view");
        synchronized (f35649b) {
            p81Var = this.f35652a.get(view);
        }
        return p81Var;
    }

    public final void a(View view, p81 nativeGenericBinder) {
        kotlin.jvm.internal.l.f(view, "view");
        kotlin.jvm.internal.l.f(nativeGenericBinder, "nativeGenericBinder");
        synchronized (f35649b) {
            this.f35652a.put(view, nativeGenericBinder);
            C1992A c1992a = C1992A.f18074a;
        }
    }

    public final boolean a(p81 nativeGenericBinder) {
        boolean z10;
        kotlin.jvm.internal.l.f(nativeGenericBinder, "nativeGenericBinder");
        synchronized (f35649b) {
            Iterator<Map.Entry<View, p81>> it = this.f35652a.entrySet().iterator();
            z10 = false;
            while (it.hasNext()) {
                if (it.next().getValue() == nativeGenericBinder) {
                    it.remove();
                    z10 = true;
                }
            }
        }
        return z10;
    }
}
