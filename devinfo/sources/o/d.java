package o;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.appcompat.widget.AppCompatSpinner;
import java.util.ArrayList;
import p.g2;
import p.k0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class d implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30175a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f30176b;

    public /* synthetic */ d(int i4, Object obj) {
        this.f30175a = i4;
        this.f30176b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f30175a) {
            case 0:
                g gVar = (g) this.f30176b;
                ArrayList arrayList = gVar.f30205h;
                if (gVar.a() && arrayList.size() > 0) {
                    int i4 = 0;
                    if (!((f) arrayList.get(0)).f30197a.f30653y) {
                        View view = gVar.f30211o;
                        if (view != null && view.isShown()) {
                            int size = arrayList.size();
                            while (i4 < size) {
                                Object obj = arrayList.get(i4);
                                i4++;
                                ((f) obj).f30197a.show();
                            }
                            break;
                        } else {
                            gVar.dismiss();
                            break;
                        }
                    }
                }
                break;
            case 1:
                d0 d0Var = (d0) this.f30176b;
                g2 g2Var = d0Var.f30182h;
                if (d0Var.a() && !g2Var.f30653y) {
                    View view2 = d0Var.f30186m;
                    if (view2 != null && view2.isShown()) {
                        g2Var.show();
                        break;
                    } else {
                        d0Var.dismiss();
                        break;
                    }
                }
                break;
            case 2:
                AppCompatSpinner appCompatSpinner = (AppCompatSpinner) this.f30176b;
                if (!appCompatSpinner.getInternalPopup().a()) {
                    appCompatSpinner.f773f.m(appCompatSpinner.getTextDirection(), appCompatSpinner.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = appCompatSpinner.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                    break;
                }
                break;
            default:
                k0 k0Var = (k0) this.f30176b;
                AppCompatSpinner appCompatSpinner2 = k0Var.H;
                k0Var.getClass();
                if (!appCompatSpinner2.isAttachedToWindow() || !appCompatSpinner2.getGlobalVisibleRect(k0Var.F)) {
                    k0Var.dismiss();
                    break;
                } else {
                    k0Var.r();
                    k0Var.show();
                    break;
                }
                break;
        }
    }
}
