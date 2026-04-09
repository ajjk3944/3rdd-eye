package Uh;

import Uh.t;
import Uh.w;
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
public final class l extends h.d implements kotlin.reflect.jvm.internal.impl.protobuf.o {

    /* renamed from: l, reason: collision with root package name */
    private static final l f22686l;

    /* renamed from: m, reason: collision with root package name */
    public static kotlin.reflect.jvm.internal.impl.protobuf.p f22687m = new a();

    /* renamed from: c, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.protobuf.d f22688c;

    /* renamed from: d, reason: collision with root package name */
    private int f22689d;

    /* renamed from: e, reason: collision with root package name */
    private List f22690e;

    /* renamed from: f, reason: collision with root package name */
    private List f22691f;

    /* renamed from: g, reason: collision with root package name */
    private List f22692g;

    /* renamed from: h, reason: collision with root package name */
    private t f22693h;

    /* renamed from: i, reason: collision with root package name */
    private w f22694i;

    /* renamed from: j, reason: collision with root package name */
    private byte f22695j;

    /* renamed from: k, reason: collision with root package name */
    private int f22696k;

    static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public l b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
            return new l(eVar, fVar);
        }
    }

    public static final class b extends h.c implements kotlin.reflect.jvm.internal.impl.protobuf.o {

        /* renamed from: d, reason: collision with root package name */
        private int f22697d;

        /* renamed from: e, reason: collision with root package name */
        private List f22698e = Collections.emptyList();

        /* renamed from: f, reason: collision with root package name */
        private List f22699f = Collections.emptyList();

        /* renamed from: g, reason: collision with root package name */
        private List f22700g = Collections.emptyList();

        /* renamed from: h, reason: collision with root package name */
        private t f22701h = t.P();

        /* renamed from: i, reason: collision with root package name */
        private w f22702i = w.J();

        private b() {
            D();
        }

        private void A() {
            if ((this.f22697d & 2) != 2) {
                this.f22699f = new ArrayList(this.f22699f);
                this.f22697d |= 2;
            }
        }

        private void B() {
            if ((this.f22697d & 4) != 4) {
                this.f22700g = new ArrayList(this.f22700g);
                this.f22697d |= 4;
            }
        }

        private void D() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b x() {
            return new b();
        }

        private void z() {
            if ((this.f22697d & 1) != 1) {
                this.f22698e = new ArrayList(this.f22698e);
                this.f22697d |= 1;
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: E, reason: merged with bridge method [inline-methods] */
        public b f(l lVar) {
            if (lVar == l.U0()) {
                return this;
            }
            if (!lVar.f22690e.isEmpty()) {
                if (this.f22698e.isEmpty()) {
                    this.f22698e = lVar.f22690e;
                    this.f22697d &= -2;
                } else {
                    z();
                    this.f22698e.addAll(lVar.f22690e);
                }
            }
            if (!lVar.f22691f.isEmpty()) {
                if (this.f22699f.isEmpty()) {
                    this.f22699f = lVar.f22691f;
                    this.f22697d &= -3;
                } else {
                    A();
                    this.f22699f.addAll(lVar.f22691f);
                }
            }
            if (!lVar.f22692g.isEmpty()) {
                if (this.f22700g.isEmpty()) {
                    this.f22700g = lVar.f22692g;
                    this.f22697d &= -5;
                } else {
                    B();
                    this.f22700g.addAll(lVar.f22692g);
                }
            }
            if (lVar.h1()) {
                G(lVar.f1());
            }
            if (lVar.i1()) {
                H(lVar.g1());
            }
            q(lVar);
            i(e().e(lVar.f22688c));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n.a
        /* renamed from: F, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public Uh.l.b b0(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.p r1 = Uh.l.f22687m     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                Uh.l r3 = (Uh.l) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                Uh.l r4 = (Uh.l) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: Uh.l.b.b0(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):Uh.l$b");
        }

        public b G(t tVar) {
            if ((this.f22697d & 8) != 8 || this.f22701h == t.P()) {
                this.f22701h = tVar;
            } else {
                this.f22701h = t.G0(this.f22701h).f(tVar).p();
            }
            this.f22697d |= 8;
            return this;
        }

        public b H(w wVar) {
            if ((this.f22697d & 16) != 16 || this.f22702i == w.J()) {
                this.f22702i = wVar;
            } else {
                this.f22702i = w.d0(this.f22702i).f(wVar).p();
            }
            this.f22697d |= 16;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n.a
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public l a() {
            l lVarU = u();
            if (lVarU.m()) {
                return lVarU;
            }
            throw a.AbstractC1921a.b(lVarU);
        }

        public l u() {
            l lVar = new l(this);
            int i10 = this.f22697d;
            if ((i10 & 1) == 1) {
                this.f22698e = Collections.unmodifiableList(this.f22698e);
                this.f22697d &= -2;
            }
            lVar.f22690e = this.f22698e;
            if ((this.f22697d & 2) == 2) {
                this.f22699f = Collections.unmodifiableList(this.f22699f);
                this.f22697d &= -3;
            }
            lVar.f22691f = this.f22699f;
            if ((this.f22697d & 4) == 4) {
                this.f22700g = Collections.unmodifiableList(this.f22700g);
                this.f22697d &= -5;
            }
            lVar.f22692g = this.f22700g;
            int i11 = (i10 & 8) != 8 ? 0 : 1;
            lVar.f22693h = this.f22701h;
            if ((i10 & 16) == 16) {
                i11 |= 2;
            }
            lVar.f22694i = this.f22702i;
            lVar.f22689d = i11;
            return lVar;
        }

        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return x().f(u());
        }
    }

    static {
        l lVar = new l(true);
        f22686l = lVar;
        lVar.j1();
    }

    public static l U0() {
        return f22686l;
    }

    private void j1() {
        this.f22690e = Collections.emptyList();
        this.f22691f = Collections.emptyList();
        this.f22692g = Collections.emptyList();
        this.f22693h = t.P();
        this.f22694i = w.J();
    }

    public static b k1() {
        return b.x();
    }

    public static b l1(l lVar) {
        return k1().f(lVar);
    }

    public static l n1(InputStream inputStream, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
        return (l) f22687m.a(inputStream, fVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    /* renamed from: V0, reason: merged with bridge method [inline-methods] */
    public l c() {
        return f22686l;
    }

    public i W0(int i10) {
        return (i) this.f22690e.get(i10);
    }

    public int X0() {
        return this.f22690e.size();
    }

    public List Y0() {
        return this.f22690e;
    }

    public n Z0(int i10) {
        return (n) this.f22691f.get(i10);
    }

    public int a1() {
        return this.f22691f.size();
    }

    public List b1() {
        return this.f22691f;
    }

    public r c1(int i10) {
        return (r) this.f22692g.get(i10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
    public int d() {
        int i10 = this.f22696k;
        if (i10 != -1) {
            return i10;
        }
        int iR = 0;
        for (int i11 = 0; i11 < this.f22690e.size(); i11++) {
            iR += CodedOutputStream.r(3, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.f22690e.get(i11));
        }
        for (int i12 = 0; i12 < this.f22691f.size(); i12++) {
            iR += CodedOutputStream.r(4, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.f22691f.get(i12));
        }
        for (int i13 = 0; i13 < this.f22692g.size(); i13++) {
            iR += CodedOutputStream.r(5, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.f22692g.get(i13));
        }
        if ((this.f22689d & 1) == 1) {
            iR += CodedOutputStream.r(30, this.f22693h);
        }
        if ((this.f22689d & 2) == 2) {
            iR += CodedOutputStream.r(32, this.f22694i);
        }
        int iF = iR + F() + this.f22688c.size();
        this.f22696k = iF;
        return iF;
    }

    public int d1() {
        return this.f22692g.size();
    }

    public List e1() {
        return this.f22692g;
    }

    public t f1() {
        return this.f22693h;
    }

    public w g1() {
        return this.f22694i;
    }

    public boolean h1() {
        return (this.f22689d & 1) == 1;
    }

    public boolean i1() {
        return (this.f22689d & 2) == 2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public final boolean m() {
        byte b10 = this.f22695j;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < X0(); i10++) {
            if (!W0(i10).m()) {
                this.f22695j = (byte) 0;
                return false;
            }
        }
        for (int i11 = 0; i11 < a1(); i11++) {
            if (!Z0(i11).m()) {
                this.f22695j = (byte) 0;
                return false;
            }
        }
        for (int i12 = 0; i12 < d1(); i12++) {
            if (!c1(i12).m()) {
                this.f22695j = (byte) 0;
                return false;
            }
        }
        if (h1() && !f1().m()) {
            this.f22695j = (byte) 0;
            return false;
        }
        if (E()) {
            this.f22695j = (byte) 1;
            return true;
        }
        this.f22695j = (byte) 0;
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
    /* renamed from: m1, reason: merged with bridge method [inline-methods] */
    public b h() {
        return k1();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
    public void n(CodedOutputStream codedOutputStream) throws IOException {
        d();
        h.d.a aVarT = T();
        for (int i10 = 0; i10 < this.f22690e.size(); i10++) {
            codedOutputStream.c0(3, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.f22690e.get(i10));
        }
        for (int i11 = 0; i11 < this.f22691f.size(); i11++) {
            codedOutputStream.c0(4, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.f22691f.get(i11));
        }
        for (int i12 = 0; i12 < this.f22692g.size(); i12++) {
            codedOutputStream.c0(5, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.f22692g.get(i12));
        }
        if ((this.f22689d & 1) == 1) {
            codedOutputStream.c0(30, this.f22693h);
        }
        if ((this.f22689d & 2) == 2) {
            codedOutputStream.c0(32, this.f22694i);
        }
        aVarT.a(200, codedOutputStream);
        codedOutputStream.h0(this.f22688c);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
    /* renamed from: o1, reason: merged with bridge method [inline-methods] */
    public b l() {
        return l1(this);
    }

    private l(h.c cVar) {
        super(cVar);
        this.f22695j = (byte) -1;
        this.f22696k = -1;
        this.f22688c = cVar.e();
    }

    private l(boolean z10) {
        this.f22695j = (byte) -1;
        this.f22696k = -1;
        this.f22688c = kotlin.reflect.jvm.internal.impl.protobuf.d.f51945a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8 */
    private l(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
        this.f22695j = (byte) -1;
        this.f22696k = -1;
        j1();
        d.b bVarU = kotlin.reflect.jvm.internal.impl.protobuf.d.u();
        CodedOutputStream codedOutputStreamI = CodedOutputStream.I(bVarU, 1);
        boolean z10 = false;
        char c10 = 0;
        while (!z10) {
            try {
                try {
                    int iJ = eVar.J();
                    if (iJ != 0) {
                        if (iJ == 26) {
                            int i10 = (c10 == true ? 1 : 0) & 1;
                            c10 = c10;
                            if (i10 != 1) {
                                this.f22690e = new ArrayList();
                                c10 = (c10 == true ? 1 : 0) | 1;
                            }
                            this.f22690e.add(eVar.t(i.f22651w, fVar));
                        } else if (iJ == 34) {
                            int i11 = (c10 == true ? 1 : 0) & 2;
                            c10 = c10;
                            if (i11 != 2) {
                                this.f22691f = new ArrayList();
                                c10 = (c10 == true ? 1 : 0) | 2;
                            }
                            this.f22691f.add(eVar.t(n.f22719w, fVar));
                        } else if (iJ != 42) {
                            if (iJ == 242) {
                                t.b bVarM0 = (this.f22689d & 1) == 1 ? this.f22693h.l() : null;
                                t tVar = (t) eVar.t(t.f22877i, fVar);
                                this.f22693h = tVar;
                                if (bVarM0 != null) {
                                    bVarM0.f(tVar);
                                    this.f22693h = bVarM0.p();
                                }
                                this.f22689d |= 1;
                            } else if (iJ != 258) {
                                if (!y(eVar, codedOutputStreamI, fVar, iJ)) {
                                }
                            } else {
                                w.b bVarQ0 = (this.f22689d & 2) == 2 ? this.f22694i.l() : null;
                                w wVar = (w) eVar.t(w.f22926g, fVar);
                                this.f22694i = wVar;
                                if (bVarQ0 != null) {
                                    bVarQ0.f(wVar);
                                    this.f22694i = bVarQ0.p();
                                }
                                this.f22689d |= 2;
                            }
                        } else {
                            int i12 = (c10 == true ? 1 : 0) & 4;
                            c10 = c10;
                            if (i12 != 4) {
                                this.f22692g = new ArrayList();
                                c10 = (c10 == true ? 1 : 0) | 4;
                            }
                            this.f22692g.add(eVar.t(r.f22832q, fVar));
                        }
                    }
                    z10 = true;
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.n(this);
                } catch (IOException e11) {
                    throw new InvalidProtocolBufferException(e11.getMessage()).n(this);
                }
            } catch (Throwable th2) {
                if (((c10 == true ? 1 : 0) & 1) == 1) {
                    this.f22690e = Collections.unmodifiableList(this.f22690e);
                }
                if (((c10 == true ? 1 : 0) & 2) == 2) {
                    this.f22691f = Collections.unmodifiableList(this.f22691f);
                }
                if (((c10 == true ? 1 : 0) & 4) == 4) {
                    this.f22692g = Collections.unmodifiableList(this.f22692g);
                }
                try {
                    codedOutputStreamI.H();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f22688c = bVarU.p();
                    throw th3;
                }
                this.f22688c = bVarU.p();
                s();
                throw th2;
            }
        }
        if (((c10 == true ? 1 : 0) & 1) == 1) {
            this.f22690e = Collections.unmodifiableList(this.f22690e);
        }
        if (((c10 == true ? 1 : 0) & 2) == 2) {
            this.f22691f = Collections.unmodifiableList(this.f22691f);
        }
        if (((c10 == true ? 1 : 0) & 4) == 4) {
            this.f22692g = Collections.unmodifiableList(this.f22692g);
        }
        try {
            codedOutputStreamI.H();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f22688c = bVarU.p();
            throw th4;
        }
        this.f22688c = bVarU.p();
        s();
    }
}
