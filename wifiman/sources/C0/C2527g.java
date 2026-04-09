package C0;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6839p;

/* renamed from: C0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2527g {

    /* renamed from: a, reason: collision with root package name */
    public static final C2527g f2142a = new C2527g();

    /* renamed from: b, reason: collision with root package name */
    public static InterfaceC6839p f2143b = b0.c.c(-1741544742, false, a.f2144a);

    /* renamed from: C0.g$a */
    static final class a extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final a f2144a = new a();

        a() {
            super(2);
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1741544742, i10, -1, "androidx.compose.ui.layout.ComposableSingletons$SubcomposeLayoutKt.lambda-1.<anonymous> (SubcomposeLayout.kt:473)");
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return Yg.J.f24997a;
        }
    }

    public final InterfaceC6839p a() {
        return f2143b;
    }
}
