package com.yandex.mobile.ads.impl;

import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
final class l72 implements b32 {

    /* renamed from: c, reason: collision with root package name */
    public static final l72 f29914c = new l72();

    /* renamed from: b, reason: collision with root package name */
    private final List<av> f29915b;

    private l72() {
        this.f29915b = Collections.EMPTY_LIST;
    }

    @Override // com.yandex.mobile.ads.impl.b32
    public final int a() {
        return 1;
    }

    @Override // com.yandex.mobile.ads.impl.b32
    public final List<av> b(long j4) {
        return j4 >= 0 ? this.f29915b : Collections.EMPTY_LIST;
    }

    @Override // com.yandex.mobile.ads.impl.b32
    public final int a(long j4) {
        return j4 < 0 ? 0 : -1;
    }

    public l72(av avVar) {
        this.f29915b = Collections.singletonList(avVar);
    }

    @Override // com.yandex.mobile.ads.impl.b32
    public final long a(int i) {
        if (i == 0) {
            return 0L;
        }
        throw new IllegalArgumentException();
    }
}
