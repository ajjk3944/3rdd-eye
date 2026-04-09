package t5;

import androidx.recyclerview.widget.LinearLayoutManager;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c0 extends ek.c {

    /* renamed from: a, reason: collision with root package name */
    public m f34204a;

    /* renamed from: b, reason: collision with root package name */
    public String f34205b;

    /* renamed from: c, reason: collision with root package name */
    public String[] f34206c;

    /* renamed from: d, reason: collision with root package name */
    public int f34207d;

    /* renamed from: e, reason: collision with root package name */
    public int f34208e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f34209f;
    public final /* synthetic */ f0 g;

    /* renamed from: h, reason: collision with root package name */
    public int f34210h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(f0 f0Var, ek.c cVar) {
        super(cVar);
        this.g = f0Var;
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        this.f34209f = obj;
        this.f34210h |= LinearLayoutManager.INVALID_OFFSET;
        return f0.d(this.g, null, 0, this);
    }
}
