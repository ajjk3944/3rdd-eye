package f4;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: f4.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5529i implements InterfaceC5523c {

    /* renamed from: a, reason: collision with root package name */
    private final float f47043a;

    public C5529i(float f10) {
        this.f47043a = f10;
    }

    private static float b(RectF rectF) {
        return Math.min(rectF.width(), rectF.height());
    }

    @Override // f4.InterfaceC5523c
    public float a(RectF rectF) {
        return this.f47043a * b(rectF);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5529i) && this.f47043a == ((C5529i) obj).f47043a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f47043a)});
    }
}
