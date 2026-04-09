package androidx.compose.ui.window;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import Yg.J;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6839p;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f29929a = new f();

    /* renamed from: b, reason: collision with root package name */
    public static InterfaceC6839p f29930b = b0.c.c(210148896, false, a.f29931a);

    static final class a extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final a f29931a = new a();

        a() {
            super(2);
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(210148896, i10, -1, "androidx.compose.ui.window.ComposableSingletons$AndroidDialog_androidKt.lambda-1.<anonymous> (AndroidDialog.android.kt:227)");
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return J.f24997a;
        }
    }

    public final InterfaceC6839p a() {
        return f29930b;
    }
}
