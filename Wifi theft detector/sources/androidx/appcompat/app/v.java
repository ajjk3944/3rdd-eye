package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.w0;
import androidx.core.view.ViewCompat;
import com.mbridge.msdk.MBridgeConstans;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class v {

    /* renamed from: b, reason: collision with root package name */
    public static final Class[] f583b = {Context.class, AttributeSet.class};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f584c = {R.attr.onClick};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f585d = {R.attr.accessibilityHeading};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f586e = {R.attr.accessibilityPaneTitle};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f587f = {R.attr.screenReaderFocusable};

    /* renamed from: g, reason: collision with root package name */
    public static final String[] f588g = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: h, reason: collision with root package name */
    public static final r.k f589h = new r.k();

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f590a = new Object[2];

    public static class a implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final View f591a;

        /* renamed from: b, reason: collision with root package name */
        public final String f592b;

        /* renamed from: c, reason: collision with root package name */
        public Method f593c;

        /* renamed from: d, reason: collision with root package name */
        public Context f594d;

        public a(View view, String str) {
            this.f591a = view;
            this.f592b = str;
        }

        public final void a(Context context) {
            String str;
            Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.f592b, View.class)) != null) {
                        this.f593c = method;
                        this.f594d = context;
                        return;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            int id = this.f591a.getId();
            if (id == -1) {
                str = "";
            } else {
                str = " with id '" + this.f591a.getContext().getResources().getResourceEntryName(id) + "'";
            }
            throw new IllegalStateException("Could not find method " + this.f592b + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.f591a.getClass() + str);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            if (this.f593c == null) {
                a(this.f591a.getContext());
            }
            try {
                this.f593c.invoke(this.f594d, view);
            } catch (IllegalAccessException e10) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e10);
            } catch (InvocationTargetException e11) {
                throw new IllegalStateException("Could not execute method for android:onClick", e11);
            }
        }
    }

    public static Context u(Context context, AttributeSet attributeSet, boolean z10, boolean z11) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.j.View, 0, 0);
        int resourceId = z10 ? typedArrayObtainStyledAttributes.getResourceId(c.j.View_android_theme, 0) : 0;
        if (z11 && resourceId == 0 && (resourceId = typedArrayObtainStyledAttributes.getResourceId(c.j.View_theme, 0)) != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        typedArrayObtainStyledAttributes.recycle();
        return (resourceId == 0 || ((context instanceof h.d) && ((h.d) context).c() == resourceId)) ? context : new h.d(context, resourceId);
    }

    public final void a(Context context, View view, AttributeSet attributeSet) {
        if (Build.VERSION.SDK_INT > 28) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f585d);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            ViewCompat.k0(view, typedArrayObtainStyledAttributes.getBoolean(0, false));
        }
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f586e);
        if (typedArrayObtainStyledAttributes2.hasValue(0)) {
            ViewCompat.l0(view, typedArrayObtainStyledAttributes2.getString(0));
        }
        typedArrayObtainStyledAttributes2.recycle();
        TypedArray typedArrayObtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, f587f);
        if (typedArrayObtainStyledAttributes3.hasValue(0)) {
            ViewCompat.v0(view, typedArrayObtainStyledAttributes3.getBoolean(0, false));
        }
        typedArrayObtainStyledAttributes3.recycle();
    }

    public final void b(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if ((context instanceof ContextWrapper) && view.hasOnClickListeners()) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f584c);
            String string = typedArrayObtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new a(view, string));
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public androidx.appcompat.widget.c c(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.c(context, attributeSet);
    }

    public AppCompatButton d(Context context, AttributeSet attributeSet) {
        return new AppCompatButton(context, attributeSet);
    }

    public androidx.appcompat.widget.e e(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.e(context, attributeSet);
    }

    public androidx.appcompat.widget.f f(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.f(context, attributeSet);
    }

    public androidx.appcompat.widget.j g(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.j(context, attributeSet);
    }

    public androidx.appcompat.widget.n h(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.n(context, attributeSet);
    }

    public AppCompatImageView i(Context context, AttributeSet attributeSet) {
        return new AppCompatImageView(context, attributeSet);
    }

    public androidx.appcompat.widget.p j(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.p(context, attributeSet);
    }

    public androidx.appcompat.widget.s k(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.s(context, attributeSet);
    }

    public androidx.appcompat.widget.t l(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.t(context, attributeSet);
    }

    public androidx.appcompat.widget.v m(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.v(context, attributeSet);
    }

    public AppCompatSpinner n(Context context, AttributeSet attributeSet) {
        return new AppCompatSpinner(context, attributeSet);
    }

    public AppCompatTextView o(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    public androidx.appcompat.widget.c0 p(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.c0(context, attributeSet);
    }

    public View q(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    public final View r(View view, String str, Context context, AttributeSet attributeSet, boolean z10, boolean z11, boolean z12, boolean z13) {
        Context context2;
        View viewL;
        context2 = (!z10 || view == null) ? context : view.getContext();
        if (z11 || z12) {
            context2 = u(context2, attributeSet, z11, z12);
        }
        if (z13) {
            context2 = w0.b(context2);
        }
        str.getClass();
        switch (str) {
            case "RatingBar":
                viewL = l(context2, attributeSet);
                v(viewL, str);
                break;
            case "CheckedTextView":
                viewL = f(context2, attributeSet);
                v(viewL, str);
                break;
            case "MultiAutoCompleteTextView":
                viewL = j(context2, attributeSet);
                v(viewL, str);
                break;
            case "TextView":
                viewL = o(context2, attributeSet);
                v(viewL, str);
                break;
            case "ImageButton":
                viewL = h(context2, attributeSet);
                v(viewL, str);
                break;
            case "SeekBar":
                viewL = m(context2, attributeSet);
                v(viewL, str);
                break;
            case "Spinner":
                viewL = n(context2, attributeSet);
                v(viewL, str);
                break;
            case "RadioButton":
                viewL = k(context2, attributeSet);
                v(viewL, str);
                break;
            case "ToggleButton":
                viewL = p(context2, attributeSet);
                v(viewL, str);
                break;
            case "ImageView":
                viewL = i(context2, attributeSet);
                v(viewL, str);
                break;
            case "AutoCompleteTextView":
                viewL = c(context2, attributeSet);
                v(viewL, str);
                break;
            case "CheckBox":
                viewL = e(context2, attributeSet);
                v(viewL, str);
                break;
            case "EditText":
                viewL = g(context2, attributeSet);
                v(viewL, str);
                break;
            case "Button":
                viewL = d(context2, attributeSet);
                v(viewL, str);
                break;
            default:
                viewL = q(context2, str, attributeSet);
                break;
        }
        if (viewL == null && context != context2) {
            viewL = t(context2, str, attributeSet);
        }
        if (viewL != null) {
            b(viewL, attributeSet);
            a(context2, viewL, attributeSet);
        }
        return viewL;
    }

    public final View s(Context context, String str, String str2) throws NoSuchMethodException, SecurityException {
        String str3;
        r.k kVar = f589h;
        Constructor constructor = (Constructor) kVar.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f583b);
            kVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f590a);
    }

    public final View t(Context context, String str, AttributeSet attributeSet) {
        if (str.equals(MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW)) {
            str = attributeSet.getAttributeValue(null, "class");
        }
        try {
            Object[] objArr = this.f590a;
            objArr[0] = context;
            objArr[1] = attributeSet;
            if (-1 != str.indexOf(46)) {
                return s(context, str, null);
            }
            int i10 = 0;
            while (true) {
                String[] strArr = f588g;
                if (i10 >= strArr.length) {
                    return null;
                }
                View viewS = s(context, str, strArr[i10]);
                if (viewS != null) {
                    return viewS;
                }
                i10++;
            }
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr2 = this.f590a;
            objArr2[0] = null;
            objArr2[1] = null;
        }
    }

    public final void v(View view, String str) {
        if (view != null) {
            return;
        }
        throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
    }
}
