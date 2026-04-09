package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class i3 implements ck {
    public final ck a;
    public final float b;

    public i3(float f, ck ckVar) {
        while (ckVar instanceof i3) {
            ckVar = ((i3) ckVar).a;
            f += ((i3) ckVar).b;
        }
        this.a = ckVar;
        this.b = f;
    }

    @Override // defpackage.ck
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.a.a(rectF) + this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i3)) {
            return false;
        }
        i3 i3Var = (i3) obj;
        return this.a.equals(i3Var.a) && this.b == i3Var.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b)});
    }
}
