package Uh;

import Uh.e;
import Uh.q;
import Uh.t;
import java.io.IOException;
import java.io.InputStream;
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
public final class i extends h.d implements kotlin.reflect.jvm.internal.impl.protobuf.o {

    /* renamed from: v, reason: collision with root package name */
    private static final i f22650v;

    /* renamed from: w, reason: collision with root package name */
    public static kotlin.reflect.jvm.internal.impl.protobuf.p f22651w = new a();

    /* renamed from: c, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.protobuf.d f22652c;

    /* renamed from: d, reason: collision with root package name */
    private int f22653d;

    /* renamed from: e, reason: collision with root package name */
    private int f22654e;

    /* renamed from: f, reason: collision with root package name */
    private int f22655f;

    /* renamed from: g, reason: collision with root package name */
    private int f22656g;

    /* renamed from: h, reason: collision with root package name */
    private q f22657h;

    /* renamed from: i, reason: collision with root package name */
    private int f22658i;

    /* renamed from: j, reason: collision with root package name */
    private List f22659j;

    /* renamed from: k, reason: collision with root package name */
    private q f22660k;

    /* renamed from: l, reason: collision with root package name */
    private int f22661l;

    /* renamed from: m, reason: collision with root package name */
    private List f22662m;

    /* renamed from: n, reason: collision with root package name */
    private List f22663n;

    /* renamed from: o, reason: collision with root package name */
    private int f22664o;

    /* renamed from: p, reason: collision with root package name */
    private List f22665p;

    /* renamed from: q, reason: collision with root package name */
    private t f22666q;

    /* renamed from: r, reason: collision with root package name */
    private List f22667r;

    /* renamed from: s, reason: collision with root package name */
    private e f22668s;

    /* renamed from: t, reason: collision with root package name */
    private byte f22669t;

    /* renamed from: u, reason: collision with root package name */
    private int f22670u;

    static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public i b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
            return new i(eVar, fVar);
        }
    }

    public static final class b extends h.c implements kotlin.reflect.jvm.internal.impl.protobuf.o {

        /* renamed from: d, reason: collision with root package name */
        private int f22671d;

        /* renamed from: g, reason: collision with root package name */
        private int f22674g;

        /* renamed from: i, reason: collision with root package name */
        private int f22676i;

        /* renamed from: l, reason: collision with root package name */
        private int f22679l;

        /* renamed from: e, reason: collision with root package name */
        private int f22672e = 6;

        /* renamed from: f, reason: collision with root package name */
        private int f22673f = 6;

        /* renamed from: h, reason: collision with root package name */
        private q f22675h = q.h1();

        /* renamed from: j, reason: collision with root package name */
        private List f22677j = Collections.emptyList();

        /* renamed from: k, reason: collision with root package name */
        private q f22678k = q.h1();

        /* renamed from: m, reason: collision with root package name */
        private List f22680m = Collections.emptyList();

        /* renamed from: n, reason: collision with root package name */
        private List f22681n = Collections.emptyList();

        /* renamed from: o, reason: collision with root package name */
        private List f22682o = Collections.emptyList();

        /* renamed from: p, reason: collision with root package name */
        private t f22683p = t.P();

        /* renamed from: q, reason: collision with root package name */
        private List f22684q = Collections.emptyList();

        /* renamed from: r, reason: collision with root package name */
        private e f22685r = e.J();

        private b() {
            F();
        }

        private void A() {
            if ((this.f22671d & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 256) {
                this.f22680m = new ArrayList(this.f22680m);
                this.f22671d |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            }
        }

        private void B() {
            if ((this.f22671d & 32) != 32) {
                this.f22677j = new ArrayList(this.f22677j);
                this.f22671d |= 32;
            }
        }

        private void D() {
            if ((this.f22671d & 1024) != 1024) {
                this.f22682o = new ArrayList(this.f22682o);
                this.f22671d |= 1024;
            }
        }

        private void E() {
            if ((this.f22671d & 4096) != 4096) {
                this.f22684q = new ArrayList(this.f22684q);
                this.f22671d |= 4096;
            }
        }

        private void F() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b x() {
            return new b();
        }

        private void z() {
            if ((this.f22671d & 512) != 512) {
                this.f22681n = new ArrayList(this.f22681n);
                this.f22671d |= 512;
            }
        }

        public b G(e eVar) {
            if ((this.f22671d & 8192) != 8192 || this.f22685r == e.J()) {
                this.f22685r = eVar;
            } else {
                this.f22685r = e.d0(this.f22685r).f(eVar).p();
            }
            this.f22671d |= 8192;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: H, reason: merged with bridge method [inline-methods] */
        public b f(i iVar) {
            if (iVar == i.k1()) {
                return this;
            }
            if (iVar.C1()) {
                N(iVar.m1());
            }
            if (iVar.E1()) {
                P(iVar.o1());
            }
            if (iVar.D1()) {
                O(iVar.n1());
            }
            if (iVar.H1()) {
                L(iVar.r1());
            }
            if (iVar.I1()) {
                R(iVar.s1());
            }
            if (!iVar.f22659j.isEmpty()) {
                if (this.f22677j.isEmpty()) {
                    this.f22677j = iVar.f22659j;
                    this.f22671d &= -33;
                } else {
                    B();
                    this.f22677j.addAll(iVar.f22659j);
                }
            }
            if (iVar.F1()) {
                K(iVar.p1());
            }
            if (iVar.G1()) {
                Q(iVar.q1());
            }
            if (!iVar.f22662m.isEmpty()) {
                if (this.f22680m.isEmpty()) {
                    this.f22680m = iVar.f22662m;
                    this.f22671d &= -257;
                } else {
                    A();
                    this.f22680m.addAll(iVar.f22662m);
                }
            }
            if (!iVar.f22663n.isEmpty()) {
                if (this.f22681n.isEmpty()) {
                    this.f22681n = iVar.f22663n;
                    this.f22671d &= -513;
                } else {
                    z();
                    this.f22681n.addAll(iVar.f22663n);
                }
            }
            if (!iVar.f22665p.isEmpty()) {
                if (this.f22682o.isEmpty()) {
                    this.f22682o = iVar.f22665p;
                    this.f22671d &= -1025;
                } else {
                    D();
                    this.f22682o.addAll(iVar.f22665p);
                }
            }
            if (iVar.J1()) {
                M(iVar.w1());
            }
            if (!iVar.f22667r.isEmpty()) {
                if (this.f22684q.isEmpty()) {
                    this.f22684q = iVar.f22667r;
                    this.f22671d &= -4097;
                } else {
                    E();
                    this.f22684q.addAll(iVar.f22667r);
                }
            }
            if (iVar.B1()) {
                G(iVar.j1());
            }
            q(iVar);
            i(e().e(iVar.f22652c));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n.a
        /* renamed from: I, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public Uh.i.b b0(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.p r1 = Uh.i.f22651w     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                Uh.i r3 = (Uh.i) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                Uh.i r4 = (Uh.i) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: Uh.i.b.b0(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):Uh.i$b");
        }

        public b K(q qVar) {
            if ((this.f22671d & 64) != 64 || this.f22678k == q.h1()) {
                this.f22678k = qVar;
            } else {
                this.f22678k = q.I1(this.f22678k).f(qVar).u();
            }
            this.f22671d |= 64;
            return this;
        }

        public b L(q qVar) {
            if ((this.f22671d & 8) != 8 || this.f22675h == q.h1()) {
                this.f22675h = qVar;
            } else {
                this.f22675h = q.I1(this.f22675h).f(qVar).u();
            }
            this.f22671d |= 8;
            return this;
        }

        public b M(t tVar) {
            if ((this.f22671d & 2048) != 2048 || this.f22683p == t.P()) {
                this.f22683p = tVar;
            } else {
                this.f22683p = t.G0(this.f22683p).f(tVar).p();
            }
            this.f22671d |= 2048;
            return this;
        }

        public b N(int i10) {
            this.f22671d |= 1;
            this.f22672e = i10;
            return this;
        }

        public b O(int i10) {
            this.f22671d |= 4;
            this.f22674g = i10;
            return this;
        }

        public b P(int i10) {
            this.f22671d |= 2;
            this.f22673f = i10;
            return this;
        }

        public b Q(int i10) {
            this.f22671d |= 128;
            this.f22679l = i10;
            return this;
        }

        public b R(int i10) {
            this.f22671d |= 16;
            this.f22676i = i10;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n.a
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public i a() {
            i iVarU = u();
            if (iVarU.m()) {
                return iVarU;
            }
            throw a.AbstractC1921a.b(iVarU);
        }

        public i u() {
            i iVar = new i(this);
            int i10 = this.f22671d;
            int i11 = (i10 & 1) != 1 ? 0 : 1;
            iVar.f22654e = this.f22672e;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            iVar.f22655f = this.f22673f;
            if ((i10 & 4) == 4) {
                i11 |= 4;
            }
            iVar.f22656g = this.f22674g;
            if ((i10 & 8) == 8) {
                i11 |= 8;
            }
            iVar.f22657h = this.f22675h;
            if ((i10 & 16) == 16) {
                i11 |= 16;
            }
            iVar.f22658i = this.f22676i;
            if ((this.f22671d & 32) == 32) {
                this.f22677j = Collections.unmodifiableList(this.f22677j);
                this.f22671d &= -33;
            }
            iVar.f22659j = this.f22677j;
            if ((i10 & 64) == 64) {
                i11 |= 32;
            }
            iVar.f22660k = this.f22678k;
            if ((i10 & 128) == 128) {
                i11 |= 64;
            }
            iVar.f22661l = this.f22679l;
            if ((this.f22671d & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
                this.f22680m = Collections.unmodifiableList(this.f22680m);
                this.f22671d &= -257;
            }
            iVar.f22662m = this.f22680m;
            if ((this.f22671d & 512) == 512) {
                this.f22681n = Collections.unmodifiableList(this.f22681n);
                this.f22671d &= -513;
            }
            iVar.f22663n = this.f22681n;
            if ((this.f22671d & 1024) == 1024) {
                this.f22682o = Collections.unmodifiableList(this.f22682o);
                this.f22671d &= -1025;
            }
            iVar.f22665p = this.f22682o;
            if ((i10 & 2048) == 2048) {
                i11 |= 128;
            }
            iVar.f22666q = this.f22683p;
            if ((this.f22671d & 4096) == 4096) {
                this.f22684q = Collections.unmodifiableList(this.f22684q);
                this.f22671d &= -4097;
            }
            iVar.f22667r = this.f22684q;
            if ((i10 & 8192) == 8192) {
                i11 |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            }
            iVar.f22668s = this.f22685r;
            iVar.f22653d = i11;
            return iVar;
        }

        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return x().f(u());
        }
    }

    static {
        i iVar = new i(true);
        f22650v = iVar;
        iVar.K1();
    }

    private void K1() {
        this.f22654e = 6;
        this.f22655f = 6;
        this.f22656g = 0;
        this.f22657h = q.h1();
        this.f22658i = 0;
        this.f22659j = Collections.emptyList();
        this.f22660k = q.h1();
        this.f22661l = 0;
        this.f22662m = Collections.emptyList();
        this.f22663n = Collections.emptyList();
        this.f22665p = Collections.emptyList();
        this.f22666q = t.P();
        this.f22667r = Collections.emptyList();
        this.f22668s = e.J();
    }

    public static b L1() {
        return b.x();
    }

    public static b M1(i iVar) {
        return L1().f(iVar);
    }

    public static i O1(InputStream inputStream, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
        return (i) f22651w.a(inputStream, fVar);
    }

    public static i k1() {
        return f22650v;
    }

    public List A1() {
        return this.f22667r;
    }

    public boolean B1() {
        return (this.f22653d & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256;
    }

    public boolean C1() {
        return (this.f22653d & 1) == 1;
    }

    public boolean D1() {
        return (this.f22653d & 4) == 4;
    }

    public boolean E1() {
        return (this.f22653d & 2) == 2;
    }

    public boolean F1() {
        return (this.f22653d & 32) == 32;
    }

    public boolean G1() {
        return (this.f22653d & 64) == 64;
    }

    public boolean H1() {
        return (this.f22653d & 8) == 8;
    }

    public boolean I1() {
        return (this.f22653d & 16) == 16;
    }

    public boolean J1() {
        return (this.f22653d & 128) == 128;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
    /* renamed from: N1, reason: merged with bridge method [inline-methods] */
    public b h() {
        return L1();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
    /* renamed from: P1, reason: merged with bridge method [inline-methods] */
    public b l() {
        return M1(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
    public int d() {
        int i10 = this.f22670u;
        if (i10 != -1) {
            return i10;
        }
        int iO = (this.f22653d & 2) == 2 ? CodedOutputStream.o(1, this.f22655f) : 0;
        if ((this.f22653d & 4) == 4) {
            iO += CodedOutputStream.o(2, this.f22656g);
        }
        if ((this.f22653d & 8) == 8) {
            iO += CodedOutputStream.r(3, this.f22657h);
        }
        for (int i11 = 0; i11 < this.f22659j.size(); i11++) {
            iO += CodedOutputStream.r(4, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.f22659j.get(i11));
        }
        if ((this.f22653d & 32) == 32) {
            iO += CodedOutputStream.r(5, this.f22660k);
        }
        for (int i12 = 0; i12 < this.f22665p.size(); i12++) {
            iO += CodedOutputStream.r(6, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.f22665p.get(i12));
        }
        if ((this.f22653d & 16) == 16) {
            iO += CodedOutputStream.o(7, this.f22658i);
        }
        if ((this.f22653d & 64) == 64) {
            iO += CodedOutputStream.o(8, this.f22661l);
        }
        if ((this.f22653d & 1) == 1) {
            iO += CodedOutputStream.o(9, this.f22654e);
        }
        for (int i13 = 0; i13 < this.f22662m.size(); i13++) {
            iO += CodedOutputStream.r(10, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.f22662m.get(i13));
        }
        int iP = 0;
        for (int i14 = 0; i14 < this.f22663n.size(); i14++) {
            iP += CodedOutputStream.p(((Integer) this.f22663n.get(i14)).intValue());
        }
        int iR = iO + iP;
        if (!h1().isEmpty()) {
            iR = iR + 1 + CodedOutputStream.p(iP);
        }
        this.f22664o = iP;
        if ((this.f22653d & 128) == 128) {
            iR += CodedOutputStream.r(30, this.f22666q);
        }
        int iP2 = 0;
        for (int i15 = 0; i15 < this.f22667r.size(); i15++) {
            iP2 += CodedOutputStream.p(((Integer) this.f22667r.get(i15)).intValue());
        }
        int size = iR + iP2 + (A1().size() * 2);
        if ((this.f22653d & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
            size += CodedOutputStream.r(32, this.f22668s);
        }
        int iF = size + F() + this.f22652c.size();
        this.f22670u = iF;
        return iF;
    }

    public q f1(int i10) {
        return (q) this.f22662m.get(i10);
    }

    public int g1() {
        return this.f22662m.size();
    }

    public List h1() {
        return this.f22663n;
    }

    public List i1() {
        return this.f22662m;
    }

    public e j1() {
        return this.f22668s;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    /* renamed from: l1, reason: merged with bridge method [inline-methods] */
    public i c() {
        return f22650v;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public final boolean m() {
        byte b10 = this.f22669t;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (!D1()) {
            this.f22669t = (byte) 0;
            return false;
        }
        if (H1() && !r1().m()) {
            this.f22669t = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < u1(); i10++) {
            if (!t1(i10).m()) {
                this.f22669t = (byte) 0;
                return false;
            }
        }
        if (F1() && !p1().m()) {
            this.f22669t = (byte) 0;
            return false;
        }
        for (int i11 = 0; i11 < g1(); i11++) {
            if (!f1(i11).m()) {
                this.f22669t = (byte) 0;
                return false;
            }
        }
        for (int i12 = 0; i12 < y1(); i12++) {
            if (!x1(i12).m()) {
                this.f22669t = (byte) 0;
                return false;
            }
        }
        if (J1() && !w1().m()) {
            this.f22669t = (byte) 0;
            return false;
        }
        if (B1() && !j1().m()) {
            this.f22669t = (byte) 0;
            return false;
        }
        if (E()) {
            this.f22669t = (byte) 1;
            return true;
        }
        this.f22669t = (byte) 0;
        return false;
    }

    public int m1() {
        return this.f22654e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
    public void n(CodedOutputStream codedOutputStream) throws IOException {
        d();
        h.d.a aVarT = T();
        if ((this.f22653d & 2) == 2) {
            codedOutputStream.Z(1, this.f22655f);
        }
        if ((this.f22653d & 4) == 4) {
            codedOutputStream.Z(2, this.f22656g);
        }
        if ((this.f22653d & 8) == 8) {
            codedOutputStream.c0(3, this.f22657h);
        }
        for (int i10 = 0; i10 < this.f22659j.size(); i10++) {
            codedOutputStream.c0(4, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.f22659j.get(i10));
        }
        if ((this.f22653d & 32) == 32) {
            codedOutputStream.c0(5, this.f22660k);
        }
        for (int i11 = 0; i11 < this.f22665p.size(); i11++) {
            codedOutputStream.c0(6, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.f22665p.get(i11));
        }
        if ((this.f22653d & 16) == 16) {
            codedOutputStream.Z(7, this.f22658i);
        }
        if ((this.f22653d & 64) == 64) {
            codedOutputStream.Z(8, this.f22661l);
        }
        if ((this.f22653d & 1) == 1) {
            codedOutputStream.Z(9, this.f22654e);
        }
        for (int i12 = 0; i12 < this.f22662m.size(); i12++) {
            codedOutputStream.c0(10, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.f22662m.get(i12));
        }
        if (h1().size() > 0) {
            codedOutputStream.n0(90);
            codedOutputStream.n0(this.f22664o);
        }
        for (int i13 = 0; i13 < this.f22663n.size(); i13++) {
            codedOutputStream.a0(((Integer) this.f22663n.get(i13)).intValue());
        }
        if ((this.f22653d & 128) == 128) {
            codedOutputStream.c0(30, this.f22666q);
        }
        for (int i14 = 0; i14 < this.f22667r.size(); i14++) {
            codedOutputStream.Z(31, ((Integer) this.f22667r.get(i14)).intValue());
        }
        if ((this.f22653d & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
            codedOutputStream.c0(32, this.f22668s);
        }
        aVarT.a(19000, codedOutputStream);
        codedOutputStream.h0(this.f22652c);
    }

    public int n1() {
        return this.f22656g;
    }

    public int o1() {
        return this.f22655f;
    }

    public q p1() {
        return this.f22660k;
    }

    public int q1() {
        return this.f22661l;
    }

    public q r1() {
        return this.f22657h;
    }

    public int s1() {
        return this.f22658i;
    }

    public s t1(int i10) {
        return (s) this.f22659j.get(i10);
    }

    public int u1() {
        return this.f22659j.size();
    }

    public List v1() {
        return this.f22659j;
    }

    public t w1() {
        return this.f22666q;
    }

    public u x1(int i10) {
        return (u) this.f22665p.get(i10);
    }

    public int y1() {
        return this.f22665p.size();
    }

    public List z1() {
        return this.f22665p;
    }

    private i(h.c cVar) {
        super(cVar);
        this.f22664o = -1;
        this.f22669t = (byte) -1;
        this.f22670u = -1;
        this.f22652c = cVar.e();
    }

    private i(boolean z10) {
        this.f22664o = -1;
        this.f22669t = (byte) -1;
        this.f22670u = -1;
        this.f22652c = kotlin.reflect.jvm.internal.impl.protobuf.d.f51945a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
    private i(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
        this.f22664o = -1;
        this.f22669t = (byte) -1;
        this.f22670u = -1;
        K1();
        d.b bVarU = kotlin.reflect.jvm.internal.impl.protobuf.d.u();
        CodedOutputStream codedOutputStreamI = CodedOutputStream.I(bVarU, 1);
        boolean z10 = false;
        char c10 = 0;
        while (true) {
            ?? Y10 = 1024;
            if (!z10) {
                try {
                    try {
                        int iJ = eVar.J();
                        switch (iJ) {
                            case 0:
                                z10 = true;
                            case 8:
                                this.f22653d |= 2;
                                this.f22655f = eVar.r();
                            case 16:
                                this.f22653d |= 4;
                                this.f22656g = eVar.r();
                            case 26:
                                q.c cVarK1 = (this.f22653d & 8) == 8 ? this.f22657h.l() : null;
                                q qVar = (q) eVar.t(q.f22784v, fVar);
                                this.f22657h = qVar;
                                if (cVarK1 != null) {
                                    cVarK1.f(qVar);
                                    this.f22657h = cVarK1.u();
                                }
                                this.f22653d |= 8;
                            case 34:
                                int i10 = (c10 == true ? 1 : 0) & 32;
                                c10 = c10;
                                if (i10 != 32) {
                                    this.f22659j = new ArrayList();
                                    c10 = (c10 == true ? 1 : 0) | ' ';
                                }
                                this.f22659j.add(eVar.t(s.f22857o, fVar));
                            case 42:
                                q.c cVarK12 = (this.f22653d & 32) == 32 ? this.f22660k.l() : null;
                                q qVar2 = (q) eVar.t(q.f22784v, fVar);
                                this.f22660k = qVar2;
                                if (cVarK12 != null) {
                                    cVarK12.f(qVar2);
                                    this.f22660k = cVarK12.u();
                                }
                                this.f22653d |= 32;
                            case 50:
                                int i11 = (c10 == true ? 1 : 0) & 1024;
                                c10 = c10;
                                if (i11 != 1024) {
                                    this.f22665p = new ArrayList();
                                    c10 = (c10 == true ? 1 : 0) | 1024;
                                }
                                this.f22665p.add(eVar.t(u.f22888n, fVar));
                            case 56:
                                this.f22653d |= 16;
                                this.f22658i = eVar.r();
                            case 64:
                                this.f22653d |= 64;
                                this.f22661l = eVar.r();
                            case 72:
                                this.f22653d |= 1;
                                this.f22654e = eVar.r();
                            case 82:
                                int i12 = (c10 == true ? 1 : 0) & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                                c10 = c10;
                                if (i12 != 256) {
                                    this.f22662m = new ArrayList();
                                    c10 = (c10 == true ? 1 : 0) | 256;
                                }
                                this.f22662m.add(eVar.t(q.f22784v, fVar));
                            case 88:
                                int i13 = (c10 == true ? 1 : 0) & 512;
                                c10 = c10;
                                if (i13 != 512) {
                                    this.f22663n = new ArrayList();
                                    c10 = (c10 == true ? 1 : 0) | 512;
                                }
                                this.f22663n.add(Integer.valueOf(eVar.r()));
                            case 90:
                                int i14 = eVar.i(eVar.z());
                                int i15 = (c10 == true ? 1 : 0) & 512;
                                c10 = c10;
                                if (i15 != 512) {
                                    c10 = c10;
                                    if (eVar.e() > 0) {
                                        this.f22663n = new ArrayList();
                                        c10 = (c10 == true ? 1 : 0) | 512;
                                    }
                                }
                                while (eVar.e() > 0) {
                                    this.f22663n.add(Integer.valueOf(eVar.r()));
                                }
                                eVar.h(i14);
                            case 242:
                                t.b bVarM0 = (this.f22653d & 128) == 128 ? this.f22666q.l() : null;
                                t tVar = (t) eVar.t(t.f22877i, fVar);
                                this.f22666q = tVar;
                                if (bVarM0 != null) {
                                    bVarM0.f(tVar);
                                    this.f22666q = bVarM0.p();
                                }
                                this.f22653d |= 128;
                            case 248:
                                int i16 = (c10 == true ? 1 : 0) & 4096;
                                c10 = c10;
                                if (i16 != 4096) {
                                    this.f22667r = new ArrayList();
                                    c10 = (c10 == true ? 1 : 0) | 4096;
                                }
                                this.f22667r.add(Integer.valueOf(eVar.r()));
                            case SQLiteDatabase.MAX_SQL_CACHE_SIZE /* 250 */:
                                int i17 = eVar.i(eVar.z());
                                int i18 = (c10 == true ? 1 : 0) & 4096;
                                c10 = c10;
                                if (i18 != 4096) {
                                    c10 = c10;
                                    if (eVar.e() > 0) {
                                        this.f22667r = new ArrayList();
                                        c10 = (c10 == true ? 1 : 0) | 4096;
                                    }
                                }
                                while (eVar.e() > 0) {
                                    this.f22667r.add(Integer.valueOf(eVar.r()));
                                }
                                eVar.h(i17);
                            case 258:
                                e.b bVarQ0 = (this.f22653d & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256 ? this.f22668s.l() : null;
                                e eVar2 = (e) eVar.t(e.f22598g, fVar);
                                this.f22668s = eVar2;
                                if (bVarQ0 != null) {
                                    bVarQ0.f(eVar2);
                                    this.f22668s = bVarQ0.p();
                                }
                                this.f22653d |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
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
                        this.f22659j = Collections.unmodifiableList(this.f22659j);
                    }
                    if (((c10 == true ? 1 : 0) & 1024) == Y10) {
                        this.f22665p = Collections.unmodifiableList(this.f22665p);
                    }
                    if (((c10 == true ? 1 : 0) & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
                        this.f22662m = Collections.unmodifiableList(this.f22662m);
                    }
                    if (((c10 == true ? 1 : 0) & 512) == 512) {
                        this.f22663n = Collections.unmodifiableList(this.f22663n);
                    }
                    if (((c10 == true ? 1 : 0) & 4096) == 4096) {
                        this.f22667r = Collections.unmodifiableList(this.f22667r);
                    }
                    try {
                        codedOutputStreamI.H();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f22652c = bVarU.p();
                        throw th3;
                    }
                    this.f22652c = bVarU.p();
                    s();
                    throw th2;
                }
            } else {
                if (((c10 == true ? 1 : 0) & 32) == 32) {
                    this.f22659j = Collections.unmodifiableList(this.f22659j);
                }
                if (((c10 == true ? 1 : 0) & 1024) == 1024) {
                    this.f22665p = Collections.unmodifiableList(this.f22665p);
                }
                if (((c10 == true ? 1 : 0) & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
                    this.f22662m = Collections.unmodifiableList(this.f22662m);
                }
                if (((c10 == true ? 1 : 0) & 512) == 512) {
                    this.f22663n = Collections.unmodifiableList(this.f22663n);
                }
                if (((c10 == true ? 1 : 0) & 4096) == 4096) {
                    this.f22667r = Collections.unmodifiableList(this.f22667r);
                }
                try {
                    codedOutputStreamI.H();
                } catch (IOException unused2) {
                } catch (Throwable th4) {
                    this.f22652c = bVarU.p();
                    throw th4;
                }
                this.f22652c = bVarU.p();
                s();
                return;
            }
        }
    }
}
