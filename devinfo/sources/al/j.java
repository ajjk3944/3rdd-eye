package al;

import androidx.recyclerview.widget.LinearLayoutManager;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class j extends ek.c {

    /* renamed from: a, reason: collision with root package name */
    public i f537a;

    /* renamed from: b, reason: collision with root package name */
    public zk.w f538b;

    /* renamed from: c, reason: collision with root package name */
    public zk.c f539c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f540d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f541e;

    /* renamed from: f, reason: collision with root package name */
    public int f542f;

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        this.f541e = obj;
        this.f542f |= LinearLayoutManager.INVALID_OFFSET;
        return z0.j(null, null, false, this);
    }
}
