package androidx.compose.ui.platform;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6839p;

/* renamed from: androidx.compose.ui.platform.i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3926i0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C3926i0 f29391a = new C3926i0();

    /* renamed from: b, reason: collision with root package name */
    public static InterfaceC6839p f29392b = b0.c.c(-1759434350, false, a.f29393a);

    /* renamed from: androidx.compose.ui.platform.i0$a */
    static final class a extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final a f29393a = new a();

        a() {
            super(2);
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1759434350, i10, -1, "androidx.compose.ui.platform.ComposableSingletons$Wrapper_androidKt.lambda-1.<anonymous> (Wrapper.android.kt:120)");
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
        return f29392b;
    }
}
