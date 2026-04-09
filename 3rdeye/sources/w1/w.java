package w1;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: InvalidationTracker.kt */
@h9.e(c = "androidx.room.TriggerBasedInvalidationTracker", f = "InvalidationTracker.kt", l = {412}, m = "notifyInvalidation")
/* loaded from: classes.dex */
public final class w extends h9.c {

    /* renamed from: l, reason: collision with root package name */
    public u f47298l;

    /* renamed from: m, reason: collision with root package name */
    public E7.b f47299m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f47300n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ u f47301o;

    /* renamed from: p, reason: collision with root package name */
    public int f47302p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(u uVar, h9.c cVar) {
        super(cVar);
        this.f47301o = uVar;
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        this.f47300n = obj;
        this.f47302p |= RecyclerView.UNDEFINED_DURATION;
        return u.b(this.f47301o, this);
    }
}
