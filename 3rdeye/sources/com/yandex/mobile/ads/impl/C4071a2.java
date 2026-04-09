package com.yandex.mobile.ads.impl;

import android.content.Context;
import b9.C1992A;
import c9.C2079C;
import java.util.Set;

/* renamed from: com.yandex.mobile.ads.impl.a2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4071a2 {

    /* renamed from: b, reason: collision with root package name */
    private static final Set<gq1> f24387b = C2079C.e(gq1.f27873c, gq1.f27875e, gq1.f27874d);

    /* renamed from: c, reason: collision with root package name */
    private static final Object f24388c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static volatile C4071a2 f24389d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f24390e = 0;

    /* renamed from: a, reason: collision with root package name */
    private final C4237y1 f24391a;

    /* renamed from: com.yandex.mobile.ads.impl.a2$a */
    public static final class a {
        private a() {
        }

        public static C4071a2 a(Context context, C4237y1 adBlockerStateStorage) {
            C4071a2 c4071a2;
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(adBlockerStateStorage, "adBlockerStateStorage");
            C4071a2 c4071a22 = C4071a2.f24389d;
            if (c4071a22 != null) {
                return c4071a22;
            }
            synchronized (C4071a2.f24388c) {
                c4071a2 = C4071a2.f24389d;
                if (c4071a2 == null) {
                    c4071a2 = new C4071a2(adBlockerStateStorage, 0);
                    C4071a2.f24389d = c4071a2;
                }
            }
            return c4071a2;
        }

        public /* synthetic */ a(int i) {
            this();
        }

        public static C4071a2 a(Context context) {
            kotlin.jvm.internal.l.f(context, "context");
            if (C4243z1.f36128c == null) {
                synchronized (C4243z1.f36127b) {
                    try {
                        if (C4243z1.f36128c == null) {
                            C4243z1.f36128c = new C4243z1(es0.a(context, "YadPreferenceFile"));
                        }
                        C1992A c1992a = C1992A.f18074a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            C4243z1 c4243z1 = C4243z1.f36128c;
            if (c4243z1 != null) {
                return a(context, c4243z1.c());
            }
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    private C4071a2(C4237y1 c4237y1) {
        this.f24391a = c4237y1;
    }

    public final void a(gq1 requestType, Integer num) {
        kotlin.jvm.internal.l.f(requestType, "requestType");
        if (f24387b.contains(requestType)) {
            if (num == null || num.intValue() >= 500) {
                this.f24391a.c();
            } else {
                this.f24391a.a();
            }
        }
    }

    public /* synthetic */ C4071a2(C4237y1 c4237y1, int i) {
        this(c4237y1);
    }
}
