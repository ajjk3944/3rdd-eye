package d0;

import androidx.recyclerview.widget.LinearLayoutManager;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class u1 extends ek.c {

    /* renamed from: a, reason: collision with root package name */
    public nk.t f21853a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f21854b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z1 f21855c;

    /* renamed from: d, reason: collision with root package name */
    public int f21856d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(z1 z1Var, ek.c cVar) {
        super(cVar);
        this.f21855c = z1Var;
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        this.f21854b = obj;
        this.f21856d |= LinearLayoutManager.INVALID_OFFSET;
        return this.f21855c.a(0L, this);
    }
}
