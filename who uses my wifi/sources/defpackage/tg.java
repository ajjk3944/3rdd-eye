package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class tg implements rx {
    public final /* synthetic */ int f;
    public final /* synthetic */ i5 g;

    public /* synthetic */ tg(i5 i5Var, int i) {
        this.f = i;
        this.g = i5Var;
    }

    @Override // defpackage.rx
    public final Object a() {
        switch (this.f) {
            case 0:
                this.g.reportFullyDrawn();
                return z31.a;
            case 1:
                i5 i5Var = this.g;
                return new qx(i5Var.k, new tg(i5Var, 0));
            case 2:
                i5 i5Var2 = this.g;
                return new bt0(i5Var2.getApplication(), i5Var2, i5Var2.getIntent() != null ? i5Var2.getIntent().getExtras() : null);
            default:
                i5 i5Var3 = this.g;
                aj0 aj0Var = new aj0(new sg(i5Var3, 1));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (i30.c(Looper.myLooper(), Looper.getMainLooper())) {
                        i5Var3.f.a(new ug(aj0Var, i5Var3));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new r5(i5Var3, aj0Var, 1));
                    }
                }
                return aj0Var;
        }
    }
}
