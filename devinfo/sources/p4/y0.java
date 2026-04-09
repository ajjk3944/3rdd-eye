package p4;

import androidx.recyclerview.widget.LinearLayoutManager;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class y0 extends ek.c {

    /* renamed from: a, reason: collision with root package name */
    public Object f31353a;

    /* renamed from: b, reason: collision with root package name */
    public gl.c f31354b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f31355c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a1 f31356d;

    /* renamed from: e, reason: collision with root package name */
    public int f31357e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(a1 a1Var, ek.c cVar) {
        super(cVar);
        this.f31356d = a1Var;
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        this.f31355c = obj;
        this.f31357e |= LinearLayoutManager.INVALID_OFFSET;
        return this.f31356d.c(null, this);
    }
}
