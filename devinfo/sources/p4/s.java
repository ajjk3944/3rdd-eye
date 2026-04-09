package p4;

import androidx.recyclerview.widget.LinearLayoutManager;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class s extends ek.c {

    /* renamed from: a, reason: collision with root package name */
    public z f31300a;

    /* renamed from: b, reason: collision with root package name */
    public int f31301b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f31302c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z f31303d;

    /* renamed from: e, reason: collision with root package name */
    public int f31304e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(z zVar, ek.c cVar) {
        super(cVar);
        this.f31303d = zVar;
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        this.f31302c = obj;
        this.f31304e |= LinearLayoutManager.INVALID_OFFSET;
        return this.f31303d.h(this);
    }
}
