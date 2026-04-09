package com.yandex.mobile.ads.impl;

import java.util.List;

/* renamed from: com.yandex.mobile.ads.impl.s5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4199s5 {

    /* renamed from: a, reason: collision with root package name */
    private final List<y5> f32874a;

    /* renamed from: b, reason: collision with root package name */
    private final int f32875b;

    /* renamed from: c, reason: collision with root package name */
    private final int f32876c;

    public C4199s5(int i, int i10, List items) {
        kotlin.jvm.internal.l.f(items, "items");
        this.f32874a = items;
        this.f32875b = i;
        this.f32876c = i10;
    }

    public final int a() {
        return this.f32875b;
    }

    public final List<y5> b() {
        return this.f32874a;
    }

    public final int c() {
        return this.f32876c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4199s5)) {
            return false;
        }
        C4199s5 c4199s5 = (C4199s5) obj;
        return kotlin.jvm.internal.l.b(this.f32874a, c4199s5.f32874a) && this.f32875b == c4199s5.f32875b && this.f32876c == c4199s5.f32876c;
    }

    public final int hashCode() {
        return this.f32876c + sx1.a(this.f32875b, this.f32874a.hashCode() * 31, 31);
    }

    public final String toString() {
        List<y5> list = this.f32874a;
        int i = this.f32875b;
        int i10 = this.f32876c;
        StringBuilder sb = new StringBuilder("AdPod(items=");
        sb.append(list);
        sb.append(", closableAdPosition=");
        sb.append(i);
        sb.append(", rewardAdPosition=");
        return B4.i.j(sb, i10, ")");
    }
}
