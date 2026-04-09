package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ah;
import com.yandex.mobile.ads.impl.l32;
import com.yandex.mobile.ads.impl.uu0;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class a00 implements uu0.b {
    @Override // com.yandex.mobile.ads.impl.uu0.b
    public final uu0 a(uu0.a aVar) throws IOException {
        int i = s82.f32899a;
        if (i < 23 || i < 31) {
            return new l32.a().a(aVar);
        }
        int iC = k01.c(aVar.f34222c.f26083m);
        rs0.c("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + s82.d(iC));
        return new ah.a(iC).a(aVar);
    }
}
