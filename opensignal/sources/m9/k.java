package m9;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final j9.c f16363a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f16364b;

    public k(j9.c cVar, byte[] bArr) {
        if (cVar == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f16363a = cVar;
        this.f16364b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f16363a.equals(kVar.f16363a)) {
            return Arrays.equals(this.f16364b, kVar.f16364b);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f16363a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f16364b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f16363a + ", bytes=[...]}";
    }
}
