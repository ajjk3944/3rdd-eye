package u6;

import androidx.recyclerview.widget.LinearLayoutManager;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class b0 extends ek.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f35119a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0 f35120b;

    /* renamed from: c, reason: collision with root package name */
    public int f35121c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(c0 c0Var, ek.c cVar) {
        super(cVar);
        this.f35120b = c0Var;
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        this.f35119a = obj;
        this.f35121c |= LinearLayoutManager.INVALID_OFFSET;
        return c0.a(this.f35120b, this);
    }
}
