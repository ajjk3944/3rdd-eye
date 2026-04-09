package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.EditText;
import android.widget.TextView;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public final class ge {

    /* renamed from: j, reason: collision with root package name */
    private static final RectF f27624j = new RectF();

    /* renamed from: k, reason: collision with root package name */
    @SuppressLint({"BanConcurrentHashMap"})
    private static ConcurrentHashMap<String, Method> f27625k = new ConcurrentHashMap<>();

    /* renamed from: l, reason: collision with root package name */
    @SuppressLint({"BanConcurrentHashMap"})
    private static ConcurrentHashMap<String, Field> f27626l = new ConcurrentHashMap<>();

    /* renamed from: a, reason: collision with root package name */
    private int f27627a = 0;

    /* renamed from: b, reason: collision with root package name */
    private boolean f27628b = false;

    /* renamed from: c, reason: collision with root package name */
    private float f27629c = -1.0f;

    /* renamed from: d, reason: collision with root package name */
    private float f27630d = -1.0f;

    /* renamed from: e, reason: collision with root package name */
    private int[] f27631e = new int[0];

    /* renamed from: f, reason: collision with root package name */
    private TextPaint f27632f;

    /* renamed from: g, reason: collision with root package name */
    private final TextView f27633g;

    /* renamed from: h, reason: collision with root package name */
    private final Context f27634h;
    private final c i;

    public static class a extends c {
        @Override // com.yandex.mobile.ads.impl.ge.c
        public void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) ge.a((Object) textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    public static class b extends a {
        @Override // com.yandex.mobile.ads.impl.ge.a, com.yandex.mobile.ads.impl.ge.c
        public final void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }

        @Override // com.yandex.mobile.ads.impl.ge.c
        public final boolean a(TextView textView) {
            return textView.isHorizontallyScrollable();
        }
    }

    public static class c {
        public void a(StaticLayout.Builder builder, TextView textView) {
        }

        public boolean a(TextView textView) {
            return ((Boolean) ge.a((Object) textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    public ge(TextView textView) {
        this.f27633g = textView;
        this.f27634h = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.i = new b();
        } else {
            this.i = new a();
        }
    }

    private static Object a(TextView textView, String str, Object obj) throws SecurityException {
        try {
            Field fieldA = a(str);
            return fieldA == null ? obj : fieldA.get(textView);
        } catch (IllegalAccessException e4) {
            Log.w("ACTVAutoSizeHelper", "Failed to access TextView#" + str + " member", e4);
            return obj;
        }
    }

    public final boolean b() {
        return ((this.f27633g instanceof EditText) || this.f27627a == 0) ? false : true;
    }

    private static Method b(String str) throws SecurityException {
        try {
            ConcurrentHashMap<String, Method> concurrentHashMap = f27625k;
            Method declaredMethod = concurrentHashMap.get(str);
            if (declaredMethod != null || (declaredMethod = TextView.class.getDeclaredMethod(str, new Class[0])) == null) {
                return declaredMethod;
            }
            declaredMethod.setAccessible(true);
            concurrentHashMap.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e4) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e4);
            return null;
        }
    }

    public final void a() {
        if (b()) {
            if (this.f27628b) {
                if (this.f27633g.getMeasuredHeight() <= 0 || this.f27633g.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.i.a(this.f27633g) ? 1048576 : (this.f27633g.getMeasuredWidth() - this.f27633g.getTotalPaddingLeft()) - this.f27633g.getTotalPaddingRight();
                int height = (this.f27633g.getHeight() - this.f27633g.getCompoundPaddingBottom()) - this.f27633g.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f27624j;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float fA = a(rectF);
                        if (fA != this.f27633g.getTextSize()) {
                            a(0, fA);
                        }
                    } finally {
                    }
                }
            }
            this.f27628b = true;
        }
    }

    private int a(RectF rectF) {
        CharSequence transformation;
        int length = this.f27631e.length;
        if (length != 0) {
            int i = length - 1;
            int i10 = 1;
            int i11 = 0;
            while (i10 <= i) {
                int i12 = (i10 + i) / 2;
                int i13 = this.f27631e[i12];
                CharSequence text = this.f27633g.getText();
                TransformationMethod transformationMethod = this.f27633g.getTransformationMethod();
                if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.f27633g)) != null) {
                    text = transformation;
                }
                int maxLines = this.f27633g.getMaxLines();
                TextPaint textPaint = this.f27632f;
                if (textPaint == null) {
                    this.f27632f = new TextPaint();
                } else {
                    textPaint.reset();
                }
                this.f27632f.set(this.f27633g.getPaint());
                this.f27632f.setTextSize(i13);
                Layout.Alignment alignment = (Layout.Alignment) a((Object) this.f27633g, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL);
                StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(text, 0, text.length(), this.f27632f, Math.round(rectF.right));
                builderObtain.setAlignment(alignment).setLineSpacing(this.f27633g.getLineSpacingExtra(), this.f27633g.getLineSpacingMultiplier()).setIncludePad(this.f27633g.getIncludeFontPadding()).setBreakStrategy(this.f27633g.getBreakStrategy()).setHyphenationFrequency(this.f27633g.getHyphenationFrequency()).setMaxLines(maxLines == -1 ? Integer.MAX_VALUE : maxLines);
                try {
                    this.i.a(builderObtain, this.f27633g);
                } catch (ClassCastException unused) {
                    Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
                }
                StaticLayout staticLayoutBuild = builderObtain.build();
                if ((maxLines == -1 || (staticLayoutBuild.getLineCount() <= maxLines && staticLayoutBuild.getLineEnd(staticLayoutBuild.getLineCount() - 1) == text.length())) && staticLayoutBuild.getHeight() <= rectF.bottom) {
                    int i14 = i12 + 1;
                    i11 = i10;
                    i10 = i14;
                } else {
                    i11 = i12 - 1;
                    i = i11;
                }
            }
            return this.f27631e[i11];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    public static <T> T a(Object obj, String str, T t10) {
        try {
            return (T) b(str).invoke(obj, new Object[0]);
        } catch (Exception e4) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e4);
            return t10;
        }
    }

    public final void a(int i) {
        if (this.f27633g instanceof EditText) {
            return;
        }
        if (i == 0) {
            this.f27627a = 0;
            this.f27630d = -1.0f;
            this.f27629c = -1.0f;
            this.f27631e = new int[0];
            this.f27628b = false;
            return;
        }
        if (i == 1) {
            DisplayMetrics displayMetrics = this.f27634h.getResources().getDisplayMetrics();
            float fApplyDimension = TypedValue.applyDimension(2, 12.0f, displayMetrics);
            float fApplyDimension2 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
            if (fApplyDimension <= 0.0f) {
                throw new IllegalArgumentException("Minimum auto-size text size (" + fApplyDimension + "px) is less or equal to (0px)");
            }
            if (fApplyDimension2 > fApplyDimension) {
                this.f27627a = 1;
                this.f27630d = fApplyDimension;
                this.f27629c = 1.0f;
                if (!(this.f27633g instanceof EditText)) {
                    int iFloor = ((int) Math.floor((fApplyDimension2 - fApplyDimension) / 1.0f)) + 1;
                    int[] iArr = new int[iFloor];
                    for (int i10 = 0; i10 < iFloor; i10++) {
                        iArr[i10] = Math.round((i10 * this.f27629c) + this.f27630d);
                    }
                    if (iFloor != 0) {
                        Arrays.sort(iArr);
                        ArrayList arrayList = new ArrayList();
                        for (int i11 = 0; i11 < iFloor; i11++) {
                            int i12 = iArr[i11];
                            if (i12 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i12)) < 0) {
                                arrayList.add(Integer.valueOf(i12));
                            }
                        }
                        if (iFloor != arrayList.size()) {
                            int size = arrayList.size();
                            iArr = new int[size];
                            for (int i13 = 0; i13 < size; i13++) {
                                iArr[i13] = ((Integer) arrayList.get(i13)).intValue();
                            }
                        }
                    }
                    this.f27631e = iArr;
                    this.f27628b = true;
                } else {
                    this.f27628b = false;
                }
                if (this.f27628b) {
                    a();
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Maximum auto-size text size (" + fApplyDimension2 + "px) is less or equal to minimum auto-size text size (" + fApplyDimension + "px)");
        }
        throw new IllegalArgumentException(fe.a("Unknown auto-size text type: ", i));
    }

    public final void a(int i, float f10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Resources resources;
        Context context = this.f27634h;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        float fApplyDimension = TypedValue.applyDimension(i, f10, resources.getDisplayMetrics());
        if (fApplyDimension != this.f27633g.getPaint().getTextSize()) {
            this.f27633g.getPaint().setTextSize(fApplyDimension);
            boolean zIsInLayout = this.f27633g.isInLayout();
            if (this.f27633g.getLayout() != null) {
                this.f27628b = false;
                try {
                    Method methodB = b("nullLayouts");
                    if (methodB != null) {
                        methodB.invoke(this.f27633g, new Object[0]);
                    }
                } catch (Exception e4) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e4);
                }
                if (!zIsInLayout) {
                    this.f27633g.requestLayout();
                } else {
                    this.f27633g.forceLayout();
                }
                this.f27633g.invalidate();
            }
        }
    }

    private static Field a(String str) throws SecurityException {
        try {
            ConcurrentHashMap<String, Field> concurrentHashMap = f27626l;
            Field declaredField = concurrentHashMap.get(str);
            if (declaredField != null || (declaredField = TextView.class.getDeclaredField(str)) == null) {
                return declaredField;
            }
            declaredField.setAccessible(true);
            concurrentHashMap.put(str, declaredField);
            return declaredField;
        } catch (NoSuchFieldException e4) {
            Log.w("ACTVAutoSizeHelper", "Failed to access TextView#" + str + " member", e4);
            return null;
        }
    }
}
