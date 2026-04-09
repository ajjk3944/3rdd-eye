package z;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class V {

    /* renamed from: a, reason: collision with root package name */
    private float f66812a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f66813b;

    /* renamed from: c, reason: collision with root package name */
    private AbstractC8690m f66814c;

    public V(float f10, boolean z10, AbstractC8690m abstractC8690m, AbstractC8695s abstractC8695s) {
        this.f66812a = f10;
        this.f66813b = z10;
        this.f66814c = abstractC8690m;
    }

    public final AbstractC8690m a() {
        return this.f66814c;
    }

    public final boolean b() {
        return this.f66813b;
    }

    public final AbstractC8695s c() {
        return null;
    }

    public final float d() {
        return this.f66812a;
    }

    public final void e(AbstractC8690m abstractC8690m) {
        this.f66814c = abstractC8690m;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof V)) {
            return false;
        }
        V v10 = (V) obj;
        return Float.compare(this.f66812a, v10.f66812a) == 0 && this.f66813b == v10.f66813b && AbstractC6492s.d(this.f66814c, v10.f66814c) && AbstractC6492s.d(null, null);
    }

    public final void f(boolean z10) {
        this.f66813b = z10;
    }

    public final void g(float f10) {
        this.f66812a = f10;
    }

    public int hashCode() {
        int iHashCode = ((Float.hashCode(this.f66812a) * 31) + Boolean.hashCode(this.f66813b)) * 31;
        AbstractC8690m abstractC8690m = this.f66814c;
        return (iHashCode + (abstractC8690m == null ? 0 : abstractC8690m.hashCode())) * 31;
    }

    public String toString() {
        return "RowColumnParentData(weight=" + this.f66812a + ", fill=" + this.f66813b + ", crossAxisAlignment=" + this.f66814c + ", flowLayoutData=" + ((Object) null) + ')';
    }

    public /* synthetic */ V(float f10, boolean z10, AbstractC8690m abstractC8690m, AbstractC8695s abstractC8695s, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0.0f : f10, (i10 & 2) != 0 ? true : z10, (i10 & 4) != 0 ? null : abstractC8690m, (i10 & 8) != 0 ? null : abstractC8695s);
    }
}
