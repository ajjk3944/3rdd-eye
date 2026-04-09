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
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class z {

    /* renamed from: l, reason: collision with root package name */
    public static final RectF f1408l = new RectF();

    /* renamed from: m, reason: collision with root package name */
    public static ConcurrentHashMap f1409m = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public int f1410a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1411b = false;

    /* renamed from: c, reason: collision with root package name */
    public float f1412c = -1.0f;

    /* renamed from: d, reason: collision with root package name */
    public float f1413d = -1.0f;

    /* renamed from: e, reason: collision with root package name */
    public float f1414e = -1.0f;

    /* renamed from: f, reason: collision with root package name */
    public int[] f1415f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    public boolean f1416g = false;

    /* renamed from: h, reason: collision with root package name */
    public TextPaint f1417h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f1418i;

    /* renamed from: j, reason: collision with root package name */
    public final Context f1419j;

    /* renamed from: k, reason: collision with root package name */
    public final d f1420k;

    public static final class a {
        @NonNull
        @DoNotInline
        public static StaticLayout a(@NonNull CharSequence charSequence, @NonNull Layout.Alignment alignment, int i10, int i11, @NonNull TextView textView, @NonNull TextPaint textPaint, @NonNull d dVar) {
            StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i10);
            StaticLayout.Builder hyphenationFrequency = builderObtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
            if (i11 == -1) {
                i11 = Integer.MAX_VALUE;
            }
            hyphenationFrequency.setMaxLines(i11);
            try {
                dVar.a(builderObtain, textView);
            } catch (ClassCastException unused) {
                Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
            }
            return builderObtain.build();
        }
    }

    public static class b extends d {
        @Override // androidx.appcompat.widget.z.d
        public void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) z.m(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    public static class c extends b {
        @Override // androidx.appcompat.widget.z.b, androidx.appcompat.widget.z.d
        public void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }

        @Override // androidx.appcompat.widget.z.d
        public boolean b(TextView textView) {
            return textView.isHorizontallyScrollable();
        }
    }

    public static class d {
        public abstract void a(StaticLayout.Builder builder, TextView textView);

        public boolean b(TextView textView) {
            return ((Boolean) z.m(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    public z(TextView textView) {
        this.f1418i = textView;
        this.f1419j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f1420k = new c();
        } else {
            this.f1420k = new b();
        }
    }

    public static Method k(String str) throws SecurityException {
        try {
            Method declaredMethod = (Method) f1409m.get(str);
            if (declaredMethod != null || (declaredMethod = TextView.class.getDeclaredMethod(str, null)) == null) {
                return declaredMethod;
            }
            declaredMethod.setAccessible(true);
            f1409m.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e10);
            return null;
        }
    }

    public static Object m(Object obj, String str, Object obj2) {
        try {
            return k(str).invoke(obj, null);
        } catch (Exception e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e10);
            return obj2;
        }
    }

    public void a() {
        if (n()) {
            if (this.f1411b) {
                if (this.f1418i.getMeasuredHeight() <= 0 || this.f1418i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f1420k.b(this.f1418i) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : (this.f1418i.getMeasuredWidth() - this.f1418i.getTotalPaddingLeft()) - this.f1418i.getTotalPaddingRight();
                int height = (this.f1418i.getHeight() - this.f1418i.getCompoundPaddingBottom()) - this.f1418i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f1408l;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float fE = e(rectF);
                        if (fE != this.f1418i.getTextSize()) {
                            t(0, fE);
                        }
                    } finally {
                    }
                }
            }
            this.f1411b = true;
        }
    }

    public final int[] b(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i10 : iArr) {
                if (i10 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i10)) < 0) {
                    arrayList.add(Integer.valueOf(i10));
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i11 = 0; i11 < size; i11++) {
                    iArr2[i11] = ((Integer) arrayList.get(i11)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    public final void c() {
        this.f1410a = 0;
        this.f1413d = -1.0f;
        this.f1414e = -1.0f;
        this.f1412c = -1.0f;
        this.f1415f = new int[0];
        this.f1411b = false;
    }

    public StaticLayout d(CharSequence charSequence, Layout.Alignment alignment, int i10, int i11) {
        return a.a(charSequence, alignment, i10, i11, this.f1418i, this.f1417h, this.f1420k);
    }

    public final int e(RectF rectF) {
        int length = this.f1415f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i10 = 1;
        int i11 = length - 1;
        int i12 = 0;
        while (i10 <= i11) {
            int i13 = (i10 + i11) / 2;
            if (x(this.f1415f[i13], rectF)) {
                int i14 = i13 + 1;
                i12 = i10;
                i10 = i14;
            } else {
                i12 = i13 - 1;
                i11 = i12;
            }
        }
        return this.f1415f[i12];
    }

    public int f() {
        return Math.round(this.f1414e);
    }

    public int g() {
        return Math.round(this.f1413d);
    }

    public int h() {
        return Math.round(this.f1412c);
    }

    public int[] i() {
        return this.f1415f;
    }

    public int j() {
        return this.f1410a;
    }

    public void l(int i10) {
        TextPaint textPaint = this.f1417h;
        if (textPaint == null) {
            this.f1417h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f1417h.set(this.f1418i.getPaint());
        this.f1417h.setTextSize(i10);
    }

    public boolean n() {
        return y() && this.f1410a != 0;
    }

    public void o(AttributeSet attributeSet, int i10) {
        int resourceId;
        Context context = this.f1419j;
        int[] iArr = c.j.AppCompatTextView;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        TextView textView = this.f1418i;
        ViewCompat.h0(textView, textView.getContext(), iArr, attributeSet, typedArrayObtainStyledAttributes, i10, 0);
        int i11 = c.j.AppCompatTextView_autoSizeTextType;
        if (typedArrayObtainStyledAttributes.hasValue(i11)) {
            this.f1410a = typedArrayObtainStyledAttributes.getInt(i11, 0);
        }
        int i12 = c.j.AppCompatTextView_autoSizeStepGranularity;
        float dimension = typedArrayObtainStyledAttributes.hasValue(i12) ? typedArrayObtainStyledAttributes.getDimension(i12, -1.0f) : -1.0f;
        int i13 = c.j.AppCompatTextView_autoSizeMinTextSize;
        float dimension2 = typedArrayObtainStyledAttributes.hasValue(i13) ? typedArrayObtainStyledAttributes.getDimension(i13, -1.0f) : -1.0f;
        int i14 = c.j.AppCompatTextView_autoSizeMaxTextSize;
        float dimension3 = typedArrayObtainStyledAttributes.hasValue(i14) ? typedArrayObtainStyledAttributes.getDimension(i14, -1.0f) : -1.0f;
        int i15 = c.j.AppCompatTextView_autoSizePresetSizes;
        if (typedArrayObtainStyledAttributes.hasValue(i15) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(i15, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            v(typedArrayObtainTypedArray);
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!y()) {
            this.f1410a = 0;
            return;
        }
        if (this.f1410a == 1) {
            if (!this.f1416g) {
                DisplayMetrics displayMetrics = this.f1419j.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                z(dimension2, dimension3, dimension);
            }
            u();
        }
    }

    public void p(int i10, int i11, int i12, int i13) {
        if (y()) {
            DisplayMetrics displayMetrics = this.f1419j.getResources().getDisplayMetrics();
            z(TypedValue.applyDimension(i13, i10, displayMetrics), TypedValue.applyDimension(i13, i11, displayMetrics), TypedValue.applyDimension(i13, i12, displayMetrics));
            if (u()) {
                a();
            }
        }
    }

    public void q(int[] iArr, int i10) {
        if (y()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i10 == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f1419j.getResources().getDisplayMetrics();
                    for (int i11 = 0; i11 < length; i11++) {
                        iArrCopyOf[i11] = Math.round(TypedValue.applyDimension(i10, iArr[i11], displayMetrics));
                    }
                }
                this.f1415f = b(iArrCopyOf);
                if (!w()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f1416g = false;
            }
            if (u()) {
                a();
            }
        }
    }

    public void r(int i10) {
        if (y()) {
            if (i10 == 0) {
                c();
                return;
            }
            if (i10 != 1) {
                throw new IllegalArgumentException("Unknown auto-size text type: " + i10);
            }
            DisplayMetrics displayMetrics = this.f1419j.getResources().getDisplayMetrics();
            z(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (u()) {
                a();
            }
        }
    }

    public final void s(float f10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (f10 != this.f1418i.getPaint().getTextSize()) {
            this.f1418i.getPaint().setTextSize(f10);
            boolean zIsInLayout = this.f1418i.isInLayout();
            if (this.f1418i.getLayout() != null) {
                this.f1411b = false;
                try {
                    Method methodK = k("nullLayouts");
                    if (methodK != null) {
                        methodK.invoke(this.f1418i, null);
                    }
                } catch (Exception e10) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e10);
                }
                if (zIsInLayout) {
                    this.f1418i.forceLayout();
                } else {
                    this.f1418i.requestLayout();
                }
                this.f1418i.invalidate();
            }
        }
    }

    public void t(int i10, float f10) {
        Context context = this.f1419j;
        s(TypedValue.applyDimension(i10, f10, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }

    public final boolean u() {
        if (y() && this.f1410a == 1) {
            if (!this.f1416g || this.f1415f.length == 0) {
                int iFloor = ((int) Math.floor((this.f1414e - this.f1413d) / this.f1412c)) + 1;
                int[] iArr = new int[iFloor];
                for (int i10 = 0; i10 < iFloor; i10++) {
                    iArr[i10] = Math.round(this.f1413d + (i10 * this.f1412c));
                }
                this.f1415f = b(iArr);
            }
            this.f1411b = true;
        } else {
            this.f1411b = false;
        }
        return this.f1411b;
    }

    public final void v(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i10 = 0; i10 < length; i10++) {
                iArr[i10] = typedArray.getDimensionPixelSize(i10, -1);
            }
            this.f1415f = b(iArr);
            w();
        }
    }

    public final boolean w() {
        boolean z10 = this.f1415f.length > 0;
        this.f1416g = z10;
        if (z10) {
            this.f1410a = 1;
            this.f1413d = r0[0];
            this.f1414e = r0[r1 - 1];
            this.f1412c = -1.0f;
        }
        return z10;
    }

    public final boolean x(int i10, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f1418i.getText();
        TransformationMethod transformationMethod = this.f1418i.getTransformationMethod();
        if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.f1418i)) != null) {
            text = transformation;
        }
        int maxLines = this.f1418i.getMaxLines();
        l(i10);
        StaticLayout staticLayoutD = d(text, (Layout.Alignment) m(this.f1418i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines);
        return (maxLines == -1 || (staticLayoutD.getLineCount() <= maxLines && staticLayoutD.getLineEnd(staticLayoutD.getLineCount() - 1) == text.length())) && ((float) staticLayoutD.getHeight()) <= rectF.bottom;
    }

    public final boolean y() {
        return !(this.f1418i instanceof j);
    }

    public final void z(float f10, float f11, float f12) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f10 + "px) is less or equal to (0px)");
        }
        if (f11 <= f10) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f11 + "px) is less or equal to minimum auto-size text size (" + f10 + "px)");
        }
        if (f12 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f12 + "px) is less or equal to (0px)");
        }
        this.f1410a = 1;
        this.f1413d = f10;
        this.f1414e = f11;
        this.f1412c = f12;
        this.f1416g = false;
    }
}
