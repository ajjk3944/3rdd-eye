package Uh;

import Uh.l;
import Uh.o;
import Uh.p;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.a;
import kotlin.reflect.jvm.internal.impl.protobuf.d;
import kotlin.reflect.jvm.internal.impl.protobuf.h;

/* loaded from: classes4.dex */
public final class m extends h.d implements kotlin.reflect.jvm.internal.impl.protobuf.o {

    /* renamed from: k, reason: collision with root package name */
    private static final m f22703k;

    /* renamed from: l, reason: collision with root package name */
    public static kotlin.reflect.jvm.internal.impl.protobuf.p f22704l = new a();

    /* renamed from: c, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.protobuf.d f22705c;

    /* renamed from: d, reason: collision with root package name */
    private int f22706d;

    /* renamed from: e, reason: collision with root package name */
    private p f22707e;

    /* renamed from: f, reason: collision with root package name */
    private o f22708f;

    /* renamed from: g, reason: collision with root package name */
    private l f22709g;

    /* renamed from: h, reason: collision with root package name */
    private List f22710h;

    /* renamed from: i, reason: collision with root package name */
    private byte f22711i;

    /* renamed from: j, reason: collision with root package name */
    private int f22712j;

    static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public m b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
            return new m(eVar, fVar);
        }
    }

    public static final class b extends h.c implements kotlin.reflect.jvm.internal.impl.protobuf.o {

        /* renamed from: d, reason: collision with root package name */
        private int f22713d;

        /* renamed from: e, reason: collision with root package name */
        private p f22714e = p.J();

        /* renamed from: f, reason: collision with root package name */
        private o f22715f = o.J();

        /* renamed from: g, reason: collision with root package name */
        private l f22716g = l.U0();

        /* renamed from: h, reason: collision with root package name */
        private List f22717h = Collections.emptyList();

        private b() {
            A();
        }

        private void A() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b x() {
            return new b();
        }

        private void z() {
            if ((this.f22713d & 8) != 8) {
                this.f22717h = new ArrayList(this.f22717h);
                this.f22713d |= 8;
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: B, reason: merged with bridge method [inline-methods] */
        public b f(m mVar) {
            if (mVar == m.U0()) {
                return this;
            }
            if (mVar.b1()) {
                G(mVar.Y0());
            }
            if (mVar.a1()) {
                F(mVar.X0());
            }
            if (mVar.Z0()) {
                E(mVar.W0());
            }
            if (!mVar.f22710h.isEmpty()) {
                if (this.f22717h.isEmpty()) {
                    this.f22717h = mVar.f22710h;
                    this.f22713d &= -9;
                } else {
                    z();
                    this.f22717h.addAll(mVar.f22710h);
                }
            }
            q(mVar);
            i(e().e(mVar.f22705c));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n.a
        /* renamed from: D, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public Uh.m.b b0(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.p r1 = Uh.m.f22704l     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                Uh.m r3 = (Uh.m) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                Uh.m r4 = (Uh.m) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: Uh.m.b.b0(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):Uh.m$b");
        }

        public b E(l lVar) {
            if ((this.f22713d & 4) != 4 || this.f22716g == l.U0()) {
                this.f22716g = lVar;
            } else {
                this.f22716g = l.l1(this.f22716g).f(lVar).u();
            }
            this.f22713d |= 4;
            return this;
        }

        public b F(o oVar) {
            if ((this.f22713d & 2) != 2 || this.f22715f == o.J()) {
                this.f22715f = oVar;
            } else {
                this.f22715f = o.d0(this.f22715f).f(oVar).p();
            }
            this.f22713d |= 2;
            return this;
        }

        public b G(p pVar) {
            if ((this.f22713d & 1) != 1 || this.f22714e == p.J()) {
                this.f22714e = pVar;
            } else {
                this.f22714e = p.d0(this.f22714e).f(pVar).p();
            }
            this.f22713d |= 1;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n.a
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public m a() {
            m mVarU = u();
            if (mVarU.m()) {
                return mVarU;
            }
            throw a.AbstractC1921a.b(mVarU);
        }

        public m u() {
            m mVar = new m(this);
            int i10 = this.f22713d;
            int i11 = (i10 & 1) != 1 ? 0 : 1;
            mVar.f22707e = this.f22714e;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            mVar.f22708f = this.f22715f;
            if ((i10 & 4) == 4) {
                i11 |= 4;
            }
            mVar.f22709g = this.f22716g;
            if ((this.f22713d & 8) == 8) {
                this.f22717h = Collections.unmodifiableList(this.f22717h);
                this.f22713d &= -9;
            }
            mVar.f22710h = this.f22717h;
            mVar.f22706d = i11;
            return mVar;
        }

        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return x().f(u());
        }
    }

    static {
        m mVar = new m(true);
        f22703k = mVar;
        mVar.c1();
    }

    public static m U0() {
        return f22703k;
    }

    private void c1() {
        this.f22707e = p.J();
        this.f22708f = o.J();
        this.f22709g = l.U0();
        this.f22710h = Collections.emptyList();
    }

    public static b d1() {
        return b.x();
    }

    public static b e1(m mVar) {
        return d1().f(mVar);
    }

    public static m g1(InputStream inputStream, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
        return (m) f22704l.a(inputStream, fVar);
    }

    public c N0(int i10) {
        return (c) this.f22710h.get(i10);
    }

    public int P0() {
        return this.f22710h.size();
    }

    public List T0() {
        return this.f22710h;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    /* renamed from: V0, reason: merged with bridge method [inline-methods] */
    public m c() {
        return f22703k;
    }

    public l W0() {
        return this.f22709g;
    }

    public o X0() {
        return this.f22708f;
    }

    public p Y0() {
        return this.f22707e;
    }

    public boolean Z0() {
        return (this.f22706d & 4) == 4;
    }

    public boolean a1() {
        return (this.f22706d & 2) == 2;
    }

    public boolean b1() {
        return (this.f22706d & 1) == 1;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
    public int d() {
        int i10 = this.f22712j;
        if (i10 != -1) {
            return i10;
        }
        int iR = (this.f22706d & 1) == 1 ? CodedOutputStream.r(1, this.f22707e) : 0;
        if ((this.f22706d & 2) == 2) {
            iR += CodedOutputStream.r(2, this.f22708f);
        }
        if ((this.f22706d & 4) == 4) {
            iR += CodedOutputStream.r(3, this.f22709g);
        }
        for (int i11 = 0; i11 < this.f22710h.size(); i11++) {
            iR += CodedOutputStream.r(4, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.f22710h.get(i11));
        }
        int iF = iR + F() + this.f22705c.size();
        this.f22712j = iF;
        return iF;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
    /* renamed from: f1, reason: merged with bridge method [inline-methods] */
    public b h() {
        return d1();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
    /* renamed from: h1, reason: merged with bridge method [inline-methods] */
    public b l() {
        return e1(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public final boolean m() {
        byte b10 = this.f22711i;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (a1() && !X0().m()) {
            this.f22711i = (byte) 0;
            return false;
        }
        if (Z0() && !W0().m()) {
            this.f22711i = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < P0(); i10++) {
            if (!N0(i10).m()) {
                this.f22711i = (byte) 0;
                return false;
            }
        }
        if (E()) {
            this.f22711i = (byte) 1;
            return true;
        }
        this.f22711i = (byte) 0;
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
    public void n(CodedOutputStream codedOutputStream) throws IOException {
        d();
        h.d.a aVarT = T();
        if ((this.f22706d & 1) == 1) {
            codedOutputStream.c0(1, this.f22707e);
        }
        if ((this.f22706d & 2) == 2) {
            codedOutputStream.c0(2, this.f22708f);
        }
        if ((this.f22706d & 4) == 4) {
            codedOutputStream.c0(3, this.f22709g);
        }
        for (int i10 = 0; i10 < this.f22710h.size(); i10++) {
            codedOutputStream.c0(4, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.f22710h.get(i10));
        }
        aVarT.a(200, codedOutputStream);
        codedOutputStream.h0(this.f22705c);
    }

    private m(h.c cVar) {
        super(cVar);
        this.f22711i = (byte) -1;
        this.f22712j = -1;
        this.f22705c = cVar.e();
    }

    private m(boolean z10) {
        this.f22711i = (byte) -1;
        this.f22712j = -1;
        this.f22705c = kotlin.reflect.jvm.internal.impl.protobuf.d.f51945a;
    }

    private m(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
        this.f22711i = (byte) -1;
        this.f22712j = -1;
        c1();
        d.b bVarU = kotlin.reflect.jvm.internal.impl.protobuf.d.u();
        CodedOutputStream codedOutputStreamI = CodedOutputStream.I(bVarU, 1);
        boolean z10 = false;
        char c10 = 0;
        while (!z10) {
            try {
                try {
                    int iJ = eVar.J();
                    if (iJ != 0) {
                        if (iJ == 10) {
                            p.b bVarQ0 = (this.f22706d & 1) == 1 ? this.f22707e.l() : null;
                            p pVar = (p) eVar.t(p.f22776g, fVar);
                            this.f22707e = pVar;
                            if (bVarQ0 != null) {
                                bVarQ0.f(pVar);
                                this.f22707e = bVarQ0.p();
                            }
                            this.f22706d |= 1;
                        } else if (iJ == 18) {
                            o.b bVarQ02 = (this.f22706d & 2) == 2 ? this.f22708f.l() : null;
                            o oVar = (o) eVar.t(o.f22755g, fVar);
                            this.f22708f = oVar;
                            if (bVarQ02 != null) {
                                bVarQ02.f(oVar);
                                this.f22708f = bVarQ02.p();
                            }
                            this.f22706d |= 2;
                        } else if (iJ == 26) {
                            l.b bVarL = (this.f22706d & 4) == 4 ? this.f22709g.l() : null;
                            l lVar = (l) eVar.t(l.f22687m, fVar);
                            this.f22709g = lVar;
                            if (bVarL != null) {
                                bVarL.f(lVar);
                                this.f22709g = bVarL.u();
                            }
                            this.f22706d |= 4;
                        } else if (iJ != 34) {
                            if (!y(eVar, codedOutputStreamI, fVar, iJ)) {
                            }
                        } else {
                            int i10 = (c10 == true ? 1 : 0) & '\b';
                            c10 = c10;
                            if (i10 != 8) {
                                this.f22710h = new ArrayList();
                                c10 = '\b';
                            }
                            this.f22710h.add(eVar.t(c.f22524X, fVar));
                        }
                    }
                    z10 = true;
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.n(this);
                } catch (IOException e11) {
                    throw new InvalidProtocolBufferException(e11.getMessage()).n(this);
                }
            } catch (Throwable th2) {
                if (((c10 == true ? 1 : 0) & '\b') == 8) {
                    this.f22710h = Collections.unmodifiableList(this.f22710h);
                }
                try {
                    codedOutputStreamI.H();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f22705c = bVarU.p();
                    throw th3;
                }
                this.f22705c = bVarU.p();
                s();
                throw th2;
            }
        }
        if (((c10 == true ? 1 : 0) & '\b') == 8) {
            this.f22710h = Collections.unmodifiableList(this.f22710h);
        }
        try {
            codedOutputStreamI.H();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f22705c = bVarU.p();
            throw th4;
        }
        this.f22705c = bVarU.p();
        s();
    }
}
