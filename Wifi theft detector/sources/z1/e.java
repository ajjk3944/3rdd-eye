package z1;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.Keyframe;
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
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import i0.i;
import j0.d;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public abstract class e {

    public static class a implements TypeEvaluator {

        /* renamed from: a, reason: collision with root package name */
        public d.b[] f25245a;

        @Override // android.animation.TypeEvaluator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public d.b[] evaluate(float f10, d.b[] bVarArr, d.b[] bVarArr2) {
            if (!j0.d.b(bVarArr, bVarArr2)) {
                throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
            }
            if (!j0.d.b(this.f25245a, bVarArr)) {
                this.f25245a = j0.d.f(bVarArr);
            }
            for (int i10 = 0; i10 < bVarArr.length; i10++) {
                this.f25245a[i10].h(bVarArr[i10], bVarArr2[i10], f10);
            }
            return this.f25245a;
        }
    }

    public static Animator a(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, float f10) {
        return b(context, resources, theme, xmlPullParser, Xml.asAttributeSet(xmlPullParser), null, 0, f10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c6, code lost:
    
        if (r18 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c8, code lost:
    
        if (r10 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ca, code lost:
    
        r13 = new android.animation.Animator[r10.size()];
        r14 = r10.size();
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d5, code lost:
    
        if (r15 >= r14) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d7, code lost:
    
        r0 = r10.get(r15);
        r15 = r15 + 1;
        r13[r11] = (android.animation.Animator) r0;
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e5, code lost:
    
        if (r19 != 0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e7, code lost:
    
        r18.playTogether(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ea, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00eb, code lost:
    
        r18.playSequentially(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ee, code lost:
    
        return r6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.animation.Animator b(android.content.Context r13, android.content.res.Resources r14, android.content.res.Resources.Theme r15, org.xmlpull.v1.XmlPullParser r16, android.util.AttributeSet r17, android.animation.AnimatorSet r18, int r19, float r20) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.e.b(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.animation.AnimatorSet, int, float):android.animation.Animator");
    }

    public static Keyframe c(Keyframe keyframe, float f10) {
        return keyframe.getType() == Float.TYPE ? Keyframe.ofFloat(f10) : keyframe.getType() == Integer.TYPE ? Keyframe.ofInt(f10) : Keyframe.ofObject(f10);
    }

    public static void d(Keyframe[] keyframeArr, float f10, int i10, int i11) {
        float f11 = f10 / ((i11 - i10) + 2);
        while (i10 <= i11) {
            keyframeArr[i10].setFraction(keyframeArr[i10 - 1].getFraction() + f11);
            i10++;
        }
    }

    public static PropertyValuesHolder e(TypedArray typedArray, int i10, int i11, int i12, String str) {
        PropertyValuesHolder propertyValuesHolderOfFloat;
        TypedValue typedValuePeekValue = typedArray.peekValue(i11);
        boolean z10 = typedValuePeekValue != null;
        int i13 = z10 ? typedValuePeekValue.type : 0;
        TypedValue typedValuePeekValue2 = typedArray.peekValue(i12);
        boolean z11 = typedValuePeekValue2 != null;
        int i14 = z11 ? typedValuePeekValue2.type : 0;
        if (i10 == 4) {
            i10 = ((z10 && h(i13)) || (z11 && h(i14))) ? 3 : 0;
        }
        boolean z12 = i10 == 0;
        PropertyValuesHolder propertyValuesHolderOfInt = null;
        if (i10 != 2) {
            f fVarA = i10 == 3 ? f.a() : null;
            if (z12) {
                if (z10) {
                    float dimension = i13 == 5 ? typedArray.getDimension(i11, 0.0f) : typedArray.getFloat(i11, 0.0f);
                    if (z11) {
                        propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, dimension, i14 == 5 ? typedArray.getDimension(i12, 0.0f) : typedArray.getFloat(i12, 0.0f));
                    } else {
                        propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, dimension);
                    }
                } else {
                    propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, i14 == 5 ? typedArray.getDimension(i12, 0.0f) : typedArray.getFloat(i12, 0.0f));
                }
                propertyValuesHolderOfInt = propertyValuesHolderOfFloat;
            } else if (z10) {
                int dimension2 = i13 == 5 ? (int) typedArray.getDimension(i11, 0.0f) : h(i13) ? typedArray.getColor(i11, 0) : typedArray.getInt(i11, 0);
                if (z11) {
                    propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, dimension2, i14 == 5 ? (int) typedArray.getDimension(i12, 0.0f) : h(i14) ? typedArray.getColor(i12, 0) : typedArray.getInt(i12, 0));
                } else {
                    propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, dimension2);
                }
            } else if (z11) {
                propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, i14 == 5 ? (int) typedArray.getDimension(i12, 0.0f) : h(i14) ? typedArray.getColor(i12, 0) : typedArray.getInt(i12, 0));
            }
            if (propertyValuesHolderOfInt != null && fVarA != null) {
                propertyValuesHolderOfInt.setEvaluator(fVarA);
            }
            return propertyValuesHolderOfInt;
        }
        String string = typedArray.getString(i11);
        String string2 = typedArray.getString(i12);
        d.b[] bVarArrD = j0.d.d(string);
        d.b[] bVarArrD2 = j0.d.d(string2);
        if (bVarArrD != null || bVarArrD2 != null) {
            if (bVarArrD != null) {
                a aVar = new a();
                if (bVarArrD2 == null) {
                    return PropertyValuesHolder.ofObject(str, aVar, bVarArrD);
                }
                if (j0.d.b(bVarArrD, bVarArrD2)) {
                    return PropertyValuesHolder.ofObject(str, aVar, bVarArrD, bVarArrD2);
                }
                throw new InflateException(" Can't morph from " + string + " to " + string2);
            }
            if (bVarArrD2 != null) {
                return PropertyValuesHolder.ofObject(str, new a(), bVarArrD2);
            }
        }
        return null;
    }

    public static int f(TypedArray typedArray, int i10, int i11) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i10);
        boolean z10 = typedValuePeekValue != null;
        int i12 = z10 ? typedValuePeekValue.type : 0;
        TypedValue typedValuePeekValue2 = typedArray.peekValue(i11);
        boolean z11 = typedValuePeekValue2 != null;
        int i13 = z11 ? typedValuePeekValue2.type : 0;
        if (z10 && h(i12)) {
            return 3;
        }
        return (z11 && h(i13)) ? 3 : 0;
    }

    public static int g(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray typedArrayK = i.k(resources, theme, attributeSet, z1.a.f25225j);
        int i10 = 0;
        TypedValue typedValueL = i.l(typedArrayK, xmlPullParser, AppMeasurementSdk.ConditionalUserProperty.VALUE, 0);
        if (typedValueL != null && h(typedValueL.type)) {
            i10 = 3;
        }
        typedArrayK.recycle();
        return i10;
    }

    public static boolean h(int i10) {
        return i10 >= 28 && i10 <= 31;
    }

    public static Animator i(Context context, int i10) {
        return Build.VERSION.SDK_INT >= 24 ? AnimatorInflater.loadAnimator(context, i10) : j(context, context.getResources(), context.getTheme(), i10);
    }

    public static Animator j(Context context, Resources resources, Resources.Theme theme, int i10) {
        return k(context, resources, theme, i10, 1.0f);
    }

    public static Animator k(Context context, Resources resources, Resources.Theme theme, int i10, float f10) {
        XmlResourceParser animation = null;
        try {
            try {
                try {
                    animation = resources.getAnimation(i10);
                    return a(context, resources, theme, animation, f10);
                } catch (XmlPullParserException e10) {
                    Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i10));
                    notFoundException.initCause(e10);
                    throw notFoundException;
                }
            } catch (IOException e11) {
                Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i10));
                notFoundException2.initCause(e11);
                throw notFoundException2;
            }
        } finally {
            if (animation != null) {
                animation.close();
            }
        }
    }

    public static ValueAnimator l(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, float f10, XmlPullParser xmlPullParser) {
        TypedArray typedArrayK = i.k(resources, theme, attributeSet, z1.a.f25222g);
        TypedArray typedArrayK2 = i.k(resources, theme, attributeSet, z1.a.f25226k);
        if (valueAnimator == null) {
            valueAnimator = new ValueAnimator();
        }
        q(valueAnimator, typedArrayK, typedArrayK2, f10, xmlPullParser);
        int iH = i.h(typedArrayK, xmlPullParser, "interpolator", 0, 0);
        if (iH > 0) {
            valueAnimator.setInterpolator(d.a(context, iH));
        }
        typedArrayK.recycle();
        if (typedArrayK2 != null) {
            typedArrayK2.recycle();
        }
        return valueAnimator;
    }

    public static Keyframe m(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, int i10, XmlPullParser xmlPullParser) {
        TypedArray typedArrayK = i.k(resources, theme, attributeSet, z1.a.f25225j);
        float f10 = i.f(typedArrayK, xmlPullParser, "fraction", 3, -1.0f);
        TypedValue typedValueL = i.l(typedArrayK, xmlPullParser, AppMeasurementSdk.ConditionalUserProperty.VALUE, 0);
        boolean z10 = typedValueL != null;
        if (i10 == 4) {
            i10 = (z10 && h(typedValueL.type)) ? 3 : 0;
        }
        Keyframe keyframeOfInt = z10 ? i10 != 0 ? (i10 == 1 || i10 == 3) ? Keyframe.ofInt(f10, i.g(typedArrayK, xmlPullParser, AppMeasurementSdk.ConditionalUserProperty.VALUE, 0, 0)) : null : Keyframe.ofFloat(f10, i.f(typedArrayK, xmlPullParser, AppMeasurementSdk.ConditionalUserProperty.VALUE, 0, 0.0f)) : i10 == 0 ? Keyframe.ofFloat(f10) : Keyframe.ofInt(f10);
        int iH = i.h(typedArrayK, xmlPullParser, "interpolator", 1, 0);
        if (iH > 0) {
            keyframeOfInt.setInterpolator(d.a(context, iH));
        }
        typedArrayK.recycle();
        return keyframeOfInt;
    }

    public static ObjectAnimator n(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, float f10, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = new ObjectAnimator();
        l(context, resources, theme, attributeSet, objectAnimator, f10, xmlPullParser);
        return objectAnimator;
    }

    public static PropertyValuesHolder o(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, String str, int i10) throws XmlPullParserException, IOException {
        int size;
        Context context2;
        Resources.Theme theme2;
        XmlPullParser xmlPullParser2;
        ArrayList arrayList = null;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 3 || next == 1) {
                break;
            }
            if (xmlPullParser.getName().equals("keyframe")) {
                if (i10 == 4) {
                    i10 = g(resources, theme, Xml.asAttributeSet(xmlPullParser), xmlPullParser);
                }
                int i11 = i10;
                context2 = context;
                theme2 = theme;
                xmlPullParser2 = xmlPullParser;
                Keyframe keyframeM = m(context2, resources, theme2, Xml.asAttributeSet(xmlPullParser), i11, xmlPullParser2);
                if (keyframeM != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(keyframeM);
                }
                xmlPullParser2.next();
                i10 = i11;
            } else {
                context2 = context;
                theme2 = theme;
                xmlPullParser2 = xmlPullParser;
            }
            context = context2;
            theme = theme2;
            xmlPullParser = xmlPullParser2;
        }
        if (arrayList == null || (size = arrayList.size()) <= 0) {
            return null;
        }
        Keyframe keyframe = (Keyframe) arrayList.get(0);
        Keyframe keyframe2 = (Keyframe) arrayList.get(size - 1);
        float fraction = keyframe2.getFraction();
        if (fraction < 1.0f) {
            if (fraction < 0.0f) {
                keyframe2.setFraction(1.0f);
            } else {
                arrayList.add(arrayList.size(), c(keyframe2, 1.0f));
                size++;
            }
        }
        float fraction2 = keyframe.getFraction();
        if (fraction2 != 0.0f) {
            if (fraction2 < 0.0f) {
                keyframe.setFraction(0.0f);
            } else {
                arrayList.add(0, c(keyframe, 0.0f));
                size++;
            }
        }
        Keyframe[] keyframeArr = new Keyframe[size];
        arrayList.toArray(keyframeArr);
        for (int i12 = 0; i12 < size; i12++) {
            Keyframe keyframe3 = keyframeArr[i12];
            if (keyframe3.getFraction() < 0.0f) {
                if (i12 == 0) {
                    keyframe3.setFraction(0.0f);
                } else {
                    int i13 = size - 1;
                    if (i12 == i13) {
                        keyframe3.setFraction(1.0f);
                    } else {
                        int i14 = i12;
                        for (int i15 = i12 + 1; i15 < i13 && keyframeArr[i15].getFraction() < 0.0f; i15++) {
                            i14 = i15;
                        }
                        d(keyframeArr, keyframeArr[i14 + 1].getFraction() - keyframeArr[i12 - 1].getFraction(), i12, i14);
                    }
                }
            }
        }
        PropertyValuesHolder propertyValuesHolderOfKeyframe = PropertyValuesHolder.ofKeyframe(str, keyframeArr);
        if (i10 == 3) {
            propertyValuesHolderOfKeyframe.setEvaluator(f.a());
        }
        return propertyValuesHolderOfKeyframe;
    }

    public static PropertyValuesHolder[] p(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        int i10;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        ArrayList arrayList = null;
        while (true) {
            int eventType = xmlPullParser2.getEventType();
            if (eventType == 3 || eventType == 1) {
                break;
            }
            if (eventType != 2) {
                xmlPullParser2.next();
            } else {
                if (xmlPullParser2.getName().equals("propertyValuesHolder")) {
                    TypedArray typedArrayK = i.k(resources, theme, attributeSet, z1.a.f25224i);
                    String strI = i.i(typedArrayK, xmlPullParser2, "propertyName", 3);
                    int iG = i.g(typedArrayK, xmlPullParser2, "valueType", 2, 4);
                    PropertyValuesHolder propertyValuesHolderO = o(context, resources, theme, xmlPullParser2, strI, iG);
                    if (propertyValuesHolderO == null) {
                        propertyValuesHolderO = e(typedArrayK, iG, 0, 1, strI);
                    }
                    if (propertyValuesHolderO != null) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(propertyValuesHolderO);
                    }
                    typedArrayK.recycle();
                }
                xmlPullParser.next();
                xmlPullParser2 = xmlPullParser;
            }
        }
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[size];
        for (i10 = 0; i10 < size; i10++) {
            propertyValuesHolderArr[i10] = (PropertyValuesHolder) arrayList.get(i10);
        }
        return propertyValuesHolderArr;
    }

    public static void q(ValueAnimator valueAnimator, TypedArray typedArray, TypedArray typedArray2, float f10, XmlPullParser xmlPullParser) {
        long jG = i.g(typedArray, xmlPullParser, "duration", 1, 300);
        long jG2 = i.g(typedArray, xmlPullParser, "startOffset", 2, 0);
        int iG = i.g(typedArray, xmlPullParser, "valueType", 7, 4);
        if (i.j(xmlPullParser, "valueFrom") && i.j(xmlPullParser, "valueTo")) {
            if (iG == 4) {
                iG = f(typedArray, 5, 6);
            }
            PropertyValuesHolder propertyValuesHolderE = e(typedArray, iG, 5, 6, "");
            if (propertyValuesHolderE != null) {
                valueAnimator.setValues(propertyValuesHolderE);
            }
        }
        valueAnimator.setDuration(jG);
        valueAnimator.setStartDelay(jG2);
        valueAnimator.setRepeatCount(i.g(typedArray, xmlPullParser, "repeatCount", 3, 0));
        valueAnimator.setRepeatMode(i.g(typedArray, xmlPullParser, "repeatMode", 4, 1));
        if (typedArray2 != null) {
            r(valueAnimator, typedArray2, iG, f10, xmlPullParser);
        }
    }

    public static void r(ValueAnimator valueAnimator, TypedArray typedArray, int i10, float f10, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator;
        String strI = i.i(typedArray, xmlPullParser, "pathData", 1);
        if (strI == null) {
            objectAnimator.setPropertyName(i.i(typedArray, xmlPullParser, "propertyName", 0));
            return;
        }
        String strI2 = i.i(typedArray, xmlPullParser, "propertyXName", 2);
        String strI3 = i.i(typedArray, xmlPullParser, "propertyYName", 3);
        if (i10 != 2) {
        }
        if (strI2 != null || strI3 != null) {
            s(j0.d.e(strI), objectAnimator, f10 * 0.5f, strI2, strI3);
            return;
        }
        throw new InflateException(typedArray.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
    }

    public static void s(Path path, ObjectAnimator objectAnimator, float f10, String str, String str2) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        ArrayList arrayList = new ArrayList();
        float f11 = 0.0f;
        arrayList.add(Float.valueOf(0.0f));
        float length = 0.0f;
        do {
            length += pathMeasure.getLength();
            arrayList.add(Float.valueOf(length));
        } while (pathMeasure.nextContour());
        PathMeasure pathMeasure2 = new PathMeasure(path, false);
        int iMin = Math.min(100, ((int) (length / f10)) + 1);
        float[] fArr = new float[iMin];
        float[] fArr2 = new float[iMin];
        float[] fArr3 = new float[2];
        float f12 = length / (iMin - 1);
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 >= iMin) {
                break;
            }
            pathMeasure2.getPosTan(f11 - ((Float) arrayList.get(i11)).floatValue(), fArr3, null);
            fArr[i10] = fArr3[0];
            fArr2[i10] = fArr3[1];
            f11 += f12;
            int i12 = i11 + 1;
            if (i12 < arrayList.size() && f11 > ((Float) arrayList.get(i12)).floatValue()) {
                pathMeasure2.nextContour();
                i11 = i12;
            }
            i10++;
        }
        PropertyValuesHolder propertyValuesHolderOfFloat = str != null ? PropertyValuesHolder.ofFloat(str, fArr) : null;
        PropertyValuesHolder propertyValuesHolderOfFloat2 = str2 != null ? PropertyValuesHolder.ofFloat(str2, fArr2) : null;
        if (propertyValuesHolderOfFloat == null) {
            objectAnimator.setValues(propertyValuesHolderOfFloat2);
        } else if (propertyValuesHolderOfFloat2 == null) {
            objectAnimator.setValues(propertyValuesHolderOfFloat);
        } else {
            objectAnimator.setValues(propertyValuesHolderOfFloat, propertyValuesHolderOfFloat2);
        }
    }
}
