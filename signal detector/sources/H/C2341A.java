package h;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import java.lang.reflect.Constructor;
import o.C2731p;
import o.C2750z;
import u.C2940i;

/* renamed from: h.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2341A {

    /* renamed from: b, reason: collision with root package name */
    public static final Class[] f20251b = {Context.class, AttributeSet.class};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f20252c = {R.attr.onClick};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f20253d = {R.attr.accessibilityHeading};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f20254e = {R.attr.accessibilityPaneTitle};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f20255f = {R.attr.screenReaderFocusable};

    /* renamed from: g, reason: collision with root package name */
    public static final String[] f20256g = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: h, reason: collision with root package name */
    public static final C2940i f20257h = new C2940i(0);

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f20258a = new Object[2];

    public AppCompatAutoCompleteTextView a(Context context, AttributeSet attributeSet) {
        return new AppCompatAutoCompleteTextView(context, attributeSet);
    }

    public AppCompatButton b(Context context, AttributeSet attributeSet) {
        return new AppCompatButton(context, attributeSet);
    }

    public C2731p c(Context context, AttributeSet attributeSet) {
        return new C2731p(context, attributeSet, com.apm.insight.R.attr.checkboxStyle);
    }

    public C2750z d(Context context, AttributeSet attributeSet) {
        return new C2750z(context, attributeSet);
    }

    public AppCompatTextView e(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    public final View f(Context context, String str, String str2) throws NoSuchMethodException, SecurityException {
        String strConcat;
        C2940i c2940i = f20257h;
        Constructor constructor = (Constructor) c2940i.get(str);
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
            constructor = Class.forName(strConcat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f20251b);
            c2940i.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f20258a);
    }
}
