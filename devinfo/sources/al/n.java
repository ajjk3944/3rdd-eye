package al;

import androidx.recyclerview.widget.LinearLayoutManager;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class n extends ek.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f568a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f569b;

    /* renamed from: c, reason: collision with root package name */
    public int f570c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, ck.c cVar) {
        super(cVar);
        this.f569b = oVar;
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        this.f568a = obj;
        this.f570c |= LinearLayoutManager.INVALID_OFFSET;
        return this.f569b.c(null, this);
    }
}
