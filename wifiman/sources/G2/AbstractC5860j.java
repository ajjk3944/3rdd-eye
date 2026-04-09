package g2;

import T.AbstractC3546o;
import T.AbstractC3561w;
import T.I0;
import T.InterfaceC3540l;
import T.L0;
import T.X0;
import Yg.J;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.InterfaceC4011i;
import androidx.lifecycle.N;
import androidx.lifecycle.S;
import b2.AbstractC4056a;
import c0.InterfaceC4176e;
import c2.AbstractC4197c;
import c2.C4195a;
import f2.C5512k;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.O;
import mh.InterfaceC6839p;
import org.conscrypt.PSKKeyManager;

/* renamed from: g2.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5860j {

    /* renamed from: g2.j$a */
    static final class a extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC4176e f47582a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f47583b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC4176e interfaceC4176e, InterfaceC6839p interfaceC6839p) {
            super(2);
            this.f47582a = interfaceC4176e;
            this.f47583b = interfaceC6839p;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-52928304, i10, -1, "androidx.navigation.compose.LocalOwnersProvider.<anonymous> (NavBackStackEntryProvider.kt:51)");
            }
            AbstractC5860j.b(this.f47582a, this.f47583b, interfaceC3540l, 0);
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

    /* renamed from: g2.j$b */
    static final class b extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C5512k f47584a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC4176e f47585b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f47586c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f47587d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C5512k c5512k, InterfaceC4176e interfaceC4176e, InterfaceC6839p interfaceC6839p, int i10) {
            super(2);
            this.f47584a = c5512k;
            this.f47585b = interfaceC4176e;
            this.f47586c = interfaceC6839p;
            this.f47587d = i10;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC5860j.a(this.f47584a, this.f47585b, this.f47586c, interfaceC3540l, L0.a(this.f47587d | 1));
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return J.f24997a;
        }
    }

    /* renamed from: g2.j$c */
    static final class c extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC4176e f47588a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f47589b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f47590c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(InterfaceC4176e interfaceC4176e, InterfaceC6839p interfaceC6839p, int i10) {
            super(2);
            this.f47588a = interfaceC4176e;
            this.f47589b = interfaceC6839p;
            this.f47590c = i10;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC5860j.b(this.f47588a, this.f47589b, interfaceC3540l, L0.a(this.f47590c | 1));
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return J.f24997a;
        }
    }

    public static final void a(C5512k c5512k, InterfaceC4176e interfaceC4176e, InterfaceC6839p interfaceC6839p, InterfaceC3540l interfaceC3540l, int i10) {
        int i11;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-1579360880);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.l(c5512k) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.l(interfaceC4176e) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= interfaceC3540lR.l(interfaceC6839p) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i11 & 147) == 146 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1579360880, i11, -1, "androidx.navigation.compose.LocalOwnersProvider (NavBackStackEntryProvider.kt:45)");
            }
            AbstractC3561w.b(new I0[]{C4195a.f33733a.b(c5512k), Z1.a.a().d(c5512k), AndroidCompositionLocals_androidKt.j().d(c5512k)}, b0.c.e(-52928304, true, new a(interfaceC4176e, interfaceC6839p), interfaceC3540lR, 54), interfaceC3540lR, I0.f20869i | 48);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new b(c5512k, interfaceC4176e, interfaceC6839p, i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(InterfaceC4176e interfaceC4176e, InterfaceC6839p interfaceC6839p, InterfaceC3540l interfaceC3540l, int i10) {
        int i11;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(1211832233);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.l(interfaceC4176e) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.l(interfaceC6839p) ? 32 : 16;
        }
        int i12 = i11;
        if ((i12 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1211832233, i12, -1, "androidx.navigation.compose.SaveableStateProvider (NavBackStackEntryProvider.kt:56)");
            }
            interfaceC3540lR.e(1729797275);
            S sA = C4195a.f33733a.a(interfaceC3540lR, 6);
            if (sA == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            N nC = AbstractC4197c.c(O.b(C5851a.class), sA, null, null, sA instanceof InterfaceC4011i ? ((InterfaceC4011i) sA).h() : AbstractC4056a.C1139a.f32794b, interfaceC3540lR, 0, 0);
            interfaceC3540lR.P();
            C5851a c5851a = (C5851a) nC;
            c5851a.Z(new WeakReference(interfaceC4176e));
            interfaceC4176e.d(c5851a.X(), interfaceC6839p, interfaceC3540lR, (i12 & 112) | ((i12 << 6) & 896));
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new c(interfaceC4176e, interfaceC6839p, i10));
        }
    }
}
