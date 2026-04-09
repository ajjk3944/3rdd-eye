package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
class a0 {

    /* renamed from: k, reason: collision with root package name */
    private static final RectF f871k = new RectF();

    /* renamed from: l, reason: collision with root package name */
    private static ConcurrentHashMap<String, Method> f872l = new ConcurrentHashMap<>();

    /* renamed from: m, reason: collision with root package name */
    private static ConcurrentHashMap<String, Field> f873m = new ConcurrentHashMap<>();

    /* renamed from: a, reason: collision with root package name */
    private int f874a = 0;

    /* renamed from: b, reason: collision with root package name */
    private boolean f875b = false;

    /* renamed from: c, reason: collision with root package name */
    private float f876c = -1.0f;

    /* renamed from: d, reason: collision with root package name */
    private float f877d = -1.0f;

    /* renamed from: e, reason: collision with root package name */
    private float f878e = -1.0f;

    /* renamed from: f, reason: collision with root package name */
    private int[] f879f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    private boolean f880g = false;

    /* renamed from: h, reason: collision with root package name */
    private TextPaint f881h;

    /* renamed from: i, reason: collision with root package name */
    private final TextView f882i;

    /* renamed from: j, reason: collision with root package name */
    private final Context f883j;

    a0(TextView textView) {
        this.f882i = textView;
        this.f883j = textView.getContext();
    }

    private void A(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i2 = 0; i2 < length; i2++) {
                iArr[i2] = typedArray.getDimensionPixelSize(i2, -1);
            }
            this.f879f = c(iArr);
            B();
        }
    }

    private boolean B() {
        boolean z2 = this.f879f.length > 0;
        this.f880g = z2;
        if (z2) {
            this.f874a = 1;
            this.f877d = r0[0];
            this.f878e = r0[r1 - 1];
            this.f876c = -1.0f;
        }
        return z2;
    }

    private boolean C(int i2, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f882i.getText();
        TransformationMethod transformationMethod = this.f882i.getTransformationMethod();
        if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.f882i)) != null) {
            text = transformation;
        }
        int maxLines = Build.VERSION.SDK_INT >= 16 ? this.f882i.getMaxLines() : -1;
        q(i2);
        StaticLayout staticLayoutE = e(text, (Layout.Alignment) r(this.f882i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines);
        return (maxLines == -1 || (staticLayoutE.getLineCount() <= maxLines && staticLayoutE.getLineEnd(staticLayoutE.getLineCount() - 1) == text.length())) && ((float) staticLayoutE.getHeight()) <= rectF.bottom;
    }

    private boolean D() {
        return !(this.f882i instanceof k);
    }

    private void E(float f2, float f3, float f4) {
        if (f2 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f2 + "px) is less or equal to (0px)");
        }
        if (f3 <= f2) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f3 + "px) is less or equal to minimum auto-size text size (" + f2 + "px)");
        }
        if (f4 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f4 + "px) is less or equal to (0px)");
        }
        this.f874a = 1;
        this.f877d = f2;
        this.f878e = f3;
        this.f876c = f4;
        this.f880g = false;
    }

    private static <T> T a(Object obj, String str, T t2) {
        try {
            Field fieldO = o(str);
            return fieldO == null ? t2 : (T) fieldO.get(obj);
        } catch (IllegalAccessException e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to access TextView#" + str + " member", e2);
            return t2;
        }
    }

    private int[] c(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i2 : iArr) {
            if (i2 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i2)) < 0) {
                arrayList.add(Integer.valueOf(i2));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i3 = 0; i3 < size; i3++) {
            iArr2[i3] = ((Integer) arrayList.get(i3)).intValue();
        }
        return iArr2;
    }

    private void d() {
        this.f874a = 0;
        this.f877d = -1.0f;
        this.f878e = -1.0f;
        this.f876c = -1.0f;
        this.f879f = new int[0];
        this.f875b = false;
    }

    private StaticLayout f(CharSequence charSequence, Layout.Alignment alignment, int i2, int i3) {
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f881h, i2);
        StaticLayout.Builder hyphenationFrequency = builderObtain.setAlignment(alignment).setLineSpacing(this.f882i.getLineSpacingExtra(), this.f882i.getLineSpacingMultiplier()).setIncludePad(this.f882i.getIncludeFontPadding()).setBreakStrategy(this.f882i.getBreakStrategy()).setHyphenationFrequency(this.f882i.getHyphenationFrequency());
        if (i3 == -1) {
            i3 = Integer.MAX_VALUE;
        }
        hyphenationFrequency.setMaxLines(i3);
        try {
            builderObtain.setTextDirection(Build.VERSION.SDK_INT >= 29 ? this.f882i.getTextDirectionHeuristic() : (TextDirectionHeuristic) r(this.f882i, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        } catch (ClassCastException unused) {
            Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
        }
        return builderObtain.build();
    }

    private StaticLayout g(CharSequence charSequence, Layout.Alignment alignment, int i2) {
        return new StaticLayout(charSequence, this.f881h, i2, alignment, ((Float) a(this.f882i, "mSpacingMult", Float.valueOf(1.0f))).floatValue(), ((Float) a(this.f882i, "mSpacingAdd", Float.valueOf(0.0f))).floatValue(), ((Boolean) a(this.f882i, "mIncludePad", Boolean.TRUE)).booleanValue());
    }

    private StaticLayout h(CharSequence charSequence, Layout.Alignment alignment, int i2) {
        return new StaticLayout(charSequence, this.f881h, i2, alignment, this.f882i.getLineSpacingMultiplier(), this.f882i.getLineSpacingExtra(), this.f882i.getIncludeFontPadding());
    }

    private int i(RectF rectF) {
        int length = this.f879f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i2 = length - 1;
        int i3 = 1;
        int i4 = 0;
        while (i3 <= i2) {
            int i5 = (i3 + i2) / 2;
            if (C(this.f879f[i5], rectF)) {
                int i6 = i5 + 1;
                i4 = i3;
                i3 = i6;
            } else {
                i4 = i5 - 1;
                i2 = i4;
            }
        }
        return this.f879f[i4];
    }

    private static Field o(String str) {
        try {
            Field declaredField = f873m.get(str);
            if (declaredField == null && (declaredField = TextView.class.getDeclaredField(str)) != null) {
                declaredField.setAccessible(true);
                f873m.put(str, declaredField);
            }
            return declaredField;
        } catch (NoSuchFieldException e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to access TextView#" + str + " member", e2);
            return null;
        }
    }

    private static Method p(String str) {
        try {
            Method declaredMethod = f872l.get(str);
            if (declaredMethod == null && (declaredMethod = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                declaredMethod.setAccessible(true);
                f872l.put(str, declaredMethod);
            }
            return declaredMethod;
        } catch (Exception e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e2);
            return null;
        }
    }

    private static <T> T r(Object obj, String str, T t2) {
        try {
            return (T) p(str).invoke(obj, new Object[0]);
        } catch (Exception e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e2);
            return t2;
        }
    }

    private void x(float f2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (f2 != this.f882i.getPaint().getTextSize()) {
            this.f882i.getPaint().setTextSize(f2);
            boolean zIsInLayout = Build.VERSION.SDK_INT >= 18 ? this.f882i.isInLayout() : false;
            if (this.f882i.getLayout() != null) {
                this.f875b = false;
                try {
                    Method methodP = p("nullLayouts");
                    if (methodP != null) {
                        methodP.invoke(this.f882i, new Object[0]);
                    }
                } catch (Exception e2) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e2);
                }
                if (zIsInLayout) {
                    this.f882i.forceLayout();
                } else {
                    this.f882i.requestLayout();
                }
                this.f882i.invalidate();
            }
        }
    }

    private boolean z() {
        if (D() && this.f874a == 1) {
            if (!this.f880g || this.f879f.length == 0) {
                int iFloor = ((int) Math.floor((this.f878e - this.f877d) / this.f876c)) + 1;
                int[] iArr = new int[iFloor];
                for (int i2 = 0; i2 < iFloor; i2++) {
                    iArr[i2] = Math.round(this.f877d + (i2 * this.f876c));
                }
                this.f879f = c(iArr);
            }
            this.f875b = true;
        } else {
            this.f875b = false;
        }
        return this.f875b;
    }

    void b() {
        if (s()) {
            if (this.f875b) {
                if (this.f882i.getMeasuredHeight() <= 0 || this.f882i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = Build.VERSION.SDK_INT >= 29 ? this.f882i.isHorizontallyScrollable() : ((Boolean) r(this.f882i, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue() ? 1048576 : (this.f882i.getMeasuredWidth() - this.f882i.getTotalPaddingLeft()) - this.f882i.getTotalPaddingRight();
                int height = (this.f882i.getHeight() - this.f882i.getCompoundPaddingBottom()) - this.f882i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f871k;
                synchronized (rectF) {
                    rectF.setEmpty();
                    rectF.right = measuredWidth;
                    rectF.bottom = height;
                    float fI = i(rectF);
                    if (fI != this.f882i.getTextSize()) {
                        y(0, fI);
                    }
                }
            }
            this.f875b = true;
        }
    }

    StaticLayout e(CharSequence charSequence, Layout.Alignment alignment, int i2, int i3) {
        int i4 = Build.VERSION.SDK_INT;
        return i4 >= 23 ? f(charSequence, alignment, i2, i3) : i4 >= 16 ? h(charSequence, alignment, i2) : g(charSequence, alignment, i2);
    }

    int j() {
        return Math.round(this.f878e);
    }

    int k() {
        return Math.round(this.f877d);
    }

    int l() {
        return Math.round(this.f876c);
    }

    int[] m() {
        return this.f879f;
    }

    int n() {
        return this.f874a;
    }

    void q(int i2) {
        TextPaint textPaint = this.f881h;
        if (textPaint == null) {
            this.f881h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f881h.set(this.f882i.getPaint());
        this.f881h.setTextSize(i2);
    }

    boolean s() {
        return D() && this.f874a != 0;
    }

    void t(AttributeSet attributeSet, int i2) throws Resources.NotFoundException {
        int resourceId;
        TypedArray typedArrayObtainStyledAttributes = this.f883j.obtainStyledAttributes(attributeSet, a.j.f150i0, i2, 0);
        int i3 = a.j.f160n0;
        if (typedArrayObtainStyledAttributes.hasValue(i3)) {
            this.f874a = typedArrayObtainStyledAttributes.getInt(i3, 0);
        }
        int i4 = a.j.f158m0;
        float dimension = typedArrayObtainStyledAttributes.hasValue(i4) ? typedArrayObtainStyledAttributes.getDimension(i4, -1.0f) : -1.0f;
        int i5 = a.j.f154k0;
        float dimension2 = typedArrayObtainStyledAttributes.hasValue(i5) ? typedArrayObtainStyledAttributes.getDimension(i5, -1.0f) : -1.0f;
        int i6 = a.j.f152j0;
        float dimension3 = typedArrayObtainStyledAttributes.hasValue(i6) ? typedArrayObtainStyledAttributes.getDimension(i6, -1.0f) : -1.0f;
        int i7 = a.j.f156l0;
        if (typedArrayObtainStyledAttributes.hasValue(i7) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(i7, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            A(typedArrayObtainTypedArray);
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!D()) {
            this.f874a = 0;
            return;
        }
        if (this.f874a == 1) {
            if (!this.f880g) {
                DisplayMetrics displayMetrics = this.f883j.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                E(dimension2, dimension3, dimension);
            }
            z();
        }
    }

    void u(int i2, int i3, int i4, int i5) {
        if (D()) {
            DisplayMetrics displayMetrics = this.f883j.getResources().getDisplayMetrics();
            E(TypedValue.applyDimension(i5, i2, displayMetrics), TypedValue.applyDimension(i5, i3, displayMetrics), TypedValue.applyDimension(i5, i4, displayMetrics));
            if (z()) {
                b();
            }
        }
    }

    void v(int[] iArr, int i2) {
        if (D()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i2 == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f883j.getResources().getDisplayMetrics();
                    for (int i3 = 0; i3 < length; i3++) {
                        iArrCopyOf[i3] = Math.round(TypedValue.applyDimension(i2, iArr[i3], displayMetrics));
                    }
                }
                this.f879f = c(iArrCopyOf);
                if (!B()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f880g = false;
            }
            if (z()) {
                b();
            }
        }
    }

    void w(int i2) {
        if (D()) {
            if (i2 == 0) {
                d();
                return;
            }
            if (i2 != 1) {
                throw new IllegalArgumentException("Unknown auto-size text type: " + i2);
            }
            DisplayMetrics displayMetrics = this.f883j.getResources().getDisplayMetrics();
            E(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (z()) {
                b();
            }
        }
    }

    void y(int i2, float f2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Context context = this.f883j;
        x(TypedValue.applyDimension(i2, f2, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }
}
