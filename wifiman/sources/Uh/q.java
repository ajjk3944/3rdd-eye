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
import org.conscrypt.PSKKeyManager;

/* loaded from: classes4.dex */
public final class q extends h.d implements kotlin.reflect.jvm.internal.impl.protobuf.o {

    /* renamed from: u, reason: collision with root package name */
    private static final q f22783u;

    /* renamed from: v, reason: collision with root package name */
    public static kotlin.reflect.jvm.internal.impl.protobuf.p f22784v = new a();

    /* renamed from: c, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.protobuf.d f22785c;

    /* renamed from: d, reason: collision with root package name */
    private int f22786d;

    /* renamed from: e, reason: collision with root package name */
    private List f22787e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f22788f;

    /* renamed from: g, reason: collision with root package name */
    private int f22789g;

    /* renamed from: h, reason: collision with root package name */
    private q f22790h;

    /* renamed from: i, reason: collision with root package name */
    private int f22791i;

    /* renamed from: j, reason: collision with root package name */
    private int f22792j;

    /* renamed from: k, reason: collision with root package name */
    private int f22793k;

    /* renamed from: l, reason: collision with root package name */
    private int f22794l;

    /* renamed from: m, reason: collision with root package name */
    private int f22795m;

    /* renamed from: n, reason: collision with root package name */
    private q f22796n;

    /* renamed from: o, reason: collision with root package name */
    private int f22797o;

    /* renamed from: p, reason: collision with root package name */
    private q f22798p;

    /* renamed from: q, reason: collision with root package name */
    private int f22799q;

    /* renamed from: r, reason: collision with root package name */
    private int f22800r;

    /* renamed from: s, reason: collision with root package name */
    private byte f22801s;

    /* renamed from: t, reason: collision with root package name */
    private int f22802t;

    static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public q b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
            return new q(eVar, fVar);
        }
    }

    public static final class c extends h.c implements kotlin.reflect.jvm.internal.impl.protobuf.o {

        /* renamed from: d, reason: collision with root package name */
        private int f22816d;

        /* renamed from: f, reason: collision with root package name */
        private boolean f22818f;

        /* renamed from: g, reason: collision with root package name */
        private int f22819g;

        /* renamed from: i, reason: collision with root package name */
        private int f22821i;

        /* renamed from: j, reason: collision with root package name */
        private int f22822j;

        /* renamed from: k, reason: collision with root package name */
        private int f22823k;

        /* renamed from: l, reason: collision with root package name */
        private int f22824l;

        /* renamed from: m, reason: collision with root package name */
        private int f22825m;

        /* renamed from: o, reason: collision with root package name */
        private int f22827o;

        /* renamed from: q, reason: collision with root package name */
        private int f22829q;

        /* renamed from: r, reason: collision with root package name */
        private int f22830r;

        /* renamed from: e, reason: collision with root package name */
        private List f22817e = Collections.emptyList();

        /* renamed from: h, reason: collision with root package name */
        private q f22820h = q.h1();

        /* renamed from: n, reason: collision with root package name */
        private q f22826n = q.h1();

        /* renamed from: p, reason: collision with root package name */
        private q f22828p = q.h1();

        private c() {
            A();
        }

        private void A() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static c x() {
            return new c();
        }

        private void z() {
            if ((this.f22816d & 1) != 1) {
                this.f22817e = new ArrayList(this.f22817e);
                this.f22816d |= 1;
            }
        }

        public c B(q qVar) {
            if ((this.f22816d & 2048) != 2048 || this.f22828p == q.h1()) {
                this.f22828p = qVar;
            } else {
                this.f22828p = q.I1(this.f22828p).f(qVar).u();
            }
            this.f22816d |= 2048;
            return this;
        }

        public c D(q qVar) {
            if ((this.f22816d & 8) != 8 || this.f22820h == q.h1()) {
                this.f22820h = qVar;
            } else {
                this.f22820h = q.I1(this.f22820h).f(qVar).u();
            }
            this.f22816d |= 8;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: E, reason: merged with bridge method [inline-methods] */
        public c f(q qVar) {
            if (qVar == q.h1()) {
                return this;
            }
            if (!qVar.f22787e.isEmpty()) {
                if (this.f22817e.isEmpty()) {
                    this.f22817e = qVar.f22787e;
                    this.f22816d &= -2;
                } else {
                    z();
                    this.f22817e.addAll(qVar.f22787e);
                }
            }
            if (qVar.A1()) {
                N(qVar.n1());
            }
            if (qVar.x1()) {
                L(qVar.k1());
            }
            if (qVar.y1()) {
                D(qVar.l1());
            }
            if (qVar.z1()) {
                M(qVar.m1());
            }
            if (qVar.v1()) {
                I(qVar.g1());
            }
            if (qVar.E1()) {
                Q(qVar.r1());
            }
            if (qVar.F1()) {
                R(qVar.s1());
            }
            if (qVar.D1()) {
                P(qVar.q1());
            }
            if (qVar.B1()) {
                G(qVar.o1());
            }
            if (qVar.C1()) {
                O(qVar.p1());
            }
            if (qVar.t1()) {
                B(qVar.b1());
            }
            if (qVar.u1()) {
                H(qVar.c1());
            }
            if (qVar.w1()) {
                K(qVar.j1());
            }
            q(qVar);
            i(e().e(qVar.f22785c));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n.a
        /* renamed from: F, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public Uh.q.c b0(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.p r1 = Uh.q.f22784v     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                Uh.q r3 = (Uh.q) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                Uh.q r4 = (Uh.q) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: Uh.q.c.b0(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):Uh.q$c");
        }

        public c G(q qVar) {
            if ((this.f22816d & 512) != 512 || this.f22826n == q.h1()) {
                this.f22826n = qVar;
            } else {
                this.f22826n = q.I1(this.f22826n).f(qVar).u();
            }
            this.f22816d |= 512;
            return this;
        }

        public c H(int i10) {
            this.f22816d |= 4096;
            this.f22829q = i10;
            return this;
        }

        public c I(int i10) {
            this.f22816d |= 32;
            this.f22822j = i10;
            return this;
        }

        public c K(int i10) {
            this.f22816d |= 8192;
            this.f22830r = i10;
            return this;
        }

        public c L(int i10) {
            this.f22816d |= 4;
            this.f22819g = i10;
            return this;
        }

        public c M(int i10) {
            this.f22816d |= 16;
            this.f22821i = i10;
            return this;
        }

        public c N(boolean z10) {
            this.f22816d |= 2;
            this.f22818f = z10;
            return this;
        }

        public c O(int i10) {
            this.f22816d |= 1024;
            this.f22827o = i10;
            return this;
        }

        public c P(int i10) {
            this.f22816d |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            this.f22825m = i10;
            return this;
        }

        public c Q(int i10) {
            this.f22816d |= 64;
            this.f22823k = i10;
            return this;
        }

        public c R(int i10) {
            this.f22816d |= 128;
            this.f22824l = i10;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n.a
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public q a() {
            q qVarU = u();
            if (qVarU.m()) {
                return qVarU;
            }
            throw a.AbstractC1921a.b(qVarU);
        }

        public q u() {
            q qVar = new q(this);
            int i10 = this.f22816d;
            if ((i10 & 1) == 1) {
                this.f22817e = Collections.unmodifiableList(this.f22817e);
                this.f22816d &= -2;
            }
            qVar.f22787e = this.f22817e;
            int i11 = (i10 & 2) != 2 ? 0 : 1;
            qVar.f22788f = this.f22818f;
            if ((i10 & 4) == 4) {
                i11 |= 2;
            }
            qVar.f22789g = this.f22819g;
            if ((i10 & 8) == 8) {
                i11 |= 4;
            }
            qVar.f22790h = this.f22820h;
            if ((i10 & 16) == 16) {
                i11 |= 8;
            }
            qVar.f22791i = this.f22821i;
            if ((i10 & 32) == 32) {
                i11 |= 16;
            }
            qVar.f22792j = this.f22822j;
            if ((i10 & 64) == 64) {
                i11 |= 32;
            }
            qVar.f22793k = this.f22823k;
            if ((i10 & 128) == 128) {
                i11 |= 64;
            }
            qVar.f22794l = this.f22824l;
            if ((i10 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
                i11 |= 128;
            }
            qVar.f22795m = this.f22825m;
            if ((i10 & 512) == 512) {
                i11 |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            }
            qVar.f22796n = this.f22826n;
            if ((i10 & 1024) == 1024) {
                i11 |= 512;
            }
            qVar.f22797o = this.f22827o;
            if ((i10 & 2048) == 2048) {
                i11 |= 1024;
            }
            qVar.f22798p = this.f22828p;
            if ((i10 & 4096) == 4096) {
                i11 |= 2048;
            }
            qVar.f22799q = this.f22829q;
            if ((i10 & 8192) == 8192) {
                i11 |= 4096;
            }
            qVar.f22800r = this.f22830r;
            qVar.f22786d = i11;
            return qVar;
        }

        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public c clone() {
            return x().f(u());
        }
    }

    static {
        q qVar = new q(true);
        f22783u = qVar;
        qVar.G1();
    }

    private void G1() {
        this.f22787e = Collections.emptyList();
        this.f22788f = false;
        this.f22789g = 0;
        this.f22790h = h1();
        this.f22791i = 0;
        this.f22792j = 0;
        this.f22793k = 0;
        this.f22794l = 0;
        this.f22795m = 0;
        this.f22796n = h1();
        this.f22797o = 0;
        this.f22798p = h1();
        this.f22799q = 0;
        this.f22800r = 0;
    }

    public static c H1() {
        return c.x();
    }

    public static c I1(q qVar) {
        return H1().f(qVar);
    }

    public static q h1() {
        return f22783u;
    }

    public boolean A1() {
        return (this.f22786d & 1) == 1;
    }

    public boolean B1() {
        return (this.f22786d & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256;
    }

    public boolean C1() {
        return (this.f22786d & 512) == 512;
    }

    public boolean D1() {
        return (this.f22786d & 128) == 128;
    }

    public boolean E1() {
        return (this.f22786d & 32) == 32;
    }

    public boolean F1() {
        return (this.f22786d & 64) == 64;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
    /* renamed from: J1, reason: merged with bridge method [inline-methods] */
    public c h() {
        return H1();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
    /* renamed from: K1, reason: merged with bridge method [inline-methods] */
    public c l() {
        return I1(this);
    }

    public q b1() {
        return this.f22798p;
    }

    public int c1() {
        return this.f22799q;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
    public int d() {
        int i10 = this.f22802t;
        if (i10 != -1) {
            return i10;
        }
        int iO = (this.f22786d & 4096) == 4096 ? CodedOutputStream.o(1, this.f22800r) : 0;
        for (int i11 = 0; i11 < this.f22787e.size(); i11++) {
            iO += CodedOutputStream.r(2, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.f22787e.get(i11));
        }
        if ((this.f22786d & 1) == 1) {
            iO += CodedOutputStream.a(3, this.f22788f);
        }
        if ((this.f22786d & 2) == 2) {
            iO += CodedOutputStream.o(4, this.f22789g);
        }
        if ((this.f22786d & 4) == 4) {
            iO += CodedOutputStream.r(5, this.f22790h);
        }
        if ((this.f22786d & 16) == 16) {
            iO += CodedOutputStream.o(6, this.f22792j);
        }
        if ((this.f22786d & 32) == 32) {
            iO += CodedOutputStream.o(7, this.f22793k);
        }
        if ((this.f22786d & 8) == 8) {
            iO += CodedOutputStream.o(8, this.f22791i);
        }
        if ((this.f22786d & 64) == 64) {
            iO += CodedOutputStream.o(9, this.f22794l);
        }
        if ((this.f22786d & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
            iO += CodedOutputStream.r(10, this.f22796n);
        }
        if ((this.f22786d & 512) == 512) {
            iO += CodedOutputStream.o(11, this.f22797o);
        }
        if ((this.f22786d & 128) == 128) {
            iO += CodedOutputStream.o(12, this.f22795m);
        }
        if ((this.f22786d & 1024) == 1024) {
            iO += CodedOutputStream.r(13, this.f22798p);
        }
        if ((this.f22786d & 2048) == 2048) {
            iO += CodedOutputStream.o(14, this.f22799q);
        }
        int iF = iO + F() + this.f22785c.size();
        this.f22802t = iF;
        return iF;
    }

    public b d1(int i10) {
        return (b) this.f22787e.get(i10);
    }

    public int e1() {
        return this.f22787e.size();
    }

    public List f1() {
        return this.f22787e;
    }

    public int g1() {
        return this.f22792j;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    /* renamed from: i1, reason: merged with bridge method [inline-methods] */
    public q c() {
        return f22783u;
    }

    public int j1() {
        return this.f22800r;
    }

    public int k1() {
        return this.f22789g;
    }

    public q l1() {
        return this.f22790h;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public final boolean m() {
        byte b10 = this.f22801s;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < e1(); i10++) {
            if (!d1(i10).m()) {
                this.f22801s = (byte) 0;
                return false;
            }
        }
        if (y1() && !l1().m()) {
            this.f22801s = (byte) 0;
            return false;
        }
        if (B1() && !o1().m()) {
            this.f22801s = (byte) 0;
            return false;
        }
        if (t1() && !b1().m()) {
            this.f22801s = (byte) 0;
            return false;
        }
        if (E()) {
            this.f22801s = (byte) 1;
            return true;
        }
        this.f22801s = (byte) 0;
        return false;
    }

    public int m1() {
        return this.f22791i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
    public void n(CodedOutputStream codedOutputStream) throws IOException {
        d();
        h.d.a aVarT = T();
        if ((this.f22786d & 4096) == 4096) {
            codedOutputStream.Z(1, this.f22800r);
        }
        for (int i10 = 0; i10 < this.f22787e.size(); i10++) {
            codedOutputStream.c0(2, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.f22787e.get(i10));
        }
        if ((this.f22786d & 1) == 1) {
            codedOutputStream.K(3, this.f22788f);
        }
        if ((this.f22786d & 2) == 2) {
            codedOutputStream.Z(4, this.f22789g);
        }
        if ((this.f22786d & 4) == 4) {
            codedOutputStream.c0(5, this.f22790h);
        }
        if ((this.f22786d & 16) == 16) {
            codedOutputStream.Z(6, this.f22792j);
        }
        if ((this.f22786d & 32) == 32) {
            codedOutputStream.Z(7, this.f22793k);
        }
        if ((this.f22786d & 8) == 8) {
            codedOutputStream.Z(8, this.f22791i);
        }
        if ((this.f22786d & 64) == 64) {
            codedOutputStream.Z(9, this.f22794l);
        }
        if ((this.f22786d & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
            codedOutputStream.c0(10, this.f22796n);
        }
        if ((this.f22786d & 512) == 512) {
            codedOutputStream.Z(11, this.f22797o);
        }
        if ((this.f22786d & 128) == 128) {
            codedOutputStream.Z(12, this.f22795m);
        }
        if ((this.f22786d & 1024) == 1024) {
            codedOutputStream.c0(13, this.f22798p);
        }
        if ((this.f22786d & 2048) == 2048) {
            codedOutputStream.Z(14, this.f22799q);
        }
        aVarT.a(200, codedOutputStream);
        codedOutputStream.h0(this.f22785c);
    }

    public boolean n1() {
        return this.f22788f;
    }

    public q o1() {
        return this.f22796n;
    }

    public int p1() {
        return this.f22797o;
    }

    public int q1() {
        return this.f22795m;
    }

    public int r1() {
        return this.f22793k;
    }

    public int s1() {
        return this.f22794l;
    }

    public boolean t1() {
        return (this.f22786d & 1024) == 1024;
    }

    public boolean u1() {
        return (this.f22786d & 2048) == 2048;
    }

    public boolean v1() {
        return (this.f22786d & 16) == 16;
    }

    public boolean w1() {
        return (this.f22786d & 4096) == 4096;
    }

    public boolean x1() {
        return (this.f22786d & 2) == 2;
    }

    public boolean y1() {
        return (this.f22786d & 4) == 4;
    }

    public boolean z1() {
        return (this.f22786d & 8) == 8;
    }

    public static final class b extends kotlin.reflect.jvm.internal.impl.protobuf.h implements kotlin.reflect.jvm.internal.impl.protobuf.o {

        /* renamed from: i, reason: collision with root package name */
        private static final b f22803i;

        /* renamed from: j, reason: collision with root package name */
        public static kotlin.reflect.jvm.internal.impl.protobuf.p f22804j = new a();

        /* renamed from: b, reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.protobuf.d f22805b;

        /* renamed from: c, reason: collision with root package name */
        private int f22806c;

        /* renamed from: d, reason: collision with root package name */
        private c f22807d;

        /* renamed from: e, reason: collision with root package name */
        private q f22808e;

        /* renamed from: f, reason: collision with root package name */
        private int f22809f;

        /* renamed from: g, reason: collision with root package name */
        private byte f22810g;

        /* renamed from: h, reason: collision with root package name */
        private int f22811h;

        static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b {
            a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public b b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
                return new b(eVar, fVar);
            }
        }

        /* renamed from: Uh.q$b$b, reason: collision with other inner class name */
        public static final class C0836b extends h.b implements kotlin.reflect.jvm.internal.impl.protobuf.o {

            /* renamed from: b, reason: collision with root package name */
            private int f22812b;

            /* renamed from: c, reason: collision with root package name */
            private c f22813c = c.INV;

            /* renamed from: d, reason: collision with root package name */
            private q f22814d = q.h1();

            /* renamed from: e, reason: collision with root package name */
            private int f22815e;

            private C0836b() {
                t();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static C0836b r() {
                return new C0836b();
            }

            private void t() {
            }

            public C0836b A(int i10) {
                this.f22812b |= 4;
                this.f22815e = i10;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.n.a
            /* renamed from: o, reason: merged with bridge method [inline-methods] */
            public b a() {
                b bVarP = p();
                if (bVarP.m()) {
                    return bVarP;
                }
                throw a.AbstractC1921a.b(bVarP);
            }

            public b p() {
                b bVar = new b(this);
                int i10 = this.f22812b;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                bVar.f22807d = this.f22813c;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                bVar.f22808e = this.f22814d;
                if ((i10 & 4) == 4) {
                    i11 |= 4;
                }
                bVar.f22809f = this.f22815e;
                bVar.f22806c = i11;
                return bVar;
            }

            /* renamed from: q, reason: merged with bridge method [inline-methods] */
            public C0836b clone() {
                return r().f(p());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: u, reason: merged with bridge method [inline-methods] */
            public C0836b f(b bVar) {
                if (bVar == b.P()) {
                    return this;
                }
                if (bVar.f0()) {
                    z(bVar.S());
                }
                if (bVar.q0()) {
                    x(bVar.T());
                }
                if (bVar.C0()) {
                    A(bVar.d0());
                }
                i(e().e(bVar.f22805b));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.n.a
            /* renamed from: w, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public Uh.q.b.C0836b b0(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.p r1 = Uh.q.b.f22804j     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    Uh.q$b r3 = (Uh.q.b) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                    Uh.q$b r4 = (Uh.q.b) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: Uh.q.b.C0836b.b0(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):Uh.q$b$b");
            }

            public C0836b x(q qVar) {
                if ((this.f22812b & 2) != 2 || this.f22814d == q.h1()) {
                    this.f22814d = qVar;
                } else {
                    this.f22814d = q.I1(this.f22814d).f(qVar).u();
                }
                this.f22812b |= 2;
                return this;
            }

            public C0836b z(c cVar) {
                cVar.getClass();
                this.f22812b |= 1;
                this.f22813c = cVar;
                return this;
            }
        }

        public enum c implements i.a {
            IN(0, 0),
            OUT(1, 1),
            INV(2, 2),
            STAR(3, 3);

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
                    return IN;
                }
                if (i10 == 1) {
                    return OUT;
                }
                if (i10 == 2) {
                    return INV;
                }
                if (i10 != 3) {
                    return null;
                }
                return STAR;
            }
        }

        static {
            b bVar = new b(true);
            f22803i = bVar;
            bVar.E0();
        }

        private void E0() {
            this.f22807d = c.INV;
            this.f22808e = q.h1();
            this.f22809f = 0;
        }

        public static C0836b G0() {
            return C0836b.r();
        }

        public static C0836b K0(b bVar) {
            return G0().f(bVar);
        }

        public static b P() {
            return f22803i;
        }

        public boolean C0() {
            return (this.f22806c & 4) == 4;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        /* renamed from: M0, reason: merged with bridge method [inline-methods] */
        public C0836b h() {
            return G0();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        /* renamed from: N0, reason: merged with bridge method [inline-methods] */
        public C0836b l() {
            return K0(this);
        }

        public c S() {
            return this.f22807d;
        }

        public q T() {
            return this.f22808e;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public int d() {
            int i10 = this.f22811h;
            if (i10 != -1) {
                return i10;
            }
            int iH = (this.f22806c & 1) == 1 ? CodedOutputStream.h(1, this.f22807d.getNumber()) : 0;
            if ((this.f22806c & 2) == 2) {
                iH += CodedOutputStream.r(2, this.f22808e);
            }
            if ((this.f22806c & 4) == 4) {
                iH += CodedOutputStream.o(3, this.f22809f);
            }
            int size = iH + this.f22805b.size();
            this.f22811h = size;
            return size;
        }

        public int d0() {
            return this.f22809f;
        }

        public boolean f0() {
            return (this.f22806c & 1) == 1;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final boolean m() {
            byte b10 = this.f22810g;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            if (!q0() || T().m()) {
                this.f22810g = (byte) 1;
                return true;
            }
            this.f22810g = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public void n(CodedOutputStream codedOutputStream) throws IOException {
            d();
            if ((this.f22806c & 1) == 1) {
                codedOutputStream.R(1, this.f22807d.getNumber());
            }
            if ((this.f22806c & 2) == 2) {
                codedOutputStream.c0(2, this.f22808e);
            }
            if ((this.f22806c & 4) == 4) {
                codedOutputStream.Z(3, this.f22809f);
            }
            codedOutputStream.h0(this.f22805b);
        }

        public boolean q0() {
            return (this.f22806c & 2) == 2;
        }

        private b(h.b bVar) {
            super(bVar);
            this.f22810g = (byte) -1;
            this.f22811h = -1;
            this.f22805b = bVar.e();
        }

        private b(boolean z10) {
            this.f22810g = (byte) -1;
            this.f22811h = -1;
            this.f22805b = kotlin.reflect.jvm.internal.impl.protobuf.d.f51945a;
        }

        private b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
            this.f22810g = (byte) -1;
            this.f22811h = -1;
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
                                    int iM = eVar.m();
                                    c cVarValueOf = c.valueOf(iM);
                                    if (cVarValueOf == null) {
                                        codedOutputStreamI.n0(iJ);
                                        codedOutputStreamI.n0(iM);
                                    } else {
                                        this.f22806c |= 1;
                                        this.f22807d = cVarValueOf;
                                    }
                                } else if (iJ == 18) {
                                    c cVarL = (this.f22806c & 2) == 2 ? this.f22808e.l() : null;
                                    q qVar = (q) eVar.t(q.f22784v, fVar);
                                    this.f22808e = qVar;
                                    if (cVarL != null) {
                                        cVarL.f(qVar);
                                        this.f22808e = cVarL.u();
                                    }
                                    this.f22806c |= 2;
                                } else if (iJ != 24) {
                                    if (!y(eVar, codedOutputStreamI, fVar, iJ)) {
                                    }
                                } else {
                                    this.f22806c |= 4;
                                    this.f22809f = eVar.r();
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
                        this.f22805b = bVarU.p();
                        throw th3;
                    }
                    this.f22805b = bVarU.p();
                    s();
                    throw th2;
                }
            }
            try {
                codedOutputStreamI.H();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f22805b = bVarU.p();
                throw th4;
            }
            this.f22805b = bVarU.p();
            s();
        }
    }

    private q(h.c cVar) {
        super(cVar);
        this.f22801s = (byte) -1;
        this.f22802t = -1;
        this.f22785c = cVar.e();
    }

    private q(boolean z10) {
        this.f22801s = (byte) -1;
        this.f22802t = -1;
        this.f22785c = kotlin.reflect.jvm.internal.impl.protobuf.d.f51945a;
    }

    private q(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
        c cVarL;
        this.f22801s = (byte) -1;
        this.f22802t = -1;
        G1();
        d.b bVarU = kotlin.reflect.jvm.internal.impl.protobuf.d.u();
        CodedOutputStream codedOutputStreamI = CodedOutputStream.I(bVarU, 1);
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            try {
                try {
                    try {
                        int iJ = eVar.J();
                        switch (iJ) {
                            case 0:
                                z10 = true;
                            case 8:
                                this.f22786d |= 4096;
                                this.f22800r = eVar.r();
                            case 18:
                                if (!z11) {
                                    this.f22787e = new ArrayList();
                                    z11 = true;
                                }
                                this.f22787e.add(eVar.t(b.f22804j, fVar));
                            case 24:
                                this.f22786d |= 1;
                                this.f22788f = eVar.j();
                            case 32:
                                this.f22786d |= 2;
                                this.f22789g = eVar.r();
                            case 42:
                                cVarL = (this.f22786d & 4) == 4 ? this.f22790h.l() : null;
                                q qVar = (q) eVar.t(f22784v, fVar);
                                this.f22790h = qVar;
                                if (cVarL != null) {
                                    cVarL.f(qVar);
                                    this.f22790h = cVarL.u();
                                }
                                this.f22786d |= 4;
                            case 48:
                                this.f22786d |= 16;
                                this.f22792j = eVar.r();
                            case 56:
                                this.f22786d |= 32;
                                this.f22793k = eVar.r();
                            case 64:
                                this.f22786d |= 8;
                                this.f22791i = eVar.r();
                            case 72:
                                this.f22786d |= 64;
                                this.f22794l = eVar.r();
                            case 82:
                                cVarL = (this.f22786d & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256 ? this.f22796n.l() : null;
                                q qVar2 = (q) eVar.t(f22784v, fVar);
                                this.f22796n = qVar2;
                                if (cVarL != null) {
                                    cVarL.f(qVar2);
                                    this.f22796n = cVarL.u();
                                }
                                this.f22786d |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                            case 88:
                                this.f22786d |= 512;
                                this.f22797o = eVar.r();
                            case 96:
                                this.f22786d |= 128;
                                this.f22795m = eVar.r();
                            case 106:
                                cVarL = (this.f22786d & 1024) == 1024 ? this.f22798p.l() : null;
                                q qVar3 = (q) eVar.t(f22784v, fVar);
                                this.f22798p = qVar3;
                                if (cVarL != null) {
                                    cVarL.f(qVar3);
                                    this.f22798p = cVarL.u();
                                }
                                this.f22786d |= 1024;
                            case 112:
                                this.f22786d |= 2048;
                                this.f22799q = eVar.r();
                            default:
                                if (!y(eVar, codedOutputStreamI, fVar, iJ)) {
                                    z10 = true;
                                }
                        }
                    } catch (IOException e10) {
                        throw new InvalidProtocolBufferException(e10.getMessage()).n(this);
                    }
                } catch (InvalidProtocolBufferException e11) {
                    throw e11.n(this);
                }
            } catch (Throwable th2) {
                if (z11) {
                    this.f22787e = Collections.unmodifiableList(this.f22787e);
                }
                try {
                    codedOutputStreamI.H();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f22785c = bVarU.p();
                    throw th3;
                }
                this.f22785c = bVarU.p();
                s();
                throw th2;
            }
        }
        if (z11) {
            this.f22787e = Collections.unmodifiableList(this.f22787e);
        }
        try {
            codedOutputStreamI.H();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f22785c = bVarU.p();
            throw th4;
        }
        this.f22785c = bVarU.p();
        s();
    }
}
