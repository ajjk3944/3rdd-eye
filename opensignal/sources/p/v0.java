package p;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class v0 {

    /* renamed from: l, reason: collision with root package name */
    public static final RectF f20189l = new RectF();

    /* renamed from: m, reason: collision with root package name */
    public static final ConcurrentHashMap f20190m = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public int f20191a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f20192b = false;

    /* renamed from: c, reason: collision with root package name */
    public float f20193c = -1.0f;

    /* renamed from: d, reason: collision with root package name */
    public float f20194d = -1.0f;

    /* renamed from: e, reason: collision with root package name */
    public float f20195e = -1.0f;

    /* renamed from: f, reason: collision with root package name */
    public int[] f20196f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    public boolean f20197g = false;

    /* renamed from: h, reason: collision with root package name */
    public TextPaint f20198h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f20199i;
    public final Context j;
    public final s0 k;

    public v0(TextView textView) {
        this.f20199i = textView;
        this.j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.k = new t0();
        } else {
            this.k = new s0();
        }
    }

    public static int[] b(int[] iArr) {
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

    public static Method d(String str) throws SecurityException {
        try {
            ConcurrentHashMap concurrentHashMap = f20190m;
            Method declaredMethod = (Method) concurrentHashMap.get(str);
            if (declaredMethod != null || (declaredMethod = TextView.class.getDeclaredMethod(str, null)) == null) {
                return declaredMethod;
            }
            declaredMethod.setAccessible(true);
            concurrentHashMap.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e4) {
            io.sentry.android.core.e0.q("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e4);
            return null;
        }
    }

    public static Object e(Object obj, Object obj2, String str) {
        try {
            return d(str).invoke(obj, null);
        } catch (Exception e4) {
            io.sentry.android.core.e0.q("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e4);
            return obj2;
        }
    }

    public final void a() {
        if (f()) {
            if (this.f20192b) {
                if (this.f20199i.getMeasuredHeight() <= 0 || this.f20199i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.k.b(this.f20199i) ? 1048576 : (this.f20199i.getMeasuredWidth() - this.f20199i.getTotalPaddingLeft()) - this.f20199i.getTotalPaddingRight();
                int height = (this.f20199i.getHeight() - this.f20199i.getCompoundPaddingBottom()) - this.f20199i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f20189l;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float fC = c(rectF);
                        if (fC != this.f20199i.getTextSize()) {
                            g(0, fC);
                        }
                    } finally {
                    }
                }
            }
            this.f20192b = true;
        }
    }

    public final int c(RectF rectF) {
        CharSequence transformation;
        int length = this.f20196f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i10 = length - 1;
        int i11 = 0;
        int i12 = 1;
        while (i12 <= i10) {
            int i13 = (i12 + i10) / 2;
            int i14 = this.f20196f[i13];
            TextView textView = this.f20199i;
            CharSequence text = textView.getText();
            TransformationMethod transformationMethod = textView.getTransformationMethod();
            CharSequence charSequence = (transformationMethod == null || (transformation = transformationMethod.getTransformation(text, textView)) == null) ? text : transformation;
            int maxLines = textView.getMaxLines();
            TextPaint textPaint = this.f20198h;
            if (textPaint == null) {
                this.f20198h = new TextPaint();
            } else {
                textPaint.reset();
            }
            this.f20198h.set(textView.getPaint());
            this.f20198h.setTextSize(i14);
            StaticLayout staticLayoutA = r0.a(charSequence, (Layout.Alignment) e(textView, Layout.Alignment.ALIGN_NORMAL, "getLayoutAlignment"), Math.round(rectF.right), maxLines, this.f20199i, this.f20198h, this.k);
            if ((maxLines == -1 || (staticLayoutA.getLineCount() <= maxLines && staticLayoutA.getLineEnd(staticLayoutA.getLineCount() - 1) == charSequence.length())) && staticLayoutA.getHeight() <= rectF.bottom) {
                int i15 = i13 + 1;
                i11 = i12;
                i12 = i15;
            } else {
                i11 = i13 - 1;
                i10 = i11;
            }
        }
        return this.f20196f[i11];
    }

    public final boolean f() {
        return j() && this.f20191a != 0;
    }

    public final void g(int i10, float f10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Context context = this.j;
        float fApplyDimension = TypedValue.applyDimension(i10, f10, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        TextView textView = this.f20199i;
        if (fApplyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(fApplyDimension);
            boolean zIsInLayout = textView.isInLayout();
            if (textView.getLayout() != null) {
                this.f20192b = false;
                try {
                    Method methodD = d("nullLayouts");
                    if (methodD != null) {
                        methodD.invoke(textView, null);
                    }
                } catch (Exception e4) {
                    io.sentry.android.core.e0.q("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e4);
                }
                if (zIsInLayout) {
                    textView.forceLayout();
                } else {
                    textView.requestLayout();
                }
                textView.invalidate();
            }
        }
    }

    public final boolean h() {
        if (j() && this.f20191a == 1) {
            if (!this.f20197g || this.f20196f.length == 0) {
                int iFloor = ((int) Math.floor((this.f20195e - this.f20194d) / this.f20193c)) + 1;
                int[] iArr = new int[iFloor];
                for (int i10 = 0; i10 < iFloor; i10++) {
                    iArr[i10] = Math.round((i10 * this.f20193c) + this.f20194d);
                }
                this.f20196f = b(iArr);
            }
            this.f20192b = true;
        } else {
            this.f20192b = false;
        }
        return this.f20192b;
    }

    public final boolean i() {
        boolean z10 = this.f20196f.length > 0;
        this.f20197g = z10;
        if (z10) {
            this.f20191a = 1;
            this.f20194d = r0[0];
            this.f20195e = r0[r1 - 1];
            this.f20193c = -1.0f;
        }
        return z10;
    }

    public final boolean j() {
        return !(this.f20199i instanceof r);
    }

    public final void k(float f10, float f11, float f12) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f10 + "px) is less or equal to (0px)");
        }
        if (f11 <= f10) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f11 + "px) is less or equal to minimum auto-size text size (" + f10 + "px)");
        }
        if (f12 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f12 + "px) is less or equal to (0px)");
        }
        this.f20191a = 1;
        this.f20194d = f10;
        this.f20195e = f11;
        this.f20193c = f12;
        this.f20197g = false;
    }
}
