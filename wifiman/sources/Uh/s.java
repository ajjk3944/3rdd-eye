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

/* loaded from: classes4.dex */
public final class s extends h.d implements kotlin.reflect.jvm.internal.impl.protobuf.o {

    /* renamed from: n, reason: collision with root package name */
    private static final s f22856n;

    /* renamed from: o, reason: collision with root package name */
    public static kotlin.reflect.jvm.internal.impl.protobuf.p f22857o = new a();

    /* renamed from: c, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.protobuf.d f22858c;

    /* renamed from: d, reason: collision with root package name */
    private int f22859d;

    /* renamed from: e, reason: collision with root package name */
    private int f22860e;

    /* renamed from: f, reason: collision with root package name */
    private int f22861f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f22862g;

    /* renamed from: h, reason: collision with root package name */
    private c f22863h;

    /* renamed from: i, reason: collision with root package name */
    private List f22864i;

    /* renamed from: j, reason: collision with root package name */
    private List f22865j;

    /* renamed from: k, reason: collision with root package name */
    private int f22866k;

    /* renamed from: l, reason: collision with root package name */
    private byte f22867l;

    /* renamed from: m, reason: collision with root package name */
    private int f22868m;

    static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public s b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
            return new s(eVar, fVar);
        }
    }

    public static final class b extends h.c implements kotlin.reflect.jvm.internal.impl.protobuf.o {

        /* renamed from: d, reason: collision with root package name */
        private int f22869d;

        /* renamed from: e, reason: collision with root package name */
        private int f22870e;

        /* renamed from: f, reason: collision with root package name */
        private int f22871f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f22872g;

        /* renamed from: h, reason: collision with root package name */
        private c f22873h = c.INV;

        /* renamed from: i, reason: collision with root package name */
        private List f22874i = Collections.emptyList();

        /* renamed from: j, reason: collision with root package name */
        private List f22875j = Collections.emptyList();

        private b() {
            B();
        }

        private void A() {
            if ((this.f22869d & 16) != 16) {
                this.f22874i = new ArrayList(this.f22874i);
                this.f22869d |= 16;
            }
        }

        private void B() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b x() {
            return new b();
        }

        private void z() {
            if ((this.f22869d & 32) != 32) {
                this.f22875j = new ArrayList(this.f22875j);
                this.f22869d |= 32;
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: D, reason: merged with bridge method [inline-methods] */
        public b f(s sVar) {
            if (sVar == s.U0()) {
                return this;
            }
            if (sVar.e1()) {
                F(sVar.W0());
            }
            if (sVar.f1()) {
                G(sVar.X0());
            }
            if (sVar.g1()) {
                H(sVar.Y0());
            }
            if (sVar.h1()) {
                I(sVar.d1());
            }
            if (!sVar.f22864i.isEmpty()) {
                if (this.f22874i.isEmpty()) {
                    this.f22874i = sVar.f22864i;
                    this.f22869d &= -17;
                } else {
                    A();
                    this.f22874i.addAll(sVar.f22864i);
                }
            }
            if (!sVar.f22865j.isEmpty()) {
                if (this.f22875j.isEmpty()) {
                    this.f22875j = sVar.f22865j;
                    this.f22869d &= -33;
                } else {
                    z();
                    this.f22875j.addAll(sVar.f22865j);
                }
            }
            q(sVar);
            i(e().e(sVar.f22858c));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n.a
        /* renamed from: E, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public Uh.s.b b0(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.p r1 = Uh.s.f22857o     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                Uh.s r3 = (Uh.s) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                Uh.s r4 = (Uh.s) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: Uh.s.b.b0(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):Uh.s$b");
        }

        public b F(int i10) {
            this.f22869d |= 1;
            this.f22870e = i10;
            return this;
        }

        public b G(int i10) {
            this.f22869d |= 2;
            this.f22871f = i10;
            return this;
        }

        public b H(boolean z10) {
            this.f22869d |= 4;
            this.f22872g = z10;
            return this;
        }

        public b I(c cVar) {
            cVar.getClass();
            this.f22869d |= 8;
            this.f22873h = cVar;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n.a
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public s a() {
            s sVarU = u();
            if (sVarU.m()) {
                return sVarU;
            }
            throw a.AbstractC1921a.b(sVarU);
        }

        public s u() {
            s sVar = new s(this);
            int i10 = this.f22869d;
            int i11 = (i10 & 1) != 1 ? 0 : 1;
            sVar.f22860e = this.f22870e;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            sVar.f22861f = this.f22871f;
            if ((i10 & 4) == 4) {
                i11 |= 4;
            }
            sVar.f22862g = this.f22872g;
            if ((i10 & 8) == 8) {
                i11 |= 8;
            }
            sVar.f22863h = this.f22873h;
            if ((this.f22869d & 16) == 16) {
                this.f22874i = Collections.unmodifiableList(this.f22874i);
                this.f22869d &= -17;
            }
            sVar.f22864i = this.f22874i;
            if ((this.f22869d & 32) == 32) {
                this.f22875j = Collections.unmodifiableList(this.f22875j);
                this.f22869d &= -33;
            }
            sVar.f22865j = this.f22875j;
            sVar.f22859d = i11;
            return sVar;
        }

        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return x().f(u());
        }
    }

    public enum c implements i.a {
        IN(0, 0),
        OUT(1, 1),
        INV(2, 2);

        private static i.b internalValueMap = new a();
        private final int value;

        static class a implements i.b {
            a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.b
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public c a(int i10) {
                return c.valueOf(i10);
            }
        }

        c(int i10, int i11) {
            this.value = i11;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.a
        public final int getNumber() {
            return this.value;
        }

        public static c valueOf(int i10) {
            if (i10 == 0) {
                return IN;
            }
            if (i10 == 1) {
                return OUT;
            }
            if (i10 != 2) {
                return null;
            }
            return INV;
        }
    }

    static {
        s sVar = new s(true);
        f22856n = sVar;
        sVar.i1();
    }

    public static s U0() {
        return f22856n;
    }

    private void i1() {
        this.f22860e = 0;
        this.f22861f = 0;
        this.f22862g = false;
        this.f22863h = c.INV;
        this.f22864i = Collections.emptyList();
        this.f22865j = Collections.emptyList();
    }

    public static b j1() {
        return b.x();
    }

    public static b k1(s sVar) {
        return j1().f(sVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    /* renamed from: V0, reason: merged with bridge method [inline-methods] */
    public s c() {
        return f22856n;
    }

    public int W0() {
        return this.f22860e;
    }

    public int X0() {
        return this.f22861f;
    }

    public boolean Y0() {
        return this.f22862g;
    }

    public q Z0(int i10) {
        return (q) this.f22864i.get(i10);
    }

    public int a1() {
        return this.f22864i.size();
    }

    public List b1() {
        return this.f22865j;
    }

    public List c1() {
        return this.f22864i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
    public int d() {
        int i10 = this.f22868m;
        if (i10 != -1) {
            return i10;
        }
        int iO = (this.f22859d & 1) == 1 ? CodedOutputStream.o(1, this.f22860e) : 0;
        if ((this.f22859d & 2) == 2) {
            iO += CodedOutputStream.o(2, this.f22861f);
        }
        if ((this.f22859d & 4) == 4) {
            iO += CodedOutputStream.a(3, this.f22862g);
        }
        if ((this.f22859d & 8) == 8) {
            iO += CodedOutputStream.h(4, this.f22863h.getNumber());
        }
        for (int i11 = 0; i11 < this.f22864i.size(); i11++) {
            iO += CodedOutputStream.r(5, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.f22864i.get(i11));
        }
        int iP = 0;
        for (int i12 = 0; i12 < this.f22865j.size(); i12++) {
            iP += CodedOutputStream.p(((Integer) this.f22865j.get(i12)).intValue());
        }
        int iP2 = iO + iP;
        if (!b1().isEmpty()) {
            iP2 = iP2 + 1 + CodedOutputStream.p(iP);
        }
        this.f22866k = iP;
        int iF = iP2 + F() + this.f22858c.size();
        this.f22868m = iF;
        return iF;
    }

    public c d1() {
        return this.f22863h;
    }

    public boolean e1() {
        return (this.f22859d & 1) == 1;
    }

    public boolean f1() {
        return (this.f22859d & 2) == 2;
    }

    public boolean g1() {
        return (this.f22859d & 4) == 4;
    }

    public boolean h1() {
        return (this.f22859d & 8) == 8;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
    /* renamed from: l1, reason: merged with bridge method [inline-methods] */
    public b h() {
        return j1();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public final boolean m() {
        byte b10 = this.f22867l;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (!e1()) {
            this.f22867l = (byte) 0;
            return false;
        }
        if (!f1()) {
            this.f22867l = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < a1(); i10++) {
            if (!Z0(i10).m()) {
                this.f22867l = (byte) 0;
                return false;
            }
        }
        if (E()) {
            this.f22867l = (byte) 1;
            return true;
        }
        this.f22867l = (byte) 0;
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
    /* renamed from: m1, reason: merged with bridge method [inline-methods] */
    public b l() {
        return k1(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
    public void n(CodedOutputStream codedOutputStream) throws IOException {
        d();
        h.d.a aVarT = T();
        if ((this.f22859d & 1) == 1) {
            codedOutputStream.Z(1, this.f22860e);
        }
        if ((this.f22859d & 2) == 2) {
            codedOutputStream.Z(2, this.f22861f);
        }
        if ((this.f22859d & 4) == 4) {
            codedOutputStream.K(3, this.f22862g);
        }
        if ((this.f22859d & 8) == 8) {
            codedOutputStream.R(4, this.f22863h.getNumber());
        }
        for (int i10 = 0; i10 < this.f22864i.size(); i10++) {
            codedOutputStream.c0(5, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.f22864i.get(i10));
        }
        if (b1().size() > 0) {
            codedOutputStream.n0(50);
            codedOutputStream.n0(this.f22866k);
        }
        for (int i11 = 0; i11 < this.f22865j.size(); i11++) {
            codedOutputStream.a0(((Integer) this.f22865j.get(i11)).intValue());
        }
        aVarT.a(1000, codedOutputStream);
        codedOutputStream.h0(this.f22858c);
    }

    private s(h.c cVar) {
        super(cVar);
        this.f22866k = -1;
        this.f22867l = (byte) -1;
        this.f22868m = -1;
        this.f22858c = cVar.e();
    }

    private s(boolean z10) {
        this.f22866k = -1;
        this.f22867l = (byte) -1;
        this.f22868m = -1;
        this.f22858c = kotlin.reflect.jvm.internal.impl.protobuf.d.f51945a;
    }

    private s(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
        this.f22866k = -1;
        this.f22867l = (byte) -1;
        this.f22868m = -1;
        i1();
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
                            this.f22859d |= 1;
                            this.f22860e = eVar.r();
                        } else if (iJ == 16) {
                            this.f22859d |= 2;
                            this.f22861f = eVar.r();
                        } else if (iJ == 24) {
                            this.f22859d |= 4;
                            this.f22862g = eVar.j();
                        } else if (iJ == 32) {
                            int iM = eVar.m();
                            c cVarValueOf = c.valueOf(iM);
                            if (cVarValueOf == null) {
                                codedOutputStreamI.n0(iJ);
                                codedOutputStreamI.n0(iM);
                            } else {
                                this.f22859d |= 8;
                                this.f22863h = cVarValueOf;
                            }
                        } else if (iJ == 42) {
                            if ((i10 & 16) != 16) {
                                this.f22864i = new ArrayList();
                                i10 |= 16;
                            }
                            this.f22864i.add(eVar.t(q.f22784v, fVar));
                        } else if (iJ == 48) {
                            if ((i10 & 32) != 32) {
                                this.f22865j = new ArrayList();
                                i10 |= 32;
                            }
                            this.f22865j.add(Integer.valueOf(eVar.r()));
                        } else if (iJ != 50) {
                            if (!y(eVar, codedOutputStreamI, fVar, iJ)) {
                            }
                        } else {
                            int i11 = eVar.i(eVar.z());
                            if ((i10 & 32) != 32 && eVar.e() > 0) {
                                this.f22865j = new ArrayList();
                                i10 |= 32;
                            }
                            while (eVar.e() > 0) {
                                this.f22865j.add(Integer.valueOf(eVar.r()));
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
                if ((i10 & 16) == 16) {
                    this.f22864i = Collections.unmodifiableList(this.f22864i);
                }
                if ((i10 & 32) == 32) {
                    this.f22865j = Collections.unmodifiableList(this.f22865j);
                }
                try {
                    codedOutputStreamI.H();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f22858c = bVarU.p();
                    throw th3;
                }
                this.f22858c = bVarU.p();
                s();
                throw th2;
            }
        }
        if ((i10 & 16) == 16) {
            this.f22864i = Collections.unmodifiableList(this.f22864i);
        }
        if ((i10 & 32) == 32) {
            this.f22865j = Collections.unmodifiableList(this.f22865j);
        }
        try {
            codedOutputStreamI.H();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f22858c = bVarU.p();
            throw th4;
        }
        this.f22858c = bVarU.p();
        s();
    }
}
