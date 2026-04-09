package H0;

import Yg.J;
import android.content.res.Resources;
import android.util.TypedValue;
import o.z;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final z f7589a = new z(0, 1, null);

    public final void a() {
        synchronized (this) {
            this.f7589a.i();
            J j10 = J.f24997a;
        }
    }

    public final TypedValue b(Resources resources, int i10) {
        TypedValue typedValue;
        synchronized (this) {
            typedValue = (TypedValue) this.f7589a.c(i10);
            if (typedValue == null) {
                typedValue = new TypedValue();
                resources.getValue(i10, typedValue, true);
                this.f7589a.p(i10, typedValue);
            }
        }
        return typedValue;
    }
}
