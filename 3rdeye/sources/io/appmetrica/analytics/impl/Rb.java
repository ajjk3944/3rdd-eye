package io.appmetrica.analytics.impl;

import b9.C2001h;
import b9.InterfaceC2000g;
import io.appmetrica.analytics.networktasks.internal.ConfigProvider;

/* loaded from: classes3.dex */
public final class Rb implements ConfigProvider {

    /* renamed from: a, reason: collision with root package name */
    public final C4940s5 f40045a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC2000g f40046b = C2001h.b(new Qb(this));

    public Rb(C4940s5 c4940s5) {
        this.f40045a = c4940s5;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ConfigProvider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5028vh getConfig() {
        return (C5028vh) this.f40046b.getValue();
    }
}
