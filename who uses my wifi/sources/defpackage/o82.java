package defpackage;

import android.app.Activity;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import java.util.Collections;
import org.json.JSONException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class o82 extends gw3 {
    public String i;
    public boolean j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public final Object q;
    public final ag2 r;
    public final Activity s;
    public zq t;
    public ImageView u;
    public LinearLayout v;
    public final of3 w;
    public PopupWindow x;
    public RelativeLayout y;
    public ViewGroup z;

    static {
        u8 u8Var = new u8(7);
        Collections.addAll(u8Var, "top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center");
        Collections.unmodifiableSet(u8Var);
    }

    public o82(jg2 jg2Var, of3 of3Var) {
        super(jg2Var, "resize", 23, false);
        this.i = "top-right";
        this.j = true;
        this.k = 0;
        this.l = 0;
        this.m = -1;
        this.n = 0;
        this.o = 0;
        this.p = -1;
        this.q = new Object();
        this.r = jg2Var;
        this.s = jg2Var.g();
        this.w = of3Var;
    }

    public final void K(boolean z) {
        synchronized (this.q) {
            try {
                if (this.x != null) {
                    if (!((Boolean) tw1.e.c.a(mz1.Db)).booleanValue() || Looper.getMainLooper().getThread() == Thread.currentThread()) {
                        L(z);
                    } else {
                        md2.f.a(new n82(this, z, 0));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void L(boolean z) throws JSONException {
        iz1 iz1Var = mz1.Eb;
        tw1 tw1Var = tw1.e;
        kz1 kz1Var = tw1Var.c;
        kz1 kz1Var2 = tw1Var.c;
        boolean zBooleanValue = ((Boolean) kz1Var.a(iz1Var)).booleanValue();
        ag2 ag2Var = this.r;
        if (zBooleanValue) {
            this.y.removeView((View) ag2Var);
            this.x.dismiss();
        } else {
            this.x.dismiss();
            this.y.removeView((View) ag2Var);
        }
        if (((Boolean) kz1Var2.a(mz1.Fb)).booleanValue()) {
            View view = (View) ag2Var;
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
        }
        ViewGroup viewGroup = this.z;
        if (viewGroup != null) {
            viewGroup.removeView(this.u);
            if (((Boolean) kz1Var2.a(mz1.Gb)).booleanValue()) {
                try {
                    this.z.addView((View) ag2Var);
                    ag2Var.Z(this.t);
                } catch (IllegalStateException e) {
                    gi2.c0("Unable to add webview back to view hierarchy.", e);
                }
            } else {
                this.z.addView((View) ag2Var);
                ag2Var.Z(this.t);
            }
        }
        if (z) {
            I("default");
            of3 of3Var = this.w;
            if (of3Var != null) {
                ((ou2) of3Var.g).c.P1(sd2.l);
            }
        }
        this.x = null;
        this.y = null;
        this.z = null;
        this.v = null;
    }
}
