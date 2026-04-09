package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.yc2;
import s9.AbstractC5588a;

/* loaded from: classes3.dex */
public final class uc2 extends AbstractC5588a<yc2.b> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ wc2 f34035a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uc2(wc2 wc2Var) {
        super(null);
        this.f34035a = wc2Var;
    }

    @Override // s9.AbstractC5588a
    public final void afterChange(w9.i<?> property, yc2.b bVar, yc2.b bVar2) {
        kotlin.jvm.internal.l.f(property, "property");
        this.f34035a.f34904f.a(bVar2);
    }
}
