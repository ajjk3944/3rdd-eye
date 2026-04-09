package h;

import R.O;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import h0.C2351a;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class n extends com.bumptech.glide.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20357a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f20358b;

    public /* synthetic */ n(int i, Object obj) {
        this.f20357a = i;
        this.f20358b = obj;
    }

    @Override // com.bumptech.glide.d, R.T
    public void b() {
        int i = this.f20357a;
        Object obj = this.f20358b;
        switch (i) {
            case 0:
                ((l) obj).f20355b.f20392J.setVisibility(0);
                break;
            case 1:
                v vVar = (v) obj;
                vVar.f20392J.setVisibility(0);
                if (vVar.f20392J.getParent() instanceof View) {
                    View view = (View) vVar.f20392J.getParent();
                    WeakHashMap weakHashMap = O.f3270a;
                    R.D.c(view);
                    break;
                }
                break;
        }
    }

    @Override // R.T
    public final void c() {
        int i = this.f20357a;
        Object obj = this.f20358b;
        switch (i) {
            case 0:
                v vVar = ((l) obj).f20355b;
                vVar.f20392J.setAlpha(1.0f);
                vVar.M.d(null);
                vVar.M = null;
                break;
            case 1:
                v vVar2 = (v) obj;
                vVar2.f20392J.setAlpha(1.0f);
                vVar2.M.d(null);
                vVar2.M = null;
                break;
            default:
                v vVar3 = (v) ((C2351a) obj).f20442c;
                vVar3.f20392J.setVisibility(8);
                PopupWindow popupWindow = vVar3.f20393K;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (vVar3.f20392J.getParent() instanceof View) {
                    View view = (View) vVar3.f20392J.getParent();
                    WeakHashMap weakHashMap = O.f3270a;
                    R.D.c(view);
                }
                vVar3.f20392J.e();
                vVar3.M.d(null);
                vVar3.M = null;
                ViewGroup viewGroup = vVar3.f20396O;
                WeakHashMap weakHashMap2 = O.f3270a;
                R.D.c(viewGroup);
                break;
        }
    }
}
