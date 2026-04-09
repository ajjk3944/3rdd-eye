package c3;

import a3.EnumC3757e;
import c3.AbstractC4215p;
import java.util.Arrays;

/* renamed from: c3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4203d extends AbstractC4215p {

    /* renamed from: a, reason: collision with root package name */
    private final String f33789a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f33790b;

    /* renamed from: c, reason: collision with root package name */
    private final EnumC3757e f33791c;

    /* renamed from: c3.d$b */
    static final class b extends AbstractC4215p.a {

        /* renamed from: a, reason: collision with root package name */
        private String f33792a;

        /* renamed from: b, reason: collision with root package name */
        private byte[] f33793b;

        /* renamed from: c, reason: collision with root package name */
        private EnumC3757e f33794c;

        b() {
        }

        @Override // c3.AbstractC4215p.a
        public AbstractC4215p a() {
            String str = "";
            if (this.f33792a == null) {
                str = " backendName";
            }
            if (this.f33794c == null) {
                str = str + " priority";
            }
            if (str.isEmpty()) {
                return new C4203d(this.f33792a, this.f33793b, this.f33794c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // c3.AbstractC4215p.a
        public AbstractC4215p.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null backendName");
            }
            this.f33792a = str;
            return this;
        }

        @Override // c3.AbstractC4215p.a
        public AbstractC4215p.a c(byte[] bArr) {
            this.f33793b = bArr;
            return this;
        }

        @Override // c3.AbstractC4215p.a
        public AbstractC4215p.a d(EnumC3757e enumC3757e) {
            if (enumC3757e == null) {
                throw new NullPointerException("Null priority");
            }
            this.f33794c = enumC3757e;
            return this;
        }
    }

    @Override // c3.AbstractC4215p
    public String b() {
        return this.f33789a;
    }

    @Override // c3.AbstractC4215p
    public byte[] c() {
        return this.f33790b;
    }

    @Override // c3.AbstractC4215p
    public EnumC3757e d() {
        return this.f33791c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC4215p)) {
            return false;
        }
        AbstractC4215p abstractC4215p = (AbstractC4215p) obj;
        if (this.f33789a.equals(abstractC4215p.b())) {
            if (Arrays.equals(this.f33790b, abstractC4215p instanceof C4203d ? ((C4203d) abstractC4215p).f33790b : abstractC4215p.c()) && this.f33791c.equals(abstractC4215p.d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f33789a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f33790b)) * 1000003) ^ this.f33791c.hashCode();
    }

    private C4203d(String str, byte[] bArr, EnumC3757e enumC3757e) {
        this.f33789a = str;
        this.f33790b = bArr;
        this.f33791c = enumC3757e;
    }
}
