package pf;

import androidx.recyclerview.widget.LinearLayoutManager;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b1 extends ek.c {

    /* renamed from: a, reason: collision with root package name */
    public String f31768a;

    /* renamed from: b, reason: collision with root package name */
    public z0 f31769b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f31770c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c1 f31771d;

    /* renamed from: e, reason: collision with root package name */
    public int f31772e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(c1 c1Var, ck.c cVar) {
        super(cVar);
        this.f31771d = c1Var;
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        this.f31770c = obj;
        this.f31772e |= LinearLayoutManager.INVALID_OFFSET;
        return c1.a(this.f31771d, null, null, this);
    }
}
