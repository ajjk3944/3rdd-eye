package ea;

import java.util.Arrays;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final ba.b f22503a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f22504b;

    public l(ba.b bVar, byte[] bArr) {
        if (bVar == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f22503a = bVar;
        this.f22504b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f22503a.equals(lVar.f22503a)) {
            return Arrays.equals(this.f22504b, lVar.f22504b);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f22503a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f22504b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f22503a + ", bytes=[...]}";
    }
}
