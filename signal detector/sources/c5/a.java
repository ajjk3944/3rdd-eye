package C5;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes3.dex */
public final class a extends j5.b {

    /* renamed from: d, reason: collision with root package name */
    public D5.h f1150d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f1151e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ U0.j f1152f;

    /* renamed from: g, reason: collision with root package name */
    public int f1153g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(U0.j jVar, j5.b bVar) {
        super(bVar);
        this.f1152f = jVar;
    }

    @Override // j5.b
    public final Object l(Object obj) {
        this.f1151e = obj;
        this.f1153g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f1152f.k(null, this);
    }
}
