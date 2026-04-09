package w1;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: InvalidationTracker.kt */
@h9.e(c = "androidx.room.TriggerBasedInvalidationTracker", f = "InvalidationTracker.kt", l = {323, 328}, m = "startTrackingTable")
/* loaded from: classes.dex */
public final class z extends h9.c {

    /* renamed from: l, reason: collision with root package name */
    public u f47312l;

    /* renamed from: m, reason: collision with root package name */
    public g f47313m;

    /* renamed from: n, reason: collision with root package name */
    public String f47314n;

    /* renamed from: o, reason: collision with root package name */
    public String[] f47315o;

    /* renamed from: p, reason: collision with root package name */
    public int f47316p;

    /* renamed from: q, reason: collision with root package name */
    public int f47317q;

    /* renamed from: r, reason: collision with root package name */
    public int f47318r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f47319s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ u f47320t;

    /* renamed from: u, reason: collision with root package name */
    public int f47321u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(u uVar, h9.c cVar) {
        super(cVar);
        this.f47320t = uVar;
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        this.f47319s = obj;
        this.f47321u |= RecyclerView.UNDEFINED_DURATION;
        return u.c(this.f47320t, null, 0, this);
    }
}
