package p4;

import androidx.recyclerview.widget.LinearLayoutManager;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class v0 extends ek.c {

    /* renamed from: a, reason: collision with root package name */
    public a0.x0 f31331a;

    /* renamed from: b, reason: collision with root package name */
    public gl.a f31332b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f31333c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a0.x0 f31334d;

    /* renamed from: e, reason: collision with root package name */
    public int f31335e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(a0.x0 x0Var, ek.c cVar) {
        super(cVar);
        this.f31334d = x0Var;
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        this.f31333c = obj;
        this.f31335e |= LinearLayoutManager.INVALID_OFFSET;
        return this.f31334d.J(this);
    }
}
