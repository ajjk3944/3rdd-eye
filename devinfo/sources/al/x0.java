package al;

import androidx.recyclerview.widget.LinearLayoutManager;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class x0 extends ek.c {

    /* renamed from: a, reason: collision with root package name */
    public y0 f639a;

    /* renamed from: b, reason: collision with root package name */
    public i f640b;

    /* renamed from: c, reason: collision with root package name */
    public a1 f641c;

    /* renamed from: d, reason: collision with root package name */
    public xk.y0 f642d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f643e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ y0 f644f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(y0 y0Var, ck.c cVar) {
        super(cVar);
        this.f644f = y0Var;
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.f643e = obj;
        this.g |= LinearLayoutManager.INVALID_OFFSET;
        y0.k(this.f644f, null, this);
        return dk.a.f22275a;
    }
}
