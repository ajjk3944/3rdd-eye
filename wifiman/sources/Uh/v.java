package Uh;

import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.a;
import kotlin.reflect.jvm.internal.impl.protobuf.d;
import kotlin.reflect.jvm.internal.impl.protobuf.h;
import kotlin.reflect.jvm.internal.impl.protobuf.i;

/* loaded from: classes4.dex */
public final class v extends kotlin.reflect.jvm.internal.impl.protobuf.h implements kotlin.reflect.jvm.internal.impl.protobuf.o {

    /* renamed from: l, reason: collision with root package name */
    private static final v f22906l;

    /* renamed from: m, reason: collision with root package name */
    public static kotlin.reflect.jvm.internal.impl.protobuf.p f22907m = new a();

    /* renamed from: b, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.protobuf.d f22908b;

    /* renamed from: c, reason: collision with root package name */
    private int f22909c;

    /* renamed from: d, reason: collision with root package name */
    private int f22910d;

    /* renamed from: e, reason: collision with root package name */
    private int f22911e;

    /* renamed from: f, reason: collision with root package name */
    private c f22912f;

    /* renamed from: g, reason: collision with root package name */
    private int f22913g;

    /* renamed from: h, reason: collision with root package name */
    private int f22914h;

    /* renamed from: i, reason: collision with root package name */
    private d f22915i;

    /* renamed from: j, reason: collision with root package name */
    private byte f22916j;

    /* renamed from: k, reason: collision with root package name */
    private int f22917k;

    static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public v b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
            return new v(eVar, fVar);
        }
    }

    public static final class b extends h.b implements kotlin.reflect.jvm.internal.impl.protobuf.o {

        /* renamed from: b, reason: collision with root package name */
        private int f22918b;

        /* renamed from: c, reason: collision with root package name */
        private int f22919c;

        /* renamed from: d, reason: collision with root package name */
        private int f22920d;

        /* renamed from: f, reason: collision with root package name */
        private int f22922f;

        /* renamed from: g, reason: collision with root package name */
        private int f22923g;

        /* renamed from: e, reason: collision with root package name */
        private c f22921e = c.ERROR;

        /* renamed from: h, reason: collision with root package name */
        private d f22924h = d.LANGUAGE_VERSION;

        private b() {
            t();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b r() {
            return new b();
        }

        private void t() {
        }

        public b A(int i10) {
            this.f22918b |= 16;
            this.f22923g = i10;
            return this;
        }

        public b B(int i10) {
            this.f22918b |= 1;
            this.f22919c = i10;
            return this;
        }

        public b D(int i10) {
            this.f22918b |= 2;
            this.f22920d = i10;
            return this;
        }

        public b E(d dVar) {
            dVar.getClass();
            this.f22918b |= 32;
            this.f22924h = dVar;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n.a
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public v a() {
            v vVarP = p();
            if (vVarP.m()) {
                return vVarP;
            }
            throw a.AbstractC1921a.b(vVarP);
        }

        public v p() {
            v vVar = new v(this);
            int i10 = this.f22918b;
            int i11 = (i10 & 1) != 1 ? 0 : 1;
            vVar.f22910d = this.f22919c;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            vVar.f22911e = this.f22920d;
            if ((i10 & 4) == 4) {
                i11 |= 4;
            }
            vVar.f22912f = this.f22921e;
            if ((i10 & 8) == 8) {
                i11 |= 8;
            }
            vVar.f22913g = this.f22922f;
            if ((i10 & 16) == 16) {
                i11 |= 16;
            }
            vVar.f22914h = this.f22923g;
            if ((i10 & 32) == 32) {
                i11 |= 32;
            }
            vVar.f22915i = this.f22924h;
            vVar.f22909c = i11;
            return vVar;
        }

        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return r().f(p());
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public b f(v vVar) {
            if (vVar == v.d0()) {
                return this;
            }
            if (vVar.P0()) {
                B(vVar.getVersion());
            }
            if (vVar.T0()) {
                D(vVar.E0());
            }
            if (vVar.M0()) {
                z(vVar.q0());
            }
            if (vVar.K0()) {
                x(vVar.f0());
            }
            if (vVar.N0()) {
                A(vVar.C0());
            }
            if (vVar.U0()) {
                E(vVar.G0());
            }
            i(e().e(vVar.f22908b));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n.a
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public Uh.v.b b0(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.p r1 = Uh.v.f22907m     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                Uh.v r3 = (Uh.v) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                Uh.v r4 = (Uh.v) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: Uh.v.b.b0(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):Uh.v$b");
        }

        public b x(int i10) {
            this.f22918b |= 8;
            this.f22922f = i10;
            return this;
        }

        public b z(c cVar) {
            cVar.getClass();
            this.f22918b |= 4;
            this.f22921e = cVar;
            return this;
        }
    }

    public enum c implements i.a {
        WARNING(0, 0),
        ERROR(1, 1),
        HIDDEN(2, 2);

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
                return WARNING;
            }
            if (i10 == 1) {
                return ERROR;
            }
            if (i10 != 2) {
                return null;
            }
            return HIDDEN;
        }
    }

    public enum d implements i.a {
        LANGUAGE_VERSION(0, 0),
        COMPILER_VERSION(1, 1),
        API_VERSION(2, 2);

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
                return LANGUAGE_VERSION;
            }
            if (i10 == 1) {
                return COMPILER_VERSION;
            }
            if (i10 != 2) {
                return null;
            }
            return API_VERSION;
        }
    }

    static {
        v vVar = new v(true);
        f22906l = vVar;
        vVar.V0();
    }

    private void V0() {
        this.f22910d = 0;
        this.f22911e = 0;
        this.f22912f = c.ERROR;
        this.f22913g = 0;
        this.f22914h = 0;
        this.f22915i = d.LANGUAGE_VERSION;
    }

    public static b W0() {
        return b.r();
    }

    public static b X0(v vVar) {
        return W0().f(vVar);
    }

    public static v d0() {
        return f22906l;
    }

    public int C0() {
        return this.f22914h;
    }

    public int E0() {
        return this.f22911e;
    }

    public d G0() {
        return this.f22915i;
    }

    public boolean K0() {
        return (this.f22909c & 8) == 8;
    }

    public boolean M0() {
        return (this.f22909c & 4) == 4;
    }

    public boolean N0() {
        return (this.f22909c & 16) == 16;
    }

    public boolean P0() {
        return (this.f22909c & 1) == 1;
    }

    public boolean T0() {
        return (this.f22909c & 2) == 2;
    }

    public boolean U0() {
        return (this.f22909c & 32) == 32;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
    /* renamed from: Y0, reason: merged with bridge method [inline-methods] */
    public b h() {
        return W0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
    /* renamed from: Z0, reason: merged with bridge method [inline-methods] */
    public b l() {
        return X0(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
    public int d() {
        int i10 = this.f22917k;
        if (i10 != -1) {
            return i10;
        }
        int iO = (this.f22909c & 1) == 1 ? CodedOutputStream.o(1, this.f22910d) : 0;
        if ((this.f22909c & 2) == 2) {
            iO += CodedOutputStream.o(2, this.f22911e);
        }
        if ((this.f22909c & 4) == 4) {
            iO += CodedOutputStream.h(3, this.f22912f.getNumber());
        }
        if ((this.f22909c & 8) == 8) {
            iO += CodedOutputStream.o(4, this.f22913g);
        }
        if ((this.f22909c & 16) == 16) {
            iO += CodedOutputStream.o(5, this.f22914h);
        }
        if ((this.f22909c & 32) == 32) {
            iO += CodedOutputStream.h(6, this.f22915i.getNumber());
        }
        int size = iO + this.f22908b.size();
        this.f22917k = size;
        return size;
    }

    public int f0() {
        return this.f22913g;
    }

    public int getVersion() {
        return this.f22910d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public final boolean m() {
        byte b10 = this.f22916j;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        this.f22916j = (byte) 1;
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
    public void n(CodedOutputStream codedOutputStream) throws IOException {
        d();
        if ((this.f22909c & 1) == 1) {
            codedOutputStream.Z(1, this.f22910d);
        }
        if ((this.f22909c & 2) == 2) {
            codedOutputStream.Z(2, this.f22911e);
        }
        if ((this.f22909c & 4) == 4) {
            codedOutputStream.R(3, this.f22912f.getNumber());
        }
        if ((this.f22909c & 8) == 8) {
            codedOutputStream.Z(4, this.f22913g);
        }
        if ((this.f22909c & 16) == 16) {
            codedOutputStream.Z(5, this.f22914h);
        }
        if ((this.f22909c & 32) == 32) {
            codedOutputStream.R(6, this.f22915i.getNumber());
        }
        codedOutputStream.h0(this.f22908b);
    }

    public c q0() {
        return this.f22912f;
    }

    private v(h.b bVar) {
        super(bVar);
        this.f22916j = (byte) -1;
        this.f22917k = -1;
        this.f22908b = bVar.e();
    }

    private v(boolean z10) {
        this.f22916j = (byte) -1;
        this.f22917k = -1;
        this.f22908b = kotlin.reflect.jvm.internal.impl.protobuf.d.f51945a;
    }

    private v(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
        this.f22916j = (byte) -1;
        this.f22917k = -1;
        V0();
        d.b bVarU = kotlin.reflect.jvm.internal.impl.protobuf.d.u();
        CodedOutputStream codedOutputStreamI = CodedOutputStream.I(bVarU, 1);
        boolean z10 = false;
        while (!z10) {
            try {
                try {
                    int iJ = eVar.J();
                    if (iJ != 0) {
                        if (iJ == 8) {
                            this.f22909c |= 1;
                            this.f22910d = eVar.r();
                        } else if (iJ == 16) {
                            this.f22909c |= 2;
                            this.f22911e = eVar.r();
                        } else if (iJ == 24) {
                            int iM = eVar.m();
                            c cVarValueOf = c.valueOf(iM);
                            if (cVarValueOf == null) {
                                codedOutputStreamI.n0(iJ);
                                codedOutputStreamI.n0(iM);
                            } else {
                                this.f22909c |= 4;
                                this.f22912f = cVarValueOf;
                            }
                        } else if (iJ == 32) {
                            this.f22909c |= 8;
                            this.f22913g = eVar.r();
                        } else if (iJ == 40) {
                            this.f22909c |= 16;
                            this.f22914h = eVar.r();
                        } else if (iJ != 48) {
                            if (!y(eVar, codedOutputStreamI, fVar, iJ)) {
                            }
                        } else {
                            int iM2 = eVar.m();
                            d dVarValueOf = d.valueOf(iM2);
                            if (dVarValueOf == null) {
                                codedOutputStreamI.n0(iJ);
                                codedOutputStreamI.n0(iM2);
                            } else {
                                this.f22909c |= 32;
                                this.f22915i = dVarValueOf;
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
                try {
                    codedOutputStreamI.H();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f22908b = bVarU.p();
                    throw th3;
                }
                this.f22908b = bVarU.p();
                s();
                throw th2;
            }
        }
        try {
            codedOutputStreamI.H();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f22908b = bVarU.p();
            throw th4;
        }
        this.f22908b = bVarU.p();
        s();
    }
}
