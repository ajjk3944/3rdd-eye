package defpackage;

import android.view.View;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class mk2 implements ca4 {
    public final /* synthetic */ int a;
    public final p21 b;

    public /* synthetic */ mk2(p21 p21Var, int i) {
        this.a = i;
        this.b = p21Var;
    }

    @Override // defpackage.ga4
    public final Object d() {
        switch (this.a) {
            case 0:
                View view = (View) this.b.g;
                i41.M(view);
                return view;
            case 1:
                b83 b83Var = (b83) this.b.h;
                i41.M(b83Var);
                return b83Var;
            case 2:
                return (dl2) this.b.f;
            default:
                return (ag2) this.b.i;
        }
    }
}
