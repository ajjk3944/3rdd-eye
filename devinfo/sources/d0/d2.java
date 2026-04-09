package d0;

import androidx.recyclerview.widget.LinearLayoutManager;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class d2 extends ek.c {

    /* renamed from: a, reason: collision with root package name */
    public yj.c f21697a;

    /* renamed from: b, reason: collision with root package name */
    public mk.a f21698b;

    /* renamed from: c, reason: collision with root package name */
    public float f21699c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f21700d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e2 f21701e;

    /* renamed from: f, reason: collision with root package name */
    public int f21702f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(e2 e2Var, ek.c cVar) {
        super(cVar);
        this.f21701e = e2Var;
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        this.f21700d = obj;
        this.f21702f |= LinearLayoutManager.INVALID_OFFSET;
        return this.f21701e.a(null, null, this);
    }
}
