package defpackage;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class cr2 implements y32 {
    public final /* synthetic */ int f = 1;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;

    public /* synthetic */ cr2(xp2 xp2Var, gj2 gj2Var, eb3 eb3Var, jz2 jz2Var) {
        this.g = xp2Var;
        this.i = gj2Var;
        this.h = eb3Var;
        this.j = jz2Var;
    }

    @Override // defpackage.y32
    public final void c(Object obj, Map map) {
        switch (this.f) {
            case 0:
                dr2 dr2Var = (dr2) ((WeakReference) this.g).get();
                String str = (String) map.get("u");
                if (dr2Var != null && !TextUtils.isEmpty(str)) {
                    ((eb3) this.h).b(str, (x34) this.i, (da3) this.j, dr2Var.I);
                    break;
                }
                break;
            case 1:
                Object obj2 = ((WeakReference) this.g).get();
                if (obj2 != null) {
                    ((y32) this.i).c(obj2, map);
                    break;
                } else {
                    ((au2) this.j).c((String) this.h, this);
                    break;
                }
            default:
                ag2 ag2Var = (ag2) obj;
                x32.b(map, (xp2) this.g);
                String str2 = (String) map.get("u");
                if (str2 != null) {
                    jz2 jz2Var = (jz2) this.j;
                    eb3 eb3Var = (eb3) this.h;
                    gj2 gj2Var = (gj2) this.i;
                    n70 n70VarA = x32.a(ag2Var, str2);
                    mc2 mc2Var = new mc2(ag2Var, gj2Var, eb3Var, jz2Var, 20, false);
                    n70VarA.c(new jq3(n70VarA, mc2Var, 0), md2.a);
                    break;
                } else {
                    gi2.i0("URL missing from click GMSG.");
                    break;
                }
        }
    }

    public /* synthetic */ cr2(dr2 dr2Var, eb3 eb3Var, x34 x34Var, da3 da3Var) {
        this.g = new WeakReference(dr2Var);
        this.h = eb3Var;
        this.i = x34Var;
        this.j = da3Var;
    }

    public /* synthetic */ cr2(au2 au2Var, WeakReference weakReference, String str, y32 y32Var) {
        this.j = au2Var;
        this.g = weakReference;
        this.h = str;
        this.i = y32Var;
    }
}
