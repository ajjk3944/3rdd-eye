package G6;

/* loaded from: classes3.dex */
public class B {

    /* renamed from: a, reason: collision with root package name */
    private final Integer f6974a;

    /* renamed from: b, reason: collision with root package name */
    private final Integer f6975b;

    /* renamed from: c, reason: collision with root package name */
    private final Integer f6976c;

    /* renamed from: d, reason: collision with root package name */
    private final Boolean f6977d;

    /* renamed from: e, reason: collision with root package name */
    private final Boolean f6978e;

    /* renamed from: f, reason: collision with root package name */
    private final b f6979f;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private Integer f6980a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f6981b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f6982c;

        /* renamed from: d, reason: collision with root package name */
        private Boolean f6983d;

        /* renamed from: e, reason: collision with root package name */
        private Boolean f6984e;

        /* renamed from: f, reason: collision with root package name */
        private b f6985f;

        public B a() {
            return new B(this.f6980a, this.f6981b, this.f6982c, this.f6983d, this.f6984e, this.f6985f);
        }

        public a b(Integer num) {
            this.f6980a = num;
            return this;
        }

        public a c(b bVar) {
            this.f6985f = bVar;
            return this;
        }
    }

    public interface b {
        void a(int i10, String str, String str2);
    }

    B(Integer num, Integer num2, Integer num3, Boolean bool, Boolean bool2, b bVar) {
        this.f6974a = num;
        this.f6975b = num2;
        this.f6976c = num3;
        this.f6977d = bool;
        this.f6978e = bool2;
        this.f6979f = bVar;
    }

    public Integer a() {
        return this.f6974a;
    }

    public b b() {
        return this.f6979f;
    }

    public Integer c() {
        return this.f6975b;
    }

    public Boolean d() {
        return this.f6977d;
    }

    public Boolean e() {
        return this.f6978e;
    }

    public Integer f() {
        return this.f6976c;
    }

    public String toString() {
        return "LogOptions{logLevel=" + this.f6974a + ", macAddressLogSetting=" + this.f6975b + ", uuidLogSetting=" + this.f6976c + ", shouldLogAttributeValues=" + this.f6977d + ", shouldLogScannedPeripherals=" + this.f6978e + ", logger=" + this.f6979f + '}';
    }
}
