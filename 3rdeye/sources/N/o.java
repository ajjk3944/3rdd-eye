package N;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class o implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4420b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f4421c;

    public /* synthetic */ o(s sVar, int i) {
        this.f4420b = i;
        this.f4421c = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4420b) {
            case 0:
                s sVar = this.f4421c;
                sVar.getClass();
                E.u.H().execute(new o(sVar, 1));
                break;
            default:
                s sVar2 = this.f4421c;
                if (!sVar2.f4444n) {
                    sVar2.e();
                    break;
                }
                break;
        }
    }
}
