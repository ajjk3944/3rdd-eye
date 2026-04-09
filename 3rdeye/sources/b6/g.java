package B6;

import H6.C0675l;
import N7.C1439yb;
import c.AbstractC2021s;

/* compiled from: DivTooltipController.kt */
/* loaded from: classes.dex */
public final class g extends AbstractC2021s {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k f530d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1439yb f531e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0675l f532f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(k kVar, C1439yb c1439yb, C0675l c0675l) {
        super(true);
        this.f530d = kVar;
        this.f531e = c1439yb;
        this.f532f = c0675l;
    }

    @Override // c.AbstractC2021s
    public final void a() {
        String str = this.f531e.f9981g;
        this.f530d.d(this.f532f, str);
    }
}
