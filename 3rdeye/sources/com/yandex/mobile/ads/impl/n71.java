package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class n71 {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f30795a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static volatile n71 f30796b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f30797c = 0;

    public static final class a {
        public static n71 a() {
            n71 n71Var;
            n71 n71Var2 = n71.f30796b;
            if (n71Var2 != null) {
                return n71Var2;
            }
            synchronized (n71.f30795a) {
                n71Var = n71.f30796b;
                if (n71Var == null) {
                    n71Var = new n71(0);
                    n71.f30796b = n71Var;
                }
            }
            return n71Var;
        }
    }

    private n71() {
    }

    public final boolean c() {
        return true;
    }

    public /* synthetic */ n71(int i) {
        this();
    }
}
