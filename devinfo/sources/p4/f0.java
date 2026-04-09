package p4;

import androidx.recyclerview.widget.LinearLayoutManager;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class f0 extends ek.c {

    /* renamed from: a, reason: collision with root package name */
    public g0 f31201a;

    /* renamed from: b, reason: collision with root package name */
    public Object f31202b;

    /* renamed from: c, reason: collision with root package name */
    public Object f31203c;

    /* renamed from: d, reason: collision with root package name */
    public i0 f31204d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f31205e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g0 f31206f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(g0 g0Var, ek.c cVar) {
        super(cVar);
        this.f31206f = g0Var;
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        this.f31205e = obj;
        this.g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f31206f.b(null, this);
    }
}
