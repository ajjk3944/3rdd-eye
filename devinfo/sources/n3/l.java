package n3;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public int f29698a;

    /* renamed from: b, reason: collision with root package name */
    public int f29699b;

    /* renamed from: c, reason: collision with root package name */
    public float f29700c;

    /* renamed from: d, reason: collision with root package name */
    public float f29701d;

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q.g);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i4 = 0; i4 < indexCount; i4++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i4);
            if (index == 1) {
                this.f29700c = typedArrayObtainStyledAttributes.getFloat(index, this.f29700c);
            } else if (index == 0) {
                int i10 = typedArrayObtainStyledAttributes.getInt(index, this.f29698a);
                this.f29698a = i10;
                this.f29698a = n.f29714d[i10];
            } else if (index == 4) {
                this.f29699b = typedArrayObtainStyledAttributes.getInt(index, this.f29699b);
            } else if (index == 3) {
                this.f29701d = typedArrayObtainStyledAttributes.getFloat(index, this.f29701d);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
