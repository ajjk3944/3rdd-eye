package d0;

import androidx.recyclerview.widget.LinearLayoutManager;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class y0 extends ek.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f21899a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z0 f21900b;

    /* renamed from: c, reason: collision with root package name */
    public int f21901c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(z0 z0Var, ek.c cVar) {
        super(cVar);
        this.f21900b = z0Var;
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        this.f21899a = obj;
        this.f21901c |= LinearLayoutManager.INVALID_OFFSET;
        return this.f21900b.v(null, null, this);
    }
}
