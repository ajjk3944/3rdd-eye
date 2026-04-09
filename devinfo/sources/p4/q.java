package p4;

import androidx.recyclerview.widget.LinearLayoutManager;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class q extends ek.c {

    /* renamed from: a, reason: collision with root package name */
    public Object f31275a;

    /* renamed from: b, reason: collision with root package name */
    public z f31276b;

    /* renamed from: c, reason: collision with root package name */
    public xk.n f31277c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f31278d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z f31279e;

    /* renamed from: f, reason: collision with root package name */
    public int f31280f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(z zVar, ek.c cVar) {
        super(cVar);
        this.f31279e = zVar;
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        this.f31278d = obj;
        this.f31280f |= LinearLayoutManager.INVALID_OFFSET;
        return z.c(this.f31279e, null, this);
    }
}
