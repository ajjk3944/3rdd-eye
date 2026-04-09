package mi;

import ak.j1;
import android.os.Looper;
import h9.r2;
import java.util.concurrent.CountDownLatch;
import ni.d1;
import p.l2;

/* loaded from: classes.dex */
public final class d0 extends f {
    public final gj.b P;
    public final et.d Q;
    public final df.c R;
    public final r2 S;
    public final ch.f T;
    public final r2 U;
    public final oh.p V;
    public final l2 W;
    public final sm.m X;
    public final om.f Y;
    public final ak.b Z;

    /* renamed from: a0, reason: collision with root package name */
    public final q3.a f16796a0;

    /* renamed from: b0, reason: collision with root package name */
    public final b9.c f16797b0;

    /* renamed from: c0, reason: collision with root package name */
    public final i4.b f16798c0;

    /* renamed from: d0, reason: collision with root package name */
    public hj.a f16799d0;

    /* renamed from: e0, reason: collision with root package name */
    public nh.j f16800e0;

    /* renamed from: f0, reason: collision with root package name */
    public final CountDownLatch f16801f0;

    /* renamed from: g0, reason: collision with root package name */
    public String f16802g0;

    /* renamed from: h0, reason: collision with root package name */
    public lm.a f16803h0;

    /* renamed from: i0, reason: collision with root package name */
    public Looper f16804i0;

    /* renamed from: j0, reason: collision with root package name */
    public j1 f16805j0;

    /* renamed from: k0, reason: collision with root package name */
    public final String f16806k0;

    /* renamed from: l0, reason: collision with root package name */
    public final String f16807l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(gj.b bVar, et.d dVar, df.c cVar, r2 r2Var, ch.f fVar, r2 r2Var2, oh.p pVar, l2 l2Var, sm.m mVar, om.f fVar2, ak.b bVar2, q3.a aVar, b9.c cVar2, io.sentry.hints.i iVar, zh.e eVar, fh.f fVar3, zh.a aVar2, xi.j jVar, String str) {
        super(iVar, fVar3, cVar, aVar2, eVar, jVar, str);
        br.l.e(dVar, "videoMeasurementResultMapper");
        br.l.e(mVar, "remoteUrlResponseMapper");
        br.l.e(fVar2, "liveVideoCheckerFactory");
        br.l.e(str, "taskName");
        this.P = bVar;
        this.Q = dVar;
        this.R = cVar;
        this.S = r2Var;
        this.T = fVar;
        this.U = r2Var2;
        this.V = pVar;
        this.W = l2Var;
        this.X = mVar;
        this.Y = fVar2;
        this.Z = bVar2;
        this.f16796a0 = aVar;
        this.f16797b0 = cVar2;
        this.f16798c0 = new i4.b(this, str);
        this.f16801f0 = new CountDownLatch(1);
        this.f16802g0 = "unknown";
        this.f16806k0 = "VIDEO";
        this.f16807l0 = "VideoJob";
    }

    @Override // vj.b
    public final String f() {
        return this.f16806k0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:169:0x05e4  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0605  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0126 A[PHI: r16
  0x0126: PHI (r16v8 kk.b) = (r16v1 kk.b), (r16v2 kk.b), (r16v3 kk.b), (r16v4 kk.b), (r16v5 kk.b), (r16v6 kk.b), (r16v7 kk.b) binds: [B:18:0x0124, B:21:0x0135, B:24:0x0144, B:27:0x0153, B:30:0x0162, B:33:0x0171, B:36:0x0180] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object] */
    @Override // mi.f, vj.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(java.lang.String r96, boolean r97, long r98) throws java.lang.IllegalAccessException, java.lang.InterruptedException, java.lang.ClassNotFoundException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 2031
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: mi.d0.k(java.lang.String, boolean, long):void");
    }

    @Override // mi.f, vj.b
    public final void l(long j) throws IllegalAccessException, ClassNotFoundException, IllegalArgumentException {
        StringBuilder sb2 = new StringBuilder("[");
        c7.a.A(sb2, this.f23922d, ':', j);
        sb2.append("] Stop job");
        ch.n.c("VideoJob", sb2.toString());
        hj.a aVar = this.f16799d0;
        if (aVar != null) {
            aVar.f10790a.n();
        }
        u();
        super.l(j);
        this.f16801f0.countDown();
    }

    @Override // mi.f
    public final String o() {
        return this.f16807l0;
    }

    public final void u() throws IllegalAccessException, ClassNotFoundException, IllegalArgumentException {
        hj.a aVar = this.f16799d0;
        if (aVar != null) {
            oh.t tVar = aVar.f10790a;
            tVar.f19487a = null;
            tVar.M = null;
        }
        nh.j jVar = this.f16800e0;
        String str = this.f16806k0;
        if (jVar == null) {
            ch.n.c("VideoJob", "Video result on finish is null");
            long j = this.f23926y;
            hk.h hVar = this.E;
            if (hVar != null) {
                hVar.e(str, this.f16802g0);
            }
            super.i(j);
            return;
        }
        long jG = g();
        long j7 = this.f23926y;
        String str2 = this.D;
        this.R.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j10 = jVar.f17595a;
        long j11 = jVar.f17596b;
        long j12 = jVar.f17597c;
        long j13 = jVar.f17598d;
        long j14 = jVar.f17599e;
        long j15 = jVar.f17600f;
        String strN = n();
        String str3 = jVar.f17601g;
        String str4 = jVar.f17603i;
        String str5 = jVar.j;
        String str6 = jVar.k;
        long j16 = jVar.f17604l;
        String str7 = jVar.F;
        boolean z10 = jVar.E;
        String str8 = jVar.f17606n;
        String str9 = jVar.f17605m;
        long j17 = jVar.f17607o;
        long j18 = jVar.f17608p;
        String str10 = jVar.f17609q;
        int i10 = jVar.f17611s;
        int i11 = jVar.f17610r;
        String str11 = jVar.f17612t;
        int i12 = jVar.f17613u;
        int i13 = jVar.f17614v;
        double d6 = jVar.f17615w * 1000.0d;
        double d10 = jVar.f17616x;
        double d11 = jVar.f17617y * 1000.0d;
        int i14 = jVar.f17618z;
        int i15 = jVar.A;
        int i16 = jVar.B;
        String str12 = jVar.f17602h;
        int i17 = jVar.C;
        long j19 = jVar.D;
        String str13 = jVar.G;
        oh.p pVar = this.V;
        pVar.getClass();
        String strA = oh.p.A();
        ej.b bVar = ej.b.EXOPLAYER_DASH;
        this.f16797b0.getClass();
        boolean zL = b9.c.l(bVar);
        String strW = pVar.w();
        boolean zL2 = b9.c.l(ej.b.EXOPLAYER_HLS_MEDIA_SOURCE);
        String strX = pVar.x();
        boolean z11 = jVar.H;
        this.W.getClass();
        String strE = l2.E();
        boolean zL3 = b9.c.l(ej.c.MEDIA3_DASH);
        boolean zL4 = b9.c.l(ej.c.MEDIA3_HLS);
        br.l.b(str3);
        br.l.b(str4);
        br.l.b(str5);
        br.l.b(str6);
        br.l.b(str7);
        br.l.b(str8);
        br.l.b(str9);
        br.l.b(str10);
        br.l.b(str11);
        br.l.b(str12);
        br.l.b(str13);
        d1 d1Var = new d1(jG, j7, this.f23922d, this.f16806k0, str2, jCurrentTimeMillis, j10, j11, j12, j13, j14, j15, strN, str3, str4, str5, str6, j16, false, str7, z10, str8, str9, j17, j18, str10, i10, i11, str11, i12, i13, d6, d10, d11, i14, i15, i16, str12, i17, j19, str13, strA, Boolean.valueOf(zL), strW, Boolean.valueOf(zL2), strX, Boolean.valueOf(z11), strE, Boolean.valueOf(zL4), Boolean.valueOf(zL3));
        long j20 = this.f23926y;
        String str14 = jVar.f17606n;
        r2 r2Var = this.S;
        r2Var.m1(j20, str14);
        r2Var.n1(this.f23926y, jVar.f17605m);
        hk.h hVar2 = this.E;
        if (hVar2 != null) {
            hVar2.d(str, d1Var);
        }
    }
}
