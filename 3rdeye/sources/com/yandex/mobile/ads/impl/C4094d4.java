package com.yandex.mobile.ads.impl;

import c9.C2097r;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yandex.mobile.ads.impl.d4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4094d4 {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f25940c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static volatile C4094d4 f25941d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f25942e = 0;

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f25943a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f25944b;

    /* renamed from: com.yandex.mobile.ads.impl.d4$a */
    public static final class a {
        public static C4094d4 a() {
            C4094d4 c4094d4;
            C4094d4 c4094d42 = C4094d4.f25941d;
            if (c4094d42 != null) {
                return c4094d42;
            }
            synchronized (C4094d4.f25940c) {
                c4094d4 = C4094d4.f25941d;
                if (c4094d4 == null) {
                    c4094d4 = new C4094d4(0);
                    C4094d4.f25941d = c4094d4;
                }
            }
            return c4094d4;
        }
    }

    private C4094d4() {
        this.f25943a = new ArrayList();
        this.f25944b = new ArrayList();
    }

    public final void b(String id) {
        kotlin.jvm.internal.l.f(id, "id");
        synchronized (f25940c) {
            this.f25943a.remove(id);
            this.f25943a.add(id);
        }
    }

    public final List<String> c() {
        List<String> listG0;
        synchronized (f25940c) {
            listG0 = C2097r.G0(this.f25944b);
        }
        return listG0;
    }

    public final List<String> d() {
        List<String> listG0;
        synchronized (f25940c) {
            listG0 = C2097r.G0(this.f25943a);
        }
        return listG0;
    }

    public final void a(String id) {
        kotlin.jvm.internal.l.f(id, "id");
        synchronized (f25940c) {
            this.f25944b.remove(id);
            this.f25944b.add(id);
        }
    }

    public /* synthetic */ C4094d4(int i) {
        this();
    }
}
