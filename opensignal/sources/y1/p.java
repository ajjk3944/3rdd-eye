package y1;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.platform.AndroidComposeView;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.internal.measurement.y3;

/* loaded from: classes.dex */
public final class p extends br.n implements ar.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f25759d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ AndroidComposeView f25760g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(AndroidComposeView androidComposeView, int i10) {
        super(1);
        this.f25759d = i10;
        this.f25760g = androidComposeView;
    }

    @Override // ar.k
    public final Object a(Object obj) {
        e1.b bVar;
        boolean zRequestFocus;
        switch (this.f25759d) {
            case 0:
                KeyEvent keyEvent = ((q1.b) obj).f20671a;
                long jB = b4.b(keyEvent.getKeyCode());
                if (q1.a.a(jB, q1.a.f20658b)) {
                    bVar = new e1.b(2);
                } else if (q1.a.a(jB, q1.a.f20659c)) {
                    bVar = new e1.b(1);
                } else if (q1.a.a(jB, q1.a.f20665i)) {
                    bVar = new e1.b(keyEvent.isShiftPressed() ? 2 : 1);
                } else {
                    bVar = q1.a.a(jB, q1.a.f20663g) ? new e1.b(4) : q1.a.a(jB, q1.a.f20662f) ? new e1.b(3) : (q1.a.a(jB, q1.a.f20660d) || q1.a.a(jB, q1.a.f20667m)) ? new e1.b(5) : (q1.a.a(jB, q1.a.f20661e) || q1.a.a(jB, q1.a.f20668n)) ? new e1.b(6) : (q1.a.a(jB, q1.a.f20664h) || q1.a.a(jB, q1.a.k) || q1.a.a(jB, q1.a.f20669o)) ? new e1.b(7) : (q1.a.a(jB, q1.a.f20657a) || q1.a.a(jB, q1.a.f20666l)) ? new e1.b(8) : null;
                }
                if (bVar != null) {
                    int i10 = bVar.f7639a;
                    if (y3.y(keyEvent) == 2) {
                        Integer num = i10 == 5 ? 33 : i10 == 6 ? 130 : i10 == 3 ? 17 : i10 == 4 ? 66 : i10 == 1 ? 2 : i10 == 2 ? 1 : null;
                        AndroidComposeView androidComposeView = this.f25760g;
                        f1.c embeddedViewFocusRect = androidComposeView.getEmbeddedViewFocusRect();
                        Boolean boolQ = ((a8.f) androidComposeView.getFocusOwner()).q(i10, embeddedViewFocusRect, new o(bVar, 1));
                        if (boolQ != null ? boolQ.booleanValue() : true) {
                            return Boolean.TRUE;
                        }
                        if (!(i10 == 1 || i10 == 2)) {
                            return Boolean.FALSE;
                        }
                        if (num != null) {
                            int iIntValue = num.intValue();
                            Object obj2 = h1.f25695f.get();
                            br.l.b(obj2);
                            h1 h1Var = (h1) obj2;
                            View viewB = androidComposeView;
                            while (true) {
                                if (viewB != null) {
                                    View rootView = androidComposeView.getRootView();
                                    br.l.c(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
                                    viewB = h1Var.b(iIntValue, viewB, (ViewGroup) rootView);
                                    if (viewB != null) {
                                        if (!viewB.equals(androidComposeView)) {
                                            for (ViewParent parent = viewB.getParent(); parent != null; parent = parent.getParent()) {
                                                if (parent == androidComposeView) {
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    viewB = null;
                                }
                            }
                            if (br.l.a(viewB, androidComposeView)) {
                                viewB = null;
                            }
                            if (viewB != null) {
                                Rect rectP = embeddedViewFocusRect != null ? g1.f0.p(embeddedViewFocusRect) : null;
                                if (rectP == null) {
                                    throw new IllegalStateException("Invalid rect");
                                }
                                View rootView2 = androidComposeView.getRootView();
                                br.l.c(rootView2, "null cannot be cast to non-null type android.view.ViewGroup");
                                ViewGroup viewGroup = (ViewGroup) rootView2;
                                viewGroup.offsetDescendantRectToMyCoords(androidComposeView, rectP);
                                viewGroup.offsetRectIntoDescendantCoords(viewB, rectP);
                                if (viewB instanceof ViewGroup) {
                                    ViewGroup viewGroup2 = (ViewGroup) viewB;
                                    if (viewGroup2.isFocused()) {
                                        zRequestFocus = true;
                                    } else if (viewGroup2.isFocusable() && !viewGroup2.hasFocus()) {
                                        zRequestFocus = viewGroup2.requestFocus(num.intValue(), rectP);
                                    } else if (viewB instanceof AndroidComposeView) {
                                        zRequestFocus = ((AndroidComposeView) viewB).requestFocus(num.intValue(), rectP);
                                    } else {
                                        View viewFindNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(viewGroup2, rectP, num.intValue());
                                        int iIntValue2 = num.intValue();
                                        zRequestFocus = viewFindNextFocusFromRect != null ? viewFindNextFocusFromRect.requestFocus(iIntValue2, rectP) : viewGroup2.requestFocus(iIntValue2, rectP);
                                    }
                                } else {
                                    zRequestFocus = viewB.requestFocus(num.intValue(), rectP);
                                }
                                if (zRequestFocus) {
                                    return Boolean.TRUE;
                                }
                            }
                        }
                        if (!((a8.f) androidComposeView.getFocusOwner()).h(i10, false, false)) {
                            return Boolean.TRUE;
                        }
                        Boolean boolQ2 = ((a8.f) androidComposeView.getFocusOwner()).q(i10, null, new o(bVar, 0));
                        return Boolean.valueOf(boolQ2 != null ? boolQ2.booleanValue() : true);
                    }
                }
                return Boolean.FALSE;
            default:
                ar.a aVar = (ar.a) obj;
                AndroidComposeView androidComposeView2 = this.f25760g;
                Handler handler = androidComposeView2.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    aVar.c();
                } else {
                    Handler handler2 = androidComposeView2.getHandler();
                    if (handler2 != null) {
                        handler2.post(new s(aVar, 0));
                    }
                }
                return lq.b0.f15562a;
        }
    }
}
