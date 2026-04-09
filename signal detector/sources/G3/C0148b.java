package G3;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: G3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0148b implements InterfaceC0150d {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0150d f1555a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1556b;

    public C0148b(float f2, InterfaceC0150d interfaceC0150d) {
        while (interfaceC0150d instanceof C0148b) {
            interfaceC0150d = ((C0148b) interfaceC0150d).f1555a;
            f2 += ((C0148b) interfaceC0150d).f1556b;
        }
        this.f1555a = interfaceC0150d;
        this.f1556b = f2;
    }

    @Override // G3.InterfaceC0150d
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.f1555a.a(rectF) + this.f1556b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0148b)) {
            return false;
        }
        C0148b c0148b = (C0148b) obj;
        return this.f1555a.equals(c0148b.f1555a) && this.f1556b == c0148b.f1556b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1555a, Float.valueOf(this.f1556b)});
    }
}
