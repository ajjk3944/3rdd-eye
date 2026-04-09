package Xh;

import Uh.l;
import Uh.q;
import Uh.s;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.a;
import kotlin.reflect.jvm.internal.impl.protobuf.d;
import kotlin.reflect.jvm.internal.impl.protobuf.f;
import kotlin.reflect.jvm.internal.impl.protobuf.h;
import kotlin.reflect.jvm.internal.impl.protobuf.i;
import kotlin.reflect.jvm.internal.impl.protobuf.n;
import kotlin.reflect.jvm.internal.impl.protobuf.o;
import kotlin.reflect.jvm.internal.impl.protobuf.p;
import kotlin.reflect.jvm.internal.impl.protobuf.v;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final h.f f24342a;

    /* renamed from: b, reason: collision with root package name */
    public static final h.f f24343b;

    /* renamed from: c, reason: collision with root package name */
    public static final h.f f24344c;

    /* renamed from: d, reason: collision with root package name */
    public static final h.f f24345d;

    /* renamed from: e, reason: collision with root package name */
    public static final h.f f24346e;

    /* renamed from: f, reason: collision with root package name */
    public static final h.f f24347f;

    /* renamed from: g, reason: collision with root package name */
    public static final h.f f24348g;

    /* renamed from: h, reason: collision with root package name */
    public static final h.f f24349h;

    /* renamed from: i, reason: collision with root package name */
    public static final h.f f24350i;

    /* renamed from: j, reason: collision with root package name */
    public static final h.f f24351j;

    /* renamed from: k, reason: collision with root package name */
    public static final h.f f24352k;

    /* renamed from: l, reason: collision with root package name */
    public static final h.f f24353l;

    /* renamed from: m, reason: collision with root package name */
    public static final h.f f24354m;

    /* renamed from: n, reason: collision with root package name */
    public static final h.f f24355n;

    public static final class e extends h implements o {

        /* renamed from: h, reason: collision with root package name */
        private static final e f24395h;

        /* renamed from: i, reason: collision with root package name */
        public static p f24396i = new C0930a();

        /* renamed from: b, reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.protobuf.d f24397b;

        /* renamed from: c, reason: collision with root package name */
        private List f24398c;

        /* renamed from: d, reason: collision with root package name */
        private List f24399d;

        /* renamed from: e, reason: collision with root package name */
        private int f24400e;

        /* renamed from: f, reason: collision with root package name */
        private byte f24401f;

        /* renamed from: g, reason: collision with root package name */
        private int f24402g;

        /* renamed from: Xh.a$e$a, reason: collision with other inner class name */
        static class C0930a extends kotlin.reflect.jvm.internal.impl.protobuf.b {
            C0930a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public e b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, f fVar) {
                return new e(eVar, fVar);
            }
        }

        public static final class b extends h.b implements o {

            /* renamed from: b, reason: collision with root package name */
            private int f24403b;

            /* renamed from: c, reason: collision with root package name */
            private List f24404c = Collections.emptyList();

            /* renamed from: d, reason: collision with root package name */
            private List f24405d = Collections.emptyList();

            private b() {
                w();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static b r() {
                return new b();
            }

            private void t() {
                if ((this.f24403b & 2) != 2) {
                    this.f24405d = new ArrayList(this.f24405d);
                    this.f24403b |= 2;
                }
            }

            private void u() {
                if ((this.f24403b & 1) != 1) {
                    this.f24404c = new ArrayList(this.f24404c);
                    this.f24403b |= 1;
                }
            }

            private void w() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.n.a
            /* renamed from: o, reason: merged with bridge method [inline-methods] */
            public e a() {
                e eVarP = p();
                if (eVarP.m()) {
                    return eVarP;
                }
                throw a.AbstractC1921a.b(eVarP);
            }

            public e p() {
                e eVar = new e(this);
                if ((this.f24403b & 1) == 1) {
                    this.f24404c = Collections.unmodifiableList(this.f24404c);
                    this.f24403b &= -2;
                }
                eVar.f24398c = this.f24404c;
                if ((this.f24403b & 2) == 2) {
                    this.f24405d = Collections.unmodifiableList(this.f24405d);
                    this.f24403b &= -3;
                }
                eVar.f24399d = this.f24405d;
                return eVar;
            }

            /* renamed from: q, reason: merged with bridge method [inline-methods] */
            public b clone() {
                return r().f(p());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: x, reason: merged with bridge method [inline-methods] */
            public b f(e eVar) {
                if (eVar == e.P()) {
                    return this;
                }
                if (!eVar.f24398c.isEmpty()) {
                    if (this.f24404c.isEmpty()) {
                        this.f24404c = eVar.f24398c;
                        this.f24403b &= -2;
                    } else {
                        u();
                        this.f24404c.addAll(eVar.f24398c);
                    }
                }
                if (!eVar.f24399d.isEmpty()) {
                    if (this.f24405d.isEmpty()) {
                        this.f24405d = eVar.f24399d;
                        this.f24403b &= -3;
                    } else {
                        t();
                        this.f24405d.addAll(eVar.f24399d);
                    }
                }
                i(e().e(eVar.f24397b));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.n.a
            /* renamed from: z, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public Xh.a.e.b b0(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.p r1 = Xh.a.e.f24396i     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    Xh.a$e r3 = (Xh.a.e) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                    Xh.a$e r4 = (Xh.a.e) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: Xh.a.e.b.b0(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):Xh.a$e$b");
            }
        }

        static {
            e eVar = new e(true);
            f24395h = eVar;
            eVar.d0();
        }

        public static e E0(InputStream inputStream, f fVar) {
            return (e) f24396i.c(inputStream, fVar);
        }

        public static e P() {
            return f24395h;
        }

        private void d0() {
            this.f24398c = Collections.emptyList();
            this.f24399d = Collections.emptyList();
        }

        public static b f0() {
            return b.r();
        }

        public static b q0(e eVar) {
            return f0().f(eVar);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        /* renamed from: C0, reason: merged with bridge method [inline-methods] */
        public b h() {
            return f0();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        /* renamed from: G0, reason: merged with bridge method [inline-methods] */
        public b l() {
            return q0(this);
        }

        public List S() {
            return this.f24399d;
        }

        public List T() {
            return this.f24398c;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public int d() {
            int i10 = this.f24402g;
            if (i10 != -1) {
                return i10;
            }
            int iR = 0;
            for (int i11 = 0; i11 < this.f24398c.size(); i11++) {
                iR += CodedOutputStream.r(1, (n) this.f24398c.get(i11));
            }
            int iP = 0;
            for (int i12 = 0; i12 < this.f24399d.size(); i12++) {
                iP += CodedOutputStream.p(((Integer) this.f24399d.get(i12)).intValue());
            }
            int iP2 = iR + iP;
            if (!S().isEmpty()) {
                iP2 = iP2 + 1 + CodedOutputStream.p(iP);
            }
            this.f24400e = iP;
            int size = iP2 + this.f24397b.size();
            this.f24402g = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final boolean m() {
            byte b10 = this.f24401f;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f24401f = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public void n(CodedOutputStream codedOutputStream) throws IOException {
            d();
            for (int i10 = 0; i10 < this.f24398c.size(); i10++) {
                codedOutputStream.c0(1, (n) this.f24398c.get(i10));
            }
            if (S().size() > 0) {
                codedOutputStream.n0(42);
                codedOutputStream.n0(this.f24400e);
            }
            for (int i11 = 0; i11 < this.f24399d.size(); i11++) {
                codedOutputStream.a0(((Integer) this.f24399d.get(i11)).intValue());
            }
            codedOutputStream.h0(this.f24397b);
        }

        public static final class c extends h implements o {

            /* renamed from: n, reason: collision with root package name */
            private static final c f24406n;

            /* renamed from: o, reason: collision with root package name */
            public static p f24407o = new C0931a();

            /* renamed from: b, reason: collision with root package name */
            private final kotlin.reflect.jvm.internal.impl.protobuf.d f24408b;

            /* renamed from: c, reason: collision with root package name */
            private int f24409c;

            /* renamed from: d, reason: collision with root package name */
            private int f24410d;

            /* renamed from: e, reason: collision with root package name */
            private int f24411e;

            /* renamed from: f, reason: collision with root package name */
            private Object f24412f;

            /* renamed from: g, reason: collision with root package name */
            private EnumC0932c f24413g;

            /* renamed from: h, reason: collision with root package name */
            private List f24414h;

            /* renamed from: i, reason: collision with root package name */
            private int f24415i;

            /* renamed from: j, reason: collision with root package name */
            private List f24416j;

            /* renamed from: k, reason: collision with root package name */
            private int f24417k;

            /* renamed from: l, reason: collision with root package name */
            private byte f24418l;

            /* renamed from: m, reason: collision with root package name */
            private int f24419m;

            /* renamed from: Xh.a$e$c$a, reason: collision with other inner class name */
            static class C0931a extends kotlin.reflect.jvm.internal.impl.protobuf.b {
                C0931a() {
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
                /* renamed from: j, reason: merged with bridge method [inline-methods] */
                public c b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, f fVar) {
                    return new c(eVar, fVar);
                }
            }

            public static final class b extends h.b implements o {

                /* renamed from: b, reason: collision with root package name */
                private int f24420b;

                /* renamed from: d, reason: collision with root package name */
                private int f24422d;

                /* renamed from: c, reason: collision with root package name */
                private int f24421c = 1;

                /* renamed from: e, reason: collision with root package name */
                private Object f24423e = "";

                /* renamed from: f, reason: collision with root package name */
                private EnumC0932c f24424f = EnumC0932c.NONE;

                /* renamed from: g, reason: collision with root package name */
                private List f24425g = Collections.emptyList();

                /* renamed from: h, reason: collision with root package name */
                private List f24426h = Collections.emptyList();

                private b() {
                    w();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static b r() {
                    return new b();
                }

                private void t() {
                    if ((this.f24420b & 32) != 32) {
                        this.f24426h = new ArrayList(this.f24426h);
                        this.f24420b |= 32;
                    }
                }

                private void u() {
                    if ((this.f24420b & 16) != 16) {
                        this.f24425g = new ArrayList(this.f24425g);
                        this.f24420b |= 16;
                    }
                }

                private void w() {
                }

                public b A(EnumC0932c enumC0932c) {
                    enumC0932c.getClass();
                    this.f24420b |= 8;
                    this.f24424f = enumC0932c;
                    return this;
                }

                public b B(int i10) {
                    this.f24420b |= 2;
                    this.f24422d = i10;
                    return this;
                }

                public b D(int i10) {
                    this.f24420b |= 1;
                    this.f24421c = i10;
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
                    int i10 = this.f24420b;
                    int i11 = (i10 & 1) != 1 ? 0 : 1;
                    cVar.f24410d = this.f24421c;
                    if ((i10 & 2) == 2) {
                        i11 |= 2;
                    }
                    cVar.f24411e = this.f24422d;
                    if ((i10 & 4) == 4) {
                        i11 |= 4;
                    }
                    cVar.f24412f = this.f24423e;
                    if ((i10 & 8) == 8) {
                        i11 |= 8;
                    }
                    cVar.f24413g = this.f24424f;
                    if ((this.f24420b & 16) == 16) {
                        this.f24425g = Collections.unmodifiableList(this.f24425g);
                        this.f24420b &= -17;
                    }
                    cVar.f24414h = this.f24425g;
                    if ((this.f24420b & 32) == 32) {
                        this.f24426h = Collections.unmodifiableList(this.f24426h);
                        this.f24420b &= -33;
                    }
                    cVar.f24416j = this.f24426h;
                    cVar.f24409c = i11;
                    return cVar;
                }

                /* renamed from: q, reason: merged with bridge method [inline-methods] */
                public b clone() {
                    return r().f(p());
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
                /* renamed from: x, reason: merged with bridge method [inline-methods] */
                public b f(c cVar) {
                    if (cVar == c.C0()) {
                        return this;
                    }
                    if (cVar.Y0()) {
                        D(cVar.K0());
                    }
                    if (cVar.X0()) {
                        B(cVar.G0());
                    }
                    if (cVar.Z0()) {
                        this.f24420b |= 4;
                        this.f24423e = cVar.f24412f;
                    }
                    if (cVar.W0()) {
                        A(cVar.E0());
                    }
                    if (!cVar.f24414h.isEmpty()) {
                        if (this.f24425g.isEmpty()) {
                            this.f24425g = cVar.f24414h;
                            this.f24420b &= -17;
                        } else {
                            u();
                            this.f24425g.addAll(cVar.f24414h);
                        }
                    }
                    if (!cVar.f24416j.isEmpty()) {
                        if (this.f24426h.isEmpty()) {
                            this.f24426h = cVar.f24416j;
                            this.f24420b &= -33;
                        } else {
                            t();
                            this.f24426h.addAll(cVar.f24416j);
                        }
                    }
                    i(e().e(cVar.f24408b));
                    return this;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.n.a
                /* renamed from: z, reason: merged with bridge method [inline-methods] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public Xh.a.e.c.b b0(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        kotlin.reflect.jvm.internal.impl.protobuf.p r1 = Xh.a.e.c.f24407o     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                        java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                        Xh.a$e$c r3 = (Xh.a.e.c) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                        Xh.a$e$c r4 = (Xh.a.e.c) r4     // Catch: java.lang.Throwable -> Lf
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
                    throw new UnsupportedOperationException("Method not decompiled: Xh.a.e.c.b.b0(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):Xh.a$e$c$b");
                }
            }

            /* renamed from: Xh.a$e$c$c, reason: collision with other inner class name */
            public enum EnumC0932c implements i.a {
                NONE(0, 0),
                INTERNAL_TO_CLASS_ID(1, 1),
                DESC_TO_CLASS_ID(2, 2);

                private static i.b internalValueMap = new C0933a();
                private final int value;

                /* renamed from: Xh.a$e$c$c$a, reason: collision with other inner class name */
                static class C0933a implements i.b {
                    C0933a() {
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.b
                    /* renamed from: b, reason: merged with bridge method [inline-methods] */
                    public EnumC0932c a(int i10) {
                        return EnumC0932c.valueOf(i10);
                    }
                }

                EnumC0932c(int i10, int i11) {
                    this.value = i11;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.a
                public final int getNumber() {
                    return this.value;
                }

                public static EnumC0932c valueOf(int i10) {
                    if (i10 == 0) {
                        return NONE;
                    }
                    if (i10 == 1) {
                        return INTERNAL_TO_CLASS_ID;
                    }
                    if (i10 != 2) {
                        return null;
                    }
                    return DESC_TO_CLASS_ID;
                }
            }

            static {
                c cVar = new c(true);
                f24406n = cVar;
                cVar.a1();
            }

            public static c C0() {
                return f24406n;
            }

            private void a1() {
                this.f24410d = 1;
                this.f24411e = 0;
                this.f24412f = "";
                this.f24413g = EnumC0932c.NONE;
                this.f24414h = Collections.emptyList();
                this.f24416j = Collections.emptyList();
            }

            public static b b1() {
                return b.r();
            }

            public static b c1(c cVar) {
                return b1().f(cVar);
            }

            public EnumC0932c E0() {
                return this.f24413g;
            }

            public int G0() {
                return this.f24411e;
            }

            public int K0() {
                return this.f24410d;
            }

            public int M0() {
                return this.f24416j.size();
            }

            public List N0() {
                return this.f24416j;
            }

            public String P0() {
                Object obj = this.f24412f;
                if (obj instanceof String) {
                    return (String) obj;
                }
                kotlin.reflect.jvm.internal.impl.protobuf.d dVar = (kotlin.reflect.jvm.internal.impl.protobuf.d) obj;
                String strA = dVar.A();
                if (dVar.s()) {
                    this.f24412f = strA;
                }
                return strA;
            }

            public kotlin.reflect.jvm.internal.impl.protobuf.d T0() {
                Object obj = this.f24412f;
                if (!(obj instanceof String)) {
                    return (kotlin.reflect.jvm.internal.impl.protobuf.d) obj;
                }
                kotlin.reflect.jvm.internal.impl.protobuf.d dVarJ = kotlin.reflect.jvm.internal.impl.protobuf.d.j((String) obj);
                this.f24412f = dVarJ;
                return dVarJ;
            }

            public int U0() {
                return this.f24414h.size();
            }

            public List V0() {
                return this.f24414h;
            }

            public boolean W0() {
                return (this.f24409c & 8) == 8;
            }

            public boolean X0() {
                return (this.f24409c & 2) == 2;
            }

            public boolean Y0() {
                return (this.f24409c & 1) == 1;
            }

            public boolean Z0() {
                return (this.f24409c & 4) == 4;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
            public int d() {
                int i10 = this.f24419m;
                if (i10 != -1) {
                    return i10;
                }
                int iO = (this.f24409c & 1) == 1 ? CodedOutputStream.o(1, this.f24410d) : 0;
                if ((this.f24409c & 2) == 2) {
                    iO += CodedOutputStream.o(2, this.f24411e);
                }
                if ((this.f24409c & 8) == 8) {
                    iO += CodedOutputStream.h(3, this.f24413g.getNumber());
                }
                int iP = 0;
                for (int i11 = 0; i11 < this.f24414h.size(); i11++) {
                    iP += CodedOutputStream.p(((Integer) this.f24414h.get(i11)).intValue());
                }
                int iP2 = iO + iP;
                if (!V0().isEmpty()) {
                    iP2 = iP2 + 1 + CodedOutputStream.p(iP);
                }
                this.f24415i = iP;
                int iP3 = 0;
                for (int i12 = 0; i12 < this.f24416j.size(); i12++) {
                    iP3 += CodedOutputStream.p(((Integer) this.f24416j.get(i12)).intValue());
                }
                int iD = iP2 + iP3;
                if (!N0().isEmpty()) {
                    iD = iD + 1 + CodedOutputStream.p(iP3);
                }
                this.f24417k = iP3;
                if ((this.f24409c & 4) == 4) {
                    iD += CodedOutputStream.d(6, T0());
                }
                int size = iD + this.f24408b.size();
                this.f24419m = size;
                return size;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
            /* renamed from: d1, reason: merged with bridge method [inline-methods] */
            public b h() {
                return b1();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
            /* renamed from: e1, reason: merged with bridge method [inline-methods] */
            public b l() {
                return c1(this);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            public final boolean m() {
                byte b10 = this.f24418l;
                if (b10 == 1) {
                    return true;
                }
                if (b10 == 0) {
                    return false;
                }
                this.f24418l = (byte) 1;
                return true;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
            public void n(CodedOutputStream codedOutputStream) throws IOException {
                d();
                if ((this.f24409c & 1) == 1) {
                    codedOutputStream.Z(1, this.f24410d);
                }
                if ((this.f24409c & 2) == 2) {
                    codedOutputStream.Z(2, this.f24411e);
                }
                if ((this.f24409c & 8) == 8) {
                    codedOutputStream.R(3, this.f24413g.getNumber());
                }
                if (V0().size() > 0) {
                    codedOutputStream.n0(34);
                    codedOutputStream.n0(this.f24415i);
                }
                for (int i10 = 0; i10 < this.f24414h.size(); i10++) {
                    codedOutputStream.a0(((Integer) this.f24414h.get(i10)).intValue());
                }
                if (N0().size() > 0) {
                    codedOutputStream.n0(42);
                    codedOutputStream.n0(this.f24417k);
                }
                for (int i11 = 0; i11 < this.f24416j.size(); i11++) {
                    codedOutputStream.a0(((Integer) this.f24416j.get(i11)).intValue());
                }
                if ((this.f24409c & 4) == 4) {
                    codedOutputStream.N(6, T0());
                }
                codedOutputStream.h0(this.f24408b);
            }

            private c(h.b bVar) {
                super(bVar);
                this.f24415i = -1;
                this.f24417k = -1;
                this.f24418l = (byte) -1;
                this.f24419m = -1;
                this.f24408b = bVar.e();
            }

            private c(boolean z10) {
                this.f24415i = -1;
                this.f24417k = -1;
                this.f24418l = (byte) -1;
                this.f24419m = -1;
                this.f24408b = kotlin.reflect.jvm.internal.impl.protobuf.d.f51945a;
            }

            private c(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, f fVar) {
                this.f24415i = -1;
                this.f24417k = -1;
                this.f24418l = (byte) -1;
                this.f24419m = -1;
                a1();
                d.b bVarU = kotlin.reflect.jvm.internal.impl.protobuf.d.u();
                CodedOutputStream codedOutputStreamI = CodedOutputStream.I(bVarU, 1);
                boolean z10 = false;
                int i10 = 0;
                while (!z10) {
                    try {
                        try {
                            int iJ = eVar.J();
                            if (iJ != 0) {
                                if (iJ == 8) {
                                    this.f24409c |= 1;
                                    this.f24410d = eVar.r();
                                } else if (iJ == 16) {
                                    this.f24409c |= 2;
                                    this.f24411e = eVar.r();
                                } else if (iJ == 24) {
                                    int iM = eVar.m();
                                    EnumC0932c enumC0932cValueOf = EnumC0932c.valueOf(iM);
                                    if (enumC0932cValueOf == null) {
                                        codedOutputStreamI.n0(iJ);
                                        codedOutputStreamI.n0(iM);
                                    } else {
                                        this.f24409c |= 8;
                                        this.f24413g = enumC0932cValueOf;
                                    }
                                } else if (iJ == 32) {
                                    if ((i10 & 16) != 16) {
                                        this.f24414h = new ArrayList();
                                        i10 |= 16;
                                    }
                                    this.f24414h.add(Integer.valueOf(eVar.r()));
                                } else if (iJ == 34) {
                                    int i11 = eVar.i(eVar.z());
                                    if ((i10 & 16) != 16 && eVar.e() > 0) {
                                        this.f24414h = new ArrayList();
                                        i10 |= 16;
                                    }
                                    while (eVar.e() > 0) {
                                        this.f24414h.add(Integer.valueOf(eVar.r()));
                                    }
                                    eVar.h(i11);
                                } else if (iJ == 40) {
                                    if ((i10 & 32) != 32) {
                                        this.f24416j = new ArrayList();
                                        i10 |= 32;
                                    }
                                    this.f24416j.add(Integer.valueOf(eVar.r()));
                                } else if (iJ == 42) {
                                    int i12 = eVar.i(eVar.z());
                                    if ((i10 & 32) != 32 && eVar.e() > 0) {
                                        this.f24416j = new ArrayList();
                                        i10 |= 32;
                                    }
                                    while (eVar.e() > 0) {
                                        this.f24416j.add(Integer.valueOf(eVar.r()));
                                    }
                                    eVar.h(i12);
                                } else if (iJ != 50) {
                                    if (!y(eVar, codedOutputStreamI, fVar, iJ)) {
                                    }
                                } else {
                                    kotlin.reflect.jvm.internal.impl.protobuf.d dVarK = eVar.k();
                                    this.f24409c |= 4;
                                    this.f24412f = dVarK;
                                }
                            }
                            z10 = true;
                        } catch (InvalidProtocolBufferException e10) {
                            throw e10.n(this);
                        } catch (IOException e11) {
                            throw new InvalidProtocolBufferException(e11.getMessage()).n(this);
                        }
                    } catch (Throwable th2) {
                        if ((i10 & 16) == 16) {
                            this.f24414h = Collections.unmodifiableList(this.f24414h);
                        }
                        if ((i10 & 32) == 32) {
                            this.f24416j = Collections.unmodifiableList(this.f24416j);
                        }
                        try {
                            codedOutputStreamI.H();
                        } catch (IOException unused) {
                        } catch (Throwable th3) {
                            this.f24408b = bVarU.p();
                            throw th3;
                        }
                        this.f24408b = bVarU.p();
                        s();
                        throw th2;
                    }
                }
                if ((i10 & 16) == 16) {
                    this.f24414h = Collections.unmodifiableList(this.f24414h);
                }
                if ((i10 & 32) == 32) {
                    this.f24416j = Collections.unmodifiableList(this.f24416j);
                }
                try {
                    codedOutputStreamI.H();
                } catch (IOException unused2) {
                } catch (Throwable th4) {
                    this.f24408b = bVarU.p();
                    throw th4;
                }
                this.f24408b = bVarU.p();
                s();
            }
        }

        private e(h.b bVar) {
            super(bVar);
            this.f24400e = -1;
            this.f24401f = (byte) -1;
            this.f24402g = -1;
            this.f24397b = bVar.e();
        }

        private e(boolean z10) {
            this.f24400e = -1;
            this.f24401f = (byte) -1;
            this.f24402g = -1;
            this.f24397b = kotlin.reflect.jvm.internal.impl.protobuf.d.f51945a;
        }

        private e(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, f fVar) {
            this.f24400e = -1;
            this.f24401f = (byte) -1;
            this.f24402g = -1;
            d0();
            d.b bVarU = kotlin.reflect.jvm.internal.impl.protobuf.d.u();
            CodedOutputStream codedOutputStreamI = CodedOutputStream.I(bVarU, 1);
            boolean z10 = false;
            int i10 = 0;
            while (!z10) {
                try {
                    try {
                        int iJ = eVar.J();
                        if (iJ != 0) {
                            if (iJ == 10) {
                                if ((i10 & 1) != 1) {
                                    this.f24398c = new ArrayList();
                                    i10 |= 1;
                                }
                                this.f24398c.add(eVar.t(c.f24407o, fVar));
                            } else if (iJ == 40) {
                                if ((i10 & 2) != 2) {
                                    this.f24399d = new ArrayList();
                                    i10 |= 2;
                                }
                                this.f24399d.add(Integer.valueOf(eVar.r()));
                            } else if (iJ != 42) {
                                if (!y(eVar, codedOutputStreamI, fVar, iJ)) {
                                }
                            } else {
                                int i11 = eVar.i(eVar.z());
                                if ((i10 & 2) != 2 && eVar.e() > 0) {
                                    this.f24399d = new ArrayList();
                                    i10 |= 2;
                                }
                                while (eVar.e() > 0) {
                                    this.f24399d.add(Integer.valueOf(eVar.r()));
                                }
                                eVar.h(i11);
                            }
                        }
                        z10 = true;
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.n(this);
                    } catch (IOException e11) {
                        throw new InvalidProtocolBufferException(e11.getMessage()).n(this);
                    }
                } catch (Throwable th2) {
                    if ((i10 & 1) == 1) {
                        this.f24398c = Collections.unmodifiableList(this.f24398c);
                    }
                    if ((i10 & 2) == 2) {
                        this.f24399d = Collections.unmodifiableList(this.f24399d);
                    }
                    try {
                        codedOutputStreamI.H();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f24397b = bVarU.p();
                        throw th3;
                    }
                    this.f24397b = bVarU.p();
                    s();
                    throw th2;
                }
            }
            if ((i10 & 1) == 1) {
                this.f24398c = Collections.unmodifiableList(this.f24398c);
            }
            if ((i10 & 2) == 2) {
                this.f24399d = Collections.unmodifiableList(this.f24399d);
            }
            try {
                codedOutputStreamI.H();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f24397b = bVarU.p();
                throw th4;
            }
            this.f24397b = bVarU.p();
            s();
        }
    }

    static {
        Uh.d dVarN0 = Uh.d.N0();
        c cVarK = c.K();
        c cVarK2 = c.K();
        v.b bVar = v.b.MESSAGE;
        f24342a = h.v(dVarN0, cVarK, cVarK2, null, 100, bVar, c.class);
        f24343b = h.v(Uh.i.k1(), c.K(), c.K(), null, 100, bVar, c.class);
        Uh.i iVarK1 = Uh.i.k1();
        v.b bVar2 = v.b.INT32;
        f24344c = h.v(iVarK1, 0, null, null, 101, bVar2, Integer.class);
        f24345d = h.v(Uh.n.i1(), d.T(), d.T(), null, 100, bVar, d.class);
        f24346e = h.v(Uh.n.i1(), 0, null, null, 101, bVar2, Integer.class);
        f24347f = h.t(q.h1(), Uh.b.d0(), null, 100, bVar, false, Uh.b.class);
        f24348g = h.v(q.h1(), Boolean.FALSE, null, null, 101, v.b.BOOL, Boolean.class);
        f24349h = h.t(s.U0(), Uh.b.d0(), null, 100, bVar, false, Uh.b.class);
        f24350i = h.v(Uh.c.I1(), 0, null, null, 101, bVar2, Integer.class);
        f24351j = h.t(Uh.c.I1(), Uh.n.i1(), null, 102, bVar, false, Uh.n.class);
        f24352k = h.v(Uh.c.I1(), 0, null, null, 103, bVar2, Integer.class);
        f24353l = h.v(Uh.c.I1(), 0, null, null, 104, bVar2, Integer.class);
        f24354m = h.v(l.U0(), 0, null, null, 101, bVar2, Integer.class);
        f24355n = h.t(l.U0(), Uh.n.i1(), null, 102, bVar, false, Uh.n.class);
    }

    public static void a(f fVar) {
        fVar.a(f24342a);
        fVar.a(f24343b);
        fVar.a(f24344c);
        fVar.a(f24345d);
        fVar.a(f24346e);
        fVar.a(f24347f);
        fVar.a(f24348g);
        fVar.a(f24349h);
        fVar.a(f24350i);
        fVar.a(f24351j);
        fVar.a(f24352k);
        fVar.a(f24353l);
        fVar.a(f24354m);
        fVar.a(f24355n);
    }

    public static final class b extends h implements o {

        /* renamed from: h, reason: collision with root package name */
        private static final b f24356h;

        /* renamed from: i, reason: collision with root package name */
        public static p f24357i = new C0926a();

        /* renamed from: b, reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.protobuf.d f24358b;

        /* renamed from: c, reason: collision with root package name */
        private int f24359c;

        /* renamed from: d, reason: collision with root package name */
        private int f24360d;

        /* renamed from: e, reason: collision with root package name */
        private int f24361e;

        /* renamed from: f, reason: collision with root package name */
        private byte f24362f;

        /* renamed from: g, reason: collision with root package name */
        private int f24363g;

        /* renamed from: Xh.a$b$a, reason: collision with other inner class name */
        static class C0926a extends kotlin.reflect.jvm.internal.impl.protobuf.b {
            C0926a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public b b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, f fVar) {
                return new b(eVar, fVar);
            }
        }

        /* renamed from: Xh.a$b$b, reason: collision with other inner class name */
        public static final class C0927b extends h.b implements o {

            /* renamed from: b, reason: collision with root package name */
            private int f24364b;

            /* renamed from: c, reason: collision with root package name */
            private int f24365c;

            /* renamed from: d, reason: collision with root package name */
            private int f24366d;

            private C0927b() {
                t();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static C0927b r() {
                return new C0927b();
            }

            private void t() {
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
                int i10 = this.f24364b;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                bVar.f24360d = this.f24365c;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                bVar.f24361e = this.f24366d;
                bVar.f24359c = i11;
                return bVar;
            }

            /* renamed from: q, reason: merged with bridge method [inline-methods] */
            public C0927b clone() {
                return r().f(p());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: u, reason: merged with bridge method [inline-methods] */
            public C0927b f(b bVar) {
                if (bVar == b.K()) {
                    return this;
                }
                if (bVar.d0()) {
                    z(bVar.S());
                }
                if (bVar.T()) {
                    x(bVar.P());
                }
                i(e().e(bVar.f24358b));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.n.a
            /* renamed from: w, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public Xh.a.b.C0927b b0(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.p r1 = Xh.a.b.f24357i     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    Xh.a$b r3 = (Xh.a.b) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                    Xh.a$b r4 = (Xh.a.b) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: Xh.a.b.C0927b.b0(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):Xh.a$b$b");
            }

            public C0927b x(int i10) {
                this.f24364b |= 2;
                this.f24366d = i10;
                return this;
            }

            public C0927b z(int i10) {
                this.f24364b |= 1;
                this.f24365c = i10;
                return this;
            }
        }

        static {
            b bVar = new b(true);
            f24356h = bVar;
            bVar.f0();
        }

        public static C0927b C0(b bVar) {
            return q0().f(bVar);
        }

        public static b K() {
            return f24356h;
        }

        private void f0() {
            this.f24360d = 0;
            this.f24361e = 0;
        }

        public static C0927b q0() {
            return C0927b.r();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        /* renamed from: E0, reason: merged with bridge method [inline-methods] */
        public C0927b h() {
            return q0();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        /* renamed from: G0, reason: merged with bridge method [inline-methods] */
        public C0927b l() {
            return C0(this);
        }

        public int P() {
            return this.f24361e;
        }

        public int S() {
            return this.f24360d;
        }

        public boolean T() {
            return (this.f24359c & 2) == 2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public int d() {
            int i10 = this.f24363g;
            if (i10 != -1) {
                return i10;
            }
            int iO = (this.f24359c & 1) == 1 ? CodedOutputStream.o(1, this.f24360d) : 0;
            if ((this.f24359c & 2) == 2) {
                iO += CodedOutputStream.o(2, this.f24361e);
            }
            int size = iO + this.f24358b.size();
            this.f24363g = size;
            return size;
        }

        public boolean d0() {
            return (this.f24359c & 1) == 1;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final boolean m() {
            byte b10 = this.f24362f;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f24362f = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public void n(CodedOutputStream codedOutputStream) throws IOException {
            d();
            if ((this.f24359c & 1) == 1) {
                codedOutputStream.Z(1, this.f24360d);
            }
            if ((this.f24359c & 2) == 2) {
                codedOutputStream.Z(2, this.f24361e);
            }
            codedOutputStream.h0(this.f24358b);
        }

        private b(h.b bVar) {
            super(bVar);
            this.f24362f = (byte) -1;
            this.f24363g = -1;
            this.f24358b = bVar.e();
        }

        private b(boolean z10) {
            this.f24362f = (byte) -1;
            this.f24363g = -1;
            this.f24358b = kotlin.reflect.jvm.internal.impl.protobuf.d.f51945a;
        }

        private b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, f fVar) {
            this.f24362f = (byte) -1;
            this.f24363g = -1;
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
                                this.f24359c |= 1;
                                this.f24360d = eVar.r();
                            } else if (iJ != 16) {
                                if (!y(eVar, codedOutputStreamI, fVar, iJ)) {
                                }
                            } else {
                                this.f24359c |= 2;
                                this.f24361e = eVar.r();
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
                        this.f24358b = bVarU.p();
                        throw th3;
                    }
                    this.f24358b = bVarU.p();
                    s();
                    throw th2;
                }
            }
            try {
                codedOutputStreamI.H();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f24358b = bVarU.p();
                throw th4;
            }
            this.f24358b = bVarU.p();
            s();
        }
    }

    public static final class c extends h implements o {

        /* renamed from: h, reason: collision with root package name */
        private static final c f24367h;

        /* renamed from: i, reason: collision with root package name */
        public static p f24368i = new C0928a();

        /* renamed from: b, reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.protobuf.d f24369b;

        /* renamed from: c, reason: collision with root package name */
        private int f24370c;

        /* renamed from: d, reason: collision with root package name */
        private int f24371d;

        /* renamed from: e, reason: collision with root package name */
        private int f24372e;

        /* renamed from: f, reason: collision with root package name */
        private byte f24373f;

        /* renamed from: g, reason: collision with root package name */
        private int f24374g;

        /* renamed from: Xh.a$c$a, reason: collision with other inner class name */
        static class C0928a extends kotlin.reflect.jvm.internal.impl.protobuf.b {
            C0928a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public c b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, f fVar) {
                return new c(eVar, fVar);
            }
        }

        public static final class b extends h.b implements o {

            /* renamed from: b, reason: collision with root package name */
            private int f24375b;

            /* renamed from: c, reason: collision with root package name */
            private int f24376c;

            /* renamed from: d, reason: collision with root package name */
            private int f24377d;

            private b() {
                t();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static b r() {
                return new b();
            }

            private void t() {
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
                int i10 = this.f24375b;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                cVar.f24371d = this.f24376c;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                cVar.f24372e = this.f24377d;
                cVar.f24370c = i11;
                return cVar;
            }

            /* renamed from: q, reason: merged with bridge method [inline-methods] */
            public b clone() {
                return r().f(p());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: u, reason: merged with bridge method [inline-methods] */
            public b f(c cVar) {
                if (cVar == c.K()) {
                    return this;
                }
                if (cVar.d0()) {
                    z(cVar.S());
                }
                if (cVar.T()) {
                    x(cVar.P());
                }
                i(e().e(cVar.f24369b));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.n.a
            /* renamed from: w, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public Xh.a.c.b b0(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.p r1 = Xh.a.c.f24368i     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    Xh.a$c r3 = (Xh.a.c) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                    Xh.a$c r4 = (Xh.a.c) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: Xh.a.c.b.b0(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):Xh.a$c$b");
            }

            public b x(int i10) {
                this.f24375b |= 2;
                this.f24377d = i10;
                return this;
            }

            public b z(int i10) {
                this.f24375b |= 1;
                this.f24376c = i10;
                return this;
            }
        }

        static {
            c cVar = new c(true);
            f24367h = cVar;
            cVar.f0();
        }

        public static b C0(c cVar) {
            return q0().f(cVar);
        }

        public static c K() {
            return f24367h;
        }

        private void f0() {
            this.f24371d = 0;
            this.f24372e = 0;
        }

        public static b q0() {
            return b.r();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        /* renamed from: E0, reason: merged with bridge method [inline-methods] */
        public b h() {
            return q0();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        /* renamed from: G0, reason: merged with bridge method [inline-methods] */
        public b l() {
            return C0(this);
        }

        public int P() {
            return this.f24372e;
        }

        public int S() {
            return this.f24371d;
        }

        public boolean T() {
            return (this.f24370c & 2) == 2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public int d() {
            int i10 = this.f24374g;
            if (i10 != -1) {
                return i10;
            }
            int iO = (this.f24370c & 1) == 1 ? CodedOutputStream.o(1, this.f24371d) : 0;
            if ((this.f24370c & 2) == 2) {
                iO += CodedOutputStream.o(2, this.f24372e);
            }
            int size = iO + this.f24369b.size();
            this.f24374g = size;
            return size;
        }

        public boolean d0() {
            return (this.f24370c & 1) == 1;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final boolean m() {
            byte b10 = this.f24373f;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f24373f = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public void n(CodedOutputStream codedOutputStream) throws IOException {
            d();
            if ((this.f24370c & 1) == 1) {
                codedOutputStream.Z(1, this.f24371d);
            }
            if ((this.f24370c & 2) == 2) {
                codedOutputStream.Z(2, this.f24372e);
            }
            codedOutputStream.h0(this.f24369b);
        }

        private c(h.b bVar) {
            super(bVar);
            this.f24373f = (byte) -1;
            this.f24374g = -1;
            this.f24369b = bVar.e();
        }

        private c(boolean z10) {
            this.f24373f = (byte) -1;
            this.f24374g = -1;
            this.f24369b = kotlin.reflect.jvm.internal.impl.protobuf.d.f51945a;
        }

        private c(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, f fVar) {
            this.f24373f = (byte) -1;
            this.f24374g = -1;
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
                                this.f24370c |= 1;
                                this.f24371d = eVar.r();
                            } else if (iJ != 16) {
                                if (!y(eVar, codedOutputStreamI, fVar, iJ)) {
                                }
                            } else {
                                this.f24370c |= 2;
                                this.f24372e = eVar.r();
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
                        this.f24369b = bVarU.p();
                        throw th3;
                    }
                    this.f24369b = bVarU.p();
                    s();
                    throw th2;
                }
            }
            try {
                codedOutputStreamI.H();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f24369b = bVarU.p();
                throw th4;
            }
            this.f24369b = bVarU.p();
            s();
        }
    }

    public static final class d extends h implements o {

        /* renamed from: k, reason: collision with root package name */
        private static final d f24378k;

        /* renamed from: l, reason: collision with root package name */
        public static p f24379l = new C0929a();

        /* renamed from: b, reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.protobuf.d f24380b;

        /* renamed from: c, reason: collision with root package name */
        private int f24381c;

        /* renamed from: d, reason: collision with root package name */
        private b f24382d;

        /* renamed from: e, reason: collision with root package name */
        private c f24383e;

        /* renamed from: f, reason: collision with root package name */
        private c f24384f;

        /* renamed from: g, reason: collision with root package name */
        private c f24385g;

        /* renamed from: h, reason: collision with root package name */
        private c f24386h;

        /* renamed from: i, reason: collision with root package name */
        private byte f24387i;

        /* renamed from: j, reason: collision with root package name */
        private int f24388j;

        /* renamed from: Xh.a$d$a, reason: collision with other inner class name */
        static class C0929a extends kotlin.reflect.jvm.internal.impl.protobuf.b {
            C0929a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public d b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, f fVar) {
                return new d(eVar, fVar);
            }
        }

        public static final class b extends h.b implements o {

            /* renamed from: b, reason: collision with root package name */
            private int f24389b;

            /* renamed from: c, reason: collision with root package name */
            private b f24390c = b.K();

            /* renamed from: d, reason: collision with root package name */
            private c f24391d = c.K();

            /* renamed from: e, reason: collision with root package name */
            private c f24392e = c.K();

            /* renamed from: f, reason: collision with root package name */
            private c f24393f = c.K();

            /* renamed from: g, reason: collision with root package name */
            private c f24394g = c.K();

            private b() {
                t();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static b r() {
                return new b();
            }

            private void t() {
            }

            public b A(c cVar) {
                if ((this.f24389b & 4) != 4 || this.f24392e == c.K()) {
                    this.f24392e = cVar;
                } else {
                    this.f24392e = c.C0(this.f24392e).f(cVar).p();
                }
                this.f24389b |= 4;
                return this;
            }

            public b B(c cVar) {
                if ((this.f24389b & 8) != 8 || this.f24393f == c.K()) {
                    this.f24393f = cVar;
                } else {
                    this.f24393f = c.C0(this.f24393f).f(cVar).p();
                }
                this.f24389b |= 8;
                return this;
            }

            public b D(c cVar) {
                if ((this.f24389b & 2) != 2 || this.f24391d == c.K()) {
                    this.f24391d = cVar;
                } else {
                    this.f24391d = c.C0(this.f24391d).f(cVar).p();
                }
                this.f24389b |= 2;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.n.a
            /* renamed from: o, reason: merged with bridge method [inline-methods] */
            public d a() {
                d dVarP = p();
                if (dVarP.m()) {
                    return dVarP;
                }
                throw a.AbstractC1921a.b(dVarP);
            }

            public d p() {
                d dVar = new d(this);
                int i10 = this.f24389b;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                dVar.f24382d = this.f24390c;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                dVar.f24383e = this.f24391d;
                if ((i10 & 4) == 4) {
                    i11 |= 4;
                }
                dVar.f24384f = this.f24392e;
                if ((i10 & 8) == 8) {
                    i11 |= 8;
                }
                dVar.f24385g = this.f24393f;
                if ((i10 & 16) == 16) {
                    i11 |= 16;
                }
                dVar.f24386h = this.f24394g;
                dVar.f24381c = i11;
                return dVar;
            }

            /* renamed from: q, reason: merged with bridge method [inline-methods] */
            public b clone() {
                return r().f(p());
            }

            public b u(c cVar) {
                if ((this.f24389b & 16) != 16 || this.f24394g == c.K()) {
                    this.f24394g = cVar;
                } else {
                    this.f24394g = c.C0(this.f24394g).f(cVar).p();
                }
                this.f24389b |= 16;
                return this;
            }

            public b w(b bVar) {
                if ((this.f24389b & 1) != 1 || this.f24390c == b.K()) {
                    this.f24390c = bVar;
                } else {
                    this.f24390c = b.C0(this.f24390c).f(bVar).p();
                }
                this.f24389b |= 1;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: x, reason: merged with bridge method [inline-methods] */
            public b f(d dVar) {
                if (dVar == d.T()) {
                    return this;
                }
                if (dVar.K0()) {
                    w(dVar.f0());
                }
                if (dVar.P0()) {
                    D(dVar.E0());
                }
                if (dVar.M0()) {
                    A(dVar.q0());
                }
                if (dVar.N0()) {
                    B(dVar.C0());
                }
                if (dVar.G0()) {
                    u(dVar.d0());
                }
                i(e().e(dVar.f24380b));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.n.a
            /* renamed from: z, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public Xh.a.d.b b0(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.p r1 = Xh.a.d.f24379l     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    Xh.a$d r3 = (Xh.a.d) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                    Xh.a$d r4 = (Xh.a.d) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: Xh.a.d.b.b0(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):Xh.a$d$b");
            }
        }

        static {
            d dVar = new d(true);
            f24378k = dVar;
            dVar.T0();
        }

        public static d T() {
            return f24378k;
        }

        private void T0() {
            this.f24382d = b.K();
            this.f24383e = c.K();
            this.f24384f = c.K();
            this.f24385g = c.K();
            this.f24386h = c.K();
        }

        public static b U0() {
            return b.r();
        }

        public static b V0(d dVar) {
            return U0().f(dVar);
        }

        public c C0() {
            return this.f24385g;
        }

        public c E0() {
            return this.f24383e;
        }

        public boolean G0() {
            return (this.f24381c & 16) == 16;
        }

        public boolean K0() {
            return (this.f24381c & 1) == 1;
        }

        public boolean M0() {
            return (this.f24381c & 4) == 4;
        }

        public boolean N0() {
            return (this.f24381c & 8) == 8;
        }

        public boolean P0() {
            return (this.f24381c & 2) == 2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        /* renamed from: W0, reason: merged with bridge method [inline-methods] */
        public b h() {
            return U0();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        /* renamed from: X0, reason: merged with bridge method [inline-methods] */
        public b l() {
            return V0(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public int d() {
            int i10 = this.f24388j;
            if (i10 != -1) {
                return i10;
            }
            int iR = (this.f24381c & 1) == 1 ? CodedOutputStream.r(1, this.f24382d) : 0;
            if ((this.f24381c & 2) == 2) {
                iR += CodedOutputStream.r(2, this.f24383e);
            }
            if ((this.f24381c & 4) == 4) {
                iR += CodedOutputStream.r(3, this.f24384f);
            }
            if ((this.f24381c & 8) == 8) {
                iR += CodedOutputStream.r(4, this.f24385g);
            }
            if ((this.f24381c & 16) == 16) {
                iR += CodedOutputStream.r(5, this.f24386h);
            }
            int size = iR + this.f24380b.size();
            this.f24388j = size;
            return size;
        }

        public c d0() {
            return this.f24386h;
        }

        public b f0() {
            return this.f24382d;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final boolean m() {
            byte b10 = this.f24387i;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f24387i = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public void n(CodedOutputStream codedOutputStream) throws IOException {
            d();
            if ((this.f24381c & 1) == 1) {
                codedOutputStream.c0(1, this.f24382d);
            }
            if ((this.f24381c & 2) == 2) {
                codedOutputStream.c0(2, this.f24383e);
            }
            if ((this.f24381c & 4) == 4) {
                codedOutputStream.c0(3, this.f24384f);
            }
            if ((this.f24381c & 8) == 8) {
                codedOutputStream.c0(4, this.f24385g);
            }
            if ((this.f24381c & 16) == 16) {
                codedOutputStream.c0(5, this.f24386h);
            }
            codedOutputStream.h0(this.f24380b);
        }

        public c q0() {
            return this.f24384f;
        }

        private d(h.b bVar) {
            super(bVar);
            this.f24387i = (byte) -1;
            this.f24388j = -1;
            this.f24380b = bVar.e();
        }

        private d(boolean z10) {
            this.f24387i = (byte) -1;
            this.f24388j = -1;
            this.f24380b = kotlin.reflect.jvm.internal.impl.protobuf.d.f51945a;
        }

        private d(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, f fVar) {
            this.f24387i = (byte) -1;
            this.f24388j = -1;
            T0();
            d.b bVarU = kotlin.reflect.jvm.internal.impl.protobuf.d.u();
            CodedOutputStream codedOutputStreamI = CodedOutputStream.I(bVarU, 1);
            boolean z10 = false;
            while (!z10) {
                try {
                    try {
                        int iJ = eVar.J();
                        if (iJ != 0) {
                            if (iJ == 10) {
                                b.C0927b c0927bL = (this.f24381c & 1) == 1 ? this.f24382d.l() : null;
                                b bVar = (b) eVar.t(b.f24357i, fVar);
                                this.f24382d = bVar;
                                if (c0927bL != null) {
                                    c0927bL.f(bVar);
                                    this.f24382d = c0927bL.p();
                                }
                                this.f24381c |= 1;
                            } else if (iJ == 18) {
                                c.b bVarL = (this.f24381c & 2) == 2 ? this.f24383e.l() : null;
                                c cVar = (c) eVar.t(c.f24368i, fVar);
                                this.f24383e = cVar;
                                if (bVarL != null) {
                                    bVarL.f(cVar);
                                    this.f24383e = bVarL.p();
                                }
                                this.f24381c |= 2;
                            } else if (iJ == 26) {
                                c.b bVarL2 = (this.f24381c & 4) == 4 ? this.f24384f.l() : null;
                                c cVar2 = (c) eVar.t(c.f24368i, fVar);
                                this.f24384f = cVar2;
                                if (bVarL2 != null) {
                                    bVarL2.f(cVar2);
                                    this.f24384f = bVarL2.p();
                                }
                                this.f24381c |= 4;
                            } else if (iJ == 34) {
                                c.b bVarL3 = (this.f24381c & 8) == 8 ? this.f24385g.l() : null;
                                c cVar3 = (c) eVar.t(c.f24368i, fVar);
                                this.f24385g = cVar3;
                                if (bVarL3 != null) {
                                    bVarL3.f(cVar3);
                                    this.f24385g = bVarL3.p();
                                }
                                this.f24381c |= 8;
                            } else if (iJ != 42) {
                                if (!y(eVar, codedOutputStreamI, fVar, iJ)) {
                                }
                            } else {
                                c.b bVarL4 = (this.f24381c & 16) == 16 ? this.f24386h.l() : null;
                                c cVar4 = (c) eVar.t(c.f24368i, fVar);
                                this.f24386h = cVar4;
                                if (bVarL4 != null) {
                                    bVarL4.f(cVar4);
                                    this.f24386h = bVarL4.p();
                                }
                                this.f24381c |= 16;
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
                        this.f24380b = bVarU.p();
                        throw th3;
                    }
                    this.f24380b = bVarU.p();
                    s();
                    throw th2;
                }
            }
            try {
                codedOutputStreamI.H();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f24380b = bVarU.p();
                throw th4;
            }
            this.f24380b = bVarU.p();
            s();
        }
    }
}
