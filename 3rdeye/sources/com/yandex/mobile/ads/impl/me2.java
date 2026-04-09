package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class me2 {

    /* renamed from: c, reason: collision with root package name */
    public static final a f30361c = new a(0);

    /* renamed from: d, reason: collision with root package name */
    private static volatile me2 f30362d;

    /* renamed from: a, reason: collision with root package name */
    private final Context f30363a;

    /* renamed from: b, reason: collision with root package name */
    private final cq1 f30364b;

    public static final class a {
        private a() {
        }

        public final me2 a(Context context) {
            me2 me2Var;
            kotlin.jvm.internal.l.f(context, "context");
            me2 me2Var2 = me2.f30362d;
            if (me2Var2 != null) {
                return me2Var2;
            }
            synchronized (this) {
                me2Var = me2.f30362d;
                if (me2Var == null) {
                    me2Var = new me2(context, 0);
                    me2.f30362d = me2Var;
                }
            }
            return me2Var;
        }

        public /* synthetic */ a(int i) {
            this();
        }
    }

    private me2(Context context) {
        Context appContext = context.getApplicationContext();
        this.f30363a = appContext;
        kotlin.jvm.internal.l.e(appContext, "appContext");
        this.f30364b = uk2.a(appContext, 4);
    }

    public final void a(String url) {
        kotlin.jvm.internal.l.f(url, "url");
        Context appContext = this.f30363a;
        kotlin.jvm.internal.l.e(appContext, "appContext");
        this.f30364b.a(new eh1(appContext, url, new li2()));
    }

    public /* synthetic */ me2(Context context, int i) {
        this(context);
    }
}
