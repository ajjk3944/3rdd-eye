package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.vy1;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class lb0 implements vy1 {

    /* renamed from: a, reason: collision with root package name */
    private final vy1.a f29963a;

    /* renamed from: b, reason: collision with root package name */
    private final int f29964b;

    /* renamed from: c, reason: collision with root package name */
    private final int f29965c;

    /* renamed from: d, reason: collision with root package name */
    private final String f29966d;

    public lb0(int i, int i10, vy1.a sizeType) {
        kotlin.jvm.internal.l.f(sizeType, "sizeType");
        this.f29963a = sizeType;
        this.f29964b = (i >= 0 || -1 == i) ? i : 0;
        this.f29965c = (i10 >= 0 || -2 == i10) ? i10 : 0;
        this.f29966d = String.format(Locale.US, "%dx%d", Arrays.copyOf(new Object[]{Integer.valueOf(i), Integer.valueOf(i10)}, 2));
    }

    @Override // com.yandex.mobile.ads.impl.vy1
    public final int a(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        int i = this.f29965c;
        return -2 == i ? jh2.b(context) : i;
    }

    @Override // com.yandex.mobile.ads.impl.vy1
    public final int b(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        int i = this.f29965c;
        return -2 == i ? jh2.c(context) : jh2.a(context, i);
    }

    @Override // com.yandex.mobile.ads.impl.vy1
    public final int c(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        int i = this.f29964b;
        return -1 == i ? jh2.d(context) : i;
    }

    @Override // com.yandex.mobile.ads.impl.vy1
    public final int d(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        int i = this.f29964b;
        if (-1 != i) {
            return jh2.a(context, i);
        }
        int i10 = jh2.f29145b;
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && lb0.class.equals(obj.getClass())) {
            lb0 lb0Var = (lb0) obj;
            if (this.f29964b == lb0Var.f29964b && this.f29965c == lb0Var.f29965c && this.f29963a == lb0Var.f29963a) {
                return true;
            }
        }
        return false;
    }

    @Override // com.yandex.mobile.ads.impl.vy1
    public final int getHeight() {
        return this.f29965c;
    }

    @Override // com.yandex.mobile.ads.impl.vy1
    public final int getWidth() {
        return this.f29964b;
    }

    public final int hashCode() {
        return this.f29963a.hashCode() + C4121h3.a(this.f29966d, ((this.f29964b * 31) + this.f29965c) * 31, 31);
    }

    public final String toString() {
        return this.f29966d;
    }

    @Override // com.yandex.mobile.ads.impl.vy1
    public final vy1.a a() {
        return this.f29963a;
    }
}
