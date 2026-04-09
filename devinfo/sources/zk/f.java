package zk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class f extends ek.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f38331a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f38332b;

    /* renamed from: c, reason: collision with root package name */
    public int f38333c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, ek.c cVar) {
        super(cVar);
        this.f38332b = hVar;
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        this.f38331a = obj;
        this.f38333c |= LinearLayoutManager.INVALID_OFFSET;
        Object objD = h.D(this.f38332b, this);
        return objD == dk.a.f22275a ? objD : new o(objD);
    }
}
