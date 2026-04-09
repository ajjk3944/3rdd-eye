package f3;

/* renamed from: f3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5516b {

    /* renamed from: b, reason: collision with root package name */
    private static final C5516b f46966b = new a().a();

    /* renamed from: a, reason: collision with root package name */
    private final C5519e f46967a;

    /* renamed from: f3.b$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private C5519e f46968a = null;

        a() {
        }

        public C5516b a() {
            return new C5516b(this.f46968a);
        }

        public a b(C5519e c5519e) {
            this.f46968a = c5519e;
            return this;
        }
    }

    C5516b(C5519e c5519e) {
        this.f46967a = c5519e;
    }

    public static a b() {
        return new a();
    }

    public C5519e a() {
        return this.f46967a;
    }
}
