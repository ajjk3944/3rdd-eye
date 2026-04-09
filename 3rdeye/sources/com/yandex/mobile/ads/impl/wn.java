package com.yandex.mobile.ads.impl;

import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
final class wn implements b32 {

    /* renamed from: b, reason: collision with root package name */
    private final List<av> f35024b;

    public wn(List<av> list) {
        this.f35024b = list;
    }

    @Override // com.yandex.mobile.ads.impl.b32
    public final int a() {
        return 1;
    }

    @Override // com.yandex.mobile.ads.impl.b32
    public final List<av> b(long j4) {
        return j4 >= 0 ? this.f35024b : Collections.EMPTY_LIST;
    }

    @Override // com.yandex.mobile.ads.impl.b32
    public final int a(long j4) {
        return j4 < 0 ? 0 : -1;
    }

    @Override // com.yandex.mobile.ads.impl.b32
    public final long a(int i) {
        if (i == 0) {
            return 0L;
        }
        throw new IllegalArgumentException();
    }
}
