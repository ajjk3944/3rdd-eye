package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class y60 {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f35644c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static volatile y60 f35645d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f35646e = 0;

    /* renamed from: a, reason: collision with root package name */
    private final x60 f35647a;

    /* renamed from: b, reason: collision with root package name */
    private by1 f35648b;

    public static final class a {
        public static y60 a() {
            y60 y60Var;
            y60 y60Var2 = y60.f35645d;
            if (y60Var2 != null) {
                return y60Var2;
            }
            synchronized (y60.f35644c) {
                y60Var = y60.f35645d;
                if (y60Var == null) {
                    y60Var = new y60(0);
                    y60.f35645d = y60Var;
                }
            }
            return y60Var;
        }
    }

    private y60() {
        this.f35647a = new x60();
    }

    public final mm a(Context context) {
        by1 by1VarA;
        kotlin.jvm.internal.l.f(context, "context");
        synchronized (f35644c) {
            by1VarA = this.f35648b;
            if (by1VarA == null) {
                by1VarA = this.f35647a.a(context);
                this.f35648b = by1VarA;
            }
        }
        return by1VarA;
    }

    public /* synthetic */ y60(int i) {
        this();
    }
}
