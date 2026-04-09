package P7;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: PhConsentManager.kt */
@h9.e(c = "com.zipoapps.ads.PhConsentManager", f = "PhConsentManager.kt", l = {304}, m = "waitForInitComplete")
/* loaded from: classes3.dex */
public final class E extends h9.c {

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f10688l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ x f10689m;

    /* renamed from: n, reason: collision with root package name */
    public int f10690n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(x xVar, h9.c cVar) {
        super(cVar);
        this.f10689m = xVar;
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        this.f10688l = obj;
        this.f10690n |= RecyclerView.UNDEFINED_DURATION;
        return this.f10689m.h(this);
    }
}
