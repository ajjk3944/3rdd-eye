package Uh;

import Uh.q;
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
public final class r extends h.d implements kotlin.reflect.jvm.internal.impl.protobuf.o {

    /* renamed from: p, reason: collision with root package name */
    private static final r f22831p;

    /* renamed from: q, reason: collision with root package name */
    public static kotlin.reflect.jvm.internal.impl.protobuf.p f22832q = new a();

    /* renamed from: c, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.protobuf.d f22833c;

    /* renamed from: d, reason: collision with root package name */
    private int f22834d;

    /* renamed from: e, reason: collision with root package name */
    private int f22835e;

    /* renamed from: f, reason: collision with root package name */
    private int f22836f;

    /* renamed from: g, reason: collision with root package name */
    private List f22837g;

    /* renamed from: h, reason: collision with root package name */
    private q f22838h;

    /* renamed from: i, reason: collision with root package name */
    private int f22839i;

    /* renamed from: j, reason: collision with root package name */
    private q f22840j;

    /* renamed from: k, reason: collision with root package name */
    private int f22841k;

    /* renamed from: l, reason: collision with root package name */
    private List f22842l;

    /* renamed from: m, reason: collision with root package name */
    private List f22843m;

    /* renamed from: n, reason: collision with root package name */
    private byte f22844n;

    /* renamed from: o, reason: collision with root package name */
    private int f22845o;

    static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public r b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
            return new r(eVar, fVar);
        }
    }

    public static final class b extends h.c implements kotlin.reflect.jvm.internal.impl.protobuf.o {

        /* renamed from: d, reason: collision with root package name */
        private int f22846d;

        /* renamed from: f, reason: collision with root package name */
        private int f22848f;

        /* renamed from: i, reason: collision with root package name */
        private int f22851i;

        /* renamed from: k, reason: collision with root package name */
        private int f22853k;

        /* renamed from: e, reason: collision with root package name */
        private int f22847e = 6;

        /* renamed from: g, reason: collision with root package name */
        private List f22849g = Collections.emptyList();

        /* renamed from: h, reason: collision with root package name */
        private q f22850h = q.h1();

        /* renamed from: j, reason: collision with root package name */
        private q f22852j = q.h1();

        /* renamed from: l, reason: collision with root package name */
        private List f22854l = Collections.emptyList();

        /* renamed from: m, reason: collision with root package name */
        private List f22855m = Collections.emptyList();

        private b() {
            D();
        }

        private void A() {
            if ((this.f22846d & 4) != 4) {
                this.f22849g = new ArrayList(this.f22849g);
                this.f22846d |= 4;
            }
        }

        private void B() {
            if ((this.f22846d & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 256) {
                this.f22855m = new ArrayList(this.f22855m);
                this.f22846d |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            }
        }

        private void D() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b x() {
            return new b();
        }

        private void z() {
            if ((this.f22846d & 128) != 128) {
                this.f22854l = new ArrayList(this.f22854l);
                this.f22846d |= 128;
            }
        }

        public b E(q qVar) {
            if ((this.f22846d & 32) != 32 || this.f22852j == q.h1()) {
                this.f22852j = qVar;
            } else {
                this.f22852j = q.I1(this.f22852j).f(qVar).u();
            }
            this.f22846d |= 32;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: F, reason: merged with bridge method [inline-methods] */
        public b f(r rVar) {
            if (rVar == r.b1()) {
                return this;
            }
            if (rVar.p1()) {
                K(rVar.f1());
            }
            if (rVar.q1()) {
                L(rVar.g1());
            }
            if (!rVar.f22837g.isEmpty()) {
                if (this.f22849g.isEmpty()) {
                    this.f22849g = rVar.f22837g;
                    this.f22846d &= -5;
                } else {
                    A();
                    this.f22849g.addAll(rVar.f22837g);
                }
            }
            if (rVar.r1()) {
                H(rVar.k1());
            }
            if (rVar.s1()) {
                M(rVar.l1());
            }
            if (rVar.n1()) {
                E(rVar.d1());
            }
            if (rVar.o1()) {
                I(rVar.e1());
            }
            if (!rVar.f22842l.isEmpty()) {
                if (this.f22854l.isEmpty()) {
                    this.f22854l = rVar.f22842l;
                    this.f22846d &= -129;
                } else {
                    z();
                    this.f22854l.addAll(rVar.f22842l);
                }
            }
            if (!rVar.f22843m.isEmpty()) {
                if (this.f22855m.isEmpty()) {
                    this.f22855m = rVar.f22843m;
                    this.f22846d &= -257;
                } else {
                    B();
                    this.f22855m.addAll(rVar.f22843m);
                }
            }
            q(rVar);
            i(e().e(rVar.f22833c));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n.a
        /* renamed from: G, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public Uh.r.b b0(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.p r1 = Uh.r.f22832q     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                Uh.r r3 = (Uh.r) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                Uh.r r4 = (Uh.r) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: Uh.r.b.b0(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):Uh.r$b");
        }

        public b H(q qVar) {
            if ((this.f22846d & 8) != 8 || this.f22850h == q.h1()) {
                this.f22850h = qVar;
            } else {
                this.f22850h = q.I1(this.f22850h).f(qVar).u();
            }
            this.f22846d |= 8;
            return this;
        }

        public b I(int i10) {
            this.f22846d |= 64;
            this.f22853k = i10;
            return this;
        }

        public b K(int i10) {
            this.f22846d |= 1;
            this.f22847e = i10;
            return this;
        }

        public b L(int i10) {
            this.f22846d |= 2;
            this.f22848f = i10;
            return this;
        }

        public b M(int i10) {
            this.f22846d |= 16;
            this.f22851i = i10;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n.a
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public r a() {
            r rVarU = u();
            if (rVarU.m()) {
                return rVarU;
            }
            throw a.AbstractC1921a.b(rVarU);
        }

        public r u() {
            r rVar = new r(this);
            int i10 = this.f22846d;
            int i11 = (i10 & 1) != 1 ? 0 : 1;
            rVar.f22835e = this.f22847e;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            rVar.f22836f = this.f22848f;
            if ((this.f22846d & 4) == 4) {
                this.f22849g = Collections.unmodifiableList(this.f22849g);
                this.f22846d &= -5;
            }
            rVar.f22837g = this.f22849g;
            if ((i10 & 8) == 8) {
                i11 |= 4;
            }
            rVar.f22838h = this.f22850h;
            if ((i10 & 16) == 16) {
                i11 |= 8;
            }
            rVar.f22839i = this.f22851i;
            if ((i10 & 32) == 32) {
                i11 |= 16;
            }
            rVar.f22840j = this.f22852j;
            if ((i10 & 64) == 64) {
                i11 |= 32;
            }
            rVar.f22841k = this.f22853k;
            if ((this.f22846d & 128) == 128) {
                this.f22854l = Collections.unmodifiableList(this.f22854l);
                this.f22846d &= -129;
            }
            rVar.f22842l = this.f22854l;
            if ((this.f22846d & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
                this.f22855m = Collections.unmodifiableList(this.f22855m);
                this.f22846d &= -257;
            }
            rVar.f22843m = this.f22855m;
            rVar.f22834d = i11;
            return rVar;
        }

        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return x().f(u());
        }
    }

    static {
        r rVar = new r(true);
        f22831p = rVar;
        rVar.t1();
    }

    public static r b1() {
        return f22831p;
    }

    private void t1() {
        this.f22835e = 6;
        this.f22836f = 0;
        this.f22837g = Collections.emptyList();
        this.f22838h = q.h1();
        this.f22839i = 0;
        this.f22840j = q.h1();
        this.f22841k = 0;
        this.f22842l = Collections.emptyList();
        this.f22843m = Collections.emptyList();
    }

    public static b u1() {
        return b.x();
    }

    public static b v1(r rVar) {
        return u1().f(rVar);
    }

    public static r x1(InputStream inputStream, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
        return (r) f22832q.c(inputStream, fVar);
    }

    public Uh.b Y0(int i10) {
        return (Uh.b) this.f22842l.get(i10);
    }

    public int Z0() {
        return this.f22842l.size();
    }

    public List a1() {
        return this.f22842l;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    /* renamed from: c1, reason: merged with bridge method [inline-methods] */
    public r c() {
        return f22831p;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
    public int d() {
        int i10 = this.f22845o;
        if (i10 != -1) {
            return i10;
        }
        int iO = (this.f22834d & 1) == 1 ? CodedOutputStream.o(1, this.f22835e) : 0;
        if ((this.f22834d & 2) == 2) {
            iO += CodedOutputStream.o(2, this.f22836f);
        }
        for (int i11 = 0; i11 < this.f22837g.size(); i11++) {
            iO += CodedOutputStream.r(3, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.f22837g.get(i11));
        }
        if ((this.f22834d & 4) == 4) {
            iO += CodedOutputStream.r(4, this.f22838h);
        }
        if ((this.f22834d & 8) == 8) {
            iO += CodedOutputStream.o(5, this.f22839i);
        }
        if ((this.f22834d & 16) == 16) {
            iO += CodedOutputStream.r(6, this.f22840j);
        }
        if ((this.f22834d & 32) == 32) {
            iO += CodedOutputStream.o(7, this.f22841k);
        }
        for (int i12 = 0; i12 < this.f22842l.size(); i12++) {
            iO += CodedOutputStream.r(8, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.f22842l.get(i12));
        }
        int iP = 0;
        for (int i13 = 0; i13 < this.f22843m.size(); i13++) {
            iP += CodedOutputStream.p(((Integer) this.f22843m.get(i13)).intValue());
        }
        int size = iO + iP + (m1().size() * 2) + F() + this.f22833c.size();
        this.f22845o = size;
        return size;
    }

    public q d1() {
        return this.f22840j;
    }

    public int e1() {
        return this.f22841k;
    }

    public int f1() {
        return this.f22835e;
    }

    public int g1() {
        return this.f22836f;
    }

    public s h1(int i10) {
        return (s) this.f22837g.get(i10);
    }

    public int i1() {
        return this.f22837g.size();
    }

    public List j1() {
        return this.f22837g;
    }

    public q k1() {
        return this.f22838h;
    }

    public int l1() {
        return this.f22839i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public final boolean m() {
        byte b10 = this.f22844n;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (!q1()) {
            this.f22844n = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < i1(); i10++) {
            if (!h1(i10).m()) {
                this.f22844n = (byte) 0;
                return false;
            }
        }
        if (r1() && !k1().m()) {
            this.f22844n = (byte) 0;
            return false;
        }
        if (n1() && !d1().m()) {
            this.f22844n = (byte) 0;
            return false;
        }
        for (int i11 = 0; i11 < Z0(); i11++) {
            if (!Y0(i11).m()) {
                this.f22844n = (byte) 0;
                return false;
            }
        }
        if (E()) {
            this.f22844n = (byte) 1;
            return true;
        }
        this.f22844n = (byte) 0;
        return false;
    }

    public List m1() {
        return this.f22843m;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
    public void n(CodedOutputStream codedOutputStream) throws IOException {
        d();
        h.d.a aVarT = T();
        if ((this.f22834d & 1) == 1) {
            codedOutputStream.Z(1, this.f22835e);
        }
        if ((this.f22834d & 2) == 2) {
            codedOutputStream.Z(2, this.f22836f);
        }
        for (int i10 = 0; i10 < this.f22837g.size(); i10++) {
            codedOutputStream.c0(3, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.f22837g.get(i10));
        }
        if ((this.f22834d & 4) == 4) {
            codedOutputStream.c0(4, this.f22838h);
        }
        if ((this.f22834d & 8) == 8) {
            codedOutputStream.Z(5, this.f22839i);
        }
        if ((this.f22834d & 16) == 16) {
            codedOutputStream.c0(6, this.f22840j);
        }
        if ((this.f22834d & 32) == 32) {
            codedOutputStream.Z(7, this.f22841k);
        }
        for (int i11 = 0; i11 < this.f22842l.size(); i11++) {
            codedOutputStream.c0(8, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.f22842l.get(i11));
        }
        for (int i12 = 0; i12 < this.f22843m.size(); i12++) {
            codedOutputStream.Z(31, ((Integer) this.f22843m.get(i12)).intValue());
        }
        aVarT.a(200, codedOutputStream);
        codedOutputStream.h0(this.f22833c);
    }

    public boolean n1() {
        return (this.f22834d & 16) == 16;
    }

    public boolean o1() {
        return (this.f22834d & 32) == 32;
    }

    public boolean p1() {
        return (this.f22834d & 1) == 1;
    }

    public boolean q1() {
        return (this.f22834d & 2) == 2;
    }

    public boolean r1() {
        return (this.f22834d & 4) == 4;
    }

    public boolean s1() {
        return (this.f22834d & 8) == 8;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
    /* renamed from: w1, reason: merged with bridge method [inline-methods] */
    public b h() {
        return u1();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
    /* renamed from: y1, reason: merged with bridge method [inline-methods] */
    public b l() {
        return v1(this);
    }

    private r(h.c cVar) {
        super(cVar);
        this.f22844n = (byte) -1;
        this.f22845o = -1;
        this.f22833c = cVar.e();
    }

    private r(boolean z10) {
        this.f22844n = (byte) -1;
        this.f22845o = -1;
        this.f22833c = kotlin.reflect.jvm.internal.impl.protobuf.d.f51945a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
    private r(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
        q.c cVarL;
        this.f22844n = (byte) -1;
        this.f22845o = -1;
        t1();
        d.b bVarU = kotlin.reflect.jvm.internal.impl.protobuf.d.u();
        CodedOutputStream codedOutputStreamI = CodedOutputStream.I(bVarU, 1);
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            ?? Y10 = 128;
            if (!z10) {
                try {
                    try {
                        int iJ = eVar.J();
                        switch (iJ) {
                            case 0:
                                z10 = true;
                            case 8:
                                this.f22834d |= 1;
                                this.f22835e = eVar.r();
                            case 16:
                                this.f22834d |= 2;
                                this.f22836f = eVar.r();
                            case 26:
                                if ((i10 & 4) != 4) {
                                    this.f22837g = new ArrayList();
                                    i10 |= 4;
                                }
                                this.f22837g.add(eVar.t(s.f22857o, fVar));
                            case 34:
                                cVarL = (this.f22834d & 4) == 4 ? this.f22838h.l() : null;
                                q qVar = (q) eVar.t(q.f22784v, fVar);
                                this.f22838h = qVar;
                                if (cVarL != null) {
                                    cVarL.f(qVar);
                                    this.f22838h = cVarL.u();
                                }
                                this.f22834d |= 4;
                            case 40:
                                this.f22834d |= 8;
                                this.f22839i = eVar.r();
                            case 50:
                                cVarL = (this.f22834d & 16) == 16 ? this.f22840j.l() : null;
                                q qVar2 = (q) eVar.t(q.f22784v, fVar);
                                this.f22840j = qVar2;
                                if (cVarL != null) {
                                    cVarL.f(qVar2);
                                    this.f22840j = cVarL.u();
                                }
                                this.f22834d |= 16;
                            case 56:
                                this.f22834d |= 32;
                                this.f22841k = eVar.r();
                            case 66:
                                if ((i10 & 128) != 128) {
                                    this.f22842l = new ArrayList();
                                    i10 |= 128;
                                }
                                this.f22842l.add(eVar.t(Uh.b.f22473i, fVar));
                            case 248:
                                if ((i10 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 256) {
                                    this.f22843m = new ArrayList();
                                    i10 |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                                }
                                this.f22843m.add(Integer.valueOf(eVar.r()));
                            case SQLiteDatabase.MAX_SQL_CACHE_SIZE /* 250 */:
                                int i11 = eVar.i(eVar.z());
                                if ((i10 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 256 && eVar.e() > 0) {
                                    this.f22843m = new ArrayList();
                                    i10 |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                                }
                                while (eVar.e() > 0) {
                                    this.f22843m.add(Integer.valueOf(eVar.r()));
                                }
                                eVar.h(i11);
                                break;
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
                    if ((i10 & 4) == 4) {
                        this.f22837g = Collections.unmodifiableList(this.f22837g);
                    }
                    if ((i10 & 128) == Y10) {
                        this.f22842l = Collections.unmodifiableList(this.f22842l);
                    }
                    if ((i10 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
                        this.f22843m = Collections.unmodifiableList(this.f22843m);
                    }
                    try {
                        codedOutputStreamI.H();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f22833c = bVarU.p();
                        throw th3;
                    }
                    this.f22833c = bVarU.p();
                    s();
                    throw th2;
                }
            } else {
                if ((i10 & 4) == 4) {
                    this.f22837g = Collections.unmodifiableList(this.f22837g);
                }
                if ((i10 & 128) == 128) {
                    this.f22842l = Collections.unmodifiableList(this.f22842l);
                }
                if ((i10 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
                    this.f22843m = Collections.unmodifiableList(this.f22843m);
                }
                try {
                    codedOutputStreamI.H();
                } catch (IOException unused2) {
                } catch (Throwable th4) {
                    this.f22833c = bVarU.p();
                    throw th4;
                }
                this.f22833c = bVarU.p();
                s();
                return;
            }
        }
    }
}
