package zk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class g extends ek.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f38334a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f38335b;

    /* renamed from: c, reason: collision with root package name */
    public int f38336c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, ek.c cVar) {
        super(cVar);
        this.f38335b = hVar;
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        this.f38334a = obj;
        this.f38336c |= LinearLayoutManager.INVALID_OFFSET;
        Object objE = this.f38335b.E(null, 0, 0L, this);
        return objE == dk.a.f22275a ? objE : new o(objE);
    }
}
