package com.yandex.mobile.ads.impl;

import java.util.Arrays;

/* loaded from: classes3.dex */
public abstract class ok implements c70 {

    /* renamed from: a, reason: collision with root package name */
    protected final l52 f31399a;

    /* renamed from: b, reason: collision with root package name */
    protected final int f31400b;

    /* renamed from: c, reason: collision with root package name */
    protected final int[] f31401c;

    /* renamed from: d, reason: collision with root package name */
    private final dc0[] f31402d;

    /* renamed from: e, reason: collision with root package name */
    private int f31403e;

    public ok(l52 l52Var, int[] iArr) {
        int i = 0;
        zf.b(iArr.length > 0);
        this.f31399a = (l52) zf.a(l52Var);
        int length = iArr.length;
        this.f31400b = length;
        this.f31402d = new dc0[length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            this.f31402d[i10] = l52Var.a(iArr[i10]);
        }
        Arrays.sort(this.f31402d, new F3(2));
        this.f31401c = new int[this.f31400b];
        while (true) {
            int i11 = this.f31400b;
            if (i >= i11) {
                long[] jArr = new long[i11];
                return;
            } else {
                this.f31401c[i] = l52Var.a(this.f31402d[i]);
                i++;
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.c70
    public void a(float f10) {
    }

    @Override // com.yandex.mobile.ads.impl.c70
    public void c() {
    }

    @Override // com.yandex.mobile.ads.impl.c70
    public final dc0 e() {
        return this.f31402d[0];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ok okVar = (ok) obj;
            if (this.f31399a == okVar.f31399a && Arrays.equals(this.f31401c, okVar.f31401c)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.yandex.mobile.ads.impl.c70
    public final /* synthetic */ void f() {
        M.b(this);
    }

    @Override // com.yandex.mobile.ads.impl.c70
    public final /* synthetic */ void g() {
        M.c(this);
    }

    public final int hashCode() {
        if (this.f31403e == 0) {
            this.f31403e = Arrays.hashCode(this.f31401c) + (System.identityHashCode(this.f31399a) * 31);
        }
        return this.f31403e;
    }

    @Override // com.yandex.mobile.ads.impl.c70
    public final /* synthetic */ void a(boolean z10) {
        M.a(this, z10);
    }

    @Override // com.yandex.mobile.ads.impl.p52
    public final int b(int i) {
        return this.f31401c[i];
    }

    @Override // com.yandex.mobile.ads.impl.p52
    public final int c(int i) {
        for (int i10 = 0; i10 < this.f31400b; i10++) {
            if (this.f31401c[i10] == i) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.yandex.mobile.ads.impl.p52
    public final dc0 a(int i) {
        return this.f31402d[i];
    }

    @Override // com.yandex.mobile.ads.impl.p52
    public final int b() {
        return this.f31401c.length;
    }

    @Override // com.yandex.mobile.ads.impl.p52
    public final l52 a() {
        return this.f31399a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int a(dc0 dc0Var, dc0 dc0Var2) {
        return dc0Var2.i - dc0Var.i;
    }

    @Override // com.yandex.mobile.ads.impl.c70
    public void d() {
    }
}
