package io.appmetrica.analytics.impl;

/* loaded from: classes3.dex */
public class Dn implements Qi {

    /* renamed from: a, reason: collision with root package name */
    public final int f39316a;

    /* renamed from: b, reason: collision with root package name */
    public final int f39317b;

    /* renamed from: c, reason: collision with root package name */
    public int f39318c = 0;

    public Dn(int i, int i10) {
        this.f39316a = i;
        this.f39317b = i10;
    }

    public final int a() {
        return this.f39317b;
    }

    public final boolean b() {
        int i = this.f39318c;
        this.f39318c = i + 1;
        return i < this.f39316a;
    }

    public final void c() {
        this.f39318c = 0;
    }
}
