package Y1;

import android.os.Build;
import androidx.work.m;
import androidx.work.n;
import b2.C1842w;
import kotlin.jvm.internal.l;

/* compiled from: ContraintControllers.kt */
/* loaded from: classes.dex */
public final class g extends d<X1.c> {

    /* renamed from: c, reason: collision with root package name */
    public static final String f13714c;

    /* renamed from: b, reason: collision with root package name */
    public final int f13715b;

    static {
        String strG = m.g("NetworkNotRoamingCtrlr");
        l.e(strG, "tagWithPrefix(\"NetworkNotRoamingCtrlr\")");
        f13714c = strG;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Z1.h<X1.c> tracker) {
        super(tracker);
        l.f(tracker, "tracker");
        this.f13715b = 7;
    }

    @Override // Y1.d
    public final int a() {
        return this.f13715b;
    }

    @Override // Y1.d
    public final boolean b(C1842w c1842w) {
        return c1842w.f17146j.f16882a == n.NOT_ROAMING;
    }

    @Override // Y1.d
    public final boolean c(X1.c cVar) {
        X1.c value = cVar;
        l.f(value, "value");
        int i = Build.VERSION.SDK_INT;
        boolean z10 = value.f13540a;
        if (i >= 24) {
            return (z10 && value.f13543d) ? false : true;
        }
        m.e().a(f13714c, "Not-roaming network constraint is not supported before API 24, only checking for connected state.");
        return !z10;
    }
}
