package F;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6839p;

/* renamed from: F.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2720j {

    /* renamed from: a, reason: collision with root package name */
    public static final C2720j f5353a = new C2720j();

    /* renamed from: b, reason: collision with root package name */
    public static mh.q f5354b = b0.c.c(671295101, false, a.f5355a);

    /* renamed from: F.j$a */
    static final class a extends AbstractC6494u implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        public static final a f5355a = new a();

        a() {
            super(3);
        }

        public final void a(InterfaceC6839p interfaceC6839p, InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 6) == 0) {
                i10 |= interfaceC3540l.l(interfaceC6839p) ? 4 : 2;
            }
            if ((i10 & 19) == 18 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(671295101, i10, -1, "androidx.compose.foundation.text.ComposableSingletons$CoreTextFieldKt.lambda-1.<anonymous> (CoreTextField.kt:219)");
            }
            interfaceC6839p.invoke(interfaceC3540l, Integer.valueOf(i10 & 14));
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            a((InterfaceC6839p) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return Yg.J.f24997a;
        }
    }

    public final mh.q a() {
        return f5354b;
    }
}
