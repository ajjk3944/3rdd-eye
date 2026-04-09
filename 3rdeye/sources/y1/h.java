package Y1;

import android.os.Build;
import androidx.work.n;
import b2.C1842w;
import kotlin.jvm.internal.l;

/* compiled from: ContraintControllers.kt */
/* loaded from: classes.dex */
public final class h extends d<X1.c> {

    /* renamed from: b, reason: collision with root package name */
    public final int f13716b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Z1.h<X1.c> tracker) {
        super(tracker);
        l.f(tracker, "tracker");
        this.f13716b = 7;
    }

    @Override // Y1.d
    public final int a() {
        return this.f13716b;
    }

    @Override // Y1.d
    public final boolean b(C1842w c1842w) {
        n nVar = c1842w.f17146j.f16882a;
        if (nVar != n.UNMETERED) {
            return Build.VERSION.SDK_INT >= 30 && nVar == n.TEMPORARILY_UNMETERED;
        }
        return true;
    }

    @Override // Y1.d
    public final boolean c(X1.c cVar) {
        X1.c value = cVar;
        l.f(value, "value");
        return !value.f13540a || value.f13542c;
    }
}
