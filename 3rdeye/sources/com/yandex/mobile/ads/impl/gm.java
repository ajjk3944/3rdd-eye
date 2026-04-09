package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.res.Resources;
import com.yandex.mobile.ads.R;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
public class gm implements hv {

    /* renamed from: a, reason: collision with root package name */
    private final Context f27815a;

    public gm(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        this.f27815a = context.getApplicationContext();
    }

    @Override // com.yandex.mobile.ads.impl.hv
    public byte[][] a() throws Resources.NotFoundException, IOException {
        try {
            InputStream inputStreamOpenRawResource = this.f27815a.getResources().openRawResource(R.raw.monetization_ads_bundled_cert);
            try {
                kotlin.jvm.internal.l.c(inputStreamOpenRawResource);
                byte[] bArrU = com.google.gson.internal.c.u(inputStreamOpenRawResource);
                inputStreamOpenRawResource.close();
                return new byte[][]{bArrU};
            } finally {
            }
        } catch (IOException e4) {
            throw new IllegalStateException("Failed to create cert", e4);
        }
    }
}
