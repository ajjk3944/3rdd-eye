package C5;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes3.dex */
public final class d extends j5.b {

    /* renamed from: d, reason: collision with root package name */
    public e f1154d;

    /* renamed from: e, reason: collision with root package name */
    public Object f1155e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f1156f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e f1157g;

    /* renamed from: h, reason: collision with root package name */
    public int f1158h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, j5.b bVar) {
        super(bVar);
        this.f1157g = eVar;
    }

    @Override // j5.b
    public final Object l(Object obj) {
        this.f1156f = obj;
        this.f1158h |= LinearLayoutManager.INVALID_OFFSET;
        return this.f1157g.a(null, this);
    }
}
