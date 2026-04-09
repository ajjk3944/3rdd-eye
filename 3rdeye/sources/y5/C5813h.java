package y5;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: SettingsCache.kt */
@h9.e(c = "com.google.firebase.sessions.settings.SettingsCache", f = "SettingsCache.kt", l = {119}, m = "updateConfigValue")
/* renamed from: y5.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5813h<T> extends h9.c {

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f48180l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C5812g f48181m;

    /* renamed from: n, reason: collision with root package name */
    public int f48182n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5813h(C5812g c5812g, h9.c cVar) {
        super(cVar);
        this.f48181m = c5812g;
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        this.f48180l = obj;
        this.f48182n |= RecyclerView.UNDEFINED_DURATION;
        return this.f48181m.c(null, null, this);
    }
}
