package B;

import T.AbstractC3546o;
import T.AbstractC3561w;
import T.I0;
import T.InterfaceC3540l;
import T.L0;
import T.X0;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import org.conscrypt.PSKKeyManager;

/* loaded from: classes.dex */
public abstract class D {

    static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C f874a;

        /* renamed from: B.D$a$a, reason: collision with other inner class name */
        public static final class C0032a implements T.K {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C f875a;

            public C0032a(C c10) {
                this.f875a = c10;
            }

            @Override // T.K
            public void dispose() {
                this.f875a.f();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C c10) {
            super(1);
            this.f874a = c10;
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final T.K invoke(T.L l10) {
            return new C0032a(this.f874a);
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f876a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f877b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ E f878c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f879d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f880e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Object obj, int i10, E e10, InterfaceC6839p interfaceC6839p, int i11) {
            super(2);
            this.f876a = obj;
            this.f877b = i10;
            this.f878c = e10;
            this.f879d = interfaceC6839p;
            this.f880e = i11;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            D.a(this.f876a, this.f877b, this.f878c, this.f879d, interfaceC3540l, L0.a(this.f880e | 1));
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return Yg.J.f24997a;
        }
    }

    public static final void a(Object obj, int i10, E e10, InterfaceC6839p interfaceC6839p, InterfaceC3540l interfaceC3540l, int i11) {
        int i12;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-2079116560);
        if ((i11 & 6) == 0) {
            i12 = (interfaceC3540lR.l(obj) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= interfaceC3540lR.i(i10) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= interfaceC3540lR.l(e10) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= interfaceC3540lR.l(interfaceC6839p) ? 2048 : 1024;
        }
        if ((i12 & 1171) == 1170 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-2079116560, i12, -1, "androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItem (LazyLayoutPinnableItem.kt:52)");
            }
            boolean zT = interfaceC3540lR.T(obj) | interfaceC3540lR.T(e10);
            Object objF = interfaceC3540lR.f();
            if (zT || objF == InterfaceC3540l.f21100a.a()) {
                objF = new C(obj, e10);
                interfaceC3540lR.K(objF);
            }
            C c10 = (C) objF;
            c10.g(i10);
            c10.i((C0.L) interfaceC3540lR.t(C0.M.a()));
            boolean zT2 = interfaceC3540lR.T(c10);
            Object objF2 = interfaceC3540lR.f();
            if (zT2 || objF2 == InterfaceC3540l.f21100a.a()) {
                objF2 = new a(c10);
                interfaceC3540lR.K(objF2);
            }
            T.O.c(c10, (InterfaceC6835l) objF2, interfaceC3540lR, 0);
            AbstractC3561w.a(C0.M.a().d(c10), interfaceC6839p, interfaceC3540lR, ((i12 >> 6) & 112) | I0.f20869i);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new b(obj, i10, e10, interfaceC6839p, i11));
        }
    }
}
