package al;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes3.dex */
public final class h0 extends ek.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f519a;

    /* renamed from: b, reason: collision with root package name */
    public int f520b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a0 f521c;

    /* renamed from: d, reason: collision with root package name */
    public j0 f522d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(a0 a0Var, ck.c cVar) {
        super(cVar);
        this.f521c = a0Var;
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        this.f519a = obj;
        this.f520b |= LinearLayoutManager.INVALID_OFFSET;
        return this.f521c.a(null, this);
    }
}
