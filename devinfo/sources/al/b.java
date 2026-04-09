package al;

import androidx.recyclerview.widget.LinearLayoutManager;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b extends ek.c {

    /* renamed from: a, reason: collision with root package name */
    public zk.u f474a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f475b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f476c;

    /* renamed from: d, reason: collision with root package name */
    public int f477d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, ek.c cVar2) {
        super(cVar2);
        this.f476c = cVar;
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        this.f475b = obj;
        this.f477d |= LinearLayoutManager.INVALID_OFFSET;
        return this.f476c.c(null, this);
    }
}
