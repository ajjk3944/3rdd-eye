package nm;

import androidx.recyclerview.widget.LinearLayoutManager;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class k0 extends ek.c {

    /* renamed from: a, reason: collision with root package name */
    public n0 f30077a;

    /* renamed from: b, reason: collision with root package name */
    public j0 f30078b;

    /* renamed from: c, reason: collision with root package name */
    public h0 f30079c;

    /* renamed from: d, reason: collision with root package name */
    public nk.l f30080d;

    /* renamed from: e, reason: collision with root package name */
    public float f30081e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f30082f;
    public final /* synthetic */ n0 g;

    /* renamed from: h, reason: collision with root package name */
    public int f30083h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(n0 n0Var, ek.c cVar) {
        super(cVar);
        this.g = n0Var;
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        this.f30082f = obj;
        this.f30083h |= LinearLayoutManager.INVALID_OFFSET;
        return n0.a(this.g, this);
    }
}
