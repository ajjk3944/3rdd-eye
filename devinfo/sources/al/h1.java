package al;

import androidx.recyclerview.widget.LinearLayoutManager;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class h1 extends ek.c {

    /* renamed from: a, reason: collision with root package name */
    public i1 f523a;

    /* renamed from: b, reason: collision with root package name */
    public i f524b;

    /* renamed from: c, reason: collision with root package name */
    public j1 f525c;

    /* renamed from: d, reason: collision with root package name */
    public xk.y0 f526d;

    /* renamed from: e, reason: collision with root package name */
    public Object f527e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f528f;
    public final /* synthetic */ i1 g;

    /* renamed from: h, reason: collision with root package name */
    public int f529h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(i1 i1Var, ck.c cVar) {
        super(cVar);
        this.g = i1Var;
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        this.f528f = obj;
        this.f529h |= LinearLayoutManager.INVALID_OFFSET;
        this.g.a(null, this);
        return dk.a.f22275a;
    }
}
