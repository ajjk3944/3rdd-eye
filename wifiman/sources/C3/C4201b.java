package c3;

import c3.AbstractC4208i;
import java.util.Arrays;
import java.util.Map;

/* renamed from: c3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4201b extends AbstractC4208i {

    /* renamed from: a, reason: collision with root package name */
    private final String f33759a;

    /* renamed from: b, reason: collision with root package name */
    private final Integer f33760b;

    /* renamed from: c, reason: collision with root package name */
    private final C4207h f33761c;

    /* renamed from: d, reason: collision with root package name */
    private final long f33762d;

    /* renamed from: e, reason: collision with root package name */
    private final long f33763e;

    /* renamed from: f, reason: collision with root package name */
    private final Map f33764f;

    /* renamed from: g, reason: collision with root package name */
    private final Integer f33765g;

    /* renamed from: h, reason: collision with root package name */
    private final String f33766h;

    /* renamed from: i, reason: collision with root package name */
    private final byte[] f33767i;

    /* renamed from: j, reason: collision with root package name */
    private final byte[] f33768j;

    /* renamed from: c3.b$b, reason: collision with other inner class name */
    static final class C1175b extends AbstractC4208i.a {

        /* renamed from: a, reason: collision with root package name */
        private String f33769a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f33770b;

        /* renamed from: c, reason: collision with root package name */
        private C4207h f33771c;

        /* renamed from: d, reason: collision with root package name */
        private Long f33772d;

        /* renamed from: e, reason: collision with root package name */
        private Long f33773e;

        /* renamed from: f, reason: collision with root package name */
        private Map f33774f;

        /* renamed from: g, reason: collision with root package name */
        private Integer f33775g;

        /* renamed from: h, reason: collision with root package name */
        private String f33776h;

        /* renamed from: i, reason: collision with root package name */
        private byte[] f33777i;

        /* renamed from: j, reason: collision with root package name */
        private byte[] f33778j;

        C1175b() {
        }

        @Override // c3.AbstractC4208i.a
        public AbstractC4208i d() {
            String str = "";
            if (this.f33769a == null) {
                str = " transportName";
            }
            if (this.f33771c == null) {
                str = str + " encodedPayload";
            }
            if (this.f33772d == null) {
                str = str + " eventMillis";
            }
            if (this.f33773e == null) {
                str = str + " uptimeMillis";
            }
            if (this.f33774f == null) {
                str = str + " autoMetadata";
            }
            if (str.isEmpty()) {
                return new C4201b(this.f33769a, this.f33770b, this.f33771c, this.f33772d.longValue(), this.f33773e.longValue(), this.f33774f, this.f33775g, this.f33776h, this.f33777i, this.f33778j);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // c3.AbstractC4208i.a
        protected Map e() {
            Map map = this.f33774f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        @Override // c3.AbstractC4208i.a
        protected AbstractC4208i.a f(Map map) {
            if (map == null) {
                throw new NullPointerException("Null autoMetadata");
            }
            this.f33774f = map;
            return this;
        }

        @Override // c3.AbstractC4208i.a
        public AbstractC4208i.a g(Integer num) {
            this.f33770b = num;
            return this;
        }

        @Override // c3.AbstractC4208i.a
        public AbstractC4208i.a h(C4207h c4207h) {
            if (c4207h == null) {
                throw new NullPointerException("Null encodedPayload");
            }
            this.f33771c = c4207h;
            return this;
        }

        @Override // c3.AbstractC4208i.a
        public AbstractC4208i.a i(long j10) {
            this.f33772d = Long.valueOf(j10);
            return this;
        }

        @Override // c3.AbstractC4208i.a
        public AbstractC4208i.a j(byte[] bArr) {
            this.f33777i = bArr;
            return this;
        }

        @Override // c3.AbstractC4208i.a
        public AbstractC4208i.a k(byte[] bArr) {
            this.f33778j = bArr;
            return this;
        }

        @Override // c3.AbstractC4208i.a
        public AbstractC4208i.a l(Integer num) {
            this.f33775g = num;
            return this;
        }

        @Override // c3.AbstractC4208i.a
        public AbstractC4208i.a m(String str) {
            this.f33776h = str;
            return this;
        }

        @Override // c3.AbstractC4208i.a
        public AbstractC4208i.a n(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.f33769a = str;
            return this;
        }

        @Override // c3.AbstractC4208i.a
        public AbstractC4208i.a o(long j10) {
            this.f33773e = Long.valueOf(j10);
            return this;
        }
    }

    @Override // c3.AbstractC4208i
    protected Map c() {
        return this.f33764f;
    }

    @Override // c3.AbstractC4208i
    public Integer d() {
        return this.f33760b;
    }

    @Override // c3.AbstractC4208i
    public C4207h e() {
        return this.f33761c;
    }

    public boolean equals(Object obj) {
        Integer num;
        Integer num2;
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC4208i)) {
            return false;
        }
        AbstractC4208i abstractC4208i = (AbstractC4208i) obj;
        if (this.f33759a.equals(abstractC4208i.n()) && ((num = this.f33760b) != null ? num.equals(abstractC4208i.d()) : abstractC4208i.d() == null) && this.f33761c.equals(abstractC4208i.e()) && this.f33762d == abstractC4208i.f() && this.f33763e == abstractC4208i.o() && this.f33764f.equals(abstractC4208i.c()) && ((num2 = this.f33765g) != null ? num2.equals(abstractC4208i.l()) : abstractC4208i.l() == null) && ((str = this.f33766h) != null ? str.equals(abstractC4208i.m()) : abstractC4208i.m() == null)) {
            boolean z10 = abstractC4208i instanceof C4201b;
            if (Arrays.equals(this.f33767i, z10 ? ((C4201b) abstractC4208i).f33767i : abstractC4208i.g())) {
                if (Arrays.equals(this.f33768j, z10 ? ((C4201b) abstractC4208i).f33768j : abstractC4208i.h())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // c3.AbstractC4208i
    public long f() {
        return this.f33762d;
    }

    @Override // c3.AbstractC4208i
    public byte[] g() {
        return this.f33767i;
    }

    @Override // c3.AbstractC4208i
    public byte[] h() {
        return this.f33768j;
    }

    public int hashCode() {
        int iHashCode = (this.f33759a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f33760b;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f33761c.hashCode()) * 1000003;
        long j10 = this.f33762d;
        int i10 = (iHashCode2 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f33763e;
        int iHashCode3 = (((i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f33764f.hashCode()) * 1000003;
        Integer num2 = this.f33765g;
        int iHashCode4 = (iHashCode3 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        String str = this.f33766h;
        return ((((iHashCode4 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ Arrays.hashCode(this.f33767i)) * 1000003) ^ Arrays.hashCode(this.f33768j);
    }

    @Override // c3.AbstractC4208i
    public Integer l() {
        return this.f33765g;
    }

    @Override // c3.AbstractC4208i
    public String m() {
        return this.f33766h;
    }

    @Override // c3.AbstractC4208i
    public String n() {
        return this.f33759a;
    }

    @Override // c3.AbstractC4208i
    public long o() {
        return this.f33763e;
    }

    public String toString() {
        return "EventInternal{transportName=" + this.f33759a + ", code=" + this.f33760b + ", encodedPayload=" + this.f33761c + ", eventMillis=" + this.f33762d + ", uptimeMillis=" + this.f33763e + ", autoMetadata=" + this.f33764f + ", productId=" + this.f33765g + ", pseudonymousId=" + this.f33766h + ", experimentIdsClear=" + Arrays.toString(this.f33767i) + ", experimentIdsEncrypted=" + Arrays.toString(this.f33768j) + "}";
    }

    private C4201b(String str, Integer num, C4207h c4207h, long j10, long j11, Map map, Integer num2, String str2, byte[] bArr, byte[] bArr2) {
        this.f33759a = str;
        this.f33760b = num;
        this.f33761c = c4207h;
        this.f33762d = j10;
        this.f33763e = j11;
        this.f33764f = map;
        this.f33765g = num2;
        this.f33766h = str2;
        this.f33767i = bArr;
        this.f33768j = bArr2;
    }
}
