package mi;

/* loaded from: classes.dex */
public final class a extends vj.b {
    public final /* synthetic */ int F = 1;
    public final df.c G;
    public final String H;
    public final Object I;
    public Object J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(mj.d dVar, df.c cVar, io.sentry.hints.i iVar, String str) {
        super(iVar, str);
        br.l.e(dVar, "configUpdater");
        br.l.e(str, "taskName");
        this.I = dVar;
        this.G = cVar;
        this.H = "UPDATE_CONFIG";
    }

    @Override // vj.b
    public final String f() {
        switch (this.F) {
        }
        return this.H;
    }

    @Override // vj.b
    public void i(long j) {
        switch (this.F) {
            case 0:
                StringBuilder sb2 = new StringBuilder("[");
                c7.a.A(sb2, this.f23922d, ':', j);
                sb2.append("] Error");
                ch.n.c("CheckBackgroundNetworkRestrictionsJob", sb2.toString());
                super.i(j);
                hk.h hVar = this.E;
                if (hVar != null) {
                    hVar.e(this.H, "no_connection");
                    break;
                }
                break;
            default:
                super.i(j);
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02c5 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0328  */
    @Override // vj.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(java.lang.String r29, boolean r30, long r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1196
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: mi.a.k(java.lang.String, boolean, long):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(gj.b bVar, df.c cVar, al.b bVar2, io.sentry.hints.i iVar, String str) {
        super(iVar, str);
        br.l.e(str, "taskName");
        this.I = bVar;
        this.G = cVar;
        this.J = bVar2;
        this.H = "CHECK_BACKGROUND_NETWORK_RESTRICTIONS";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(df.c cVar, xi.u uVar, js.e eVar, io.sentry.hints.i iVar, String str) {
        super(iVar, str);
        br.l.e(str, "taskName");
        this.G = cVar;
        this.I = uVar;
        this.J = eVar;
        this.H = "FRESH_LOCATION_OR_WIFI_IP";
    }
}
