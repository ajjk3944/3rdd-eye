package al;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes3.dex */
public final class e0 extends ek.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f502a;

    /* renamed from: b, reason: collision with root package name */
    public int f503b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f0 f504c;

    /* renamed from: d, reason: collision with root package name */
    public Object f505d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(f0 f0Var, ck.c cVar) {
        super(cVar);
        this.f504c = f0Var;
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        this.f502a = obj;
        this.f503b |= LinearLayoutManager.INVALID_OFFSET;
        return this.f504c.a(null, this);
    }
}
