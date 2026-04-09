package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.lang.ref.WeakReference;

/* renamed from: com.yandex.mobile.ads.impl.k3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4142k3 {

    /* renamed from: a, reason: collision with root package name */
    private final aq1 f29485a;

    /* renamed from: b, reason: collision with root package name */
    private final WeakReference<vj<?>> f29486b;

    /* renamed from: com.yandex.mobile.ads.impl.k3$a */
    public static final class a {
        public static C4128i3 a(C4072a3 c4072a3, EnumC4135j3 adFetchStatus) {
            kotlin.jvm.internal.l.f(adFetchStatus, "adFetchStatus");
            switch (adFetchStatus.ordinal()) {
                case 0:
                case 5:
                    int i = i7.f28531A;
                    return i7.a(c4072a3 != null ? c4072a3.c() : null);
                case 1:
                    return i7.k();
                case 2:
                    return i7.q();
                case 3:
                    return i7.j();
                case 4:
                    return i7.v();
                case 6:
                    return i7.h();
                case 7:
                    return i7.g();
                case 8:
                    return i7.u();
                case 9:
                    return i7.p();
                case 10:
                    return i7.w();
                case 11:
                    return i7.a();
                case 12:
                    return i7.c();
                case 13:
                    return i7.r();
                case 14:
                    return i7.n();
                default:
                    throw new b9.j();
            }
        }
    }

    public C4142k3(vj<?> loadController, aq1 requestManager, WeakReference<vj<?>> loadControllerRef) {
        kotlin.jvm.internal.l.f(loadController, "loadController");
        kotlin.jvm.internal.l.f(requestManager, "requestManager");
        kotlin.jvm.internal.l.f(loadControllerRef, "loadControllerRef");
        this.f29485a = requestManager;
        this.f29486b = loadControllerRef;
    }

    public final void a() {
        vj<?> vjVar = this.f29486b.get();
        if (vjVar != null) {
            aq1 aq1Var = this.f29485a;
            Context contextL = vjVar.l();
            String strA = aa.a(vjVar);
            aq1Var.getClass();
            aq1.a(contextL, strA);
        }
    }

    public final void b() {
        a();
        this.f29486b.clear();
    }

    public final void a(tj<?> request) {
        kotlin.jvm.internal.l.f(request, "request");
        vj<?> vjVar = this.f29486b.get();
        if (vjVar != null) {
            aq1 aq1Var = this.f29485a;
            Context context = vjVar.l();
            synchronized (aq1Var) {
                kotlin.jvm.internal.l.f(context, "context");
                xc1.a(context).a(request);
            }
        }
    }
}
