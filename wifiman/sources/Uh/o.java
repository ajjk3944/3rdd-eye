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
import kotlin.reflect.jvm.internal.impl.protobuf.i;

/* loaded from: classes4.dex */
public final class o extends kotlin.reflect.jvm.internal.impl.protobuf.h implements kotlin.reflect.jvm.internal.impl.protobuf.o {

    /* renamed from: f, reason: collision with root package name */
    private static final o f22754f;

    /* renamed from: g, reason: collision with root package name */
    public static kotlin.reflect.jvm.internal.impl.protobuf.p f22755g = new a();

    /* renamed from: b, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.protobuf.d f22756b;

    /* renamed from: c, reason: collision with root package name */
    private List f22757c;

    /* renamed from: d, reason: collision with root package name */
    private byte f22758d;

    /* renamed from: e, reason: collision with root package name */
    private int f22759e;

    static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public o b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
            return new o(eVar, fVar);
        }
    }

    public static final class b extends h.b implements kotlin.reflect.jvm.internal.impl.protobuf.o {

        /* renamed from: b, reason: collision with root package name */
        private int f22760b;

        /* renamed from: c, reason: collision with root package name */
        private List f22761c = Collections.emptyList();

        private b() {
            u();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b r() {
            return new b();
        }

        private void t() {
            if ((this.f22760b & 1) != 1) {
                this.f22761c = new ArrayList(this.f22761c);
                this.f22760b |= 1;
            }
        }

        private void u() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n.a
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public o a() {
            o oVarP = p();
            if (oVarP.m()) {
                return oVarP;
            }
            throw a.AbstractC1921a.b(oVarP);
        }

        public o p() {
            o oVar = new o(this);
            if ((this.f22760b & 1) == 1) {
                this.f22761c = Collections.unmodifiableList(this.f22761c);
                this.f22760b &= -2;
            }
            oVar.f22757c = this.f22761c;
            return oVar;
        }

        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return r().f(p());
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public b f(o oVar) {
            if (oVar == o.J()) {
                return this;
            }
            if (!oVar.f22757c.isEmpty()) {
                if (this.f22761c.isEmpty()) {
                    this.f22761c = oVar.f22757c;
                    this.f22760b &= -2;
                } else {
                    t();
                    this.f22761c.addAll(oVar.f22757c);
                }
            }
            i(e().e(oVar.f22756b));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n.a
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public Uh.o.b b0(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.p r1 = Uh.o.f22755g     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                Uh.o r3 = (Uh.o) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                Uh.o r4 = (Uh.o) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: Uh.o.b.b0(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):Uh.o$b");
        }
    }

    static {
        o oVar = new o(true);
        f22754f = oVar;
        oVar.S();
    }

    public static o J() {
        return f22754f;
    }

    private void S() {
        this.f22757c = Collections.emptyList();
    }

    public static b T() {
        return b.r();
    }

    public static b d0(o oVar) {
        return T().f(oVar);
    }

    public c K(int i10) {
        return (c) this.f22757c.get(i10);
    }

    public int P() {
        return this.f22757c.size();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
    public int d() {
        int i10 = this.f22759e;
        if (i10 != -1) {
            return i10;
        }
        int iR = 0;
        for (int i11 = 0; i11 < this.f22757c.size(); i11++) {
            iR += CodedOutputStream.r(1, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.f22757c.get(i11));
        }
        int size = iR + this.f22756b.size();
        this.f22759e = size;
        return size;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
    /* renamed from: f0, reason: merged with bridge method [inline-methods] */
    public b h() {
        return T();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public final boolean m() {
        byte b10 = this.f22758d;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < P(); i10++) {
            if (!K(i10).m()) {
                this.f22758d = (byte) 0;
                return false;
            }
        }
        this.f22758d = (byte) 1;
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
    public void n(CodedOutputStream codedOutputStream) throws IOException {
        d();
        for (int i10 = 0; i10 < this.f22757c.size(); i10++) {
            codedOutputStream.c0(1, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.f22757c.get(i10));
        }
        codedOutputStream.h0(this.f22756b);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
    /* renamed from: q0, reason: merged with bridge method [inline-methods] */
    public b l() {
        return d0(this);
    }

    public static final class c extends kotlin.reflect.jvm.internal.impl.protobuf.h implements kotlin.reflect.jvm.internal.impl.protobuf.o {

        /* renamed from: i, reason: collision with root package name */
        private static final c f22762i;

        /* renamed from: j, reason: collision with root package name */
        public static kotlin.reflect.jvm.internal.impl.protobuf.p f22763j = new a();

        /* renamed from: b, reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.protobuf.d f22764b;

        /* renamed from: c, reason: collision with root package name */
        private int f22765c;

        /* renamed from: d, reason: collision with root package name */
        private int f22766d;

        /* renamed from: e, reason: collision with root package name */
        private int f22767e;

        /* renamed from: f, reason: collision with root package name */
        private EnumC0835c f22768f;

        /* renamed from: g, reason: collision with root package name */
        private byte f22769g;

        /* renamed from: h, reason: collision with root package name */
        private int f22770h;

        static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b {
            a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public c b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
                return new c(eVar, fVar);
            }
        }

        public static final class b extends h.b implements kotlin.reflect.jvm.internal.impl.protobuf.o {

            /* renamed from: b, reason: collision with root package name */
            private int f22771b;

            /* renamed from: d, reason: collision with root package name */
            private int f22773d;

            /* renamed from: c, reason: collision with root package name */
            private int f22772c = -1;

            /* renamed from: e, reason: collision with root package name */
            private EnumC0835c f22774e = EnumC0835c.PACKAGE;

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
                this.f22771b |= 2;
                this.f22773d = i10;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.n.a
            /* renamed from: o, reason: merged with bridge method [inline-methods] */
            public c a() {
                c cVarP = p();
                if (cVarP.m()) {
                    return cVarP;
                }
                throw a.AbstractC1921a.b(cVarP);
            }

            public c p() {
                c cVar = new c(this);
                int i10 = this.f22771b;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                cVar.f22766d = this.f22772c;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                cVar.f22767e = this.f22773d;
                if ((i10 & 4) == 4) {
                    i11 |= 4;
                }
                cVar.f22768f = this.f22774e;
                cVar.f22765c = i11;
                return cVar;
            }

            /* renamed from: q, reason: merged with bridge method [inline-methods] */
            public b clone() {
                return r().f(p());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: u, reason: merged with bridge method [inline-methods] */
            public b f(c cVar) {
                if (cVar == c.P()) {
                    return this;
                }
                if (cVar.q0()) {
                    z(cVar.T());
                }
                if (cVar.C0()) {
                    A(cVar.d0());
                }
                if (cVar.f0()) {
                    x(cVar.S());
                }
                i(e().e(cVar.f22764b));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.n.a
            /* renamed from: w, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public Uh.o.c.b b0(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.p r1 = Uh.o.c.f22763j     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    Uh.o$c r3 = (Uh.o.c) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                    Uh.o$c r4 = (Uh.o.c) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: Uh.o.c.b.b0(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):Uh.o$c$b");
            }

            public b x(EnumC0835c enumC0835c) {
                enumC0835c.getClass();
                this.f22771b |= 4;
                this.f22774e = enumC0835c;
                return this;
            }

            public b z(int i10) {
                this.f22771b |= 1;
                this.f22772c = i10;
                return this;
            }
        }

        /* renamed from: Uh.o$c$c, reason: collision with other inner class name */
        public enum EnumC0835c implements i.a {
            CLASS(0, 0),
            PACKAGE(1, 1),
            LOCAL(2, 2);

            private static i.b internalValueMap = new a();
            private final int value;

            /* renamed from: Uh.o$c$c$a */
            static class a implements i.b {
                a() {
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.b
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public EnumC0835c a(int i10) {
                    return EnumC0835c.valueOf(i10);
                }
            }

            EnumC0835c(int i10, int i11) {
                this.value = i11;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.a
            public final int getNumber() {
                return this.value;
            }

            public static EnumC0835c valueOf(int i10) {
                if (i10 == 0) {
                    return CLASS;
                }
                if (i10 == 1) {
                    return PACKAGE;
                }
                if (i10 != 2) {
                    return null;
                }
                return LOCAL;
            }
        }

        static {
            c cVar = new c(true);
            f22762i = cVar;
            cVar.E0();
        }

        private void E0() {
            this.f22766d = -1;
            this.f22767e = 0;
            this.f22768f = EnumC0835c.PACKAGE;
        }

        public static b G0() {
            return b.r();
        }

        public static b K0(c cVar) {
            return G0().f(cVar);
        }

        public static c P() {
            return f22762i;
        }

        public boolean C0() {
            return (this.f22765c & 2) == 2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        /* renamed from: M0, reason: merged with bridge method [inline-methods] */
        public b h() {
            return G0();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        /* renamed from: N0, reason: merged with bridge method [inline-methods] */
        public b l() {
            return K0(this);
        }

        public EnumC0835c S() {
            return this.f22768f;
        }

        public int T() {
            return this.f22766d;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public int d() {
            int i10 = this.f22770h;
            if (i10 != -1) {
                return i10;
            }
            int iO = (this.f22765c & 1) == 1 ? CodedOutputStream.o(1, this.f22766d) : 0;
            if ((this.f22765c & 2) == 2) {
                iO += CodedOutputStream.o(2, this.f22767e);
            }
            if ((this.f22765c & 4) == 4) {
                iO += CodedOutputStream.h(3, this.f22768f.getNumber());
            }
            int size = iO + this.f22764b.size();
            this.f22770h = size;
            return size;
        }

        public int d0() {
            return this.f22767e;
        }

        public boolean f0() {
            return (this.f22765c & 4) == 4;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final boolean m() {
            byte b10 = this.f22769g;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            if (C0()) {
                this.f22769g = (byte) 1;
                return true;
            }
            this.f22769g = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public void n(CodedOutputStream codedOutputStream) throws IOException {
            d();
            if ((this.f22765c & 1) == 1) {
                codedOutputStream.Z(1, this.f22766d);
            }
            if ((this.f22765c & 2) == 2) {
                codedOutputStream.Z(2, this.f22767e);
            }
            if ((this.f22765c & 4) == 4) {
                codedOutputStream.R(3, this.f22768f.getNumber());
            }
            codedOutputStream.h0(this.f22764b);
        }

        public boolean q0() {
            return (this.f22765c & 1) == 1;
        }

        private c(h.b bVar) {
            super(bVar);
            this.f22769g = (byte) -1;
            this.f22770h = -1;
            this.f22764b = bVar.e();
        }

        private c(boolean z10) {
            this.f22769g = (byte) -1;
            this.f22770h = -1;
            this.f22764b = kotlin.reflect.jvm.internal.impl.protobuf.d.f51945a;
        }

        private c(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
            this.f22769g = (byte) -1;
            this.f22770h = -1;
            E0();
            d.b bVarU = kotlin.reflect.jvm.internal.impl.protobuf.d.u();
            CodedOutputStream codedOutputStreamI = CodedOutputStream.I(bVarU, 1);
            boolean z10 = false;
            while (!z10) {
                try {
                    try {
                        try {
                            int iJ = eVar.J();
                            if (iJ != 0) {
                                if (iJ == 8) {
                                    this.f22765c |= 1;
                                    this.f22766d = eVar.r();
                                } else if (iJ == 16) {
                                    this.f22765c |= 2;
                                    this.f22767e = eVar.r();
                                } else if (iJ != 24) {
                                    if (!y(eVar, codedOutputStreamI, fVar, iJ)) {
                                    }
                                } else {
                                    int iM = eVar.m();
                                    EnumC0835c enumC0835cValueOf = EnumC0835c.valueOf(iM);
                                    if (enumC0835cValueOf == null) {
                                        codedOutputStreamI.n0(iJ);
                                        codedOutputStreamI.n0(iM);
                                    } else {
                                        this.f22765c |= 4;
                                        this.f22768f = enumC0835cValueOf;
                                    }
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
                        this.f22764b = bVarU.p();
                        throw th3;
                    }
                    this.f22764b = bVarU.p();
                    s();
                    throw th2;
                }
            }
            try {
                codedOutputStreamI.H();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f22764b = bVarU.p();
                throw th4;
            }
            this.f22764b = bVarU.p();
            s();
        }
    }

    private o(h.b bVar) {
        super(bVar);
        this.f22758d = (byte) -1;
        this.f22759e = -1;
        this.f22756b = bVar.e();
    }

    private o(boolean z10) {
        this.f22758d = (byte) -1;
        this.f22759e = -1;
        this.f22756b = kotlin.reflect.jvm.internal.impl.protobuf.d.f51945a;
    }

    private o(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
        this.f22758d = (byte) -1;
        this.f22759e = -1;
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
                                    this.f22757c = new ArrayList();
                                    z11 = true;
                                }
                                this.f22757c.add(eVar.t(c.f22763j, fVar));
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
                    this.f22757c = Collections.unmodifiableList(this.f22757c);
                }
                try {
                    codedOutputStreamI.H();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f22756b = bVarU.p();
                    throw th3;
                }
                this.f22756b = bVarU.p();
                s();
                throw th2;
            }
        }
        if (z11) {
            this.f22757c = Collections.unmodifiableList(this.f22757c);
        }
        try {
            codedOutputStreamI.H();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f22756b = bVarU.p();
            throw th4;
        }
        this.f22756b = bVarU.p();
        s();
    }
}
