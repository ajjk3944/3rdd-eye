package com.yandex.mobile.ads.impl;

import java.io.IOException;

/* loaded from: classes3.dex */
public final class ug0 extends v32 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ sg0 f34056e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ int f34057f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ int f34058g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ug0(String str, sg0 sg0Var, int i, int i10) {
        super(str, true);
        this.f34056e = sg0Var;
        this.f34057f = i;
        this.f34058g = i10;
    }

    @Override // com.yandex.mobile.ads.impl.v32
    public final long e() throws IOException {
        this.f34056e.a(this.f34057f, this.f34058g, true);
        return -1L;
    }
}
