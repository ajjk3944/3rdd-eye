package com.yandex.mobile.ads.impl;

import android.view.View;
import b9.C1992A;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public final class hl0 {

    /* renamed from: b, reason: collision with root package name */
    private static final Object f28252b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static volatile hl0 f28253c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f28254d = 0;

    /* renamed from: a, reason: collision with root package name */
    private final WeakHashMap<View, ys> f28255a;

    public static final class a {
        public static hl0 a() {
            if (hl0.f28253c == null) {
                synchronized (hl0.f28252b) {
                    try {
                        if (hl0.f28253c == null) {
                            hl0.f28253c = new hl0(0);
                        }
                        C1992A c1992a = C1992A.f18074a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            hl0 hl0Var = hl0.f28253c;
            if (hl0Var != null) {
                return hl0Var;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    private hl0() {
        this.f28255a = new WeakHashMap<>();
    }

    public final ys a(View view) {
        ys ysVar;
        kotlin.jvm.internal.l.f(view, "view");
        synchronized (f28252b) {
            ysVar = this.f28255a.get(view);
        }
        return ysVar;
    }

    public /* synthetic */ hl0(int i) {
        this();
    }

    public final void a(View view, ys instreamAdBinder) {
        kotlin.jvm.internal.l.f(view, "view");
        kotlin.jvm.internal.l.f(instreamAdBinder, "instreamAdBinder");
        synchronized (f28252b) {
            this.f28255a.put(view, instreamAdBinder);
        }
    }

    public final boolean a(ys instreamAdBinder) {
        boolean z10;
        kotlin.jvm.internal.l.f(instreamAdBinder, "instreamAdBinder");
        synchronized (f28252b) {
            Set<Map.Entry<View, ys>> setEntrySet = this.f28255a.entrySet();
            kotlin.jvm.internal.l.e(setEntrySet, "<get-entries>(...)");
            Iterator<Map.Entry<View, ys>> it = setEntrySet.iterator();
            z10 = false;
            while (it.hasNext()) {
                if (instreamAdBinder == it.next().getValue()) {
                    it.remove();
                    z10 = true;
                }
            }
        }
        return z10;
    }
}
