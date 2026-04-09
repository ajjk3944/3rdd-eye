package Uh;

import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.a;
import kotlin.reflect.jvm.internal.impl.protobuf.d;
import kotlin.reflect.jvm.internal.impl.protobuf.h;

/* loaded from: classes4.dex */
public final class g extends h.d implements kotlin.reflect.jvm.internal.impl.protobuf.o {

    /* renamed from: h, reason: collision with root package name */
    private static final g f22620h;

    /* renamed from: i, reason: collision with root package name */
    public static kotlin.reflect.jvm.internal.impl.protobuf.p f22621i = new a();

    /* renamed from: c, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.protobuf.d f22622c;

    /* renamed from: d, reason: collision with root package name */
    private int f22623d;

    /* renamed from: e, reason: collision with root package name */
    private int f22624e;

    /* renamed from: f, reason: collision with root package name */
    private byte f22625f;

    /* renamed from: g, reason: collision with root package name */
    private int f22626g;

    static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public g b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
            return new g(eVar, fVar);
        }
    }

    public static final class b extends h.c implements kotlin.reflect.jvm.internal.impl.protobuf.o {

        /* renamed from: d, reason: collision with root package name */
        private int f22627d;

        /* renamed from: e, reason: collision with root package name */
        private int f22628e;

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
        public b f(g gVar) {
            if (gVar == g.E0()) {
                return this;
            }
            if (gVar.M0()) {
                D(gVar.K0());
            }
            q(gVar);
            i(e().e(gVar.f22622c));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n.a
        /* renamed from: B, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public Uh.g.b b0(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.p r1 = Uh.g.f22621i     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                Uh.g r3 = (Uh.g) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                Uh.g r4 = (Uh.g) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: Uh.g.b.b0(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):Uh.g$b");
        }

        public b D(int i10) {
            this.f22627d |= 1;
            this.f22628e = i10;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n.a
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public g a() {
            g gVarU = u();
            if (gVarU.m()) {
                return gVarU;
            }
            throw a.AbstractC1921a.b(gVarU);
        }

        public g u() {
            g gVar = new g(this);
            int i10 = (this.f22627d & 1) != 1 ? 0 : 1;
            gVar.f22624e = this.f22628e;
            gVar.f22623d = i10;
            return gVar;
        }

        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return x().f(u());
        }
    }

    static {
        g gVar = new g(true);
        f22620h = gVar;
        gVar.N0();
    }

    public static g E0() {
        return f22620h;
    }

    private void N0() {
        this.f22624e = 0;
    }

    public static b P0() {
        return b.x();
    }

    public static b T0(g gVar) {
        return P0().f(gVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    /* renamed from: G0, reason: merged with bridge method [inline-methods] */
    public g c() {
        return f22620h;
    }

    public int K0() {
        return this.f22624e;
    }

    public boolean M0() {
        return (this.f22623d & 1) == 1;
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
        int i10 = this.f22626g;
        if (i10 != -1) {
            return i10;
        }
        int iO = ((this.f22623d & 1) == 1 ? CodedOutputStream.o(1, this.f22624e) : 0) + F() + this.f22622c.size();
        this.f22626g = iO;
        return iO;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public final boolean m() {
        byte b10 = this.f22625f;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (E()) {
            this.f22625f = (byte) 1;
            return true;
        }
        this.f22625f = (byte) 0;
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
    public void n(CodedOutputStream codedOutputStream) throws IOException {
        d();
        h.d.a aVarT = T();
        if ((this.f22623d & 1) == 1) {
            codedOutputStream.Z(1, this.f22624e);
        }
        aVarT.a(200, codedOutputStream);
        codedOutputStream.h0(this.f22622c);
    }

    private g(h.c cVar) {
        super(cVar);
        this.f22625f = (byte) -1;
        this.f22626g = -1;
        this.f22622c = cVar.e();
    }

    private g(boolean z10) {
        this.f22625f = (byte) -1;
        this.f22626g = -1;
        this.f22622c = kotlin.reflect.jvm.internal.impl.protobuf.d.f51945a;
    }

    private g(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
        this.f22625f = (byte) -1;
        this.f22626g = -1;
        N0();
        d.b bVarU = kotlin.reflect.jvm.internal.impl.protobuf.d.u();
        CodedOutputStream codedOutputStreamI = CodedOutputStream.I(bVarU, 1);
        boolean z10 = false;
        while (!z10) {
            try {
                try {
                    try {
                        int iJ = eVar.J();
                        if (iJ != 0) {
                            if (iJ != 8) {
                                if (!y(eVar, codedOutputStreamI, fVar, iJ)) {
                                }
                            } else {
                                this.f22623d |= 1;
                                this.f22624e = eVar.r();
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
                try {
                    codedOutputStreamI.H();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f22622c = bVarU.p();
                    throw th3;
                }
                this.f22622c = bVarU.p();
                s();
                throw th2;
            }
        }
        try {
            codedOutputStreamI.H();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f22622c = bVarU.p();
            throw th4;
        }
        this.f22622c = bVarU.p();
        s();
    }
}
