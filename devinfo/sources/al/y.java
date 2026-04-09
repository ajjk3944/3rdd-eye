package al;

import androidx.recyclerview.widget.LinearLayoutManager;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class y extends ek.c {

    /* renamed from: a, reason: collision with root package name */
    public f f645a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f646b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f647c;

    /* renamed from: d, reason: collision with root package name */
    public int f648d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(f fVar, ck.c cVar) {
        super(cVar);
        this.f647c = fVar;
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        this.f646b = obj;
        this.f648d |= LinearLayoutManager.INVALID_OFFSET;
        return this.f647c.c(null, this);
    }
}
