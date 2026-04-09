package mi;

import android.content.Context;
import com.squareup.picasso.j0;
import h9.r2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

/* loaded from: classes.dex */
public final class d extends f implements ih.c {
    public final gj.b P;
    public final et.d Q;
    public final gi.a R;
    public final r2 S;
    public final dj.g T;
    public final al.b U;
    public final bm.e V;
    public final df.c W;
    public final CountDownLatch X;
    public j0 Y;
    public ih.m Z;

    /* renamed from: a0, reason: collision with root package name */
    public jh.c f16793a0;

    /* renamed from: b0, reason: collision with root package name */
    public final String f16794b0;

    /* renamed from: c0, reason: collision with root package name */
    public final String f16795c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(al.b bVar, Context context, bm.e eVar, df.c cVar, dj.g gVar, et.d dVar, fh.f fVar, gi.a aVar, gj.b bVar2, r2 r2Var, io.sentry.hints.i iVar, String str, xi.j jVar, zh.a aVar2, zh.e eVar2) {
        super(iVar, fVar, cVar, aVar2, eVar2, jVar, str);
        br.l.e(str, "taskName");
        this.P = bVar2;
        this.Q = dVar;
        this.R = aVar;
        this.S = r2Var;
        this.T = gVar;
        this.U = bVar;
        this.V = eVar;
        this.W = cVar;
        this.X = new CountDownLatch(1);
        this.f16794b0 = "DOWNLOAD_SPEED";
        this.f16795c0 = "DownloadSpeedJob";
    }

    @Override // ih.c
    public final void a(ih.m mVar) {
        ch.n.b("DownloadSpeedJob", "onTestProgress: download");
        if (this.B && mVar != null) {
            ni.n nVarU = u(this.f23922d, mVar);
            hk.h hVar = this.E;
            if (hVar != null) {
                hVar.f(this.f16794b0, nVarU);
            }
        }
    }

    @Override // ih.c
    public final void b(ih.m mVar) {
        if (mVar != null) {
            ni.n nVarU = u(this.f23922d, mVar);
            hk.h hVar = this.E;
            if (hVar != null) {
                hVar.f(this.f16794b0, nVarU);
            }
        }
    }

    @Override // ih.c
    public final void d() {
        ch.n.b("DownloadSpeedJob", "onTestError. Do nothing and wait for complete!");
    }

    @Override // ih.c
    public final void e() {
        this.X.countDown();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!d.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        br.l.c(obj, "null cannot be cast to non-null type com.opensignal.sdk.data.job.DownloadSpeedJob");
        return br.l.a(this.f16794b0, ((d) obj).f16794b0);
    }

    @Override // vj.b
    public final String f() {
        return this.f16794b0;
    }

    public final int hashCode() {
        return this.f16794b0.hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [mq.w] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.util.ArrayList] */
    @Override // mi.f, vj.b
    public final void k(String str, boolean z10, long j) throws InterruptedException, BrokenBarrierException {
        List list;
        ?? arrayList;
        i4.b bVar;
        br.l.e(str, "dataEndpoint");
        super.k(str, z10, j);
        dh.e eVarP = this.Q.p(h().f529f.f453e);
        bm.e eVar = this.V;
        this.Y = new j0((al.b) eVar.f2830d, (dj.g) eVar.f2831g);
        int iE = this.U.e();
        int iL = this.T.b().l();
        r2 r2Var = this.S;
        long j7 = this.f23926y;
        synchronized (((HashMap) r2Var.f10470a)) {
            list = (List) ((HashMap) r2Var.f10470a).get(Long.valueOf(j7));
        }
        if (list != null) {
            arrayList = new ArrayList(mq.p.a0(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add((ih.k) this.R.g((ni.a0) it.next()));
            }
        } else {
            arrayList = mq.w.f16945a;
        }
        this.Z = new ih.m(iE, iL, arrayList);
        gj.b bVar2 = this.P;
        bVar2.getClass();
        jh.c cVar = new jh.c(bVar2.f9591a, bVar2.f9596f, bVar2.f9592b, z10 ? bVar2.f9595e.e() == 1 ? eVarP.f7349d : eVarP.f7348c : eVarP.f7350e, eVarP.f7346a, eVarP, bVar2.f9597g, bVar2.f9599i, bVar2.j, bVar2.k);
        this.f16793a0 = cVar;
        cVar.f11385t = this;
        cVar.f11386u = this;
        ih.m mVar = this.Z;
        ch.n.b("DownloadTest", "->> start download test");
        ih.d dVar = ih.d.DOWNLOAD;
        cVar.c(dVar, mVar);
        cVar.f11379n = new CyclicBarrier(cVar.f11375h + 1);
        ih.j jVar = new ih.j(cVar.E, cVar.F, cVar.G, cVar.f11369b, mVar.f11429w, cVar.H, cVar.J);
        ArrayList arrayList2 = jVar.f11400e;
        dh.c cVar2 = jVar.f11399d;
        if (cVar2 == dh.c.MAX_LATENCY_THRESHOLD) {
            jVar.f11404i = jVar.b(arrayList2);
        }
        if (cVar2 == dh.c.UNKNOWN || jVar.f11404i.equals("invalid-server-name")) {
            jVar.f11404i = jVar.a(arrayList2);
        }
        String strC = jVar.c(jVar.f11404i, dVar);
        ch.n.b("ServerSelector", "Download server name : " + jVar.f11404i);
        ch.n.a();
        String str2 = jVar.f11404i;
        dh.b bVar3 = new dh.b(str2, strC);
        int i10 = wh.a.f24525b;
        if (strC.startsWith("https://")) {
            bVar = new jh.a(bVar3);
            ch.n.b("DownloadProviderHttps", c7.a.p("HTTPS download from: ", str2));
        } else {
            bVar = new i4.b(bVar3);
        }
        cVar.D = bVar;
        mVar.A = ((dh.b) bVar.f11197d).f7343a;
        ch.n.a();
        for (int i11 = 0; i11 < cVar.f11375h; i11++) {
            Thread threadNewThread = cVar.K.newThread(new b4.e(20, cVar));
            threadNewThread.setName("DOWNLOAD-THREAD-" + i11);
            cVar.a(threadNewThread);
            threadNewThread.start();
        }
        try {
            cVar.f11379n.await();
        } catch (InterruptedException | BrokenBarrierException e4) {
            ch.n.e("BaseSpeedTest", e4);
        }
        ih.e.j(((dh.b) cVar.D.f11197d).f7344b, new jh.b(0, cVar));
        this.X.await();
        super.j(j);
        String str3 = this.f23922d;
        jh.c cVar3 = this.f16793a0;
        if (cVar3 != null) {
            cVar3.f11385t = null;
        }
        ih.m mVar2 = this.Z;
        if (mVar2 == null) {
            ch.n.b("DownloadSpeedJob", "Speed measurement result is null");
            return;
        }
        ni.n nVarU = u(str3, mVar2);
        r2Var.m1(this.f23926y, mVar2.f11419m);
        r2Var.n1(this.f23926y, mVar2.k);
        hk.h hVar = this.E;
        if (hVar != null) {
            hVar.d(this.f16794b0, nVarU);
        }
    }

    @Override // mi.f
    public final String o() {
        return this.f16795c0;
    }

    public final ni.n u(String str, ih.m mVar) {
        long j;
        long jRound;
        br.l.e(str, "taskName");
        br.l.e(mVar, "result");
        CopyOnWriteArrayList copyOnWriteArrayList = mVar.f11410b;
        CopyOnWriteArrayList copyOnWriteArrayList2 = mVar.f11411c;
        long jG = g();
        long j7 = this.f23926y;
        String str2 = this.D;
        this.W.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j10 = mVar.f11430x;
        long j11 = mVar.f11426t;
        if (j11 == 0) {
            jRound = -1;
            j = j7;
        } else {
            j = j7;
            jRound = Math.round((mVar.f11416h * 8) / j11);
        }
        long jRound2 = Math.round(ih.m.h(10, ih.m.j(copyOnWriteArrayList, copyOnWriteArrayList2)) * 8.0f);
        long j12 = jRound;
        long j13 = mVar.f11416h;
        Long l10 = (copyOnWriteArrayList2 == null || copyOnWriteArrayList2.size() == 0) ? null : (Long) copyOnWriteArrayList2.get(copyOnWriteArrayList2.size() - 1);
        String strI = ih.m.i(copyOnWriteArrayList);
        String strI2 = ih.m.i(copyOnWriteArrayList2);
        String str3 = mVar.A;
        String str4 = mVar.k;
        String str5 = mVar.f11419m;
        int i10 = mVar.f11421o;
        j0 j0Var = this.Y;
        int iA = j0Var != null ? j0Var.a() : -1;
        String strN = n();
        long j14 = mVar.B;
        br.l.b(str3);
        br.l.b(str4);
        br.l.b(str5);
        return new ni.n(jG, j, str, "DOWNLOAD_SPEED", str2, jCurrentTimeMillis, j10, j12, jRound2, j13, l10, strI, strI2, str3, str4, str5, i10, iA, strN, j14);
    }
}
