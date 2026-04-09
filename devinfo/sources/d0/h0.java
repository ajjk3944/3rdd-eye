package d0;

import androidx.recyclerview.widget.LinearLayoutManager;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class h0 extends ek.c {

    /* renamed from: a, reason: collision with root package name */
    public u f21742a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f21743b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s1 f21744c;

    /* renamed from: d, reason: collision with root package name */
    public int f21745d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(s1 s1Var, ek.c cVar) {
        super(cVar);
        this.f21744c = s1Var;
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        this.f21743b = obj;
        this.f21745d |= LinearLayoutManager.INVALID_OFFSET;
        return s1.u0(this.f21744c, null, this);
    }
}
