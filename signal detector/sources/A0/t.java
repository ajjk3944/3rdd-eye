package a0;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class t extends j5.b {

    /* renamed from: d, reason: collision with root package name */
    public Object f4611d;

    /* renamed from: e, reason: collision with root package name */
    public Object f4612e;

    /* renamed from: f, reason: collision with root package name */
    public Object f4613f;

    /* renamed from: g, reason: collision with root package name */
    public q5.o f4614g;

    /* renamed from: h, reason: collision with root package name */
    public C0244C f4615h;
    public /* synthetic */ Object i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ u f4616j;

    /* renamed from: k, reason: collision with root package name */
    public int f4617k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(u uVar, j5.b bVar) {
        super(bVar);
        this.f4616j = uVar;
    }

    @Override // j5.b
    public final Object l(Object obj) {
        this.i = obj;
        this.f4617k |= LinearLayoutManager.INVALID_OFFSET;
        return this.f4616j.a(null, this);
    }
}
