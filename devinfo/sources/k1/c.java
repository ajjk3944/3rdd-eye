package k1;

import androidx.recyclerview.widget.LinearLayoutManager;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c extends ek.c {

    /* renamed from: a, reason: collision with root package name */
    public zk.c f27787a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f27788b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f27789c;

    /* renamed from: d, reason: collision with root package name */
    public int f27790d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, ek.c cVar) {
        super(cVar);
        this.f27789c = eVar;
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        this.f27788b = obj;
        this.f27790d |= LinearLayoutManager.INVALID_OFFSET;
        return this.f27789c.a(this);
    }
}
