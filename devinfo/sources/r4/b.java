package r4;

import androidx.recyclerview.widget.LinearLayoutManager;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class b extends ek.c {

    /* renamed from: a, reason: collision with root package name */
    public c f32796a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f32797b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f32798c;

    /* renamed from: d, reason: collision with root package name */
    public int f32799d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, ek.c cVar2) {
        super(cVar2);
        this.f32798c = cVar;
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        this.f32797b = obj;
        this.f32799d |= LinearLayoutManager.INVALID_OFFSET;
        return this.f32798c.a(null, this);
    }
}
