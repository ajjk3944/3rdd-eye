package s0;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import q0.InterfaceC2791d;
import q0.v;

/* renamed from: s0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2881b extends v implements InterfaceC2791d {

    /* renamed from: k, reason: collision with root package name */
    public String f23402k;

    @Override // q0.v
    public final boolean equals(Object obj) {
        return obj != null && (obj instanceof C2881b) && super.equals(obj) && q5.i.a(this.f23402k, ((C2881b) obj).f23402k);
    }

    @Override // q0.v
    public final void f(Context context, AttributeSet attributeSet) {
        super.f(context, attributeSet);
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, AbstractC2889j.f23424a);
        q5.i.d(typedArrayObtainAttributes, "context.resources.obtain…ntNavigator\n            )");
        String string = typedArrayObtainAttributes.getString(0);
        if (string != null) {
            this.f23402k = string;
        }
        typedArrayObtainAttributes.recycle();
    }

    @Override // q0.v
    public final int hashCode() {
        int iHashCode = super.hashCode() * 31;
        String str = this.f23402k;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
