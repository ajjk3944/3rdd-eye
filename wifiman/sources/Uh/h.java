package Uh;

import Uh.q;
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
public final class h extends kotlin.reflect.jvm.internal.impl.protobuf.h implements kotlin.reflect.jvm.internal.impl.protobuf.o {

    /* renamed from: m, reason: collision with root package name */
    private static final h f22629m;

    /* renamed from: n, reason: collision with root package name */
    public static kotlin.reflect.jvm.internal.impl.protobuf.p f22630n = new a();

    /* renamed from: b, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.protobuf.d f22631b;

    /* renamed from: c, reason: collision with root package name */
    private int f22632c;

    /* renamed from: d, reason: collision with root package name */
    private int f22633d;

    /* renamed from: e, reason: collision with root package name */
    private int f22634e;

    /* renamed from: f, reason: collision with root package name */
    private c f22635f;

    /* renamed from: g, reason: collision with root package name */
    private q f22636g;

    /* renamed from: h, reason: collision with root package name */
    private int f22637h;

    /* renamed from: i, reason: collision with root package name */
    private List f22638i;

    /* renamed from: j, reason: collision with root package name */
    private List f22639j;

    /* renamed from: k, reason: collision with root package name */
    private byte f22640k;

    /* renamed from: l, reason: collision with root package name */
    private int f22641l;

    static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public h b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
            return new h(eVar, fVar);
        }
    }

    public static final class b extends h.b implements kotlin.reflect.jvm.internal.impl.protobuf.o {

        /* renamed from: b, reason: collision with root package name */
        private int f22642b;

        /* renamed from: c, reason: collision with root package name */
        private int f22643c;

        /* renamed from: d, reason: collision with root package name */
        private int f22644d;

        /* renamed from: g, reason: collision with root package name */
        private int f22647g;

        /* renamed from: e, reason: collision with root package name */
        private c f22645e = c.TRUE;

        /* renamed from: f, reason: collision with root package name */
        private q f22646f = q.h1();

        /* renamed from: h, reason: collision with root package name */
        private List f22648h = Collections.emptyList();

        /* renamed from: i, reason: collision with root package name */
        private List f22649i = Collections.emptyList();

        private b() {
            w();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b r() {
            return new b();
        }

        private void t() {
            if ((this.f22642b & 32) != 32) {
                this.f22648h = new ArrayList(this.f22648h);
                this.f22642b |= 32;
            }
        }

        private void u() {
            if ((this.f22642b & 64) != 64) {
                this.f22649i = new ArrayList(this.f22649i);
                this.f22642b |= 64;
            }
        }

        private void w() {
        }

        public b A(q qVar) {
            if ((this.f22642b & 8) != 8 || this.f22646f == q.h1()) {
                this.f22646f = qVar;
            } else {
                this.f22646f = q.I1(this.f22646f).f(qVar).u();
            }
            this.f22642b |= 8;
            return this;
        }

        public b B(c cVar) {
            cVar.getClass();
            this.f22642b |= 4;
            this.f22645e = cVar;
            return this;
        }

        public b D(int i10) {
            this.f22642b |= 1;
            this.f22643c = i10;
            return this;
        }

        public b E(int i10) {
            this.f22642b |= 16;
            this.f22647g = i10;
            return this;
        }

        public b F(int i10) {
            this.f22642b |= 2;
            this.f22644d = i10;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n.a
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public h a() {
            h hVarP = p();
            if (hVarP.m()) {
                return hVarP;
            }
            throw a.AbstractC1921a.b(hVarP);
        }

        public h p() {
            h hVar = new h(this);
            int i10 = this.f22642b;
            int i11 = (i10 & 1) != 1 ? 0 : 1;
            hVar.f22633d = this.f22643c;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            hVar.f22634e = this.f22644d;
            if ((i10 & 4) == 4) {
                i11 |= 4;
            }
            hVar.f22635f = this.f22645e;
            if ((i10 & 8) == 8) {
                i11 |= 8;
            }
            hVar.f22636g = this.f22646f;
            if ((i10 & 16) == 16) {
                i11 |= 16;
            }
            hVar.f22637h = this.f22647g;
            if ((this.f22642b & 32) == 32) {
                this.f22648h = Collections.unmodifiableList(this.f22648h);
                this.f22642b &= -33;
            }
            hVar.f22638i = this.f22648h;
            if ((this.f22642b & 64) == 64) {
                this.f22649i = Collections.unmodifiableList(this.f22649i);
                this.f22642b &= -65;
            }
            hVar.f22639j = this.f22649i;
            hVar.f22632c = i11;
            return hVar;
        }

        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return r().f(p());
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public b f(h hVar) {
            if (hVar == h.K0()) {
                return this;
            }
            if (hVar.X0()) {
                D(hVar.M0());
            }
            if (hVar.a1()) {
                F(hVar.V0());
            }
            if (hVar.W0()) {
                B(hVar.G0());
            }
            if (hVar.Y0()) {
                A(hVar.N0());
            }
            if (hVar.Z0()) {
                E(hVar.P0());
            }
            if (!hVar.f22638i.isEmpty()) {
                if (this.f22648h.isEmpty()) {
                    this.f22648h = hVar.f22638i;
                    this.f22642b &= -33;
                } else {
                    t();
                    this.f22648h.addAll(hVar.f22638i);
                }
            }
            if (!hVar.f22639j.isEmpty()) {
                if (this.f22649i.isEmpty()) {
                    this.f22649i = hVar.f22639j;
                    this.f22642b &= -65;
                } else {
                    u();
                    this.f22649i.addAll(hVar.f22639j);
                }
            }
            i(e().e(hVar.f22631b));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n.a
        /* renamed from: z, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public Uh.h.b b0(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.p r1 = Uh.h.f22630n     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                Uh.h r3 = (Uh.h) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                Uh.h r4 = (Uh.h) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: Uh.h.b.b0(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):Uh.h$b");
        }
    }

    public enum c implements i.a {
        TRUE(0, 0),
        FALSE(1, 1),
        NULL(2, 2);

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
                return TRUE;
            }
            if (i10 == 1) {
                return FALSE;
            }
            if (i10 != 2) {
                return null;
            }
            return NULL;
        }
    }

    static {
        h hVar = new h(true);
        f22629m = hVar;
        hVar.b1();
    }

    public static h K0() {
        return f22629m;
    }

    private void b1() {
        this.f22633d = 0;
        this.f22634e = 0;
        this.f22635f = c.TRUE;
        this.f22636g = q.h1();
        this.f22637h = 0;
        this.f22638i = Collections.emptyList();
        this.f22639j = Collections.emptyList();
    }

    public static b c1() {
        return b.r();
    }

    public static b d1(h hVar) {
        return c1().f(hVar);
    }

    public h C0(int i10) {
        return (h) this.f22638i.get(i10);
    }

    public int E0() {
        return this.f22638i.size();
    }

    public c G0() {
        return this.f22635f;
    }

    public int M0() {
        return this.f22633d;
    }

    public q N0() {
        return this.f22636g;
    }

    public int P0() {
        return this.f22637h;
    }

    public h T0(int i10) {
        return (h) this.f22639j.get(i10);
    }

    public int U0() {
        return this.f22639j.size();
    }

    public int V0() {
        return this.f22634e;
    }

    public boolean W0() {
        return (this.f22632c & 4) == 4;
    }

    public boolean X0() {
        return (this.f22632c & 1) == 1;
    }

    public boolean Y0() {
        return (this.f22632c & 8) == 8;
    }

    public boolean Z0() {
        return (this.f22632c & 16) == 16;
    }

    public boolean a1() {
        return (this.f22632c & 2) == 2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
    public int d() {
        int i10 = this.f22641l;
        if (i10 != -1) {
            return i10;
        }
        int iO = (this.f22632c & 1) == 1 ? CodedOutputStream.o(1, this.f22633d) : 0;
        if ((this.f22632c & 2) == 2) {
            iO += CodedOutputStream.o(2, this.f22634e);
        }
        if ((this.f22632c & 4) == 4) {
            iO += CodedOutputStream.h(3, this.f22635f.getNumber());
        }
        if ((this.f22632c & 8) == 8) {
            iO += CodedOutputStream.r(4, this.f22636g);
        }
        if ((this.f22632c & 16) == 16) {
            iO += CodedOutputStream.o(5, this.f22637h);
        }
        for (int i11 = 0; i11 < this.f22638i.size(); i11++) {
            iO += CodedOutputStream.r(6, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.f22638i.get(i11));
        }
        for (int i12 = 0; i12 < this.f22639j.size(); i12++) {
            iO += CodedOutputStream.r(7, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.f22639j.get(i12));
        }
        int size = iO + this.f22631b.size();
        this.f22641l = size;
        return size;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
    /* renamed from: e1, reason: merged with bridge method [inline-methods] */
    public b h() {
        return c1();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
    /* renamed from: f1, reason: merged with bridge method [inline-methods] */
    public b l() {
        return d1(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public final boolean m() {
        byte b10 = this.f22640k;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (Y0() && !N0().m()) {
            this.f22640k = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < E0(); i10++) {
            if (!C0(i10).m()) {
                this.f22640k = (byte) 0;
                return false;
            }
        }
        for (int i11 = 0; i11 < U0(); i11++) {
            if (!T0(i11).m()) {
                this.f22640k = (byte) 0;
                return false;
            }
        }
        this.f22640k = (byte) 1;
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
    public void n(CodedOutputStream codedOutputStream) throws IOException {
        d();
        if ((this.f22632c & 1) == 1) {
            codedOutputStream.Z(1, this.f22633d);
        }
        if ((this.f22632c & 2) == 2) {
            codedOutputStream.Z(2, this.f22634e);
        }
        if ((this.f22632c & 4) == 4) {
            codedOutputStream.R(3, this.f22635f.getNumber());
        }
        if ((this.f22632c & 8) == 8) {
            codedOutputStream.c0(4, this.f22636g);
        }
        if ((this.f22632c & 16) == 16) {
            codedOutputStream.Z(5, this.f22637h);
        }
        for (int i10 = 0; i10 < this.f22638i.size(); i10++) {
            codedOutputStream.c0(6, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.f22638i.get(i10));
        }
        for (int i11 = 0; i11 < this.f22639j.size(); i11++) {
            codedOutputStream.c0(7, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.f22639j.get(i11));
        }
        codedOutputStream.h0(this.f22631b);
    }

    private h(h.b bVar) {
        super(bVar);
        this.f22640k = (byte) -1;
        this.f22641l = -1;
        this.f22631b = bVar.e();
    }

    private h(boolean z10) {
        this.f22640k = (byte) -1;
        this.f22641l = -1;
        this.f22631b = kotlin.reflect.jvm.internal.impl.protobuf.d.f51945a;
    }

    private h(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
        this.f22640k = (byte) -1;
        this.f22641l = -1;
        b1();
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
                            this.f22632c |= 1;
                            this.f22633d = eVar.r();
                        } else if (iJ == 16) {
                            this.f22632c |= 2;
                            this.f22634e = eVar.r();
                        } else if (iJ == 24) {
                            int iM = eVar.m();
                            c cVarValueOf = c.valueOf(iM);
                            if (cVarValueOf == null) {
                                codedOutputStreamI.n0(iJ);
                                codedOutputStreamI.n0(iM);
                            } else {
                                this.f22632c |= 4;
                                this.f22635f = cVarValueOf;
                            }
                        } else if (iJ == 34) {
                            q.c cVarL = (this.f22632c & 8) == 8 ? this.f22636g.l() : null;
                            q qVar = (q) eVar.t(q.f22784v, fVar);
                            this.f22636g = qVar;
                            if (cVarL != null) {
                                cVarL.f(qVar);
                                this.f22636g = cVarL.u();
                            }
                            this.f22632c |= 8;
                        } else if (iJ == 40) {
                            this.f22632c |= 16;
                            this.f22637h = eVar.r();
                        } else if (iJ == 50) {
                            if ((i10 & 32) != 32) {
                                this.f22638i = new ArrayList();
                                i10 |= 32;
                            }
                            this.f22638i.add(eVar.t(f22630n, fVar));
                        } else if (iJ != 58) {
                            if (!y(eVar, codedOutputStreamI, fVar, iJ)) {
                            }
                        } else {
                            if ((i10 & 64) != 64) {
                                this.f22639j = new ArrayList();
                                i10 |= 64;
                            }
                            this.f22639j.add(eVar.t(f22630n, fVar));
                        }
                    }
                    z10 = true;
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.n(this);
                } catch (IOException e11) {
                    throw new InvalidProtocolBufferException(e11.getMessage()).n(this);
                }
            } catch (Throwable th2) {
                if ((i10 & 32) == 32) {
                    this.f22638i = Collections.unmodifiableList(this.f22638i);
                }
                if ((i10 & 64) == 64) {
                    this.f22639j = Collections.unmodifiableList(this.f22639j);
                }
                try {
                    codedOutputStreamI.H();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f22631b = bVarU.p();
                    throw th3;
                }
                this.f22631b = bVarU.p();
                s();
                throw th2;
            }
        }
        if ((i10 & 32) == 32) {
            this.f22638i = Collections.unmodifiableList(this.f22638i);
        }
        if ((i10 & 64) == 64) {
            this.f22639j = Collections.unmodifiableList(this.f22639j);
        }
        try {
            codedOutputStreamI.H();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f22631b = bVarU.p();
            throw th4;
        }
        this.f22631b = bVarU.p();
        s();
    }
}
