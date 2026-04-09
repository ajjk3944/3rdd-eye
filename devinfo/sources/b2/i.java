package b2;

import androidx.recyclerview.widget.LinearLayoutManager;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class i extends ek.c {

    /* renamed from: a, reason: collision with root package name */
    public long f1651a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f1652b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f1653c;

    /* renamed from: d, reason: collision with root package name */
    public int f1654d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, ek.c cVar) {
        super(cVar);
        this.f1653c = jVar;
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        this.f1652b = obj;
        this.f1654d |= LinearLayoutManager.INVALID_OFFSET;
        return this.f1653c.q(0L, this);
    }
}
