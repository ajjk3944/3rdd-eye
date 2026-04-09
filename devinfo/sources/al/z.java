package al;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes3.dex */
public final class z extends ek.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f655a;

    /* renamed from: b, reason: collision with root package name */
    public int f656b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a0 f657c;

    /* renamed from: d, reason: collision with root package name */
    public a0 f658d;

    /* renamed from: e, reason: collision with root package name */
    public i f659e;

    /* renamed from: f, reason: collision with root package name */
    public Throwable f660f;
    public long g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(a0 a0Var, ck.c cVar) {
        super(cVar);
        this.f657c = a0Var;
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        this.f655a = obj;
        this.f656b |= LinearLayoutManager.INVALID_OFFSET;
        return this.f657c.a(null, this);
    }
}
