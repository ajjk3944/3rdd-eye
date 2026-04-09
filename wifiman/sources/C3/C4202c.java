package c3;

import a3.AbstractC3755c;
import a3.C3754b;
import a3.InterfaceC3759g;
import c3.AbstractC4214o;

/* renamed from: c3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4202c extends AbstractC4214o {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC4215p f33779a;

    /* renamed from: b, reason: collision with root package name */
    private final String f33780b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC3755c f33781c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3759g f33782d;

    /* renamed from: e, reason: collision with root package name */
    private final C3754b f33783e;

    /* renamed from: c3.c$b */
    static final class b extends AbstractC4214o.a {

        /* renamed from: a, reason: collision with root package name */
        private AbstractC4215p f33784a;

        /* renamed from: b, reason: collision with root package name */
        private String f33785b;

        /* renamed from: c, reason: collision with root package name */
        private AbstractC3755c f33786c;

        /* renamed from: d, reason: collision with root package name */
        private InterfaceC3759g f33787d;

        /* renamed from: e, reason: collision with root package name */
        private C3754b f33788e;

        b() {
        }

        @Override // c3.AbstractC4214o.a
        public AbstractC4214o a() {
            String str = "";
            if (this.f33784a == null) {
                str = " transportContext";
            }
            if (this.f33785b == null) {
                str = str + " transportName";
            }
            if (this.f33786c == null) {
                str = str + " event";
            }
            if (this.f33787d == null) {
                str = str + " transformer";
            }
            if (this.f33788e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new C4202c(this.f33784a, this.f33785b, this.f33786c, this.f33787d, this.f33788e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // c3.AbstractC4214o.a
        AbstractC4214o.a b(C3754b c3754b) {
            if (c3754b == null) {
                throw new NullPointerException("Null encoding");
            }
            this.f33788e = c3754b;
            return this;
        }

        @Override // c3.AbstractC4214o.a
        AbstractC4214o.a c(AbstractC3755c abstractC3755c) {
            if (abstractC3755c == null) {
                throw new NullPointerException("Null event");
            }
            this.f33786c = abstractC3755c;
            return this;
        }

        @Override // c3.AbstractC4214o.a
        AbstractC4214o.a d(InterfaceC3759g interfaceC3759g) {
            if (interfaceC3759g == null) {
                throw new NullPointerException("Null transformer");
            }
            this.f33787d = interfaceC3759g;
            return this;
        }

        @Override // c3.AbstractC4214o.a
        public AbstractC4214o.a e(AbstractC4215p abstractC4215p) {
            if (abstractC4215p == null) {
                throw new NullPointerException("Null transportContext");
            }
            this.f33784a = abstractC4215p;
            return this;
        }

        @Override // c3.AbstractC4214o.a
        public AbstractC4214o.a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.f33785b = str;
            return this;
        }
    }

    @Override // c3.AbstractC4214o
    public C3754b b() {
        return this.f33783e;
    }

    @Override // c3.AbstractC4214o
    AbstractC3755c c() {
        return this.f33781c;
    }

    @Override // c3.AbstractC4214o
    InterfaceC3759g e() {
        return this.f33782d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC4214o)) {
            return false;
        }
        AbstractC4214o abstractC4214o = (AbstractC4214o) obj;
        return this.f33779a.equals(abstractC4214o.f()) && this.f33780b.equals(abstractC4214o.g()) && this.f33781c.equals(abstractC4214o.c()) && this.f33782d.equals(abstractC4214o.e()) && this.f33783e.equals(abstractC4214o.b());
    }

    @Override // c3.AbstractC4214o
    public AbstractC4215p f() {
        return this.f33779a;
    }

    @Override // c3.AbstractC4214o
    public String g() {
        return this.f33780b;
    }

    public int hashCode() {
        return ((((((((this.f33779a.hashCode() ^ 1000003) * 1000003) ^ this.f33780b.hashCode()) * 1000003) ^ this.f33781c.hashCode()) * 1000003) ^ this.f33782d.hashCode()) * 1000003) ^ this.f33783e.hashCode();
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.f33779a + ", transportName=" + this.f33780b + ", event=" + this.f33781c + ", transformer=" + this.f33782d + ", encoding=" + this.f33783e + "}";
    }

    private C4202c(AbstractC4215p abstractC4215p, String str, AbstractC3755c abstractC3755c, InterfaceC3759g interfaceC3759g, C3754b c3754b) {
        this.f33779a = abstractC4215p;
        this.f33780b = str;
        this.f33781c = abstractC3755c;
        this.f33782d = interfaceC3759g;
        this.f33783e = c3754b;
    }
}
