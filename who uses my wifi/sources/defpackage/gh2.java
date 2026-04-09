package defpackage;

import android.content.Context;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class gh2 implements ca4 {
    public final /* synthetic */ int a;
    public final eh2 b;

    public /* synthetic */ gh2(eh2 eh2Var, int i) {
        this.a = i;
        this.b = eh2Var;
    }

    @Override // defpackage.ga4
    public final Object d() {
        switch (this.a) {
            case 0:
                eh2 eh2Var = this.b;
                return new dh2(eh2Var.b, eh2Var.a);
            case 1:
                Context context = this.b.b;
                i41.M(context);
                return context;
            case 2:
                WeakReference weakReference = this.b.d;
                i41.M(weakReference);
                return weakReference;
            case 3:
                return new nc3(this.b.b, false);
            case 4:
                eh2 eh2Var2 = this.b;
                return new gb4(eh2Var2.b, eh2Var2.a);
            case 5:
                lf4 lf4Var = hg4.C.c;
                eh2 eh2Var3 = this.b;
                String strD = lf4Var.D(eh2Var3.b, eh2Var3.a.f);
                i41.M(strD);
                return strD;
            default:
                return Long.valueOf(this.b.c);
        }
    }
}
