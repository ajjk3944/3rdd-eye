package x3;

import java.util.Arrays;

/* compiled from: AutoValue_ExperimentIds.java */
/* loaded from: classes.dex */
public final class p extends z {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f47729a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f47730b;

    public p(byte[] bArr, byte[] bArr2) {
        this.f47729a = bArr;
        this.f47730b = bArr2;
    }

    @Override // x3.z
    public final byte[] a() {
        return this.f47729a;
    }

    @Override // x3.z
    public final byte[] b() {
        return this.f47730b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        boolean z10 = zVar instanceof p;
        if (Arrays.equals(this.f47729a, z10 ? ((p) zVar).f47729a : zVar.a())) {
            return Arrays.equals(this.f47730b, z10 ? ((p) zVar).f47730b : zVar.b());
        }
        return false;
    }

    public final int hashCode() {
        return ((Arrays.hashCode(this.f47729a) ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f47730b);
    }

    public final String toString() {
        return "ExperimentIds{clearBlob=" + Arrays.toString(this.f47729a) + ", encryptedBlob=" + Arrays.toString(this.f47730b) + "}";
    }
}
