package T4;

import androidx.recyclerview.widget.LinearLayoutManager;
import q5.o;

/* loaded from: classes.dex */
public final class h extends j5.b {

    /* renamed from: d, reason: collision with root package name */
    public o f3605d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f3606e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l f3607f;

    /* renamed from: g, reason: collision with root package name */
    public int f3608g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(l lVar, j5.b bVar) {
        super(bVar);
        this.f3607f = lVar;
    }

    @Override // j5.b
    public final Object l(Object obj) {
        this.f3606e = obj;
        this.f3608g |= LinearLayoutManager.INVALID_OFFSET;
        return l.e(this.f3607f, 0.0d, 0.0d, this);
    }
}
