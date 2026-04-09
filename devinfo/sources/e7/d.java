package e7;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class d extends ek.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f22437a;

    /* renamed from: b, reason: collision with root package name */
    public int f22438b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f22439c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, ck.c cVar) {
        super(cVar);
        this.f22439c = eVar;
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        this.f22437a = obj;
        this.f22438b |= LinearLayoutManager.INVALID_OFFSET;
        return this.f22439c.c(null, this);
    }
}
