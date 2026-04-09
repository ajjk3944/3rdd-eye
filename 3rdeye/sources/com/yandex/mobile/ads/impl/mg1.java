package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import com.yandex.mobile.ads.impl.em;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class mg1 extends en1 {

    /* renamed from: d, reason: collision with root package name */
    public static final em.a<mg1> f30372d = new L2(5);

    /* renamed from: c, reason: collision with root package name */
    private final float f30373c;

    public mg1() {
        this.f30373c = -1.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static mg1 b(Bundle bundle) {
        if (bundle.getInt(Integer.toString(0, 36), -1) != 1) {
            throw new IllegalArgumentException();
        }
        float f10 = bundle.getFloat(Integer.toString(1, 36), -1.0f);
        return f10 == -1.0f ? new mg1() : new mg1(f10);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof mg1) && this.f30373c == ((mg1) obj).f30373c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f30373c)});
    }

    public mg1(float f10) {
        zf.a("percent must be in the range of [0, 100]", f10 >= 0.0f && f10 <= 100.0f);
        this.f30373c = f10;
    }
}
