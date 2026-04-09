package t5;

import androidx.recyclerview.widget.LinearLayoutManager;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class y extends ek.c {

    /* renamed from: a, reason: collision with root package name */
    public bl.j f34298a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f34299b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f34300c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bl.j f34301d;

    /* renamed from: e, reason: collision with root package name */
    public int f34302e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(bl.j jVar, ck.c cVar) {
        super(cVar);
        this.f34301d = jVar;
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        this.f34300c = obj;
        this.f34302e |= LinearLayoutManager.INVALID_OFFSET;
        return this.f34301d.a(null, this);
    }
}
