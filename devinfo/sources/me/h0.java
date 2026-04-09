package me;

import java.util.Arrays;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class h0 extends r1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f29142a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f29143b;

    public h0(String str, byte[] bArr) {
        this.f29142a = str;
        this.f29143b = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r1) {
            r1 r1Var = (r1) obj;
            h0 h0Var = (h0) r1Var;
            if (this.f29142a.equals(h0Var.f29142a)) {
                if (Arrays.equals(this.f29143b, r1Var instanceof h0 ? ((h0) r1Var).f29143b : h0Var.f29143b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f29142a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f29143b);
    }

    public final String toString() {
        return "File{filename=" + this.f29142a + ", contents=" + Arrays.toString(this.f29143b) + "}";
    }
}
