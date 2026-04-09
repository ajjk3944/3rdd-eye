package a0;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class z extends j5.b {

    /* renamed from: d, reason: collision with root package name */
    public C0244C f4640d;

    /* renamed from: e, reason: collision with root package name */
    public Object f4641e;

    /* renamed from: f, reason: collision with root package name */
    public Object f4642f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f4643g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0244C f4644h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(C0244C c0244c, j5.b bVar) {
        super(bVar);
        this.f4644h = c0244c;
    }

    @Override // j5.b
    public final Object l(Object obj) {
        this.f4643g = obj;
        this.i |= LinearLayoutManager.INVALID_OFFSET;
        return this.f4644h.h(null, this, null);
    }
}
