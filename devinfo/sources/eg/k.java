package eg;

import com.liuzh.deviceinfo.clean.StorageCleanActivity;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class k extends pi.e {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f23470f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i4, Object obj) {
        super(0);
        this.f23470f = i4;
        this.g = obj;
    }

    @Override // pi.e, cm.g
    public final void C(i0.f fVar) {
        switch (this.f23470f) {
            case 0:
                ((l) this.g).f23472l0 = fVar;
                break;
            default:
                ((StorageCleanActivity) this.g).D = fVar;
                break;
        }
    }

    @Override // cm.g
    public final void x(pi.b bVar) {
        switch (this.f23470f) {
            case 0:
                cg.a.f2848b.d(bVar);
                break;
            default:
                cg.a.f2848b.d(bVar);
                break;
        }
    }
}
