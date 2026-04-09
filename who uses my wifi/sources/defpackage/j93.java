package defpackage;

import android.content.Context;
import java.util.HashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class j93 {
    public final HashMap a = new HashMap();

    public final i93 a(c93 c93Var, Context context, x83 x83Var, z71 z71Var) {
        d93 d93Var;
        HashMap map = this.a;
        i93 i93Var = (i93) map.get(c93Var);
        if (i93Var != null) {
            return i93Var;
        }
        if (c93Var == c93.f) {
            iz1 iz1Var = mz1.J6;
            kz1 kz1Var = tw1.e.c;
            d93Var = new d93(context, c93Var, ((Integer) kz1Var.a(iz1Var)).intValue(), ((Integer) kz1Var.a(mz1.P6)).intValue(), ((Integer) kz1Var.a(mz1.R6)).intValue(), (String) kz1Var.a(mz1.T6), (String) kz1Var.a(mz1.L6), (String) kz1Var.a(mz1.N6));
        } else if (c93Var == c93.g) {
            iz1 iz1Var2 = mz1.K6;
            kz1 kz1Var2 = tw1.e.c;
            d93Var = new d93(context, c93Var, ((Integer) kz1Var2.a(iz1Var2)).intValue(), ((Integer) kz1Var2.a(mz1.Q6)).intValue(), ((Integer) kz1Var2.a(mz1.S6)).intValue(), (String) kz1Var2.a(mz1.U6), (String) kz1Var2.a(mz1.M6), (String) kz1Var2.a(mz1.O6));
        } else if (c93Var == c93.h) {
            iz1 iz1Var3 = mz1.X6;
            kz1 kz1Var3 = tw1.e.c;
            d93Var = new d93(context, c93Var, ((Integer) kz1Var3.a(iz1Var3)).intValue(), ((Integer) kz1Var3.a(mz1.Z6)).intValue(), ((Integer) kz1Var3.a(mz1.a7)).intValue(), (String) kz1Var3.a(mz1.V6), (String) kz1Var3.a(mz1.W6), (String) kz1Var3.a(mz1.Y6));
        } else {
            d93Var = null;
        }
        t83 t83Var = new t83(d93Var);
        i93 i93Var2 = new i93(t83Var, new pj4(t83Var, x83Var, z71Var));
        map.put(c93Var, i93Var2);
        return i93Var2;
    }
}
