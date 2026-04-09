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
public final class e extends kotlin.reflect.jvm.internal.impl.protobuf.h implements kotlin.reflect.jvm.internal.impl.protobuf.o {

    /* renamed from: f, reason: collision with root package name */
    private static final e f22597f;

    /* renamed from: g, reason: collision with root package name */
    public static kotlin.reflect.jvm.internal.impl.protobuf.p f22598g = new a();

    /* renamed from: b, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.protobuf.d f22599b;

    /* renamed from: c, reason: collision with root package name */
    private List f22600c;

    /* renamed from: d, reason: collision with root package name */
    private byte f22601d;

    /* renamed from: e, reason: collision with root package name */
    private int f22602e;

    static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public e b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
            return new e(eVar, fVar);
        }
    }

    public static final class b extends h.b implements kotlin.reflect.jvm.internal.impl.protobuf.o {

        /* renamed from: b, reason: collision with root package name */
        private int f22603b;

        /* renamed from: c, reason: collision with root package name */
        private List f22604c = Collections.emptyList();

        private b() {
            u();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b r() {
            return new b();
        }

        private void t() {
            if ((this.f22603b & 1) != 1) {
                this.f22604c = new ArrayList(this.f22604c);
                this.f22603b |= 1;
            }
        }

        private void u() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n.a
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public e a() {
            e eVarP = p();
            if (eVarP.m()) {
                return eVarP;
            }
            throw a.AbstractC1921a.b(eVarP);
        }

        public e p() {
            e eVar = new e(this);
            if ((this.f22603b & 1) == 1) {
                this.f22604c = Collections.unmodifiableList(this.f22604c);
                this.f22603b &= -2;
            }
            eVar.f22600c = this.f22604c;
            return eVar;
        }

        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return r().f(p());
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public b f(e eVar) {
            if (eVar == e.J()) {
                return this;
            }
            if (!eVar.f22600c.isEmpty()) {
                if (this.f22604c.isEmpty()) {
                    this.f22604c = eVar.f22600c;
                    this.f22603b &= -2;
                } else {
                    t();
                    this.f22604c.addAll(eVar.f22600c);
                }
            }
            i(e().e(eVar.f22599b));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n.a
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public Uh.e.b b0(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.p r1 = Uh.e.f22598g     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                Uh.e r3 = (Uh.e) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                Uh.e r4 = (Uh.e) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: Uh.e.b.b0(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):Uh.e$b");
        }
    }

    static {
        e eVar = new e(true);
        f22597f = eVar;
        eVar.S();
    }

    public static e J() {
        return f22597f;
    }

    private void S() {
        this.f22600c = Collections.emptyList();
    }

    public static b T() {
        return b.r();
    }

    public static b d0(e eVar) {
        return T().f(eVar);
    }

    public f K(int i10) {
        return (f) this.f22600c.get(i10);
    }

    public int P() {
        return this.f22600c.size();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
    public int d() {
        int i10 = this.f22602e;
        if (i10 != -1) {
            return i10;
        }
        int iR = 0;
        for (int i11 = 0; i11 < this.f22600c.size(); i11++) {
            iR += CodedOutputStream.r(1, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.f22600c.get(i11));
        }
        int size = iR + this.f22599b.size();
        this.f22602e = size;
        return size;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
    /* renamed from: f0, reason: merged with bridge method [inline-methods] */
    public b h() {
        return T();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public final boolean m() {
        byte b10 = this.f22601d;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < P(); i10++) {
            if (!K(i10).m()) {
                this.f22601d = (byte) 0;
                return false;
            }
        }
        this.f22601d = (byte) 1;
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
    public void n(CodedOutputStream codedOutputStream) throws IOException {
        d();
        for (int i10 = 0; i10 < this.f22600c.size(); i10++) {
            codedOutputStream.c0(1, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.f22600c.get(i10));
        }
        codedOutputStream.h0(this.f22599b);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
    /* renamed from: q0, reason: merged with bridge method [inline-methods] */
    public b l() {
        return d0(this);
    }

    private e(h.b bVar) {
        super(bVar);
        this.f22601d = (byte) -1;
        this.f22602e = -1;
        this.f22599b = bVar.e();
    }

    private e(boolean z10) {
        this.f22601d = (byte) -1;
        this.f22602e = -1;
        this.f22599b = kotlin.reflect.jvm.internal.impl.protobuf.d.f51945a;
    }

    private e(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
        this.f22601d = (byte) -1;
        this.f22602e = -1;
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
                                if (!z11) {
                                    this.f22600c = new ArrayList();
                                    z11 = true;
                                }
                                this.f22600c.add(eVar.t(f.f22606k, fVar));
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
                    this.f22600c = Collections.unmodifiableList(this.f22600c);
                }
                try {
                    codedOutputStreamI.H();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f22599b = bVarU.p();
                    throw th3;
                }
                this.f22599b = bVarU.p();
                s();
                throw th2;
            }
        }
        if (z11) {
            this.f22600c = Collections.unmodifiableList(this.f22600c);
        }
        try {
            codedOutputStreamI.H();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f22599b = bVarU.p();
            throw th4;
        }
        this.f22599b = bVarU.p();
        s();
    }
}
