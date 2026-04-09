package com.yandex.mobile.ads.impl;

import android.view.View;
import java.util.List;

/* loaded from: classes3.dex */
public interface zf2 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final a f36464b;

        /* renamed from: c, reason: collision with root package name */
        public static final a f36465c;

        /* renamed from: d, reason: collision with root package name */
        public static final a f36466d;

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ a[] f36467e;

        static {
            a aVar = new a(0, "FIRST_QUARTILE");
            f36464b = aVar;
            a aVar2 = new a(1, "MIDPOINT");
            f36465c = aVar2;
            a aVar3 = new a(2, "THIRD_QUARTILE");
            f36466d = aVar3;
            a[] aVarArr = {aVar, aVar2, aVar3};
            f36467e = aVarArr;
            com.google.gson.internal.c.l(aVarArr);
        }

        private a(int i, String str) {
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f36467e.clone();
        }
    }

    void a();

    void a(float f10);

    void a(float f10, long j4);

    void a(View view, List<kb2> list);

    void a(kc2 kc2Var);

    void a(a aVar);

    void a(String str);

    void b();

    void c();

    void d();

    void e();

    void f();

    void g();

    void h();

    void i();

    void j();

    void k();

    void l();

    void m();

    void n();
}
