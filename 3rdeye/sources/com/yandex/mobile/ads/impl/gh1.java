package com.yandex.mobile.ads.impl;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes3.dex */
public final class gh1 implements ov {

    /* renamed from: a, reason: collision with root package name */
    public static final gh1 f27744a = new gh1();

    private gh1() {
    }

    @Override // com.yandex.mobile.ads.impl.ov
    public final void a(q62 q62Var) {
    }

    @Override // com.yandex.mobile.ads.impl.ov
    public final /* synthetic */ Map getResponseHeaders() {
        return B3.a(this);
    }

    @Override // com.yandex.mobile.ads.impl.ov
    public final Uri getUri() {
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.lv
    public final int read(byte[] bArr, int i, int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // com.yandex.mobile.ads.impl.ov
    public final long a(sv svVar) throws IOException {
        throw new IOException("PlaceholderDataSource cannot be opened");
    }

    @Override // com.yandex.mobile.ads.impl.ov
    public final void close() {
    }
}
