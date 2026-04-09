package c2;

import androidx.recyclerview.widget.LinearLayoutManager;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class i0 extends ek.c {

    /* renamed from: a, reason: collision with root package name */
    public xk.a0 f2622a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f2623b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k0 f2624c;

    /* renamed from: d, reason: collision with root package name */
    public int f2625d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(k0 k0Var, ek.c cVar) {
        super(cVar);
        this.f2624c = k0Var;
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        this.f2623b = obj;
        this.f2625d |= LinearLayoutManager.INVALID_OFFSET;
        return this.f2624c.e(0L, null, this);
    }
}
