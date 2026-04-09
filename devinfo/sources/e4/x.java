package e4;

import android.os.Build;
import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final w f22416a;

    public x(NestedScrollView nestedScrollView) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f22416a = new v(nestedScrollView);
        } else {
            this.f22416a = new b7.h(12);
        }
    }
}
