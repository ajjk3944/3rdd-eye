package Uh;

import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.a;
import kotlin.reflect.jvm.internal.impl.protobuf.d;
import kotlin.reflect.jvm.internal.impl.protobuf.h;

/* loaded from: classes4.dex */
public final class p extends kotlin.reflect.jvm.internal.impl.protobuf.h implements kotlin.reflect.jvm.internal.impl.protobuf.o {

    /* renamed from: f, reason: collision with root package name */
    private static final p f22775f;

    /* renamed from: g, reason: collision with root package name */
    public static kotlin.reflect.jvm.internal.impl.protobuf.p f22776g = new a();

    /* renamed from: b, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.protobuf.d f22777b;

    /* renamed from: c, reason: collision with root package name */
    private kotlin.reflect.jvm.internal.impl.protobuf.l f22778c;

    /* renamed from: d, reason: collision with root package name */
    private byte f22779d;

    /* renamed from: e, reason: collision with root package name */
    private int f22780e;

    static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public p b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
            return new p(eVar, fVar);
        }
    }

    public static final class b extends h.b implements kotlin.reflect.jvm.internal.impl.protobuf.o {

        /* renamed from: b, reason: collision with root package name */
        private int f22781b;

        /* renamed from: c, reason: collision with root package name */
        private kotlin.reflect.jvm.internal.impl.protobuf.l f22782c = kotlin.reflect.jvm.internal.impl.protobuf.k.f51998b;

        private b() {
            u();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b r() {
            return new b();
        }

        private void t() {
            if ((this.f22781b & 1) != 1) {
                this.f22782c = new kotlin.reflect.jvm.internal.impl.protobuf.k(this.f22782c);
                this.f22781b |= 1;
            }
        }

        private void u() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n.a
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public p a() {
            p pVarP = p();
            if (pVarP.m()) {
                return pVarP;
            }
            throw a.AbstractC1921a.b(pVarP);
        }

        public p p() {
            p pVar = new p(this);
            if ((this.f22781b & 1) == 1) {
                this.f22782c = this.f22782c.h();
                this.f22781b &= -2;
            }
            pVar.f22778c = this.f22782c;
            return pVar;
        }

        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return r().f(p());
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public b f(p pVar) {
            if (pVar == p.J()) {
                return this;
            }
            if (!pVar.f22778c.isEmpty()) {
                if (this.f22782c.isEmpty()) {
                    this.f22782c = pVar.f22778c;
                    this.f22781b &= -2;
                } else {
                    t();
                    this.f22782c.addAll(pVar.f22778c);
                }
            }
            i(e().e(pVar.f22777b));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n.a
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public Uh.p.b b0(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.p r1 = Uh.p.f22776g     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                Uh.p r3 = (Uh.p) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                Uh.p r4 = (Uh.p) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: Uh.p.b.b0(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):Uh.p$b");
        }
    }

    static {
        p pVar = new p(true);
        f22775f = pVar;
        pVar.S();
    }

    public static p J() {
        return f22775f;
    }

    private void S() {
        this.f22778c = kotlin.reflect.jvm.internal.impl.protobuf.k.f51998b;
    }

    public static b T() {
        return b.r();
    }

    public static b d0(p pVar) {
        return T().f(pVar);
    }

    public String K(int i10) {
        return (String) this.f22778c.get(i10);
    }

    public kotlin.reflect.jvm.internal.impl.protobuf.q P() {
        return this.f22778c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
    public int d() {
        int i10 = this.f22780e;
        if (i10 != -1) {
            return i10;
        }
        int iE = 0;
        for (int i11 = 0; i11 < this.f22778c.size(); i11++) {
            iE += CodedOutputStream.e(this.f22778c.C0(i11));
        }
        int size = iE + P().size() + this.f22777b.size();
        this.f22780e = size;
        return size;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
    /* renamed from: f0, reason: merged with bridge method [inline-methods] */
    public b h() {
        return T();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public final boolean m() {
        byte b10 = this.f22779d;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        this.f22779d = (byte) 1;
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
    public void n(CodedOutputStream codedOutputStream) throws IOException {
        d();
        for (int i10 = 0; i10 < this.f22778c.size(); i10++) {
            codedOutputStream.N(1, this.f22778c.C0(i10));
        }
        codedOutputStream.h0(this.f22777b);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
    /* renamed from: q0, reason: merged with bridge method [inline-methods] */
    public b l() {
        return d0(this);
    }

    private p(h.b bVar) {
        super(bVar);
        this.f22779d = (byte) -1;
        this.f22780e = -1;
        this.f22777b = bVar.e();
    }

    private p(boolean z10) {
        this.f22779d = (byte) -1;
        this.f22780e = -1;
        this.f22777b = kotlin.reflect.jvm.internal.impl.protobuf.d.f51945a;
    }

    private p(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
        this.f22779d = (byte) -1;
        this.f22780e = -1;
        S();
        d.b bVarU = kotlin.reflect.jvm.internal.impl.protobuf.d.u();
        CodedOutputStream codedOutputStreamI = CodedOutputStream.I(bVarU, 1);
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            try {
                try {
                    try {
                        int iJ = eVar.J();
                        if (iJ != 0) {
                            if (iJ != 10) {
                                if (!y(eVar, codedOutputStreamI, fVar, iJ)) {
                                }
                            } else {
                                kotlin.reflect.jvm.internal.impl.protobuf.d dVarK = eVar.k();
                                if (!z11) {
                                    this.f22778c = new kotlin.reflect.jvm.internal.impl.protobuf.k();
                                    z11 = true;
                                }
                                this.f22778c.P0(dVarK);
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
                if (z11) {
                    this.f22778c = this.f22778c.h();
                }
                try {
                    codedOutputStreamI.H();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f22777b = bVarU.p();
                    throw th3;
                }
                this.f22777b = bVarU.p();
                s();
                throw th2;
            }
        }
        if (z11) {
            this.f22778c = this.f22778c.h();
        }
        try {
            codedOutputStreamI.H();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f22777b = bVarU.p();
            throw th4;
        }
        this.f22777b = bVarU.p();
        s();
    }
}
