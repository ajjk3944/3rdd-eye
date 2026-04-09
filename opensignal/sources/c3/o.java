package c3;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: n, reason: collision with root package name */
    public static final SparseIntArray f3276n;

    /* renamed from: a, reason: collision with root package name */
    public float f3277a;

    /* renamed from: b, reason: collision with root package name */
    public float f3278b;

    /* renamed from: c, reason: collision with root package name */
    public float f3279c;

    /* renamed from: d, reason: collision with root package name */
    public float f3280d;

    /* renamed from: e, reason: collision with root package name */
    public float f3281e;

    /* renamed from: f, reason: collision with root package name */
    public float f3282f;

    /* renamed from: g, reason: collision with root package name */
    public float f3283g;

    /* renamed from: h, reason: collision with root package name */
    public int f3284h;

    /* renamed from: i, reason: collision with root package name */
    public float f3285i;
    public float j;
    public float k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3286l;

    /* renamed from: m, reason: collision with root package name */
    public float f3287m;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f3276n = sparseIntArray;
        sparseIntArray.append(s.Transform_android_rotation, 1);
        sparseIntArray.append(s.Transform_android_rotationX, 2);
        sparseIntArray.append(s.Transform_android_rotationY, 3);
        sparseIntArray.append(s.Transform_android_scaleX, 4);
        sparseIntArray.append(s.Transform_android_scaleY, 5);
        sparseIntArray.append(s.Transform_android_transformPivotX, 6);
        sparseIntArray.append(s.Transform_android_transformPivotY, 7);
        sparseIntArray.append(s.Transform_android_translationX, 8);
        sparseIntArray.append(s.Transform_android_translationY, 9);
        sparseIntArray.append(s.Transform_android_translationZ, 10);
        sparseIntArray.append(s.Transform_android_elevation, 11);
        sparseIntArray.append(s.Transform_transformPivotTarget, 12);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s.Transform);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            switch (f3276n.get(index)) {
                case 1:
                    this.f3277a = typedArrayObtainStyledAttributes.getFloat(index, this.f3277a);
                    break;
                case 2:
                    this.f3278b = typedArrayObtainStyledAttributes.getFloat(index, this.f3278b);
                    break;
                case 3:
                    this.f3279c = typedArrayObtainStyledAttributes.getFloat(index, this.f3279c);
                    break;
                case 4:
                    this.f3280d = typedArrayObtainStyledAttributes.getFloat(index, this.f3280d);
                    break;
                case g4.j.STRING_FIELD_NUMBER /* 5 */:
                    this.f3281e = typedArrayObtainStyledAttributes.getFloat(index, this.f3281e);
                    break;
                case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                    this.f3282f = typedArrayObtainStyledAttributes.getDimension(index, this.f3282f);
                    break;
                case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                    this.f3283g = typedArrayObtainStyledAttributes.getDimension(index, this.f3283g);
                    break;
                case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                    this.f3285i = typedArrayObtainStyledAttributes.getDimension(index, this.f3285i);
                    break;
                case 9:
                    this.j = typedArrayObtainStyledAttributes.getDimension(index, this.j);
                    break;
                case 10:
                    this.k = typedArrayObtainStyledAttributes.getDimension(index, this.k);
                    break;
                case 11:
                    this.f3286l = true;
                    this.f3287m = typedArrayObtainStyledAttributes.getDimension(index, this.f3287m);
                    break;
                case 12:
                    this.f3284h = p.h(typedArrayObtainStyledAttributes, index, this.f3284h);
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
