package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class yl0 {

    /* renamed from: a, reason: collision with root package name */
    private final u72 f35854a;

    /* renamed from: b, reason: collision with root package name */
    private final vl0 f35855b;

    public yl0(u72 unifiedInstreamAdBinder) {
        kotlin.jvm.internal.l.f(unifiedInstreamAdBinder, "unifiedInstreamAdBinder");
        this.f35854a = unifiedInstreamAdBinder;
        this.f35855b = vl0.f34614c.a();
    }

    public final void a(ct player) {
        kotlin.jvm.internal.l.f(player, "player");
        u72 u72VarA = this.f35855b.a(player);
        if (kotlin.jvm.internal.l.b(this.f35854a, u72VarA)) {
            return;
        }
        if (u72VarA != null) {
            u72VarA.invalidateAdPlayer();
        }
        this.f35855b.a(player, this.f35854a);
    }

    public final void b(ct player) {
        kotlin.jvm.internal.l.f(player, "player");
        this.f35855b.b(player);
    }
}
