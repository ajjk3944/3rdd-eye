package j2;

import androidx.recyclerview.widget.LinearLayoutManager;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class u extends ek.c {

    /* renamed from: a, reason: collision with root package name */
    public x.v f27321a;

    /* renamed from: b, reason: collision with root package name */
    public zk.c f27322b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f27323c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x f27324d;

    /* renamed from: e, reason: collision with root package name */
    public int f27325e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(x xVar, ek.c cVar) {
        super(cVar);
        this.f27324d = xVar;
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        this.f27323c = obj;
        this.f27325e |= LinearLayoutManager.INVALID_OFFSET;
        return this.f27324d.l(this);
    }
}
