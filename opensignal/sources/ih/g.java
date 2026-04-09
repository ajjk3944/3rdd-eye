package ih;

import ch.n;

/* loaded from: classes.dex */
public final class g implements wh.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f11394a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f11395b;

    public g(h hVar, k kVar) {
        this.f11395b = hVar;
        this.f11394a = kVar;
    }

    @Override // wh.b
    public final void a(fh.d[] dVarArr) {
        this.f11395b.g("IP_HOST_DETECTION_STARTED", dVarArr);
        n.b("LatencyTest", "onIpHostDetectionStarted() for " + this.f11394a.f11406b.f7344b);
    }

    @Override // wh.b
    public final void b(String str, String str2, String str3) {
        n.b("LatencyTest", " onIpHostDetected(" + str + ", " + str2);
        k kVar = this.f11394a;
        kVar.f11407c = str;
        kVar.f11408d = str2;
        this.f11395b.g("IP_HOST_DETECTED", new fh.d[]{new fh.d(str3, "IP_HOST_URL")});
        if (this.f11395b.f11371d) {
            return;
        }
        n.b("LatencyTest", "   DNS resolved. Running latency test for ".concat(str3));
        h hVar = this.f11395b;
        Thread threadNewThread = hVar.N.newThread(new re.a(17, hVar, this.f11394a, false));
        StringBuilder sb2 = new StringBuilder("LATENCY-THREAD-");
        int i10 = hVar.K;
        hVar.K = i10 + 1;
        sb2.append(i10);
        threadNewThread.setName(sb2.toString());
        hVar.a(threadNewThread);
        threadNewThread.start();
    }

    @Override // wh.b
    public final void c(fh.d[] dVarArr) {
        n.b("LatencyTest", "Cannot detect IP & host for url: " + this.f11394a.f11406b);
        h hVar = this.f11395b;
        hVar.g("IP_HOST_ERROR", dVarArr);
        h.m(hVar);
    }
}
