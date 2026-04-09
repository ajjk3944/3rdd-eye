package al;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes3.dex */
public final class w extends ek.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f627a;

    /* renamed from: b, reason: collision with root package name */
    public int f628b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v f629c;

    /* renamed from: d, reason: collision with root package name */
    public v f630d;

    /* renamed from: e, reason: collision with root package name */
    public i f631e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(v vVar, ck.c cVar) {
        super(cVar);
        this.f629c = vVar;
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        this.f627a = obj;
        this.f628b |= LinearLayoutManager.INVALID_OFFSET;
        return this.f629c.a(null, this);
    }
}
