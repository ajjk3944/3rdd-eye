package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.yc2;
import s9.AbstractC5588a;

/* loaded from: classes3.dex */
public final class vc2 extends AbstractC5588a<yc2.a> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ wc2 f34447a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vc2(wc2 wc2Var) {
        super(null);
        this.f34447a = wc2Var;
    }

    @Override // s9.AbstractC5588a
    public final void afterChange(w9.i<?> property, yc2.a aVar, yc2.a aVar2) {
        kotlin.jvm.internal.l.f(property, "property");
        this.f34447a.f34904f.a(aVar2);
    }
}
