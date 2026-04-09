package defpackage;

import android.os.Handler;
import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class kw extends i30 implements r61, b60, at0, bx {
    public final /* synthetic */ i5 A;
    public final i5 w;
    public final i5 x;
    public final Handler y;
    public final xw z;

    public kw(i5 i5Var) {
        this.A = i5Var;
        Handler handler = new Handler();
        this.z = new xw();
        this.w = i5Var;
        this.x = i5Var;
        this.y = handler;
    }

    @Override // defpackage.i30
    public final View K(int i) {
        return this.A.findViewById(i);
    }

    @Override // defpackage.i30
    public final boolean L() {
        Window window = this.A.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // defpackage.at0
    public final vq2 a() {
        return (vq2) this.A.i.h;
    }

    @Override // defpackage.r61
    public final q61 d() {
        return this.A.d();
    }

    @Override // defpackage.b60
    public final d60 e() {
        return this.A.x;
    }

    @Override // defpackage.bx
    public final void b() {
    }
}
