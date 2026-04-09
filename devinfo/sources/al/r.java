package al;

import androidx.recyclerview.widget.LinearLayoutManager;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class r extends ek.c {

    /* renamed from: a, reason: collision with root package name */
    public Throwable f600a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f601b;

    /* renamed from: c, reason: collision with root package name */
    public int f602c;

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        this.f601b = obj;
        this.f602c |= LinearLayoutManager.INVALID_OFFSET;
        return z0.d(null, null, null, this);
    }
}
