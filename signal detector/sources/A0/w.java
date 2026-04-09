package a0;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class w extends j5.b {

    /* renamed from: d, reason: collision with root package name */
    public C0244C f4626d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f4627e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0244C f4628f;

    /* renamed from: g, reason: collision with root package name */
    public int f4629g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(C0244C c0244c, j5.b bVar) {
        super(bVar);
        this.f4628f = c0244c;
    }

    @Override // j5.b
    public final Object l(Object obj) {
        this.f4627e = obj;
        this.f4629g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f4628f.e(this);
    }
}
