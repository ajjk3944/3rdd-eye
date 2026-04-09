package P4;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class c extends j5.b {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f3147d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i f3148e;

    /* renamed from: f, reason: collision with root package name */
    public int f3149f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(i iVar, j5.b bVar) {
        super(bVar);
        this.f3148e = iVar;
    }

    @Override // j5.b
    public final Object l(Object obj) {
        this.f3147d = obj;
        this.f3149f |= LinearLayoutManager.INVALID_OFFSET;
        return this.f3148e.a(null, this);
    }
}
