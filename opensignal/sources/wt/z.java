package wt;

/* loaded from: classes.dex */
public class z extends a {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f24675r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(pq.h hVar, boolean z10, int i10) {
        super(hVar, z10);
        this.f24675r = i10;
    }

    @Override // wt.b1
    public boolean D(Throwable th2) {
        switch (this.f24675r) {
            case 1:
                w.o(th2, this.f24597g);
                return true;
            default:
                return super.D(th2);
        }
    }
}
