package a0;

import androidx.recyclerview.widget.LinearLayoutManager;
import z5.C3036l;

/* loaded from: classes.dex */
public final class r extends j5.b {

    /* renamed from: d, reason: collision with root package name */
    public Object f4598d;

    /* renamed from: e, reason: collision with root package name */
    public C0244C f4599e;

    /* renamed from: f, reason: collision with root package name */
    public C3036l f4600f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f4601g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0244C f4602h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(C0244C c0244c, j5.b bVar) {
        super(bVar);
        this.f4602h = c0244c;
    }

    @Override // j5.b
    public final Object l(Object obj) {
        this.f4601g = obj;
        this.i |= LinearLayoutManager.INVALID_OFFSET;
        return C0244C.a(this.f4602h, null, this);
    }
}
