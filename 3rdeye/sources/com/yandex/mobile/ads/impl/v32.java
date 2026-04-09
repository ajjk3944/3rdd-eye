package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public abstract class v32 {

    /* renamed from: a, reason: collision with root package name */
    private final String f34331a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f34332b;

    /* renamed from: c, reason: collision with root package name */
    private y32 f34333c;

    /* renamed from: d, reason: collision with root package name */
    private long f34334d;

    public /* synthetic */ v32(String str) {
        this(str, true);
    }

    public final boolean a() {
        return this.f34332b;
    }

    public final String b() {
        return this.f34331a;
    }

    public final long c() {
        return this.f34334d;
    }

    public final y32 d() {
        return this.f34333c;
    }

    public abstract long e();

    public final String toString() {
        return this.f34331a;
    }

    public v32(String name, boolean z10) {
        kotlin.jvm.internal.l.f(name, "name");
        this.f34331a = name;
        this.f34332b = z10;
        this.f34334d = -1L;
    }

    public final void a(y32 queue) {
        kotlin.jvm.internal.l.f(queue, "queue");
        y32 y32Var = this.f34333c;
        if (y32Var == queue) {
            return;
        }
        if (y32Var != null) {
            throw new IllegalStateException("task is in multiple queues");
        }
        this.f34333c = queue;
    }

    public final void a(long j4) {
        this.f34334d = j4;
    }
}
