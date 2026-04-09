package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public interface dx1 {

    /* renamed from: a, reason: collision with root package name */
    public static final a f26520a = a.f26521a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f26521a = new a();

        /* renamed from: b, reason: collision with root package name */
        private static final Object f26522b = new Object();

        /* renamed from: c, reason: collision with root package name */
        private static volatile dx1 f26523c;

        private a() {
        }

        public static dx1 a(Context context) {
            dx1 ex1Var;
            kotlin.jvm.internal.l.f(context, "context");
            dx1 dx1Var = f26523c;
            if (dx1Var != null) {
                return dx1Var;
            }
            synchronized (f26522b) {
                ex1Var = f26523c;
                if (ex1Var == null) {
                    ex1Var = new ex1(es0.a(context, "YadPreferenceFile"));
                    f26523c = ex1Var;
                }
            }
            return ex1Var;
        }
    }

    String a();

    void a(String str);
}
