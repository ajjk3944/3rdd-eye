package al;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes3.dex */
public final class s0 extends ek.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f609a;

    /* renamed from: b, reason: collision with root package name */
    public int f610b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j0 f611c;

    /* renamed from: d, reason: collision with root package name */
    public Object f612d;

    /* renamed from: e, reason: collision with root package name */
    public i f613e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(j0 j0Var, ck.c cVar) {
        super(cVar);
        this.f611c = j0Var;
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        this.f609a = obj;
        this.f610b |= LinearLayoutManager.INVALID_OFFSET;
        return this.f611c.c(null, this);
    }
}
