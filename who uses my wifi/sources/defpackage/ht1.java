package defpackage;

import android.content.Context;
import java.io.File;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ht1 extends vq2 {
    public final Context i;

    public ht1(Context context, us0 us0Var) {
        super(us0Var);
        this.i = context;
    }

    public static ko1 u(Context context) {
        ko1 ko1Var = new ko1(new wo1(new File(new File(context.getCacheDir(), "admob_volley").getPath())), new ht1(context, new us0()));
        ko1Var.a();
        return ko1Var;
    }

    @Override // defpackage.vq2, defpackage.eo1
    public final ho1 c(jo1 jo1Var) throws oo1 {
        int i = jo1Var.g;
        String str = jo1Var.h;
        if (i == 0) {
            if (Pattern.matches((String) tw1.e.c.a(mz1.Q4), str)) {
                j63 j63Var = sv1.f.a;
                gz gzVar = gz.b;
                Context context = this.i;
                if (gzVar.c(context, 13400000) == 0) {
                    ho1 ho1VarC = new ij(context).c(jo1Var);
                    if (ho1VarC != null) {
                        gi2.G("Got gmscore asset response: ".concat(String.valueOf(str)));
                        return ho1VarC;
                    }
                    gi2.G("Failed to get gmscore asset response: ".concat(String.valueOf(str)));
                }
            }
        }
        return super.c(jo1Var);
    }
}
