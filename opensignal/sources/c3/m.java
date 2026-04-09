package c3;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* loaded from: classes.dex */
public final class m {
    public static final SparseIntArray j;

    /* renamed from: a, reason: collision with root package name */
    public int f3263a;

    /* renamed from: b, reason: collision with root package name */
    public int f3264b;

    /* renamed from: c, reason: collision with root package name */
    public int f3265c;

    /* renamed from: d, reason: collision with root package name */
    public float f3266d;

    /* renamed from: e, reason: collision with root package name */
    public float f3267e;

    /* renamed from: f, reason: collision with root package name */
    public float f3268f;

    /* renamed from: g, reason: collision with root package name */
    public int f3269g;

    /* renamed from: h, reason: collision with root package name */
    public String f3270h;

    /* renamed from: i, reason: collision with root package name */
    public int f3271i;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        j = sparseIntArray;
        sparseIntArray.append(s.Motion_motionPathRotate, 1);
        sparseIntArray.append(s.Motion_pathMotionArc, 2);
        sparseIntArray.append(s.Motion_transitionEasing, 3);
        sparseIntArray.append(s.Motion_drawPath, 4);
        sparseIntArray.append(s.Motion_animateRelativeTo, 5);
        sparseIntArray.append(s.Motion_animateCircleAngleTo, 6);
        sparseIntArray.append(s.Motion_motionStagger, 7);
        sparseIntArray.append(s.Motion_quantizeMotionSteps, 8);
        sparseIntArray.append(s.Motion_quantizeMotionPhase, 9);
        sparseIntArray.append(s.Motion_quantizeMotionInterpolator, 10);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s.Motion);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            switch (j.get(index)) {
                case 1:
                    this.f3267e = typedArrayObtainStyledAttributes.getFloat(index, this.f3267e);
                    break;
                case 2:
                    this.f3265c = typedArrayObtainStyledAttributes.getInt(index, this.f3265c);
                    break;
                case 3:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        typedArrayObtainStyledAttributes.getString(index);
                        break;
                    } else {
                        String str = y2.a.f25817a[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                        break;
                    }
                case 4:
                    typedArrayObtainStyledAttributes.getInt(index, 0);
                    break;
                case g4.j.STRING_FIELD_NUMBER /* 5 */:
                    this.f3263a = p.h(typedArrayObtainStyledAttributes, index, this.f3263a);
                    break;
                case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                    this.f3264b = typedArrayObtainStyledAttributes.getInteger(index, this.f3264b);
                    break;
                case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                    this.f3266d = typedArrayObtainStyledAttributes.getFloat(index, this.f3266d);
                    break;
                case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                    this.f3269g = typedArrayObtainStyledAttributes.getInteger(index, this.f3269g);
                    break;
                case 9:
                    this.f3268f = typedArrayObtainStyledAttributes.getFloat(index, this.f3268f);
                    break;
                case 10:
                    int i11 = typedArrayObtainStyledAttributes.peekValue(index).type;
                    if (i11 == 1) {
                        this.f3271i = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                        break;
                    } else if (i11 == 3) {
                        String string = typedArrayObtainStyledAttributes.getString(index);
                        this.f3270h = string;
                        if (string.indexOf("/") > 0) {
                            this.f3271i = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            break;
                        } else {
                            break;
                        }
                    } else {
                        typedArrayObtainStyledAttributes.getInteger(index, this.f3271i);
                        break;
                    }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
