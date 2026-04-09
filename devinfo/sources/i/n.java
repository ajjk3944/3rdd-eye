package i;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import e4.k0;
import e4.v0;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class n extends com.bumptech.glide.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25338a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f25339b;

    public /* synthetic */ n(int i4, Object obj) {
        this.f25338a = i4;
        this.f25339b = obj;
    }

    @Override // com.bumptech.glide.e, e4.d1
    public void c() {
        int i4 = this.f25338a;
        Object obj = this.f25339b;
        switch (i4) {
            case 0:
                ((m) obj).f25337b.f25385v.setVisibility(0);
                break;
            case 1:
                v vVar = (v) obj;
                vVar.f25385v.setVisibility(0);
                if (vVar.f25385v.getParent() instanceof View) {
                    View view = (View) vVar.f25385v.getParent();
                    WeakHashMap weakHashMap = v0.f22405a;
                    k0.c(view);
                    break;
                }
                break;
        }
    }

    @Override // e4.d1
    public final void d() {
        int i4 = this.f25338a;
        Object obj = this.f25339b;
        switch (i4) {
            case 0:
                v vVar = ((m) obj).f25337b;
                vVar.f25385v.setAlpha(1.0f);
                vVar.f25388y.d(null);
                vVar.f25388y = null;
                break;
            case 1:
                v vVar2 = (v) obj;
                vVar2.f25385v.setAlpha(1.0f);
                vVar2.f25388y.d(null);
                vVar2.f25388y = null;
                break;
            default:
                v vVar3 = (v) ((yb.i) obj).f37517c;
                vVar3.f25385v.setVisibility(8);
                PopupWindow popupWindow = vVar3.f25386w;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (vVar3.f25385v.getParent() instanceof View) {
                    View view = (View) vVar3.f25385v.getParent();
                    WeakHashMap weakHashMap = v0.f22405a;
                    k0.c(view);
                }
                vVar3.f25385v.e();
                vVar3.f25388y.d(null);
                vVar3.f25388y = null;
                ViewGroup viewGroup = vVar3.A;
                WeakHashMap weakHashMap2 = v0.f22405a;
                k0.c(viewGroup);
                break;
        }
    }
}
