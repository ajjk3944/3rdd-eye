package x3;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class z extends L0.l {
    @Override // L0.l
    public final void d(L0.t tVar) {
        View view = tVar.f2489b;
        if (view instanceof TextView) {
            tVar.f2488a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // L0.l
    public final void g(L0.t tVar) {
        View view = tVar.f2489b;
        if (view instanceof TextView) {
            tVar.f2488a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // L0.l
    public final Animator k(ViewGroup viewGroup, L0.t tVar, L0.t tVar2) {
        if (tVar == null || tVar2 == null || !(tVar.f2489b instanceof TextView)) {
            return null;
        }
        View view = tVar2.f2489b;
        if (!(view instanceof TextView)) {
            return null;
        }
        TextView textView = (TextView) view;
        HashMap map = tVar.f2488a;
        HashMap map2 = tVar2.f2488a;
        float fFloatValue = map.get("android:textscale:scale") != null ? ((Float) map.get("android:textscale:scale")).floatValue() : 1.0f;
        float fFloatValue2 = map2.get("android:textscale:scale") != null ? ((Float) map2.get("android:textscale:scale")).floatValue() : 1.0f;
        if (fFloatValue == fFloatValue2) {
            return null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fFloatValue, fFloatValue2);
        valueAnimatorOfFloat.addUpdateListener(new L3.b(4, textView));
        return valueAnimatorOfFloat;
    }
}
