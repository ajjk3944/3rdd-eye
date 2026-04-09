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
public final class t extends kotlin.reflect.jvm.internal.impl.protobuf.h implements kotlin.reflect.jvm.internal.impl.protobuf.o {

    /* renamed from: h, reason: collision with root package name */
    private static final t f22876h;

    /* renamed from: i, reason: collision with root package name */
    public static kotlin.reflect.jvm.internal.impl.protobuf.p f22877i = new a();

    /* renamed from: b, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.protobuf.d f22878b;

    /* renamed from: c, reason: collision with root package name */
    private int f22879c;

    /* renamed from: d, reason: collision with root package name */
    private List f22880d;

    /* renamed from: e, reason: collision with root package name */
    private int f22881e;

    /* renamed from: f, reason: collision with root package name */
    private byte f22882f;

    /* renamed from: g, reason: collision with root package name */
    private int f22883g;

    static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public t b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
            return new t(eVar, fVar);
        }
    }

    public static final class b extends h.b implements kotlin.reflect.jvm.internal.impl.protobuf.o {

        /* renamed from: b, reason: collision with root package name */
        private int f22884b;

        /* renamed from: c, reason: collision with root package name */
        private List f22885c = Collections.emptyList();

        /* renamed from: d, reason: collision with root package name */
        private int f22886d = -1;

        private b() {
            u();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b r() {
            return new b();
        }

        private void t() {
            if ((this.f22884b & 1) != 1) {
                this.f22885c = new ArrayList(this.f22885c);
                this.f22884b |= 1;
            }
        }

        private void u() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n.a
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public t a() {
            t tVarP = p();
            if (tVarP.m()) {
                return tVarP;
            }
            throw a.AbstractC1921a.b(tVarP);
        }

        public t p() {
            t tVar = new t(this);
            int i10 = this.f22884b;
            if ((i10 & 1) == 1) {
                this.f22885c = Collections.unmodifiableList(this.f22885c);
                this.f22884b &= -2;
            }
            tVar.f22880d = this.f22885c;
            int i11 = (i10 & 2) != 2 ? 0 : 1;
            tVar.f22881e = this.f22886d;
            tVar.f22879c = i11;
            return tVar;
        }

        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return r().f(p());
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public b f(t tVar) {
            if (tVar == t.P()) {
                return this;
            }
            if (!tVar.f22880d.isEmpty()) {
                if (this.f22885c.isEmpty()) {
                    this.f22885c = tVar.f22880d;
                    this.f22884b &= -2;
                } else {
                    t();
                    this.f22885c.addAll(tVar.f22880d);
                }
            }
            if (tVar.q0()) {
                z(tVar.S());
            }
            i(e().e(tVar.f22878b));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n.a
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public Uh.t.b b0(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.p r1 = Uh.t.f22877i     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                Uh.t r3 = (Uh.t) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                Uh.t r4 = (Uh.t) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: Uh.t.b.b0(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):Uh.t$b");
        }

        public b z(int i10) {
            this.f22884b |= 2;
            this.f22886d = i10;
            return this;
        }
    }

    static {
        t tVar = new t(true);
        f22876h = tVar;
        tVar.C0();
    }

    private void C0() {
        this.f22880d = Collections.emptyList();
        this.f22881e = -1;
    }

    public static b E0() {
        return b.r();
    }

    public static b G0(t tVar) {
        return E0().f(tVar);
    }

    public static t P() {
        return f22876h;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
    /* renamed from: K0, reason: merged with bridge method [inline-methods] */
    public b h() {
        return E0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
    /* renamed from: M0, reason: merged with bridge method [inline-methods] */
    public b l() {
        return G0(this);
    }

    public int S() {
        return this.f22881e;
    }

    public q T(int i10) {
        return (q) this.f22880d.get(i10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
    public int d() {
        int i10 = this.f22883g;
        if (i10 != -1) {
            return i10;
        }
        int iO = 0;
        for (int i11 = 0; i11 < this.f22880d.size(); i11++) {
            iO += CodedOutputStream.r(1, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.f22880d.get(i11));
        }
        if ((this.f22879c & 1) == 1) {
            iO += CodedOutputStream.o(2, this.f22881e);
        }
        int size = iO + this.f22878b.size();
        this.f22883g = size;
        return size;
    }

    public int d0() {
        return this.f22880d.size();
    }

    public List f0() {
        return this.f22880d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public final boolean m() {
        byte b10 = this.f22882f;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < d0(); i10++) {
            if (!T(i10).m()) {
                this.f22882f = (byte) 0;
                return false;
            }
        }
        this.f22882f = (byte) 1;
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
    public void n(CodedOutputStream codedOutputStream) throws IOException {
        d();
        for (int i10 = 0; i10 < this.f22880d.size(); i10++) {
            codedOutputStream.c0(1, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.f22880d.get(i10));
        }
        if ((this.f22879c & 1) == 1) {
            codedOutputStream.Z(2, this.f22881e);
        }
        codedOutputStream.h0(this.f22878b);
    }

    public boolean q0() {
        return (this.f22879c & 1) == 1;
    }

    private t(h.b bVar) {
        super(bVar);
        this.f22882f = (byte) -1;
        this.f22883g = -1;
        this.f22878b = bVar.e();
    }

    private t(boolean z10) {
        this.f22882f = (byte) -1;
        this.f22883g = -1;
        this.f22878b = kotlin.reflect.jvm.internal.impl.protobuf.d.f51945a;
    }

    private t(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
        this.f22882f = (byte) -1;
        this.f22883g = -1;
        C0();
        d.b bVarU = kotlin.reflect.jvm.internal.impl.protobuf.d.u();
        CodedOutputStream codedOutputStreamI = CodedOutputStream.I(bVarU, 1);
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            try {
                try {
                    int iJ = eVar.J();
                    if (iJ != 0) {
                        if (iJ == 10) {
                            if (!z11) {
                                this.f22880d = new ArrayList();
                                z11 = true;
                            }
                            this.f22880d.add(eVar.t(q.f22784v, fVar));
                        } else if (iJ != 16) {
                            if (!y(eVar, codedOutputStreamI, fVar, iJ)) {
                            }
                        } else {
                            this.f22879c |= 1;
                            this.f22881e = eVar.r();
                        }
                    }
                    z10 = true;
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.n(this);
                } catch (IOException e11) {
                    throw new InvalidProtocolBufferException(e11.getMessage()).n(this);
                }
            } catch (Throwable th2) {
                if (z11) {
                    this.f22880d = Collections.unmodifiableList(this.f22880d);
                }
                try {
                    codedOutputStreamI.H();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f22878b = bVarU.p();
                    throw th3;
                }
                this.f22878b = bVarU.p();
                s();
                throw th2;
            }
        }
        if (z11) {
            this.f22880d = Collections.unmodifiableList(this.f22880d);
        }
        try {
            codedOutputStreamI.H();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f22878b = bVarU.p();
            throw th4;
        }
        this.f22878b = bVarU.p();
        s();
    }
}
