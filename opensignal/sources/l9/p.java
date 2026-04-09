package l9;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class p extends b0 {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f15043a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f15044b;

    public p(byte[] bArr, byte[] bArr2) {
        this.f15043a = bArr;
        this.f15044b = bArr2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b0) {
            b0 b0Var = (b0) obj;
            boolean z10 = b0Var instanceof p;
            p pVar = (p) b0Var;
            if (Arrays.equals(this.f15043a, z10 ? pVar.f15043a : pVar.f15043a)) {
                p pVar2 = (p) b0Var;
                if (Arrays.equals(this.f15044b, z10 ? pVar2.f15044b : pVar2.f15044b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Arrays.hashCode(this.f15043a) ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f15044b);
    }

    public final String toString() {
        return "ExperimentIds{clearBlob=" + Arrays.toString(this.f15043a) + ", encryptedBlob=" + Arrays.toString(this.f15044b) + "}";
    }
}
