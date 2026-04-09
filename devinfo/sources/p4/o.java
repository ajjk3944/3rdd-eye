package p4;

import androidx.recyclerview.widget.LinearLayoutManager;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class o extends ek.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f31259a;

    /* renamed from: b, reason: collision with root package name */
    public int f31260b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e7.e f31261c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(e7.e eVar, ck.c cVar) {
        super(cVar);
        this.f31261c = eVar;
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        this.f31259a = obj;
        this.f31260b |= LinearLayoutManager.INVALID_OFFSET;
        return this.f31261c.c(null, this);
    }
}
