package t5;

import androidx.recyclerview.widget.LinearLayoutManager;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class z extends ek.c {

    /* renamed from: a, reason: collision with root package name */
    public f0 f34303a;

    /* renamed from: b, reason: collision with root package name */
    public km.n f34304b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f34305c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f0 f34306d;

    /* renamed from: e, reason: collision with root package name */
    public int f34307e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(f0 f0Var, ek.c cVar) {
        super(cVar);
        this.f34306d = f0Var;
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        this.f34305c = obj;
        this.f34307e |= LinearLayoutManager.INVALID_OFFSET;
        return f0.b(this.f34306d, this);
    }
}
