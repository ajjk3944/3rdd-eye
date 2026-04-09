package t5;

import androidx.recyclerview.widget.LinearLayoutManager;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class x extends ek.c {

    /* renamed from: a, reason: collision with root package name */
    public Object f34294a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f34295b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f0 f34296c;

    /* renamed from: d, reason: collision with root package name */
    public int f34297d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(f0 f0Var, ek.c cVar) {
        super(cVar);
        this.f34296c = f0Var;
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        this.f34295b = obj;
        this.f34297d |= LinearLayoutManager.INVALID_OFFSET;
        return f0.a(this.f34296c, null, this);
    }
}
