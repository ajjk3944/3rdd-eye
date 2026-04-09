package com.yandex.mobile.ads.impl;

import android.content.Context;
import b9.C1992A;
import com.yandex.mobile.ads.impl.fr;

/* loaded from: classes3.dex */
public final class ew1 {

    /* renamed from: j, reason: collision with root package name */
    private static final Object f27068j = new Object();

    /* renamed from: k, reason: collision with root package name */
    private static volatile ew1 f27069k;

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f27070l = 0;

    /* renamed from: a, reason: collision with root package name */
    private volatile du1 f27071a;

    /* renamed from: b, reason: collision with root package name */
    private Boolean f27072b;

    /* renamed from: c, reason: collision with root package name */
    private Boolean f27073c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f27074d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f27075e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f27076f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f27077g;

    /* renamed from: h, reason: collision with root package name */
    private Integer f27078h;
    private boolean i;

    public static final class a {
        public static ew1 a() {
            ew1 ew1Var;
            ew1 ew1Var2 = ew1.f27069k;
            if (ew1Var2 != null) {
                return ew1Var2;
            }
            synchronized (ew1.f27068j) {
                ew1Var = ew1.f27069k;
                if (ew1Var == null) {
                    ew1Var = new ew1(0);
                    ew1.f27069k = ew1Var;
                }
            }
            return ew1Var;
        }
    }

    private ew1() {
        this.f27076f = true;
        this.f27077g = true;
    }

    public final boolean c() {
        boolean z10;
        synchronized (f27068j) {
            z10 = this.i;
        }
        return z10;
    }

    public final Integer d() {
        Integer num;
        synchronized (f27068j) {
            num = this.f27078h;
        }
        return num;
    }

    public final Boolean e() {
        Boolean bool;
        synchronized (f27068j) {
            bool = this.f27073c;
        }
        return bool;
    }

    public final boolean f() {
        boolean z10;
        synchronized (f27068j) {
            z10 = this.f27077g;
        }
        return z10;
    }

    public final boolean g() {
        boolean z10;
        synchronized (f27068j) {
            z10 = this.f27074d;
        }
        return z10;
    }

    public final boolean h() {
        boolean z10;
        synchronized (f27068j) {
            z10 = this.f27075e;
        }
        return z10;
    }

    public final Boolean i() {
        Boolean bool;
        synchronized (f27068j) {
            bool = this.f27072b;
        }
        return bool;
    }

    public final boolean j() {
        boolean z10;
        synchronized (f27068j) {
            z10 = this.f27076f;
        }
        return z10;
    }

    public final du1 a(Context context) {
        du1 du1VarA;
        kotlin.jvm.internal.l.f(context, "context");
        du1 du1Var = this.f27071a;
        if (du1Var != null) {
            return du1Var;
        }
        synchronized (f27068j) {
            du1VarA = this.f27071a;
            if (du1VarA == null) {
                fr.f27430a.getClass();
                du1VarA = fr.a.a(context).a();
                this.f27071a = du1VarA;
            }
        }
        return du1VarA;
    }

    public final void b(boolean z10) {
        synchronized (f27068j) {
            this.f27074d = z10;
            this.f27075e = z10;
            this.f27076f = z10;
            C1992A c1992a = C1992A.f18074a;
        }
    }

    public final void c(boolean z10) {
        synchronized (f27068j) {
            this.f27073c = Boolean.valueOf(z10);
            C1992A c1992a = C1992A.f18074a;
        }
    }

    public final void d(boolean z10) {
        synchronized (f27068j) {
            this.f27077g = z10;
            C1992A c1992a = C1992A.f18074a;
        }
    }

    public final void e(boolean z10) {
        synchronized (f27068j) {
            this.i = z10;
            C1992A c1992a = C1992A.f18074a;
        }
    }

    public final void f(boolean z10) {
        synchronized (f27068j) {
            this.f27072b = Boolean.valueOf(z10);
            C1992A c1992a = C1992A.f18074a;
        }
    }

    public /* synthetic */ ew1(int i) {
        this();
    }

    public final void a(Context context, du1 sdkConfiguration) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(sdkConfiguration, "sdkConfiguration");
        synchronized (f27068j) {
            this.f27071a = sdkConfiguration;
            fr.f27430a.getClass();
            fr.a.a(context).a(sdkConfiguration);
            C1992A c1992a = C1992A.f18074a;
        }
    }

    public final void a(Integer num) {
        synchronized (f27068j) {
            this.f27078h = num;
            C1992A c1992a = C1992A.f18074a;
        }
    }

    public final void a(boolean z10) {
        synchronized (f27068j) {
            this.f27074d = z10;
            this.f27076f = z10;
            C1992A c1992a = C1992A.f18074a;
        }
    }
}
