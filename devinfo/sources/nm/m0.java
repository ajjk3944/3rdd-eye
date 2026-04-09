package nm;

import androidx.recyclerview.widget.LinearLayoutManager;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class m0 extends ek.c {

    /* renamed from: a, reason: collision with root package name */
    public n0 f30096a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f30097b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n0 f30098c;

    /* renamed from: d, reason: collision with root package name */
    public int f30099d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(n0 n0Var, ek.c cVar) {
        super(cVar);
        this.f30098c = n0Var;
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        this.f30097b = obj;
        this.f30099d |= LinearLayoutManager.INVALID_OFFSET;
        return this.f30098c.c(this);
    }
}
