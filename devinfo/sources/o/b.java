package o;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;
import p.s1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class b extends s1 {
    public final /* synthetic */ int j = 0;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ View f30173k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.f30173k = actionMenuItemView;
    }

    @Override // p.s1
    public final c0 b() {
        p.g gVar;
        switch (this.j) {
            case 0:
                c cVar = ((ActionMenuItemView) this.f30173k).f672m;
                if (cVar == null || (gVar = ((p.h) cVar).f30704a.f30742t) == null) {
                    return null;
                }
                return gVar.a();
            default:
                p.g gVar2 = ((p.j) this.f30173k).f30719d.f30741s;
                if (gVar2 == null) {
                    return null;
                }
                return gVar2.a();
        }
    }

    @Override // p.s1
    public final boolean c() {
        c0 c0VarB;
        switch (this.j) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.f30173k;
                l lVar = actionMenuItemView.f670k;
                return lVar != null && lVar.c(actionMenuItemView.f668h) && (c0VarB = b()) != null && c0VarB.a();
            default:
                ((p.j) this.f30173k).f30719d.l();
                return true;
        }
    }

    @Override // p.s1
    public boolean d() {
        switch (this.j) {
            case 1:
                p.k kVar = ((p.j) this.f30173k).f30719d;
                if (kVar.f30743u != null) {
                    return false;
                }
                kVar.h();
                return true;
            default:
                return super.d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(p.j jVar, p.j jVar2) {
        super(jVar2);
        this.f30173k = jVar;
    }
}
