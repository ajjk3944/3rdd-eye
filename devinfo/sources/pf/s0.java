package pf;

import androidx.recyclerview.widget.LinearLayoutManager;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class s0 extends ek.c {

    /* renamed from: a, reason: collision with root package name */
    public t0 f31892a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f31893b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t0 f31894c;

    /* renamed from: d, reason: collision with root package name */
    public int f31895d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(t0 t0Var, ek.c cVar) {
        super(cVar);
        this.f31894c = t0Var;
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        this.f31893b = obj;
        this.f31895d |= LinearLayoutManager.INVALID_OFFSET;
        return t0.a(this.f31894c, this);
    }
}
