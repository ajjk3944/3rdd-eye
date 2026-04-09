package p4;

import androidx.recyclerview.widget.LinearLayoutManager;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class x extends ek.c {

    /* renamed from: a, reason: collision with root package name */
    public nk.s f31341a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f31342b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z f31343c;

    /* renamed from: d, reason: collision with root package name */
    public int f31344d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(z zVar, ek.c cVar) {
        super(cVar);
        this.f31343c = zVar;
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        this.f31342b = obj;
        this.f31344d |= LinearLayoutManager.INVALID_OFFSET;
        return this.f31343c.j(null, false, this);
    }
}
