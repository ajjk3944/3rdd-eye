package q5;

import androidx.recyclerview.widget.LinearLayoutManager;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class f extends ek.c {

    /* renamed from: a, reason: collision with root package name */
    public g f32190a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f32191b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f32192c;

    /* renamed from: d, reason: collision with root package name */
    public int f32193d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, ck.c cVar) {
        super(cVar);
        this.f32192c = gVar;
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        this.f32191b = obj;
        this.f32193d |= LinearLayoutManager.INVALID_OFFSET;
        return g.J(this.f32192c, null, this);
    }
}
