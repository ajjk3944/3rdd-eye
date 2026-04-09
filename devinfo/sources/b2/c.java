package b2;

import androidx.recyclerview.widget.LinearLayoutManager;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c extends ek.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f1635a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f1636b;

    /* renamed from: c, reason: collision with root package name */
    public int f1637c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, ek.c cVar) {
        super(cVar);
        this.f1636b = eVar;
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        this.f1635a = obj;
        this.f1637c |= LinearLayoutManager.INVALID_OFFSET;
        return this.f1636b.a(0L, 0L, this);
    }
}
