package s;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.L0;
import T.X0;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;

/* renamed from: s.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7848i {

    /* renamed from: s.i$a */
    static final class a extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f60768a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f60769b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f60770c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.ui.e eVar, InterfaceC6835l interfaceC6835l, int i10) {
            super(2);
            this.f60768a = eVar;
            this.f60769b = interfaceC6835l;
            this.f60770c = i10;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC7848i.a(this.f60768a, this.f60769b, interfaceC3540l, L0.a(this.f60770c | 1));
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return Yg.J.f24997a;
        }
    }

    public static final void a(androidx.compose.ui.e eVar, InterfaceC6835l interfaceC6835l, InterfaceC3540l interfaceC3540l, int i10) {
        int i11;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-932836462);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(eVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.l(interfaceC6835l) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-932836462, i11, -1, "androidx.compose.foundation.Canvas (Canvas.kt:42)");
            }
            z.a0.a(androidx.compose.ui.draw.b.b(eVar, interfaceC6835l), interfaceC3540lR, 0);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new a(eVar, interfaceC6835l, i10));
        }
    }
}
