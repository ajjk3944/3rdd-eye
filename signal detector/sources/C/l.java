package C;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import y.AbstractC3006a;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: j, reason: collision with root package name */
    public static final SparseIntArray f980j;

    /* renamed from: a, reason: collision with root package name */
    public int f981a;

    /* renamed from: b, reason: collision with root package name */
    public int f982b;

    /* renamed from: c, reason: collision with root package name */
    public int f983c;

    /* renamed from: d, reason: collision with root package name */
    public float f984d;

    /* renamed from: e, reason: collision with root package name */
    public float f985e;

    /* renamed from: f, reason: collision with root package name */
    public float f986f;

    /* renamed from: g, reason: collision with root package name */
    public int f987g;

    /* renamed from: h, reason: collision with root package name */
    public String f988h;
    public int i;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f980j = sparseIntArray;
        sparseIntArray.append(3, 1);
        sparseIntArray.append(5, 2);
        sparseIntArray.append(9, 3);
        sparseIntArray.append(2, 4);
        sparseIntArray.append(1, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(4, 7);
        sparseIntArray.append(8, 8);
        sparseIntArray.append(7, 9);
        sparseIntArray.append(6, 10);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f1017f);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            switch (f980j.get(index)) {
                case 1:
                    this.f985e = typedArrayObtainStyledAttributes.getFloat(index, this.f985e);
                    break;
                case 2:
                    this.f983c = typedArrayObtainStyledAttributes.getInt(index, this.f983c);
                    break;
                case 3:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        typedArrayObtainStyledAttributes.getString(index);
                        break;
                    } else {
                        String str = AbstractC3006a.f24204a[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                        break;
                    }
                case 4:
                    typedArrayObtainStyledAttributes.getInt(index, 0);
                    break;
                case 5:
                    this.f981a = o.f(typedArrayObtainStyledAttributes, index, this.f981a);
                    break;
                case 6:
                    this.f982b = typedArrayObtainStyledAttributes.getInteger(index, this.f982b);
                    break;
                case 7:
                    this.f984d = typedArrayObtainStyledAttributes.getFloat(index, this.f984d);
                    break;
                case 8:
                    this.f987g = typedArrayObtainStyledAttributes.getInteger(index, this.f987g);
                    break;
                case 9:
                    this.f986f = typedArrayObtainStyledAttributes.getFloat(index, this.f986f);
                    break;
                case 10:
                    int i3 = typedArrayObtainStyledAttributes.peekValue(index).type;
                    if (i3 == 1) {
                        this.i = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                        break;
                    } else if (i3 == 3) {
                        String string = typedArrayObtainStyledAttributes.getString(index);
                        this.f988h = string;
                        if (string.indexOf("/") > 0) {
                            this.i = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            break;
                        } else {
                            break;
                        }
                    } else {
                        typedArrayObtainStyledAttributes.getInteger(index, this.i);
                        break;
                    }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
