package N;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import f.AbstractC5487d;
import kotlin.jvm.internal.AbstractC6494u;

/* renamed from: N.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3340q {

    /* renamed from: a, reason: collision with root package name */
    public static final C3340q f14653a = new C3340q();

    /* renamed from: b, reason: collision with root package name */
    public static mh.q f14654b = b0.c.c(996639038, false, a.f14655a);

    /* renamed from: N.q$a */
    static final class a extends AbstractC6494u implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        public static final a f14655a = new a();

        a() {
            super(3);
        }

        public final void a(H0 h02, InterfaceC3540l interfaceC3540l, int i10) {
            int i11;
            if ((i10 & 6) == 0) {
                i11 = i10 | ((i10 & 8) == 0 ? interfaceC3540l.T(h02) : interfaceC3540l.l(h02) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) == 18 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(996639038, i11, -1, "androidx.compose.material.ComposableSingletons$SnackbarHostKt.lambda-1.<anonymous> (SnackbarHost.kt:156)");
            }
            L0.d(h02, null, false, null, 0L, 0L, 0L, 0.0f, interfaceC3540l, i11 & 14, 254);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            AbstractC5487d.a(obj);
            a(null, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return Yg.J.f24997a;
        }
    }

    public final mh.q a() {
        return f14654b;
    }
}
