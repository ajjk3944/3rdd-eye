package xk;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class a0 extends a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f37168d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(ck.h hVar, boolean z3, int i4) {
        super(hVar, z3);
        this.f37168d = i4;
    }

    @Override // xk.f1
    public boolean K(Throwable th2) {
        switch (this.f37168d) {
            case 1:
                x.q(this.f37167c, th2);
                return true;
            default:
                return super.K(th2);
        }
    }
}
