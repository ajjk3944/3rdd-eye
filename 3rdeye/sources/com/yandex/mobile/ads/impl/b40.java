package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.c40;
import java.io.IOException;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes3.dex */
public interface b40 {

    public static class a extends IOException {

        /* renamed from: b, reason: collision with root package name */
        public final int f25078b;

        public a(Throwable th, int i) {
            super(th);
            this.f25078b = i;
        }
    }

    void a(c40.a aVar);

    void b(c40.a aVar);

    yu getCryptoConfig();

    a getError();

    UUID getSchemeUuid();

    int getState();

    boolean playClearSamplesWithoutKeys();

    Map<String, String> queryKeyStatus();

    boolean requiresSecureDecoder(String str);
}
