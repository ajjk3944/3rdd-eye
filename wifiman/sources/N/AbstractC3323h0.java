package N;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6839p;

/* renamed from: N.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3323h0 {

    /* renamed from: N.h0$a */
    static final class a extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f14450a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f14451b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC6839p interfaceC6839p, int i10) {
            super(2);
            this.f14450a = interfaceC6839p;
            this.f14451b = i10;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC3323h0.a(this.f14450a, interfaceC3540l, T.L0.a(this.f14451b | 1));
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return Yg.J.f24997a;
        }
    }

    public static final void a(InterfaceC6839p interfaceC6839p, InterfaceC3540l interfaceC3540l, int i10) {
        int i11;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-1322912246);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.l(interfaceC6839p) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1322912246, i11, -1, "androidx.compose.material.PlatformMaterialTheme (MaterialTheme.android.kt:21)");
            }
            interfaceC6839p.invoke(interfaceC3540lR, Integer.valueOf(i11 & 14));
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        T.X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new a(interfaceC6839p, i10));
        }
    }
}
