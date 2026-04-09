package androidx.compose.ui.viewinterop;

import E0.G;
import E0.InterfaceC2629g;
import E0.m0;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.AbstractC3550q;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3563x;
import T.L0;
import T.X0;
import Y0.t;
import Yg.J;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.InterfaceC4017o;
import c0.AbstractC4181j;
import c0.InterfaceC4179h;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import org.conscrypt.PSKKeyManager;
import q2.InterfaceC7418f;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    private static final InterfaceC6835l f29822a = h.f29840a;

    static final class a extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f29823a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f29824b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f29825c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f29826d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f29827e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC6835l interfaceC6835l, androidx.compose.ui.e eVar, InterfaceC6835l interfaceC6835l2, int i10, int i11) {
            super(2);
            this.f29823a = interfaceC6835l;
            this.f29824b = eVar;
            this.f29825c = interfaceC6835l2;
            this.f29826d = i10;
            this.f29827e = i11;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            e.a(this.f29823a, this.f29824b, this.f29825c, interfaceC3540l, L0.a(this.f29826d | 1), this.f29827e);
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return J.f24997a;
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final b f29828a = new b();

        b() {
            super(2);
        }

        public final void a(G g10, InterfaceC6835l interfaceC6835l) {
            e.f(g10).setResetBlock(interfaceC6835l);
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((G) obj, (InterfaceC6835l) obj2);
            return J.f24997a;
        }
    }

    static final class c extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final c f29829a = new c();

        c() {
            super(2);
        }

        public final void a(G g10, InterfaceC6835l interfaceC6835l) {
            e.f(g10).setUpdateBlock(interfaceC6835l);
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((G) obj, (InterfaceC6835l) obj2);
            return J.f24997a;
        }
    }

    static final class d extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final d f29830a = new d();

        d() {
            super(2);
        }

        public final void a(G g10, InterfaceC6835l interfaceC6835l) {
            e.f(g10).setReleaseBlock(interfaceC6835l);
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((G) obj, (InterfaceC6835l) obj2);
            return J.f24997a;
        }
    }

    /* renamed from: androidx.compose.ui.viewinterop.e$e, reason: collision with other inner class name */
    static final class C1081e extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final C1081e f29831a = new C1081e();

        C1081e() {
            super(2);
        }

        public final void a(G g10, InterfaceC6835l interfaceC6835l) {
            e.f(g10).setUpdateBlock(interfaceC6835l);
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((G) obj, (InterfaceC6835l) obj2);
            return J.f24997a;
        }
    }

    static final class f extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final f f29832a = new f();

        f() {
            super(2);
        }

        public final void a(G g10, InterfaceC6835l interfaceC6835l) {
            e.f(g10).setReleaseBlock(interfaceC6835l);
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((G) obj, (InterfaceC6835l) obj2);
            return J.f24997a;
        }
    }

    static final class g extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f29833a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f29834b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f29835c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f29836d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f29837e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f29838f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f29839g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(InterfaceC6835l interfaceC6835l, androidx.compose.ui.e eVar, InterfaceC6835l interfaceC6835l2, InterfaceC6835l interfaceC6835l3, InterfaceC6835l interfaceC6835l4, int i10, int i11) {
            super(2);
            this.f29833a = interfaceC6835l;
            this.f29834b = eVar;
            this.f29835c = interfaceC6835l2;
            this.f29836d = interfaceC6835l3;
            this.f29837e = interfaceC6835l4;
            this.f29838f = i10;
            this.f29839g = i11;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            e.b(this.f29833a, this.f29834b, this.f29835c, this.f29836d, this.f29837e, interfaceC3540l, L0.a(this.f29838f | 1), this.f29839g);
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return J.f24997a;
        }
    }

    static final class h extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final h f29840a = new h();

        h() {
            super(1);
        }

        public final void a(View view) {
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((View) obj);
            return J.f24997a;
        }
    }

    static final class i extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f29841a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f29842b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC3550q f29843c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC4179h f29844d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f29845e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ View f29846f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(Context context, InterfaceC6835l interfaceC6835l, AbstractC3550q abstractC3550q, InterfaceC4179h interfaceC4179h, int i10, View view) {
            super(0);
            this.f29841a = context;
            this.f29842b = interfaceC6835l;
            this.f29843c = abstractC3550q;
            this.f29844d = interfaceC4179h;
            this.f29845e = i10;
            this.f29846f = view;
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final G invoke() {
            Context context = this.f29841a;
            InterfaceC6835l interfaceC6835l = this.f29842b;
            AbstractC3550q abstractC3550q = this.f29843c;
            InterfaceC4179h interfaceC4179h = this.f29844d;
            int i10 = this.f29845e;
            KeyEvent.Callback callback = this.f29846f;
            AbstractC6492s.g(callback, "null cannot be cast to non-null type androidx.compose.ui.node.Owner");
            return new androidx.compose.ui.viewinterop.i(context, interfaceC6835l, abstractC3550q, interfaceC4179h, i10, (m0) callback).getLayoutNode();
        }
    }

    static final class j extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final j f29847a = new j();

        j() {
            super(2);
        }

        public final void a(G g10, androidx.compose.ui.e eVar) {
            e.f(g10).setModifier(eVar);
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((G) obj, (androidx.compose.ui.e) obj2);
            return J.f24997a;
        }
    }

    static final class k extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final k f29848a = new k();

        k() {
            super(2);
        }

        public final void a(G g10, Y0.d dVar) {
            e.f(g10).setDensity(dVar);
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((G) obj, (Y0.d) obj2);
            return J.f24997a;
        }
    }

    static final class l extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final l f29849a = new l();

        l() {
            super(2);
        }

        public final void a(G g10, InterfaceC4017o interfaceC4017o) {
            e.f(g10).setLifecycleOwner(interfaceC4017o);
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((G) obj, (InterfaceC4017o) obj2);
            return J.f24997a;
        }
    }

    static final class m extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final m f29850a = new m();

        m() {
            super(2);
        }

        public final void a(G g10, InterfaceC7418f interfaceC7418f) {
            e.f(g10).setSavedStateRegistryOwner(interfaceC7418f);
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((G) obj, (InterfaceC7418f) obj2);
            return J.f24997a;
        }
    }

    static final class n extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final n f29851a = new n();

        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f29852a;

            static {
                int[] iArr = new int[t.values().length];
                try {
                    iArr[t.Ltr.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[t.Rtl.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f29852a = iArr;
            }
        }

        n() {
            super(2);
        }

        public final void a(G g10, t tVar) {
            androidx.compose.ui.viewinterop.i iVarF = e.f(g10);
            int i10 = a.f29852a[tVar.ordinal()];
            int i11 = 1;
            if (i10 == 1) {
                i11 = 0;
            } else if (i10 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            iVarF.setLayoutDirection(i11);
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((G) obj, (t) obj2);
            return J.f24997a;
        }
    }

    public static final void a(InterfaceC6835l interfaceC6835l, androidx.compose.ui.e eVar, InterfaceC6835l interfaceC6835l2, InterfaceC3540l interfaceC3540l, int i10, int i11) {
        int i12;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-1783766393);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (interfaceC3540lR.l(interfaceC6835l) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= interfaceC3540lR.T(eVar) ? 32 : 16;
        }
        int i14 = i11 & 4;
        if (i14 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= interfaceC3540lR.l(interfaceC6835l2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i12 & 147) == 146 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (i13 != 0) {
                eVar = androidx.compose.ui.e.f28771b0;
            }
            if (i14 != 0) {
                interfaceC6835l2 = f29822a;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1783766393, i12, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:107)");
            }
            b(interfaceC6835l, eVar, null, f29822a, interfaceC6835l2, interfaceC3540lR, (i12 & 14) | 3072 | (i12 & 112) | ((i12 << 6) & 57344), 4);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        androidx.compose.ui.e eVar2 = eVar;
        InterfaceC6835l interfaceC6835l3 = interfaceC6835l2;
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new a(interfaceC6835l, eVar2, interfaceC6835l3, i10, i11));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x019d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(mh.InterfaceC6835l r21, androidx.compose.ui.e r22, mh.InterfaceC6835l r23, mh.InterfaceC6835l r24, mh.InterfaceC6835l r25, T.InterfaceC3540l r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 431
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.viewinterop.e.b(mh.l, androidx.compose.ui.e, mh.l, mh.l, mh.l, T.l, int, int):void");
    }

    private static final InterfaceC6824a d(InterfaceC6835l interfaceC6835l, InterfaceC3540l interfaceC3540l, int i10) {
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(2030558801, i10, -1, "androidx.compose.ui.viewinterop.createAndroidViewNodeFactory (AndroidView.android.kt:266)");
        }
        int iA = AbstractC3536j.a(interfaceC3540l, 0);
        Context context = (Context) interfaceC3540l.t(AndroidCompositionLocals_androidKt.g());
        AbstractC3550q abstractC3550qD = AbstractC3536j.d(interfaceC3540l, 0);
        InterfaceC4179h interfaceC4179h = (InterfaceC4179h) interfaceC3540l.t(AbstractC4181j.d());
        View view = (View) interfaceC3540l.t(AndroidCompositionLocals_androidKt.k());
        boolean zL = interfaceC3540l.l(context) | ((((i10 & 14) ^ 6) > 4 && interfaceC3540l.T(interfaceC6835l)) || (i10 & 6) == 4) | interfaceC3540l.l(abstractC3550qD) | interfaceC3540l.l(interfaceC4179h) | interfaceC3540l.i(iA) | interfaceC3540l.l(view);
        Object objF = interfaceC3540l.f();
        if (zL || objF == InterfaceC3540l.f21100a.a()) {
            objF = new i(context, interfaceC6835l, abstractC3550qD, interfaceC4179h, iA, view);
            interfaceC3540l.K(objF);
        }
        InterfaceC6824a interfaceC6824a = (InterfaceC6824a) objF;
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        return interfaceC6824a;
    }

    public static final InterfaceC6835l e() {
        return f29822a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.viewinterop.i f(G g10) {
        androidx.compose.ui.viewinterop.c cVarS = g10.S();
        if (cVarS != null) {
            return (androidx.compose.ui.viewinterop.i) cVarS;
        }
        B0.a.c("Required value was null.");
        throw new KotlinNothingValueException();
    }

    private static final void g(InterfaceC3540l interfaceC3540l, androidx.compose.ui.e eVar, int i10, Y0.d dVar, InterfaceC4017o interfaceC4017o, InterfaceC7418f interfaceC7418f, t tVar, InterfaceC3563x interfaceC3563x) {
        InterfaceC2629g.a aVar = InterfaceC2629g.f3916K;
        E1.c(interfaceC3540l, interfaceC3563x, aVar.g());
        E1.c(interfaceC3540l, eVar, j.f29847a);
        E1.c(interfaceC3540l, dVar, k.f29848a);
        E1.c(interfaceC3540l, interfaceC4017o, l.f29849a);
        E1.c(interfaceC3540l, interfaceC7418f, m.f29850a);
        E1.c(interfaceC3540l, tVar, n.f29851a);
        InterfaceC6839p interfaceC6839pB = aVar.b();
        if (interfaceC3540l.o() || !AbstractC6492s.d(interfaceC3540l.f(), Integer.valueOf(i10))) {
            interfaceC3540l.K(Integer.valueOf(i10));
            interfaceC3540l.Q(Integer.valueOf(i10), interfaceC6839pB);
        }
    }
}
