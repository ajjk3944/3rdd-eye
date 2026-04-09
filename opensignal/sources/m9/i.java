package m9;

import android.util.Base64;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f16360a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f16361b;

    /* renamed from: c, reason: collision with root package name */
    public final j9.d f16362c;

    public i(String str, byte[] bArr, j9.d dVar) {
        this.f16360a = str;
        this.f16361b = bArr;
        this.f16362c = dVar;
    }

    public static io.sentry.k a() {
        io.sentry.k kVar = new io.sentry.k(12);
        j9.d dVar = j9.d.DEFAULT;
        if (dVar == null) {
            throw new NullPointerException("Null priority");
        }
        kVar.f12399r = dVar;
        return kVar;
    }

    public final i b(j9.d dVar) {
        io.sentry.k kVarA = a();
        kVarA.m0(this.f16360a);
        if (dVar == null) {
            throw new NullPointerException("Null priority");
        }
        kVarA.f12399r = dVar;
        kVarA.f12398g = this.f16361b;
        return kVarA.n();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (this.f16360a.equals(iVar.f16360a) && Arrays.equals(this.f16361b, iVar.f16361b) && this.f16362c.equals(iVar.f16362c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f16360a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f16361b)) * 1000003) ^ this.f16362c.hashCode();
    }

    public final String toString() {
        byte[] bArr = this.f16361b;
        String strEncodeToString = bArr == null ? "" : Base64.encodeToString(bArr, 2);
        StringBuilder sb2 = new StringBuilder("TransportContext(");
        sb2.append(this.f16360a);
        sb2.append(", ");
        sb2.append(this.f16362c);
        sb2.append(", ");
        return w.g.j(sb2, strEncodeToString, ")");
    }
}
