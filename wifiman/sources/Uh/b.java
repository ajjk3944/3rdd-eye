package Uh;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.a;
import kotlin.reflect.jvm.internal.impl.protobuf.d;
import kotlin.reflect.jvm.internal.impl.protobuf.h;
import kotlin.reflect.jvm.internal.impl.protobuf.i;
import org.conscrypt.PSKKeyManager;

/* loaded from: classes4.dex */
public final class b extends kotlin.reflect.jvm.internal.impl.protobuf.h implements kotlin.reflect.jvm.internal.impl.protobuf.o {

    /* renamed from: h, reason: collision with root package name */
    private static final b f22472h;

    /* renamed from: i, reason: collision with root package name */
    public static kotlin.reflect.jvm.internal.impl.protobuf.p f22473i = new a();

    /* renamed from: b, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.protobuf.d f22474b;

    /* renamed from: c, reason: collision with root package name */
    private int f22475c;

    /* renamed from: d, reason: collision with root package name */
    private int f22476d;

    /* renamed from: e, reason: collision with root package name */
    private List f22477e;

    /* renamed from: f, reason: collision with root package name */
    private byte f22478f;

    /* renamed from: g, reason: collision with root package name */
    private int f22479g;

    static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public b b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
            return new b(eVar, fVar);
        }
    }

    /* renamed from: Uh.b$b, reason: collision with other inner class name */
    public static final class C0830b extends kotlin.reflect.jvm.internal.impl.protobuf.h implements kotlin.reflect.jvm.internal.impl.protobuf.o {

        /* renamed from: h, reason: collision with root package name */
        private static final C0830b f22480h;

        /* renamed from: i, reason: collision with root package name */
        public static kotlin.reflect.jvm.internal.impl.protobuf.p f22481i = new a();

        /* renamed from: b, reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.protobuf.d f22482b;

        /* renamed from: c, reason: collision with root package name */
        private int f22483c;

        /* renamed from: d, reason: collision with root package name */
        private int f22484d;

        /* renamed from: e, reason: collision with root package name */
        private c f22485e;

        /* renamed from: f, reason: collision with root package name */
        private byte f22486f;

        /* renamed from: g, reason: collision with root package name */
        private int f22487g;

        /* renamed from: Uh.b$b$a */
        static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b {
            a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public C0830b b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
                return new C0830b(eVar, fVar);
            }
        }

        /* renamed from: Uh.b$b$b, reason: collision with other inner class name */
        public static final class C0831b extends h.b implements kotlin.reflect.jvm.internal.impl.protobuf.o {

            /* renamed from: b, reason: collision with root package name */
            private int f22488b;

            /* renamed from: c, reason: collision with root package name */
            private int f22489c;

            /* renamed from: d, reason: collision with root package name */
            private c f22490d = c.V0();

            private C0831b() {
                t();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static C0831b r() {
                return new C0831b();
            }

            private void t() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.n.a
            /* renamed from: o, reason: merged with bridge method [inline-methods] */
            public C0830b a() {
                C0830b c0830bP = p();
                if (c0830bP.m()) {
                    return c0830bP;
                }
                throw a.AbstractC1921a.b(c0830bP);
            }

            public C0830b p() {
                C0830b c0830b = new C0830b(this);
                int i10 = this.f22488b;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                c0830b.f22484d = this.f22489c;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                c0830b.f22485e = this.f22490d;
                c0830b.f22483c = i11;
                return c0830b;
            }

            /* renamed from: q, reason: merged with bridge method [inline-methods] */
            public C0831b clone() {
                return r().f(p());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: u, reason: merged with bridge method [inline-methods] */
            public C0831b f(C0830b c0830b) {
                if (c0830b == C0830b.K()) {
                    return this;
                }
                if (c0830b.T()) {
                    z(c0830b.P());
                }
                if (c0830b.d0()) {
                    x(c0830b.S());
                }
                i(e().e(c0830b.f22482b));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.n.a
            /* renamed from: w, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public Uh.b.C0830b.C0831b b0(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.p r1 = Uh.b.C0830b.f22481i     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    Uh.b$b r3 = (Uh.b.C0830b) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    if (r3 == 0) goto Le
                    r2.f(r3)
                Le:
                    return r2
                Lf:
                    r3 = move-exception
                    goto L1b
                L11:
                    r3 = move-exception
                    kotlin.reflect.jvm.internal.impl.protobuf.n r4 = r3.a()     // Catch: java.lang.Throwable -> Lf
                    Uh.b$b r4 = (Uh.b.C0830b) r4     // Catch: java.lang.Throwable -> Lf
                    throw r3     // Catch: java.lang.Throwable -> L19
                L19:
                    r3 = move-exception
                    r0 = r4
                L1b:
                    if (r0 == 0) goto L20
                    r2.f(r0)
                L20:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: Uh.b.C0830b.C0831b.b0(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):Uh.b$b$b");
            }

            public C0831b x(c cVar) {
                if ((this.f22488b & 2) != 2 || this.f22490d == c.V0()) {
                    this.f22490d = cVar;
                } else {
                    this.f22490d = c.p1(this.f22490d).f(cVar).p();
                }
                this.f22488b |= 2;
                return this;
            }

            public C0831b z(int i10) {
                this.f22488b |= 1;
                this.f22489c = i10;
                return this;
            }
        }

        static {
            C0830b c0830b = new C0830b(true);
            f22480h = c0830b;
            c0830b.f0();
        }

        public static C0831b C0(C0830b c0830b) {
            return q0().f(c0830b);
        }

        public static C0830b K() {
            return f22480h;
        }

        private void f0() {
            this.f22484d = 0;
            this.f22485e = c.V0();
        }

        public static C0831b q0() {
            return C0831b.r();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        /* renamed from: E0, reason: merged with bridge method [inline-methods] */
        public C0831b h() {
            return q0();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        /* renamed from: G0, reason: merged with bridge method [inline-methods] */
        public C0831b l() {
            return C0(this);
        }

        public int P() {
            return this.f22484d;
        }

        public c S() {
            return this.f22485e;
        }

        public boolean T() {
            return (this.f22483c & 1) == 1;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public int d() {
            int i10 = this.f22487g;
            if (i10 != -1) {
                return i10;
            }
            int iO = (this.f22483c & 1) == 1 ? CodedOutputStream.o(1, this.f22484d) : 0;
            if ((this.f22483c & 2) == 2) {
                iO += CodedOutputStream.r(2, this.f22485e);
            }
            int size = iO + this.f22482b.size();
            this.f22487g = size;
            return size;
        }

        public boolean d0() {
            return (this.f22483c & 2) == 2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final boolean m() {
            byte b10 = this.f22486f;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            if (!T()) {
                this.f22486f = (byte) 0;
                return false;
            }
            if (!d0()) {
                this.f22486f = (byte) 0;
                return false;
            }
            if (S().m()) {
                this.f22486f = (byte) 1;
                return true;
            }
            this.f22486f = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public void n(CodedOutputStream codedOutputStream) throws IOException {
            d();
            if ((this.f22483c & 1) == 1) {
                codedOutputStream.Z(1, this.f22484d);
            }
            if ((this.f22483c & 2) == 2) {
                codedOutputStream.c0(2, this.f22485e);
            }
            codedOutputStream.h0(this.f22482b);
        }

        /* renamed from: Uh.b$b$c */
        public static final class c extends kotlin.reflect.jvm.internal.impl.protobuf.h implements kotlin.reflect.jvm.internal.impl.protobuf.o {

            /* renamed from: q, reason: collision with root package name */
            private static final c f22491q;

            /* renamed from: r, reason: collision with root package name */
            public static kotlin.reflect.jvm.internal.impl.protobuf.p f22492r = new a();

            /* renamed from: b, reason: collision with root package name */
            private final kotlin.reflect.jvm.internal.impl.protobuf.d f22493b;

            /* renamed from: c, reason: collision with root package name */
            private int f22494c;

            /* renamed from: d, reason: collision with root package name */
            private EnumC0833c f22495d;

            /* renamed from: e, reason: collision with root package name */
            private long f22496e;

            /* renamed from: f, reason: collision with root package name */
            private float f22497f;

            /* renamed from: g, reason: collision with root package name */
            private double f22498g;

            /* renamed from: h, reason: collision with root package name */
            private int f22499h;

            /* renamed from: i, reason: collision with root package name */
            private int f22500i;

            /* renamed from: j, reason: collision with root package name */
            private int f22501j;

            /* renamed from: k, reason: collision with root package name */
            private b f22502k;

            /* renamed from: l, reason: collision with root package name */
            private List f22503l;

            /* renamed from: m, reason: collision with root package name */
            private int f22504m;

            /* renamed from: n, reason: collision with root package name */
            private int f22505n;

            /* renamed from: o, reason: collision with root package name */
            private byte f22506o;

            /* renamed from: p, reason: collision with root package name */
            private int f22507p;

            /* renamed from: Uh.b$b$c$a */
            static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b {
                a() {
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
                /* renamed from: j, reason: merged with bridge method [inline-methods] */
                public c b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
                    return new c(eVar, fVar);
                }
            }

            /* renamed from: Uh.b$b$c$b, reason: collision with other inner class name */
            public static final class C0832b extends h.b implements kotlin.reflect.jvm.internal.impl.protobuf.o {

                /* renamed from: b, reason: collision with root package name */
                private int f22508b;

                /* renamed from: d, reason: collision with root package name */
                private long f22510d;

                /* renamed from: e, reason: collision with root package name */
                private float f22511e;

                /* renamed from: f, reason: collision with root package name */
                private double f22512f;

                /* renamed from: g, reason: collision with root package name */
                private int f22513g;

                /* renamed from: h, reason: collision with root package name */
                private int f22514h;

                /* renamed from: i, reason: collision with root package name */
                private int f22515i;

                /* renamed from: l, reason: collision with root package name */
                private int f22518l;

                /* renamed from: m, reason: collision with root package name */
                private int f22519m;

                /* renamed from: c, reason: collision with root package name */
                private EnumC0833c f22509c = EnumC0833c.BYTE;

                /* renamed from: j, reason: collision with root package name */
                private b f22516j = b.d0();

                /* renamed from: k, reason: collision with root package name */
                private List f22517k = Collections.emptyList();

                private C0832b() {
                    u();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static C0832b r() {
                    return new C0832b();
                }

                private void t() {
                    if ((this.f22508b & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 256) {
                        this.f22517k = new ArrayList(this.f22517k);
                        this.f22508b |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    }
                }

                private void u() {
                }

                public C0832b A(int i10) {
                    this.f22508b |= 512;
                    this.f22518l = i10;
                    return this;
                }

                public C0832b B(int i10) {
                    this.f22508b |= 32;
                    this.f22514h = i10;
                    return this;
                }

                public C0832b D(double d10) {
                    this.f22508b |= 8;
                    this.f22512f = d10;
                    return this;
                }

                public C0832b E(int i10) {
                    this.f22508b |= 64;
                    this.f22515i = i10;
                    return this;
                }

                public C0832b F(int i10) {
                    this.f22508b |= 1024;
                    this.f22519m = i10;
                    return this;
                }

                public C0832b G(float f10) {
                    this.f22508b |= 4;
                    this.f22511e = f10;
                    return this;
                }

                public C0832b H(long j10) {
                    this.f22508b |= 2;
                    this.f22510d = j10;
                    return this;
                }

                public C0832b I(int i10) {
                    this.f22508b |= 16;
                    this.f22513g = i10;
                    return this;
                }

                public C0832b K(EnumC0833c enumC0833c) {
                    enumC0833c.getClass();
                    this.f22508b |= 1;
                    this.f22509c = enumC0833c;
                    return this;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.n.a
                /* renamed from: o, reason: merged with bridge method [inline-methods] */
                public c a() {
                    c cVarP = p();
                    if (cVarP.m()) {
                        return cVarP;
                    }
                    throw a.AbstractC1921a.b(cVarP);
                }

                public c p() {
                    c cVar = new c(this);
                    int i10 = this.f22508b;
                    int i11 = (i10 & 1) != 1 ? 0 : 1;
                    cVar.f22495d = this.f22509c;
                    if ((i10 & 2) == 2) {
                        i11 |= 2;
                    }
                    cVar.f22496e = this.f22510d;
                    if ((i10 & 4) == 4) {
                        i11 |= 4;
                    }
                    cVar.f22497f = this.f22511e;
                    if ((i10 & 8) == 8) {
                        i11 |= 8;
                    }
                    cVar.f22498g = this.f22512f;
                    if ((i10 & 16) == 16) {
                        i11 |= 16;
                    }
                    cVar.f22499h = this.f22513g;
                    if ((i10 & 32) == 32) {
                        i11 |= 32;
                    }
                    cVar.f22500i = this.f22514h;
                    if ((i10 & 64) == 64) {
                        i11 |= 64;
                    }
                    cVar.f22501j = this.f22515i;
                    if ((i10 & 128) == 128) {
                        i11 |= 128;
                    }
                    cVar.f22502k = this.f22516j;
                    if ((this.f22508b & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
                        this.f22517k = Collections.unmodifiableList(this.f22517k);
                        this.f22508b &= -257;
                    }
                    cVar.f22503l = this.f22517k;
                    if ((i10 & 512) == 512) {
                        i11 |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    }
                    cVar.f22504m = this.f22518l;
                    if ((i10 & 1024) == 1024) {
                        i11 |= 512;
                    }
                    cVar.f22505n = this.f22519m;
                    cVar.f22494c = i11;
                    return cVar;
                }

                /* renamed from: q, reason: merged with bridge method [inline-methods] */
                public C0832b clone() {
                    return r().f(p());
                }

                public C0832b w(b bVar) {
                    if ((this.f22508b & 128) != 128 || this.f22516j == b.d0()) {
                        this.f22516j = bVar;
                    } else {
                        this.f22516j = b.G0(this.f22516j).f(bVar).p();
                    }
                    this.f22508b |= 128;
                    return this;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
                /* renamed from: x, reason: merged with bridge method [inline-methods] */
                public C0832b f(c cVar) {
                    if (cVar == c.V0()) {
                        return this;
                    }
                    if (cVar.m1()) {
                        K(cVar.c1());
                    }
                    if (cVar.k1()) {
                        H(cVar.a1());
                    }
                    if (cVar.j1()) {
                        G(cVar.Z0());
                    }
                    if (cVar.g1()) {
                        D(cVar.W0());
                    }
                    if (cVar.l1()) {
                        I(cVar.b1());
                    }
                    if (cVar.f1()) {
                        B(cVar.U0());
                    }
                    if (cVar.h1()) {
                        E(cVar.X0());
                    }
                    if (cVar.d1()) {
                        w(cVar.K0());
                    }
                    if (!cVar.f22503l.isEmpty()) {
                        if (this.f22517k.isEmpty()) {
                            this.f22517k = cVar.f22503l;
                            this.f22508b &= -257;
                        } else {
                            t();
                            this.f22517k.addAll(cVar.f22503l);
                        }
                    }
                    if (cVar.e1()) {
                        A(cVar.M0());
                    }
                    if (cVar.i1()) {
                        F(cVar.Y0());
                    }
                    i(e().e(cVar.f22493b));
                    return this;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.n.a
                /* renamed from: z, reason: merged with bridge method [inline-methods] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public Uh.b.C0830b.c.C0832b b0(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        kotlin.reflect.jvm.internal.impl.protobuf.p r1 = Uh.b.C0830b.c.f22492r     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                        java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                        Uh.b$b$c r3 = (Uh.b.C0830b.c) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                        if (r3 == 0) goto Le
                        r2.f(r3)
                    Le:
                        return r2
                    Lf:
                        r3 = move-exception
                        goto L1b
                    L11:
                        r3 = move-exception
                        kotlin.reflect.jvm.internal.impl.protobuf.n r4 = r3.a()     // Catch: java.lang.Throwable -> Lf
                        Uh.b$b$c r4 = (Uh.b.C0830b.c) r4     // Catch: java.lang.Throwable -> Lf
                        throw r3     // Catch: java.lang.Throwable -> L19
                    L19:
                        r3 = move-exception
                        r0 = r4
                    L1b:
                        if (r0 == 0) goto L20
                        r2.f(r0)
                    L20:
                        throw r3
                    */
                    throw new UnsupportedOperationException("Method not decompiled: Uh.b.C0830b.c.C0832b.b0(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):Uh.b$b$c$b");
                }
            }

            /* renamed from: Uh.b$b$c$c, reason: collision with other inner class name */
            public enum EnumC0833c implements i.a {
                BYTE(0, 0),
                CHAR(1, 1),
                SHORT(2, 2),
                INT(3, 3),
                LONG(4, 4),
                FLOAT(5, 5),
                DOUBLE(6, 6),
                BOOLEAN(7, 7),
                STRING(8, 8),
                CLASS(9, 9),
                ENUM(10, 10),
                ANNOTATION(11, 11),
                ARRAY(12, 12);

                private static i.b internalValueMap = new a();
                private final int value;

                /* renamed from: Uh.b$b$c$c$a */
                static class a implements i.b {
                    a() {
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.b
                    /* renamed from: b, reason: merged with bridge method [inline-methods] */
                    public EnumC0833c a(int i10) {
                        return EnumC0833c.valueOf(i10);
                    }
                }

                EnumC0833c(int i10, int i11) {
                    this.value = i11;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.a
                public final int getNumber() {
                    return this.value;
                }

                public static EnumC0833c valueOf(int i10) {
                    switch (i10) {
                        case 0:
                            return BYTE;
                        case 1:
                            return CHAR;
                        case 2:
                            return SHORT;
                        case 3:
                            return INT;
                        case 4:
                            return LONG;
                        case 5:
                            return FLOAT;
                        case 6:
                            return DOUBLE;
                        case 7:
                            return BOOLEAN;
                        case 8:
                            return STRING;
                        case 9:
                            return CLASS;
                        case 10:
                            return ENUM;
                        case 11:
                            return ANNOTATION;
                        case 12:
                            return ARRAY;
                        default:
                            return null;
                    }
                }
            }

            static {
                c cVar = new c(true);
                f22491q = cVar;
                cVar.n1();
            }

            public static c V0() {
                return f22491q;
            }

            private void n1() {
                this.f22495d = EnumC0833c.BYTE;
                this.f22496e = 0L;
                this.f22497f = 0.0f;
                this.f22498g = 0.0d;
                this.f22499h = 0;
                this.f22500i = 0;
                this.f22501j = 0;
                this.f22502k = b.d0();
                this.f22503l = Collections.emptyList();
                this.f22504m = 0;
                this.f22505n = 0;
            }

            public static C0832b o1() {
                return C0832b.r();
            }

            public static C0832b p1(c cVar) {
                return o1().f(cVar);
            }

            public b K0() {
                return this.f22502k;
            }

            public int M0() {
                return this.f22504m;
            }

            public c N0(int i10) {
                return (c) this.f22503l.get(i10);
            }

            public int P0() {
                return this.f22503l.size();
            }

            public List T0() {
                return this.f22503l;
            }

            public int U0() {
                return this.f22500i;
            }

            public double W0() {
                return this.f22498g;
            }

            public int X0() {
                return this.f22501j;
            }

            public int Y0() {
                return this.f22505n;
            }

            public float Z0() {
                return this.f22497f;
            }

            public long a1() {
                return this.f22496e;
            }

            public int b1() {
                return this.f22499h;
            }

            public EnumC0833c c1() {
                return this.f22495d;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
            public int d() {
                int i10 = this.f22507p;
                if (i10 != -1) {
                    return i10;
                }
                int iH = (this.f22494c & 1) == 1 ? CodedOutputStream.h(1, this.f22495d.getNumber()) : 0;
                if ((this.f22494c & 2) == 2) {
                    iH += CodedOutputStream.z(2, this.f22496e);
                }
                if ((this.f22494c & 4) == 4) {
                    iH += CodedOutputStream.l(3, this.f22497f);
                }
                if ((this.f22494c & 8) == 8) {
                    iH += CodedOutputStream.f(4, this.f22498g);
                }
                if ((this.f22494c & 16) == 16) {
                    iH += CodedOutputStream.o(5, this.f22499h);
                }
                if ((this.f22494c & 32) == 32) {
                    iH += CodedOutputStream.o(6, this.f22500i);
                }
                if ((this.f22494c & 64) == 64) {
                    iH += CodedOutputStream.o(7, this.f22501j);
                }
                if ((this.f22494c & 128) == 128) {
                    iH += CodedOutputStream.r(8, this.f22502k);
                }
                for (int i11 = 0; i11 < this.f22503l.size(); i11++) {
                    iH += CodedOutputStream.r(9, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.f22503l.get(i11));
                }
                if ((this.f22494c & 512) == 512) {
                    iH += CodedOutputStream.o(10, this.f22505n);
                }
                if ((this.f22494c & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
                    iH += CodedOutputStream.o(11, this.f22504m);
                }
                int size = iH + this.f22493b.size();
                this.f22507p = size;
                return size;
            }

            public boolean d1() {
                return (this.f22494c & 128) == 128;
            }

            public boolean e1() {
                return (this.f22494c & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256;
            }

            public boolean f1() {
                return (this.f22494c & 32) == 32;
            }

            public boolean g1() {
                return (this.f22494c & 8) == 8;
            }

            public boolean h1() {
                return (this.f22494c & 64) == 64;
            }

            public boolean i1() {
                return (this.f22494c & 512) == 512;
            }

            public boolean j1() {
                return (this.f22494c & 4) == 4;
            }

            public boolean k1() {
                return (this.f22494c & 2) == 2;
            }

            public boolean l1() {
                return (this.f22494c & 16) == 16;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            public final boolean m() {
                byte b10 = this.f22506o;
                if (b10 == 1) {
                    return true;
                }
                if (b10 == 0) {
                    return false;
                }
                if (d1() && !K0().m()) {
                    this.f22506o = (byte) 0;
                    return false;
                }
                for (int i10 = 0; i10 < P0(); i10++) {
                    if (!N0(i10).m()) {
                        this.f22506o = (byte) 0;
                        return false;
                    }
                }
                this.f22506o = (byte) 1;
                return true;
            }

            public boolean m1() {
                return (this.f22494c & 1) == 1;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
            public void n(CodedOutputStream codedOutputStream) throws IOException {
                d();
                if ((this.f22494c & 1) == 1) {
                    codedOutputStream.R(1, this.f22495d.getNumber());
                }
                if ((this.f22494c & 2) == 2) {
                    codedOutputStream.s0(2, this.f22496e);
                }
                if ((this.f22494c & 4) == 4) {
                    codedOutputStream.V(3, this.f22497f);
                }
                if ((this.f22494c & 8) == 8) {
                    codedOutputStream.P(4, this.f22498g);
                }
                if ((this.f22494c & 16) == 16) {
                    codedOutputStream.Z(5, this.f22499h);
                }
                if ((this.f22494c & 32) == 32) {
                    codedOutputStream.Z(6, this.f22500i);
                }
                if ((this.f22494c & 64) == 64) {
                    codedOutputStream.Z(7, this.f22501j);
                }
                if ((this.f22494c & 128) == 128) {
                    codedOutputStream.c0(8, this.f22502k);
                }
                for (int i10 = 0; i10 < this.f22503l.size(); i10++) {
                    codedOutputStream.c0(9, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.f22503l.get(i10));
                }
                if ((this.f22494c & 512) == 512) {
                    codedOutputStream.Z(10, this.f22505n);
                }
                if ((this.f22494c & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
                    codedOutputStream.Z(11, this.f22504m);
                }
                codedOutputStream.h0(this.f22493b);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
            /* renamed from: q1, reason: merged with bridge method [inline-methods] */
            public C0832b h() {
                return o1();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
            /* renamed from: r1, reason: merged with bridge method [inline-methods] */
            public C0832b l() {
                return p1(this);
            }

            private c(h.b bVar) {
                super(bVar);
                this.f22506o = (byte) -1;
                this.f22507p = -1;
                this.f22493b = bVar.e();
            }

            private c(boolean z10) {
                this.f22506o = (byte) -1;
                this.f22507p = -1;
                this.f22493b = kotlin.reflect.jvm.internal.impl.protobuf.d.f51945a;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r5v0 */
            /* JADX WARN: Type inference failed for: r5v1 */
            /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
            private c(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
                this.f22506o = (byte) -1;
                this.f22507p = -1;
                n1();
                d.b bVarU = kotlin.reflect.jvm.internal.impl.protobuf.d.u();
                CodedOutputStream codedOutputStreamI = CodedOutputStream.I(bVarU, 1);
                boolean z10 = false;
                char c10 = 0;
                while (true) {
                    ?? Y10 = 256;
                    if (!z10) {
                        try {
                            try {
                                int iJ = eVar.J();
                                switch (iJ) {
                                    case 0:
                                        z10 = true;
                                    case 8:
                                        int iM = eVar.m();
                                        EnumC0833c enumC0833cValueOf = EnumC0833c.valueOf(iM);
                                        if (enumC0833cValueOf == null) {
                                            codedOutputStreamI.n0(iJ);
                                            codedOutputStreamI.n0(iM);
                                        } else {
                                            this.f22494c |= 1;
                                            this.f22495d = enumC0833cValueOf;
                                        }
                                    case 16:
                                        this.f22494c |= 2;
                                        this.f22496e = eVar.G();
                                    case 29:
                                        this.f22494c |= 4;
                                        this.f22497f = eVar.p();
                                    case 33:
                                        this.f22494c |= 8;
                                        this.f22498g = eVar.l();
                                    case 40:
                                        this.f22494c |= 16;
                                        this.f22499h = eVar.r();
                                    case 48:
                                        this.f22494c |= 32;
                                        this.f22500i = eVar.r();
                                    case 56:
                                        this.f22494c |= 64;
                                        this.f22501j = eVar.r();
                                    case 66:
                                        c cVarL = (this.f22494c & 128) == 128 ? this.f22502k.l() : null;
                                        b bVar = (b) eVar.t(b.f22473i, fVar);
                                        this.f22502k = bVar;
                                        if (cVarL != null) {
                                            cVarL.f(bVar);
                                            this.f22502k = cVarL.p();
                                        }
                                        this.f22494c |= 128;
                                    case 74:
                                        if ((c10 & 256) != 256) {
                                            this.f22503l = new ArrayList();
                                            c10 = 256;
                                        }
                                        this.f22503l.add(eVar.t(f22492r, fVar));
                                    case 80:
                                        this.f22494c |= 512;
                                        this.f22505n = eVar.r();
                                    case 88:
                                        this.f22494c |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                                        this.f22504m = eVar.r();
                                    default:
                                        Y10 = y(eVar, codedOutputStreamI, fVar, iJ);
                                        if (Y10 == 0) {
                                            z10 = true;
                                        }
                                }
                            } catch (InvalidProtocolBufferException e10) {
                                throw e10.n(this);
                            } catch (IOException e11) {
                                throw new InvalidProtocolBufferException(e11.getMessage()).n(this);
                            }
                        } catch (Throwable th2) {
                            if ((c10 & 256) == Y10) {
                                this.f22503l = Collections.unmodifiableList(this.f22503l);
                            }
                            try {
                                codedOutputStreamI.H();
                            } catch (IOException unused) {
                            } catch (Throwable th3) {
                                this.f22493b = bVarU.p();
                                throw th3;
                            }
                            this.f22493b = bVarU.p();
                            s();
                            throw th2;
                        }
                    } else {
                        if ((c10 & 256) == 256) {
                            this.f22503l = Collections.unmodifiableList(this.f22503l);
                        }
                        try {
                            codedOutputStreamI.H();
                        } catch (IOException unused2) {
                        } catch (Throwable th4) {
                            this.f22493b = bVarU.p();
                            throw th4;
                        }
                        this.f22493b = bVarU.p();
                        s();
                        return;
                    }
                }
            }
        }

        private C0830b(h.b bVar) {
            super(bVar);
            this.f22486f = (byte) -1;
            this.f22487g = -1;
            this.f22482b = bVar.e();
        }

        private C0830b(boolean z10) {
            this.f22486f = (byte) -1;
            this.f22487g = -1;
            this.f22482b = kotlin.reflect.jvm.internal.impl.protobuf.d.f51945a;
        }

        private C0830b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
            this.f22486f = (byte) -1;
            this.f22487g = -1;
            f0();
            d.b bVarU = kotlin.reflect.jvm.internal.impl.protobuf.d.u();
            CodedOutputStream codedOutputStreamI = CodedOutputStream.I(bVarU, 1);
            boolean z10 = false;
            while (!z10) {
                try {
                    try {
                        int iJ = eVar.J();
                        if (iJ != 0) {
                            if (iJ == 8) {
                                this.f22483c |= 1;
                                this.f22484d = eVar.r();
                            } else if (iJ != 18) {
                                if (!y(eVar, codedOutputStreamI, fVar, iJ)) {
                                }
                            } else {
                                c.C0832b c0832bL = (this.f22483c & 2) == 2 ? this.f22485e.l() : null;
                                c cVar = (c) eVar.t(c.f22492r, fVar);
                                this.f22485e = cVar;
                                if (c0832bL != null) {
                                    c0832bL.f(cVar);
                                    this.f22485e = c0832bL.p();
                                }
                                this.f22483c |= 2;
                            }
                        }
                        z10 = true;
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.n(this);
                    } catch (IOException e11) {
                        throw new InvalidProtocolBufferException(e11.getMessage()).n(this);
                    }
                } catch (Throwable th2) {
                    try {
                        codedOutputStreamI.H();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f22482b = bVarU.p();
                        throw th3;
                    }
                    this.f22482b = bVarU.p();
                    s();
                    throw th2;
                }
            }
            try {
                codedOutputStreamI.H();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f22482b = bVarU.p();
                throw th4;
            }
            this.f22482b = bVarU.p();
            s();
        }
    }

    public static final class c extends h.b implements kotlin.reflect.jvm.internal.impl.protobuf.o {

        /* renamed from: b, reason: collision with root package name */
        private int f22520b;

        /* renamed from: c, reason: collision with root package name */
        private int f22521c;

        /* renamed from: d, reason: collision with root package name */
        private List f22522d = Collections.emptyList();

        private c() {
            u();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static c r() {
            return new c();
        }

        private void t() {
            if ((this.f22520b & 2) != 2) {
                this.f22522d = new ArrayList(this.f22522d);
                this.f22520b |= 2;
            }
        }

        private void u() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n.a
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public b a() {
            b bVarP = p();
            if (bVarP.m()) {
                return bVarP;
            }
            throw a.AbstractC1921a.b(bVarP);
        }

        public b p() {
            b bVar = new b(this);
            int i10 = (this.f22520b & 1) != 1 ? 0 : 1;
            bVar.f22476d = this.f22521c;
            if ((this.f22520b & 2) == 2) {
                this.f22522d = Collections.unmodifiableList(this.f22522d);
                this.f22520b &= -3;
            }
            bVar.f22477e = this.f22522d;
            bVar.f22475c = i10;
            return bVar;
        }

        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public c clone() {
            return r().f(p());
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public c f(b bVar) {
            if (bVar == b.d0()) {
                return this;
            }
            if (bVar.q0()) {
                z(bVar.f0());
            }
            if (!bVar.f22477e.isEmpty()) {
                if (this.f22522d.isEmpty()) {
                    this.f22522d = bVar.f22477e;
                    this.f22520b &= -3;
                } else {
                    t();
                    this.f22522d.addAll(bVar.f22477e);
                }
            }
            i(e().e(bVar.f22474b));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n.a
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public Uh.b.c b0(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.p r1 = Uh.b.f22473i     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                Uh.b r3 = (Uh.b) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                if (r3 == 0) goto Le
                r2.f(r3)
            Le:
                return r2
            Lf:
                r3 = move-exception
                goto L1b
            L11:
                r3 = move-exception
                kotlin.reflect.jvm.internal.impl.protobuf.n r4 = r3.a()     // Catch: java.lang.Throwable -> Lf
                Uh.b r4 = (Uh.b) r4     // Catch: java.lang.Throwable -> Lf
                throw r3     // Catch: java.lang.Throwable -> L19
            L19:
                r3 = move-exception
                r0 = r4
            L1b:
                if (r0 == 0) goto L20
                r2.f(r0)
            L20:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: Uh.b.c.b0(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):Uh.b$c");
        }

        public c z(int i10) {
            this.f22520b |= 1;
            this.f22521c = i10;
            return this;
        }
    }

    static {
        b bVar = new b(true);
        f22472h = bVar;
        bVar.C0();
    }

    private void C0() {
        this.f22476d = 0;
        this.f22477e = Collections.emptyList();
    }

    public static c E0() {
        return c.r();
    }

    public static c G0(b bVar) {
        return E0().f(bVar);
    }

    public static b d0() {
        return f22472h;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
    /* renamed from: K0, reason: merged with bridge method [inline-methods] */
    public c h() {
        return E0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
    /* renamed from: M0, reason: merged with bridge method [inline-methods] */
    public c l() {
        return G0(this);
    }

    public C0830b P(int i10) {
        return (C0830b) this.f22477e.get(i10);
    }

    public int S() {
        return this.f22477e.size();
    }

    public List T() {
        return this.f22477e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
    public int d() {
        int i10 = this.f22479g;
        if (i10 != -1) {
            return i10;
        }
        int iO = (this.f22475c & 1) == 1 ? CodedOutputStream.o(1, this.f22476d) : 0;
        for (int i11 = 0; i11 < this.f22477e.size(); i11++) {
            iO += CodedOutputStream.r(2, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.f22477e.get(i11));
        }
        int size = iO + this.f22474b.size();
        this.f22479g = size;
        return size;
    }

    public int f0() {
        return this.f22476d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public final boolean m() {
        byte b10 = this.f22478f;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (!q0()) {
            this.f22478f = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < S(); i10++) {
            if (!P(i10).m()) {
                this.f22478f = (byte) 0;
                return false;
            }
        }
        this.f22478f = (byte) 1;
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
    public void n(CodedOutputStream codedOutputStream) throws IOException {
        d();
        if ((this.f22475c & 1) == 1) {
            codedOutputStream.Z(1, this.f22476d);
        }
        for (int i10 = 0; i10 < this.f22477e.size(); i10++) {
            codedOutputStream.c0(2, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.f22477e.get(i10));
        }
        codedOutputStream.h0(this.f22474b);
    }

    public boolean q0() {
        return (this.f22475c & 1) == 1;
    }

    private b(h.b bVar) {
        super(bVar);
        this.f22478f = (byte) -1;
        this.f22479g = -1;
        this.f22474b = bVar.e();
    }

    private b(boolean z10) {
        this.f22478f = (byte) -1;
        this.f22479g = -1;
        this.f22474b = kotlin.reflect.jvm.internal.impl.protobuf.d.f51945a;
    }

    private b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
        this.f22478f = (byte) -1;
        this.f22479g = -1;
        C0();
        d.b bVarU = kotlin.reflect.jvm.internal.impl.protobuf.d.u();
        CodedOutputStream codedOutputStreamI = CodedOutputStream.I(bVarU, 1);
        boolean z10 = false;
        char c10 = 0;
        while (!z10) {
            try {
                try {
                    int iJ = eVar.J();
                    if (iJ != 0) {
                        if (iJ == 8) {
                            this.f22475c |= 1;
                            this.f22476d = eVar.r();
                        } else if (iJ != 18) {
                            if (!y(eVar, codedOutputStreamI, fVar, iJ)) {
                            }
                        } else {
                            if ((c10 & 2) != 2) {
                                this.f22477e = new ArrayList();
                                c10 = 2;
                            }
                            this.f22477e.add(eVar.t(C0830b.f22481i, fVar));
                        }
                    }
                    z10 = true;
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.n(this);
                } catch (IOException e11) {
                    throw new InvalidProtocolBufferException(e11.getMessage()).n(this);
                }
            } catch (Throwable th2) {
                if ((c10 & 2) == 2) {
                    this.f22477e = Collections.unmodifiableList(this.f22477e);
                }
                try {
                    codedOutputStreamI.H();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f22474b = bVarU.p();
                    throw th3;
                }
                this.f22474b = bVarU.p();
                s();
                throw th2;
            }
        }
        if ((c10 & 2) == 2) {
            this.f22477e = Collections.unmodifiableList(this.f22477e);
        }
        try {
            codedOutputStreamI.H();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f22474b = bVarU.p();
            throw th4;
        }
        this.f22474b = bVarU.p();
        s();
    }
}
