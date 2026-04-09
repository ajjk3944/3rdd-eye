package p4;

import androidx.recyclerview.widget.LinearLayoutManager;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class t extends ek.c {

    /* renamed from: a, reason: collision with root package name */
    public z f31308a;

    /* renamed from: b, reason: collision with root package name */
    public b1 f31309b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f31310c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f31311d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z f31312e;

    /* renamed from: f, reason: collision with root package name */
    public int f31313f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(z zVar, ck.c cVar) {
        super(cVar);
        this.f31312e = zVar;
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        this.f31311d = obj;
        this.f31313f |= LinearLayoutManager.INVALID_OFFSET;
        return z.e(this.f31312e, false, this);
    }
}
