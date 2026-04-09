package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.bi1;
import com.yandex.mobile.ads.impl.gg1;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class u60 {

    /* renamed from: c, reason: collision with root package name */
    private static final long f33945c = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: a, reason: collision with root package name */
    private final bi1.b f33946a;

    /* renamed from: b, reason: collision with root package name */
    private final gg1 f33947b;

    public final class a implements ig1 {
        public a() {
        }

        @Override // com.yandex.mobile.ads.impl.ig1
        public final void a() {
            u60.this.f33946a.b(h60.a());
        }
    }

    public /* synthetic */ u60(bi1.b bVar) {
        this(bVar, gg1.a.a(false));
    }

    public final void b() {
        this.f33947b.stop();
    }

    public final void a() {
        this.f33947b.a(f33945c, new a());
    }

    public u60(bi1.b eventListener, gg1 pausableTimer) {
        kotlin.jvm.internal.l.f(eventListener, "eventListener");
        kotlin.jvm.internal.l.f(pausableTimer, "pausableTimer");
        this.f33946a = eventListener;
        this.f33947b = pausableTimer;
    }
}
