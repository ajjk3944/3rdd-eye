package yl;

import com.applovin.shadow.okhttp3.internal.http2.Header;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class r implements wl.f {
    public static final List g = sl.h.k(new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", Header.TARGET_METHOD_UTF8, Header.TARGET_PATH_UTF8, Header.TARGET_SCHEME_UTF8, Header.TARGET_AUTHORITY_UTF8});

    /* renamed from: h, reason: collision with root package name */
    public static final List f37746h = sl.h.k(new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade"});

    /* renamed from: a, reason: collision with root package name */
    public final vl.n f37747a;

    /* renamed from: b, reason: collision with root package name */
    public final wl.h f37748b;

    /* renamed from: c, reason: collision with root package name */
    public final q f37749c;

    /* renamed from: d, reason: collision with root package name */
    public volatile y f37750d;

    /* renamed from: e, reason: collision with root package name */
    public final rl.u f37751e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f37752f;

    public r(rl.t tVar, vl.n nVar, wl.h hVar, q qVar) {
        nk.k.e(qVar, "http2Connection");
        this.f37747a = nVar;
        this.f37748b = hVar;
        this.f37749c = qVar;
        List list = tVar.f33169r;
        rl.u uVar = rl.u.H2_PRIOR_KNOWLEDGE;
        this.f37751e = list.contains(uVar) ? uVar : rl.u.HTTP_2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0019  */
    @Override // wl.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a() {
        /*
            r5 = this;
            yl.y r0 = r5.f37750d
            r1 = 0
            if (r0 == 0) goto L21
            monitor-enter(r0)
            yl.w r2 = r0.f37780h     // Catch: java.lang.Throwable -> L17
            boolean r3 = r2.f37768b     // Catch: java.lang.Throwable -> L17
            r4 = 1
            if (r3 == 0) goto L19
            hm.e r2 = r2.f37770d     // Catch: java.lang.Throwable -> L17
            boolean r2 = r2.exhausted()     // Catch: java.lang.Throwable -> L17
            if (r2 == 0) goto L19
            r2 = r4
            goto L1a
        L17:
            r1 = move-exception
            goto L1f
        L19:
            r2 = r1
        L1a:
            monitor-exit(r0)
            if (r2 != r4) goto L1e
            return r4
        L1e:
            return r1
        L1f:
            monitor-exit(r0)
            throw r1
        L21:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: yl.r.a():boolean");
    }

    @Override // wl.f
    public final long b(rl.z zVar) {
        if (wl.g.a(zVar)) {
            return sl.h.e(zVar);
        }
        return 0L;
    }

    @Override // wl.f
    public final hm.w c(rl.z zVar) {
        y yVar = this.f37750d;
        nk.k.b(yVar);
        return yVar.f37780h;
    }

    @Override // wl.f
    public final void cancel() {
        this.f37752f = true;
        y yVar = this.f37750d;
        if (yVar != null) {
            yVar.f(b.CANCEL);
        }
    }

    @Override // wl.f
    public final void d(va.o oVar) throws IOException {
        int i4;
        y yVar;
        boolean z3;
        if (this.f37750d != null) {
            return;
        }
        boolean z10 = ((rl.x) oVar.f36149e) != null;
        rl.m mVar = (rl.m) oVar.f36148d;
        ArrayList arrayList = new ArrayList(mVar.size() + 4);
        arrayList.add(new d(d.f37677f, (String) oVar.f36147c));
        hm.h hVar = d.g;
        rl.n nVar = (rl.n) oVar.f36146b;
        nk.k.e(nVar, "url");
        String strB = nVar.b();
        String strD = nVar.d();
        if (strD != null) {
            strB = strB + '?' + strD;
        }
        arrayList.add(new d(hVar, strB));
        String strA = ((rl.m) oVar.f36148d).a("Host");
        if (strA != null) {
            arrayList.add(new d(d.f37679i, strA));
        }
        arrayList.add(new d(d.f37678h, nVar.f33113a));
        int size = mVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            String strC = mVar.c(i10);
            Locale locale = Locale.US;
            nk.k.d(locale, "US");
            String lowerCase = strC.toLowerCase(locale);
            nk.k.d(lowerCase, "toLowerCase(...)");
            if (!g.contains(lowerCase) || (lowerCase.equals("te") && mVar.f(i10).equals("trailers"))) {
                arrayList.add(new d(lowerCase, mVar.f(i10)));
            }
        }
        q qVar = this.f37749c;
        qVar.getClass();
        boolean z11 = !z10;
        synchronized (qVar.f37743w) {
            synchronized (qVar) {
                try {
                    if (qVar.f37727e > 1073741823) {
                        qVar.p(b.REFUSED_STREAM);
                    }
                    if (qVar.f37728f) {
                        throw new a();
                    }
                    i4 = qVar.f37727e;
                    qVar.f37727e = i4 + 2;
                    yVar = new y(i4, qVar, z11, false, null);
                    z3 = !z10 || qVar.f37740t >= qVar.f37741u || yVar.f37777d >= yVar.f37778e;
                    if (yVar.i()) {
                        qVar.f37724b.put(Integer.valueOf(i4), yVar);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            qVar.f37743w.p(z11, i4, arrayList);
        }
        if (z3) {
            qVar.f37743w.flush();
        }
        this.f37750d = yVar;
        if (this.f37752f) {
            y yVar2 = this.f37750d;
            nk.k.b(yVar2);
            yVar2.f(b.CANCEL);
            throw new IOException("Canceled");
        }
        y yVar3 = this.f37750d;
        nk.k.b(yVar3);
        x xVar = yVar3.j;
        long j = this.f37748b.g;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        xVar.g(j);
        y yVar4 = this.f37750d;
        nk.k.b(yVar4);
        yVar4.f37782k.g(this.f37748b.f36836h);
    }

    @Override // wl.f
    public final hm.u e(va.o oVar, long j) {
        y yVar = this.f37750d;
        nk.k.b(yVar);
        return yVar.f37781i;
    }

    @Override // wl.f
    public final hm.v f() {
        y yVar = this.f37750d;
        nk.k.b(yVar);
        return yVar;
    }

    @Override // wl.f
    public final void finishRequest() {
        y yVar = this.f37750d;
        nk.k.b(yVar);
        yVar.f37781i.close();
    }

    @Override // wl.f
    public final void flushRequest() {
        this.f37749c.flush();
    }

    @Override // wl.f
    public final wl.e g() {
        return this.f37747a;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002c  */
    @Override // wl.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final rl.y readResponseHeaders(boolean r11) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yl.r.readResponseHeaders(boolean):rl.y");
    }
}
