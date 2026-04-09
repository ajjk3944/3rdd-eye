package mi;

import android.content.Context;
import com.squareup.picasso.j0;
import h9.r2;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import ni.c1;

/* loaded from: classes.dex */
public final class p extends f implements ih.c {
    public final /* synthetic */ int P = 0;
    public final gj.b Q;
    public final et.d R;
    public final gi.a S;
    public final r2 T;
    public final dj.g U;
    public final al.b V;
    public final df.c W;
    public final bm.e X;
    public final CountDownLatch Y;
    public j0 Z;

    /* renamed from: a0, reason: collision with root package name */
    public ih.m f16813a0;

    /* renamed from: b0, reason: collision with root package name */
    public final String f16814b0;

    /* renamed from: c0, reason: collision with root package name */
    public final String f16815c0;

    /* renamed from: d0, reason: collision with root package name */
    public final Object f16816d0;

    /* renamed from: e0, reason: collision with root package name */
    public Object f16817e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(al.b bVar, Context context, bm.e eVar, df.c cVar, dj.g gVar, et.d dVar, fh.f fVar, gi.a aVar, gj.b bVar2, r2 r2Var, io.sentry.hints.i iVar, String str, xi.j jVar, zh.a aVar2, zh.e eVar2) {
        super(iVar, fVar, cVar, aVar2, eVar2, jVar, str);
        br.l.e(str, "taskName");
        this.f16816d0 = context;
        this.Q = bVar2;
        this.V = bVar;
        this.U = gVar;
        this.R = dVar;
        this.S = aVar;
        this.T = r2Var;
        this.W = cVar;
        this.X = eVar;
        this.Y = new CountDownLatch(1);
        this.f16814b0 = "LATENCY";
        this.f16815c0 = "LatencyJob";
    }

    @Override // ih.c
    public final void a(ih.m mVar) {
        hk.h hVar;
        switch (this.P) {
            case 0:
                ch.n.b("LatencyJob", "onTestProgress: latency");
                if (this.B && mVar != null) {
                    this.f16813a0 = mVar;
                    w();
                    ch.n.b("LatencyJob", (ni.z) this.f16817e0);
                    ni.z zVar = (ni.z) this.f16817e0;
                    if (zVar != null && (hVar = this.E) != null) {
                        hVar.f(this.f16814b0, zVar);
                        break;
                    }
                }
                break;
            default:
                ch.n.b("UploadSpeedJob", "onTestProgress: upload");
                if (this.B && mVar != null) {
                    c1 c1VarU = u(mVar);
                    ch.n.b("UploadSpeedJob", c1VarU);
                    hk.h hVar2 = this.E;
                    if (hVar2 != null) {
                        hVar2.f(this.f16814b0, c1VarU);
                        break;
                    }
                }
                break;
        }
    }

    @Override // ih.c
    public final void b(ih.m mVar) {
        switch (this.P) {
            case 0:
                ch.n.b("LatencyJob", "onTestStarted() called with: speedMeasurementResult = " + mVar);
                t("START", new fh.d[0]);
                break;
            default:
                ch.n.b("UploadSpeedJob", "onTestProgress");
                if (mVar != null) {
                    c1 c1VarU = u(mVar);
                    hk.h hVar = this.E;
                    if (hVar != null) {
                        hVar.f(this.f16814b0, c1VarU);
                        break;
                    }
                }
                break;
        }
    }

    @Override // ih.c
    public final void d() {
        switch (this.P) {
            case 0:
                break;
            default:
                ch.n.b("UploadSpeedJob", "onTestError. Do nothing and wait for complete!");
                this.Y.countDown();
                break;
        }
    }

    @Override // ih.c
    public final void e() {
        switch (this.P) {
            case 0:
                ch.n.b("LatencyJob", "latencyResult: " + ((ni.z) this.f16817e0));
                this.Y.countDown();
                break;
            default:
                ch.n.b("UploadSpeedJob", "onTestComplete");
                this.Y.countDown();
                break;
        }
    }

    @Override // vj.b
    public final String f() {
        switch (this.P) {
        }
        return this.f16814b0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01cb  */
    /* JADX WARN: Type inference failed for: r0v43, types: [ih.c, mi.f] */
    /* JADX WARN: Type inference failed for: r0v53, types: [java.lang.InterruptedException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v2, types: [mq.w] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.List] */
    @Override // mi.f, vj.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(java.lang.String r30, boolean r31, long r32) throws java.lang.InterruptedException, java.util.concurrent.BrokenBarrierException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 1200
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: mi.p.k(java.lang.String, boolean, long):void");
    }

    @Override // mi.f, vj.b
    public void l(long j) {
        switch (this.P) {
            case 0:
                StringBuilder sb2 = new StringBuilder("[");
                c7.a.A(sb2, this.f23922d, ':', j);
                sb2.append("] Stop job");
                ch.n.c("LatencyJob", sb2.toString());
                super.l(j);
                break;
            default:
                super.l(j);
                break;
        }
    }

    @Override // mi.f
    public final String o() {
        switch (this.P) {
        }
        return this.f16815c0;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ni.c1 u(ih.m r46) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: mi.p.u(ih.m):ni.c1");
    }

    public List v() {
        List<ih.k> list;
        ih.m mVar = this.f16813a0;
        if (mVar == null || (list = mVar.f11429w) == null) {
            return mq.w.f16945a;
        }
        ArrayList arrayList = new ArrayList();
        for (ih.k kVar : list) {
            br.l.b(kVar);
            arrayList.add((ni.a0) this.S.a(kVar));
        }
        return arrayList;
    }

    public void w() {
        Integer numValueOf;
        long jG = g();
        long j = this.f23926y;
        String str = this.D;
        this.W.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        j0 j0Var = this.Z;
        int iRound = -1;
        int iA = j0Var != null ? j0Var.a() : -1;
        ih.m mVar = this.f16813a0;
        if (mVar != null) {
            int size = mVar.f11429w.size();
            Float[] fArr = new Float[size];
            List list = mVar.f11429w;
            if (list != null && list.size() != 0) {
                for (int i10 = 0; i10 < mVar.f11429w.size(); i10++) {
                    fArr[i10] = Float.valueOf(ih.m.h(50, ((ih.k) mVar.f11429w.get(i10)).f11405a));
                }
                float fFloatValue = Float.MAX_VALUE;
                for (int i11 = 0; i11 < size; i11++) {
                    Float f10 = fArr[i11];
                    if (f10 != null && f10.floatValue() < fFloatValue && f10.floatValue() > 0.0f) {
                        fFloatValue = f10.floatValue();
                    }
                }
                if (fFloatValue == Float.MAX_VALUE) {
                    fFloatValue = -1.0f;
                }
                iRound = Math.round(fFloatValue);
            }
            numValueOf = Integer.valueOf(iRound);
        } else {
            numValueOf = null;
        }
        Integer num = numValueOf;
        this.f16817e0 = new ni.z(jG, j, this.f23922d, this.f16814b0, str, jCurrentTimeMillis, Integer.valueOf(iA), num, v(), n());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Context context, gj.b bVar, et.d dVar, gi.a aVar, r2 r2Var, dj.g gVar, al.b bVar2, df.c cVar, bm.e eVar, zh.e eVar2, cj.a aVar2, fh.f fVar, zh.a aVar3, xi.j jVar, io.sentry.hints.i iVar, String str) {
        super(iVar, fVar, cVar, aVar3, eVar2, jVar, str);
        br.l.e(str, "taskName");
        this.Q = bVar;
        this.R = dVar;
        this.S = aVar;
        this.T = r2Var;
        this.U = gVar;
        this.V = bVar2;
        this.W = cVar;
        this.X = eVar;
        this.f16816d0 = aVar2;
        this.Y = new CountDownLatch(1);
        this.f16814b0 = "UPLOAD_SPEED";
        this.f16815c0 = "UploadSpeedJob";
    }

    private final void x() {
    }
}
