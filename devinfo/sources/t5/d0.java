package t5;

import androidx.recyclerview.widget.LinearLayoutManager;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class d0 extends ek.c {

    /* renamed from: a, reason: collision with root package name */
    public km.n f34211a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f34212b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f0 f34213c;

    /* renamed from: d, reason: collision with root package name */
    public int f34214d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(f0 f0Var, ek.c cVar) {
        super(cVar);
        this.f34213c = f0Var;
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        this.f34212b = obj;
        this.f34214d |= LinearLayoutManager.INVALID_OFFSET;
        return this.f34213c.f(this);
    }
}
