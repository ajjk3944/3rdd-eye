package ls;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class j extends rs.m {

    /* renamed from: f0, reason: collision with root package name */
    public static final j f15793f0;

    /* renamed from: g0, reason: collision with root package name */
    public static final a f15794g0 = new a(3);
    public List B;
    public List D;
    public List E;
    public int F;
    public List G;
    public int H;
    public List I;
    public List J;
    public int K;
    public List L;
    public List M;
    public List N;
    public List O;
    public List P;
    public List Q;
    public int R;
    public int S;
    public q0 T;
    public int U;
    public List V;
    public int W;
    public List X;
    public List Y;
    public int Z;

    /* renamed from: a0, reason: collision with root package name */
    public w0 f15795a0;

    /* renamed from: b0, reason: collision with root package name */
    public List f15796b0;

    /* renamed from: c0, reason: collision with root package name */
    public d1 f15797c0;

    /* renamed from: d, reason: collision with root package name */
    public final rs.e f15798d;

    /* renamed from: d0, reason: collision with root package name */
    public byte f15799d0;

    /* renamed from: e0, reason: collision with root package name */
    public int f15800e0;

    /* renamed from: g, reason: collision with root package name */
    public int f15801g;

    /* renamed from: r, reason: collision with root package name */
    public int f15802r;

    /* renamed from: x, reason: collision with root package name */
    public int f15803x;

    /* renamed from: y, reason: collision with root package name */
    public int f15804y;

    static {
        j jVar = new j();
        f15793f0 = jVar;
        jVar.p();
    }

    public j(h hVar) {
        super(hVar);
        this.F = -1;
        this.H = -1;
        this.K = -1;
        this.R = -1;
        this.W = -1;
        this.Z = -1;
        this.f15799d0 = (byte) -1;
        this.f15800e0 = -1;
        this.f15798d = hVar.f21763a;
    }

    @Override // rs.x
    public final rs.b a() {
        return f15793f0;
    }

    @Override // rs.x
    public final boolean b() {
        byte b2 = this.f15799d0;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        if ((this.f15801g & 2) != 2) {
            this.f15799d0 = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < this.B.size(); i10++) {
            if (!((v0) this.B.get(i10)).b()) {
                this.f15799d0 = (byte) 0;
                return false;
            }
        }
        for (int i11 = 0; i11 < this.D.size(); i11++) {
            if (!((q0) this.D.get(i11)).b()) {
                this.f15799d0 = (byte) 0;
                return false;
            }
        }
        for (int i12 = 0; i12 < this.I.size(); i12++) {
            if (!((q0) this.I.get(i12)).b()) {
                this.f15799d0 = (byte) 0;
                return false;
            }
        }
        for (int i13 = 0; i13 < this.L.size(); i13++) {
            if (!((l) this.L.get(i13)).b()) {
                this.f15799d0 = (byte) 0;
                return false;
            }
        }
        for (int i14 = 0; i14 < this.M.size(); i14++) {
            if (!((y) this.M.get(i14)).b()) {
                this.f15799d0 = (byte) 0;
                return false;
            }
        }
        for (int i15 = 0; i15 < this.N.size(); i15++) {
            if (!((g0) this.N.get(i15)).b()) {
                this.f15799d0 = (byte) 0;
                return false;
            }
        }
        for (int i16 = 0; i16 < this.O.size(); i16++) {
            if (!((s0) this.O.get(i16)).b()) {
                this.f15799d0 = (byte) 0;
                return false;
            }
        }
        for (int i17 = 0; i17 < this.P.size(); i17++) {
            if (!((t) this.P.get(i17)).b()) {
                this.f15799d0 = (byte) 0;
                return false;
            }
        }
        if ((this.f15801g & 16) == 16 && !this.T.b()) {
            this.f15799d0 = (byte) 0;
            return false;
        }
        for (int i18 = 0; i18 < this.X.size(); i18++) {
            if (!((q0) this.X.get(i18)).b()) {
                this.f15799d0 = (byte) 0;
                return false;
            }
        }
        if ((this.f15801g & 64) == 64 && !this.f15795a0.b()) {
            this.f15799d0 = (byte) 0;
            return false;
        }
        if (i()) {
            this.f15799d0 = (byte) 1;
            return true;
        }
        this.f15799d0 = (byte) 0;
        return false;
    }

    @Override // rs.b
    public final int c() {
        int i10 = this.f15800e0;
        if (i10 != -1) {
            return i10;
        }
        int iL = (this.f15801g & 1) == 1 ? b5.m.l(1, this.f15802r) : 0;
        int iM = 0;
        for (int i11 = 0; i11 < this.E.size(); i11++) {
            iM += b5.m.m(((Integer) this.E.get(i11)).intValue());
        }
        int iN = iL + iM;
        if (!this.E.isEmpty()) {
            iN = iN + 1 + b5.m.m(iM);
        }
        this.F = iM;
        if ((this.f15801g & 2) == 2) {
            iN += b5.m.l(3, this.f15803x);
        }
        if ((this.f15801g & 4) == 4) {
            iN += b5.m.l(4, this.f15804y);
        }
        for (int i12 = 0; i12 < this.B.size(); i12++) {
            iN += b5.m.n(5, (rs.b) this.B.get(i12));
        }
        for (int i13 = 0; i13 < this.D.size(); i13++) {
            iN += b5.m.n(6, (rs.b) this.D.get(i13));
        }
        int iM2 = 0;
        for (int i14 = 0; i14 < this.G.size(); i14++) {
            iM2 += b5.m.m(((Integer) this.G.get(i14)).intValue());
        }
        int iN2 = iN + iM2;
        if (!this.G.isEmpty()) {
            iN2 = iN2 + 1 + b5.m.m(iM2);
        }
        this.H = iM2;
        for (int i15 = 0; i15 < this.L.size(); i15++) {
            iN2 += b5.m.n(8, (rs.b) this.L.get(i15));
        }
        for (int i16 = 0; i16 < this.M.size(); i16++) {
            iN2 += b5.m.n(9, (rs.b) this.M.get(i16));
        }
        for (int i17 = 0; i17 < this.N.size(); i17++) {
            iN2 += b5.m.n(10, (rs.b) this.N.get(i17));
        }
        for (int i18 = 0; i18 < this.O.size(); i18++) {
            iN2 += b5.m.n(11, (rs.b) this.O.get(i18));
        }
        for (int i19 = 0; i19 < this.P.size(); i19++) {
            iN2 += b5.m.n(13, (rs.b) this.P.get(i19));
        }
        int iM3 = 0;
        for (int i20 = 0; i20 < this.Q.size(); i20++) {
            iM3 += b5.m.m(((Integer) this.Q.get(i20)).intValue());
        }
        int iN3 = iN2 + iM3;
        if (!this.Q.isEmpty()) {
            iN3 = iN3 + 2 + b5.m.m(iM3);
        }
        this.R = iM3;
        if ((this.f15801g & 8) == 8) {
            iN3 += b5.m.l(17, this.S);
        }
        if ((this.f15801g & 16) == 16) {
            iN3 += b5.m.n(18, this.T);
        }
        if ((this.f15801g & 32) == 32) {
            iN3 += b5.m.l(19, this.U);
        }
        for (int i21 = 0; i21 < this.I.size(); i21++) {
            iN3 += b5.m.n(20, (rs.b) this.I.get(i21));
        }
        int iM4 = 0;
        for (int i22 = 0; i22 < this.J.size(); i22++) {
            iM4 += b5.m.m(((Integer) this.J.get(i22)).intValue());
        }
        int iM5 = iN3 + iM4;
        if (!this.J.isEmpty()) {
            iM5 = iM5 + 2 + b5.m.m(iM4);
        }
        this.K = iM4;
        int iM6 = 0;
        for (int i23 = 0; i23 < this.V.size(); i23++) {
            iM6 += b5.m.m(((Integer) this.V.get(i23)).intValue());
        }
        int iN4 = iM5 + iM6;
        if (!this.V.isEmpty()) {
            iN4 = iN4 + 2 + b5.m.m(iM6);
        }
        this.W = iM6;
        for (int i24 = 0; i24 < this.X.size(); i24++) {
            iN4 += b5.m.n(23, (rs.b) this.X.get(i24));
        }
        int iM7 = 0;
        for (int i25 = 0; i25 < this.Y.size(); i25++) {
            iM7 += b5.m.m(((Integer) this.Y.get(i25)).intValue());
        }
        int iN5 = iN4 + iM7;
        if (!this.Y.isEmpty()) {
            iN5 = iN5 + 2 + b5.m.m(iM7);
        }
        this.Z = iM7;
        if ((this.f15801g & 64) == 64) {
            iN5 += b5.m.n(30, this.f15795a0);
        }
        int iM8 = 0;
        for (int i26 = 0; i26 < this.f15796b0.size(); i26++) {
            iM8 += b5.m.m(((Integer) this.f15796b0.get(i26)).intValue());
        }
        int size = (this.f15796b0.size() * 2) + iN5 + iM8;
        if ((this.f15801g & 128) == 128) {
            size += b5.m.n(32, this.f15797c0);
        }
        int size2 = this.f15798d.size() + j() + size;
        this.f15800e0 = size2;
        return size2;
    }

    @Override // rs.b
    public final rs.k d() {
        return h.h();
    }

    @Override // rs.b
    public final rs.k e() {
        h hVarH = h.h();
        hVarH.i(this);
        return hVarH;
    }

    @Override // rs.b
    public final void f(b5.m mVar) throws IOException {
        c();
        om.f fVar = new om.f(this);
        if ((this.f15801g & 1) == 1) {
            mVar.M(1, this.f15802r);
        }
        if (this.E.size() > 0) {
            mVar.V(18);
            mVar.V(this.F);
        }
        for (int i10 = 0; i10 < this.E.size(); i10++) {
            mVar.N(((Integer) this.E.get(i10)).intValue());
        }
        if ((this.f15801g & 2) == 2) {
            mVar.M(3, this.f15803x);
        }
        if ((this.f15801g & 4) == 4) {
            mVar.M(4, this.f15804y);
        }
        for (int i11 = 0; i11 < this.B.size(); i11++) {
            mVar.O(5, (rs.b) this.B.get(i11));
        }
        for (int i12 = 0; i12 < this.D.size(); i12++) {
            mVar.O(6, (rs.b) this.D.get(i12));
        }
        if (this.G.size() > 0) {
            mVar.V(58);
            mVar.V(this.H);
        }
        for (int i13 = 0; i13 < this.G.size(); i13++) {
            mVar.N(((Integer) this.G.get(i13)).intValue());
        }
        for (int i14 = 0; i14 < this.L.size(); i14++) {
            mVar.O(8, (rs.b) this.L.get(i14));
        }
        for (int i15 = 0; i15 < this.M.size(); i15++) {
            mVar.O(9, (rs.b) this.M.get(i15));
        }
        for (int i16 = 0; i16 < this.N.size(); i16++) {
            mVar.O(10, (rs.b) this.N.get(i16));
        }
        for (int i17 = 0; i17 < this.O.size(); i17++) {
            mVar.O(11, (rs.b) this.O.get(i17));
        }
        for (int i18 = 0; i18 < this.P.size(); i18++) {
            mVar.O(13, (rs.b) this.P.get(i18));
        }
        if (this.Q.size() > 0) {
            mVar.V(130);
            mVar.V(this.R);
        }
        for (int i19 = 0; i19 < this.Q.size(); i19++) {
            mVar.N(((Integer) this.Q.get(i19)).intValue());
        }
        if ((this.f15801g & 8) == 8) {
            mVar.M(17, this.S);
        }
        if ((this.f15801g & 16) == 16) {
            mVar.O(18, this.T);
        }
        if ((this.f15801g & 32) == 32) {
            mVar.M(19, this.U);
        }
        for (int i20 = 0; i20 < this.I.size(); i20++) {
            mVar.O(20, (rs.b) this.I.get(i20));
        }
        if (this.J.size() > 0) {
            mVar.V(170);
            mVar.V(this.K);
        }
        for (int i21 = 0; i21 < this.J.size(); i21++) {
            mVar.N(((Integer) this.J.get(i21)).intValue());
        }
        if (this.V.size() > 0) {
            mVar.V(178);
            mVar.V(this.W);
        }
        for (int i22 = 0; i22 < this.V.size(); i22++) {
            mVar.N(((Integer) this.V.get(i22)).intValue());
        }
        for (int i23 = 0; i23 < this.X.size(); i23++) {
            mVar.O(23, (rs.b) this.X.get(i23));
        }
        if (this.Y.size() > 0) {
            mVar.V(194);
            mVar.V(this.Z);
        }
        for (int i24 = 0; i24 < this.Y.size(); i24++) {
            mVar.N(((Integer) this.Y.get(i24)).intValue());
        }
        if ((this.f15801g & 64) == 64) {
            mVar.O(30, this.f15795a0);
        }
        for (int i25 = 0; i25 < this.f15796b0.size(); i25++) {
            mVar.M(31, ((Integer) this.f15796b0.get(i25)).intValue());
        }
        if ((this.f15801g & 128) == 128) {
            mVar.O(32, this.f15797c0);
        }
        fVar.y(19000, mVar);
        mVar.R(this.f15798d);
    }

    public final void p() {
        this.f15802r = 6;
        this.f15803x = 0;
        this.f15804y = 0;
        List list = Collections.EMPTY_LIST;
        this.B = list;
        this.D = list;
        this.E = list;
        this.G = list;
        this.I = list;
        this.J = list;
        this.L = list;
        this.M = list;
        this.N = list;
        this.O = list;
        this.P = list;
        this.Q = list;
        this.S = 0;
        this.T = q0.P;
        this.U = 0;
        this.V = list;
        this.X = list;
        this.Y = list;
        this.f15795a0 = w0.B;
        this.f15796b0 = list;
        this.f15797c0 = d1.f15751x;
    }

    public j() {
        this.F = -1;
        this.H = -1;
        this.K = -1;
        this.R = -1;
        this.W = -1;
        this.Z = -1;
        this.f15799d0 = (byte) -1;
        this.f15800e0 = -1;
        this.f15798d = rs.e.f21745a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004d  */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v33 */
    /* JADX WARN: Type inference failed for: r7v35 */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v39 */
    /* JADX WARN: Type inference failed for: r7v41 */
    /* JADX WARN: Type inference failed for: r7v43 */
    /* JADX WARN: Type inference failed for: r7v45 */
    /* JADX WARN: Type inference failed for: r7v47 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public j(f5.u r22, rs.g r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1756
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ls.j.<init>(f5.u, rs.g):void");
    }
}
