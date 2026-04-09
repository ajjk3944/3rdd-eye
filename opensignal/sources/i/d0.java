package i;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatRadioButton;
import java.lang.reflect.Constructor;
import p.q0;

/* loaded from: classes.dex */
public class d0 {

    /* renamed from: b, reason: collision with root package name */
    public static final Class[] f11013b = {Context.class, AttributeSet.class};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f11014c = {R.attr.onClick};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f11015d = {R.attr.accessibilityHeading};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f11016e = {R.attr.accessibilityPaneTitle};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f11017f = {R.attr.screenReaderFocusable};

    /* renamed from: g, reason: collision with root package name */
    public static final String[] f11018g = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: h, reason: collision with root package name */
    public static final u.i0 f11019h = new u.i0(0);

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f11020a = new Object[2];

    public p.m a(Context context, AttributeSet attributeSet) {
        return new p.m(context, attributeSet, h.a.autoCompleteTextViewStyle);
    }

    public p.n b(Context context, AttributeSet attributeSet) {
        return new p.n(context, attributeSet, h.a.buttonStyle);
    }

    public AppCompatCheckBox c(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckBox(context, attributeSet);
    }

    public AppCompatRadioButton d(Context context, AttributeSet attributeSet) {
        return new AppCompatRadioButton(context, attributeSet);
    }

    public q0 e(Context context, AttributeSet attributeSet) {
        return new q0(context, attributeSet);
    }

    public final View f(Context context, String str, String str2) throws NoSuchMethodException, SecurityException {
        String strConcat;
        u.i0 i0Var = f11019h;
        Constructor constructor = (Constructor) i0Var.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    strConcat = str2.concat(str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                strConcat = str;
            }
            constructor = Class.forName(strConcat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f11013b);
            i0Var.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f11020a);
    }
}
