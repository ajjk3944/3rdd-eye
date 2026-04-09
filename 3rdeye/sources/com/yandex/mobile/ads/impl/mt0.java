package com.yandex.mobile.ads.impl;

import b9.C1992A;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public final class mt0 {

    /* renamed from: b, reason: collision with root package name */
    private static final Object f30509b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static volatile mt0 f30510c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f30511d = 0;

    /* renamed from: a, reason: collision with root package name */
    private final WeakHashMap f30512a;

    public static final class a {
        public static mt0 a() {
            if (mt0.f30510c == null) {
                synchronized (mt0.f30509b) {
                    try {
                        if (mt0.f30510c == null) {
                            mt0.f30510c = new mt0(0);
                        }
                        C1992A c1992a = C1992A.f18074a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            mt0 mt0Var = mt0.f30510c;
            if (mt0Var != null) {
                return mt0Var;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    private mt0() {
        this.f30512a = new WeakHashMap();
    }

    public final gt0 a(o70 view) {
        gt0 gt0Var;
        kotlin.jvm.internal.l.f(view, "view");
        synchronized (f30509b) {
            gt0Var = (gt0) this.f30512a.get(view);
        }
        return gt0Var;
    }

    public /* synthetic */ mt0(int i) {
        this();
    }

    public final void a(o70 view, gt0 presenter) {
        kotlin.jvm.internal.l.f(view, "view");
        kotlin.jvm.internal.l.f(presenter, "presenter");
        synchronized (f30509b) {
        }
    }

    public final boolean a(gt0 presenter) {
        boolean z10;
        kotlin.jvm.internal.l.f(presenter, "presenter");
        synchronized (f30509b) {
            Iterator it = this.f30512a.entrySet().iterator();
            z10 = false;
            while (it.hasNext()) {
                if (presenter.equals((gt0) ((Map.Entry) it.next()).getValue())) {
                    it.remove();
                    z10 = true;
                }
            }
        }
        return z10;
    }
}
