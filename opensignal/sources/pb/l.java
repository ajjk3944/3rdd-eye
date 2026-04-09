package pb;

import android.net.Uri;
import android.util.Base64;
import com.google.android.exoplayer2.y0;
import java.net.URLDecoder;

/* loaded from: classes.dex */
public final class l extends h {
    public int B;
    public int D;

    /* renamed from: x, reason: collision with root package name */
    public na.c f20386x;

    /* renamed from: y, reason: collision with root package name */
    public byte[] f20387y;

    @Override // pb.n
    public final void close() {
        if (this.f20387y != null) {
            this.f20387y = null;
            e();
        }
        this.f20386x = null;
    }

    @Override // pb.n
    public final Uri o() {
        na.c cVar = this.f20386x;
        if (cVar != null) {
            return (Uri) cVar.f17422f;
        }
        return null;
    }

    @Override // pb.n
    public final long q(na.c cVar) throws o, y0 {
        f(cVar);
        this.f20386x = cVar;
        Uri uri = (Uri) cVar.f17422f;
        long j = cVar.f17420d;
        String scheme = uri.getScheme();
        boolean zEquals = "data".equals(scheme);
        String strValueOf = String.valueOf(scheme);
        qb.b.f(strValueOf.length() != 0 ? "Unsupported scheme: ".concat(strValueOf) : new String("Unsupported scheme: "), zEquals);
        String schemeSpecificPart = uri.getSchemeSpecificPart();
        int i10 = qb.v.f20828a;
        String[] strArrSplit = schemeSpecificPart.split(",", -1);
        if (strArrSplit.length != 2) {
            String strValueOf2 = String.valueOf(uri);
            StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 23);
            sb2.append("Unexpected URI format: ");
            sb2.append(strValueOf2);
            throw new y0(sb2.toString(), null, true, 0);
        }
        String str = strArrSplit[1];
        if (strArrSplit[0].contains(";base64")) {
            try {
                this.f20387y = Base64.decode(str, 0);
            } catch (IllegalArgumentException e4) {
                String strValueOf3 = String.valueOf(str);
                throw new y0(strValueOf3.length() != 0 ? "Error while parsing Base64 encoded string: ".concat(strValueOf3) : new String("Error while parsing Base64 encoded string: "), e4, true, 0);
            }
        } else {
            this.f20387y = URLDecoder.decode(str, ne.g.f17522a.name()).getBytes(ne.g.f17524c);
        }
        long j7 = cVar.f17419c;
        byte[] bArr = this.f20387y;
        if (j7 > bArr.length) {
            this.f20387y = null;
            throw new o(2008);
        }
        int i11 = (int) j7;
        this.B = i11;
        int length = bArr.length - i11;
        this.D = length;
        if (j != -1) {
            this.D = (int) Math.min(length, j);
        }
        h(cVar);
        return j != -1 ? j : this.D;
    }

    @Override // pb.k
    public final int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.D;
        if (i12 == 0) {
            return -1;
        }
        int iMin = Math.min(i11, i12);
        byte[] bArr2 = this.f20387y;
        int i13 = qb.v.f20828a;
        System.arraycopy(bArr2, this.B, bArr, i10, iMin);
        this.B += iMin;
        this.D -= iMin;
        a(iMin);
        return iMin;
    }
}
