package w1;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: InvalidationTracker.kt */
@h9.e(c = "androidx.room.TriggerBasedInvalidationTracker", f = "InvalidationTracker.kt", l = {300}, m = "syncTriggers$room_runtime_release")
/* renamed from: w1.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5714B extends h9.c {

    /* renamed from: l, reason: collision with root package name */
    public E7.b f47175l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f47176m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ u f47177n;

    /* renamed from: o, reason: collision with root package name */
    public int f47178o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5714B(u uVar, h9.c cVar) {
        super(cVar);
        this.f47177n = uVar;
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        this.f47176m = obj;
        this.f47178o |= RecyclerView.UNDEFINED_DURATION;
        return this.f47177n.f(this);
    }
}
