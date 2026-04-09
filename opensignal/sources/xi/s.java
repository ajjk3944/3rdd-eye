package xi;

/* loaded from: classes.dex */
public final /* synthetic */ class s implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25362a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u f25363d;

    public /* synthetic */ s(u uVar, int i10) {
        this.f25362a = i10;
        this.f25363d = uVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        boolean z11;
        switch (this.f25362a) {
            case 0:
                ch.n.b("SdkLocationRepository", "Initialise location repository");
                u uVar = this.f25363d;
                if (uVar.f25368r.g()) {
                    uVar.f25367g.S();
                    z10 = true;
                } else {
                    ch.n.g("SdkLocationRepository", "Does not have any location permissions");
                    z10 = false;
                }
                ch.n.b("SdkLocationRepository", "isInitialised: " + z10);
                if (z10) {
                    ch.n.b("SdkLocationRepository", "Getting last location");
                    uVar.e();
                    break;
                }
                break;
            default:
                u uVar2 = this.f25363d;
                br.l.e(uVar2, "this$0");
                if (uVar2.f25368r.g()) {
                    uVar2.f25367g.S();
                    z11 = true;
                } else {
                    ch.n.g("SdkLocationRepository", "Does not have any location permissions");
                    z11 = false;
                }
                ch.n.b("SdkLocationRepository", "Request new location. Is initialised: " + z11);
                if (!z11) {
                    uVar2.b("Cannot initialise for new location request");
                    break;
                } else {
                    ch.n.b("SdkLocationRepository", "Requesting location...");
                    uVar2.f25366d.e();
                    break;
                }
        }
    }
}
