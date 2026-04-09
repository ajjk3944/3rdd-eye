package i8;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: PremiumHelper.kt */
@h9.e(c = "com.zipoapps.premiumhelper.PremiumHelper", f = "PremiumHelper.kt", l = {596}, m = "initTesty")
/* loaded from: classes3.dex */
public final class k extends h9.c {

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f38603l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.zipoapps.premiumhelper.e f38604m;

    /* renamed from: n, reason: collision with root package name */
    public int f38605n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.zipoapps.premiumhelper.e eVar, h9.c cVar) {
        super(cVar);
        this.f38604m = eVar;
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        this.f38603l = obj;
        this.f38605n |= RecyclerView.UNDEFINED_DURATION;
        return com.zipoapps.premiumhelper.e.c(this.f38604m, this);
    }
}
