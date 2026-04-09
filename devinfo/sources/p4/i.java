package p4;

import androidx.recyclerview.widget.LinearLayoutManager;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class i extends ek.c {

    /* renamed from: a, reason: collision with root package name */
    public Object f31222a;

    /* renamed from: b, reason: collision with root package name */
    public Object f31223b;

    /* renamed from: c, reason: collision with root package name */
    public Object f31224c;

    /* renamed from: d, reason: collision with root package name */
    public nk.u f31225d;

    /* renamed from: e, reason: collision with root package name */
    public z f31226e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f31227f;
    public final /* synthetic */ j g;

    /* renamed from: h, reason: collision with root package name */
    public int f31228h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, ek.c cVar) {
        super(cVar);
        this.g = jVar;
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        this.f31227f = obj;
        this.f31228h |= LinearLayoutManager.INVALID_OFFSET;
        return this.g.a(null, this);
    }
}
