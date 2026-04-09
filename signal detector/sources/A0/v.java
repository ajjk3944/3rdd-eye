package a0;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class v extends j5.b {

    /* renamed from: d, reason: collision with root package name */
    public C0244C f4622d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f4623e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0244C f4624f;

    /* renamed from: g, reason: collision with root package name */
    public int f4625g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(C0244C c0244c, j5.b bVar) {
        super(bVar);
        this.f4624f = c0244c;
    }

    @Override // j5.b
    public final Object l(Object obj) {
        this.f4623e = obj;
        this.f4625g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f4624f.d(this);
    }
}
