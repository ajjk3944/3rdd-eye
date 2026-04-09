package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.b40;
import com.yandex.mobile.ads.impl.c40;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes3.dex */
public final class p50 implements b40 {

    /* renamed from: a, reason: collision with root package name */
    private final b40.a f31594a;

    public p50(b40.a aVar) {
        this.f31594a = (b40.a) zf.a(aVar);
    }

    @Override // com.yandex.mobile.ads.impl.b40
    public final yu getCryptoConfig() {
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.b40
    public final b40.a getError() {
        return this.f31594a;
    }

    @Override // com.yandex.mobile.ads.impl.b40
    public final UUID getSchemeUuid() {
        return lm.f30038a;
    }

    @Override // com.yandex.mobile.ads.impl.b40
    public final int getState() {
        return 1;
    }

    @Override // com.yandex.mobile.ads.impl.b40
    public final boolean playClearSamplesWithoutKeys() {
        return false;
    }

    @Override // com.yandex.mobile.ads.impl.b40
    public final Map<String, String> queryKeyStatus() {
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.b40
    public final boolean requiresSecureDecoder(String str) {
        return false;
    }

    @Override // com.yandex.mobile.ads.impl.b40
    public final void a(c40.a aVar) {
    }

    @Override // com.yandex.mobile.ads.impl.b40
    public final void b(c40.a aVar) {
    }
}
