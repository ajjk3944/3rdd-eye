package t5;

import androidx.recyclerview.widget.LinearLayoutManager;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class b0 extends ek.c {

    /* renamed from: a, reason: collision with root package name */
    public f0 f34195a;

    /* renamed from: b, reason: collision with root package name */
    public m f34196b;

    /* renamed from: c, reason: collision with root package name */
    public String f34197c;

    /* renamed from: d, reason: collision with root package name */
    public String[] f34198d;

    /* renamed from: e, reason: collision with root package name */
    public int f34199e;

    /* renamed from: f, reason: collision with root package name */
    public int f34200f;
    public int g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f34201h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ f0 f34202i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(f0 f0Var, ek.c cVar) {
        super(cVar);
        this.f34202i = f0Var;
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        this.f34201h = obj;
        this.j |= LinearLayoutManager.INVALID_OFFSET;
        return f0.c(this.f34202i, null, 0, this);
    }
}
