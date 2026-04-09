package N;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class q implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f4424b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f4425c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4426d;

    public /* synthetic */ q(s sVar, int i, int i10) {
        this.f4424b = sVar;
        this.f4425c = i;
        this.f4426d = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        s sVar = this.f4424b;
        int i = sVar.i;
        int i10 = this.f4425c;
        boolean z11 = true;
        if (i != i10) {
            sVar.i = i10;
            z10 = true;
        } else {
            z10 = false;
        }
        int i11 = sVar.f4439h;
        int i12 = this.f4426d;
        if (i11 != i12) {
            sVar.f4439h = i12;
        } else {
            z11 = z10;
        }
        if (z11) {
            sVar.f();
        }
    }
}
