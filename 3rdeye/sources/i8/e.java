package i8;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: Preferences.kt */
@h9.e(c = "com.zipoapps.premiumhelper.Preferences", f = "Preferences.kt", l = {322}, m = "allPreferencesToString")
/* loaded from: classes3.dex */
public final class e extends h9.c {

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f38585l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.zipoapps.premiumhelper.c f38586m;

    /* renamed from: n, reason: collision with root package name */
    public int f38587n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.zipoapps.premiumhelper.c cVar, h9.c cVar2) {
        super(cVar2);
        this.f38586m = cVar;
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        this.f38585l = obj;
        this.f38587n |= RecyclerView.UNDEFINED_DURATION;
        return this.f38586m.f(this);
    }
}
