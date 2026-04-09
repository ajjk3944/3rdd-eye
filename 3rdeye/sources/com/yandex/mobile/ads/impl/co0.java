package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class co0 {

    /* renamed from: a, reason: collision with root package name */
    private final ys f25729a;

    /* renamed from: b, reason: collision with root package name */
    private final bo0 f25730b;

    public co0(ys instreamAdBinder) {
        kotlin.jvm.internal.l.f(instreamAdBinder, "instreamAdBinder");
        this.f25729a = instreamAdBinder;
        this.f25730b = bo0.f25353c.a();
    }

    public final void a(fu player) {
        kotlin.jvm.internal.l.f(player, "player");
        ys ysVarA = this.f25730b.a(player);
        if (kotlin.jvm.internal.l.b(this.f25729a, ysVarA)) {
            return;
        }
        if (ysVarA != null) {
            ysVarA.a();
        }
        this.f25730b.a(player, this.f25729a);
    }

    public final void b(fu player) {
        kotlin.jvm.internal.l.f(player, "player");
        this.f25730b.b(player);
    }
}
