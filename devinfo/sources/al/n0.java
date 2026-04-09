package al;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes3.dex */
public final class n0 extends ek.c {

    /* renamed from: a, reason: collision with root package name */
    public j0 f571a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f572b;

    /* renamed from: c, reason: collision with root package name */
    public int f573c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j0 f574d;

    /* renamed from: e, reason: collision with root package name */
    public Object f575e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(j0 j0Var, ck.c cVar) {
        super(cVar);
        this.f574d = j0Var;
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        this.f572b = obj;
        this.f573c |= LinearLayoutManager.INVALID_OFFSET;
        return this.f574d.c(null, this);
    }
}
