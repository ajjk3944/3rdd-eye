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

/* loaded from: classes4.dex */
public final class d extends h.d implements kotlin.reflect.jvm.internal.impl.protobuf.o {

    /* renamed from: j, reason: collision with root package name */
    private static final d f22584j;

    /* renamed from: k, reason: collision with root package name */
    public static kotlin.reflect.jvm.internal.impl.protobuf.p f22585k = new a();

    /* renamed from: c, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.protobuf.d f22586c;

    /* renamed from: d, reason: collision with root package name */
    private int f22587d;

    /* renamed from: e, reason: collision with root package name */
    private int f22588e;

    /* renamed from: f, reason: collision with root package name */
    private List f22589f;

    /* renamed from: g, reason: collision with root package name */
    private List f22590g;

    /* renamed from: h, reason: collision with root package name */
    private byte f22591h;

    /* renamed from: i, reason: collision with root package name */
    private int f22592i;

    static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public d b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
            return new d(eVar, fVar);
        }
    }

    public static final class b extends h.c implements kotlin.reflect.jvm.internal.impl.protobuf.o {

        /* renamed from: d, reason: collision with root package name */
        private int f22593d;

        /* renamed from: e, reason: collision with root package name */
        private int f22594e = 6;

        /* renamed from: f, reason: collision with root package name */
        private List f22595f = Collections.emptyList();

        /* renamed from: g, reason: collision with root package name */
        private List f22596g = Collections.emptyList();

        private b() {
            B();
        }

        private void A() {
            if ((this.f22593d & 4) != 4) {
                this.f22596g = new ArrayList(this.f22596g);
                this.f22593d |= 4;
            }
        }

        private void B() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b x() {
            return new b();
        }

        private void z() {
            if ((this.f22593d & 2) != 2) {
                this.f22595f = new ArrayList(this.f22595f);
                this.f22593d |= 2;
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: D, reason: merged with bridge method [inline-methods] */
        public b f(d dVar) {
            if (dVar == d.N0()) {
                return this;
            }
            if (dVar.Y0()) {
                F(dVar.T0());
            }
            if (!dVar.f22589f.isEmpty()) {
                if (this.f22595f.isEmpty()) {
                    this.f22595f = dVar.f22589f;
                    this.f22593d &= -3;
                } else {
                    z();
                    this.f22595f.addAll(dVar.f22589f);
                }
            }
            if (!dVar.f22590g.isEmpty()) {
                if (this.f22596g.isEmpty()) {
                    this.f22596g = dVar.f22590g;
                    this.f22593d &= -5;
                } else {
                    A();
                    this.f22596g.addAll(dVar.f22590g);
                }
            }
            q(dVar);
            i(e().e(dVar.f22586c));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n.a
        /* renamed from: E, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public Uh.d.b b0(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.p r1 = Uh.d.f22585k     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                Uh.d r3 = (Uh.d) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                Uh.d r4 = (Uh.d) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: Uh.d.b.b0(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):Uh.d$b");
        }

        public b F(int i10) {
            this.f22593d |= 1;
            this.f22594e = i10;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n.a
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public d a() {
            d dVarU = u();
            if (dVarU.m()) {
                return dVarU;
            }
            throw a.AbstractC1921a.b(dVarU);
        }

        public d u() {
            d dVar = new d(this);
            int i10 = (this.f22593d & 1) != 1 ? 0 : 1;
            dVar.f22588e = this.f22594e;
            if ((this.f22593d & 2) == 2) {
                this.f22595f = Collections.unmodifiableList(this.f22595f);
                this.f22593d &= -3;
            }
            dVar.f22589f = this.f22595f;
            if ((this.f22593d & 4) == 4) {
                this.f22596g = Collections.unmodifiableList(this.f22596g);
                this.f22593d &= -5;
            }
            dVar.f22590g = this.f22596g;
            dVar.f22587d = i10;
            return dVar;
        }

        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return x().f(u());
        }
    }

    static {
        d dVar = new d(true);
        f22584j = dVar;
        dVar.Z0();
    }

    public static d N0() {
        return f22584j;
    }

    private void Z0() {
        this.f22588e = 6;
        this.f22589f = Collections.emptyList();
        this.f22590g = Collections.emptyList();
    }

    public static b a1() {
        return b.x();
    }

    public static b b1(d dVar) {
        return a1().f(dVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    /* renamed from: P0, reason: merged with bridge method [inline-methods] */
    public d c() {
        return f22584j;
    }

    public int T0() {
        return this.f22588e;
    }

    public u U0(int i10) {
        return (u) this.f22589f.get(i10);
    }

    public int V0() {
        return this.f22589f.size();
    }

    public List W0() {
        return this.f22589f;
    }

    public List X0() {
        return this.f22590g;
    }

    public boolean Y0() {
        return (this.f22587d & 1) == 1;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
    /* renamed from: c1, reason: merged with bridge method [inline-methods] */
    public b h() {
        return a1();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
    public int d() {
        int i10 = this.f22592i;
        if (i10 != -1) {
            return i10;
        }
        int iO = (this.f22587d & 1) == 1 ? CodedOutputStream.o(1, this.f22588e) : 0;
        for (int i11 = 0; i11 < this.f22589f.size(); i11++) {
            iO += CodedOutputStream.r(2, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.f22589f.get(i11));
        }
        int iP = 0;
        for (int i12 = 0; i12 < this.f22590g.size(); i12++) {
            iP += CodedOutputStream.p(((Integer) this.f22590g.get(i12)).intValue());
        }
        int size = iO + iP + (X0().size() * 2) + F() + this.f22586c.size();
        this.f22592i = size;
        return size;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
    /* renamed from: d1, reason: merged with bridge method [inline-methods] */
    public b l() {
        return b1(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public final boolean m() {
        byte b10 = this.f22591h;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < V0(); i10++) {
            if (!U0(i10).m()) {
                this.f22591h = (byte) 0;
                return false;
            }
        }
        if (E()) {
            this.f22591h = (byte) 1;
            return true;
        }
        this.f22591h = (byte) 0;
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
    public void n(CodedOutputStream codedOutputStream) throws IOException {
        d();
        h.d.a aVarT = T();
        if ((this.f22587d & 1) == 1) {
            codedOutputStream.Z(1, this.f22588e);
        }
        for (int i10 = 0; i10 < this.f22589f.size(); i10++) {
            codedOutputStream.c0(2, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.f22589f.get(i10));
        }
        for (int i11 = 0; i11 < this.f22590g.size(); i11++) {
            codedOutputStream.Z(31, ((Integer) this.f22590g.get(i11)).intValue());
        }
        aVarT.a(19000, codedOutputStream);
        codedOutputStream.h0(this.f22586c);
    }

    private d(h.c cVar) {
        super(cVar);
        this.f22591h = (byte) -1;
        this.f22592i = -1;
        this.f22586c = cVar.e();
    }

    private d(boolean z10) {
        this.f22591h = (byte) -1;
        this.f22592i = -1;
        this.f22586c = kotlin.reflect.jvm.internal.impl.protobuf.d.f51945a;
    }

    private d(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
        this.f22591h = (byte) -1;
        this.f22592i = -1;
        Z0();
        d.b bVarU = kotlin.reflect.jvm.internal.impl.protobuf.d.u();
        CodedOutputStream codedOutputStreamI = CodedOutputStream.I(bVarU, 1);
        boolean z10 = false;
        int i10 = 0;
        while (!z10) {
            try {
                try {
                    try {
                        int iJ = eVar.J();
                        if (iJ != 0) {
                            if (iJ == 8) {
                                this.f22587d |= 1;
                                this.f22588e = eVar.r();
                            } else if (iJ == 18) {
                                if ((i10 & 2) != 2) {
                                    this.f22589f = new ArrayList();
                                    i10 |= 2;
                                }
                                this.f22589f.add(eVar.t(u.f22888n, fVar));
                            } else if (iJ == 248) {
                                if ((i10 & 4) != 4) {
                                    this.f22590g = new ArrayList();
                                    i10 |= 4;
                                }
                                this.f22590g.add(Integer.valueOf(eVar.r()));
                            } else if (iJ != 250) {
                                if (!y(eVar, codedOutputStreamI, fVar, iJ)) {
                                }
                            } else {
                                int i11 = eVar.i(eVar.z());
                                if ((i10 & 4) != 4 && eVar.e() > 0) {
                                    this.f22590g = new ArrayList();
                                    i10 |= 4;
                                }
                                while (eVar.e() > 0) {
                                    this.f22590g.add(Integer.valueOf(eVar.r()));
                                }
                                eVar.h(i11);
                            }
                        }
                        z10 = true;
                    } catch (IOException e10) {
                        throw new InvalidProtocolBufferException(e10.getMessage()).n(this);
                    }
                } catch (InvalidProtocolBufferException e11) {
                    throw e11.n(this);
                }
            } catch (Throwable th2) {
                if ((i10 & 2) == 2) {
                    this.f22589f = Collections.unmodifiableList(this.f22589f);
                }
                if ((i10 & 4) == 4) {
                    this.f22590g = Collections.unmodifiableList(this.f22590g);
                }
                try {
                    codedOutputStreamI.H();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f22586c = bVarU.p();
                    throw th3;
                }
                this.f22586c = bVarU.p();
                s();
                throw th2;
            }
        }
        if ((i10 & 2) == 2) {
            this.f22589f = Collections.unmodifiableList(this.f22589f);
        }
        if ((i10 & 4) == 4) {
            this.f22590g = Collections.unmodifiableList(this.f22590g);
        }
        try {
            codedOutputStreamI.H();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f22586c = bVarU.p();
            throw th4;
        }
        this.f22586c = bVarU.p();
        s();
    }
}
