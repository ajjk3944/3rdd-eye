package lf;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class h0 extends r1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f15255a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f15256b;

    public h0(String str, byte[] bArr) {
        this.f15255a = str;
        this.f15256b = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r1) {
            r1 r1Var = (r1) obj;
            h0 h0Var = (h0) r1Var;
            if (this.f15255a.equals(h0Var.f15255a)) {
                if (Arrays.equals(this.f15256b, r1Var instanceof h0 ? ((h0) r1Var).f15256b : h0Var.f15256b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f15255a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f15256b);
    }

    public final String toString() {
        return "File{filename=" + this.f15255a + ", contents=" + Arrays.toString(this.f15256b) + "}";
    }
}
