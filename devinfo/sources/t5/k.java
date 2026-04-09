package t5;

import androidx.recyclerview.widget.LinearLayoutManager;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class k extends ek.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f34247a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o.e f34248b;

    /* renamed from: c, reason: collision with root package name */
    public int f34249c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(o.e eVar, ek.c cVar) {
        super(cVar);
        this.f34248b = eVar;
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        this.f34247a = obj;
        this.f34249c |= LinearLayoutManager.INVALID_OFFSET;
        this.f34248b.b(null, this);
        return dk.a.f22275a;
    }
}
