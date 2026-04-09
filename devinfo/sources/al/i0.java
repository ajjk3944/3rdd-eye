package al;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes3.dex */
public final class i0 extends ek.c {

    /* renamed from: a, reason: collision with root package name */
    public j0 f530a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f531b;

    /* renamed from: c, reason: collision with root package name */
    public int f532c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j0 f533d;

    /* renamed from: e, reason: collision with root package name */
    public Object f534e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(j0 j0Var, ck.c cVar) {
        super(cVar);
        this.f533d = j0Var;
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        this.f531b = obj;
        this.f532c |= LinearLayoutManager.INVALID_OFFSET;
        return this.f533d.c(null, this);
    }
}
