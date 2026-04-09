package pf;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import Yg.J;
import com.google.ar.core.ImageMetadata;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6824a;
import mh.s;
import org.conscrypt.PSKKeyManager;
import w9.p;
import w9.r;

/* renamed from: pf.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7318a {

    /* renamed from: a, reason: collision with root package name */
    public static final C7318a f57881a = new C7318a();

    /* renamed from: b, reason: collision with root package name */
    public static s f57882b = b0.c.c(-639350292, false, C2036a.f57883a);

    /* renamed from: pf.a$a, reason: collision with other inner class name */
    static final class C2036a implements s {

        /* renamed from: a, reason: collision with root package name */
        public static final C2036a f57883a = new C2036a();

        C2036a() {
        }

        @Override // mh.s
        public /* bridge */ /* synthetic */ Object K(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            a((androidx.compose.ui.e) obj, (String) obj2, (InterfaceC6824a) obj3, (InterfaceC3540l) obj4, ((Number) obj5).intValue());
            return J.f24997a;
        }

        public final void a(androidx.compose.ui.e mdf, String str, InterfaceC6824a onClick, InterfaceC3540l interfaceC3540l, int i10) {
            int i11;
            AbstractC6492s.i(mdf, "mdf");
            AbstractC6492s.i(onClick, "onClick");
            if ((i10 & 6) == 0) {
                i11 = (interfaceC3540l.T(mdf) ? 4 : 2) | i10;
            } else {
                i11 = i10;
            }
            if ((i10 & 48) == 0) {
                i11 |= interfaceC3540l.T(str) ? 32 : 16;
            }
            if ((i10 & 384) == 0) {
                i11 |= interfaceC3540l.l(onClick) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
            }
            if ((i11 & 1171) == 1170 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-639350292, i11, -1, "com.ui.wifiman.ui.sso.account.ComposableSingletons$SSOAccountPickerDialogsKt.lambda-1.<anonymous> (SSOAccountPickerDialogs.kt:31)");
            }
            if (str != null) {
                r.b(mdf, onClick, false, false, null, p.ALERT, str, null, interfaceC3540l, (i11 & 14) | ImageMetadata.EDGE_MODE | ((i11 >> 3) & 112), 156);
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
    }

    public final s a() {
        return f57882b;
    }
}
