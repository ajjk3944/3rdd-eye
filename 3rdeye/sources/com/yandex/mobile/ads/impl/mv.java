package com.yandex.mobile.ads.impl;

import android.net.Uri;
import android.util.Base64;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.net.URLDecoder;

/* loaded from: classes3.dex */
public final class mv extends dk {

    /* renamed from: e, reason: collision with root package name */
    private sv f30521e;

    /* renamed from: f, reason: collision with root package name */
    private byte[] f30522f;

    /* renamed from: g, reason: collision with root package name */
    private int f30523g;

    /* renamed from: h, reason: collision with root package name */
    private int f30524h;

    public mv() {
        super(false);
    }

    @Override // com.yandex.mobile.ads.impl.ov
    public final long a(sv svVar) throws IOException {
        b(svVar);
        this.f30521e = svVar;
        Uri uri = svVar.f33250a;
        String scheme = uri.getScheme();
        zf.a("Unsupported scheme: " + scheme, "data".equals(scheme));
        String schemeSpecificPart = uri.getSchemeSpecificPart();
        int i = s82.f32899a;
        String[] strArrSplit = schemeSpecificPart.split(StringUtils.COMMA, -1);
        if (strArrSplit.length != 2) {
            throw yf1.a("Unexpected URI format: " + uri, (IllegalArgumentException) null);
        }
        String str = strArrSplit[1];
        if (strArrSplit[0].contains(";base64")) {
            try {
                this.f30522f = Base64.decode(str, 0);
            } catch (IllegalArgumentException e4) {
                throw yf1.a("Error while parsing Base64 encoded string: " + str, e4);
            }
        } else {
            this.f30522f = s82.c(URLDecoder.decode(str, fo.f27408a.name()));
        }
        long j4 = svVar.f33255f;
        byte[] bArr = this.f30522f;
        if (j4 > bArr.length) {
            this.f30522f = null;
            throw new pv(2008);
        }
        int i10 = (int) j4;
        this.f30523g = i10;
        int length = bArr.length - i10;
        this.f30524h = length;
        long j10 = svVar.f33256g;
        if (j10 != -1) {
            this.f30524h = (int) Math.min(length, j10);
        }
        c(svVar);
        long j11 = svVar.f33256g;
        return j11 != -1 ? j11 : this.f30524h;
    }

    @Override // com.yandex.mobile.ads.impl.ov
    public final void close() {
        if (this.f30522f != null) {
            this.f30522f = null;
            e();
        }
        this.f30521e = null;
    }

    @Override // com.yandex.mobile.ads.impl.ov
    public final Uri getUri() {
        sv svVar = this.f30521e;
        if (svVar != null) {
            return svVar.f33250a;
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.lv
    public final int read(byte[] bArr, int i, int i10) {
        if (i10 == 0) {
            return 0;
        }
        int i11 = this.f30524h;
        if (i11 == 0) {
            return -1;
        }
        int iMin = Math.min(i10, i11);
        byte[] bArr2 = this.f30522f;
        int i12 = s82.f32899a;
        System.arraycopy(bArr2, this.f30523g, bArr, i, iMin);
        this.f30523g += iMin;
        this.f30524h -= iMin;
        c(iMin);
        return iMin;
    }
}
