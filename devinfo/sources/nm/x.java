package nm;

import androidx.recyclerview.widget.LinearLayoutManager;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class x extends ek.c {

    /* renamed from: a, reason: collision with root package name */
    public e0 f30144a;

    /* renamed from: b, reason: collision with root package name */
    public Object f30145b;

    /* renamed from: c, reason: collision with root package name */
    public c0 f30146c;

    /* renamed from: d, reason: collision with root package name */
    public long f30147d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f30148e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e0 f30149f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(e0 e0Var, ek.c cVar) {
        super(cVar);
        this.f30149f = e0Var;
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        this.f30148e = obj;
        this.g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f30149f.g(null, 0L, this);
    }
}
