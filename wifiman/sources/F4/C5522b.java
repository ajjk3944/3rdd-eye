package f4;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: f4.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5522b implements InterfaceC5523c {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC5523c f46990a;

    /* renamed from: b, reason: collision with root package name */
    private final float f46991b;

    public C5522b(float f10, InterfaceC5523c interfaceC5523c) {
        while (interfaceC5523c instanceof C5522b) {
            interfaceC5523c = ((C5522b) interfaceC5523c).f46990a;
            f10 += ((C5522b) interfaceC5523c).f46991b;
        }
        this.f46990a = interfaceC5523c;
        this.f46991b = f10;
    }

    @Override // f4.InterfaceC5523c
    public float a(RectF rectF) {
        return Math.max(0.0f, this.f46990a.a(rectF) + this.f46991b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5522b)) {
            return false;
        }
        C5522b c5522b = (C5522b) obj;
        return this.f46990a.equals(c5522b.f46990a) && this.f46991b == c5522b.f46991b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f46990a, Float.valueOf(this.f46991b)});
    }
}
