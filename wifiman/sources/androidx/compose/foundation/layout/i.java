package androidx.compose.foundation.layout;

import androidx.compose.ui.platform.AbstractC3964z0;
import androidx.compose.ui.platform.B0;
import f.AbstractC5487d;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6835l;
import z.J;

/* loaded from: classes.dex */
public abstract class i {

    public static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ J f28137a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(J j10) {
            super(1);
            this.f28137a = j10;
        }

        public final void a(B0 b02) {
            throw null;
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            AbstractC5487d.a(obj);
            a(null);
            return Yg.J.f24997a;
        }
    }

    public static final class b extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ J f28138a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(J j10) {
            super(1);
            this.f28138a = j10;
        }

        public final void a(B0 b02) {
            throw null;
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            AbstractC5487d.a(obj);
            a(null);
            return Yg.J.f24997a;
        }
    }

    public static final androidx.compose.ui.e a(androidx.compose.ui.e eVar, J j10) {
        return eVar.b0(new IntrinsicHeightElement(j10, true, AbstractC3964z0.b() ? new a(j10) : AbstractC3964z0.a()));
    }

    public static final androidx.compose.ui.e b(androidx.compose.ui.e eVar, J j10) {
        return eVar.b0(new IntrinsicWidthElement(j10, true, AbstractC3964z0.b() ? new b(j10) : AbstractC3964z0.a()));
    }
}
