package defpackage;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class t1 extends ew {
    public final /* synthetic */ int o = 0;
    public final /* synthetic */ View p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.p = actionMenuItemView;
    }

    @Override // defpackage.ew
    public final uv0 b() {
        v1 v1Var;
        switch (this.o) {
            case 0:
                u1 u1Var = ((ActionMenuItemView) this.p).r;
                if (u1Var == null || (v1Var = ((w1) u1Var).a.y) == null) {
                    return null;
                }
                return v1Var.a();
            default:
                v1 v1Var2 = ((x1) this.p).i.x;
                if (v1Var2 == null) {
                    return null;
                }
                return v1Var2.a();
        }
    }

    @Override // defpackage.ew
    public final boolean c() {
        uv0 uv0VarB;
        switch (this.o) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.p;
                nd0 nd0Var = actionMenuItemView.p;
                return nd0Var != null && nd0Var.a(actionMenuItemView.m) && (uv0VarB = b()) != null && uv0VarB.a();
            default:
                ((x1) this.p).i.l();
                return true;
        }
    }

    @Override // defpackage.ew
    public boolean d() {
        switch (this.o) {
            case 1:
                y1 y1Var = ((x1) this.p).i;
                if (y1Var.z != null) {
                    return false;
                }
                y1Var.c();
                return true;
            default:
                return super.d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(x1 x1Var, x1 x1Var2) {
        super(x1Var2);
        this.p = x1Var;
    }
}
