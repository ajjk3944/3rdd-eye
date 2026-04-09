package com.yandex.mobile.ads.impl;

import b9.C1992A;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public final class vl0 {

    /* renamed from: c, reason: collision with root package name */
    public static final a f34614c = new a(0);

    /* renamed from: d, reason: collision with root package name */
    private static volatile vl0 f34615d;

    /* renamed from: a, reason: collision with root package name */
    private final Object f34616a;

    /* renamed from: b, reason: collision with root package name */
    private final WeakHashMap<ct, u72> f34617b;

    public static final class a {
        private a() {
        }

        public final vl0 a() {
            vl0 vl0Var;
            vl0 vl0Var2 = vl0.f34615d;
            if (vl0Var2 != null) {
                return vl0Var2;
            }
            synchronized (this) {
                vl0Var = vl0.f34615d;
                if (vl0Var == null) {
                    vl0Var = new vl0(0);
                    vl0.f34615d = vl0Var;
                }
            }
            return vl0Var;
        }

        public /* synthetic */ a(int i) {
            this();
        }
    }

    private vl0() {
        this.f34616a = new Object();
        this.f34617b = new WeakHashMap<>();
    }

    public final void b(ct instreamAdPlayer) {
        kotlin.jvm.internal.l.f(instreamAdPlayer, "instreamAdPlayer");
        synchronized (this.f34616a) {
            this.f34617b.remove(instreamAdPlayer);
        }
    }

    public final u72 a(ct instreamAdPlayer) {
        u72 u72Var;
        kotlin.jvm.internal.l.f(instreamAdPlayer, "instreamAdPlayer");
        synchronized (this.f34616a) {
            u72Var = this.f34617b.get(instreamAdPlayer);
        }
        return u72Var;
    }

    public /* synthetic */ vl0(int i) {
        this();
    }

    public final void a(ct instreamAdPlayer, u72 adBinder) {
        kotlin.jvm.internal.l.f(instreamAdPlayer, "instreamAdPlayer");
        kotlin.jvm.internal.l.f(adBinder, "adBinder");
        synchronized (this.f34616a) {
            this.f34617b.put(instreamAdPlayer, adBinder);
            C1992A c1992a = C1992A.f18074a;
        }
    }
}
