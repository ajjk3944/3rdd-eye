package androidx.appcompat.app;

import F1.W;
import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.A;
import androidx.appcompat.widget.C3879d;
import androidx.appcompat.widget.C3881f;
import androidx.appcompat.widget.C3882g;
import androidx.appcompat.widget.C3883h;
import androidx.appcompat.widget.C3887l;
import androidx.appcompat.widget.C3891p;
import androidx.appcompat.widget.C3893s;
import androidx.appcompat.widget.C3896v;
import androidx.appcompat.widget.C3897w;
import androidx.appcompat.widget.C3899y;
import androidx.appcompat.widget.D;
import androidx.appcompat.widget.H;
import androidx.appcompat.widget.Y;
import h.AbstractC5936j;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import o.V;

/* loaded from: classes.dex */
public class q {

    /* renamed from: b, reason: collision with root package name */
    private static final Class[] f26610b = {Context.class, AttributeSet.class};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f26611c = {R.attr.onClick};

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f26612d = {R.attr.accessibilityHeading};

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f26613e = {R.attr.accessibilityPaneTitle};

    /* renamed from: f, reason: collision with root package name */
    private static final int[] f26614f = {R.attr.screenReaderFocusable};

    /* renamed from: g, reason: collision with root package name */
    private static final String[] f26615g = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: h, reason: collision with root package name */
    private static final V f26616h = new V();

    /* renamed from: a, reason: collision with root package name */
    private final Object[] f26617a = new Object[2];

    private static class a implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        private final View f26618a;

        /* renamed from: b, reason: collision with root package name */
        private final String f26619b;

        /* renamed from: c, reason: collision with root package name */
        private Method f26620c;

        /* renamed from: d, reason: collision with root package name */
        private Context f26621d;

        public a(View view, String str) {
            this.f26618a = view;
            this.f26619b = str;
        }

        private void a(Context context) {
            String str;
            Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.f26619b, View.class)) != null) {
                        this.f26620c = method;
                        this.f26621d = context;
                        return;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            int id2 = this.f26618a.getId();
            if (id2 == -1) {
                str = "";
            } else {
                str = " with id '" + this.f26618a.getContext().getResources().getResourceEntryName(id2) + "'";
            }
            throw new IllegalStateException("Could not find method " + this.f26619b + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.f26618a.getClass() + str);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            if (this.f26620c == null) {
                a(this.f26618a.getContext());
            }
            try {
                this.f26620c.invoke(this.f26621d, view);
            } catch (IllegalAccessException e10) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e10);
            } catch (InvocationTargetException e11) {
                throw new IllegalStateException("Could not execute method for android:onClick", e11);
            }
        }
    }

    private void a(Context context, View view, AttributeSet attributeSet) {
        if (Build.VERSION.SDK_INT > 28) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f26612d);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            W.n0(view, typedArrayObtainStyledAttributes.getBoolean(0, false));
        }
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f26613e);
        if (typedArrayObtainStyledAttributes2.hasValue(0)) {
            W.p0(view, typedArrayObtainStyledAttributes2.getString(0));
        }
        typedArrayObtainStyledAttributes2.recycle();
        TypedArray typedArrayObtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, f26614f);
        if (typedArrayObtainStyledAttributes3.hasValue(0)) {
            W.A0(view, typedArrayObtainStyledAttributes3.getBoolean(0, false));
        }
        typedArrayObtainStyledAttributes3.recycle();
    }

    private void b(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if ((context instanceof ContextWrapper) && view.hasOnClickListeners()) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f26611c);
            String string = typedArrayObtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new a(view, string));
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private View s(Context context, String str, String str2) throws NoSuchMethodException, SecurityException {
        String str3;
        V v10 = f26616h;
        Constructor constructor = (Constructor) v10.get(str);
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
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f26610b);
            v10.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f26617a);
    }

    private View t(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue(null, "class");
        }
        try {
            Object[] objArr = this.f26617a;
            objArr[0] = context;
            objArr[1] = attributeSet;
            if (-1 != str.indexOf(46)) {
                return s(context, str, null);
            }
            int i10 = 0;
            while (true) {
                String[] strArr = f26615g;
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
            Object[] objArr2 = this.f26617a;
            objArr2[0] = null;
            objArr2[1] = null;
        }
    }

    private static Context u(Context context, AttributeSet attributeSet, boolean z10, boolean z11) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC5936j.f48198b3, 0, 0);
        int resourceId = z10 ? typedArrayObtainStyledAttributes.getResourceId(AbstractC5936j.f48203c3, 0) : 0;
        if (z11 && resourceId == 0 && (resourceId = typedArrayObtainStyledAttributes.getResourceId(AbstractC5936j.f48208d3, 0)) != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        typedArrayObtainStyledAttributes.recycle();
        return resourceId != 0 ? ((context instanceof androidx.appcompat.view.d) && ((androidx.appcompat.view.d) context).c() == resourceId) ? context : new androidx.appcompat.view.d(context, resourceId) : context;
    }

    private void v(View view, String str) {
        if (view != null) {
            return;
        }
        throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
    }

    protected C3879d c(Context context, AttributeSet attributeSet) {
        return new C3879d(context, attributeSet);
    }

    protected C3881f d(Context context, AttributeSet attributeSet) {
        return new C3881f(context, attributeSet);
    }

    protected C3882g e(Context context, AttributeSet attributeSet) {
        return new C3882g(context, attributeSet);
    }

    protected C3883h f(Context context, AttributeSet attributeSet) {
        return new C3883h(context, attributeSet);
    }

    protected C3887l g(Context context, AttributeSet attributeSet) {
        return new C3887l(context, attributeSet);
    }

    protected C3891p h(Context context, AttributeSet attributeSet) {
        return new C3891p(context, attributeSet);
    }

    protected androidx.appcompat.widget.r i(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.r(context, attributeSet);
    }

    protected C3893s j(Context context, AttributeSet attributeSet) {
        return new C3893s(context, attributeSet);
    }

    protected C3896v k(Context context, AttributeSet attributeSet) {
        return new C3896v(context, attributeSet);
    }

    protected C3897w l(Context context, AttributeSet attributeSet) {
        return new C3897w(context, attributeSet);
    }

    protected C3899y m(Context context, AttributeSet attributeSet) {
        return new C3899y(context, attributeSet);
    }

    protected A n(Context context, AttributeSet attributeSet) {
        return new A(context, attributeSet);
    }

    protected D o(Context context, AttributeSet attributeSet) {
        return new D(context, attributeSet);
    }

    protected H p(Context context, AttributeSet attributeSet) {
        return new H(context, attributeSet);
    }

    protected View q(Context context, String str, AttributeSet attributeSet) {
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
            context2 = Y.b(context2);
        }
        str.hashCode();
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
}
