package sf;

import androidx.recyclerview.widget.LinearLayoutManager;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class m extends ek.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f33593a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f33594b;

    /* renamed from: c, reason: collision with root package name */
    public int f33595c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, ek.c cVar) {
        super(cVar);
        this.f33594b = nVar;
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        this.f33593a = obj;
        this.f33595c |= LinearLayoutManager.INVALID_OFFSET;
        return this.f33594b.c(null, this);
    }
}
