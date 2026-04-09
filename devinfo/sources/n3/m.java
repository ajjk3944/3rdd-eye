package n3;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: n, reason: collision with root package name */
    public static final SparseIntArray f29702n;

    /* renamed from: a, reason: collision with root package name */
    public float f29703a;

    /* renamed from: b, reason: collision with root package name */
    public float f29704b;

    /* renamed from: c, reason: collision with root package name */
    public float f29705c;

    /* renamed from: d, reason: collision with root package name */
    public float f29706d;

    /* renamed from: e, reason: collision with root package name */
    public float f29707e;

    /* renamed from: f, reason: collision with root package name */
    public float f29708f;
    public float g;

    /* renamed from: h, reason: collision with root package name */
    public int f29709h;

    /* renamed from: i, reason: collision with root package name */
    public float f29710i;
    public float j;

    /* renamed from: k, reason: collision with root package name */
    public float f29711k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f29712l;

    /* renamed from: m, reason: collision with root package name */
    public float f29713m;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f29702n = sparseIntArray;
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
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q.f29727i);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i4 = 0; i4 < indexCount; i4++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i4);
            switch (f29702n.get(index)) {
                case 1:
                    this.f29703a = typedArrayObtainStyledAttributes.getFloat(index, this.f29703a);
                    break;
                case 2:
                    this.f29704b = typedArrayObtainStyledAttributes.getFloat(index, this.f29704b);
                    break;
                case 3:
                    this.f29705c = typedArrayObtainStyledAttributes.getFloat(index, this.f29705c);
                    break;
                case 4:
                    this.f29706d = typedArrayObtainStyledAttributes.getFloat(index, this.f29706d);
                    break;
                case 5:
                    this.f29707e = typedArrayObtainStyledAttributes.getFloat(index, this.f29707e);
                    break;
                case 6:
                    this.f29708f = typedArrayObtainStyledAttributes.getDimension(index, this.f29708f);
                    break;
                case 7:
                    this.g = typedArrayObtainStyledAttributes.getDimension(index, this.g);
                    break;
                case 8:
                    this.f29710i = typedArrayObtainStyledAttributes.getDimension(index, this.f29710i);
                    break;
                case 9:
                    this.j = typedArrayObtainStyledAttributes.getDimension(index, this.j);
                    break;
                case 10:
                    this.f29711k = typedArrayObtainStyledAttributes.getDimension(index, this.f29711k);
                    break;
                case 11:
                    this.f29712l = true;
                    this.f29713m = typedArrayObtainStyledAttributes.getDimension(index, this.f29713m);
                    break;
                case 12:
                    this.f29709h = n.f(typedArrayObtainStyledAttributes, index, this.f29709h);
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
