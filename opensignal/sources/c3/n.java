package c3;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public int f3272a;

    /* renamed from: b, reason: collision with root package name */
    public int f3273b;

    /* renamed from: c, reason: collision with root package name */
    public float f3274c;

    /* renamed from: d, reason: collision with root package name */
    public float f3275d;

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s.PropertySet);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            if (index == s.PropertySet_android_alpha) {
                this.f3274c = typedArrayObtainStyledAttributes.getFloat(index, this.f3274c);
            } else if (index == s.PropertySet_android_visibility) {
                int i11 = typedArrayObtainStyledAttributes.getInt(index, this.f3272a);
                this.f3272a = i11;
                this.f3272a = p.f3288d[i11];
            } else if (index == s.PropertySet_visibilityMode) {
                this.f3273b = typedArrayObtainStyledAttributes.getInt(index, this.f3273b);
            } else if (index == s.PropertySet_motionProgress) {
                this.f3275d = typedArrayObtainStyledAttributes.getFloat(index, this.f3275d);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
