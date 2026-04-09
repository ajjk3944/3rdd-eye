package nm;

import androidx.recyclerview.widget.LinearLayoutManager;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class v extends ek.c {

    /* renamed from: a, reason: collision with root package name */
    public e0 f30135a;

    /* renamed from: b, reason: collision with root package name */
    public Object f30136b;

    /* renamed from: c, reason: collision with root package name */
    public c0 f30137c;

    /* renamed from: d, reason: collision with root package name */
    public gl.a f30138d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f30139e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e0 f30140f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(e0 e0Var, ek.c cVar) {
        super(cVar);
        this.f30140f = e0Var;
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        this.f30139e = obj;
        this.g |= LinearLayoutManager.INVALID_OFFSET;
        return e0.b(this.f30140f, null, null, this);
    }
}
