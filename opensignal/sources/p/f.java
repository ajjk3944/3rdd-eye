package p;

import android.content.Context;
import android.view.View;

/* loaded from: classes.dex */
public final class f extends o.w {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f20053l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.b f20054m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(androidx.appcompat.widget.b bVar, Context context, o.m mVar, View view) {
        super(context, mVar, view, true, h.a.actionOverflowMenuStyle, 0);
        this.f20054m = bVar;
        this.f18678f = 8388613;
        o2.g gVar = bVar.T;
        this.f18680h = gVar;
        o.u uVar = this.f18681i;
        if (uVar != null) {
            uVar.k(gVar);
        }
    }

    @Override // o.w
    public final void c() {
        switch (this.f20053l) {
            case 0:
                androidx.appcompat.widget.b bVar = this.f20054m;
                bVar.Q = null;
                bVar.U = 0;
                super.c();
                break;
            default:
                androidx.appcompat.widget.b bVar2 = this.f20054m;
                o.m mVar = bVar2.f1045g;
                if (mVar != null) {
                    mVar.c(true);
                }
                bVar2.P = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(androidx.appcompat.widget.b bVar, Context context, o.e0 e0Var, View view) {
        super(context, e0Var, view, false, h.a.actionOverflowMenuStyle, 0);
        this.f20054m = bVar;
        if ((e0Var.A.f18659x & 32) != 32) {
            View view2 = bVar.F;
            this.f18677e = view2 == null ? (View) bVar.D : view2;
        }
        o2.g gVar = bVar.T;
        this.f18680h = gVar;
        o.u uVar = this.f18681i;
        if (uVar != null) {
            uVar.k(gVar);
        }
    }
}
