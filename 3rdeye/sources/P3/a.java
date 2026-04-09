package P3;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import l4.C5287f;

/* compiled from: BottomSheetBehavior.java */
/* loaded from: classes2.dex */
public final class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BottomSheetBehavior f10586a;

    public a(BottomSheetBehavior bottomSheetBehavior) {
        this.f10586a = bottomSheetBehavior;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C5287f c5287f = this.f10586a.i;
        if (c5287f != null) {
            C5287f.b bVar = c5287f.f43759b;
            if (bVar.i != fFloatValue) {
                bVar.i = fFloatValue;
                c5287f.f43763f = true;
                c5287f.invalidateSelf();
            }
        }
    }
}
