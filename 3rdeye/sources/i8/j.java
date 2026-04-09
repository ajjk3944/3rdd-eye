package i8;

import J8.E;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: PremiumHelper.kt */
@h9.e(c = "com.zipoapps.premiumhelper.PremiumHelper", f = "PremiumHelper.kt", l = {606, 607}, m = "initPurchases")
/* loaded from: classes3.dex */
public final class j extends h9.c {

    /* renamed from: l, reason: collision with root package name */
    public com.zipoapps.premiumhelper.e f38598l;

    /* renamed from: m, reason: collision with root package name */
    public E f38599m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f38600n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.zipoapps.premiumhelper.e f38601o;

    /* renamed from: p, reason: collision with root package name */
    public int f38602p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.zipoapps.premiumhelper.e eVar, h9.c cVar) {
        super(cVar);
        this.f38601o = eVar;
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        this.f38600n = obj;
        this.f38602p |= RecyclerView.UNDEFINED_DURATION;
        return com.zipoapps.premiumhelper.e.b(this.f38601o, this);
    }
}
