package sh;

import androidx.recyclerview.widget.GridLayoutManager;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class r0 extends androidx.recyclerview.widget.d0 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ GridLayoutManager f33756c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x0 f33757d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(x0 x0Var, GridLayoutManager gridLayoutManager) {
        super(0);
        this.f33757d = x0Var;
        this.f33756c = gridLayoutManager;
    }

    @Override // androidx.recyclerview.widget.d0
    public final int n(int i4) {
        if (this.f33757d.f33783b0.get(i4) instanceof t0) {
            return this.f33756c.f1211b;
        }
        return 1;
    }
}
