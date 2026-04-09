package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public interface c70 extends p52 {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final l52 f25551a;

        /* renamed from: b, reason: collision with root package name */
        public final int[] f25552b;

        /* renamed from: c, reason: collision with root package name */
        public final int f25553c;

        public a(int i, l52 l52Var, int[] iArr) {
            if (iArr.length == 0) {
                rs0.a("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
            }
            this.f25551a = l52Var;
            this.f25552b = iArr;
            this.f25553c = i;
        }
    }

    public interface b {
    }

    void a(float f10);

    void a(boolean z10);

    void c();

    void d();

    dc0 e();

    void f();

    void g();
}
