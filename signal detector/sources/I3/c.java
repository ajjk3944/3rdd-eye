package I3;

import A3.z;
import R.L;
import R.O;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.SeekBar;
import com.apm.insight.R;
import com.google.android.material.slider.Slider;
import d5.y;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class c extends X.b {

    /* renamed from: q, reason: collision with root package name */
    public final Slider f1896q;

    /* renamed from: r, reason: collision with root package name */
    public final Rect f1897r;

    public c(Slider slider) {
        super(slider);
        this.f1897r = new Rect();
        this.f1896q = slider;
    }

    @Override // X.b
    public final int n(float f2, float f5) {
        int i = 0;
        while (true) {
            Slider slider = this.f1896q;
            if (i >= slider.getValues().size()) {
                return -1;
            }
            Rect rect = this.f1897r;
            slider.A(i, rect);
            if (rect.contains((int) f2, (int) f5)) {
                return i;
            }
            i++;
        }
    }

    @Override // X.b
    public final void o(ArrayList arrayList) {
        for (int i = 0; i < this.f1896q.getValues().size(); i++) {
            arrayList.add(Integer.valueOf(i));
        }
    }

    @Override // X.b
    public final boolean s(int i, int i3, Bundle bundle) {
        Slider slider = this.f1896q;
        if (!slider.isEnabled()) {
            return false;
        }
        if (i3 != 4096 && i3 != 8192) {
            if (i3 != 16908349 || bundle == null || !bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE") || !slider.y(i, bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"))) {
                return false;
            }
            slider.B();
            slider.postInvalidate();
            p(i);
            return true;
        }
        float fRound = slider.f1906C0;
        if (fRound == 0.0f) {
            fRound = 1.0f;
        }
        if ((slider.f1992y0 - slider.f1991x0) / fRound > 20) {
            fRound *= Math.round(r1 / r4);
        }
        if (i3 == 8192) {
            fRound = -fRound;
        }
        if (slider.q()) {
            fRound = -fRound;
        }
        if (!slider.y(i, y.e(slider.getValues().get(i).floatValue() + fRound, slider.getValueFrom(), slider.getValueTo()))) {
            return false;
        }
        slider.setActiveThumbIndex(i);
        z zVar = slider.f1968g1;
        slider.removeCallbacks(zVar);
        slider.postDelayed(zVar, slider.f1959d1);
        slider.B();
        slider.postInvalidate();
        p(i);
        return true;
    }

    @Override // X.b
    public final void u(int i, S.d dVar) {
        Object tag;
        AccessibilityNodeInfo accessibilityNodeInfo = dVar.f3446a;
        dVar.b(S.c.f3440o);
        Slider slider = this.f1896q;
        List<Float> values = slider.getValues();
        Float f2 = values.get(i);
        float fFloatValue = f2.floatValue();
        float valueFrom = slider.getValueFrom();
        float valueTo = slider.getValueTo();
        if (slider.isEnabled()) {
            if (fFloatValue > valueFrom) {
                dVar.a(8192);
            }
            if (fFloatValue < valueTo) {
                dVar.a(4096);
            }
        }
        NumberFormat numberInstance = NumberFormat.getNumberInstance();
        numberInstance.setMaximumFractionDigits(2);
        try {
            valueFrom = numberInstance.parse(numberInstance.format(valueFrom)).floatValue();
            valueTo = numberInstance.parse(numberInstance.format(valueTo)).floatValue();
            fFloatValue = numberInstance.parse(numberInstance.format(fFloatValue)).floatValue();
        } catch (ParseException unused) {
            int i3 = e.i1;
            Log.w("e", "Error parsing value(" + f2 + "), valueFrom(" + valueFrom + "), and valueTo(" + valueTo + ") into a float.");
        }
        accessibilityNodeInfo.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, valueFrom, valueTo, fFloatValue));
        dVar.i(SeekBar.class.getName());
        StringBuilder sb = new StringBuilder();
        if (slider.getContentDescription() != null) {
            sb.append(slider.getContentDescription());
            sb.append(",");
        }
        String str = String.format(((float) ((int) fFloatValue)) == fFloatValue ? "%.0f" : "%.2f", Float.valueOf(fFloatValue));
        String string = slider.getContext().getString(R.string.material_slider_value);
        if (values.size() > 1) {
            string = i == slider.getValues().size() - 1 ? slider.getContext().getString(R.string.material_slider_range_end) : i == 0 ? slider.getContext().getString(R.string.material_slider_range_start) : "";
        }
        WeakHashMap weakHashMap = O.f3270a;
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 30) {
            tag = L.b(slider);
        } else {
            tag = slider.getTag(R.id.tag_state_description);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        CharSequence charSequence = (CharSequence) tag;
        if (TextUtils.isEmpty(charSequence)) {
            Locale.getDefault();
            sb.append(string + ", " + str);
        } else if (i6 >= 30) {
            K.b.f(accessibilityNodeInfo, charSequence);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
        accessibilityNodeInfo.setContentDescription(sb.toString());
        Rect rect = this.f1897r;
        slider.A(i, rect);
        accessibilityNodeInfo.setBoundsInParent(rect);
    }
}
