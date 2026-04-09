package d0;

import androidx.recyclerview.widget.LinearLayoutManager;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class g0 extends ek.c {

    /* renamed from: a, reason: collision with root package name */
    public t f21730a;

    /* renamed from: b, reason: collision with root package name */
    public e0.b f21731b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f21732c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s1 f21733d;

    /* renamed from: e, reason: collision with root package name */
    public int f21734e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(s1 s1Var, ek.c cVar) {
        super(cVar);
        this.f21733d = s1Var;
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        this.f21732c = obj;
        this.f21734e |= LinearLayoutManager.INVALID_OFFSET;
        return s1.t0(this.f21733d, null, this);
    }
}
