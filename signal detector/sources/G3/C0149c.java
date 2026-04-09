package G3;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: G3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0149c implements InterfaceC0150d {

    /* renamed from: a, reason: collision with root package name */
    public final float f1557a;

    public C0149c(float f2) {
        this.f1557a = f2;
    }

    @Override // G3.InterfaceC0150d
    public final float a(RectF rectF) {
        return d5.y.e(this.f1557a, 0.0f, Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0149c) && this.f1557a == ((C0149c) obj).f1557a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f1557a)});
    }
}
