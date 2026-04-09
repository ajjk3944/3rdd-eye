package p4;

import androidx.recyclerview.widget.LinearLayoutManager;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class e0 extends ek.c {

    /* renamed from: a, reason: collision with root package name */
    public g0 f31190a;

    /* renamed from: b, reason: collision with root package name */
    public b0 f31191b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f31192c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f31193d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g0 f31194e;

    /* renamed from: f, reason: collision with root package name */
    public int f31195f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(g0 g0Var, ek.c cVar) {
        super(cVar);
        this.f31194e = g0Var;
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        this.f31193d = obj;
        this.f31195f |= LinearLayoutManager.INVALID_OFFSET;
        return this.f31194e.a(null, this);
    }
}
