package x3;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final u3.b f24946a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f24947b;

    public h(u3.b bVar, byte[] bArr) {
        if (bVar == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f24946a = bVar;
        this.f24947b = bArr;
    }

    public byte[] a() {
        return this.f24947b;
    }

    public u3.b b() {
        return this.f24946a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f24946a.equals(hVar.f24946a)) {
            return Arrays.equals(this.f24947b, hVar.f24947b);
        }
        return false;
    }

    public int hashCode() {
        return ((this.f24946a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f24947b);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.f24946a + ", bytes=[...]}";
    }
}
