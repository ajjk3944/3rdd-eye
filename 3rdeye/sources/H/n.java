package h;

import N7.B8;
import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatTextView;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import m0.C5316i;
import o.C5385c;

/* compiled from: AppCompatViewInflater.java */
/* loaded from: classes.dex */
public class n {

    /* renamed from: b, reason: collision with root package name */
    public static final Class<?>[] f38075b = {Context.class, AttributeSet.class};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f38076c = {R.attr.onClick};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f38077d = {R.attr.accessibilityHeading};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f38078e = {R.attr.accessibilityPaneTitle};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f38079f = {R.attr.screenReaderFocusable};

    /* renamed from: g, reason: collision with root package name */
    public static final String[] f38080g = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: h, reason: collision with root package name */
    public static final C5316i<String, Constructor<? extends View>> f38081h = new C5316i<>();

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f38082a = new Object[2];

    /* compiled from: AppCompatViewInflater.java */
    public static class a implements View.OnClickListener {

        /* renamed from: b, reason: collision with root package name */
        public final View f38083b;

        /* renamed from: c, reason: collision with root package name */
        public final String f38084c;

        /* renamed from: d, reason: collision with root package name */
        public Method f38085d;

        /* renamed from: e, reason: collision with root package name */
        public Context f38086e;

        public a(View view, String str) {
            this.f38083b = view;
            this.f38084c = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            String str;
            Method method;
            if (this.f38085d == null) {
                View view2 = this.f38083b;
                Context context = view2.getContext();
                while (true) {
                    String str2 = this.f38084c;
                    if (context == null) {
                        int id = view2.getId();
                        if (id == -1) {
                            str = "";
                        } else {
                            str = " with id '" + view2.getContext().getResources().getResourceEntryName(id) + "'";
                        }
                        StringBuilder sbK = B8.k("Could not find method ", str2, "(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                        sbK.append(view2.getClass());
                        sbK.append(str);
                        throw new IllegalStateException(sbK.toString());
                    }
                    try {
                        if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                            this.f38085d = method;
                            this.f38086e = context;
                        }
                    } catch (NoSuchMethodException unused) {
                    }
                    context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
                }
            }
            try {
                this.f38085d.invoke(this.f38086e, view);
            } catch (IllegalAccessException e4) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e4);
            } catch (InvocationTargetException e10) {
                throw new IllegalStateException("Could not execute method for android:onClick", e10);
            }
        }
    }

    public C5385c a(Context context, AttributeSet attributeSet) {
        return new C5385c(context, attributeSet);
    }

    public AppCompatButton b(Context context, AttributeSet attributeSet) {
        return new AppCompatButton(context, attributeSet);
    }

    public AppCompatCheckBox c(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckBox(context, attributeSet);
    }

    public AppCompatRadioButton d(Context context, AttributeSet attributeSet) {
        return new AppCompatRadioButton(context, attributeSet);
    }

    public AppCompatTextView e(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    public final View f(Context context, String str, String str2) throws InflateException, NoSuchMethodException, SecurityException, ClassNotFoundException {
        String strConcat;
        C5316i<String, Constructor<? extends View>> c5316i = f38081h;
        Constructor<? extends View> constructor = c5316i.get(str);
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
            constructor = Class.forName(strConcat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f38075b);
            c5316i.put(str, constructor);
        }
        constructor.setAccessible(true);
        return constructor.newInstance(this.f38082a);
    }
}
