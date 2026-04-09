package je;

import Zg.AbstractC3689v;
import Zg.U;
import a8.C3772b;
import h9.C5969a;
import java.util.Iterator;
import java.util.Map;
import je.AbstractC6317r;
import ke.AbstractC6458c;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6835l;
import zi.AbstractC8783m;

/* renamed from: je.r, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6317r {

    /* renamed from: je.r$a */
    public static final class a extends AbstractC6317r {

        /* renamed from: a, reason: collision with root package name */
        public static final a f50770a = new a();

        private a() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return -19246878;
        }

        public String toString() {
            return "Disabled";
        }
    }

    /* renamed from: je.r$b */
    public static abstract class b extends AbstractC6317r {

        /* renamed from: je.r$b$a */
        public static abstract class a extends b {

            /* renamed from: je.r$b$a$a, reason: collision with other inner class name */
            public static final class C1873a extends a {

                /* renamed from: a, reason: collision with root package name */
                private final AbstractC6458c f50771a;

                /* renamed from: b, reason: collision with root package name */
                private final C5969a f50772b;

                /* renamed from: c, reason: collision with root package name */
                private final S8.a f50773c;

                /* renamed from: d, reason: collision with root package name */
                private final S8.j f50774d;

                /* renamed from: e, reason: collision with root package name */
                private final C6316q f50775e;

                /* renamed from: f, reason: collision with root package name */
                private final C6316q f50776f;

                /* renamed from: g, reason: collision with root package name */
                private final C6316q f50777g;

                /* renamed from: h, reason: collision with root package name */
                private final Map f50778h;

                /* renamed from: i, reason: collision with root package name */
                private final C3772b f50779i;

                /* renamed from: j, reason: collision with root package name */
                private final S8.l f50780j;

                /* renamed from: k, reason: collision with root package name */
                private final S8.c f50781k;

                /* renamed from: l, reason: collision with root package name */
                private final Integer f50782l;

                /* renamed from: m, reason: collision with root package name */
                private final S8.d f50783m;

                /* renamed from: n, reason: collision with root package name */
                private final W7.b f50784n;

                /* JADX WARN: Illegal instructions before constructor call */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.internal.DefaultConstructorMarker] */
                /* JADX WARN: Type inference failed for: r0v3 */
                /* JADX WARN: Type inference failed for: r0v4 */
                public C1873a(AbstractC6458c abstractC6458c, C5969a c5969a, S8.a aVar, S8.j jVar, C6316q c6316q, C6316q c6316q2, C6316q c6316q3) {
                    C6316q c6316qO;
                    C6316q c6316qO2;
                    C6316q c6316qO3;
                    W7.b bVarG = 0;
                    bVarG = 0;
                    super(bVarG);
                    this.f50771a = abstractC6458c;
                    this.f50772b = c5969a;
                    this.f50773c = aVar;
                    this.f50774d = jVar;
                    this.f50775e = c6316q;
                    this.f50776f = c6316q2;
                    this.f50777g = c6316q3;
                    Map mapC = U.c();
                    if ((c6316q != null ? c6316q.c() : null) != null) {
                        mapC.put(c6316q.c(), c6316q);
                    }
                    if ((c6316q2 != null ? c6316q2.c() : null) != null) {
                        mapC.put(c6316q2.c(), c6316q2);
                    }
                    if ((c6316q3 != null ? c6316q3.c() : null) != null) {
                        mapC.put(c6316q3.c(), c6316q3);
                    }
                    Map mapB = U.b(mapC);
                    this.f50778h = mapB;
                    C5969a c5969aC = c();
                    this.f50779i = c5969aC != null ? C3772b.f25747c.b(c5969aC) : null;
                    this.f50780j = (S8.l) AbstractC8783m.P(AbstractC8783m.O(AbstractC3689v.d0(mapB.values()), new InterfaceC6835l() { // from class: je.s
                        @Override // mh.InterfaceC6835l
                        public final Object invoke(Object obj) {
                            return AbstractC6317r.b.a.C1873a.t((C6316q) obj);
                        }
                    }));
                    this.f50781k = (S8.c) AbstractC8783m.P(AbstractC8783m.N(AbstractC3689v.d0(mapB.values()), new InterfaceC6835l() { // from class: je.t
                        @Override // mh.InterfaceC6835l
                        public final Object invoke(Object obj) {
                            return AbstractC6317r.b.a.C1873a.l((C6316q) obj);
                        }
                    }));
                    S8.c cVarB = b();
                    this.f50782l = (cVarB == null || (c6316qO3 = o(cVarB)) == null) ? null : c6316qO3.f();
                    S8.c cVarB2 = b();
                    this.f50783m = (cVarB2 == null || (c6316qO2 = o(cVarB2)) == null) ? null : c6316qO2.d();
                    S8.c cVarB3 = b();
                    if (cVarB3 != null && (c6316qO = o(cVarB3)) != null) {
                        bVarG = c6316qO.g();
                    }
                    this.f50784n = bVarG;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final S8.c l(C6316q it) {
                    AbstractC6492s.i(it, "it");
                    return it.c();
                }

                public static /* synthetic */ C1873a n(C1873a c1873a, AbstractC6458c abstractC6458c, C5969a c5969a, S8.a aVar, S8.j jVar, C6316q c6316q, C6316q c6316q2, C6316q c6316q3, int i10, Object obj) {
                    if ((i10 & 1) != 0) {
                        abstractC6458c = c1873a.f50771a;
                    }
                    if ((i10 & 2) != 0) {
                        c5969a = c1873a.f50772b;
                    }
                    C5969a c5969a2 = c5969a;
                    if ((i10 & 4) != 0) {
                        aVar = c1873a.f50773c;
                    }
                    S8.a aVar2 = aVar;
                    if ((i10 & 8) != 0) {
                        jVar = c1873a.f50774d;
                    }
                    S8.j jVar2 = jVar;
                    if ((i10 & 16) != 0) {
                        c6316q = c1873a.f50775e;
                    }
                    C6316q c6316q4 = c6316q;
                    if ((i10 & 32) != 0) {
                        c6316q2 = c1873a.f50776f;
                    }
                    C6316q c6316q5 = c6316q2;
                    if ((i10 & 64) != 0) {
                        c6316q3 = c1873a.f50777g;
                    }
                    return c1873a.m(abstractC6458c, c5969a2, aVar2, jVar2, c6316q4, c6316q5, c6316q3);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final S8.l t(C6316q it) {
                    AbstractC6492s.i(it, "it");
                    return it.h();
                }

                @Override // je.AbstractC6317r.b.a
                public C3772b a() {
                    return this.f50779i;
                }

                @Override // je.AbstractC6317r.b.a
                public S8.c b() {
                    return this.f50781k;
                }

                @Override // je.AbstractC6317r.b.a
                public C5969a c() {
                    return this.f50772b;
                }

                @Override // je.AbstractC6317r.b.a
                public Integer d() {
                    return this.f50782l;
                }

                @Override // je.AbstractC6317r.b.a
                public S8.a e() {
                    return this.f50773c;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C1873a)) {
                        return false;
                    }
                    C1873a c1873a = (C1873a) obj;
                    return AbstractC6492s.d(this.f50771a, c1873a.f50771a) && AbstractC6492s.d(this.f50772b, c1873a.f50772b) && this.f50773c == c1873a.f50773c && AbstractC6492s.d(this.f50774d, c1873a.f50774d) && AbstractC6492s.d(this.f50775e, c1873a.f50775e) && AbstractC6492s.d(this.f50776f, c1873a.f50776f) && AbstractC6492s.d(this.f50777g, c1873a.f50777g);
                }

                @Override // je.AbstractC6317r.b.a
                public W7.b f() {
                    return this.f50784n;
                }

                @Override // je.AbstractC6317r.b.a
                public S8.j g() {
                    return this.f50774d;
                }

                @Override // je.AbstractC6317r.b.a
                public S8.l h() {
                    return this.f50780j;
                }

                public int hashCode() {
                    AbstractC6458c abstractC6458c = this.f50771a;
                    int iHashCode = (abstractC6458c == null ? 0 : abstractC6458c.hashCode()) * 31;
                    C5969a c5969a = this.f50772b;
                    int iHashCode2 = (iHashCode + (c5969a == null ? 0 : c5969a.hashCode())) * 31;
                    S8.a aVar = this.f50773c;
                    int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
                    S8.j jVar = this.f50774d;
                    int iHashCode4 = (iHashCode3 + (jVar == null ? 0 : jVar.hashCode())) * 31;
                    C6316q c6316q = this.f50775e;
                    int iHashCode5 = (iHashCode4 + (c6316q == null ? 0 : c6316q.hashCode())) * 31;
                    C6316q c6316q2 = this.f50776f;
                    int iHashCode6 = (iHashCode5 + (c6316q2 == null ? 0 : c6316q2.hashCode())) * 31;
                    C6316q c6316q3 = this.f50777g;
                    return iHashCode6 + (c6316q3 != null ? c6316q3.hashCode() : 0);
                }

                @Override // je.AbstractC6317r.b.a
                public AbstractC6458c i() {
                    return this.f50771a;
                }

                public final C1873a m(AbstractC6458c abstractC6458c, C5969a c5969a, S8.a aVar, S8.j jVar, C6316q c6316q, C6316q c6316q2, C6316q c6316q3) {
                    return new C1873a(abstractC6458c, c5969a, aVar, jVar, c6316q, c6316q2, c6316q3);
                }

                public final C6316q o(S8.c band) {
                    AbstractC6492s.i(band, "band");
                    return (C6316q) this.f50778h.get(band);
                }

                public final C6316q p(C5969a mac) {
                    Object next;
                    AbstractC6492s.i(mac, "mac");
                    Iterator it = this.f50778h.values().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        if (AbstractC6492s.d(((C6316q) next).e(), mac)) {
                            break;
                        }
                    }
                    return (C6316q) next;
                }

                public final C6316q q() {
                    return this.f50775e;
                }

                public final C6316q r() {
                    return this.f50776f;
                }

                public final C6316q s() {
                    return this.f50777g;
                }

                public String toString() {
                    return "MLO(ssid=" + this.f50771a + ", bssid=" + this.f50772b + ", ieeeMode=" + this.f50773c + ", securityType=" + this.f50774d + ", linkGhz2=" + this.f50775e + ", linkGhz5=" + this.f50776f + ", linkGhz6=" + this.f50777g + ")";
                }
            }

            /* renamed from: je.r$b$a$b, reason: collision with other inner class name */
            public static final class C1874b extends a {

                /* renamed from: a, reason: collision with root package name */
                private final AbstractC6458c f50785a;

                /* renamed from: b, reason: collision with root package name */
                private final C5969a f50786b;

                /* renamed from: c, reason: collision with root package name */
                private final S8.a f50787c;

                /* renamed from: d, reason: collision with root package name */
                private final S8.j f50788d;

                /* renamed from: e, reason: collision with root package name */
                private final C6316q f50789e;

                /* renamed from: f, reason: collision with root package name */
                private final C3772b f50790f;

                public C1874b(AbstractC6458c abstractC6458c, C5969a c5969a, S8.a aVar, S8.j jVar, C6316q c6316q) {
                    super(0 == true ? 1 : 0);
                    this.f50785a = abstractC6458c;
                    this.f50786b = c5969a;
                    this.f50787c = aVar;
                    this.f50788d = jVar;
                    this.f50789e = c6316q;
                    C5969a c5969aC = c();
                    this.f50790f = c5969aC != null ? C3772b.f25747c.b(c5969aC) : null;
                }

                public static /* synthetic */ C1874b k(C1874b c1874b, AbstractC6458c abstractC6458c, C5969a c5969a, S8.a aVar, S8.j jVar, C6316q c6316q, int i10, Object obj) {
                    if ((i10 & 1) != 0) {
                        abstractC6458c = c1874b.f50785a;
                    }
                    if ((i10 & 2) != 0) {
                        c5969a = c1874b.f50786b;
                    }
                    C5969a c5969a2 = c5969a;
                    if ((i10 & 4) != 0) {
                        aVar = c1874b.f50787c;
                    }
                    S8.a aVar2 = aVar;
                    if ((i10 & 8) != 0) {
                        jVar = c1874b.f50788d;
                    }
                    S8.j jVar2 = jVar;
                    if ((i10 & 16) != 0) {
                        c6316q = c1874b.f50789e;
                    }
                    return c1874b.j(abstractC6458c, c5969a2, aVar2, jVar2, c6316q);
                }

                @Override // je.AbstractC6317r.b.a
                public C3772b a() {
                    return this.f50790f;
                }

                @Override // je.AbstractC6317r.b.a
                public S8.c b() {
                    C6316q c6316q = this.f50789e;
                    if (c6316q != null) {
                        return c6316q.c();
                    }
                    return null;
                }

                @Override // je.AbstractC6317r.b.a
                public C5969a c() {
                    return this.f50786b;
                }

                @Override // je.AbstractC6317r.b.a
                public Integer d() {
                    C6316q c6316q = this.f50789e;
                    if (c6316q != null) {
                        return c6316q.f();
                    }
                    return null;
                }

                @Override // je.AbstractC6317r.b.a
                public S8.a e() {
                    return this.f50787c;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C1874b)) {
                        return false;
                    }
                    C1874b c1874b = (C1874b) obj;
                    return AbstractC6492s.d(this.f50785a, c1874b.f50785a) && AbstractC6492s.d(this.f50786b, c1874b.f50786b) && this.f50787c == c1874b.f50787c && AbstractC6492s.d(this.f50788d, c1874b.f50788d) && AbstractC6492s.d(this.f50789e, c1874b.f50789e);
                }

                @Override // je.AbstractC6317r.b.a
                public W7.b f() {
                    C6316q c6316q = this.f50789e;
                    if (c6316q != null) {
                        return c6316q.g();
                    }
                    return null;
                }

                @Override // je.AbstractC6317r.b.a
                public S8.j g() {
                    return this.f50788d;
                }

                @Override // je.AbstractC6317r.b.a
                public S8.l h() {
                    C6316q c6316q = this.f50789e;
                    if (c6316q != null) {
                        return c6316q.h();
                    }
                    return null;
                }

                public int hashCode() {
                    AbstractC6458c abstractC6458c = this.f50785a;
                    int iHashCode = (abstractC6458c == null ? 0 : abstractC6458c.hashCode()) * 31;
                    C5969a c5969a = this.f50786b;
                    int iHashCode2 = (iHashCode + (c5969a == null ? 0 : c5969a.hashCode())) * 31;
                    S8.a aVar = this.f50787c;
                    int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
                    S8.j jVar = this.f50788d;
                    int iHashCode4 = (iHashCode3 + (jVar == null ? 0 : jVar.hashCode())) * 31;
                    C6316q c6316q = this.f50789e;
                    return iHashCode4 + (c6316q != null ? c6316q.hashCode() : 0);
                }

                @Override // je.AbstractC6317r.b.a
                public AbstractC6458c i() {
                    return this.f50785a;
                }

                public final C1874b j(AbstractC6458c abstractC6458c, C5969a c5969a, S8.a aVar, S8.j jVar, C6316q c6316q) {
                    return new C1874b(abstractC6458c, c5969a, aVar, jVar, c6316q);
                }

                public S8.d l() {
                    C6316q c6316q = this.f50789e;
                    if (c6316q != null) {
                        return c6316q.d();
                    }
                    return null;
                }

                public final C6316q m() {
                    return this.f50789e;
                }

                public String toString() {
                    return "SLO(ssid=" + this.f50785a + ", bssid=" + this.f50786b + ", ieeeMode=" + this.f50787c + ", securityType=" + this.f50788d + ", link=" + this.f50789e + ")";
                }
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public abstract C3772b a();

            public abstract S8.c b();

            public abstract C5969a c();

            public abstract Integer d();

            public abstract S8.a e();

            public abstract W7.b f();

            public abstract S8.j g();

            public abstract S8.l h();

            public abstract AbstractC6458c i();

            private a() {
                super(null);
            }
        }

        /* renamed from: je.r$b$b, reason: collision with other inner class name */
        public static final class C1875b extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final C1875b f50791a = new C1875b();

            private C1875b() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C1875b);
            }

            public int hashCode() {
                return 1418879310;
            }

            public String toString() {
                return "Disconnected";
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
            super(null);
        }
    }

    public /* synthetic */ AbstractC6317r(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC6317r() {
    }
}
