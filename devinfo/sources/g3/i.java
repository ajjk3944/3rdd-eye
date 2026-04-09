package g3;

import android.os.Parcelable;
import android.util.SparseArray;
import i2.o1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class i extends nk.l implements mk.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24476a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f24477b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(x xVar, int i4) {
        super(0);
        this.f24476a = i4;
        this.f24477b = xVar;
    }

    @Override // mk.a
    public final Object invoke() {
        switch (this.f24476a) {
            case 0:
                this.f24477b.getLayoutNode().C();
                break;
            case 1:
                x xVar = this.f24477b;
                if (xVar.f24482e && xVar.isAttachedToWindow() && xVar.getView().getParent() == xVar) {
                    o1 snapshotObserver = xVar.getSnapshotObserver();
                    snapshotObserver.f25732a.b(xVar, c.f24454b, xVar.getUpdate());
                }
                break;
            case 2:
                SparseArray<Parcelable> sparseArray = new SparseArray<>();
                this.f24477b.A.saveHierarchyState(sparseArray);
                break;
            case 3:
                x xVar2 = this.f24477b;
                xVar2.getReleaseBlock().invoke(xVar2.A);
                x.o(xVar2);
                break;
            case 4:
                x xVar3 = this.f24477b;
                xVar3.getResetBlock().invoke(xVar3.A);
                break;
            default:
                x xVar4 = this.f24477b;
                xVar4.getUpdateBlock().invoke(xVar4.A);
                break;
        }
        return yj.u.f37649a;
    }
}
