package androidx.compose.foundation.layout;

import Yg.J;
import androidx.compose.ui.platform.B0;
import f.AbstractC5487d;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6835l;

/* loaded from: classes.dex */
public abstract class l {

    static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f28142a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f28143b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(float f10, float f11) {
            super(1);
            this.f28142a = f10;
            this.f28143b = f11;
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

    static final class b extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f28144a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC6835l interfaceC6835l) {
            super(1);
            this.f28144a = interfaceC6835l;
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

    public static final androidx.compose.ui.e a(androidx.compose.ui.e eVar, InterfaceC6835l interfaceC6835l) {
        return eVar.b0(new OffsetPxModifier(interfaceC6835l, true, new b(interfaceC6835l)));
    }

    public static final androidx.compose.ui.e b(androidx.compose.ui.e eVar, float f10, float f11) {
        return eVar.b0(new OffsetModifierElement(f10, f11, true, new a(f10, f11), null));
    }

    public static /* synthetic */ androidx.compose.ui.e c(androidx.compose.ui.e eVar, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = Y0.h.j(0);
        }
        if ((i10 & 2) != 0) {
            f11 = Y0.h.j(0);
        }
        return b(eVar, f10, f11);
    }
}
