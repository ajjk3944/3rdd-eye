package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.res.Resources;
import com.yandex.mobile.ads.R;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class cu1 extends gm {

    /* renamed from: b, reason: collision with root package name */
    private final Context f25772b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cu1(Context context) {
        super(context);
        kotlin.jvm.internal.l.f(context, "context");
        this.f25772b = context.getApplicationContext();
    }

    @Override // com.yandex.mobile.ads.impl.gm, com.yandex.mobile.ads.impl.hv
    public final byte[][] a() throws Resources.NotFoundException, IOException {
        try {
            InputStream inputStreamOpenRawResource = this.f25772b.getResources().openRawResource(R.raw.monetization_ads_sdkinternalca);
            try {
                kotlin.jvm.internal.l.c(inputStreamOpenRawResource);
                byte[] bArrU = com.google.gson.internal.c.u(inputStreamOpenRawResource);
                inputStreamOpenRawResource.close();
                byte[][] bArrA = super.a();
                byte[][] bArr = {bArrU};
                kotlin.jvm.internal.l.f(bArrA, "<this>");
                int length = bArrA.length;
                Object[] objArrCopyOf = Arrays.copyOf(bArrA, length + 1);
                System.arraycopy(bArr, 0, objArrCopyOf, length, 1);
                kotlin.jvm.internal.l.c(objArrCopyOf);
                return (byte[][]) objArrCopyOf;
            } finally {
            }
        } catch (IOException e4) {
            throw new IllegalStateException("Failed to create cert", e4);
        }
    }
}
