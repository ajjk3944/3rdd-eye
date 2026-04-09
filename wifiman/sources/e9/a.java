package E9;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r.C7517a;

/* loaded from: classes3.dex */
final class a {

    /* renamed from: a, reason: collision with root package name */
    private final float f4374a;

    /* renamed from: b, reason: collision with root package name */
    private final float f4375b;

    /* renamed from: c, reason: collision with root package name */
    private C7517a f4376c;

    public a(float f10, float f11, C7517a c7517a) {
        this.f4374a = f10;
        this.f4375b = f11;
        this.f4376c = c7517a;
    }

    public final C7517a a() {
        return this.f4376c;
    }

    public final float b() {
        return this.f4375b;
    }

    public final float c() {
        return this.f4374a;
    }

    public final void d(C7517a c7517a) {
        this.f4376c = c7517a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Float.compare(this.f4374a, aVar.f4374a) == 0 && Float.compare(this.f4375b, aVar.f4375b) == 0 && AbstractC6492s.d(this.f4376c, aVar.f4376c);
    }

    public int hashCode() {
        int iHashCode = ((Float.hashCode(this.f4374a) * 31) + Float.hashCode(this.f4375b)) * 31;
        C7517a c7517a = this.f4376c;
        return iHashCode + (c7517a == null ? 0 : c7517a.hashCode());
    }

    public String toString() {
        return "RadarDot(progress=" + this.f4374a + ", position=" + this.f4375b + ", animation=" + this.f4376c + ")";
    }

    public /* synthetic */ a(float f10, float f11, C7517a c7517a, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, (i10 & 4) != 0 ? null : c7517a);
    }
}
