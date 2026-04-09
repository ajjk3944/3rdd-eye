package u8;

/* loaded from: classes.dex */
public final /* synthetic */ class p implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23481a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f23482b;

    public /* synthetic */ p(int i10, Object obj) {
        this.f23481a = i10;
        this.f23482b = obj;
    }

    @Override // u8.a
    public final void a() {
        switch (this.f23481a) {
            case 0:
                ((q) this.f23482b).k = true;
                break;
            case 1:
                ((q) this.f23482b).k = true;
                break;
            case 2:
                ((q) this.f23482b).k = true;
                break;
            default:
                a9.b bVar = (a9.b) this.f23482b;
                boolean z10 = bVar.f238r.m() == 1.0f;
                if (z10 != bVar.f244x) {
                    bVar.f244x = z10;
                    bVar.f235o.invalidateSelf();
                    break;
                }
                break;
        }
    }
}
