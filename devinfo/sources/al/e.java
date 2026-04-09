package al;

import androidx.recyclerview.widget.LinearLayoutManager;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class e extends ek.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f499a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f500b;

    /* renamed from: c, reason: collision with root package name */
    public int f501c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, ck.c cVar) {
        super(cVar);
        this.f500b = fVar;
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        this.f499a = obj;
        this.f501c |= LinearLayoutManager.INVALID_OFFSET;
        return this.f500b.c(null, this);
    }
}
