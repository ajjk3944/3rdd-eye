package defpackage;

import android.app.Activity;
import android.view.View;
import java.util.Map;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ji3 implements ca4 {
    public final /* synthetic */ int a;
    public final da4 b;
    public final ga4 c;
    public final da4 d;
    public final da4 e;
    public final ga4 f;

    public /* synthetic */ ji3(da4 da4Var, ba4 ba4Var, da4 da4Var2, da4 da4Var3, ba4 ba4Var2, int i) {
        this.a = i;
        this.b = da4Var;
        this.c = ba4Var;
        this.d = da4Var2;
        this.e = da4Var3;
        this.f = ba4Var2;
    }

    @Override // defpackage.ga4
    public final Object d() {
        switch (this.a) {
            case 0:
                return new ii3((fr1) this.b.a, (gi3) this.c.d(), (View) this.d.a, (Activity) this.e.a, (gk3) this.f.d());
            default:
                return new ii3((fr1) this.b.a, (gi3) this.c.d(), (eg3) this.d.a, (Map) this.e.a, (gk3) this.f.d());
        }
    }
}
