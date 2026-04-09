package A3;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.material.internal.NavigationMenuView;
import com.google.android.material.navigation.NavigationView;
import java.util.ArrayList;
import n.C2670d;
import n.ViewOnKeyListenerC2665B;
import n.ViewOnKeyListenerC2671e;
import o.C2699J;
import o.F0;
import o.M;
import x3.AbstractC2993B;

/* loaded from: classes.dex */
public final class C implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f359a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f360b;

    public /* synthetic */ C(int i, Object obj) {
        this.f359a = i;
        this.f360b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        Activity activity;
        switch (this.f359a) {
            case 0:
                NavigationView navigationView = (NavigationView) this.f360b;
                int[] iArr = navigationView.f18415l;
                navigationView.getLocationOnScreen(iArr);
                boolean z6 = true;
                boolean z7 = iArr[1] == 0;
                x3.q qVar = navigationView.i;
                if (qVar.f24139L != z7) {
                    qVar.f24139L = z7;
                    int i = (qVar.f24145b.getChildCount() <= 0 && qVar.f24139L) ? qVar.f24140N : 0;
                    NavigationMenuView navigationMenuView = qVar.f24144a;
                    navigationMenuView.setPadding(0, i, 0, navigationMenuView.getPaddingBottom());
                }
                navigationView.setDrawTopInsetForeground(z7 && navigationView.f18402C);
                boolean z8 = navigationView.getLayoutDirection() == 1;
                int i3 = iArr[0];
                navigationView.setDrawLeftInsetForeground((i3 == 0 || navigationView.getWidth() + i3 == 0) && (!z8 ? !navigationView.f18404E : !navigationView.f18405F));
                Context context = navigationView.getContext();
                while (true) {
                    if (!(context instanceof ContextWrapper)) {
                        activity = null;
                    } else if (context instanceof Activity) {
                        activity = (Activity) context;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                }
                if (activity != null) {
                    Rect rectG = AbstractC2993B.g(activity);
                    navigationView.setDrawBottomInsetForeground((rectG.height() - navigationView.getHeight() == iArr[1]) && (Color.alpha(activity.getWindow().getNavigationBarColor()) != 0) && navigationView.f18403D);
                    if ((rectG.width() != iArr[0] && rectG.width() - navigationView.getWidth() != iArr[0]) || (!z8 ? !navigationView.f18405F : !navigationView.f18404E)) {
                        z6 = false;
                    }
                    navigationView.setDrawRightInsetForeground(z6);
                    break;
                }
                break;
            case 1:
                ViewOnKeyListenerC2671e viewOnKeyListenerC2671e = (ViewOnKeyListenerC2671e) this.f360b;
                ArrayList arrayList = viewOnKeyListenerC2671e.f22046h;
                if (viewOnKeyListenerC2671e.a() && arrayList.size() > 0) {
                    int i6 = 0;
                    if (!((C2670d) arrayList.get(0)).f22026a.M) {
                        View view = viewOnKeyListenerC2671e.f22029C;
                        if (view != null && view.isShown()) {
                            int size = arrayList.size();
                            while (i6 < size) {
                                Object obj = arrayList.get(i6);
                                i6++;
                                ((C2670d) obj).f22026a.g();
                            }
                            break;
                        } else {
                            viewOnKeyListenerC2671e.dismiss();
                            break;
                        }
                    }
                }
                break;
            case 2:
                ViewOnKeyListenerC2665B viewOnKeyListenerC2665B = (ViewOnKeyListenerC2665B) this.f360b;
                F0 f02 = viewOnKeyListenerC2665B.f22001h;
                if (viewOnKeyListenerC2665B.a() && !f02.M) {
                    View view2 = viewOnKeyListenerC2665B.f22005m;
                    if (view2 != null && view2.isShown()) {
                        f02.g();
                        break;
                    } else {
                        viewOnKeyListenerC2665B.dismiss();
                        break;
                    }
                }
                break;
            case 3:
                M m6 = (M) this.f360b;
                if (!m6.getInternalPopup().a()) {
                    m6.f22412f.m(m6.getTextDirection(), m6.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = m6.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                    break;
                }
                break;
            default:
                C2699J c2699j = (C2699J) this.f360b;
                M m7 = c2699j.f22397V;
                c2699j.getClass();
                if (!m7.isAttachedToWindow() || !m7.getGlobalVisibleRect(c2699j.f22395T)) {
                    c2699j.dismiss();
                    break;
                } else {
                    c2699j.s();
                    c2699j.g();
                    break;
                }
                break;
        }
    }
}
