package d0;

import androidx.recyclerview.widget.LinearLayoutManager;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class n1 extends ek.c {

    /* renamed from: a, reason: collision with root package name */
    public long f21799a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f21800b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a4.d f21801c;

    /* renamed from: d, reason: collision with root package name */
    public int f21802d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(a4.d dVar, ek.c cVar) {
        super(cVar);
        this.f21801c = dVar;
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        this.f21800b = obj;
        this.f21802d |= LinearLayoutManager.INVALID_OFFSET;
        return this.f21801c.j(0L, 0L, this);
    }
}
