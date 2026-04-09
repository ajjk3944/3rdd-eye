package d0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class u implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f37309b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f37310c;

    public /* synthetic */ u(l lVar, int i) {
        this.f37309b = i;
        this.f37310c = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f37309b) {
            case 0:
                this.f37310c.getClass();
                break;
            default:
                this.f37310c.a();
                break;
        }
    }
}
