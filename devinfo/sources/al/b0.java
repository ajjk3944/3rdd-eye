package al;

import androidx.recyclerview.widget.LinearLayoutManager;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b0 extends ek.c {

    /* renamed from: a, reason: collision with root package name */
    public c0 f478a;

    /* renamed from: b, reason: collision with root package name */
    public Object f479b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f480c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c0 f481d;

    /* renamed from: e, reason: collision with root package name */
    public int f482e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(c0 c0Var, ck.c cVar) {
        super(cVar);
        this.f481d = c0Var;
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        this.f480c = obj;
        this.f482e |= LinearLayoutManager.INVALID_OFFSET;
        return this.f481d.c(null, this);
    }
}
