package n3;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class k {
    public static final SparseIntArray j;

    /* renamed from: a, reason: collision with root package name */
    public int f29690a;

    /* renamed from: b, reason: collision with root package name */
    public int f29691b;

    /* renamed from: c, reason: collision with root package name */
    public int f29692c;

    /* renamed from: d, reason: collision with root package name */
    public float f29693d;

    /* renamed from: e, reason: collision with root package name */
    public float f29694e;

    /* renamed from: f, reason: collision with root package name */
    public float f29695f;
    public int g;

    /* renamed from: h, reason: collision with root package name */
    public String f29696h;

    /* renamed from: i, reason: collision with root package name */
    public int f29697i;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        j = sparseIntArray;
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
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q.f29725f);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i4 = 0; i4 < indexCount; i4++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i4);
            switch (j.get(index)) {
                case 1:
                    this.f29694e = typedArrayObtainStyledAttributes.getFloat(index, this.f29694e);
                    break;
                case 2:
                    this.f29692c = typedArrayObtainStyledAttributes.getInt(index, this.f29692c);
                    break;
                case 3:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        typedArrayObtainStyledAttributes.getString(index);
                        break;
                    } else {
                        String str = j3.a.f27363a[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                        break;
                    }
                case 4:
                    typedArrayObtainStyledAttributes.getInt(index, 0);
                    break;
                case 5:
                    this.f29690a = n.f(typedArrayObtainStyledAttributes, index, this.f29690a);
                    break;
                case 6:
                    this.f29691b = typedArrayObtainStyledAttributes.getInteger(index, this.f29691b);
                    break;
                case 7:
                    this.f29693d = typedArrayObtainStyledAttributes.getFloat(index, this.f29693d);
                    break;
                case 8:
                    this.g = typedArrayObtainStyledAttributes.getInteger(index, this.g);
                    break;
                case 9:
                    this.f29695f = typedArrayObtainStyledAttributes.getFloat(index, this.f29695f);
                    break;
                case 10:
                    int i10 = typedArrayObtainStyledAttributes.peekValue(index).type;
                    if (i10 == 1) {
                        this.f29697i = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                        break;
                    } else if (i10 == 3) {
                        String string = typedArrayObtainStyledAttributes.getString(index);
                        this.f29696h = string;
                        if (string.indexOf("/") > 0) {
                            this.f29697i = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            break;
                        } else {
                            break;
                        }
                    } else {
                        typedArrayObtainStyledAttributes.getInteger(index, this.f29697i);
                        break;
                    }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
