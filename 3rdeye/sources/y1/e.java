package Y1;

import android.os.Build;
import androidx.work.n;
import b2.C1842w;
import kotlin.jvm.internal.l;

/* compiled from: ContraintControllers.kt */
/* loaded from: classes.dex */
public final class e extends d<X1.c> {

    /* renamed from: b, reason: collision with root package name */
    public final int f13711b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Z1.h<X1.c> tracker) {
        super(tracker);
        l.f(tracker, "tracker");
        this.f13711b = 7;
    }

    @Override // Y1.d
    public final int a() {
        return this.f13711b;
    }

    @Override // Y1.d
    public final boolean b(C1842w c1842w) {
        return c1842w.f17146j.f16882a == n.CONNECTED;
    }

    @Override // Y1.d
    public final boolean c(X1.c cVar) {
        X1.c value = cVar;
        l.f(value, "value");
        int i = Build.VERSION.SDK_INT;
        boolean z10 = value.f13540a;
        return i >= 26 ? (z10 && value.f13541b) ? false : true : !z10;
    }
}
