package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class e33 implements q53 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public e33(Context context, pq3 pq3Var, l83 l83Var, e51 e51Var) {
        this.a = 6;
        this.c = context;
        this.d = pq3Var;
        this.b = l83Var;
        this.e = e51Var;
    }

    @Override // defpackage.q53
    public final n70 a() {
        m33 m33Var;
        switch (this.a) {
            case 0:
                mz1.a((Context) this.c);
                return ((ld2) ((pq3) this.d)).c(new xs1(8, this));
            case 1:
                return pu1.P(((f43) this.d).a(), new vn1(4, this), md2.g);
            case 2:
                n33 n33Var = (n33) this.e;
                iz1 iz1Var = mz1.tc;
                tw1 tw1Var = tw1.e;
                kz1 kz1Var = tw1Var.c;
                kz1 kz1Var2 = tw1Var.c;
                if (((Boolean) kz1Var.a(iz1Var)).booleanValue() && (m33Var = n33Var.b) != null) {
                    return pu1.r(m33Var);
                }
                if (yc0.s((String) kz1Var2.a(mz1.z1)) || (!((Boolean) kz1Var2.a(iz1Var)).booleanValue() && (n33Var.a.get() || !((mw2) this.b).b))) {
                    return pu1.r(new m33(0, new Bundle()));
                }
                n33Var.a.set(true);
                return ((ld2) ((pq3) this.d)).c(new xs1(10, this));
            case 3:
                return ((ld2) ((pq3) this.d)).c(new xs1(16, this));
            case 4:
                return ((ld2) ((pq3) this.d)).c(new xs1(20, this));
            case 5:
                return ((ld2) ((pq3) this.d)).c(new xs1(22, this));
            case 6:
                return ((ld2) ((pq3) this.d)).c(new xs1(24, this));
            default:
                return ((ld2) ((pq3) this.d)).c(new xs1(26, this));
        }
    }

    public y20 b(float f) {
        Window window;
        View decorView;
        y20 y20VarF = y20.e;
        if (f == 0.0f) {
            return y20VarF;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            WindowManager windowManager = (WindowManager) ((Context) this.c).getSystemService("window");
            if (windowManager != null) {
                y20VarF = y20.c(windowManager.getCurrentWindowMetrics().getWindowInsets().getInsets(WindowInsets.Type.statusBars() | WindowInsets.Type.displayCutout() | WindowInsets.Type.navigationBars() | WindowInsets.Type.captionBar()));
            }
        } else {
            Activity activityI = hg4.C.g.i();
            if (activityI != null && (window = activityI.getWindow()) != null && (decorView = window.getDecorView()) != null) {
                WeakHashMap weakHashMap = e61.a;
                o91 o91VarA = u51.a(decorView);
                if (o91VarA != null) {
                    y20VarF = o91VarA.a.f(135);
                }
            }
        }
        return y20.b((int) Math.ceil(y20VarF.a / f), (int) Math.ceil(y20VarF.b / f), (int) Math.ceil(y20VarF.c / f), (int) Math.ceil(y20VarF.d / f));
    }

    @Override // defpackage.q53
    public final int d() {
        switch (this.a) {
            case 0:
                return 3;
            case 1:
                return 7;
            case 2:
                return 1;
            case 3:
                return 17;
            case 4:
                return 22;
            case 5:
                return 26;
            case 6:
                return 53;
            default:
                return 35;
        }
    }

    public /* synthetic */ e33(Object obj, l83 l83Var, Object obj2, Object obj3, int i) {
        this.a = i;
        this.d = obj;
        this.b = l83Var;
        this.c = obj2;
        this.e = obj3;
    }

    public e33(pq3 pq3Var, ViewGroup viewGroup, Context context, Set set) {
        this.a = 4;
        this.d = pq3Var;
        this.b = set;
        this.e = viewGroup;
        this.c = context;
    }

    public /* synthetic */ e33(pq3 pq3Var, Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.d = pq3Var;
        this.c = obj;
        this.b = obj2;
        this.e = obj3;
    }
}
