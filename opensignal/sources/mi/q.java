package mi;

import java.util.Objects;

/* loaded from: classes.dex */
public final class q extends vj.b implements ek.f {
    public final String F;
    public final boolean G;
    public final xi.u H;
    public final df.c I;
    public ak.u J;
    public final Object K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(String str, boolean z10, xi.u uVar, df.c cVar, io.sentry.hints.i iVar, String str2) {
        super(iVar, str2);
        br.l.e(str, "name");
        br.l.e(str2, "taskName");
        this.F = str;
        this.G = z10;
        this.H = uVar;
        this.I = cVar;
        this.K = new Object();
    }

    @Override // vj.b
    public final String f() {
        return this.F;
    }

    @Override // vj.b
    public final void j(long j) {
        StringBuilder sb2 = new StringBuilder("[");
        c7.a.A(sb2, this.f23922d, ':', j);
        sb2.append("] finish job");
        ch.n.b("LocationJob", sb2.toString());
        this.H.d(this);
        super.j(j);
        hk.h hVar = this.E;
        if (hVar != null) {
            hVar.d(this.F, null);
        }
    }

    @Override // vj.b
    public final void k(String str, boolean z10, long j) {
        br.l.e(str, "dataEndpoint");
        super.k(str, z10, j);
        this.H.e();
        ak.u uVar = this.H.G;
        Objects.toString(uVar);
        ch.n.a();
        if (uVar.d(this.I, m())) {
            this.J = uVar;
            Objects.toString(uVar);
            ch.n.a();
        } else {
            StringBuilder sb2 = new StringBuilder("[");
            c7.a.A(sb2, this.f23922d, ':', j);
            sb2.append("] Location is not valid. Fetch new location.");
            ch.n.b("LocationJob", sb2.toString());
            xi.u uVar2 = this.H;
            synchronized (uVar2.H) {
                uVar2.H.add(this);
            }
            long j7 = m().f416d;
            if (!z10) {
                j7 = m().f415c;
            }
            StringBuilder sb3 = new StringBuilder("[");
            c7.a.A(sb3, this.f23922d, ':', j);
            sb3.append("] Location fetch timeout: ");
            sb3.append(j7);
            ch.n.b("LocationJob", sb3.toString());
            synchronized (this.K) {
                xi.u uVar3 = this.H;
                uVar3.getClass();
                ch.n.b("SdkLocationRepository", "Request new location");
                uVar3.f25365a.execute(new xi.s(uVar3, 1));
                ch.n.b("LocationJob", "[" + this.f23922d + ':' + j + "] Lock for a max time of " + j7 + " millis");
                this.K.wait(j7);
            }
        }
        ak.u uVar4 = this.J;
        if (uVar4 == null) {
            StringBuilder sb4 = new StringBuilder("[");
            c7.a.A(sb4, this.f23922d, ':', j);
            sb4.append("] stopOnFailure is ");
            sb4.append(this.G);
            ch.n.g("LocationJob", sb4.toString());
            n();
            return;
        }
        boolean zD = uVar4.d(this.I, m());
        StringBuilder sb5 = new StringBuilder("[");
        c7.a.A(sb5, this.f23922d, ':', j);
        sb5.append("] isNewLocationRecent: ");
        sb5.append(zD);
        sb5.append(", freshnessTimeInMillis:");
        sb5.append(m().f413a);
        sb5.append(", locationAgeMethod: ");
        sb5.append(m().f422l);
        ch.n.b("LocationJob", sb5.toString());
        if (zD) {
            j(j);
        } else {
            n();
        }
    }

    public final ak.a0 m() {
        return h().f529f.f450b;
    }

    public final void n() {
        if (!this.G) {
            j(this.f23926y);
            return;
        }
        long j = this.f23926y;
        StringBuilder sb2 = new StringBuilder("[");
        String str = this.f23922d;
        c7.a.A(sb2, str, ':', j);
        sb2.append("] Couldn't fetch location");
        ch.n.c("LocationJob", sb2.toString());
        super.i(j);
        this.H.d(this);
        hk.h hVar = this.E;
        if (hVar != null) {
            hVar.e(this.F, "[" + str + ':' + j + "] Couldn't fetch location");
        }
    }

    @Override // ek.f
    public final void v0(ak.u uVar) {
        br.l.e(uVar, "deviceLocation");
        uVar.toString();
        ch.n.a();
        this.J = uVar;
        synchronized (this.K) {
            this.K.notify();
        }
    }
}
