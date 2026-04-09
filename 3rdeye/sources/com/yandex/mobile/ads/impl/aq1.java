package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class aq1 {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f24793a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static volatile aq1 f24794b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f24795c = 0;

    public static final class a {
        public static aq1 a() {
            aq1 aq1Var;
            aq1 aq1Var2 = aq1.f24794b;
            if (aq1Var2 != null) {
                return aq1Var2;
            }
            synchronized (aq1.f24793a) {
                aq1Var = aq1.f24794b;
                if (aq1Var == null) {
                    aq1Var = new aq1();
                    aq1.f24794b = aq1Var;
                }
            }
            return aq1Var;
        }
    }

    public static void a(Context context, Object tag) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(tag, "tag");
        xc1.a(context).a(new K0(tag, 4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean a(Object tag, op1 op1Var) {
        kotlin.jvm.internal.l.f(tag, "$tag");
        return tag.equals(op1Var.i());
    }
}
