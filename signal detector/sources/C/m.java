package C;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public int f989a;

    /* renamed from: b, reason: collision with root package name */
    public int f990b;

    /* renamed from: c, reason: collision with root package name */
    public float f991c;

    /* renamed from: d, reason: collision with root package name */
    public float f992d;

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f1018g);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 1) {
                this.f991c = typedArrayObtainStyledAttributes.getFloat(index, this.f991c);
            } else if (index == 0) {
                int i3 = typedArrayObtainStyledAttributes.getInt(index, this.f989a);
                this.f989a = i3;
                this.f989a = o.f1006d[i3];
            } else if (index == 4) {
                this.f990b = typedArrayObtainStyledAttributes.getInt(index, this.f990b);
            } else if (index == 3) {
                this.f992d = typedArrayObtainStyledAttributes.getFloat(index, this.f992d);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
