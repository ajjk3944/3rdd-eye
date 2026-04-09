package p4;

import androidx.recyclerview.widget.LinearLayoutManager;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class z0 extends ek.c {

    /* renamed from: a, reason: collision with root package name */
    public gl.c f31368a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f31369b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f31370c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a1 f31371d;

    /* renamed from: e, reason: collision with root package name */
    public int f31372e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(a1 a1Var, ek.c cVar) {
        super(cVar);
        this.f31371d = a1Var;
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        this.f31370c = obj;
        this.f31372e |= LinearLayoutManager.INVALID_OFFSET;
        return this.f31371d.e(null, this);
    }
}
