package L1;

import C0.g;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.InflateException;
import android.view.animation.AnimationUtils;
import io.appmetrica.analytics.impl.Oo;
import java.util.ArrayList;

/* compiled from: AnimatorInflaterCompat.java */
/* loaded from: classes.dex */
public final class f {

    /* compiled from: AnimatorInflaterCompat.java */
    public static class a implements TypeEvaluator<g.a[]> {

        /* renamed from: a, reason: collision with root package name */
        public g.a[] f3966a;

        @Override // android.animation.TypeEvaluator
        public final g.a[] evaluate(float f10, g.a[] aVarArr, g.a[] aVarArr2) {
            g.a[] aVarArr3 = aVarArr;
            g.a[] aVarArr4 = aVarArr2;
            if (!C0.g.a(aVarArr3, aVarArr4)) {
                throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
            }
            if (!C0.g.a(this.f3966a, aVarArr3)) {
                this.f3966a = C0.g.e(aVarArr3);
            }
            for (int i = 0; i < aVarArr3.length; i++) {
                g.a aVar = this.f3966a[i];
                g.a aVar2 = aVarArr3[i];
                g.a aVar3 = aVarArr4[i];
                aVar.getClass();
                aVar.f806a = aVar2.f806a;
                int i10 = 0;
                while (true) {
                    float[] fArr = aVar2.f807b;
                    if (i10 < fArr.length) {
                        aVar.f807b[i10] = (aVar3.f807b[i10] * f10) + ((1.0f - f10) * fArr[i10]);
                        i10++;
                    }
                }
            }
            return this.f3966a;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:209:0x03b0, code lost:
    
        if (r32 == null) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x03b2, code lost:
    
        if (r22 == null) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x03b4, code lost:
    
        r2 = new android.animation.Animator[r22.size()];
        r3 = r22.iterator();
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x03c3, code lost:
    
        if (r3.hasNext() == false) goto L227;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x03c5, code lost:
    
        r2[r11] = (android.animation.Animator) r3.next();
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x03d1, code lost:
    
        if (r33 != 0) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x03d3, code lost:
    
        r32.playTogether(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x03d6, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x03d7, code lost:
    
        r32.playSequentially(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x03da, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        r22 = r10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0382 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0392  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.animation.Animator a(android.content.Context r27, android.content.res.Resources r28, android.content.res.Resources.Theme r29, android.content.res.XmlResourceParser r30, android.util.AttributeSet r31, android.animation.AnimatorSet r32, int r33) throws org.xmlpull.v1.XmlPullParserException, android.content.res.Resources.NotFoundException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 987
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: L1.f.a(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, android.content.res.XmlResourceParser, android.util.AttributeSet, android.animation.AnimatorSet, int):android.animation.Animator");
    }

    public static PropertyValuesHolder b(TypedArray typedArray, int i, int i10, int i11, String str) {
        PropertyValuesHolder propertyValuesHolderOfFloat;
        TypedValue typedValuePeekValue = typedArray.peekValue(i10);
        boolean z10 = typedValuePeekValue != null;
        int i12 = z10 ? typedValuePeekValue.type : 0;
        TypedValue typedValuePeekValue2 = typedArray.peekValue(i11);
        boolean z11 = typedValuePeekValue2 != null;
        int i13 = z11 ? typedValuePeekValue2.type : 0;
        if (i == 4) {
            i = ((z10 && c(i12)) || (z11 && c(i13))) ? 3 : 0;
        }
        boolean z12 = i == 0;
        PropertyValuesHolder propertyValuesHolderOfInt = null;
        if (i == 2) {
            String string = typedArray.getString(i10);
            String string2 = typedArray.getString(i11);
            g.a[] aVarArrC = C0.g.c(string);
            g.a[] aVarArrC2 = C0.g.c(string2);
            if (aVarArrC != null || aVarArrC2 != null) {
                if (aVarArrC != null) {
                    a aVar = new a();
                    if (aVarArrC2 == null) {
                        return PropertyValuesHolder.ofObject(str, aVar, aVarArrC);
                    }
                    if (C0.g.a(aVarArrC, aVarArrC2)) {
                        return PropertyValuesHolder.ofObject(str, aVar, aVarArrC, aVarArrC2);
                    }
                    throw new InflateException(Oo.f(" Can't morph from ", string, " to ", string2));
                }
                if (aVarArrC2 != null) {
                    return PropertyValuesHolder.ofObject(str, new a(), aVarArrC2);
                }
            }
            return null;
        }
        g gVar = i == 3 ? g.f3967a : null;
        if (z12) {
            if (z10) {
                float dimension = i12 == 5 ? typedArray.getDimension(i10, 0.0f) : typedArray.getFloat(i10, 0.0f);
                if (z11) {
                    propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, dimension, i13 == 5 ? typedArray.getDimension(i11, 0.0f) : typedArray.getFloat(i11, 0.0f));
                } else {
                    propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, dimension);
                }
            } else {
                propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, i13 == 5 ? typedArray.getDimension(i11, 0.0f) : typedArray.getFloat(i11, 0.0f));
            }
            propertyValuesHolderOfInt = propertyValuesHolderOfFloat;
        } else if (z10) {
            int dimension2 = i12 == 5 ? (int) typedArray.getDimension(i10, 0.0f) : c(i12) ? typedArray.getColor(i10, 0) : typedArray.getInt(i10, 0);
            if (z11) {
                propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, dimension2, i13 == 5 ? (int) typedArray.getDimension(i11, 0.0f) : c(i13) ? typedArray.getColor(i11, 0) : typedArray.getInt(i11, 0));
            } else {
                propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, dimension2);
            }
        } else if (z11) {
            propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, i13 == 5 ? (int) typedArray.getDimension(i11, 0.0f) : c(i13) ? typedArray.getColor(i11, 0) : typedArray.getInt(i11, 0));
        }
        if (propertyValuesHolderOfInt != null && gVar != null) {
            propertyValuesHolderOfInt.setEvaluator(gVar);
        }
        return propertyValuesHolderOfInt;
    }

    public static boolean c(int i) {
        return i >= 28 && i <= 31;
    }

    public static ValueAnimator d(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ObjectAnimator objectAnimator, XmlResourceParser xmlResourceParser) throws Resources.NotFoundException {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        int resourceId = 0;
        TypedArray typedArrayE = B0.i.e(resources, theme, attributeSet, L1.a.f3946g);
        TypedArray typedArrayE2 = B0.i.e(resources, theme, attributeSet, L1.a.f3949k);
        ValueAnimator valueAnimator3 = objectAnimator == null ? new ValueAnimator() : objectAnimator;
        long j4 = B0.i.d(xmlResourceParser, "duration") ? typedArrayE.getInt(1, 300) : 300;
        long j10 = !(xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "startOffset") != null) ? 0 : typedArrayE.getInt(2, 0);
        int i = !(xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "valueType") != null) ? 4 : typedArrayE.getInt(7, 4);
        if (xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "valueFrom") != null && xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "valueTo") != null) {
            if (i == 4) {
                TypedValue typedValuePeekValue = typedArrayE.peekValue(5);
                boolean z10 = typedValuePeekValue != null;
                int i10 = z10 ? typedValuePeekValue.type : 0;
                TypedValue typedValuePeekValue2 = typedArrayE.peekValue(6);
                boolean z11 = typedValuePeekValue2 != null;
                i = ((z10 && c(i10)) || (z11 && c(z11 ? typedValuePeekValue2.type : 0))) ? 3 : 0;
            }
            PropertyValuesHolder propertyValuesHolderB = b(typedArrayE, i, 5, 6, "");
            if (propertyValuesHolderB != null) {
                valueAnimator3.setValues(propertyValuesHolderB);
            }
        }
        valueAnimator3.setDuration(j4);
        valueAnimator3.setStartDelay(j10);
        valueAnimator3.setRepeatCount(xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "repeatCount") != null ? typedArrayE.getInt(3, 0) : 0);
        valueAnimator3.setRepeatMode(xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "repeatMode") != null ? typedArrayE.getInt(4, 1) : 1);
        if (typedArrayE2 != null) {
            ObjectAnimator objectAnimator2 = (ObjectAnimator) valueAnimator3;
            String strC = B0.i.c(typedArrayE2, xmlResourceParser, "pathData", 1);
            if (strC != null) {
                String strC2 = B0.i.c(typedArrayE2, xmlResourceParser, "propertyXName", 2);
                String strC3 = B0.i.c(typedArrayE2, xmlResourceParser, "propertyYName", 3);
                if (i != 2) {
                }
                if (strC2 == null && strC3 == null) {
                    throw new InflateException(typedArrayE2.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
                }
                Path pathD = C0.g.d(strC);
                PathMeasure pathMeasure = new PathMeasure(pathD, false);
                ArrayList arrayList = new ArrayList();
                arrayList.add(Float.valueOf(0.0f));
                float length = 0.0f;
                do {
                    length += pathMeasure.getLength();
                    arrayList.add(Float.valueOf(length));
                } while (pathMeasure.nextContour());
                PathMeasure pathMeasure2 = new PathMeasure(pathD, false);
                int iMin = Math.min(100, ((int) (length / 0.5f)) + 1);
                float[] fArr = new float[iMin];
                float[] fArr2 = new float[iMin];
                float[] fArr3 = new float[2];
                float f10 = length / (iMin - 1);
                valueAnimator = valueAnimator3;
                int i11 = 0;
                int i12 = 0;
                float f11 = 0.0f;
                while (true) {
                    if (i11 >= iMin) {
                        break;
                    }
                    int i13 = i11;
                    pathMeasure2.getPosTan(f11 - ((Float) arrayList.get(i12)).floatValue(), fArr3, null);
                    fArr[i13] = fArr3[0];
                    fArr2[i13] = fArr3[1];
                    int i14 = i12 + 1;
                    f11 += f10;
                    if (i14 < arrayList.size() && f11 > ((Float) arrayList.get(i14)).floatValue()) {
                        pathMeasure2.nextContour();
                        i12 = i14;
                    }
                    i11 = i13 + 1;
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
                resourceId = 0;
            } else {
                valueAnimator = valueAnimator3;
                objectAnimator2.setPropertyName(B0.i.c(typedArrayE2, xmlResourceParser, "propertyName", 0));
            }
        } else {
            valueAnimator = valueAnimator3;
        }
        if (xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "interpolator") != null) {
            resourceId = typedArrayE.getResourceId(resourceId, resourceId);
        }
        if (resourceId > 0) {
            valueAnimator2 = valueAnimator;
            valueAnimator2.setInterpolator(AnimationUtils.loadInterpolator(context, resourceId));
        } else {
            valueAnimator2 = valueAnimator;
        }
        typedArrayE.recycle();
        if (typedArrayE2 != null) {
            typedArrayE2.recycle();
        }
        return valueAnimator2;
    }
}
