package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class y6 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ y6(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f) {
            case 0:
                h7 h7Var = (h7) this.g;
                if (!h7Var.getInternalPopup().a()) {
                    h7Var.k.m(h7Var.getTextDirection(), h7Var.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = h7Var.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                    break;
                }
                break;
            case 1:
                e7 e7Var = (e7) this.g;
                h7 h7Var2 = e7Var.L;
                e7Var.getClass();
                if (!h7Var2.isAttachedToWindow() || !h7Var2.getGlobalVisibleRect(e7Var.J)) {
                    e7Var.dismiss();
                    break;
                } else {
                    e7Var.s();
                    e7Var.c();
                    break;
                }
                break;
            case 2:
                xd xdVar = (xd) this.g;
                ArrayList arrayList = xdVar.m;
                if (xdVar.a() && arrayList.size() > 0) {
                    int i = 0;
                    if (!((wd) arrayList.get(0)).a.D) {
                        View view = xdVar.t;
                        if (view != null && view.isShown()) {
                            int size = arrayList.size();
                            while (i < size) {
                                Object obj = arrayList.get(i);
                                i++;
                                ((wd) obj).a.c();
                            }
                            break;
                        } else {
                            xdVar.dismiss();
                            break;
                        }
                    }
                }
                break;
            default:
                vx0 vx0Var = (vx0) this.g;
                de0 de0Var = vx0Var.m;
                if (vx0Var.a() && !de0Var.D) {
                    View view2 = vx0Var.r;
                    if (view2 != null && view2.isShown()) {
                        de0Var.c();
                        break;
                    } else {
                        vx0Var.dismiss();
                        break;
                    }
                }
                break;
        }
    }
}
