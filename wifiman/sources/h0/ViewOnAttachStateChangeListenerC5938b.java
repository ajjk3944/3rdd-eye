package h0;

import E0.G;
import E0.m0;
import J0.n;
import J0.q;
import L0.C3174d;
import L0.L;
import L0.M;
import Y0.v;
import Yg.J;
import Zg.AbstractC3689v;
import Zg.S;
import a1.AbstractC3750a;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.LongSparseArray;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationResponse;
import androidx.compose.ui.platform.AbstractC3936l1;
import androidx.compose.ui.platform.C3930j1;
import androidx.compose.ui.platform.C3933k1;
import androidx.compose.ui.platform.r;
import androidx.lifecycle.InterfaceC4007e;
import androidx.lifecycle.InterfaceC4017o;
import dh.InterfaceC5380e;
import h0.ViewOnAttachStateChangeListenerC5938b;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l0.C6533i;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import o.AbstractC7022m;
import o.AbstractC7023n;
import o.C7002A;
import o.C7011b;
import o.z;
import org.snmp4j.mp.PduHandle;

/* renamed from: h0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC5938b implements l, InterfaceC4007e, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    private final r f48306a;

    /* renamed from: b, reason: collision with root package name */
    private InterfaceC6824a f48307b;

    /* renamed from: c, reason: collision with root package name */
    private androidx.compose.ui.platform.coreshims.c f48308c;

    /* renamed from: d, reason: collision with root package name */
    private final z f48309d;

    /* renamed from: e, reason: collision with root package name */
    private final C7002A f48310e;

    /* renamed from: i, reason: collision with root package name */
    private final C7011b f48314i;

    /* renamed from: m, reason: collision with root package name */
    private long f48318m;

    /* renamed from: o, reason: collision with root package name */
    private C3930j1 f48320o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f48321p;

    /* renamed from: f, reason: collision with root package name */
    private long f48311f = 100;

    /* renamed from: g, reason: collision with root package name */
    private a f48312g = a.SHOW_ORIGINAL;

    /* renamed from: h, reason: collision with root package name */
    private boolean f48313h = true;

    /* renamed from: j, reason: collision with root package name */
    private final Ki.g f48315j = Ki.j.b(1, null, null, 6, null);

    /* renamed from: k, reason: collision with root package name */
    private final Handler f48316k = new Handler(Looper.getMainLooper());

    /* renamed from: l, reason: collision with root package name */
    private AbstractC7022m f48317l = AbstractC7023n.a();

    /* renamed from: n, reason: collision with root package name */
    private z f48319n = AbstractC7023n.b();

    /* renamed from: q, reason: collision with root package name */
    private final Runnable f48322q = new Runnable() { // from class: h0.a
        @Override // java.lang.Runnable
        public final void run() {
            ViewOnAttachStateChangeListenerC5938b.i(this.f48305a);
        }
    };

    /* renamed from: h0.b$a */
    private enum a {
        SHOW_ORIGINAL,
        SHOW_TRANSLATED
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h0.b$b, reason: collision with other inner class name */
    static final class C1787b {

        /* renamed from: a, reason: collision with root package name */
        public static final C1787b f48323a = new C1787b();

        private C1787b() {
        }

        private final void b(ViewOnAttachStateChangeListenerC5938b viewOnAttachStateChangeListenerC5938b, LongSparseArray longSparseArray) {
            TranslationResponseValue value;
            CharSequence text;
            C3933k1 c3933k1;
            n nVarB;
            J0.a aVar;
            InterfaceC6835l interfaceC6835l;
            S sA = E1.c.a(longSparseArray);
            while (sA.hasNext()) {
                long jD = sA.d();
                ViewTranslationResponse viewTranslationResponseA = h.a(longSparseArray.get(jD));
                if (viewTranslationResponseA != null && (value = viewTranslationResponseA.getValue("android:text")) != null && (text = value.getText()) != null && (c3933k1 = (C3933k1) viewOnAttachStateChangeListenerC5938b.k().c((int) jD)) != null && (nVarB = c3933k1.b()) != null && (aVar = (J0.a) J0.k.a(nVarB.w(), J0.i.f9619a.z())) != null && (interfaceC6835l = (InterfaceC6835l) aVar.a()) != null) {
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(ViewOnAttachStateChangeListenerC5938b viewOnAttachStateChangeListenerC5938b, LongSparseArray longSparseArray) {
            f48323a.b(viewOnAttachStateChangeListenerC5938b, longSparseArray);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0073  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void c(h0.ViewOnAttachStateChangeListenerC5938b r21, long[] r22, int[] r23, java.util.function.Consumer<android.view.translation.ViewTranslationRequest> r24) {
            /*
                r20 = this;
                r0 = r22
                int r1 = r0.length
                r2 = 0
            L4:
                if (r2 >= r1) goto L78
                r3 = r0[r2]
                o.m r5 = r21.k()
                int r3 = (int) r3
                java.lang.Object r3 = r5.c(r3)
                androidx.compose.ui.platform.k1 r3 = (androidx.compose.ui.platform.C3933k1) r3
                if (r3 == 0) goto L73
                J0.n r3 = r3.b()
                if (r3 == 0) goto L73
                h0.AbstractC5943g.a()
                androidx.compose.ui.platform.r r4 = r21.l()
                android.view.autofill.AutofillId r4 = r4.getAutofillId()
                int r5 = r3.o()
                long r5 = (long) r5
                android.view.translation.ViewTranslationRequest$Builder r4 = h0.AbstractC5942f.a(r4, r5)
                J0.j r3 = r3.w()
                J0.q r5 = J0.q.f9676a
                J0.v r5 = r5.D()
                java.lang.Object r3 = J0.k.a(r3, r5)
                r5 = r3
                java.util.List r5 = (java.util.List) r5
                if (r5 == 0) goto L73
                r12 = 62
                r13 = 0
                java.lang.String r6 = "\n"
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                java.lang.String r15 = a1.AbstractC3750a.e(r5, r6, r7, r8, r9, r10, r11, r12, r13)
                if (r15 == 0) goto L73
                L0.d r3 = new L0.d
                r16 = 0
                r17 = 0
                r18 = 6
                r19 = 0
                r14 = r3
                r14.<init>(r15, r16, r17, r18, r19)
                java.lang.String r5 = "android:text"
                android.view.translation.TranslationRequestValue r3 = h0.AbstractC5939c.a(r3)
                h0.AbstractC5940d.a(r4, r5, r3)
                android.view.translation.ViewTranslationRequest r3 = h0.AbstractC5941e.a(r4)
                r4 = r24
                r4.accept(r3)
                goto L75
            L73:
                r4 = r24
            L75:
                int r2 = r2 + 1
                goto L4
            L78:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: h0.ViewOnAttachStateChangeListenerC5938b.C1787b.c(h0.b, long[], int[], java.util.function.Consumer):void");
        }

        public final void d(final ViewOnAttachStateChangeListenerC5938b viewOnAttachStateChangeListenerC5938b, final LongSparseArray<ViewTranslationResponse> longSparseArray) {
            if (Build.VERSION.SDK_INT < 31) {
                return;
            }
            if (AbstractC6492s.d(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                b(viewOnAttachStateChangeListenerC5938b, longSparseArray);
            } else {
                viewOnAttachStateChangeListenerC5938b.l().post(new Runnable() { // from class: h0.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        ViewOnAttachStateChangeListenerC5938b.C1787b.e(viewOnAttachStateChangeListenerC5938b, longSparseArray);
                    }
                });
            }
        }
    }

    /* renamed from: h0.b$c */
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f48324a;

        /* renamed from: b, reason: collision with root package name */
        Object f48325b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f48326c;

        /* renamed from: e, reason: collision with root package name */
        int f48328e;

        c(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f48326c = obj;
            this.f48328e |= PduHandle.NONE;
            return ViewOnAttachStateChangeListenerC5938b.this.b(this);
        }
    }

    public ViewOnAttachStateChangeListenerC5938b(r rVar, InterfaceC6824a interfaceC6824a) {
        this.f48306a = rVar;
        this.f48307b = interfaceC6824a;
        int i10 = 0;
        int i11 = 1;
        DefaultConstructorMarker defaultConstructorMarker = null;
        this.f48309d = new z(i10, i11, defaultConstructorMarker);
        this.f48310e = new C7002A(i10, i11, defaultConstructorMarker);
        this.f48314i = new C7011b(i10, i11, defaultConstructorMarker);
        this.f48320o = new C3930j1(rVar.getSemanticsOwner().a(), AbstractC7023n.a());
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void A(J0.n r17, androidx.compose.ui.platform.C3930j1 r18) {
        /*
            r16 = this;
            r0 = r16
            o.A r1 = new o.A
            r2 = 1
            r3 = 0
            r4 = 0
            r1.<init>(r4, r2, r3)
            java.util.List r2 = r17.t()
            int r3 = r2.size()
            r5 = r4
        L13:
            if (r5 >= r3) goto L49
            java.lang.Object r6 = r2.get(r5)
            J0.n r6 = (J0.n) r6
            o.m r7 = r16.k()
            int r8 = r6.o()
            boolean r7 = r7.a(r8)
            if (r7 == 0) goto L46
            o.A r7 = r18.a()
            int r8 = r6.o()
            boolean r7 = r7.a(r8)
            if (r7 != 0) goto L3f
            E0.G r1 = r17.q()
            r0.q(r1)
            return
        L3f:
            int r6 = r6.o()
            r1.f(r6)
        L46:
            int r5 = r5 + 1
            goto L13
        L49:
            o.A r2 = r18.a()
            int[] r3 = r2.f54988b
            long[] r2 = r2.f54987a
            int r5 = r2.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L9a
            r6 = r4
        L57:
            r7 = r2[r6]
            long r9 = ~r7
            r11 = 7
            long r9 = r9 << r11
            long r9 = r9 & r7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r11
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L95
            int r9 = r6 - r5
            int r9 = ~r9
            int r9 = r9 >>> 31
            r10 = 8
            int r9 = 8 - r9
            r11 = r4
        L71:
            if (r11 >= r9) goto L93
            r12 = 255(0xff, double:1.26E-321)
            long r12 = r12 & r7
            r14 = 128(0x80, double:6.3E-322)
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 >= 0) goto L8f
            int r12 = r6 << 3
            int r12 = r12 + r11
            r12 = r3[r12]
            boolean r12 = r1.a(r12)
            if (r12 != 0) goto L8f
            E0.G r1 = r17.q()
            r0.q(r1)
            return
        L8f:
            long r7 = r7 >> r10
            int r11 = r11 + 1
            goto L71
        L93:
            if (r9 != r10) goto L9a
        L95:
            if (r6 == r5) goto L9a
            int r6 = r6 + 1
            goto L57
        L9a:
            java.util.List r1 = r17.t()
            int r2 = r1.size()
        La2:
            if (r4 >= r2) goto Ld8
            java.lang.Object r3 = r1.get(r4)
            J0.n r3 = (J0.n) r3
            o.m r5 = r16.k()
            int r6 = r3.o()
            boolean r5 = r5.a(r6)
            if (r5 == 0) goto Ld5
            o.z r5 = r0.f48319n
            int r6 = r3.o()
            java.lang.Object r5 = r5.c(r6)
            if (r5 == 0) goto Lca
            androidx.compose.ui.platform.j1 r5 = (androidx.compose.ui.platform.C3930j1) r5
            r0.A(r3, r5)
            goto Ld5
        Lca:
            java.lang.String r1 = "node not present in pruned tree before this change"
            B0.a.c(r1)
            kotlin.KotlinNothingValueException r1 = new kotlin.KotlinNothingValueException
            r1.<init>()
            throw r1
        Ld5:
            int r4 = r4 + 1
            goto La2
        Ld8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.ViewOnAttachStateChangeListenerC5938b.A(J0.n, androidx.compose.ui.platform.j1):void");
    }

    private final void B() {
        J0.a aVar;
        InterfaceC6835l interfaceC6835l;
        AbstractC7022m abstractC7022mK = k();
        Object[] objArr = abstractC7022mK.f54983c;
        long[] jArr = abstractC7022mK.f54981a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        J0.j jVarW = ((C3933k1) objArr[(i10 << 3) + i12]).b().w();
                        if (AbstractC6492s.d(J0.k.a(jVarW, q.f9676a.r()), Boolean.FALSE) && (aVar = (J0.a) J0.k.a(jVarW, J0.i.f9619a.A())) != null && (interfaceC6835l = (InterfaceC6835l) aVar.a()) != null) {
                        }
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    private final androidx.compose.ui.platform.coreshims.e C(n nVar) {
        androidx.compose.ui.platform.coreshims.a aVarA;
        AutofillId autofillIdA;
        String strI;
        androidx.compose.ui.platform.coreshims.c cVar = this.f48308c;
        if (cVar == null || Build.VERSION.SDK_INT < 29 || (aVarA = androidx.compose.ui.platform.coreshims.d.a(this.f48306a)) == null) {
            return null;
        }
        if (nVar.r() != null) {
            autofillIdA = cVar.a(r3.o());
            if (autofillIdA == null) {
                return null;
            }
        } else {
            autofillIdA = aVarA.a();
        }
        androidx.compose.ui.platform.coreshims.e eVarB = cVar.b(autofillIdA, nVar.o());
        if (eVarB == null) {
            return null;
        }
        J0.j jVarW = nVar.w();
        q qVar = q.f9676a;
        if (jVarW.f(qVar.w())) {
            return null;
        }
        Bundle bundleA = eVarB.a();
        if (bundleA != null) {
            bundleA.putLong("android.view.contentcapture.EventTimestamp", this.f48318m);
        }
        String str = (String) J0.k.a(jVarW, qVar.C());
        if (str != null) {
            eVarB.e(nVar.o(), null, null, str);
        }
        List list = (List) J0.k.a(jVarW, qVar.D());
        if (list != null) {
            eVarB.b("android.widget.TextView");
            eVarB.f(AbstractC3750a.e(list, "\n", null, null, 0, null, null, 62, null));
        }
        C3174d c3174d = (C3174d) J0.k.a(jVarW, qVar.g());
        if (c3174d != null) {
            eVarB.b("android.widget.EditText");
            eVarB.f(c3174d);
        }
        List list2 = (List) J0.k.a(jVarW, qVar.d());
        if (list2 != null) {
            eVarB.c(AbstractC3750a.e(list2, "\n", null, null, 0, null, null, 62, null));
        }
        J0.g gVar = (J0.g) J0.k.a(jVarW, qVar.y());
        if (gVar != null && (strI = AbstractC3936l1.i(gVar.n())) != null) {
            eVarB.b(strI);
        }
        M mE = AbstractC3936l1.e(jVarW);
        if (mE != null) {
            L l10 = mE.l();
            eVarB.g(v.h(l10.i().l()) * l10.b().getDensity() * l10.b().y(), 0, 0, 0);
        }
        C6533i c6533iH = nVar.h();
        eVarB.d((int) c6533iH.k(), (int) c6533iH.n(), 0, 0, (int) c6533iH.r(), (int) c6533iH.j());
        return eVarB;
    }

    private final void D(n nVar) {
        if (n()) {
            G(nVar);
            c(nVar.o(), C(nVar));
            List listT = nVar.t();
            int size = listT.size();
            for (int i10 = 0; i10 < size; i10++) {
                D((n) listT.get(i10));
            }
        }
    }

    private final void E(n nVar) {
        if (n()) {
            d(nVar.o());
            List listT = nVar.t();
            int size = listT.size();
            for (int i10 = 0; i10 < size; i10++) {
                E((n) listT.get(i10));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void F() {
        /*
            r16 = this;
            r0 = r16
            o.z r1 = r0.f48319n
            r1.i()
            o.m r1 = r16.k()
            int[] r2 = r1.f54982b
            java.lang.Object[] r3 = r1.f54983c
            long[] r1 = r1.f54981a
            int r4 = r1.length
            int r4 = r4 + (-2)
            if (r4 < 0) goto L62
            r6 = 0
        L17:
            r7 = r1[r6]
            long r9 = ~r7
            r11 = 7
            long r9 = r9 << r11
            long r9 = r9 & r7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r11
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L5d
            int r9 = r6 - r4
            int r9 = ~r9
            int r9 = r9 >>> 31
            r10 = 8
            int r9 = 8 - r9
            r11 = 0
        L31:
            if (r11 >= r9) goto L5b
            r12 = 255(0xff, double:1.26E-321)
            long r12 = r12 & r7
            r14 = 128(0x80, double:6.3E-322)
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 >= 0) goto L57
            int r12 = r6 << 3
            int r12 = r12 + r11
            r13 = r2[r12]
            r12 = r3[r12]
            androidx.compose.ui.platform.k1 r12 = (androidx.compose.ui.platform.C3933k1) r12
            o.z r14 = r0.f48319n
            androidx.compose.ui.platform.j1 r15 = new androidx.compose.ui.platform.j1
            J0.n r12 = r12.b()
            o.m r5 = r16.k()
            r15.<init>(r12, r5)
            r14.t(r13, r15)
        L57:
            long r7 = r7 >> r10
            int r11 = r11 + 1
            goto L31
        L5b:
            if (r9 != r10) goto L62
        L5d:
            if (r6 == r4) goto L62
            int r6 = r6 + 1
            goto L17
        L62:
            androidx.compose.ui.platform.j1 r1 = new androidx.compose.ui.platform.j1
            androidx.compose.ui.platform.r r2 = r0.f48306a
            J0.p r2 = r2.getSemanticsOwner()
            J0.n r2 = r2.a()
            o.m r3 = r16.k()
            r1.<init>(r2, r3)
            r0.f48320o = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.ViewOnAttachStateChangeListenerC5938b.F():void");
    }

    private final void G(n nVar) {
        J0.a aVar;
        InterfaceC6835l interfaceC6835l;
        InterfaceC6835l interfaceC6835l2;
        J0.j jVarW = nVar.w();
        Boolean bool = (Boolean) J0.k.a(jVarW, q.f9676a.r());
        if (this.f48312g == a.SHOW_ORIGINAL && AbstractC6492s.d(bool, Boolean.TRUE)) {
            J0.a aVar2 = (J0.a) J0.k.a(jVarW, J0.i.f9619a.A());
            if (aVar2 == null || (interfaceC6835l2 = (InterfaceC6835l) aVar2.a()) == null) {
                return;
            }
            return;
        }
        if (this.f48312g != a.SHOW_TRANSLATED || !AbstractC6492s.d(bool, Boolean.FALSE) || (aVar = (J0.a) J0.k.a(jVarW, J0.i.f9619a.A())) == null || (interfaceC6835l = (InterfaceC6835l) aVar.a()) == null) {
            return;
        }
    }

    private final void c(int i10, androidx.compose.ui.platform.coreshims.e eVar) {
        if (eVar == null) {
            return;
        }
        if (this.f48310e.a(i10)) {
            this.f48310e.q(i10);
        } else {
            this.f48309d.t(i10, eVar);
        }
    }

    private final void d(int i10) {
        if (this.f48309d.b(i10)) {
            this.f48309d.q(i10);
        } else {
            this.f48310e.f(i10);
        }
    }

    private final void e(AbstractC7022m abstractC7022m) {
        int i10;
        int[] iArr = abstractC7022m.f54982b;
        long[] jArr = abstractC7022m.f54981a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i11 = 0;
        while (true) {
            long j10 = jArr[i11];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8;
                int i13 = 8 - ((~(i11 - length)) >>> 31);
                int i14 = 0;
                while (i14 < i13) {
                    if ((255 & j10) < 128) {
                        int i15 = iArr[(i11 << 3) + i14];
                        C3930j1 c3930j1 = (C3930j1) this.f48319n.c(i15);
                        C3933k1 c3933k1 = (C3933k1) abstractC7022m.c(i15);
                        n nVarB = c3933k1 != null ? c3933k1.b() : null;
                        if (nVarB == null) {
                            B0.a.c("no value for specified key");
                            throw new KotlinNothingValueException();
                        }
                        if (c3930j1 == null) {
                            Iterator it = nVarB.w().iterator();
                            while (it.hasNext()) {
                                Object key = ((Map.Entry) it.next()).getKey();
                                q qVar = q.f9676a;
                                if (AbstractC6492s.d(key, qVar.D())) {
                                    List list = (List) J0.k.a(nVarB.w(), qVar.D());
                                    z(nVarB.o(), String.valueOf(list != null ? (C3174d) AbstractC3689v.s0(list) : null));
                                }
                            }
                        } else {
                            Iterator it2 = nVarB.w().iterator();
                            while (it2.hasNext()) {
                                J0.v vVar = (J0.v) ((Map.Entry) it2.next()).getKey();
                                q qVar2 = q.f9676a;
                                if (AbstractC6492s.d(vVar, qVar2.D())) {
                                    List list2 = (List) J0.k.a(c3930j1.b(), qVar2.D());
                                    C3174d c3174d = list2 != null ? (C3174d) AbstractC3689v.s0(list2) : null;
                                    List list3 = (List) J0.k.a(nVarB.w(), qVar2.D());
                                    C3174d c3174d2 = list3 != null ? (C3174d) AbstractC3689v.s0(list3) : null;
                                    if (!AbstractC6492s.d(c3174d, c3174d2)) {
                                        z(nVarB.o(), String.valueOf(c3174d2));
                                    }
                                }
                            }
                        }
                        i10 = 8;
                    } else {
                        i10 = i12;
                    }
                    j10 >>= i10;
                    i14++;
                    i12 = i10;
                }
                if (i13 != i12) {
                    return;
                }
            }
            if (i11 == length) {
                return;
            } else {
                i11++;
            }
        }
    }

    private final void f() {
        J0.a aVar;
        InterfaceC6824a interfaceC6824a;
        AbstractC7022m abstractC7022mK = k();
        Object[] objArr = abstractC7022mK.f54983c;
        long[] jArr = abstractC7022mK.f54981a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        J0.j jVarW = ((C3933k1) objArr[(i10 << 3) + i12]).b().w();
                        if (J0.k.a(jVarW, q.f9676a.r()) != null && (aVar = (J0.a) J0.k.a(jVarW, J0.i.f9619a.a())) != null && (interfaceC6824a = (InterfaceC6824a) aVar.a()) != null) {
                        }
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(ViewOnAttachStateChangeListenerC5938b viewOnAttachStateChangeListenerC5938b) {
        if (viewOnAttachStateChangeListenerC5938b.n()) {
            m0.f(viewOnAttachStateChangeListenerC5938b.f48306a, false, 1, null);
            viewOnAttachStateChangeListenerC5938b.A(viewOnAttachStateChangeListenerC5938b.f48306a.getSemanticsOwner().a(), viewOnAttachStateChangeListenerC5938b.f48320o);
            viewOnAttachStateChangeListenerC5938b.y(viewOnAttachStateChangeListenerC5938b.f48306a.getSemanticsOwner().a(), viewOnAttachStateChangeListenerC5938b.f48320o);
            viewOnAttachStateChangeListenerC5938b.e(viewOnAttachStateChangeListenerC5938b.k());
            viewOnAttachStateChangeListenerC5938b.F();
            viewOnAttachStateChangeListenerC5938b.f48321p = false;
        }
    }

    private final void m() {
        J0.a aVar;
        InterfaceC6835l interfaceC6835l;
        AbstractC7022m abstractC7022mK = k();
        Object[] objArr = abstractC7022mK.f54983c;
        long[] jArr = abstractC7022mK.f54981a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        J0.j jVarW = ((C3933k1) objArr[(i10 << 3) + i12]).b().w();
                        if (AbstractC6492s.d(J0.k.a(jVarW, q.f9676a.r()), Boolean.TRUE) && (aVar = (J0.a) J0.k.a(jVarW, J0.i.f9619a.A())) != null && (interfaceC6835l = (InterfaceC6835l) aVar.a()) != null) {
                        }
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void o() {
        /*
            Method dump skipped, instructions count: 289
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.ViewOnAttachStateChangeListenerC5938b.o():void");
    }

    private final void q(G g10) {
        if (this.f48314i.add(g10)) {
            this.f48315j.k(J.f24997a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void y(J0.n r14, androidx.compose.ui.platform.C3930j1 r15) {
        /*
            r13 = this;
            java.util.List r0 = r14.t()
            int r1 = r0.size()
            r2 = 0
            r3 = r2
        La:
            if (r3 >= r1) goto L34
            java.lang.Object r4 = r0.get(r3)
            J0.n r4 = (J0.n) r4
            o.m r5 = r13.k()
            int r6 = r4.o()
            boolean r5 = r5.a(r6)
            if (r5 == 0) goto L31
            o.A r5 = r15.a()
            int r6 = r4.o()
            boolean r5 = r5.a(r6)
            if (r5 != 0) goto L31
            r13.D(r4)
        L31:
            int r3 = r3 + 1
            goto La
        L34:
            o.z r15 = r13.f48319n
            int[] r0 = r15.f54982b
            long[] r15 = r15.f54981a
            int r1 = r15.length
            int r1 = r1 + (-2)
            if (r1 < 0) goto L82
            r3 = r2
        L40:
            r4 = r15[r3]
            long r6 = ~r4
            r8 = 7
            long r6 = r6 << r8
            long r6 = r6 & r4
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 == 0) goto L7d
            int r6 = r3 - r1
            int r6 = ~r6
            int r6 = r6 >>> 31
            r7 = 8
            int r6 = 8 - r6
            r8 = r2
        L5a:
            if (r8 >= r6) goto L7b
            r9 = 255(0xff, double:1.26E-321)
            long r9 = r9 & r4
            r11 = 128(0x80, double:6.3E-322)
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 >= 0) goto L77
            int r9 = r3 << 3
            int r9 = r9 + r8
            r9 = r0[r9]
            o.m r10 = r13.k()
            boolean r10 = r10.a(r9)
            if (r10 != 0) goto L77
            r13.d(r9)
        L77:
            long r4 = r4 >> r7
            int r8 = r8 + 1
            goto L5a
        L7b:
            if (r6 != r7) goto L82
        L7d:
            if (r3 == r1) goto L82
            int r3 = r3 + 1
            goto L40
        L82:
            java.util.List r14 = r14.t()
            int r15 = r14.size()
        L8a:
            if (r2 >= r15) goto Lcc
            java.lang.Object r0 = r14.get(r2)
            J0.n r0 = (J0.n) r0
            o.m r1 = r13.k()
            int r3 = r0.o()
            boolean r1 = r1.a(r3)
            if (r1 == 0) goto Lc9
            o.z r1 = r13.f48319n
            int r3 = r0.o()
            boolean r1 = r1.a(r3)
            if (r1 == 0) goto Lc9
            o.z r1 = r13.f48319n
            int r3 = r0.o()
            java.lang.Object r1 = r1.c(r3)
            if (r1 == 0) goto Lbe
            androidx.compose.ui.platform.j1 r1 = (androidx.compose.ui.platform.C3930j1) r1
            r13.y(r0, r1)
            goto Lc9
        Lbe:
            java.lang.String r14 = "node not present in pruned tree before this change"
            B0.a.c(r14)
            kotlin.KotlinNothingValueException r14 = new kotlin.KotlinNothingValueException
            r14.<init>()
            throw r14
        Lc9:
            int r2 = r2 + 1
            goto L8a
        Lcc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.ViewOnAttachStateChangeListenerC5938b.y(J0.n, androidx.compose.ui.platform.j1):void");
    }

    private final void z(int i10, String str) {
        androidx.compose.ui.platform.coreshims.c cVar;
        if (Build.VERSION.SDK_INT >= 29 && (cVar = this.f48308c) != null) {
            AutofillId autofillIdA = cVar.a(i10);
            if (autofillIdA != null) {
                cVar.c(autofillIdA, str);
            } else {
                B0.a.c("Invalid content capture ID");
                throw new KotlinNothingValueException();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006e A[Catch: all -> 0x0035, TryCatch #1 {all -> 0x0035, blocks: (B:13:0x0030, B:25:0x0056, B:29:0x0066, B:31:0x006e, B:33:0x0077, B:34:0x007a, B:36:0x007e, B:37:0x0087, B:20:0x0048), top: B:48:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0098 -> B:14:0x0033). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(dh.InterfaceC5380e r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof h0.ViewOnAttachStateChangeListenerC5938b.c
            if (r0 == 0) goto L13
            r0 = r10
            h0.b$c r0 = (h0.ViewOnAttachStateChangeListenerC5938b.c) r0
            int r1 = r0.f48328e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f48328e = r1
            goto L18
        L13:
            h0.b$c r0 = new h0.b$c
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f48326c
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.f48328e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4c
            if (r2 == r4) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r2 = r0.f48325b
            Ki.i r2 = (Ki.i) r2
            java.lang.Object r5 = r0.f48324a
            h0.b r5 = (h0.ViewOnAttachStateChangeListenerC5938b) r5
            Yg.v.b(r10)     // Catch: java.lang.Throwable -> L35
        L33:
            r10 = r2
            goto L56
        L35:
            r10 = move-exception
            goto La5
        L38:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L40:
            java.lang.Object r2 = r0.f48325b
            Ki.i r2 = (Ki.i) r2
            java.lang.Object r5 = r0.f48324a
            h0.b r5 = (h0.ViewOnAttachStateChangeListenerC5938b) r5
            Yg.v.b(r10)     // Catch: java.lang.Throwable -> L35
            goto L66
        L4c:
            Yg.v.b(r10)
            Ki.g r10 = r9.f48315j     // Catch: java.lang.Throwable -> La3
            Ki.i r10 = r10.iterator()     // Catch: java.lang.Throwable -> La3
            r5 = r9
        L56:
            r0.f48324a = r5     // Catch: java.lang.Throwable -> L35
            r0.f48325b = r10     // Catch: java.lang.Throwable -> L35
            r0.f48328e = r4     // Catch: java.lang.Throwable -> L35
            java.lang.Object r2 = r10.a(r0)     // Catch: java.lang.Throwable -> L35
            if (r2 != r1) goto L63
            return r1
        L63:
            r8 = r2
            r2 = r10
            r10 = r8
        L66:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L35
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r10 == 0) goto L9b
            r2.next()     // Catch: java.lang.Throwable -> L35
            boolean r10 = r5.n()     // Catch: java.lang.Throwable -> L35
            if (r10 == 0) goto L7a
            r5.o()     // Catch: java.lang.Throwable -> L35
        L7a:
            boolean r10 = r5.f48321p     // Catch: java.lang.Throwable -> L35
            if (r10 != 0) goto L87
            r5.f48321p = r4     // Catch: java.lang.Throwable -> L35
            android.os.Handler r10 = r5.f48316k     // Catch: java.lang.Throwable -> L35
            java.lang.Runnable r6 = r5.f48322q     // Catch: java.lang.Throwable -> L35
            r10.post(r6)     // Catch: java.lang.Throwable -> L35
        L87:
            o.b r10 = r5.f48314i     // Catch: java.lang.Throwable -> L35
            r10.clear()     // Catch: java.lang.Throwable -> L35
            long r6 = r5.f48311f     // Catch: java.lang.Throwable -> L35
            r0.f48324a = r5     // Catch: java.lang.Throwable -> L35
            r0.f48325b = r2     // Catch: java.lang.Throwable -> L35
            r0.f48328e = r3     // Catch: java.lang.Throwable -> L35
            java.lang.Object r10 = Ii.Y.a(r6, r0)     // Catch: java.lang.Throwable -> L35
            if (r10 != r1) goto L33
            return r1
        L9b:
            o.b r10 = r5.f48314i
            r10.clear()
            Yg.J r10 = Yg.J.f24997a
            return r10
        La3:
            r10 = move-exception
            r5 = r9
        La5:
            o.b r0 = r5.f48314i
            r0.clear()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.ViewOnAttachStateChangeListenerC5938b.b(dh.e):java.lang.Object");
    }

    public final AbstractC7022m k() {
        if (this.f48313h) {
            this.f48313h = false;
            this.f48317l = AbstractC3936l1.b(this.f48306a.getSemanticsOwner());
            this.f48318m = System.currentTimeMillis();
        }
        return this.f48317l;
    }

    public final r l() {
        return this.f48306a;
    }

    public final boolean n() {
        return l.f48331o0.a() && this.f48308c != null;
    }

    @Override // androidx.lifecycle.InterfaceC4007e
    public void onStart(InterfaceC4017o interfaceC4017o) {
        this.f48308c = (androidx.compose.ui.platform.coreshims.c) this.f48307b.invoke();
        D(this.f48306a.getSemanticsOwner().a());
        o();
    }

    @Override // androidx.lifecycle.InterfaceC4007e
    public void onStop(InterfaceC4017o interfaceC4017o) {
        E(this.f48306a.getSemanticsOwner().a());
        o();
        this.f48308c = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f48316k.removeCallbacks(this.f48322q);
        this.f48308c = null;
    }

    public final void r() {
        this.f48312g = a.SHOW_ORIGINAL;
        f();
    }

    public final void s(long[] jArr, int[] iArr, Consumer consumer) {
        C1787b.f48323a.c(this, jArr, iArr, consumer);
    }

    public final void t() {
        this.f48312g = a.SHOW_ORIGINAL;
        m();
    }

    public final void u(G g10) {
        this.f48313h = true;
        if (n()) {
            q(g10);
        }
    }

    public final void v() {
        this.f48313h = true;
        if (!n() || this.f48321p) {
            return;
        }
        this.f48321p = true;
        this.f48316k.post(this.f48322q);
    }

    public final void w() {
        this.f48312g = a.SHOW_TRANSLATED;
        B();
    }

    public final void x(ViewOnAttachStateChangeListenerC5938b viewOnAttachStateChangeListenerC5938b, LongSparseArray longSparseArray) {
        C1787b.f48323a.d(viewOnAttachStateChangeListenerC5938b, longSparseArray);
    }
}
