package n8;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: RemoteConfig.kt */
@h9.e(c = "com.zipoapps.premiumhelper.configuration.remoteconfig.RemoteConfig", f = "RemoteConfig.kt", l = {136}, m = "allValuesToString")
/* loaded from: classes3.dex */
public final class b extends h9.c {

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f44407l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ f f44408m;

    /* renamed from: n, reason: collision with root package name */
    public int f44409n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(f fVar, h9.c cVar) {
        super(cVar);
        this.f44408m = fVar;
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        this.f44407l = obj;
        this.f44409n |= RecyclerView.UNDEFINED_DURATION;
        return this.f44408m.f(this);
    }
}
