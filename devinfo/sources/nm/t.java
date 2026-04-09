package nm;

import androidx.recyclerview.widget.LinearLayoutManager;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class t extends ek.c {

    /* renamed from: a, reason: collision with root package name */
    public e0 f30125a;

    /* renamed from: b, reason: collision with root package name */
    public h0 f30126b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f30127c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e0 f30128d;

    /* renamed from: e, reason: collision with root package name */
    public int f30129e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(e0 e0Var, ek.c cVar) {
        super(cVar);
        this.f30128d = e0Var;
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        this.f30127c = obj;
        this.f30129e |= LinearLayoutManager.INVALID_OFFSET;
        return e0.a(this.f30128d, null, this);
    }
}
