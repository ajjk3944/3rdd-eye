package f4;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: f4.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5521a implements InterfaceC5523c {

    /* renamed from: a, reason: collision with root package name */
    private final float f46989a;

    public C5521a(float f10) {
        this.f46989a = f10;
    }

    @Override // f4.InterfaceC5523c
    public float a(RectF rectF) {
        return this.f46989a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5521a) && this.f46989a == ((C5521a) obj).f46989a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f46989a)});
    }
}
