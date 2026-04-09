package y3;

import java.util.Arrays;
import v3.C5677c;

/* compiled from: EncodedPayload.java */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final C5677c f48087a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f48088b;

    public l(C5677c c5677c, byte[] bArr) {
        if (c5677c == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f48087a = c5677c;
        this.f48088b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f48087a.equals(lVar.f48087a)) {
            return Arrays.equals(this.f48088b, lVar.f48088b);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f48087a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f48088b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f48087a + ", bytes=[...]}";
    }
}
