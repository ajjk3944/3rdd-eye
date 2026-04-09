package da;

import java.util.Arrays;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class p extends b0 {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f22151a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f22152b;

    public p(byte[] bArr, byte[] bArr2) {
        this.f22151a = bArr;
        this.f22152b = bArr2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b0) {
            b0 b0Var = (b0) obj;
            boolean z3 = b0Var instanceof p;
            p pVar = (p) b0Var;
            if (Arrays.equals(this.f22151a, z3 ? pVar.f22151a : pVar.f22151a)) {
                p pVar2 = (p) b0Var;
                if (Arrays.equals(this.f22152b, z3 ? pVar2.f22152b : pVar2.f22152b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Arrays.hashCode(this.f22151a) ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f22152b);
    }

    public final String toString() {
        return "ExperimentIds{clearBlob=" + Arrays.toString(this.f22151a) + ", encryptedBlob=" + Arrays.toString(this.f22152b) + "}";
    }
}
