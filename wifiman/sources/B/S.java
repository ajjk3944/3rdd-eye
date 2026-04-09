package B;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import android.os.Build;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes.dex */
public abstract class S {

    /* renamed from: a, reason: collision with root package name */
    private static final a f916a;

    public static final class a implements Q {
        a() {
        }

        @Override // B.Q
        public void a(O o10) {
        }
    }

    static {
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        AbstractC6492s.h(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        f916a = AbstractC6492s.d(lowerCase, "robolectric") ? new a() : null;
    }

    public static final Q a(InterfaceC3540l interfaceC3540l, int i10) {
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(1141871251, i10, -1, "androidx.compose.foundation.lazy.layout.rememberDefaultPrefetchScheduler (PrefetchScheduler.android.kt:32)");
        }
        Q q10 = f916a;
        if (q10 != null) {
            interfaceC3540l.U(1213893039);
            interfaceC3540l.J();
        } else {
            interfaceC3540l.U(1213931944);
            View view = (View) interfaceC3540l.t(AndroidCompositionLocals_androidKt.k());
            boolean zT = interfaceC3540l.T(view);
            Object objF = interfaceC3540l.f();
            if (zT || objF == InterfaceC3540l.f21100a.a()) {
                objF = new RunnableC2437a(view);
                interfaceC3540l.K(objF);
            }
            q10 = (RunnableC2437a) objF;
            interfaceC3540l.J();
        }
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        return q10;
    }
}
