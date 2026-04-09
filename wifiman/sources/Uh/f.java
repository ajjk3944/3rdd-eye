package Uh;

import Uh.h;
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
public final class f extends kotlin.reflect.jvm.internal.impl.protobuf.h implements kotlin.reflect.jvm.internal.impl.protobuf.o {

    /* renamed from: j, reason: collision with root package name */
    private static final f f22605j;

    /* renamed from: k, reason: collision with root package name */
    public static kotlin.reflect.jvm.internal.impl.protobuf.p f22606k = new a();

    /* renamed from: b, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.protobuf.d f22607b;

    /* renamed from: c, reason: collision with root package name */
    private int f22608c;

    /* renamed from: d, reason: collision with root package name */
    private c f22609d;

    /* renamed from: e, reason: collision with root package name */
    private List f22610e;

    /* renamed from: f, reason: collision with root package name */
    private h f22611f;

    /* renamed from: g, reason: collision with root package name */
    private d f22612g;

    /* renamed from: h, reason: collision with root package name */
    private byte f22613h;

    /* renamed from: i, reason: collision with root package name */
    private int f22614i;

    static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public f b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
            return new f(eVar, fVar);
        }
    }

    public static final class b extends h.b implements kotlin.reflect.jvm.internal.impl.protobuf.o {

        /* renamed from: b, reason: collision with root package name */
        private int f22615b;

        /* renamed from: c, reason: collision with root package name */
        private c f22616c = c.RETURNS_CONSTANT;

        /* renamed from: d, reason: collision with root package name */
        private List f22617d = Collections.emptyList();

        /* renamed from: e, reason: collision with root package name */
        private h f22618e = h.K0();

        /* renamed from: f, reason: collision with root package name */
        private d f22619f = d.AT_MOST_ONCE;

        private b() {
            u();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b r() {
            return new b();
        }

        private void t() {
            if ((this.f22615b & 2) != 2) {
                this.f22617d = new ArrayList(this.f22617d);
                this.f22615b |= 2;
            }
        }

        private void u() {
        }

        public b A(c cVar) {
            cVar.getClass();
            this.f22615b |= 1;
            this.f22616c = cVar;
            return this;
        }

        public b B(d dVar) {
            dVar.getClass();
            this.f22615b |= 8;
            this.f22619f = dVar;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n.a
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public f a() {
            f fVarP = p();
            if (fVarP.m()) {
                return fVarP;
            }
            throw a.AbstractC1921a.b(fVarP);
        }

        public f p() {
            f fVar = new f(this);
            int i10 = this.f22615b;
            int i11 = (i10 & 1) != 1 ? 0 : 1;
            fVar.f22609d = this.f22616c;
            if ((this.f22615b & 2) == 2) {
                this.f22617d = Collections.unmodifiableList(this.f22617d);
                this.f22615b &= -3;
            }
            fVar.f22610e = this.f22617d;
            if ((i10 & 4) == 4) {
                i11 |= 2;
            }
            fVar.f22611f = this.f22618e;
            if ((i10 & 8) == 8) {
                i11 |= 4;
            }
            fVar.f22612g = this.f22619f;
            fVar.f22608c = i11;
            return fVar;
        }

        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return r().f(p());
        }

        public b w(h hVar) {
            if ((this.f22615b & 4) != 4 || this.f22618e == h.K0()) {
                this.f22618e = hVar;
            } else {
                this.f22618e = h.d1(this.f22618e).f(hVar).p();
            }
            this.f22615b |= 4;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public b f(f fVar) {
            if (fVar == f.d0()) {
                return this;
            }
            if (fVar.K0()) {
                A(fVar.C0());
            }
            if (!fVar.f22610e.isEmpty()) {
                if (this.f22617d.isEmpty()) {
                    this.f22617d = fVar.f22610e;
                    this.f22615b &= -3;
                } else {
                    t();
                    this.f22617d.addAll(fVar.f22610e);
                }
            }
            if (fVar.G0()) {
                w(fVar.T());
            }
            if (fVar.M0()) {
                B(fVar.E0());
            }
            i(e().e(fVar.f22607b));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n.a
        /* renamed from: z, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public Uh.f.b b0(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.p r1 = Uh.f.f22606k     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                Uh.f r3 = (Uh.f) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                Uh.f r4 = (Uh.f) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: Uh.f.b.b0(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):Uh.f$b");
        }
    }

    public enum c implements i.a {
        RETURNS_CONSTANT(0, 0),
        CALLS(1, 1),
        RETURNS_NOT_NULL(2, 2);

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
                return RETURNS_CONSTANT;
            }
            if (i10 == 1) {
                return CALLS;
            }
            if (i10 != 2) {
                return null;
            }
            return RETURNS_NOT_NULL;
        }
    }

    public enum d implements i.a {
        AT_MOST_ONCE(0, 0),
        EXACTLY_ONCE(1, 1),
        AT_LEAST_ONCE(2, 2);

        private static i.b internalValueMap = new a();
        private final int value;

        static class a implements i.b {
            a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.b
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public d a(int i10) {
                return d.valueOf(i10);
            }
        }

        d(int i10, int i11) {
            this.value = i11;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.a
        public final int getNumber() {
            return this.value;
        }

        public static d valueOf(int i10) {
            if (i10 == 0) {
                return AT_MOST_ONCE;
            }
            if (i10 == 1) {
                return EXACTLY_ONCE;
            }
            if (i10 != 2) {
                return null;
            }
            return AT_LEAST_ONCE;
        }
    }

    static {
        f fVar = new f(true);
        f22605j = fVar;
        fVar.N0();
    }

    private void N0() {
        this.f22609d = c.RETURNS_CONSTANT;
        this.f22610e = Collections.emptyList();
        this.f22611f = h.K0();
        this.f22612g = d.AT_MOST_ONCE;
    }

    public static b P0() {
        return b.r();
    }

    public static b T0(f fVar) {
        return P0().f(fVar);
    }

    public static f d0() {
        return f22605j;
    }

    public c C0() {
        return this.f22609d;
    }

    public d E0() {
        return this.f22612g;
    }

    public boolean G0() {
        return (this.f22608c & 2) == 2;
    }

    public boolean K0() {
        return (this.f22608c & 1) == 1;
    }

    public boolean M0() {
        return (this.f22608c & 4) == 4;
    }

    public h T() {
        return this.f22611f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
    /* renamed from: U0, reason: merged with bridge method [inline-methods] */
    public b h() {
        return P0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
    /* renamed from: V0, reason: merged with bridge method [inline-methods] */
    public b l() {
        return T0(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
    public int d() {
        int i10 = this.f22614i;
        if (i10 != -1) {
            return i10;
        }
        int iH = (this.f22608c & 1) == 1 ? CodedOutputStream.h(1, this.f22609d.getNumber()) : 0;
        for (int i11 = 0; i11 < this.f22610e.size(); i11++) {
            iH += CodedOutputStream.r(2, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.f22610e.get(i11));
        }
        if ((this.f22608c & 2) == 2) {
            iH += CodedOutputStream.r(3, this.f22611f);
        }
        if ((this.f22608c & 4) == 4) {
            iH += CodedOutputStream.h(4, this.f22612g.getNumber());
        }
        int size = iH + this.f22607b.size();
        this.f22614i = size;
        return size;
    }

    public h f0(int i10) {
        return (h) this.f22610e.get(i10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public final boolean m() {
        byte b10 = this.f22613h;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < q0(); i10++) {
            if (!f0(i10).m()) {
                this.f22613h = (byte) 0;
                return false;
            }
        }
        if (!G0() || T().m()) {
            this.f22613h = (byte) 1;
            return true;
        }
        this.f22613h = (byte) 0;
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
    public void n(CodedOutputStream codedOutputStream) throws IOException {
        d();
        if ((this.f22608c & 1) == 1) {
            codedOutputStream.R(1, this.f22609d.getNumber());
        }
        for (int i10 = 0; i10 < this.f22610e.size(); i10++) {
            codedOutputStream.c0(2, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.f22610e.get(i10));
        }
        if ((this.f22608c & 2) == 2) {
            codedOutputStream.c0(3, this.f22611f);
        }
        if ((this.f22608c & 4) == 4) {
            codedOutputStream.R(4, this.f22612g.getNumber());
        }
        codedOutputStream.h0(this.f22607b);
    }

    public int q0() {
        return this.f22610e.size();
    }

    private f(h.b bVar) {
        super(bVar);
        this.f22613h = (byte) -1;
        this.f22614i = -1;
        this.f22607b = bVar.e();
    }

    private f(boolean z10) {
        this.f22613h = (byte) -1;
        this.f22614i = -1;
        this.f22607b = kotlin.reflect.jvm.internal.impl.protobuf.d.f51945a;
    }

    private f(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
        this.f22613h = (byte) -1;
        this.f22614i = -1;
        N0();
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
                            int iM = eVar.m();
                            c cVarValueOf = c.valueOf(iM);
                            if (cVarValueOf == null) {
                                codedOutputStreamI.n0(iJ);
                                codedOutputStreamI.n0(iM);
                            } else {
                                this.f22608c |= 1;
                                this.f22609d = cVarValueOf;
                            }
                        } else if (iJ == 18) {
                            if ((c10 & 2) != 2) {
                                this.f22610e = new ArrayList();
                                c10 = 2;
                            }
                            this.f22610e.add(eVar.t(h.f22630n, fVar));
                        } else if (iJ == 26) {
                            h.b bVarL = (this.f22608c & 2) == 2 ? this.f22611f.l() : null;
                            h hVar = (h) eVar.t(h.f22630n, fVar);
                            this.f22611f = hVar;
                            if (bVarL != null) {
                                bVarL.f(hVar);
                                this.f22611f = bVarL.p();
                            }
                            this.f22608c |= 2;
                        } else if (iJ != 32) {
                            if (!y(eVar, codedOutputStreamI, fVar, iJ)) {
                            }
                        } else {
                            int iM2 = eVar.m();
                            d dVarValueOf = d.valueOf(iM2);
                            if (dVarValueOf == null) {
                                codedOutputStreamI.n0(iJ);
                                codedOutputStreamI.n0(iM2);
                            } else {
                                this.f22608c |= 4;
                                this.f22612g = dVarValueOf;
                            }
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
                    this.f22610e = Collections.unmodifiableList(this.f22610e);
                }
                try {
                    codedOutputStreamI.H();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f22607b = bVarU.p();
                    throw th3;
                }
                this.f22607b = bVarU.p();
                s();
                throw th2;
            }
        }
        if ((c10 & 2) == 2) {
            this.f22610e = Collections.unmodifiableList(this.f22610e);
        }
        try {
            codedOutputStreamI.H();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f22607b = bVarU.p();
            throw th4;
        }
        this.f22607b = bVarU.p();
        s();
    }
}
