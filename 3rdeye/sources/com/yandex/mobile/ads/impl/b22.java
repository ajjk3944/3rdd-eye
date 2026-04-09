package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import com.yandex.mobile.ads.impl.em;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class b22 extends en1 {

    /* renamed from: e, reason: collision with root package name */
    public static final em.a<b22> f25068e = new I0(1);

    /* renamed from: c, reason: collision with root package name */
    private final int f25069c;

    /* renamed from: d, reason: collision with root package name */
    private final float f25070d;

    public b22(int i) {
        zf.a("maxStars must be a positive integer", i > 0);
        this.f25069c = i;
        this.f25070d = -1.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static b22 b(Bundle bundle) {
        if (bundle.getInt(Integer.toString(0, 36), -1) != 2) {
            throw new IllegalArgumentException();
        }
        int i = bundle.getInt(Integer.toString(1, 36), 5);
        float f10 = bundle.getFloat(Integer.toString(2, 36), -1.0f);
        return f10 == -1.0f ? new b22(i) : new b22(i, f10);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b22)) {
            return false;
        }
        b22 b22Var = (b22) obj;
        return this.f25069c == b22Var.f25069c && this.f25070d == b22Var.f25070d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f25069c), Float.valueOf(this.f25070d)});
    }

    public b22(int i, float f10) {
        boolean z10 = false;
        zf.a("maxStars must be a positive integer", i > 0);
        if (f10 >= 0.0f && f10 <= i) {
            z10 = true;
        }
        zf.a("starRating is out of range [0, maxStars]", z10);
        this.f25069c = i;
        this.f25070d = f10;
    }
}
