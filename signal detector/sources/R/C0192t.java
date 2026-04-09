package R;

import G3.C0152f;
import android.os.Build;
import androidx.core.widget.NestedScrollView;

/* renamed from: R.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0192t {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0191s f3361a;

    public C0192t(NestedScrollView nestedScrollView) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f3361a = new r(nestedScrollView);
        } else {
            this.f3361a = new C0152f(27);
        }
    }
}
