package com.yandex.mobile.ads.impl;

import b9.C1992A;
import java.util.HashMap;

/* renamed from: com.yandex.mobile.ads.impl.z0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4242z0 {

    /* renamed from: b, reason: collision with root package name */
    private static final Object f36116b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static volatile C4242z0 f36117c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f36118d = 0;

    /* renamed from: a, reason: collision with root package name */
    private final HashMap<Long, C4236y0> f36119a;

    /* renamed from: com.yandex.mobile.ads.impl.z0$a */
    public static final class a {
        public static C4242z0 a() {
            C4242z0 c4242z0;
            C4242z0 c4242z02 = C4242z0.f36117c;
            if (c4242z02 != null) {
                return c4242z02;
            }
            synchronized (C4242z0.f36116b) {
                c4242z0 = C4242z0.f36117c;
                if (c4242z0 == null) {
                    c4242z0 = new C4242z0(0);
                    C4242z0.f36117c = c4242z0;
                }
            }
            return c4242z0;
        }
    }

    private C4242z0() {
        this.f36119a = new HashMap<>();
    }

    public final C4236y0 a(long j4) {
        C4236y0 c4236y0Remove;
        synchronized (f36116b) {
            c4236y0Remove = this.f36119a.remove(Long.valueOf(j4));
        }
        return c4236y0Remove;
    }

    public /* synthetic */ C4242z0(int i) {
        this();
    }

    public final void a(long j4, C4236y0 adActivityData) {
        kotlin.jvm.internal.l.f(adActivityData, "adActivityData");
        synchronized (f36116b) {
            this.f36119a.put(Long.valueOf(j4), adActivityData);
            C1992A c1992a = C1992A.f18074a;
        }
    }
}
