package com.yandex.mobile.ads.impl;

import b9.C1992A;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public final class qn1 {

    /* renamed from: b, reason: collision with root package name */
    public static final a f32297b = new a(0);

    /* renamed from: c, reason: collision with root package name */
    private static final Object f32298c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static volatile qn1 f32299d;

    /* renamed from: a, reason: collision with root package name */
    private final WeakHashMap f32300a;

    public static final class a {
        private a() {
        }

        public final qn1 a() {
            qn1 qn1Var;
            qn1 qn1Var2 = qn1.f32299d;
            if (qn1Var2 != null) {
                return qn1Var2;
            }
            synchronized (this) {
                qn1Var = qn1.f32299d;
                if (qn1Var == null) {
                    qn1Var = new qn1(0);
                    qn1.f32299d = qn1Var;
                }
            }
            return qn1Var;
        }

        public /* synthetic */ a(int i) {
            this();
        }
    }

    private qn1() {
        this.f32300a = new WeakHashMap();
    }

    public final String a(op1<?> request) {
        String str;
        kotlin.jvm.internal.l.f(request, "request");
        synchronized (f32298c) {
            str = (String) this.f32300a.get(request);
            this.f32300a.remove(request);
        }
        return str;
    }

    public /* synthetic */ qn1(int i) {
        this();
    }

    public final void a(tj request, String response) {
        kotlin.jvm.internal.l.f(request, "request");
        kotlin.jvm.internal.l.f(response, "response");
        synchronized (f32298c) {
            this.f32300a.put(request, response);
            C1992A c1992a = C1992A.f18074a;
        }
    }
}
