package sf;

import androidx.recyclerview.widget.LinearLayoutManager;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class i extends ek.c {

    /* renamed from: a, reason: collision with root package name */
    public j f33583a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f33584b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f33585c;

    /* renamed from: d, reason: collision with root package name */
    public int f33586d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, ek.c cVar) {
        super(cVar);
        this.f33585c = jVar;
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        this.f33584b = obj;
        this.f33586d |= LinearLayoutManager.INVALID_OFFSET;
        return this.f33585c.b(this);
    }
}
