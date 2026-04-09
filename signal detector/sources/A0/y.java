package a0;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class y extends j5.b {

    /* renamed from: d, reason: collision with root package name */
    public C0244C f4635d;

    /* renamed from: e, reason: collision with root package name */
    public Object f4636e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f4637f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0244C f4638g;

    /* renamed from: h, reason: collision with root package name */
    public int f4639h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(C0244C c0244c, j5.b bVar) {
        super(bVar);
        this.f4638g = c0244c;
    }

    @Override // j5.b
    public final Object l(Object obj) {
        this.f4637f = obj;
        this.f4639h |= LinearLayoutManager.INVALID_OFFSET;
        return this.f4638g.g(this);
    }
}
