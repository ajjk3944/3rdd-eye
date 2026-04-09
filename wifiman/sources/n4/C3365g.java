package N4;

import N4.F;
import java.util.Arrays;

/* renamed from: N4.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3365g extends F.d.b {

    /* renamed from: a, reason: collision with root package name */
    private final String f15126a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f15127b;

    /* renamed from: N4.g$b */
    static final class b extends F.d.b.a {

        /* renamed from: a, reason: collision with root package name */
        private String f15128a;

        /* renamed from: b, reason: collision with root package name */
        private byte[] f15129b;

        b() {
        }

        @Override // N4.F.d.b.a
        public F.d.b a() {
            byte[] bArr;
            String str = this.f15128a;
            if (str != null && (bArr = this.f15129b) != null) {
                return new C3365g(str, bArr);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f15128a == null) {
                sb2.append(" filename");
            }
            if (this.f15129b == null) {
                sb2.append(" contents");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // N4.F.d.b.a
        public F.d.b.a b(byte[] bArr) {
            if (bArr == null) {
                throw new NullPointerException("Null contents");
            }
            this.f15129b = bArr;
            return this;
        }

        @Override // N4.F.d.b.a
        public F.d.b.a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null filename");
            }
            this.f15128a = str;
            return this;
        }
    }

    @Override // N4.F.d.b
    public byte[] b() {
        return this.f15127b;
    }

    @Override // N4.F.d.b
    public String c() {
        return this.f15126a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.d.b)) {
            return false;
        }
        F.d.b bVar = (F.d.b) obj;
        if (this.f15126a.equals(bVar.c())) {
            if (Arrays.equals(this.f15127b, bVar instanceof C3365g ? ((C3365g) bVar).f15127b : bVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f15126a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f15127b);
    }

    public String toString() {
        return "File{filename=" + this.f15126a + ", contents=" + Arrays.toString(this.f15127b) + "}";
    }

    private C3365g(String str, byte[] bArr) {
        this.f15126a = str;
        this.f15127b = bArr;
    }
}
