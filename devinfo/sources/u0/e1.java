package u0;

import androidx.recyclerview.widget.LinearLayoutManager;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class e1 extends ek.c {

    /* renamed from: a, reason: collision with root package name */
    public mk.c f34775a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f34776b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j2.l0 f34777c;

    /* renamed from: d, reason: collision with root package name */
    public int f34778d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(j2.l0 l0Var, ek.c cVar) {
        super(cVar);
        this.f34777c = l0Var;
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        this.f34776b = obj;
        this.f34778d |= LinearLayoutManager.INVALID_OFFSET;
        return this.f34777c.a(null, this);
    }
}
