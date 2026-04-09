package G3;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: G3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0147a implements InterfaceC0150d {

    /* renamed from: a, reason: collision with root package name */
    public final float f1554a;

    public C0147a(float f2) {
        this.f1554a = f2;
    }

    @Override // G3.InterfaceC0150d
    public final float a(RectF rectF) {
        return this.f1554a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0147a) && this.f1554a == ((C0147a) obj).f1554a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f1554a)});
    }

    public final String toString() {
        return this.f1554a + "px";
    }
}
