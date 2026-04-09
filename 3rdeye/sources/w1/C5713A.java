package w1;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: InvalidationTracker.kt */
@h9.e(c = "androidx.room.TriggerBasedInvalidationTracker", f = "InvalidationTracker.kt", l = {342}, m = "stopTrackingTable")
/* renamed from: w1.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5713A extends h9.c {

    /* renamed from: l, reason: collision with root package name */
    public g f47167l;

    /* renamed from: m, reason: collision with root package name */
    public String f47168m;

    /* renamed from: n, reason: collision with root package name */
    public String[] f47169n;

    /* renamed from: o, reason: collision with root package name */
    public int f47170o;

    /* renamed from: p, reason: collision with root package name */
    public int f47171p;

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f47172q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ u f47173r;

    /* renamed from: s, reason: collision with root package name */
    public int f47174s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5713A(u uVar, h9.c cVar) {
        super(cVar);
        this.f47173r = uVar;
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        this.f47172q = obj;
        this.f47174s |= RecyclerView.UNDEFINED_DURATION;
        return u.d(this.f47173r, null, 0, this);
    }
}
