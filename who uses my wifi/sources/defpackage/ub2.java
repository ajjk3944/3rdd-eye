package defpackage;

import android.content.Context;
import android.os.Build;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ub2 implements ca4 {
    public final /* synthetic */ int a;
    public final da4 b;
    public final da4 c;

    public /* synthetic */ ub2(da4 da4Var, da4 da4Var2, int i) {
        this.a = i;
        this.b = da4Var;
        this.c = da4Var2;
    }

    @Override // defpackage.ga4
    public final Object d() {
        switch (this.a) {
            case 0:
                return new tb2((Context) this.b.a, (ra4) this.c.a);
            case 1:
                ExecutorService executorService = (ExecutorService) this.b.a;
                vf3 vf3Var = (vf3) this.c.a;
                String str = Build.VERSION.RELEASE;
                String str2 = Build.MODEL;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 30 + String.valueOf(str2).length() + 1);
                ex0.q(sb, "Mozilla/5.0 (Linux; Android ", str, "; ", str2);
                sb.append(")");
                return new hg3(executorService, sb.toString(), vf3Var.N());
            case 2:
                return new ak3((Context) this.b.a, (ExecutorService) this.c.a);
            default:
                return new dk3((Context) this.b.a, (ExecutorService) this.c.a);
        }
    }
}
