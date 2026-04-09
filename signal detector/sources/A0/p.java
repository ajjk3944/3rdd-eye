package a0;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class p extends j5.b {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f4592d;

    /* renamed from: e, reason: collision with root package name */
    public int f4593e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C5.f f4594f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(C5.f fVar, j5.b bVar) {
        super(bVar);
        this.f4594f = fVar;
    }

    @Override // j5.b
    public final Object l(Object obj) {
        this.f4592d = obj;
        this.f4593e |= LinearLayoutManager.INVALID_OFFSET;
        return this.f4594f.a(null, this);
    }
}
