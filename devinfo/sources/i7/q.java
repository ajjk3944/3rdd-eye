package i7;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class q implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25907a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f25908b;

    public /* synthetic */ q(int i4, Object obj) {
        this.f25907a = i4;
        this.f25908b = obj;
    }

    @Override // i7.a
    public final void a() {
        switch (this.f25907a) {
            case 0:
                ((r) this.f25908b).f25917k = true;
                break;
            case 1:
                ((r) this.f25908b).f25917k = true;
                break;
            case 2:
                ((r) this.f25908b).f25917k = true;
                break;
            default:
                n7.a aVar = (n7.a) this.f25908b;
                boolean z3 = aVar.f29794r.l() == 1.0f;
                if (z3 != aVar.f29800x) {
                    aVar.f29800x = z3;
                    aVar.f29791o.invalidateSelf();
                    break;
                }
                break;
        }
    }
}
