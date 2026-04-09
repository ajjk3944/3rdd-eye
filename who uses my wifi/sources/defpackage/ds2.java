package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ds2 {
    public static final ImageView.ScaleType k = ImageView.ScaleType.CENTER_INSIDE;
    public final ra4 a;
    public final l83 b;
    public final vr2 c;
    public final tr2 d;
    public final ns2 e;
    public final qs2 f;
    public final Executor g;
    public final Executor h;
    public final r12 i;
    public final rr2 j;

    public ds2(ra4 ra4Var, l83 l83Var, vr2 vr2Var, tr2 tr2Var, ns2 ns2Var, qs2 qs2Var, Executor executor, ld2 ld2Var, rr2 rr2Var) {
        this.a = ra4Var;
        this.b = l83Var;
        this.i = l83Var.j;
        this.c = vr2Var;
        this.d = tr2Var;
        this.e = ns2Var;
        this.f = qs2Var;
        this.g = executor;
        this.h = ld2Var;
        this.j = rr2Var;
    }

    public static void b(RelativeLayout.LayoutParams layoutParams, int i) {
        if (i == 0) {
            layoutParams.addRule(10);
            layoutParams.addRule(9);
        } else if (i == 2) {
            layoutParams.addRule(12);
            layoutParams.addRule(11);
        } else if (i != 3) {
            layoutParams.addRule(10);
            layoutParams.addRule(11);
        } else {
            layoutParams.addRule(12);
            layoutParams.addRule(9);
        }
    }

    public final void a(rs2 rs2Var) {
        if (rs2Var == null) {
            return;
        }
        Context context = rs2Var.X0().getContext();
        if (uk2.e0(context, this.c.a)) {
            if (!(context instanceof Activity)) {
                gi2.U("Activity context is needed for policy validator.");
                return;
            }
            qs2 qs2Var = this.f;
            if (qs2Var == null || rs2Var.M0() == null) {
                return;
            }
            try {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                windowManager.addView(qs2Var.a(rs2Var.M0(), windowManager), uk2.g0());
            } catch (hg2 unused) {
                gi2.R();
            }
        }
    }

    public final boolean c(ViewGroup viewGroup, boolean z) {
        View view;
        if (z) {
            tr2 tr2Var = this.d;
            synchronized (tr2Var) {
                view = tr2Var.o;
            }
        } else {
            tr2 tr2Var2 = this.d;
            synchronized (tr2Var2) {
                view = tr2Var2.p;
            }
        }
        if (view == null) {
            return false;
        }
        viewGroup.removeAllViews();
        if (view.getParent() instanceof ViewGroup) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        viewGroup.addView(view, ((Boolean) tw1.e.c.a(mz1.j4)).booleanValue() ? new FrameLayout.LayoutParams(-1, -1, 17) : new FrameLayout.LayoutParams(-2, -2, 17));
        return true;
    }
}
