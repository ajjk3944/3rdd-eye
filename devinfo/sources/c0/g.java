package c0;

import androidx.recyclerview.widget.LinearLayoutManager;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class g extends ek.c {

    /* renamed from: a, reason: collision with root package name */
    public long f2416a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f2417b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f2418c;

    /* renamed from: d, reason: collision with root package name */
    public int f2419d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(j jVar, ek.c cVar) {
        super(cVar);
        this.f2418c = jVar;
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        this.f2417b = obj;
        this.f2419d |= LinearLayoutManager.INVALID_OFFSET;
        return this.f2418c.b(0L, null, this);
    }
}
