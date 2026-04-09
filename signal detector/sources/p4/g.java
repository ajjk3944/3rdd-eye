package P4;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class g extends j5.b {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f3160d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i f3161e;

    /* renamed from: f, reason: collision with root package name */
    public int f3162f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, j5.b bVar) {
        super(bVar);
        this.f3161e = iVar;
    }

    @Override // j5.b
    public final Object l(Object obj) {
        this.f3160d = obj;
        this.f3162f |= LinearLayoutManager.INVALID_OFFSET;
        return this.f3161e.d(this);
    }
}
