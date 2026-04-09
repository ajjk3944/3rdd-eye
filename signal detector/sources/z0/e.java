package z0;

import androidx.recyclerview.widget.LinearLayoutManager;
import h5.InterfaceC2370d;

/* loaded from: classes.dex */
public final class e extends j5.b {

    /* renamed from: d, reason: collision with root package name */
    public f f24444d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f24445e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f f24446f;

    /* renamed from: g, reason: collision with root package name */
    public int f24447g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, InterfaceC2370d interfaceC2370d) {
        super(interfaceC2370d);
        this.f24446f = fVar;
    }

    @Override // j5.b
    public final Object l(Object obj) {
        this.f24445e = obj;
        this.f24447g |= LinearLayoutManager.INVALID_OFFSET;
        return f.c(this.f24446f, null, this);
    }
}
