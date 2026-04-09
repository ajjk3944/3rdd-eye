package com.yandex.mobile.ads.impl;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class g22 implements ov {

    /* renamed from: a, reason: collision with root package name */
    private final ov f27531a;

    /* renamed from: b, reason: collision with root package name */
    private long f27532b;

    /* renamed from: c, reason: collision with root package name */
    private Uri f27533c = Uri.EMPTY;

    public g22(ov ovVar) {
        this.f27531a = (ov) zf.a(ovVar);
    }

    @Override // com.yandex.mobile.ads.impl.ov
    public final void a(q62 q62Var) {
        q62Var.getClass();
        this.f27531a.a(q62Var);
    }

    @Override // com.yandex.mobile.ads.impl.ov
    public final void close() throws IOException {
        this.f27531a.close();
    }

    public final long e() {
        return this.f27532b;
    }

    public final Uri f() {
        return this.f27533c;
    }

    @Override // com.yandex.mobile.ads.impl.ov
    public final Map<String, List<String>> getResponseHeaders() {
        return this.f27531a.getResponseHeaders();
    }

    @Override // com.yandex.mobile.ads.impl.ov
    public final Uri getUri() {
        return this.f27531a.getUri();
    }

    @Override // com.yandex.mobile.ads.impl.lv
    public final int read(byte[] bArr, int i, int i10) throws IOException {
        int i11 = this.f27531a.read(bArr, i, i10);
        if (i11 != -1) {
            this.f27532b += i11;
        }
        return i11;
    }

    @Override // com.yandex.mobile.ads.impl.ov
    public final long a(sv svVar) throws IOException {
        this.f27533c = svVar.f33250a;
        long jA = this.f27531a.a(svVar);
        Uri uri = this.f27531a.getUri();
        uri.getClass();
        this.f27533c = uri;
        this.f27531a.getResponseHeaders();
        return jA;
    }
}
