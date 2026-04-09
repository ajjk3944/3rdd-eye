package c3;

import a3.C3754b;
import java.util.Arrays;

/* renamed from: c3.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4207h {

    /* renamed from: a, reason: collision with root package name */
    private final C3754b f33810a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f33811b;

    public C4207h(C3754b c3754b, byte[] bArr) {
        if (c3754b == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f33810a = c3754b;
        this.f33811b = bArr;
    }

    public byte[] a() {
        return this.f33811b;
    }

    public C3754b b() {
        return this.f33810a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4207h)) {
            return false;
        }
        C4207h c4207h = (C4207h) obj;
        if (this.f33810a.equals(c4207h.f33810a)) {
            return Arrays.equals(this.f33811b, c4207h.f33811b);
        }
        return false;
    }

    public int hashCode() {
        return ((this.f33810a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f33811b);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.f33810a + ", bytes=[...]}";
    }
}
