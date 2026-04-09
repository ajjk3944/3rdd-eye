package d0;

import androidx.recyclerview.widget.LinearLayoutManager;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class f0 extends ek.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f21721a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s1 f21722b;

    /* renamed from: c, reason: collision with root package name */
    public int f21723c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(s1 s1Var, ek.c cVar) {
        super(cVar);
        this.f21722b = s1Var;
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        this.f21721a = obj;
        this.f21723c |= LinearLayoutManager.INVALID_OFFSET;
        return s1.s0(this.f21722b, this);
    }
}
