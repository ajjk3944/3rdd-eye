package V4;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class s extends j5.b {

    /* renamed from: d, reason: collision with root package name */
    public q5.o f3933d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f3934e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u f3935f;

    /* renamed from: g, reason: collision with root package name */
    public int f3936g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(u uVar, j5.b bVar) {
        super(bVar);
        this.f3935f = uVar;
    }

    @Override // j5.b
    public final Object l(Object obj) {
        this.f3934e = obj;
        this.f3936g |= LinearLayoutManager.INVALID_OFFSET;
        return u.e(this.f3935f, 0.0d, 0.0d, this);
    }
}
