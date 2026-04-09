package p;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class b1 {

    /* renamed from: l, reason: collision with root package name */
    public static final RectF f30620l = new RectF();

    /* renamed from: m, reason: collision with root package name */
    public static final ConcurrentHashMap f30621m = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public int f30622a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f30623b = false;

    /* renamed from: c, reason: collision with root package name */
    public float f30624c = -1.0f;

    /* renamed from: d, reason: collision with root package name */
    public float f30625d = -1.0f;

    /* renamed from: e, reason: collision with root package name */
    public float f30626e = -1.0f;

    /* renamed from: f, reason: collision with root package name */
    public int[] f30627f = new int[0];
    public boolean g = false;

    /* renamed from: h, reason: collision with root package name */
    public TextPaint f30628h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f30629i;
    public final Context j;

    /* renamed from: k, reason: collision with root package name */
    public final y0 f30630k;

    public b1(TextView textView) {
        this.f30629i = textView;
        this.j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f30630k = new z0();
        } else {
            this.f30630k = new y0();
        }
    }

    public static int[] b(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i4 : iArr) {
                if (i4 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i4)) < 0) {
                    arrayList.add(Integer.valueOf(i4));
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i10 = 0; i10 < size; i10++) {
                    iArr2[i10] = ((Integer) arrayList.get(i10)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    public static Method d(String str) throws SecurityException {
        try {
            ConcurrentHashMap concurrentHashMap = f30621m;
            Method declaredMethod = (Method) concurrentHashMap.get(str);
            if (declaredMethod != null || (declaredMethod = TextView.class.getDeclaredMethod(str, null)) == null) {
                return declaredMethod;
            }
            declaredMethod.setAccessible(true);
            concurrentHashMap.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e2);
            return null;
        }
    }

    public static Object e(Object obj, Object obj2, String str) {
        try {
            return d(str).invoke(obj, null);
        } catch (Exception e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e2);
            return obj2;
        }
    }

    public final void a() {
        if (f()) {
            if (this.f30623b) {
                if (this.f30629i.getMeasuredHeight() <= 0 || this.f30629i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f30630k.b(this.f30629i) ? 1048576 : (this.f30629i.getMeasuredWidth() - this.f30629i.getTotalPaddingLeft()) - this.f30629i.getTotalPaddingRight();
                int height = (this.f30629i.getHeight() - this.f30629i.getCompoundPaddingBottom()) - this.f30629i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f30620l;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float fC = c(rectF);
                        if (fC != this.f30629i.getTextSize()) {
                            g(0, fC);
                        }
                    } finally {
                    }
                }
            }
            this.f30623b = true;
        }
    }

    public final int c(RectF rectF) {
        CharSequence transformation;
        int length = this.f30627f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i4 = length - 1;
        int i10 = 0;
        int i11 = 1;
        while (i11 <= i4) {
            int i12 = (i11 + i4) / 2;
            int i13 = this.f30627f[i12];
            TextView textView = this.f30629i;
            CharSequence text = textView.getText();
            TransformationMethod transformationMethod = textView.getTransformationMethod();
            CharSequence charSequence = (transformationMethod == null || (transformation = transformationMethod.getTransformation(text, textView)) == null) ? text : transformation;
            int maxLines = textView.getMaxLines();
            TextPaint textPaint = this.f30628h;
            if (textPaint == null) {
                this.f30628h = new TextPaint();
            } else {
                textPaint.reset();
            }
            this.f30628h.set(textView.getPaint());
            this.f30628h.setTextSize(i13);
            StaticLayout staticLayoutA = x0.a(charSequence, (Layout.Alignment) e(textView, Layout.Alignment.ALIGN_NORMAL, "getLayoutAlignment"), Math.round(rectF.right), maxLines, this.f30629i, this.f30628h, this.f30630k);
            if ((maxLines == -1 || (staticLayoutA.getLineCount() <= maxLines && staticLayoutA.getLineEnd(staticLayoutA.getLineCount() - 1) == charSequence.length())) && staticLayoutA.getHeight() <= rectF.bottom) {
                int i14 = i12 + 1;
                i10 = i11;
                i11 = i14;
            } else {
                i10 = i12 - 1;
                i4 = i10;
            }
        }
        return this.f30627f[i10];
    }

    public final boolean f() {
        return j() && this.f30622a != 0;
    }

    public final void g(int i4, float f10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Context context = this.j;
        float fApplyDimension = TypedValue.applyDimension(i4, f10, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        TextView textView = this.f30629i;
        if (fApplyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(fApplyDimension);
            boolean zIsInLayout = textView.isInLayout();
            if (textView.getLayout() != null) {
                this.f30623b = false;
                try {
                    Method methodD = d("nullLayouts");
                    if (methodD != null) {
                        methodD.invoke(textView, null);
                    }
                } catch (Exception e2) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e2);
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
        if (j() && this.f30622a == 1) {
            if (!this.g || this.f30627f.length == 0) {
                int iFloor = ((int) Math.floor((this.f30626e - this.f30625d) / this.f30624c)) + 1;
                int[] iArr = new int[iFloor];
                for (int i4 = 0; i4 < iFloor; i4++) {
                    iArr[i4] = Math.round((i4 * this.f30624c) + this.f30625d);
                }
                this.f30627f = b(iArr);
            }
            this.f30623b = true;
        } else {
            this.f30623b = false;
        }
        return this.f30623b;
    }

    public final boolean i() {
        boolean z3 = this.f30627f.length > 0;
        this.g = z3;
        if (z3) {
            this.f30622a = 1;
            this.f30625d = r0[0];
            this.f30626e = r0[r1 - 1];
            this.f30624c = -1.0f;
        }
        return z3;
    }

    public final boolean j() {
        return !(this.f30629i instanceof AppCompatEditText);
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
        this.f30622a = 1;
        this.f30625d = f10;
        this.f30626e = f11;
        this.f30624c = f12;
        this.g = false;
    }
}
