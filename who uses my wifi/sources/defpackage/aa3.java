package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public interface aa3 {
    static aa3 g(Context context, int i, int i2, pc4 pc4Var) {
        boolean zMatches;
        aa3 aa3VarL = l(context, i);
        if (aa3VarL instanceof ba3) {
            ba3 ba3Var = (ba3) aa3VarL;
            ba3Var.c();
            ba3Var.f(i2);
            ba3Var.t(a30.y(pc4Var.r));
            String str = pc4Var.u;
            if (TextUtils.isEmpty(str)) {
                zMatches = false;
            } else {
                zMatches = Pattern.matches((String) tw1.e.c.a(mz1.w9), str);
            }
            if (zMatches) {
                ba3Var.G(str);
            }
        }
        return aa3VarL;
    }

    static aa3 l(Context context, int i) {
        boolean zBooleanValue;
        if (ea3.a()) {
            int i2 = i - 2;
            if (i2 == 20 || i2 == 21) {
                zBooleanValue = ((Boolean) n02.e.w()).booleanValue();
            } else if (i2 != 110) {
                switch (i2) {
                    case 2:
                    case 3:
                    case 6:
                    case 7:
                    case 8:
                        zBooleanValue = ((Boolean) n02.c.w()).booleanValue();
                        break;
                    case 4:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        zBooleanValue = ((Boolean) n02.d.w()).booleanValue();
                        break;
                    case 5:
                        zBooleanValue = ((Boolean) n02.b.w()).booleanValue();
                        break;
                }
            } else {
                zBooleanValue = ((Boolean) tw1.e.c.a(mz1.E9)).booleanValue();
            }
            if (zBooleanValue) {
                return new ba3(context, i);
            }
        }
        return new pa3();
    }

    aa3 G(String str);

    aa3 a();

    aa3 b(boolean z);

    boolean d();

    aa3 f(int i);

    aa3 h();

    boolean i();

    aa3 j(Throwable th);

    aa3 k(nx2 nx2Var);

    aa3 m(String str);

    ca3 n();

    aa3 o(p21 p21Var);

    aa3 q0(String str);

    aa3 t(int i);
}
