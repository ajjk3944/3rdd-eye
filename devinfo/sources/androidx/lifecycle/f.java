package androidx.lifecycle;

import androidx.recyclerview.widget.LinearLayoutManager;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class f extends ek.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f1129a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f1130b;

    /* renamed from: c, reason: collision with root package name */
    public int f1131c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, ek.c cVar) {
        super(cVar);
        this.f1130b = gVar;
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        this.f1129a = obj;
        this.f1131c |= LinearLayoutManager.INVALID_OFFSET;
        this.f1130b.k(this);
        return yj.u.f37649a;
    }
}
