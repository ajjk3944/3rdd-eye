package Uh;

import Uh.q;
import Uh.u;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.a;
import kotlin.reflect.jvm.internal.impl.protobuf.d;
import kotlin.reflect.jvm.internal.impl.protobuf.h;
import net.sqlcipher.database.SQLiteDatabase;
import org.conscrypt.PSKKeyManager;

/* loaded from: classes4.dex */
public final class n extends h.d implements kotlin.reflect.jvm.internal.impl.protobuf.o {

    /* renamed from: v, reason: collision with root package name */
    private static final n f22718v;

    /* renamed from: w, reason: collision with root package name */
    public static kotlin.reflect.jvm.internal.impl.protobuf.p f22719w = new a();

    /* renamed from: c, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.protobuf.d f22720c;

    /* renamed from: d, reason: collision with root package name */
    private int f22721d;

    /* renamed from: e, reason: collision with root package name */
    private int f22722e;

    /* renamed from: f, reason: collision with root package name */
    private int f22723f;

    /* renamed from: g, reason: collision with root package name */
    private int f22724g;

    /* renamed from: h, reason: collision with root package name */
    private q f22725h;

    /* renamed from: i, reason: collision with root package name */
    private int f22726i;

    /* renamed from: j, reason: collision with root package name */
    private List f22727j;

    /* renamed from: k, reason: collision with root package name */
    private q f22728k;

    /* renamed from: l, reason: collision with root package name */
    private int f22729l;

    /* renamed from: m, reason: collision with root package name */
    private List f22730m;

    /* renamed from: n, reason: collision with root package name */
    private List f22731n;

    /* renamed from: o, reason: collision with root package name */
    private int f22732o;

    /* renamed from: p, reason: collision with root package name */
    private u f22733p;

    /* renamed from: q, reason: collision with root package name */
    private int f22734q;

    /* renamed from: r, reason: collision with root package name */
    private int f22735r;

    /* renamed from: s, reason: collision with root package name */
    private List f22736s;

    /* renamed from: t, reason: collision with root package name */
    private byte f22737t;

    /* renamed from: u, reason: collision with root package name */
    private int f22738u;

    static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public n b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
            return new n(eVar, fVar);
        }
    }

    public static final class b extends h.c implements kotlin.reflect.jvm.internal.impl.protobuf.o {

        /* renamed from: d, reason: collision with root package name */
        private int f22739d;

        /* renamed from: g, reason: collision with root package name */
        private int f22742g;

        /* renamed from: i, reason: collision with root package name */
        private int f22744i;

        /* renamed from: l, reason: collision with root package name */
        private int f22747l;

        /* renamed from: p, reason: collision with root package name */
        private int f22751p;

        /* renamed from: q, reason: collision with root package name */
        private int f22752q;

        /* renamed from: e, reason: collision with root package name */
        private int f22740e = 518;

        /* renamed from: f, reason: collision with root package name */
        private int f22741f = 2054;

        /* renamed from: h, reason: collision with root package name */
        private q f22743h = q.h1();

        /* renamed from: j, reason: collision with root package name */
        private List f22745j = Collections.emptyList();

        /* renamed from: k, reason: collision with root package name */
        private q f22746k = q.h1();

        /* renamed from: m, reason: collision with root package name */
        private List f22748m = Collections.emptyList();

        /* renamed from: n, reason: collision with root package name */
        private List f22749n = Collections.emptyList();

        /* renamed from: o, reason: collision with root package name */
        private u f22750o = u.P0();

        /* renamed from: r, reason: collision with root package name */
        private List f22753r = Collections.emptyList();

        private b() {
            E();
        }

        private void A() {
            if ((this.f22739d & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 256) {
                this.f22748m = new ArrayList(this.f22748m);
                this.f22739d |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            }
        }

        private void B() {
            if ((this.f22739d & 32) != 32) {
                this.f22745j = new ArrayList(this.f22745j);
                this.f22739d |= 32;
            }
        }

        private void D() {
            if ((this.f22739d & 8192) != 8192) {
                this.f22753r = new ArrayList(this.f22753r);
                this.f22739d |= 8192;
            }
        }

        private void E() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b x() {
            return new b();
        }

        private void z() {
            if ((this.f22739d & 512) != 512) {
                this.f22749n = new ArrayList(this.f22749n);
                this.f22739d |= 512;
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: F, reason: merged with bridge method [inline-methods] */
        public b f(n nVar) {
            if (nVar == n.i1()) {
                return this;
            }
            if (nVar.y1()) {
                L(nVar.k1());
            }
            if (nVar.B1()) {
                O(nVar.n1());
            }
            if (nVar.A1()) {
                N(nVar.m1());
            }
            if (nVar.E1()) {
                I(nVar.q1());
            }
            if (nVar.F1()) {
                Q(nVar.r1());
            }
            if (!nVar.f22727j.isEmpty()) {
                if (this.f22745j.isEmpty()) {
                    this.f22745j = nVar.f22727j;
                    this.f22739d &= -33;
                } else {
                    B();
                    this.f22745j.addAll(nVar.f22727j);
                }
            }
            if (nVar.C1()) {
                H(nVar.o1());
            }
            if (nVar.D1()) {
                P(nVar.p1());
            }
            if (!nVar.f22730m.isEmpty()) {
                if (this.f22748m.isEmpty()) {
                    this.f22748m = nVar.f22730m;
                    this.f22739d &= -257;
                } else {
                    A();
                    this.f22748m.addAll(nVar.f22730m);
                }
            }
            if (!nVar.f22731n.isEmpty()) {
                if (this.f22749n.isEmpty()) {
                    this.f22749n = nVar.f22731n;
                    this.f22739d &= -513;
                } else {
                    z();
                    this.f22749n.addAll(nVar.f22731n);
                }
            }
            if (nVar.H1()) {
                K(nVar.t1());
            }
            if (nVar.z1()) {
                M(nVar.l1());
            }
            if (nVar.G1()) {
                R(nVar.s1());
            }
            if (!nVar.f22736s.isEmpty()) {
                if (this.f22753r.isEmpty()) {
                    this.f22753r = nVar.f22736s;
                    this.f22739d &= -8193;
                } else {
                    D();
                    this.f22753r.addAll(nVar.f22736s);
                }
            }
            q(nVar);
            i(e().e(nVar.f22720c));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n.a
        /* renamed from: G, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public Uh.n.b b0(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.p r1 = Uh.n.f22719w     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                Uh.n r3 = (Uh.n) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                Uh.n r4 = (Uh.n) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: Uh.n.b.b0(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):Uh.n$b");
        }

        public b H(q qVar) {
            if ((this.f22739d & 64) != 64 || this.f22746k == q.h1()) {
                this.f22746k = qVar;
            } else {
                this.f22746k = q.I1(this.f22746k).f(qVar).u();
            }
            this.f22739d |= 64;
            return this;
        }

        public b I(q qVar) {
            if ((this.f22739d & 8) != 8 || this.f22743h == q.h1()) {
                this.f22743h = qVar;
            } else {
                this.f22743h = q.I1(this.f22743h).f(qVar).u();
            }
            this.f22739d |= 8;
            return this;
        }

        public b K(u uVar) {
            if ((this.f22739d & 1024) != 1024 || this.f22750o == u.P0()) {
                this.f22750o = uVar;
            } else {
                this.f22750o = u.i1(this.f22750o).f(uVar).u();
            }
            this.f22739d |= 1024;
            return this;
        }

        public b L(int i10) {
            this.f22739d |= 1;
            this.f22740e = i10;
            return this;
        }

        public b M(int i10) {
            this.f22739d |= 2048;
            this.f22751p = i10;
            return this;
        }

        public b N(int i10) {
            this.f22739d |= 4;
            this.f22742g = i10;
            return this;
        }

        public b O(int i10) {
            this.f22739d |= 2;
            this.f22741f = i10;
            return this;
        }

        public b P(int i10) {
            this.f22739d |= 128;
            this.f22747l = i10;
            return this;
        }

        public b Q(int i10) {
            this.f22739d |= 16;
            this.f22744i = i10;
            return this;
        }

        public b R(int i10) {
            this.f22739d |= 4096;
            this.f22752q = i10;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n.a
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public n a() {
            n nVarU = u();
            if (nVarU.m()) {
                return nVarU;
            }
            throw a.AbstractC1921a.b(nVarU);
        }

        public n u() {
            n nVar = new n(this);
            int i10 = this.f22739d;
            int i11 = (i10 & 1) != 1 ? 0 : 1;
            nVar.f22722e = this.f22740e;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            nVar.f22723f = this.f22741f;
            if ((i10 & 4) == 4) {
                i11 |= 4;
            }
            nVar.f22724g = this.f22742g;
            if ((i10 & 8) == 8) {
                i11 |= 8;
            }
            nVar.f22725h = this.f22743h;
            if ((i10 & 16) == 16) {
                i11 |= 16;
            }
            nVar.f22726i = this.f22744i;
            if ((this.f22739d & 32) == 32) {
                this.f22745j = Collections.unmodifiableList(this.f22745j);
                this.f22739d &= -33;
            }
            nVar.f22727j = this.f22745j;
            if ((i10 & 64) == 64) {
                i11 |= 32;
            }
            nVar.f22728k = this.f22746k;
            if ((i10 & 128) == 128) {
                i11 |= 64;
            }
            nVar.f22729l = this.f22747l;
            if ((this.f22739d & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
                this.f22748m = Collections.unmodifiableList(this.f22748m);
                this.f22739d &= -257;
            }
            nVar.f22730m = this.f22748m;
            if ((this.f22739d & 512) == 512) {
                this.f22749n = Collections.unmodifiableList(this.f22749n);
                this.f22739d &= -513;
            }
            nVar.f22731n = this.f22749n;
            if ((i10 & 1024) == 1024) {
                i11 |= 128;
            }
            nVar.f22733p = this.f22750o;
            if ((i10 & 2048) == 2048) {
                i11 |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            }
            nVar.f22734q = this.f22751p;
            if ((i10 & 4096) == 4096) {
                i11 |= 512;
            }
            nVar.f22735r = this.f22752q;
            if ((this.f22739d & 8192) == 8192) {
                this.f22753r = Collections.unmodifiableList(this.f22753r);
                this.f22739d &= -8193;
            }
            nVar.f22736s = this.f22753r;
            nVar.f22721d = i11;
            return nVar;
        }

        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return x().f(u());
        }
    }

    static {
        n nVar = new n(true);
        f22718v = nVar;
        nVar.I1();
    }

    private void I1() {
        this.f22722e = 518;
        this.f22723f = 2054;
        this.f22724g = 0;
        this.f22725h = q.h1();
        this.f22726i = 0;
        this.f22727j = Collections.emptyList();
        this.f22728k = q.h1();
        this.f22729l = 0;
        this.f22730m = Collections.emptyList();
        this.f22731n = Collections.emptyList();
        this.f22733p = u.P0();
        this.f22734q = 0;
        this.f22735r = 0;
        this.f22736s = Collections.emptyList();
    }

    public static b J1() {
        return b.x();
    }

    public static b K1(n nVar) {
        return J1().f(nVar);
    }

    public static n i1() {
        return f22718v;
    }

    public boolean A1() {
        return (this.f22721d & 4) == 4;
    }

    public boolean B1() {
        return (this.f22721d & 2) == 2;
    }

    public boolean C1() {
        return (this.f22721d & 32) == 32;
    }

    public boolean D1() {
        return (this.f22721d & 64) == 64;
    }

    public boolean E1() {
        return (this.f22721d & 8) == 8;
    }

    public boolean F1() {
        return (this.f22721d & 16) == 16;
    }

    public boolean G1() {
        return (this.f22721d & 512) == 512;
    }

    public boolean H1() {
        return (this.f22721d & 128) == 128;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
    /* renamed from: L1, reason: merged with bridge method [inline-methods] */
    public b h() {
        return J1();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
    /* renamed from: M1, reason: merged with bridge method [inline-methods] */
    public b l() {
        return K1(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
    public int d() {
        int i10 = this.f22738u;
        if (i10 != -1) {
            return i10;
        }
        int iO = (this.f22721d & 2) == 2 ? CodedOutputStream.o(1, this.f22723f) : 0;
        if ((this.f22721d & 4) == 4) {
            iO += CodedOutputStream.o(2, this.f22724g);
        }
        if ((this.f22721d & 8) == 8) {
            iO += CodedOutputStream.r(3, this.f22725h);
        }
        for (int i11 = 0; i11 < this.f22727j.size(); i11++) {
            iO += CodedOutputStream.r(4, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.f22727j.get(i11));
        }
        if ((this.f22721d & 32) == 32) {
            iO += CodedOutputStream.r(5, this.f22728k);
        }
        if ((this.f22721d & 128) == 128) {
            iO += CodedOutputStream.r(6, this.f22733p);
        }
        if ((this.f22721d & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
            iO += CodedOutputStream.o(7, this.f22734q);
        }
        if ((this.f22721d & 512) == 512) {
            iO += CodedOutputStream.o(8, this.f22735r);
        }
        if ((this.f22721d & 16) == 16) {
            iO += CodedOutputStream.o(9, this.f22726i);
        }
        if ((this.f22721d & 64) == 64) {
            iO += CodedOutputStream.o(10, this.f22729l);
        }
        if ((this.f22721d & 1) == 1) {
            iO += CodedOutputStream.o(11, this.f22722e);
        }
        for (int i12 = 0; i12 < this.f22730m.size(); i12++) {
            iO += CodedOutputStream.r(12, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.f22730m.get(i12));
        }
        int iP = 0;
        for (int i13 = 0; i13 < this.f22731n.size(); i13++) {
            iP += CodedOutputStream.p(((Integer) this.f22731n.get(i13)).intValue());
        }
        int iP2 = iO + iP;
        if (!g1().isEmpty()) {
            iP2 = iP2 + 1 + CodedOutputStream.p(iP);
        }
        this.f22732o = iP;
        int iP3 = 0;
        for (int i14 = 0; i14 < this.f22736s.size(); i14++) {
            iP3 += CodedOutputStream.p(((Integer) this.f22736s.get(i14)).intValue());
        }
        int size = iP2 + iP3 + (x1().size() * 2) + F() + this.f22720c.size();
        this.f22738u = size;
        return size;
    }

    public q e1(int i10) {
        return (q) this.f22730m.get(i10);
    }

    public int f1() {
        return this.f22730m.size();
    }

    public List g1() {
        return this.f22731n;
    }

    public List h1() {
        return this.f22730m;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    /* renamed from: j1, reason: merged with bridge method [inline-methods] */
    public n c() {
        return f22718v;
    }

    public int k1() {
        return this.f22722e;
    }

    public int l1() {
        return this.f22734q;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public final boolean m() {
        byte b10 = this.f22737t;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (!A1()) {
            this.f22737t = (byte) 0;
            return false;
        }
        if (E1() && !q1().m()) {
            this.f22737t = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < v1(); i10++) {
            if (!u1(i10).m()) {
                this.f22737t = (byte) 0;
                return false;
            }
        }
        if (C1() && !o1().m()) {
            this.f22737t = (byte) 0;
            return false;
        }
        for (int i11 = 0; i11 < f1(); i11++) {
            if (!e1(i11).m()) {
                this.f22737t = (byte) 0;
                return false;
            }
        }
        if (H1() && !t1().m()) {
            this.f22737t = (byte) 0;
            return false;
        }
        if (E()) {
            this.f22737t = (byte) 1;
            return true;
        }
        this.f22737t = (byte) 0;
        return false;
    }

    public int m1() {
        return this.f22724g;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
    public void n(CodedOutputStream codedOutputStream) throws IOException {
        d();
        h.d.a aVarT = T();
        if ((this.f22721d & 2) == 2) {
            codedOutputStream.Z(1, this.f22723f);
        }
        if ((this.f22721d & 4) == 4) {
            codedOutputStream.Z(2, this.f22724g);
        }
        if ((this.f22721d & 8) == 8) {
            codedOutputStream.c0(3, this.f22725h);
        }
        for (int i10 = 0; i10 < this.f22727j.size(); i10++) {
            codedOutputStream.c0(4, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.f22727j.get(i10));
        }
        if ((this.f22721d & 32) == 32) {
            codedOutputStream.c0(5, this.f22728k);
        }
        if ((this.f22721d & 128) == 128) {
            codedOutputStream.c0(6, this.f22733p);
        }
        if ((this.f22721d & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
            codedOutputStream.Z(7, this.f22734q);
        }
        if ((this.f22721d & 512) == 512) {
            codedOutputStream.Z(8, this.f22735r);
        }
        if ((this.f22721d & 16) == 16) {
            codedOutputStream.Z(9, this.f22726i);
        }
        if ((this.f22721d & 64) == 64) {
            codedOutputStream.Z(10, this.f22729l);
        }
        if ((this.f22721d & 1) == 1) {
            codedOutputStream.Z(11, this.f22722e);
        }
        for (int i11 = 0; i11 < this.f22730m.size(); i11++) {
            codedOutputStream.c0(12, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.f22730m.get(i11));
        }
        if (g1().size() > 0) {
            codedOutputStream.n0(106);
            codedOutputStream.n0(this.f22732o);
        }
        for (int i12 = 0; i12 < this.f22731n.size(); i12++) {
            codedOutputStream.a0(((Integer) this.f22731n.get(i12)).intValue());
        }
        for (int i13 = 0; i13 < this.f22736s.size(); i13++) {
            codedOutputStream.Z(31, ((Integer) this.f22736s.get(i13)).intValue());
        }
        aVarT.a(19000, codedOutputStream);
        codedOutputStream.h0(this.f22720c);
    }

    public int n1() {
        return this.f22723f;
    }

    public q o1() {
        return this.f22728k;
    }

    public int p1() {
        return this.f22729l;
    }

    public q q1() {
        return this.f22725h;
    }

    public int r1() {
        return this.f22726i;
    }

    public int s1() {
        return this.f22735r;
    }

    public u t1() {
        return this.f22733p;
    }

    public s u1(int i10) {
        return (s) this.f22727j.get(i10);
    }

    public int v1() {
        return this.f22727j.size();
    }

    public List w1() {
        return this.f22727j;
    }

    public List x1() {
        return this.f22736s;
    }

    public boolean y1() {
        return (this.f22721d & 1) == 1;
    }

    public boolean z1() {
        return (this.f22721d & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256;
    }

    private n(h.c cVar) {
        super(cVar);
        this.f22732o = -1;
        this.f22737t = (byte) -1;
        this.f22738u = -1;
        this.f22720c = cVar.e();
    }

    private n(boolean z10) {
        this.f22732o = -1;
        this.f22737t = (byte) -1;
        this.f22738u = -1;
        this.f22720c = kotlin.reflect.jvm.internal.impl.protobuf.d.f51945a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
    private n(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
        this.f22732o = -1;
        this.f22737t = (byte) -1;
        this.f22738u = -1;
        I1();
        d.b bVarU = kotlin.reflect.jvm.internal.impl.protobuf.d.u();
        CodedOutputStream codedOutputStreamI = CodedOutputStream.I(bVarU, 1);
        boolean z10 = false;
        char c10 = 0;
        while (true) {
            ?? Y10 = 256;
            if (!z10) {
                try {
                    try {
                        int iJ = eVar.J();
                        switch (iJ) {
                            case 0:
                                z10 = true;
                            case 8:
                                this.f22721d |= 2;
                                this.f22723f = eVar.r();
                            case 16:
                                this.f22721d |= 4;
                                this.f22724g = eVar.r();
                            case 26:
                                q.c cVarK1 = (this.f22721d & 8) == 8 ? this.f22725h.l() : null;
                                q qVar = (q) eVar.t(q.f22784v, fVar);
                                this.f22725h = qVar;
                                if (cVarK1 != null) {
                                    cVarK1.f(qVar);
                                    this.f22725h = cVarK1.u();
                                }
                                this.f22721d |= 8;
                            case 34:
                                int i10 = (c10 == true ? 1 : 0) & 32;
                                c10 = c10;
                                if (i10 != 32) {
                                    this.f22727j = new ArrayList();
                                    c10 = (c10 == true ? 1 : 0) | ' ';
                                }
                                this.f22727j.add(eVar.t(s.f22857o, fVar));
                            case 42:
                                q.c cVarK12 = (this.f22721d & 32) == 32 ? this.f22728k.l() : null;
                                q qVar2 = (q) eVar.t(q.f22784v, fVar);
                                this.f22728k = qVar2;
                                if (cVarK12 != null) {
                                    cVarK12.f(qVar2);
                                    this.f22728k = cVarK12.u();
                                }
                                this.f22721d |= 32;
                            case 50:
                                u.b bVarK1 = (this.f22721d & 128) == 128 ? this.f22733p.l() : null;
                                u uVar = (u) eVar.t(u.f22888n, fVar);
                                this.f22733p = uVar;
                                if (bVarK1 != null) {
                                    bVarK1.f(uVar);
                                    this.f22733p = bVarK1.u();
                                }
                                this.f22721d |= 128;
                            case 56:
                                this.f22721d |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                                this.f22734q = eVar.r();
                            case 64:
                                this.f22721d |= 512;
                                this.f22735r = eVar.r();
                            case 72:
                                this.f22721d |= 16;
                                this.f22726i = eVar.r();
                            case 80:
                                this.f22721d |= 64;
                                this.f22729l = eVar.r();
                            case 88:
                                this.f22721d |= 1;
                                this.f22722e = eVar.r();
                            case 98:
                                int i11 = (c10 == true ? 1 : 0) & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                                c10 = c10;
                                if (i11 != 256) {
                                    this.f22730m = new ArrayList();
                                    c10 = (c10 == true ? 1 : 0) | 256;
                                }
                                this.f22730m.add(eVar.t(q.f22784v, fVar));
                            case 104:
                                int i12 = (c10 == true ? 1 : 0) & 512;
                                c10 = c10;
                                if (i12 != 512) {
                                    this.f22731n = new ArrayList();
                                    c10 = (c10 == true ? 1 : 0) | 512;
                                }
                                this.f22731n.add(Integer.valueOf(eVar.r()));
                            case 106:
                                int i13 = eVar.i(eVar.z());
                                int i14 = (c10 == true ? 1 : 0) & 512;
                                c10 = c10;
                                if (i14 != 512) {
                                    c10 = c10;
                                    if (eVar.e() > 0) {
                                        this.f22731n = new ArrayList();
                                        c10 = (c10 == true ? 1 : 0) | 512;
                                    }
                                }
                                while (eVar.e() > 0) {
                                    this.f22731n.add(Integer.valueOf(eVar.r()));
                                }
                                eVar.h(i13);
                            case 248:
                                int i15 = (c10 == true ? 1 : 0) & 8192;
                                c10 = c10;
                                if (i15 != 8192) {
                                    this.f22736s = new ArrayList();
                                    c10 = (c10 == true ? 1 : 0) | 8192;
                                }
                                this.f22736s.add(Integer.valueOf(eVar.r()));
                            case SQLiteDatabase.MAX_SQL_CACHE_SIZE /* 250 */:
                                int i16 = eVar.i(eVar.z());
                                int i17 = (c10 == true ? 1 : 0) & 8192;
                                c10 = c10;
                                if (i17 != 8192) {
                                    c10 = c10;
                                    if (eVar.e() > 0) {
                                        this.f22736s = new ArrayList();
                                        c10 = (c10 == true ? 1 : 0) | 8192;
                                    }
                                }
                                while (eVar.e() > 0) {
                                    this.f22736s.add(Integer.valueOf(eVar.r()));
                                }
                                eVar.h(i16);
                            default:
                                Y10 = y(eVar, codedOutputStreamI, fVar, iJ);
                                if (Y10 == 0) {
                                    z10 = true;
                                }
                        }
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.n(this);
                    } catch (IOException e11) {
                        throw new InvalidProtocolBufferException(e11.getMessage()).n(this);
                    }
                } catch (Throwable th2) {
                    if (((c10 == true ? 1 : 0) & 32) == 32) {
                        this.f22727j = Collections.unmodifiableList(this.f22727j);
                    }
                    if (((c10 == true ? 1 : 0) & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == Y10) {
                        this.f22730m = Collections.unmodifiableList(this.f22730m);
                    }
                    if (((c10 == true ? 1 : 0) & 512) == 512) {
                        this.f22731n = Collections.unmodifiableList(this.f22731n);
                    }
                    if (((c10 == true ? 1 : 0) & 8192) == 8192) {
                        this.f22736s = Collections.unmodifiableList(this.f22736s);
                    }
                    try {
                        codedOutputStreamI.H();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f22720c = bVarU.p();
                        throw th3;
                    }
                    this.f22720c = bVarU.p();
                    s();
                    throw th2;
                }
            } else {
                if (((c10 == true ? 1 : 0) & 32) == 32) {
                    this.f22727j = Collections.unmodifiableList(this.f22727j);
                }
                if (((c10 == true ? 1 : 0) & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
                    this.f22730m = Collections.unmodifiableList(this.f22730m);
                }
                if (((c10 == true ? 1 : 0) & 512) == 512) {
                    this.f22731n = Collections.unmodifiableList(this.f22731n);
                }
                if (((c10 == true ? 1 : 0) & 8192) == 8192) {
                    this.f22736s = Collections.unmodifiableList(this.f22736s);
                }
                try {
                    codedOutputStreamI.H();
                } catch (IOException unused2) {
                } catch (Throwable th4) {
                    this.f22720c = bVarU.p();
                    throw th4;
                }
                this.f22720c = bVarU.p();
                s();
                return;
            }
        }
    }
}
