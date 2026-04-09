package y3;

import java.util.Arrays;
import y3.e;

/* loaded from: classes2.dex */
public final class a extends e {

    /* renamed from: a, reason: collision with root package name */
    public final Iterable f25104a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f25105b;

    public static final class b extends e.a {

        /* renamed from: a, reason: collision with root package name */
        public Iterable f25106a;

        /* renamed from: b, reason: collision with root package name */
        public byte[] f25107b;

        @Override // y3.e.a
        public e a() {
            String str = "";
            if (this.f25106a == null) {
                str = " events";
            }
            if (str.isEmpty()) {
                return new a(this.f25106a, this.f25107b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // y3.e.a
        public e.a b(Iterable iterable) {
            if (iterable == null) {
                throw new NullPointerException("Null events");
            }
            this.f25106a = iterable;
            return this;
        }

        @Override // y3.e.a
        public e.a c(byte[] bArr) {
            this.f25107b = bArr;
            return this;
        }
    }

    @Override // y3.e
    public Iterable b() {
        return this.f25104a;
    }

    @Override // y3.e
    public byte[] c() {
        return this.f25105b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.f25104a.equals(eVar.b())) {
                if (Arrays.equals(this.f25105b, eVar instanceof a ? ((a) eVar).f25105b : eVar.c())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f25104a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f25105b);
    }

    public String toString() {
        return "BackendRequest{events=" + this.f25104a + ", extras=" + Arrays.toString(this.f25105b) + "}";
    }

    public a(Iterable iterable, byte[] bArr) {
        this.f25104a = iterable;
        this.f25105b = bArr;
    }
}
