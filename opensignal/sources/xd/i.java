package xd;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.HashMap;
import t7.q;
import t7.y;

/* loaded from: classes.dex */
public final class i extends q {
    @Override // t7.q
    public final void d(y yVar) {
        View view = yVar.f22529b;
        if (view instanceof TextView) {
            yVar.f22528a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // t7.q
    public final void g(y yVar) {
        View view = yVar.f22529b;
        if (view instanceof TextView) {
            yVar.f22528a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // t7.q
    public final Animator k(ViewGroup viewGroup, y yVar, y yVar2) {
        if (yVar == null || yVar2 == null || !(yVar.f22529b instanceof TextView)) {
            return null;
        }
        View view = yVar2.f22529b;
        if (!(view instanceof TextView)) {
            return null;
        }
        TextView textView = (TextView) view;
        HashMap map = yVar.f22528a;
        HashMap map2 = yVar2.f22528a;
        float fFloatValue = map.get("android:textscale:scale") != null ? ((Float) map.get("android:textscale:scale")).floatValue() : 1.0f;
        float fFloatValue2 = map2.get("android:textscale:scale") != null ? ((Float) map2.get("android:textscale:scale")).floatValue() : 1.0f;
        if (fFloatValue == fFloatValue2) {
            return null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fFloatValue, fFloatValue2);
        valueAnimatorOfFloat.addUpdateListener(new bq.f(5, textView));
        return valueAnimatorOfFloat;
    }
}
