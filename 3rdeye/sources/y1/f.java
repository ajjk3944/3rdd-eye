package Y1;

import android.os.Build;
import androidx.work.m;
import androidx.work.n;
import b2.C1842w;
import kotlin.jvm.internal.l;

/* compiled from: ContraintControllers.kt */
/* loaded from: classes.dex */
public final class f extends d<X1.c> {

    /* renamed from: c, reason: collision with root package name */
    public static final String f13712c;

    /* renamed from: b, reason: collision with root package name */
    public final int f13713b;

    static {
        String strG = m.g("NetworkMeteredCtrlr");
        l.e(strG, "tagWithPrefix(\"NetworkMeteredCtrlr\")");
        f13712c = strG;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Z1.h<X1.c> tracker) {
        super(tracker);
        l.f(tracker, "tracker");
        this.f13713b = 7;
    }

    @Override // Y1.d
    public final int a() {
        return this.f13713b;
    }

    @Override // Y1.d
    public final boolean b(C1842w c1842w) {
        return c1842w.f17146j.f16882a == n.METERED;
    }

    @Override // Y1.d
    public final boolean c(X1.c cVar) {
        X1.c value = cVar;
        l.f(value, "value");
        int i = Build.VERSION.SDK_INT;
        boolean z10 = value.f13540a;
        if (i >= 26) {
            return (z10 && value.f13542c) ? false : true;
        }
        m.e().a(f13712c, "Metered network constraint is not supported before API 26, only checking for connected state.");
        return !z10;
    }
}
