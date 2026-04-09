package i8;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: PremiumHelper.kt */
@h9.e(c = "com.zipoapps.premiumhelper.PremiumHelper", f = "PremiumHelper.kt", l = {391}, m = "waitForInitComplete")
/* loaded from: classes3.dex */
public final class o extends h9.c {

    /* renamed from: l, reason: collision with root package name */
    public com.zipoapps.premiumhelper.e f38615l;

    /* renamed from: m, reason: collision with root package name */
    public long f38616m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f38617n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.zipoapps.premiumhelper.e f38618o;

    /* renamed from: p, reason: collision with root package name */
    public int f38619p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.zipoapps.premiumhelper.e eVar, h9.c cVar) {
        super(cVar);
        this.f38618o = eVar;
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        this.f38617n = obj;
        this.f38619p |= RecyclerView.UNDEFINED_DURATION;
        return this.f38618o.o(this);
    }
}
