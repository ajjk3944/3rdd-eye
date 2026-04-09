package o;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;
import p.l1;

/* loaded from: classes.dex */
public final class b extends l1 {
    public final /* synthetic */ int F = 0;
    public final /* synthetic */ View G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.G = actionMenuItemView;
    }

    @Override // p.l1
    public final c0 b() {
        p.f fVar;
        switch (this.F) {
            case 0:
                c cVar = ((ActionMenuItemView) this.G).I;
                if (cVar == null || (fVar = ((p.g) cVar).f20059a.Q) == null) {
                    return null;
                }
                return fVar.a();
            default:
                p.f fVar2 = ((p.i) this.G).f20073r.P;
                if (fVar2 == null) {
                    return null;
                }
                return fVar2.a();
        }
    }

    @Override // p.l1
    public final boolean c() {
        c0 c0VarB;
        switch (this.F) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.G;
                l lVar = actionMenuItemView.G;
                return lVar != null && lVar.c(actionMenuItemView.D) && (c0VarB = b()) != null && c0VarB.a();
            default:
                ((p.i) this.G).f20073r.n();
                return true;
        }
    }

    @Override // p.l1
    public boolean d() {
        switch (this.F) {
            case 1:
                androidx.appcompat.widget.b bVar = ((p.i) this.G).f20073r;
                if (bVar.R != null) {
                    return false;
                }
                bVar.g();
                return true;
            default:
                return super.d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(p.i iVar, p.i iVar2) {
        super(iVar2);
        this.G = iVar;
    }
}
