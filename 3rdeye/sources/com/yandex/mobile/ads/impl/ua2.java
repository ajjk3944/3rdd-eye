package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class ua2 implements Comparable<ua2> {

    /* renamed from: b, reason: collision with root package name */
    private final int f34001b;

    /* renamed from: c, reason: collision with root package name */
    private final int f34002c;

    /* renamed from: d, reason: collision with root package name */
    private final int f34003d;

    public ua2(int i, int i10, int i11) {
        this.f34001b = i;
        this.f34002c = i10;
        this.f34003d = i11;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(ua2 other) {
        kotlin.jvm.internal.l.f(other, "other");
        int i = this.f34001b;
        int i10 = other.f34001b;
        if (i != i10) {
            return kotlin.jvm.internal.l.h(i, i10);
        }
        int i11 = this.f34002c;
        int i12 = other.f34002c;
        return i11 != i12 ? kotlin.jvm.internal.l.h(i11, i12) : kotlin.jvm.internal.l.h(this.f34003d, other.f34003d);
    }

    public final int a() {
        return this.f34001b;
    }
}
