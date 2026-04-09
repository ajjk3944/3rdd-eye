package com.yandex.mobile.ads.impl;

import java.util.Queue;

/* loaded from: classes3.dex */
public final class it0<T> {

    /* renamed from: a, reason: collision with root package name */
    private final Queue<T> f28862a;

    public it0(Queue<T> queue) {
        kotlin.jvm.internal.l.f(queue, "queue");
        this.f28862a = queue;
    }

    public final int a() {
        return this.f28862a.size();
    }

    public final T b() {
        return this.f28862a.poll();
    }
}
