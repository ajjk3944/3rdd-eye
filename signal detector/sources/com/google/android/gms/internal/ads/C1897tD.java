package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Base64;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

/* renamed from: com.google.android.gms.internal.ads.tD, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1897tD extends AbstractC2003vB {

    /* renamed from: e, reason: collision with root package name */
    public TE f16877e;

    /* renamed from: f, reason: collision with root package name */
    public byte[] f16878f;

    /* renamed from: g, reason: collision with root package name */
    public int f16879g;

    /* renamed from: h, reason: collision with root package name */
    public int f16880h;

    @Override // com.google.android.gms.internal.ads.XD
    public final long a(TE te) throws P4, C1359jE {
        b(te);
        this.f16877e = te;
        Uri uriNormalizeScheme = te.f11361a.normalizeScheme();
        String scheme = uriNormalizeScheme.getScheme();
        AbstractC0582Jp.b0("data".equals(scheme), "Unsupported scheme: %s", scheme);
        String schemeSpecificPart = uriNormalizeScheme.getSchemeSpecificPart();
        String str = Vt.f12096a;
        String[] strArrSplit = schemeSpecificPart.split(",", -1);
        if (strArrSplit.length != 2) {
            throw new P4("Unexpected URI format: ".concat(String.valueOf(uriNormalizeScheme)), null, true, 0);
        }
        String str2 = strArrSplit[1];
        if (strArrSplit[0].contains(";base64")) {
            try {
                this.f16878f = Base64.decode(str2, 0);
            } catch (IllegalArgumentException e6) {
                throw new P4("Error while parsing Base64 encoded string: ".concat(String.valueOf(str2)), e6, true, 0);
            }
        } else {
            this.f16878f = URLDecoder.decode(str2, StandardCharsets.US_ASCII.name()).getBytes(StandardCharsets.UTF_8);
        }
        long j6 = te.f11363c;
        int length = this.f16878f.length;
        if (j6 > length) {
            this.f16878f = null;
            throw new C1359jE();
        }
        int i = (int) j6;
        this.f16879g = i;
        int i3 = length - i;
        this.f16880h = i3;
        long j7 = te.f11364d;
        if (j7 != -1) {
            this.f16880h = (int) Math.min(i3, j7);
        }
        e(te);
        return j7 != -1 ? j7 : this.f16880h;
    }

    @Override // com.google.android.gms.internal.ads.IN
    public final int d(int i, int i3, byte[] bArr) {
        if (i3 == 0) {
            return 0;
        }
        int i6 = this.f16880h;
        if (i6 == 0) {
            return -1;
        }
        int iMin = Math.min(i3, i6);
        byte[] bArr2 = this.f16878f;
        String str = Vt.f12096a;
        System.arraycopy(bArr2, this.f16879g, bArr, i, iMin);
        this.f16879g += iMin;
        this.f16880h -= iMin;
        g(iMin);
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.XD
    public final Uri f() {
        TE te = this.f16877e;
        if (te != null) {
            return te.f11361a;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.XD
    public final void m() {
        if (this.f16878f != null) {
            this.f16878f = null;
            j();
        }
        this.f16877e = null;
    }
}
