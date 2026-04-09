package i;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class r extends kc.f {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f11108e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f11109f;

    public /* synthetic */ r(int i10, Object obj) {
        this.f11108e = i10;
        this.f11109f = obj;
    }

    @Override // kc.f, u3.m0
    public void b() {
        int i10 = this.f11108e;
        Object obj = this.f11109f;
        switch (i10) {
            case 0:
                ((p) obj).f11106d.R.setVisibility(0);
                break;
            case 1:
                a0 a0Var = (a0) obj;
                a0Var.R.setVisibility(0);
                if (a0Var.R.getParent() instanceof View) {
                    View view = (View) a0Var.R.getParent();
                    WeakHashMap weakHashMap = u3.i0.f23177a;
                    u3.x.c(view);
                    break;
                }
                break;
        }
    }

    @Override // u3.m0
    public final void c() {
        int i10 = this.f11108e;
        Object obj = this.f11109f;
        switch (i10) {
            case 0:
                a0 a0Var = ((p) obj).f11106d;
                a0Var.R.setAlpha(1.0f);
                a0Var.U.d(null);
                a0Var.U = null;
                break;
            case 1:
                a0 a0Var2 = (a0) obj;
                a0Var2.R.setAlpha(1.0f);
                a0Var2.U.d(null);
                a0Var2.U = null;
                break;
            default:
                a0 a0Var3 = (a0) ((io.sentry.internal.debugmeta.c) obj).f12354g;
                a0Var3.R.setVisibility(8);
                PopupWindow popupWindow = a0Var3.S;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (a0Var3.R.getParent() instanceof View) {
                    View view = (View) a0Var3.R.getParent();
                    WeakHashMap weakHashMap = u3.i0.f23177a;
                    u3.x.c(view);
                }
                a0Var3.R.e();
                a0Var3.U.d(null);
                a0Var3.U = null;
                ViewGroup viewGroup = a0Var3.W;
                WeakHashMap weakHashMap2 = u3.i0.f23177a;
                u3.x.c(viewGroup);
                break;
        }
    }
}
