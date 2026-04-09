package com.yandex.mobile.ads.impl;

import android.view.View;

/* loaded from: classes3.dex */
public final class kb2 {

    /* renamed from: d, reason: collision with root package name */
    static final /* synthetic */ w9.i<Object>[] f29585d;

    /* renamed from: a, reason: collision with root package name */
    private final a f29586a;

    /* renamed from: b, reason: collision with root package name */
    private final String f29587b;

    /* renamed from: c, reason: collision with root package name */
    private final ao1 f29588c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final a f29589b;

        /* renamed from: c, reason: collision with root package name */
        public static final a f29590c;

        /* renamed from: d, reason: collision with root package name */
        public static final a f29591d;

        /* renamed from: e, reason: collision with root package name */
        public static final a f29592e;

        /* renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ a[] f29593f;

        static {
            a aVar = new a(0, "CONTROLS");
            f29589b = aVar;
            a aVar2 = new a(1, "CLOSE_AD");
            f29590c = aVar2;
            a aVar3 = new a(2, "NOT_VISIBLE");
            f29591d = aVar3;
            a aVar4 = new a(3, "OTHER");
            f29592e = aVar4;
            a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
            f29593f = aVarArr;
            com.google.gson.internal.c.l(aVarArr);
        }

        private a(int i, String str) {
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f29593f.clone();
        }
    }

    static {
        kotlin.jvm.internal.n nVar = new kotlin.jvm.internal.n(kb2.class, "view", "getView()Landroid/view/View;");
        kotlin.jvm.internal.x.f43661a.getClass();
        f29585d = new w9.i[]{nVar};
    }

    public kb2(View view, a purpose, String str) {
        kotlin.jvm.internal.l.f(view, "view");
        kotlin.jvm.internal.l.f(purpose, "purpose");
        this.f29586a = purpose;
        this.f29587b = str;
        this.f29588c = bo1.a(view);
    }

    public final String a() {
        return this.f29587b;
    }

    public final a b() {
        return this.f29586a;
    }

    public final View c() {
        return (View) this.f29588c.getValue(this, f29585d[0]);
    }
}
