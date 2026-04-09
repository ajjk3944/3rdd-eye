package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class zb0 extends LinearLayoutManager {
    public final /* synthetic */ int E;
    public final /* synthetic */ cc0 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zb0(cc0 cc0Var, int i, int i2) {
        super(i);
        this.F = cc0Var;
        this.E = i2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void B0(to0 to0Var, int[] iArr) {
        int i = this.E;
        cc0 cc0Var = this.F;
        if (i == 0) {
            iArr[0] = cc0Var.g0.getWidth();
            iArr[1] = cc0Var.g0.getWidth();
        } else {
            iArr[0] = cc0Var.g0.getHeight();
            iArr[1] = cc0Var.g0.getHeight();
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.ho0
    public final void y0(RecyclerView recyclerView, int i) {
        qd qdVar = new qd(recyclerView.getContext());
        qdVar.a = i;
        z0(qdVar);
    }
}
