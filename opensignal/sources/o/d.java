package o;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;
import p.f0;
import p.y1;

/* loaded from: classes.dex */
public final class d implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18577a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f18578d;

    public /* synthetic */ d(int i10, Object obj) {
        this.f18577a = i10;
        this.f18578d = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f18577a) {
            case 0:
                g gVar = (g) this.f18578d;
                ArrayList arrayList = gVar.D;
                if (gVar.a() && arrayList.size() > 0 && !((f) arrayList.get(0)).f18590a.U) {
                    View view = gVar.K;
                    if (view != null && view.isShown()) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((f) it.next()).f18590a.g();
                        }
                        break;
                    } else {
                        gVar.dismiss();
                        break;
                    }
                }
                break;
            case 1:
                d0 d0Var = (d0) this.f18578d;
                y1 y1Var = d0Var.D;
                if (d0Var.a() && !y1Var.U) {
                    View view2 = d0Var.I;
                    if (view2 != null && view2.isShown()) {
                        y1Var.g();
                        break;
                    } else {
                        d0Var.dismiss();
                        break;
                    }
                }
                break;
            case 2:
                androidx.appcompat.widget.c cVar = (androidx.appcompat.widget.c) this.f18578d;
                if (!cVar.getInternalPopup().a()) {
                    cVar.f1054y.n(cVar.getTextDirection(), cVar.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = cVar.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                    break;
                }
                break;
            default:
                f0 f0Var = (f0) this.f18578d;
                androidx.appcompat.widget.c cVar2 = f0Var.f20057c0;
                f0Var.getClass();
                if (!cVar2.isAttachedToWindow() || !cVar2.getGlobalVisibleRect(f0Var.f20055a0)) {
                    f0Var.dismiss();
                    break;
                } else {
                    f0Var.s();
                    f0Var.g();
                    break;
                }
                break;
        }
    }
}
