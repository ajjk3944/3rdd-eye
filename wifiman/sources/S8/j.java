package S8;

import Yg.m;
import Yg.n;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6824a;

/* loaded from: classes3.dex */
public final class j {

    /* renamed from: c, reason: collision with root package name */
    public static final a f20385c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final Set f20386a;

    /* renamed from: b, reason: collision with root package name */
    private final m f20387b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final j a(Set encryption) {
            AbstractC6492s.i(encryption, "encryption");
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (encryption.isEmpty()) {
                return null;
            }
            return new j(encryption, defaultConstructorMarker);
        }

        private a() {
        }
    }

    public static abstract class b {

        public static final class a extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final a f20388a = new a();

            private a() {
                super(null);
            }
        }

        /* renamed from: S8.j$b$b, reason: collision with other inner class name */
        public static final class C0730b extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final C0730b f20389a = new C0730b();

            private C0730b() {
                super(null);
            }
        }

        public static final class c extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final c f20390a = new c();

            private c() {
                super(null);
            }
        }

        public static final class d extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final d f20391a = new d();

            private d() {
                super(null);
            }
        }

        public static final class e extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final e f20392a = new e();

            private e() {
                super(null);
            }
        }

        public static abstract class f extends b {

            public static final class a extends f {

                /* renamed from: a, reason: collision with root package name */
                public static final a f20393a = new a();

                private a() {
                    super(null);
                }
            }

            /* renamed from: S8.j$b$f$b, reason: collision with other inner class name */
            public static final class C0731b extends f {

                /* renamed from: a, reason: collision with root package name */
                public static final C0731b f20394a = new C0731b();

                private C0731b() {
                    super(null);
                }
            }

            public /* synthetic */ f(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private f() {
                super(null);
            }
        }

        public static abstract class g extends b {

            public static final class a extends g {

                /* renamed from: a, reason: collision with root package name */
                public static final a f20395a = new a();

                private a() {
                    super(null);
                }
            }

            /* renamed from: S8.j$b$g$b, reason: collision with other inner class name */
            public static final class C0732b extends g {

                /* renamed from: a, reason: collision with root package name */
                public static final C0732b f20396a = new C0732b();

                private C0732b() {
                    super(null);
                }
            }

            public /* synthetic */ g(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private g() {
                super(null);
            }
        }

        public static abstract class h extends b {

            public static final class a extends h {

                /* renamed from: a, reason: collision with root package name */
                public static final a f20397a = new a();

                private a() {
                    super(null);
                }
            }

            /* renamed from: S8.j$b$h$b, reason: collision with other inner class name */
            public static final class C0733b extends h {

                /* renamed from: a, reason: collision with root package name */
                public static final C0733b f20398a = new C0733b();

                private C0733b() {
                    super(null);
                }
            }

            public static final class c extends h {

                /* renamed from: a, reason: collision with root package name */
                public static final c f20399a = new c();

                private c() {
                    super(null);
                }
            }

            public static final class d extends h {

                /* renamed from: a, reason: collision with root package name */
                public static final d f20400a = new d();

                private d() {
                    super(null);
                }
            }

            public /* synthetic */ h(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private h() {
                super(null);
            }
        }

        public static final class i extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final i f20401a = new i();

            private i() {
                super(null);
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public String toString() {
            if (this instanceof C0730b) {
                return "Open";
            }
            if (this instanceof e) {
                return "WEP";
            }
            if (this instanceof i) {
                return "WPS";
            }
            if (this instanceof a) {
                return "FILS";
            }
            if (this instanceof f.C0731b) {
                return "WPA-PSK";
            }
            if (this instanceof f.a) {
                return "WPA-EAP";
            }
            if (this instanceof g.C0732b) {
                return "WPA2-PSK";
            }
            if (this instanceof g.a) {
                return "WPA2-EAP";
            }
            if (this instanceof h.d) {
                return "WPA3-SAE";
            }
            if (this instanceof h.C0733b) {
                return "WPA3-EAP";
            }
            if (this instanceof h.c) {
                return "WPA3-OWE";
            }
            if (this instanceof h.a) {
                return "WPA3-DPP";
            }
            if (this instanceof d) {
                return "WAPI";
            }
            if (this instanceof c) {
                return "OSEN";
            }
            throw new NoWhenBranchMatchedException();
        }

        private b() {
        }
    }

    static final class c extends AbstractC6494u implements InterfaceC6824a {
        c() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            Set setA = j.this.a();
            boolean z10 = false;
            if (!(setA instanceof Collection) || !setA.isEmpty()) {
                Iterator it = setA.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    b bVar = (b) it.next();
                    if (bVar instanceof b.C0730b ? true : bVar instanceof b.h.c) {
                        z10 = true;
                        break;
                    }
                }
            }
            return Boolean.valueOf(z10);
        }
    }

    public /* synthetic */ j(Set set, DefaultConstructorMarker defaultConstructorMarker) {
        this(set);
    }

    public final Set a() {
        return this.f20386a;
    }

    public final boolean b() {
        return ((Boolean) this.f20387b.getValue()).booleanValue();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j) {
            return AbstractC6492s.d(this.f20386a, ((j) obj).f20386a);
        }
        return false;
    }

    public int hashCode() {
        return this.f20386a.hashCode();
    }

    private j(Set set) {
        this.f20386a = set;
        this.f20387b = n.b(new c());
    }
}
