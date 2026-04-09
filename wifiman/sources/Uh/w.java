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
public final class w extends kotlin.reflect.jvm.internal.impl.protobuf.h implements kotlin.reflect.jvm.internal.impl.protobuf.o {

    /* renamed from: f, reason: collision with root package name */
    private static final w f22925f;

    /* renamed from: g, reason: collision with root package name */
    public static kotlin.reflect.jvm.internal.impl.protobuf.p f22926g = new a();

    /* renamed from: b, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.protobuf.d f22927b;

    /* renamed from: c, reason: collision with root package name */
    private List f22928c;

    /* renamed from: d, reason: collision with root package name */
    private byte f22929d;

    /* renamed from: e, reason: collision with root package name */
    private int f22930e;

    static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public w b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
            return new w(eVar, fVar);
        }
    }

    public static final class b extends h.b implements kotlin.reflect.jvm.internal.impl.protobuf.o {

        /* renamed from: b, reason: collision with root package name */
        private int f22931b;

        /* renamed from: c, reason: collision with root package name */
        private List f22932c = Collections.emptyList();

        private b() {
            u();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b r() {
            return new b();
        }

        private void t() {
            if ((this.f22931b & 1) != 1) {
                this.f22932c = new ArrayList(this.f22932c);
                this.f22931b |= 1;
            }
        }

        private void u() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n.a
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public w a() {
            w wVarP = p();
            if (wVarP.m()) {
                return wVarP;
            }
            throw a.AbstractC1921a.b(wVarP);
        }

        public w p() {
            w wVar = new w(this);
            if ((this.f22931b & 1) == 1) {
                this.f22932c = Collections.unmodifiableList(this.f22932c);
                this.f22931b &= -2;
            }
            wVar.f22928c = this.f22932c;
            return wVar;
        }

        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return r().f(p());
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public b f(w wVar) {
            if (wVar == w.J()) {
                return this;
            }
            if (!wVar.f22928c.isEmpty()) {
                if (this.f22932c.isEmpty()) {
                    this.f22932c = wVar.f22928c;
                    this.f22931b &= -2;
                } else {
                    t();
                    this.f22932c.addAll(wVar.f22928c);
                }
            }
            i(e().e(wVar.f22927b));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n.a
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public Uh.w.b b0(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.p r1 = Uh.w.f22926g     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                Uh.w r3 = (Uh.w) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                Uh.w r4 = (Uh.w) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: Uh.w.b.b0(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):Uh.w$b");
        }
    }

    static {
        w wVar = new w(true);
        f22925f = wVar;
        wVar.S();
    }

    public static w J() {
        return f22925f;
    }

    private void S() {
        this.f22928c = Collections.emptyList();
    }

    public static b T() {
        return b.r();
    }

    public static b d0(w wVar) {
        return T().f(wVar);
    }

    public int K() {
        return this.f22928c.size();
    }

    public List P() {
        return this.f22928c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
    public int d() {
        int i10 = this.f22930e;
        if (i10 != -1) {
            return i10;
        }
        int iR = 0;
        for (int i11 = 0; i11 < this.f22928c.size(); i11++) {
            iR += CodedOutputStream.r(1, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.f22928c.get(i11));
        }
        int size = iR + this.f22927b.size();
        this.f22930e = size;
        return size;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
    /* renamed from: f0, reason: merged with bridge method [inline-methods] */
    public b h() {
        return T();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public final boolean m() {
        byte b10 = this.f22929d;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        this.f22929d = (byte) 1;
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
    public void n(CodedOutputStream codedOutputStream) throws IOException {
        d();
        for (int i10 = 0; i10 < this.f22928c.size(); i10++) {
            codedOutputStream.c0(1, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.f22928c.get(i10));
        }
        codedOutputStream.h0(this.f22927b);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
    /* renamed from: q0, reason: merged with bridge method [inline-methods] */
    public b l() {
        return d0(this);
    }

    private w(h.b bVar) {
        super(bVar);
        this.f22929d = (byte) -1;
        this.f22930e = -1;
        this.f22927b = bVar.e();
    }

    private w(boolean z10) {
        this.f22929d = (byte) -1;
        this.f22930e = -1;
        this.f22927b = kotlin.reflect.jvm.internal.impl.protobuf.d.f51945a;
    }

    private w(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
        this.f22929d = (byte) -1;
        this.f22930e = -1;
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
                                    this.f22928c = new ArrayList();
                                    z11 = true;
                                }
                                this.f22928c.add(eVar.t(v.f22907m, fVar));
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
                    this.f22928c = Collections.unmodifiableList(this.f22928c);
                }
                try {
                    codedOutputStreamI.H();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f22927b = bVarU.p();
                    throw th3;
                }
                this.f22927b = bVarU.p();
                s();
                throw th2;
            }
        }
        if (z11) {
            this.f22928c = Collections.unmodifiableList(this.f22928c);
        }
        try {
            codedOutputStreamI.H();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f22927b = bVarU.p();
            throw th4;
        }
        this.f22927b = bVarU.p();
        s();
    }
}
