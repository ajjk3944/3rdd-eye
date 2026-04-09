package b3;

import b3.q;
import java.util.Arrays;

/* renamed from: b3.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4067g extends q {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f32882a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f32883b;

    /* renamed from: b3.g$b */
    static final class b extends q.a {

        /* renamed from: a, reason: collision with root package name */
        private byte[] f32884a;

        /* renamed from: b, reason: collision with root package name */
        private byte[] f32885b;

        b() {
        }

        @Override // b3.q.a
        public q a() {
            return new C4067g(this.f32884a, this.f32885b);
        }

        @Override // b3.q.a
        public q.a b(byte[] bArr) {
            this.f32884a = bArr;
            return this;
        }

        @Override // b3.q.a
        public q.a c(byte[] bArr) {
            this.f32885b = bArr;
            return this;
        }
    }

    @Override // b3.q
    public byte[] b() {
        return this.f32882a;
    }

    @Override // b3.q
    public byte[] c() {
        return this.f32883b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        boolean z10 = qVar instanceof C4067g;
        if (Arrays.equals(this.f32882a, z10 ? ((C4067g) qVar).f32882a : qVar.b())) {
            if (Arrays.equals(this.f32883b, z10 ? ((C4067g) qVar).f32883b : qVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((Arrays.hashCode(this.f32882a) ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f32883b);
    }

    public String toString() {
        return "ExperimentIds{clearBlob=" + Arrays.toString(this.f32882a) + ", encryptedBlob=" + Arrays.toString(this.f32883b) + "}";
    }

    private C4067g(byte[] bArr, byte[] bArr2) {
        this.f32882a = bArr;
        this.f32883b = bArr2;
    }
}
