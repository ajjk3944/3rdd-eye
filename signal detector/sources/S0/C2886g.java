package s0;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import q0.v;

/* renamed from: s0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2886g extends v {

    /* renamed from: k, reason: collision with root package name */
    public String f23418k;

    @Override // q0.v
    public final boolean equals(Object obj) {
        return obj != null && (obj instanceof C2886g) && super.equals(obj) && q5.i.a(this.f23418k, ((C2886g) obj).f23418k);
    }

    @Override // q0.v
    public final void f(Context context, AttributeSet attributeSet) {
        super.f(context, attributeSet);
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, AbstractC2889j.f23425b);
        q5.i.d(typedArrayObtainAttributes, "context.resources.obtain…leable.FragmentNavigator)");
        String string = typedArrayObtainAttributes.getString(0);
        if (string != null) {
            this.f23418k = string;
        }
        typedArrayObtainAttributes.recycle();
    }

    @Override // q0.v
    public final int hashCode() {
        int iHashCode = super.hashCode() * 31;
        String str = this.f23418k;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // q0.v
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" class=");
        String str = this.f23418k;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        String string = sb.toString();
        q5.i.d(string, "sb.toString()");
        return string;
    }
}
