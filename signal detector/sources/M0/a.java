package M0;

import android.R;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.InflateException;
import android.view.animation.AnimationUtils;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f2616a = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f2617b = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f2618c = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f2619d = {R.attr.name, R.attr.pathData, R.attr.fillType};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f2620e = {R.attr.drawable};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f2621f = {R.attr.name, R.attr.animation};

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f2622g = {R.attr.interpolator, R.attr.duration, R.attr.startOffset, R.attr.repeatCount, R.attr.repeatMode, R.attr.valueFrom, R.attr.valueTo, R.attr.valueType};

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f2623h = {R.attr.ordering};
    public static final int[] i = {R.attr.valueFrom, R.attr.valueTo, R.attr.valueType, R.attr.propertyName};

    /* renamed from: j, reason: collision with root package name */
    public static final int[] f2624j = {R.attr.value, R.attr.interpolator, R.attr.valueType, R.attr.fraction};

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f2625k = {R.attr.propertyName, R.attr.pathData, R.attr.propertyXName, R.attr.propertyYName};

    /* JADX WARN: Code restructure failed: missing block: B:203:0x039f, code lost:
    
        if (r32 == null) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x03a1, code lost:
    
        if (r10 == null) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x03a3, code lost:
    
        r2 = new android.animation.Animator[r10.size()];
        r3 = r10.size();
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x03ae, code lost:
    
        if (r1 >= r3) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x03b0, code lost:
    
        r4 = r10.get(r1);
        r1 = r1 + 1;
        r2[r11] = (android.animation.Animator) r4;
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x03be, code lost:
    
        if (r33 != 0) goto L211;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x03c0, code lost:
    
        r32.playTogether(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x03c3, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x03c4, code lost:
    
        r32.playSequentially(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x03c7, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0377 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x037b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.animation.Animator a(android.content.Context r27, android.content.res.Resources r28, android.content.res.Resources.Theme r29, org.xmlpull.v1.XmlPullParser r30, android.util.AttributeSet r31, android.animation.AnimatorSet r32, int r33) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 968
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: M0.a.a(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.animation.AnimatorSet, int):android.animation.Animator");
    }

    public static PropertyValuesHolder b(TypedArray typedArray, int i3, int i6, int i7, String str) {
        PropertyValuesHolder propertyValuesHolderOfFloat;
        TypedValue typedValuePeekValue = typedArray.peekValue(i6);
        boolean z6 = typedValuePeekValue != null;
        int i8 = z6 ? typedValuePeekValue.type : 0;
        TypedValue typedValuePeekValue2 = typedArray.peekValue(i7);
        boolean z7 = typedValuePeekValue2 != null;
        int i9 = z7 ? typedValuePeekValue2.type : 0;
        if (i3 == 4) {
            i3 = ((z6 && c(i8)) || (z7 && c(i9))) ? 3 : 0;
        }
        boolean z8 = i3 == 0;
        PropertyValuesHolder propertyValuesHolderOfInt = null;
        if (i3 == 2) {
            String string = typedArray.getString(i6);
            String string2 = typedArray.getString(i7);
            J.e[] eVarArrN = com.bumptech.glide.d.n(string);
            J.e[] eVarArrN2 = com.bumptech.glide.d.n(string2);
            if (eVarArrN != null || eVarArrN2 != null) {
                if (eVarArrN != null) {
                    g gVar = new g(0);
                    if (eVarArrN2 == null) {
                        return PropertyValuesHolder.ofObject(str, gVar, eVarArrN);
                    }
                    if (com.bumptech.glide.d.h(eVarArrN, eVarArrN2)) {
                        return PropertyValuesHolder.ofObject(str, gVar, eVarArrN, eVarArrN2);
                    }
                    throw new InflateException(" Can't morph from " + string + " to " + string2);
                }
                if (eVarArrN2 != null) {
                    return PropertyValuesHolder.ofObject(str, new g(0), eVarArrN2);
                }
            }
            return null;
        }
        h hVar = i3 == 3 ? h.f2643a : null;
        if (z8) {
            if (z6) {
                float dimension = i8 == 5 ? typedArray.getDimension(i6, 0.0f) : typedArray.getFloat(i6, 0.0f);
                if (z7) {
                    propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, dimension, i9 == 5 ? typedArray.getDimension(i7, 0.0f) : typedArray.getFloat(i7, 0.0f));
                } else {
                    propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, dimension);
                }
            } else {
                propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, i9 == 5 ? typedArray.getDimension(i7, 0.0f) : typedArray.getFloat(i7, 0.0f));
            }
            propertyValuesHolderOfInt = propertyValuesHolderOfFloat;
        } else if (z6) {
            int dimension2 = i8 == 5 ? (int) typedArray.getDimension(i6, 0.0f) : c(i8) ? typedArray.getColor(i6, 0) : typedArray.getInt(i6, 0);
            if (z7) {
                propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, dimension2, i9 == 5 ? (int) typedArray.getDimension(i7, 0.0f) : c(i9) ? typedArray.getColor(i7, 0) : typedArray.getInt(i7, 0));
            } else {
                propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, dimension2);
            }
        } else if (z7) {
            propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, i9 == 5 ? (int) typedArray.getDimension(i7, 0.0f) : c(i9) ? typedArray.getColor(i7, 0) : typedArray.getInt(i7, 0));
        }
        if (propertyValuesHolderOfInt != null && hVar != null) {
            propertyValuesHolderOfInt.setEvaluator(hVar);
        }
        return propertyValuesHolderOfInt;
    }

    public static boolean c(int i3) {
        return i3 >= 28 && i3 <= 31;
    }

    public static ValueAnimator d(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ObjectAnimator objectAnimator, XmlPullParser xmlPullParser) {
        ValueAnimator valueAnimator;
        int i3;
        ValueAnimator valueAnimator2;
        TypedArray typedArrayG = I.b.g(resources, theme, attributeSet, f2622g);
        TypedArray typedArrayG2 = I.b.g(resources, theme, attributeSet, f2625k);
        ValueAnimator valueAnimator3 = objectAnimator == null ? new ValueAnimator() : objectAnimator;
        long j6 = I.b.d(xmlPullParser, "duration") ? typedArrayG.getInt(1, 300) : 300;
        long j7 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "startOffset") != null ? typedArrayG.getInt(2, 0) : 0;
        int i6 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "valueType") != null ? typedArrayG.getInt(7, 4) : 4;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "valueFrom") != null && xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "valueTo") != null) {
            if (i6 == 4) {
                TypedValue typedValuePeekValue = typedArrayG.peekValue(5);
                boolean z6 = typedValuePeekValue != null;
                int i7 = z6 ? typedValuePeekValue.type : 0;
                TypedValue typedValuePeekValue2 = typedArrayG.peekValue(6);
                boolean z7 = typedValuePeekValue2 != null;
                i6 = ((z6 && c(i7)) || (z7 && c(z7 ? typedValuePeekValue2.type : 0))) ? 3 : 0;
            }
            PropertyValuesHolder propertyValuesHolderB = b(typedArrayG, i6, 5, 6, "");
            if (propertyValuesHolderB != null) {
                valueAnimator3.setValues(propertyValuesHolderB);
            }
        }
        valueAnimator3.setDuration(j6);
        valueAnimator3.setStartDelay(j7);
        valueAnimator3.setRepeatCount(xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "repeatCount") != null ? typedArrayG.getInt(3, 0) : 0);
        valueAnimator3.setRepeatMode(xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "repeatMode") != null ? typedArrayG.getInt(4, 1) : 1);
        if (typedArrayG2 != null) {
            ObjectAnimator objectAnimator2 = (ObjectAnimator) valueAnimator3;
            String strC = I.b.c(typedArrayG2, xmlPullParser, "pathData", 1);
            if (strC != null) {
                String strC2 = I.b.c(typedArrayG2, xmlPullParser, "propertyXName", 2);
                String strC3 = I.b.c(typedArrayG2, xmlPullParser, "propertyYName", 3);
                if (i6 != 2) {
                }
                if (strC2 == null && strC3 == null) {
                    throw new InflateException(typedArrayG2.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
                }
                Path pathO = com.bumptech.glide.d.o(strC);
                PathMeasure pathMeasure = new PathMeasure(pathO, false);
                ArrayList arrayList = new ArrayList();
                arrayList.add(Float.valueOf(0.0f));
                float length = 0.0f;
                do {
                    length += pathMeasure.getLength();
                    arrayList.add(Float.valueOf(length));
                } while (pathMeasure.nextContour());
                PathMeasure pathMeasure2 = new PathMeasure(pathO, false);
                int iMin = Math.min(100, ((int) (length / 0.5f)) + 1);
                float[] fArr = new float[iMin];
                float[] fArr2 = new float[iMin];
                float[] fArr3 = new float[2];
                float f2 = length / (iMin - 1);
                int i8 = 0;
                valueAnimator = valueAnimator3;
                float f5 = 0.0f;
                int i9 = 0;
                while (true) {
                    if (i8 >= iMin) {
                        break;
                    }
                    int i10 = iMin;
                    pathMeasure2.getPosTan(f5 - ((Float) arrayList.get(i9)).floatValue(), fArr3, null);
                    fArr[i8] = fArr3[0];
                    fArr2[i8] = fArr3[1];
                    int i11 = i9 + 1;
                    f5 += f2;
                    if (i11 < arrayList.size() && f5 > ((Float) arrayList.get(i11)).floatValue()) {
                        pathMeasure2.nextContour();
                        i9 = i11;
                    }
                    i8++;
                    iMin = i10;
                }
                PropertyValuesHolder propertyValuesHolderOfFloat = strC2 != null ? PropertyValuesHolder.ofFloat(strC2, fArr) : null;
                PropertyValuesHolder propertyValuesHolderOfFloat2 = strC3 != null ? PropertyValuesHolder.ofFloat(strC3, fArr2) : null;
                if (propertyValuesHolderOfFloat == null) {
                    objectAnimator2.setValues(propertyValuesHolderOfFloat2);
                } else if (propertyValuesHolderOfFloat2 == null) {
                    objectAnimator2.setValues(propertyValuesHolderOfFloat);
                } else {
                    objectAnimator2.setValues(propertyValuesHolderOfFloat, propertyValuesHolderOfFloat2);
                }
                i3 = 0;
            } else {
                valueAnimator = valueAnimator3;
                i3 = 0;
                objectAnimator2.setPropertyName(I.b.c(typedArrayG2, xmlPullParser, "propertyName", 0));
            }
        } else {
            valueAnimator = valueAnimator3;
            i3 = 0;
        }
        int resourceId = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "interpolator") != null ? typedArrayG.getResourceId(i3, i3) : i3;
        if (resourceId > 0) {
            valueAnimator2 = valueAnimator;
            valueAnimator2.setInterpolator(AnimationUtils.loadInterpolator(context, resourceId));
        } else {
            valueAnimator2 = valueAnimator;
        }
        typedArrayG.recycle();
        if (typedArrayG2 != null) {
            typedArrayG2.recycle();
        }
        return valueAnimator2;
    }
}
