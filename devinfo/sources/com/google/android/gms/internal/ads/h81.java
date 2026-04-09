package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Base64;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class h81 extends h41 {

    /* renamed from: e, reason: collision with root package name */
    public gb1 f11770e;

    /* renamed from: f, reason: collision with root package name */
    public byte[] f11771f;
    public int g;

    /* renamed from: h, reason: collision with root package name */
    public int f11772h;

    @Override // com.google.android.gms.internal.ads.l91
    public final long a(gb1 gb1Var) throws x91, ua {
        c(gb1Var);
        this.f11770e = gb1Var;
        Uri uriNormalizeScheme = gb1Var.f11479a.normalizeScheme();
        String scheme = uriNormalizeScheme.getScheme();
        mq0.Z("data".equals(scheme), "Unsupported scheme: %s", scheme);
        String schemeSpecificPart = uriNormalizeScheme.getSchemeSpecificPart();
        String str = bq0.f9768a;
        String[] strArrSplit = schemeSpecificPart.split(",", -1);
        if (strArrSplit.length != 2) {
            throw new ua(true, 0, "Unexpected URI format: ".concat(String.valueOf(uriNormalizeScheme)), null);
        }
        String str2 = strArrSplit[1];
        if (strArrSplit[0].contains(";base64")) {
            try {
                this.f11771f = Base64.decode(str2, 0);
            } catch (IllegalArgumentException e2) {
                throw new ua(true, 0, "Error while parsing Base64 encoded string: ".concat(String.valueOf(str2)), e2);
            }
        } else {
            this.f11771f = URLDecoder.decode(str2, StandardCharsets.US_ASCII.name()).getBytes(StandardCharsets.UTF_8);
        }
        long j = gb1Var.f11481c;
        int length = this.f11771f.length;
        if (j > length) {
            this.f11771f = null;
            throw new x91();
        }
        int i4 = (int) j;
        this.g = i4;
        int i10 = length - i4;
        this.f11772h = i10;
        long j8 = gb1Var.f11482d;
        if (j8 != -1) {
            this.f11772h = (int) Math.min(i10, j8);
        }
        e(gb1Var);
        return j8 != -1 ? j8 : this.f11772h;
    }

    @Override // com.google.android.gms.internal.ads.vs1
    public final int d(int i4, int i10, byte[] bArr) {
        if (i10 == 0) {
            return 0;
        }
        int i11 = this.f11772h;
        if (i11 == 0) {
            return -1;
        }
        int iMin = Math.min(i10, i11);
        byte[] bArr2 = this.f11771f;
        String str = bq0.f9768a;
        System.arraycopy(bArr2, this.g, bArr, i4, iMin);
        this.g += iMin;
        this.f11772h -= iMin;
        g(iMin);
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.l91
    public final void f() {
        if (this.f11771f != null) {
            this.f11771f = null;
            h();
        }
        this.f11770e = null;
    }

    @Override // com.google.android.gms.internal.ads.l91
    public final Uri zzc() {
        gb1 gb1Var = this.f11770e;
        if (gb1Var != null) {
            return gb1Var.f11479a;
        }
        return null;
    }
}
