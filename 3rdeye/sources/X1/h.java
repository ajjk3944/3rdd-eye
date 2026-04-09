package X1;

import A9.A;
import A9.C0572d0;
import A9.C0575f;
import A9.C0599r0;
import A9.F;
import androidx.work.m;
import b2.C1842w;
import kotlin.jvm.internal.l;

/* compiled from: WorkConstraintsTracker.kt */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final String f13557a;

    static {
        String strG = m.g("WorkConstraintsTracker");
        l.e(strG, "tagWithPrefix(\"WorkConstraintsTracker\")");
        f13557a = strG;
    }

    public static final C0599r0 a(e eVar, C1842w c1842w, A dispatcher, d listener) {
        l.f(eVar, "<this>");
        l.f(dispatcher, "dispatcher");
        l.f(listener, "listener");
        C0599r0 c0599r0A = C0572d0.a();
        C0575f.e(F.a(dispatcher.plus(c0599r0A)), null, null, new g(eVar, c1842w, listener, null), 3);
        return c0599r0A;
    }
}
