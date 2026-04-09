package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.yn2;
import java.util.ArrayDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class co2 implements yn2.a {

    /* renamed from: b, reason: collision with root package name */
    private final ArrayDeque<yn2> f25734b = new ArrayDeque<>();

    /* renamed from: c, reason: collision with root package name */
    private yn2 f25735c = null;

    /* renamed from: a, reason: collision with root package name */
    private final ThreadPoolExecutor f25733a = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, new LinkedBlockingQueue());

    private void b() {
        yn2 yn2VarPoll = this.f25734b.poll();
        this.f25735c = yn2VarPoll;
        if (yn2VarPoll != null) {
            yn2VarPoll.a(this.f25733a);
        }
    }

    public final void a() {
        this.f25735c = null;
        b();
    }

    public final void a(yn2 yn2Var) {
        yn2Var.a(this);
        this.f25734b.add(yn2Var);
        if (this.f25735c == null) {
            b();
        }
    }
}
