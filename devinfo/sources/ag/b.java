package ag;

import cm.g;
import com.liuzh.deviceinfo.R;
import hg.e;
import km.o;
import qh.f;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b extends g {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f362e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f363f;

    public /* synthetic */ b(int i4, Object obj) {
        this.f362e = i4;
        this.f363f = obj;
    }

    @Override // cm.g
    public void A() {
        int i4 = this.f362e;
    }

    @Override // cm.g
    public final void B(String str) {
        switch (this.f362e) {
            case 0:
                ((c) this.f363f).f367c = false;
                break;
            default:
                f fVar = (f) this.f363f;
                fVar.f32399k.j(new ng.a(false));
                fVar.f32395e.h(e.e(R.string.load_failed));
                break;
        }
    }

    @Override // cm.g
    public void C(i0.f fVar) {
        int i4 = this.f362e;
    }

    @Override // cm.g
    public void D(n.a aVar) {
        int i4 = this.f362e;
    }

    @Override // cm.g
    public final void E(o oVar) {
        switch (this.f362e) {
            case 0:
                break;
            default:
                f fVar = (f) this.f363f;
                fVar.f32399k.j(new ng.a(false));
                fVar.f32401m = oVar;
                fVar.g.j(Boolean.TRUE);
                break;
        }
    }

    @Override // cm.g
    public final void x(pi.b bVar) {
        switch (this.f362e) {
            case 0:
                cg.a.f2848b.d(bVar);
                break;
            default:
                cg.a.f2848b.d(bVar);
                break;
        }
    }

    @Override // cm.g
    public void z(o oVar) {
        switch (this.f362e) {
            case 0:
                c cVar = (c) this.f363f;
                cVar.f366b = System.currentTimeMillis();
                cVar.f365a = oVar;
                cVar.f367c = false;
                break;
        }
    }

    private final void T() {
    }

    private final void U(i0.f fVar) {
    }

    private final void V(n.a aVar) {
    }

    private final void W(o oVar) {
    }
}
