package w1;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: InvalidationTracker.kt */
@h9.e(c = "androidx.room.TriggerBasedInvalidationTracker", f = "InvalidationTracker.kt", l = {440, 448}, m = "checkInvalidatedTables")
/* loaded from: classes.dex */
public final class v extends h9.c {

    /* renamed from: l, reason: collision with root package name */
    public Object f47294l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f47295m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ u f47296n;

    /* renamed from: o, reason: collision with root package name */
    public int f47297o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(u uVar, h9.c cVar) {
        super(cVar);
        this.f47296n = uVar;
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        this.f47295m = obj;
        this.f47297o |= RecyclerView.UNDEFINED_DURATION;
        return u.a(this.f47296n, null, this);
    }
}
