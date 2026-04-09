package r;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.z1;
import com.google.ar.core.ImageMetadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.C6486l;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import r.O;
import r.O.a;

/* loaded from: classes.dex */
public abstract class P {

    static final class a extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f59528a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ O.a f59529b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f59530c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ N f59531d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Object obj, O.a aVar, Object obj2, N n10) {
            super(0);
            this.f59528a = obj;
            this.f59529b = aVar;
            this.f59530c = obj2;
            this.f59531d = n10;
        }

        public final void a() {
            if (AbstractC6492s.d(this.f59528a, this.f59529b.g()) && AbstractC6492s.d(this.f59530c, this.f59529b.i())) {
                return;
            }
            this.f59529b.t(this.f59528a, this.f59530c, this.f59531d);
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Yg.J.f24997a;
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ O f59532a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ O.a f59533b;

        public static final class a implements T.K {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ O f59534a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ O.a f59535b;

            public a(O o10, O.a aVar) {
                this.f59534a = o10;
                this.f59535b = aVar;
            }

            @Override // T.K
            public void dispose() {
                this.f59534a.j(this.f59535b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(O o10, O.a aVar) {
            super(1);
            this.f59532a = o10;
            this.f59533b = aVar;
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final T.K invoke(T.L l10) {
            this.f59532a.f(this.f59533b);
            return new a(this.f59532a, this.f59533b);
        }
    }

    public static final z1 a(O o10, float f10, float f11, N n10, String str, InterfaceC3540l interfaceC3540l, int i10, int i11) {
        String str2 = (i11 & 8) != 0 ? "FloatAnimation" : str;
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-644770905, i10, -1, "androidx.compose.animation.core.animateFloat (InfiniteTransition.kt:316)");
        }
        int i12 = i10 << 3;
        z1 z1VarB = b(o10, Float.valueOf(f10), Float.valueOf(f11), u0.f(C6486l.f51726a), n10, str2, interfaceC3540l, (i10 & 1022) | (57344 & i12) | (i12 & ImageMetadata.JPEG_GPS_COORDINATES), 0);
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        return z1VarB;
    }

    public static final z1 b(O o10, Object obj, Object obj2, s0 s0Var, N n10, String str, InterfaceC3540l interfaceC3540l, int i10, int i11) {
        if ((i11 & 16) != 0) {
            str = "ValueAnimation";
        }
        String str2 = str;
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-1062847727, i10, -1, "androidx.compose.animation.core.animateValue (InfiniteTransition.kt:260)");
        }
        Object objF = interfaceC3540l.f();
        InterfaceC3540l.a aVar = InterfaceC3540l.f21100a;
        if (objF == aVar.a()) {
            objF = o10.new a(obj, obj2, s0Var, n10, str2);
            interfaceC3540l.K(objF);
        }
        O.a aVar2 = (O.a) objF;
        boolean z10 = true;
        boolean z11 = ((((i10 & 112) ^ 48) > 32 && interfaceC3540l.l(obj)) || (i10 & 48) == 32) | ((((i10 & 896) ^ 384) > 256 && interfaceC3540l.l(obj2)) || (i10 & 384) == 256);
        if ((((57344 & i10) ^ 24576) <= 16384 || !interfaceC3540l.l(n10)) && (i10 & 24576) != 16384) {
            z10 = false;
        }
        boolean z12 = z11 | z10;
        Object objF2 = interfaceC3540l.f();
        if (z12 || objF2 == aVar.a()) {
            objF2 = new a(obj, aVar2, obj2, n10);
            interfaceC3540l.K(objF2);
        }
        T.O.g((InterfaceC6824a) objF2, interfaceC3540l, 0);
        boolean zL = interfaceC3540l.l(o10);
        Object objF3 = interfaceC3540l.f();
        if (zL || objF3 == aVar.a()) {
            objF3 = new b(o10, aVar2);
            interfaceC3540l.K(objF3);
        }
        T.O.c(aVar2, (InterfaceC6835l) objF3, interfaceC3540l, 6);
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        return aVar2;
    }

    public static final O c(String str, InterfaceC3540l interfaceC3540l, int i10, int i11) {
        if ((i11 & 1) != 0) {
            str = "InfiniteTransition";
        }
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(1013651573, i10, -1, "androidx.compose.animation.core.rememberInfiniteTransition (InfiniteTransition.kt:44)");
        }
        Object objF = interfaceC3540l.f();
        if (objF == InterfaceC3540l.f21100a.a()) {
            objF = new O(str);
            interfaceC3540l.K(objF);
        }
        O o10 = (O) objF;
        o10.k(interfaceC3540l, 0);
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        return o10;
    }
}
