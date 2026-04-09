package androidx.compose.foundation;

import E0.V;
import Yg.J;
import androidx.compose.ui.platform.AbstractC3964z0;
import androidx.compose.ui.platform.B0;
import androidx.compose.ui.platform.C3962y0;
import f.AbstractC5487d;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6835l;
import s.AbstractC7829B;
import s.C7862x;
import y.InterfaceC8558m;

/* loaded from: classes.dex */
public abstract class FocusableKt {

    /* renamed from: a, reason: collision with root package name */
    private static final C3962y0 f27697a;

    /* renamed from: b, reason: collision with root package name */
    private static final FocusableKt$FocusableInNonTouchModeElement$1 f27698b;

    static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final a f27699a = new a();

        a() {
            super(1);
        }

        public final void a(androidx.compose.ui.focus.k kVar) {
            kVar.w(false);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((androidx.compose.ui.focus.k) obj);
            return J.f24997a;
        }
    }

    public static final class b extends AbstractC6494u implements InterfaceC6835l {
        public b() {
            super(1);
        }

        public final void a(B0 b02) {
            throw null;
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            AbstractC5487d.a(obj);
            a(null);
            return J.f24997a;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.foundation.FocusableKt$FocusableInNonTouchModeElement$1] */
    static {
        f27697a = new C3962y0(AbstractC3964z0.b() ? new b() : AbstractC3964z0.a());
        f27698b = new V() { // from class: androidx.compose.foundation.FocusableKt$FocusableInNonTouchModeElement$1
            @Override // E0.V
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public C7862x a() {
                return new C7862x();
            }

            @Override // E0.V
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public void c(C7862x node) {
            }

            public boolean equals(Object other) {
                return this == other;
            }

            public int hashCode() {
                return AbstractC7829B.a(this);
            }
        };
    }

    public static final androidx.compose.ui.e a(androidx.compose.ui.e eVar) {
        return androidx.compose.ui.focus.i.a(androidx.compose.ui.focus.m.a(eVar.b0(f27697a), a.f27699a));
    }

    public static final androidx.compose.ui.e b(androidx.compose.ui.e eVar, boolean z10, InterfaceC8558m interfaceC8558m) {
        return eVar.b0(z10 ? new FocusableElement(interfaceC8558m) : androidx.compose.ui.e.f28771b0);
    }
}
