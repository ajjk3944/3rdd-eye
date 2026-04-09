package sh;

import androidx.recyclerview.widget.GridLayoutManager;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class z0 extends androidx.recyclerview.widget.d0 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ GridLayoutManager f33797c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(GridLayoutManager gridLayoutManager) {
        super(0);
        this.f33797c = gridLayoutManager;
    }

    @Override // androidx.recyclerview.widget.d0
    public final int n(int i4) {
        if (i4 <= 2) {
            return this.f33797c.f1211b / 3;
        }
        return 3;
    }
}
