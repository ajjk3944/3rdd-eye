package Uh;

import Uh.q;
import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.a;
import kotlin.reflect.jvm.internal.impl.protobuf.d;
import kotlin.reflect.jvm.internal.impl.protobuf.h;

/* loaded from: classes4.dex */
public final class u extends h.d implements kotlin.reflect.jvm.internal.impl.protobuf.o {

    /* renamed from: m, reason: collision with root package name */
    private static final u f22887m;

    /* renamed from: n, reason: collision with root package name */
    public static kotlin.reflect.jvm.internal.impl.protobuf.p f22888n = new a();

    /* renamed from: c, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.protobuf.d f22889c;

    /* renamed from: d, reason: collision with root package name */
    private int f22890d;

    /* renamed from: e, reason: collision with root package name */
    private int f22891e;

    /* renamed from: f, reason: collision with root package name */
    private int f22892f;

    /* renamed from: g, reason: collision with root package name */
    private q f22893g;

    /* renamed from: h, reason: collision with root package name */
    private int f22894h;

    /* renamed from: i, reason: collision with root package name */
    private q f22895i;

    /* renamed from: j, reason: collision with root package name */
    private int f22896j;

    /* renamed from: k, reason: collision with root package name */
    private byte f22897k;

    /* renamed from: l, reason: collision with root package name */
    private int f22898l;

    static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public u b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
            return new u(eVar, fVar);
        }
    }

    public static final class b extends h.c implements kotlin.reflect.jvm.internal.impl.protobuf.o {

        /* renamed from: d, reason: collision with root package name */
        private int f22899d;

        /* renamed from: e, reason: collision with root package name */
        private int f22900e;

        /* renamed from: f, reason: collision with root package name */
        private int f22901f;

        /* renamed from: h, reason: collision with root package name */
        private int f22903h;

        /* renamed from: j, reason: collision with root package name */
        private int f22905j;

        /* renamed from: g, reason: collision with root package name */
        private q f22902g = q.h1();

        /* renamed from: i, reason: collision with root package name */
        private q f22904i = q.h1();

        private b() {
            z();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b x() {
            return new b();
        }

        private void z() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: A, reason: merged with bridge method [inline-methods] */
        public b f(u uVar) {
            if (uVar == u.P0()) {
                return this;
            }
            if (uVar.a1()) {
                F(uVar.U0());
            }
            if (uVar.b1()) {
                G(uVar.V0());
            }
            if (uVar.c1()) {
                D(uVar.W0());
            }
            if (uVar.d1()) {
                H(uVar.X0());
            }
            if (uVar.e1()) {
                E(uVar.Y0());
            }
            if (uVar.f1()) {
                I(uVar.Z0());
            }
            q(uVar);
            i(e().e(uVar.f22889c));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n.a
        /* renamed from: B, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public Uh.u.b b0(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.p r1 = Uh.u.f22888n     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                Uh.u r3 = (Uh.u) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                Uh.u r4 = (Uh.u) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: Uh.u.b.b0(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):Uh.u$b");
        }

        public b D(q qVar) {
            if ((this.f22899d & 4) != 4 || this.f22902g == q.h1()) {
                this.f22902g = qVar;
            } else {
                this.f22902g = q.I1(this.f22902g).f(qVar).u();
            }
            this.f22899d |= 4;
            return this;
        }

        public b E(q qVar) {
            if ((this.f22899d & 16) != 16 || this.f22904i == q.h1()) {
                this.f22904i = qVar;
            } else {
                this.f22904i = q.I1(this.f22904i).f(qVar).u();
            }
            this.f22899d |= 16;
            return this;
        }

        public b F(int i10) {
            this.f22899d |= 1;
            this.f22900e = i10;
            return this;
        }

        public b G(int i10) {
            this.f22899d |= 2;
            this.f22901f = i10;
            return this;
        }

        public b H(int i10) {
            this.f22899d |= 8;
            this.f22903h = i10;
            return this;
        }

        public b I(int i10) {
            this.f22899d |= 32;
            this.f22905j = i10;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n.a
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public u a() {
            u uVarU = u();
            if (uVarU.m()) {
                return uVarU;
            }
            throw a.AbstractC1921a.b(uVarU);
        }

        public u u() {
            u uVar = new u(this);
            int i10 = this.f22899d;
            int i11 = (i10 & 1) != 1 ? 0 : 1;
            uVar.f22891e = this.f22900e;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            uVar.f22892f = this.f22901f;
            if ((i10 & 4) == 4) {
                i11 |= 4;
            }
            uVar.f22893g = this.f22902g;
            if ((i10 & 8) == 8) {
                i11 |= 8;
            }
            uVar.f22894h = this.f22903h;
            if ((i10 & 16) == 16) {
                i11 |= 16;
            }
            uVar.f22895i = this.f22904i;
            if ((i10 & 32) == 32) {
                i11 |= 32;
            }
            uVar.f22896j = this.f22905j;
            uVar.f22890d = i11;
            return uVar;
        }

        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return x().f(u());
        }
    }

    static {
        u uVar = new u(true);
        f22887m = uVar;
        uVar.g1();
    }

    public static u P0() {
        return f22887m;
    }

    private void g1() {
        this.f22891e = 0;
        this.f22892f = 0;
        this.f22893g = q.h1();
        this.f22894h = 0;
        this.f22895i = q.h1();
        this.f22896j = 0;
    }

    public static b h1() {
        return b.x();
    }

    public static b i1(u uVar) {
        return h1().f(uVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    /* renamed from: T0, reason: merged with bridge method [inline-methods] */
    public u c() {
        return f22887m;
    }

    public int U0() {
        return this.f22891e;
    }

    public int V0() {
        return this.f22892f;
    }

    public q W0() {
        return this.f22893g;
    }

    public int X0() {
        return this.f22894h;
    }

    public q Y0() {
        return this.f22895i;
    }

    public int Z0() {
        return this.f22896j;
    }

    public boolean a1() {
        return (this.f22890d & 1) == 1;
    }

    public boolean b1() {
        return (this.f22890d & 2) == 2;
    }

    public boolean c1() {
        return (this.f22890d & 4) == 4;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
    public int d() {
        int i10 = this.f22898l;
        if (i10 != -1) {
            return i10;
        }
        int iO = (this.f22890d & 1) == 1 ? CodedOutputStream.o(1, this.f22891e) : 0;
        if ((this.f22890d & 2) == 2) {
            iO += CodedOutputStream.o(2, this.f22892f);
        }
        if ((this.f22890d & 4) == 4) {
            iO += CodedOutputStream.r(3, this.f22893g);
        }
        if ((this.f22890d & 16) == 16) {
            iO += CodedOutputStream.r(4, this.f22895i);
        }
        if ((this.f22890d & 8) == 8) {
            iO += CodedOutputStream.o(5, this.f22894h);
        }
        if ((this.f22890d & 32) == 32) {
            iO += CodedOutputStream.o(6, this.f22896j);
        }
        int iF = iO + F() + this.f22889c.size();
        this.f22898l = iF;
        return iF;
    }

    public boolean d1() {
        return (this.f22890d & 8) == 8;
    }

    public boolean e1() {
        return (this.f22890d & 16) == 16;
    }

    public boolean f1() {
        return (this.f22890d & 32) == 32;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
    /* renamed from: j1, reason: merged with bridge method [inline-methods] */
    public b h() {
        return h1();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
    /* renamed from: k1, reason: merged with bridge method [inline-methods] */
    public b l() {
        return i1(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public final boolean m() {
        byte b10 = this.f22897k;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (!b1()) {
            this.f22897k = (byte) 0;
            return false;
        }
        if (c1() && !W0().m()) {
            this.f22897k = (byte) 0;
            return false;
        }
        if (e1() && !Y0().m()) {
            this.f22897k = (byte) 0;
            return false;
        }
        if (E()) {
            this.f22897k = (byte) 1;
            return true;
        }
        this.f22897k = (byte) 0;
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
    public void n(CodedOutputStream codedOutputStream) throws IOException {
        d();
        h.d.a aVarT = T();
        if ((this.f22890d & 1) == 1) {
            codedOutputStream.Z(1, this.f22891e);
        }
        if ((this.f22890d & 2) == 2) {
            codedOutputStream.Z(2, this.f22892f);
        }
        if ((this.f22890d & 4) == 4) {
            codedOutputStream.c0(3, this.f22893g);
        }
        if ((this.f22890d & 16) == 16) {
            codedOutputStream.c0(4, this.f22895i);
        }
        if ((this.f22890d & 8) == 8) {
            codedOutputStream.Z(5, this.f22894h);
        }
        if ((this.f22890d & 32) == 32) {
            codedOutputStream.Z(6, this.f22896j);
        }
        aVarT.a(200, codedOutputStream);
        codedOutputStream.h0(this.f22889c);
    }

    private u(h.c cVar) {
        super(cVar);
        this.f22897k = (byte) -1;
        this.f22898l = -1;
        this.f22889c = cVar.e();
    }

    private u(boolean z10) {
        this.f22897k = (byte) -1;
        this.f22898l = -1;
        this.f22889c = kotlin.reflect.jvm.internal.impl.protobuf.d.f51945a;
    }

    private u(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
        q.c cVarL;
        this.f22897k = (byte) -1;
        this.f22898l = -1;
        g1();
        d.b bVarU = kotlin.reflect.jvm.internal.impl.protobuf.d.u();
        CodedOutputStream codedOutputStreamI = CodedOutputStream.I(bVarU, 1);
        boolean z10 = false;
        while (!z10) {
            try {
                try {
                    int iJ = eVar.J();
                    if (iJ != 0) {
                        if (iJ == 8) {
                            this.f22890d |= 1;
                            this.f22891e = eVar.r();
                        } else if (iJ != 16) {
                            if (iJ == 26) {
                                cVarL = (this.f22890d & 4) == 4 ? this.f22893g.l() : null;
                                q qVar = (q) eVar.t(q.f22784v, fVar);
                                this.f22893g = qVar;
                                if (cVarL != null) {
                                    cVarL.f(qVar);
                                    this.f22893g = cVarL.u();
                                }
                                this.f22890d |= 4;
                            } else if (iJ == 34) {
                                cVarL = (this.f22890d & 16) == 16 ? this.f22895i.l() : null;
                                q qVar2 = (q) eVar.t(q.f22784v, fVar);
                                this.f22895i = qVar2;
                                if (cVarL != null) {
                                    cVarL.f(qVar2);
                                    this.f22895i = cVarL.u();
                                }
                                this.f22890d |= 16;
                            } else if (iJ == 40) {
                                this.f22890d |= 8;
                                this.f22894h = eVar.r();
                            } else if (iJ != 48) {
                                if (!y(eVar, codedOutputStreamI, fVar, iJ)) {
                                }
                            } else {
                                this.f22890d |= 32;
                                this.f22896j = eVar.r();
                            }
                        } else {
                            this.f22890d |= 2;
                            this.f22892f = eVar.r();
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
                    this.f22889c = bVarU.p();
                    throw th3;
                }
                this.f22889c = bVarU.p();
                s();
                throw th2;
            }
        }
        try {
            codedOutputStreamI.H();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f22889c = bVarU.p();
            throw th4;
        }
        this.f22889c = bVarU.p();
        s();
    }
}
