package ge;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.ViewGroup;
import android.view.WindowManager;
import io.sentry.android.core.e0;

/* loaded from: classes.dex */
public final class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9523a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h f9524d;

    public /* synthetic */ d(h hVar, int i10) {
        this.f9523a = i10;
        this.f9524d = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Rect rect;
        int i10 = this.f9523a;
        h hVar = this.f9524d;
        int i11 = 2;
        int i12 = 1;
        switch (i10) {
            case 0:
                g gVar = hVar.f9546i;
                if (gVar != null) {
                    WindowManager windowManager = (WindowManager) hVar.f9545h.getSystemService("window");
                    if (Build.VERSION.SDK_INT >= 30) {
                        rect = windowManager.getCurrentWindowMetrics().getBounds();
                    } else {
                        Display defaultDisplay = windowManager.getDefaultDisplay();
                        Point point = new Point();
                        defaultDisplay.getRealSize(point);
                        rect = new Rect();
                        rect.right = point.x;
                        rect.bottom = point.y;
                    }
                    int iHeight = rect.height();
                    int[] iArr = new int[2];
                    gVar.getLocationInWindow(iArr);
                    int height = (iHeight - (gVar.getHeight() + iArr[1])) + ((int) gVar.getTranslationY());
                    int i13 = hVar.f9550o;
                    if (height < i13) {
                        ViewGroup.LayoutParams layoutParams = gVar.getLayoutParams();
                        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                            e0.p(h.f9537y, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                            break;
                        } else {
                            int i14 = hVar.f9550o;
                            hVar.f9551p = i14;
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                            marginLayoutParams.bottomMargin = (i14 - height) + marginLayoutParams.bottomMargin;
                            gVar.requestLayout();
                            break;
                        }
                    } else {
                        hVar.f9551p = i13;
                        break;
                    }
                }
                break;
            case 1:
                hVar.b();
                break;
            default:
                g gVar2 = hVar.f9546i;
                if (gVar2 != null) {
                    int i15 = 0;
                    if (gVar2.getParent() != null) {
                        gVar2.setVisibility(0);
                    }
                    if (gVar2.getAnimationMode() != 1) {
                        int height2 = gVar2.getHeight();
                        ViewGroup.LayoutParams layoutParams2 = gVar2.getLayoutParams();
                        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                            height2 += ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                        }
                        gVar2.setTranslationY(height2);
                        ValueAnimator valueAnimator = new ValueAnimator();
                        valueAnimator.setIntValues(height2, 0);
                        valueAnimator.setInterpolator(hVar.f9542e);
                        valueAnimator.setDuration(hVar.f9540c);
                        valueAnimator.addListener(new a(hVar, i12));
                        valueAnimator.addUpdateListener(new b(hVar, i11));
                        valueAnimator.start();
                        break;
                    } else {
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        valueAnimatorOfFloat.setInterpolator(hVar.f9541d);
                        valueAnimatorOfFloat.addUpdateListener(new b(hVar, i15));
                        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.8f, 1.0f);
                        valueAnimatorOfFloat2.setInterpolator(hVar.f9543f);
                        valueAnimatorOfFloat2.addUpdateListener(new b(hVar, i12));
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
                        animatorSet.setDuration(hVar.f9538a);
                        animatorSet.addListener(new a(hVar, 3));
                        animatorSet.start();
                        break;
                    }
                }
                break;
        }
    }
}
