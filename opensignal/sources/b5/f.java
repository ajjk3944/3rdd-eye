package b5;

import android.net.Uri;
import android.util.Base64;
import androidx.media3.common.k0;
import java.net.URLDecoder;

/* loaded from: classes.dex */
public final class f extends c {
    public int B;
    public int D;

    /* renamed from: x, reason: collision with root package name */
    public k f2432x;

    /* renamed from: y, reason: collision with root package name */
    public byte[] f2433y;

    @Override // b5.h
    public final void close() {
        if (this.f2433y != null) {
            this.f2433y = null;
            e();
        }
        this.f2432x = null;
    }

    @Override // b5.h
    public final Uri o() {
        k kVar = this.f2432x;
        if (kVar != null) {
            return kVar.f2443a;
        }
        return null;
    }

    @Override // androidx.media3.common.l
    public final int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.D;
        if (i12 == 0) {
            return -1;
        }
        int iMin = Math.min(i11, i12);
        byte[] bArr2 = this.f2433y;
        int i13 = a5.d0.f105a;
        System.arraycopy(bArr2, this.B, bArr, i10, iMin);
        this.B += iMin;
        this.D -= iMin;
        a(iMin);
        return iMin;
    }

    @Override // b5.h
    public final long t(k kVar) throws i, k0 {
        f(kVar);
        this.f2432x = kVar;
        Uri uri = kVar.f2443a;
        long j = kVar.f2448f;
        String scheme = uri.getScheme();
        a5.a.d("Unsupported scheme: " + scheme, "data".equals(scheme));
        String schemeSpecificPart = uri.getSchemeSpecificPart();
        int i10 = a5.d0.f105a;
        String[] strArrSplit = schemeSpecificPart.split(",", -1);
        if (strArrSplit.length != 2) {
            throw new k0("Unexpected URI format: " + uri, null, true, 0);
        }
        String str = strArrSplit[1];
        if (strArrSplit[0].contains(";base64")) {
            try {
                this.f2433y = Base64.decode(str, 0);
            } catch (IllegalArgumentException e4) {
                throw new k0(c7.a.p("Error while parsing Base64 encoded string: ", str), e4, true, 0);
            }
        } else {
            this.f2433y = URLDecoder.decode(str, ne.g.f17522a.name()).getBytes(ne.g.f17524c);
        }
        long j7 = kVar.f2447e;
        byte[] bArr = this.f2433y;
        if (j7 > bArr.length) {
            this.f2433y = null;
            throw new i(2008);
        }
        int i11 = (int) j7;
        this.B = i11;
        int length = bArr.length - i11;
        this.D = length;
        if (j != -1) {
            this.D = (int) Math.min(length, j);
        }
        h(kVar);
        return j != -1 ? j : this.D;
    }
}
