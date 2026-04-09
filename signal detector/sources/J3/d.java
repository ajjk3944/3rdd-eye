package J3;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.Log;
import android.view.ViewGroup;
import x3.AbstractC2993B;

/* loaded from: classes.dex */
public final class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2087a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f2088b;

    public /* synthetic */ d(i iVar, int i) {
        this.f2087a = i;
        this.f2088b = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        int i = this.f2087a;
        i iVar = this.f2088b;
        int i3 = 2;
        int i6 = 1;
        switch (i) {
            case 0:
                if (iVar.i != null && (context = iVar.f2117h) != null) {
                    int iHeight = AbstractC2993B.g(context).height();
                    int[] iArr = new int[2];
                    h hVar = iVar.i;
                    hVar.getLocationInWindow(iArr);
                    int height = (iHeight - (hVar.getHeight() + iArr[1])) + ((int) iVar.i.getTranslationY());
                    int i7 = iVar.f2124p;
                    if (height < i7) {
                        ViewGroup.LayoutParams layoutParams = iVar.i.getLayoutParams();
                        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                            Log.w(i.f2109z, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                            break;
                        } else {
                            int i8 = iVar.f2124p;
                            iVar.f2125q = i8;
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                            marginLayoutParams.bottomMargin = (i8 - height) + marginLayoutParams.bottomMargin;
                            iVar.i.requestLayout();
                            break;
                        }
                    } else {
                        iVar.f2125q = i7;
                        break;
                    }
                }
                break;
            case 1:
                iVar.b();
                break;
            default:
                h hVar2 = iVar.i;
                if (hVar2 != null) {
                    int i9 = 0;
                    if (hVar2.getParent() != null) {
                        hVar2.setVisibility(0);
                    }
                    if (hVar2.getAnimationMode() != 1) {
                        int height2 = hVar2.getHeight();
                        ViewGroup.LayoutParams layoutParams2 = hVar2.getLayoutParams();
                        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                            height2 += ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                        }
                        hVar2.setTranslationY(height2);
                        ValueAnimator valueAnimator = new ValueAnimator();
                        valueAnimator.setIntValues(height2, 0);
                        valueAnimator.setInterpolator(iVar.f2114e);
                        valueAnimator.setDuration(iVar.f2112c);
                        valueAnimator.addListener(new a(iVar, i6));
                        valueAnimator.addUpdateListener(new b(iVar, i3));
                        valueAnimator.start();
                        break;
                    } else {
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        valueAnimatorOfFloat.setInterpolator(iVar.f2113d);
                        valueAnimatorOfFloat.addUpdateListener(new b(iVar, i9));
                        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.8f, 1.0f);
                        valueAnimatorOfFloat2.setInterpolator(iVar.f2115f);
                        valueAnimatorOfFloat2.addUpdateListener(new b(iVar, i6));
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
                        animatorSet.setDuration(iVar.f2110a);
                        animatorSet.addListener(new a(iVar, 3));
                        animatorSet.start();
                        break;
                    }
                }
                break;
        }
    }
}
