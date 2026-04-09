package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class w5 extends zt0 {
    public final /* synthetic */ int p;
    public final /* synthetic */ Object q;

    public /* synthetic */ w5(int i, Object obj) {
        this.p = i;
        this.q = obj;
    }

    @Override // defpackage.y61
    public final void b() {
        int i = this.p;
        Object obj = this.q;
        switch (i) {
            case 0:
                h6 h6Var = ((v5) obj).g;
                h6Var.A.setAlpha(1.0f);
                h6Var.D.d(null);
                h6Var.D = null;
                break;
            case 1:
                h6 h6Var2 = (h6) obj;
                h6Var2.A.setAlpha(1.0f);
                h6Var2.D.d(null);
                h6Var2.D = null;
                break;
            default:
                h6 h6Var3 = (h6) ((vq2) obj).h;
                h6Var3.A.setVisibility(8);
                PopupWindow popupWindow = h6Var3.B;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (h6Var3.A.getParent() instanceof View) {
                    View view = (View) h6Var3.A.getParent();
                    WeakHashMap weakHashMap = e61.a;
                    r51.c(view);
                }
                h6Var3.A.e();
                h6Var3.D.d(null);
                h6Var3.D = null;
                ViewGroup viewGroup = h6Var3.F;
                WeakHashMap weakHashMap2 = e61.a;
                r51.c(viewGroup);
                break;
        }
    }

    @Override // defpackage.zt0, defpackage.y61
    public void e() {
        int i = this.p;
        Object obj = this.q;
        switch (i) {
            case 0:
                ((v5) obj).g.A.setVisibility(0);
                break;
            case 1:
                h6 h6Var = (h6) obj;
                h6Var.A.setVisibility(0);
                if (h6Var.A.getParent() instanceof View) {
                    View view = (View) h6Var.A.getParent();
                    WeakHashMap weakHashMap = e61.a;
                    r51.c(view);
                    break;
                }
                break;
        }
    }
}
