package o;

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
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: o.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2706c0 {

    /* renamed from: l, reason: collision with root package name */
    public static final RectF f22487l = new RectF();

    /* renamed from: m, reason: collision with root package name */
    public static final ConcurrentHashMap f22488m = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public int f22489a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f22490b = false;

    /* renamed from: c, reason: collision with root package name */
    public float f22491c = -1.0f;

    /* renamed from: d, reason: collision with root package name */
    public float f22492d = -1.0f;

    /* renamed from: e, reason: collision with root package name */
    public float f22493e = -1.0f;

    /* renamed from: f, reason: collision with root package name */
    public int[] f22494f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    public boolean f22495g = false;

    /* renamed from: h, reason: collision with root package name */
    public TextPaint f22496h;
    public final TextView i;

    /* renamed from: j, reason: collision with root package name */
    public final Context f22497j;

    /* renamed from: k, reason: collision with root package name */
    public final Z f22498k;

    public C2706c0(TextView textView) {
        this.i = textView;
        this.f22497j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f22498k = new C2702a0();
        } else {
            this.f22498k = new Z();
        }
    }

    public static int[] b(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i : iArr) {
                if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i3 = 0; i3 < size; i3++) {
                    iArr2[i3] = ((Integer) arrayList.get(i3)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    public static Method d(String str) throws SecurityException {
        try {
            ConcurrentHashMap concurrentHashMap = f22488m;
            Method declaredMethod = (Method) concurrentHashMap.get(str);
            if (declaredMethod != null || (declaredMethod = TextView.class.getDeclaredMethod(str, null)) == null) {
                return declaredMethod;
            }
            declaredMethod.setAccessible(true);
            concurrentHashMap.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e6) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e6);
            return null;
        }
    }

    public static Object e(Object obj, String str, Object obj2) {
        try {
            return d(str).invoke(obj, null);
        } catch (Exception e6) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e6);
            return obj2;
        }
    }

    public final void a() {
        if (f()) {
            if (this.f22490b) {
                if (this.i.getMeasuredHeight() <= 0 || this.i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f22498k.b(this.i) ? 1048576 : (this.i.getMeasuredWidth() - this.i.getTotalPaddingLeft()) - this.i.getTotalPaddingRight();
                int height = (this.i.getHeight() - this.i.getCompoundPaddingBottom()) - this.i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f22487l;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float fC = c(rectF);
                        if (fC != this.i.getTextSize()) {
                            g(0, fC);
                        }
                    } finally {
                    }
                }
            }
            this.f22490b = true;
        }
    }

    public final int c(RectF rectF) {
        CharSequence transformation;
        int length = this.f22494f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i = length - 1;
        int i3 = 0;
        int i6 = 1;
        while (i6 <= i) {
            int i7 = (i6 + i) / 2;
            int i8 = this.f22494f[i7];
            TextView textView = this.i;
            CharSequence text = textView.getText();
            TransformationMethod transformationMethod = textView.getTransformationMethod();
            CharSequence charSequence = (transformationMethod == null || (transformation = transformationMethod.getTransformation(text, textView)) == null) ? text : transformation;
            int maxLines = textView.getMaxLines();
            TextPaint textPaint = this.f22496h;
            if (textPaint == null) {
                this.f22496h = new TextPaint();
            } else {
                textPaint.reset();
            }
            this.f22496h.set(textView.getPaint());
            this.f22496h.setTextSize(i8);
            StaticLayout staticLayoutA = Y.a(charSequence, (Layout.Alignment) e(textView, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines, this.i, this.f22496h, this.f22498k);
            if ((maxLines == -1 || (staticLayoutA.getLineCount() <= maxLines && staticLayoutA.getLineEnd(staticLayoutA.getLineCount() - 1) == charSequence.length())) && staticLayoutA.getHeight() <= rectF.bottom) {
                int i9 = i7 + 1;
                i3 = i6;
                i6 = i9;
            } else {
                i3 = i7 - 1;
                i = i3;
            }
        }
        return this.f22494f[i3];
    }

    public final boolean f() {
        return j() && this.f22489a != 0;
    }

    public final void g(int i, float f2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Context context = this.f22497j;
        float fApplyDimension = TypedValue.applyDimension(i, f2, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        TextView textView = this.i;
        if (fApplyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(fApplyDimension);
            boolean zIsInLayout = textView.isInLayout();
            if (textView.getLayout() != null) {
                this.f22490b = false;
                try {
                    Method methodD = d("nullLayouts");
                    if (methodD != null) {
                        methodD.invoke(textView, null);
                    }
                } catch (Exception e6) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e6);
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
        if (j() && this.f22489a == 1) {
            if (!this.f22495g || this.f22494f.length == 0) {
                int iFloor = ((int) Math.floor((this.f22493e - this.f22492d) / this.f22491c)) + 1;
                int[] iArr = new int[iFloor];
                for (int i = 0; i < iFloor; i++) {
                    iArr[i] = Math.round((i * this.f22491c) + this.f22492d);
                }
                this.f22494f = b(iArr);
            }
            this.f22490b = true;
        } else {
            this.f22490b = false;
        }
        return this.f22490b;
    }

    public final boolean i() {
        boolean z6 = this.f22494f.length > 0;
        this.f22495g = z6;
        if (z6) {
            this.f22489a = 1;
            this.f22492d = r0[0];
            this.f22493e = r0[r1 - 1];
            this.f22491c = -1.0f;
        }
        return z6;
    }

    public final boolean j() {
        return !(this.i instanceof C2738t);
    }

    public final void k(float f2, float f5, float f6) {
        if (f2 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f2 + "px) is less or equal to (0px)");
        }
        if (f5 <= f2) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f5 + "px) is less or equal to minimum auto-size text size (" + f2 + "px)");
        }
        if (f6 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f6 + "px) is less or equal to (0px)");
        }
        this.f22489a = 1;
        this.f22492d = f2;
        this.f22493e = f5;
        this.f22491c = f6;
        this.f22495g = false;
    }
}
