package ea;

import android.util.Base64;
import java.util.Arrays;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f22494a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f22495b;

    /* renamed from: c, reason: collision with root package name */
    public final ba.c f22496c;

    public i(String str, byte[] bArr, ba.c cVar) {
        this.f22494a = str;
        this.f22495b = bArr;
        this.f22496c = cVar;
    }

    public static yb.e a() {
        yb.e eVar = new yb.e(13, false);
        eVar.f37511d = ba.c.f2090a;
        return eVar;
    }

    public final i b(ba.c cVar) {
        yb.e eVarA = a();
        eVarA.v(this.f22494a);
        if (cVar == null) {
            throw new NullPointerException("Null priority");
        }
        eVarA.f37511d = cVar;
        eVarA.f37510c = this.f22495b;
        return eVarA.i();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (this.f22494a.equals(iVar.f22494a) && Arrays.equals(this.f22495b, iVar.f22495b) && this.f22496c.equals(iVar.f22496c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f22494a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f22495b)) * 1000003) ^ this.f22496c.hashCode();
    }

    public final String toString() {
        byte[] bArr = this.f22495b;
        String strEncodeToString = bArr == null ? "" : Base64.encodeToString(bArr, 2);
        StringBuilder sb2 = new StringBuilder("TransportContext(");
        sb2.append(this.f22494a);
        sb2.append(", ");
        sb2.append(this.f22496c);
        sb2.append(", ");
        return d.h.w(sb2, strEncodeToString, ")");
    }
}
