package d0;

import androidx.recyclerview.widget.LinearLayoutManager;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class u0 extends ek.c {

    /* renamed from: a, reason: collision with root package name */
    public z1 f21847a;

    /* renamed from: b, reason: collision with root package name */
    public nk.r f21848b;

    /* renamed from: c, reason: collision with root package name */
    public float f21849c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f21850d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z0 f21851e;

    /* renamed from: f, reason: collision with root package name */
    public int f21852f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(z0 z0Var, ek.c cVar) {
        super(cVar);
        this.f21851e = z0Var;
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        this.f21850d = obj;
        this.f21852f |= LinearLayoutManager.INVALID_OFFSET;
        return z0.a(this.f21851e, null, null, 0.0f, 0.0f, this);
    }
}
