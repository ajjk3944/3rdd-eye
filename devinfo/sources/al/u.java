package al;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes3.dex */
public final class u extends ek.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f617a;

    /* renamed from: b, reason: collision with root package name */
    public int f618b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v f619c;

    /* renamed from: d, reason: collision with root package name */
    public v f620d;

    /* renamed from: e, reason: collision with root package name */
    public i f621e;

    /* renamed from: f, reason: collision with root package name */
    public bl.w f622f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(v vVar, ck.c cVar) {
        super(cVar);
        this.f619c = vVar;
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        this.f617a = obj;
        this.f618b |= LinearLayoutManager.INVALID_OFFSET;
        return this.f619c.a(null, this);
    }
}
