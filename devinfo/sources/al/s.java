package al;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes3.dex */
public final class s extends ek.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f604a;

    /* renamed from: b, reason: collision with root package name */
    public int f605b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f606c;

    /* renamed from: d, reason: collision with root package name */
    public Object f607d;

    /* renamed from: e, reason: collision with root package name */
    public i f608e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(t tVar, ck.c cVar) {
        super(cVar);
        this.f606c = tVar;
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        this.f604a = obj;
        this.f605b |= LinearLayoutManager.INVALID_OFFSET;
        return this.f606c.a(null, this);
    }
}
