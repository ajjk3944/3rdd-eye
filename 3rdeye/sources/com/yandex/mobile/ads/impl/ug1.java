package com.yandex.mobile.ads.impl;

import java.util.Set;

/* loaded from: classes3.dex */
final class ug1 extends kotlin.jvm.internal.m implements p9.l<C4185q4, Boolean> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Set<EnumC4191r4> f34059b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ug1(Set<? extends EnumC4191r4> set) {
        super(1);
        this.f34059b = set;
    }

    @Override // p9.l
    public final Boolean invoke(C4185q4 c4185q4) {
        C4185q4 it = c4185q4;
        kotlin.jvm.internal.l.f(it, "it");
        return Boolean.valueOf(this.f34059b.contains(it.a()));
    }
}
