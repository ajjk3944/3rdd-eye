package C;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: n, reason: collision with root package name */
    public static final SparseIntArray f993n;

    /* renamed from: a, reason: collision with root package name */
    public float f994a;

    /* renamed from: b, reason: collision with root package name */
    public float f995b;

    /* renamed from: c, reason: collision with root package name */
    public float f996c;

    /* renamed from: d, reason: collision with root package name */
    public float f997d;

    /* renamed from: e, reason: collision with root package name */
    public float f998e;

    /* renamed from: f, reason: collision with root package name */
    public float f999f;

    /* renamed from: g, reason: collision with root package name */
    public float f1000g;

    /* renamed from: h, reason: collision with root package name */
    public int f1001h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f1002j;

    /* renamed from: k, reason: collision with root package name */
    public float f1003k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1004l;

    /* renamed from: m, reason: collision with root package name */
    public float f1005m;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f993n = sparseIntArray;
        sparseIntArray.append(6, 1);
        sparseIntArray.append(7, 2);
        sparseIntArray.append(8, 3);
        sparseIntArray.append(4, 4);
        sparseIntArray.append(5, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(1, 7);
        sparseIntArray.append(2, 8);
        sparseIntArray.append(3, 9);
        sparseIntArray.append(9, 10);
        sparseIntArray.append(10, 11);
        sparseIntArray.append(11, 12);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.i);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            switch (f993n.get(index)) {
                case 1:
                    this.f994a = typedArrayObtainStyledAttributes.getFloat(index, this.f994a);
                    break;
                case 2:
                    this.f995b = typedArrayObtainStyledAttributes.getFloat(index, this.f995b);
                    break;
                case 3:
                    this.f996c = typedArrayObtainStyledAttributes.getFloat(index, this.f996c);
                    break;
                case 4:
                    this.f997d = typedArrayObtainStyledAttributes.getFloat(index, this.f997d);
                    break;
                case 5:
                    this.f998e = typedArrayObtainStyledAttributes.getFloat(index, this.f998e);
                    break;
                case 6:
                    this.f999f = typedArrayObtainStyledAttributes.getDimension(index, this.f999f);
                    break;
                case 7:
                    this.f1000g = typedArrayObtainStyledAttributes.getDimension(index, this.f1000g);
                    break;
                case 8:
                    this.i = typedArrayObtainStyledAttributes.getDimension(index, this.i);
                    break;
                case 9:
                    this.f1002j = typedArrayObtainStyledAttributes.getDimension(index, this.f1002j);
                    break;
                case 10:
                    this.f1003k = typedArrayObtainStyledAttributes.getDimension(index, this.f1003k);
                    break;
                case 11:
                    this.f1004l = true;
                    this.f1005m = typedArrayObtainStyledAttributes.getDimension(index, this.f1005m);
                    break;
                case 12:
                    this.f1001h = o.f(typedArrayObtainStyledAttributes, index, this.f1001h);
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
