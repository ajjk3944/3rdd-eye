package defpackage;

import android.net.Uri;
import android.util.Base64;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ig3 extends zd3 {
    public ij3 j;
    public byte[] k;
    public int l;
    public int m;

    @Override // defpackage.th3
    public final long a(ij3 ij3Var) throws lq1, di3 {
        c(ij3Var);
        this.j = ij3Var;
        Uri uriNormalizeScheme = ij3Var.a.normalizeScheme();
        String scheme = uriNormalizeScheme.getScheme();
        zt0.X("data".equals(scheme), "Unsupported scheme: %s", scheme);
        String schemeSpecificPart = uriNormalizeScheme.getSchemeSpecificPart();
        String str = v23.a;
        String[] strArrSplit = schemeSpecificPart.split(",", -1);
        if (strArrSplit.length != 2) {
            throw new lq1("Unexpected URI format: ".concat(String.valueOf(uriNormalizeScheme)), null, true, 0);
        }
        String str2 = strArrSplit[1];
        if (strArrSplit[0].contains(";base64")) {
            try {
                this.k = Base64.decode(str2, 0);
            } catch (IllegalArgumentException e) {
                throw new lq1("Error while parsing Base64 encoded string: ".concat(String.valueOf(str2)), e, true, 0);
            }
        } else {
            this.k = URLDecoder.decode(str2, StandardCharsets.US_ASCII.name()).getBytes(StandardCharsets.UTF_8);
        }
        long j = ij3Var.c;
        int length = this.k.length;
        if (j > length) {
            this.k = null;
            throw new di3();
        }
        int i = (int) j;
        this.l = i;
        int i2 = length - i;
        this.m = i2;
        long j2 = ij3Var.d;
        if (j2 != -1) {
            this.m = (int) Math.min(i2, j2);
        }
        e(ij3Var);
        return j2 != -1 ? j2 : this.m;
    }

    @Override // defpackage.ua4
    public final int d(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.m;
        if (i3 == 0) {
            return -1;
        }
        int iMin = Math.min(i2, i3);
        byte[] bArr2 = this.k;
        String str = v23.a;
        System.arraycopy(bArr2, this.l, bArr, i, iMin);
        this.l += iMin;
        this.m -= iMin;
        f(iMin);
        return iMin;
    }

    @Override // defpackage.th3
    public final Uri h() {
        ij3 ij3Var = this.j;
        if (ij3Var != null) {
            return ij3Var.a;
        }
        return null;
    }

    @Override // defpackage.th3
    public final void l() {
        if (this.k != null) {
            this.k = null;
            j();
        }
        this.j = null;
    }
}
