package s6;

import android.graphics.Paint;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import u6.InterfaceC8137b;
import y6.AbstractC8614c;

/* renamed from: s6.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7913a {

    /* renamed from: a, reason: collision with root package name */
    private float f61352a;

    /* renamed from: b, reason: collision with root package name */
    private float f61353b;

    /* renamed from: c, reason: collision with root package name */
    private float f61354c;

    /* renamed from: d, reason: collision with root package name */
    private int f61355d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f61356e;

    /* renamed from: f, reason: collision with root package name */
    private float f61357f;

    /* renamed from: g, reason: collision with root package name */
    private float f61358g;

    /* renamed from: h, reason: collision with root package name */
    private float f61359h;

    /* renamed from: i, reason: collision with root package name */
    private int f61360i;

    /* renamed from: j, reason: collision with root package name */
    private float f61361j;

    public C7913a(float f10, float f11, float f12, int i10, boolean z10) {
        this.f61352a = f10;
        this.f61353b = f11;
        this.f61354c = f12;
        this.f61355d = i10;
        this.f61356e = z10;
    }

    private final boolean b(InterfaceC8137b interfaceC8137b) {
        if (this.f61352a == this.f61357f && this.f61353b == this.f61358g && this.f61354c == this.f61359h && this.f61355d == this.f61360i && interfaceC8137b.getDensity() == this.f61361j) {
            return false;
        }
        this.f61357f = this.f61352a;
        this.f61358g = this.f61353b;
        this.f61359h = this.f61354c;
        this.f61360i = this.f61355d;
        this.f61361j = interfaceC8137b.getDensity();
        return true;
    }

    private final void c(InterfaceC8137b interfaceC8137b, Paint paint, int i10) {
        if (this.f61355d != 0) {
            float f10 = this.f61352a;
            if (f10 != 0.0f || this.f61353b != 0.0f || this.f61354c != 0.0f) {
                if (this.f61356e) {
                    i10 = AbstractC8614c.a(interfaceC8137b, i10, f10);
                }
                paint.setColor(i10);
                paint.setShadowLayer(interfaceC8137b.g(this.f61352a), interfaceC8137b.g(this.f61353b), interfaceC8137b.g(this.f61354c), this.f61355d);
                return;
            }
        }
        paint.clearShadowLayer();
    }

    public final void a(InterfaceC8137b context, Paint paint, int i10) {
        AbstractC6492s.i(context, "context");
        AbstractC6492s.i(paint, "paint");
        if (b(context)) {
            c(context, paint, i10);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7913a)) {
            return false;
        }
        C7913a c7913a = (C7913a) obj;
        return Float.compare(this.f61352a, c7913a.f61352a) == 0 && Float.compare(this.f61353b, c7913a.f61353b) == 0 && Float.compare(this.f61354c, c7913a.f61354c) == 0 && this.f61355d == c7913a.f61355d && this.f61356e == c7913a.f61356e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = ((((((Float.hashCode(this.f61352a) * 31) + Float.hashCode(this.f61353b)) * 31) + Float.hashCode(this.f61354c)) * 31) + Integer.hashCode(this.f61355d)) * 31;
        boolean z10 = this.f61356e;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return iHashCode + i10;
    }

    public String toString() {
        return "ComponentShadow(radius=" + this.f61352a + ", dx=" + this.f61353b + ", dy=" + this.f61354c + ", color=" + this.f61355d + ", applyElevationOverlay=" + this.f61356e + ')';
    }

    public /* synthetic */ C7913a(float f10, float f11, float f12, int i10, boolean z10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0.0f : f10, (i11 & 2) != 0 ? 0.0f : f11, (i11 & 4) == 0 ? f12 : 0.0f, (i11 & 8) != 0 ? 0 : i10, (i11 & 16) != 0 ? false : z10);
    }
}
