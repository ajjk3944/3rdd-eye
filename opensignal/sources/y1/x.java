package y1;

import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.text.Layout;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import com.google.android.gms.internal.measurement.e5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class x extends u3.b {
    public static final u.s N;
    public final u.u A;
    public final u.r B;
    public final u.r C;
    public final String D;
    public final String E;
    public final io.sentry.k F;
    public final u.t G;
    public q1 H;
    public boolean I;
    public final u.r J;
    public final j4.o K;
    public final ArrayList L;
    public final w M;

    /* renamed from: d, reason: collision with root package name */
    public final AndroidComposeView f25792d;

    /* renamed from: e, reason: collision with root package name */
    public int f25793e = Integer.MIN_VALUE;

    /* renamed from: f, reason: collision with root package name */
    public final w f25794f = new w(this, 0);

    /* renamed from: g, reason: collision with root package name */
    public final AccessibilityManager f25795g;

    /* renamed from: h, reason: collision with root package name */
    public long f25796h;

    /* renamed from: i, reason: collision with root package name */
    public final t f25797i;
    public final je.i j;
    public List k;

    /* renamed from: l, reason: collision with root package name */
    public final Handler f25798l;

    /* renamed from: m, reason: collision with root package name */
    public final b4.a f25799m;

    /* renamed from: n, reason: collision with root package name */
    public int f25800n;

    /* renamed from: o, reason: collision with root package name */
    public int f25801o;

    /* renamed from: p, reason: collision with root package name */
    public final u.t f25802p;

    /* renamed from: q, reason: collision with root package name */
    public final u.t f25803q;

    /* renamed from: r, reason: collision with root package name */
    public final u.j0 f25804r;

    /* renamed from: s, reason: collision with root package name */
    public final u.j0 f25805s;

    /* renamed from: t, reason: collision with root package name */
    public int f25806t;

    /* renamed from: u, reason: collision with root package name */
    public Integer f25807u;

    /* renamed from: v, reason: collision with root package name */
    public final u.f f25808v;

    /* renamed from: w, reason: collision with root package name */
    public final yt.c f25809w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f25810x;

    /* renamed from: y, reason: collision with root package name */
    public u f25811y;

    /* renamed from: z, reason: collision with root package name */
    public u.t f25812z;

    static {
        int[] iArr = {z0.n.accessibility_custom_action_0, z0.n.accessibility_custom_action_1, z0.n.accessibility_custom_action_2, z0.n.accessibility_custom_action_3, z0.n.accessibility_custom_action_4, z0.n.accessibility_custom_action_5, z0.n.accessibility_custom_action_6, z0.n.accessibility_custom_action_7, z0.n.accessibility_custom_action_8, z0.n.accessibility_custom_action_9, z0.n.accessibility_custom_action_10, z0.n.accessibility_custom_action_11, z0.n.accessibility_custom_action_12, z0.n.accessibility_custom_action_13, z0.n.accessibility_custom_action_14, z0.n.accessibility_custom_action_15, z0.n.accessibility_custom_action_16, z0.n.accessibility_custom_action_17, z0.n.accessibility_custom_action_18, z0.n.accessibility_custom_action_19, z0.n.accessibility_custom_action_20, z0.n.accessibility_custom_action_21, z0.n.accessibility_custom_action_22, z0.n.accessibility_custom_action_23, z0.n.accessibility_custom_action_24, z0.n.accessibility_custom_action_25, z0.n.accessibility_custom_action_26, z0.n.accessibility_custom_action_27, z0.n.accessibility_custom_action_28, z0.n.accessibility_custom_action_29, z0.n.accessibility_custom_action_30, z0.n.accessibility_custom_action_31};
        int i10 = u.i.f23074a;
        u.s sVar = new u.s(32);
        int i11 = sVar.f23108b;
        if (i11 < 0) {
            v.a.d("");
            throw null;
        }
        int i12 = i11 + 32;
        int[] iArr2 = sVar.f23107a;
        if (iArr2.length < i12) {
            int[] iArrCopyOf = Arrays.copyOf(iArr2, Math.max(i12, (iArr2.length * 3) / 2));
            br.l.d(iArrCopyOf, "copyOf(...)");
            sVar.f23107a = iArrCopyOf;
        }
        int[] iArr3 = sVar.f23107a;
        int i13 = sVar.f23108b;
        if (i11 != i13) {
            mq.l.b0(i12, i11, i13, iArr3, iArr3);
        }
        mq.l.e0(i11, 0, 12, iArr, iArr3);
        sVar.f23108b += 32;
        N = sVar;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [y1.t] */
    public x(AndroidComposeView androidComposeView) {
        this.f25792d = androidComposeView;
        Object systemService = androidComposeView.getContext().getSystemService("accessibility");
        br.l.c(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        this.f25795g = accessibilityManager;
        this.f25796h = 100L;
        this.f25797i = new AccessibilityManager.AccessibilityStateChangeListener() { // from class: y1.t
            @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
            public final void onAccessibilityStateChanged(boolean z10) {
                x xVar = this.f25774a;
                xVar.k = z10 ? xVar.f25795g.getEnabledAccessibilityServiceList(-1) : mq.w.f16945a;
            }
        };
        int i10 = 1;
        this.j = new je.i(1, this);
        this.k = accessibilityManager.getEnabledAccessibilityServiceList(-1);
        this.f25798l = new Handler(Looper.getMainLooper());
        this.f25799m = new b4.a(this, i10);
        this.f25800n = Integer.MIN_VALUE;
        this.f25801o = Integer.MIN_VALUE;
        this.f25802p = new u.t();
        this.f25803q = new u.t();
        this.f25804r = new u.j0(0);
        this.f25805s = new u.j0(0);
        this.f25806t = -1;
        this.f25808v = new u.f(0);
        this.f25809w = a.a.b(1, 6, null);
        this.f25810x = true;
        u.t tVar = u.k.f23086a;
        br.l.c(tVar, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.f25812z = tVar;
        this.A = new u.u();
        this.B = new u.r();
        this.C = new u.r();
        this.D = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.E = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.F = new io.sentry.k(22);
        this.G = new u.t();
        e2.k kVarA = androidComposeView.getSemanticsOwner().a();
        br.l.c(tVar, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.H = new q1(kVarA, tVar);
        int i11 = u.h.f23072a;
        this.J = new u.r();
        androidComposeView.addOnAttachStateChangeListener(new g1.e(8, this));
        this.K = new j4.o(23, this);
        this.L = new ArrayList();
        this.M = new w(this, i10);
    }

    public static /* synthetic */ void A(x xVar, int i10, int i11, Integer num, int i12) {
        if ((i12 & 4) != 0) {
            num = null;
        }
        xVar.z(i10, i11, num, null);
    }

    public static Rect G(g1.f0 f0Var) {
        if (!(f0Var instanceof g1.a0) && !(f0Var instanceof g1.b0)) {
            return null;
        }
        f1.c cVarI = f0Var.i();
        return new Rect((int) cVarI.f8404a, (int) cVarI.f8405b, (int) cVarI.f8406c, (int) cVarI.f8407d);
    }

    public static float[] H(g1.f0 f0Var) {
        if (!(f0Var instanceof g1.b0)) {
            return null;
        }
        f1.d dVar = ((g1.b0) f0Var).f9201e;
        long j = dVar.f8415h;
        long j7 = dVar.f8414g;
        long j10 = dVar.f8413f;
        long j11 = dVar.f8412e;
        return new float[]{Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (j11 & 4294967295L)), Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)), Float.intBitsToFloat((int) (j7 >> 32)), Float.intBitsToFloat((int) (j7 & 4294967295L)), Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L))};
    }

    public static Region I(g1.f0 f0Var) {
        if (!(f0Var instanceof g1.z)) {
            return null;
        }
        g1.z zVar = (g1.z) f0Var;
        f1.c cVarI = zVar.i();
        Region region = new Region(new Rect((int) cVarI.f8404a, (int) cVarI.f8405b, (int) cVarI.f8406c, (int) cVarI.f8407d));
        Region region2 = new Region();
        g1.i iVar = zVar.f9276e;
        if (!(iVar instanceof g1.i)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        region2.setPath(iVar.f9238a, region);
        return region2;
    }

    public static CharSequence J(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            int i10 = 100000;
            if (charSequence.length() > 100000) {
                if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
                    i10 = 99999;
                }
                CharSequence charSequenceSubSequence = charSequence.subSequence(0, i10);
                br.l.c(charSequenceSubSequence, "null cannot be cast to non-null type T of androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.trimToSize");
                return charSequenceSubSequence;
            }
        }
        return charSequence;
    }

    public static String t(e2.k kVar) {
        h2.f fVar;
        if (kVar != null) {
            SemanticsConfiguration semanticsConfiguration = kVar.f7717d;
            u.a0 a0Var = semanticsConfiguration.f1191a;
            e2.s sVar = e2.p.f7733a;
            if (a0Var.c(sVar)) {
                return v2.a.a((List) semanticsConfiguration.b(sVar), ",", null, 62);
            }
            e2.s sVar2 = e2.p.B;
            if (a0Var.c(sVar2)) {
                Object objG = a0Var.g(sVar2);
                if (objG == null) {
                    objG = null;
                }
                h2.f fVar2 = (h2.f) objG;
                if (fVar2 != null) {
                    return fVar2.f9811d;
                }
            } else {
                Object objG2 = a0Var.g(e2.p.f7754x);
                if (objG2 == null) {
                    objG2 = null;
                }
                List list = (List) objG2;
                if (list != null && (fVar = (h2.f) mq.o.t0(list)) != null) {
                    return fVar.f9811d;
                }
            }
        }
        return null;
    }

    public final void B(String str, int i10, int i11) {
        AccessibilityEvent accessibilityEventN = n(w(i10), 32);
        accessibilityEventN.setContentChangeTypes(i11);
        if (str != null) {
            accessibilityEventN.getText().add(str);
        }
        y(accessibilityEventN);
    }

    public final void C(int i10) {
        u uVar = this.f25811y;
        if (uVar != null) {
            e2.k kVar = uVar.f25775a;
            if (i10 != kVar.f7720g) {
                return;
            }
            if (SystemClock.uptimeMillis() - uVar.f25780f <= 1000) {
                AccessibilityEvent accessibilityEventN = n(w(kVar.f7720g), 131072);
                accessibilityEventN.setFromIndex(uVar.f25778d);
                accessibilityEventN.setToIndex(uVar.f25779e);
                accessibilityEventN.setAction(uVar.f25776b);
                accessibilityEventN.setMovementGranularity(uVar.f25777c);
                accessibilityEventN.getText().add(t(kVar));
                y(accessibilityEventN);
            }
        }
        this.f25811y = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:223:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0515  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0641  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0132  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void D(u.j r59) {
        /*
            Method dump skipped, instructions count: 1683
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y1.x.D(u.j):void");
    }

    public final void E(x1.f0 f0Var, u.u uVar) {
        SemanticsConfiguration semanticsConfigurationE;
        if (f0Var.S() && !this.f25792d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(f0Var)) {
            x1.f0 f0Var2 = null;
            if (!f0Var.D.i(8)) {
                f0Var = f0Var.C();
                while (true) {
                    if (f0Var == null) {
                        f0Var = null;
                        break;
                    } else if (f0Var.D.i(8)) {
                        break;
                    } else {
                        f0Var = f0Var.C();
                    }
                }
            }
            if (f0Var == null || (semanticsConfigurationE = f0Var.E()) == null) {
                return;
            }
            if (!semanticsConfigurationE.f1193g) {
                x1.f0 f0VarC = f0Var.C();
                while (true) {
                    if (f0VarC != null) {
                        SemanticsConfiguration semanticsConfigurationE2 = f0VarC.E();
                        if (semanticsConfigurationE2 != null && semanticsConfigurationE2.f1193g) {
                            f0Var2 = f0VarC;
                            break;
                        }
                        f0VarC = f0VarC.C();
                    } else {
                        break;
                    }
                }
                if (f0Var2 != null) {
                    f0Var = f0Var2;
                }
            }
            int i10 = f0Var.f24799c;
            if (uVar.a(i10)) {
                A(this, w(i10), 2048, 1, 8);
            }
        }
    }

    public final boolean F(e2.k kVar, int i10, int i11, boolean z10) {
        String strT;
        SemanticsConfiguration semanticsConfiguration = kVar.f7717d;
        int i12 = kVar.f7720g;
        e2.s sVar = e2.g.f7693h;
        if (semanticsConfiguration.f1191a.c(sVar) && e0.a(kVar)) {
            ar.o oVar = (ar.o) ((e2.a) kVar.f7717d.b(sVar)).f7678b;
            if (oVar != null) {
                return ((Boolean) oVar.h(Integer.valueOf(i10), Integer.valueOf(i11), Boolean.valueOf(z10))).booleanValue();
            }
        } else if ((i10 != i11 || i11 != this.f25806t) && (strT = t(kVar)) != null) {
            if (i10 < 0 || i10 != i11 || i11 > strT.length()) {
                i10 = -1;
            }
            this.f25806t = i10;
            boolean z11 = strT.length() > 0;
            y(p(w(i12), z11 ? Integer.valueOf(this.f25806t) : null, z11 ? Integer.valueOf(this.f25806t) : null, z11 ? Integer.valueOf(strT.length()) : null, strT));
            C(i12);
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x013f, code lost:
    
        r28 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0149, code lost:
    
        if (((r7 & ((~r7) << 6)) & r20) == 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x014b, code lost:
    
        r25 = -1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void K() {
        /*
            Method dump skipped, instructions count: 530
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y1.x.K():void");
    }

    @Override // u3.b
    public final o2.g b(View view) {
        return this.f25799m;
    }

    public final void j(int i10, v3.c cVar, String str, Bundle bundle) {
        e2.k kVar;
        Region regionI;
        float[] fArrH;
        Rect rectG;
        int i11;
        float fH;
        float fH2;
        float fG;
        float fG2;
        AccessibilityNodeInfo accessibilityNodeInfo;
        int i12;
        char c4;
        f1.c cVar2;
        RectF rectF;
        AccessibilityNodeInfo accessibilityNodeInfo2 = cVar.f23838a;
        e2.l lVar = (e2.l) s().b(i10);
        if (lVar == null || (kVar = lVar.f7721a) == null) {
            return;
        }
        SemanticsConfiguration semanticsConfiguration = kVar.f7717d;
        u.a0 a0Var = semanticsConfiguration.f1191a;
        String strT = t(kVar);
        if (br.l.a(str, this.D)) {
            int iD = this.B.d(i10);
            if (iD != -1) {
                accessibilityNodeInfo2.getExtras().putInt(str, iD);
                return;
            }
            return;
        }
        if (br.l.a(str, this.E)) {
            int iD2 = this.C.d(i10);
            if (iD2 != -1) {
                accessibilityNodeInfo2.getExtras().putInt(str, iD2);
                return;
            }
            return;
        }
        boolean z10 = false;
        if (!a0Var.c(e2.g.f7686a) || bundle == null || !br.l.a(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            e2.s sVar = e2.p.f7752v;
            if (a0Var.c(sVar) && bundle != null && br.l.a(str, "androidx.compose.ui.semantics.testTag")) {
                Object objG = a0Var.g(sVar);
                String str2 = (String) (objG == null ? null : objG);
                if (str2 != null) {
                    accessibilityNodeInfo2.getExtras().putCharSequence(str, str2);
                    return;
                }
                return;
            }
            if (br.l.a(str, "androidx.compose.ui.semantics.id")) {
                accessibilityNodeInfo2.getExtras().putInt(str, kVar.f7720g);
                return;
            }
            if (br.l.a(str, "androidx.compose.ui.semantics.shapeType")) {
                Object objG2 = a0Var.g(e2.p.J);
                g1.i0 i0Var = (g1.i0) (objG2 == null ? null : objG2);
                if (i0Var != null) {
                    g1.f0 f0VarO = o(i0Var, kVar);
                    if (f0VarO instanceof g1.a0) {
                        accessibilityNodeInfo2.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 0);
                        accessibilityNodeInfo2.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", G(f0VarO));
                        return;
                    } else if (f0VarO instanceof g1.b0) {
                        accessibilityNodeInfo2.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 1);
                        accessibilityNodeInfo2.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", G(f0VarO));
                        accessibilityNodeInfo2.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", H(f0VarO));
                        return;
                    } else {
                        if (!(f0VarO instanceof g1.z)) {
                            throw new bf.n();
                        }
                        accessibilityNodeInfo2.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 2);
                        accessibilityNodeInfo2.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", I(f0VarO));
                        return;
                    }
                }
                return;
            }
            if (br.l.a(str, "androidx.compose.ui.semantics.shapeRect")) {
                Object objG3 = a0Var.g(e2.p.J);
                g1.i0 i0Var2 = (g1.i0) (objG3 == null ? null : objG3);
                if (i0Var2 == null || (rectG = G(o(i0Var2, kVar))) == null) {
                    return;
                }
                accessibilityNodeInfo2.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", rectG);
                return;
            }
            if (br.l.a(str, "androidx.compose.ui.semantics.shapeCorners")) {
                Object objG4 = a0Var.g(e2.p.J);
                g1.i0 i0Var3 = (g1.i0) (objG4 == null ? null : objG4);
                if (i0Var3 == null || (fArrH = H(o(i0Var3, kVar))) == null) {
                    return;
                }
                accessibilityNodeInfo2.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", fArrH);
                return;
            }
            if (br.l.a(str, "androidx.compose.ui.semantics.shapeRegion")) {
                Object objG5 = a0Var.g(e2.p.J);
                g1.i0 i0Var4 = (g1.i0) (objG5 == null ? null : objG5);
                if (i0Var4 == null || (regionI = I(o(i0Var4, kVar))) == null) {
                    return;
                }
                accessibilityNodeInfo2.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", regionI);
                return;
            }
            return;
        }
        int i13 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
        int i14 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
        if (i14 > 0 && i13 >= 0) {
            if (i13 < (strT != null ? strT.length() : Integer.MAX_VALUE)) {
                h2.g0 g0VarN = e0.n(semanticsConfiguration);
                if (g0VarN == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                int i15 = 0;
                while (i15 < i14) {
                    int i16 = i13 + i15;
                    if (i16 >= g0VarN.f9824a.f9814a.f9811d.length()) {
                        arrayList.add(z10);
                        i11 = i13;
                        accessibilityNodeInfo = accessibilityNodeInfo2;
                        i12 = i14;
                    } else {
                        h2.m mVar = g0VarN.f9825b;
                        h2.f fVar = (h2.f) mVar.f9847a.f3974d;
                        if (i16 < 0 || i16 >= fVar.f9811d.length()) {
                            StringBuilder sbU = h0.b.u("offset(", i16, ") is out of bounds [0, ");
                            sbU.append(fVar.f9811d.length());
                            sbU.append(')');
                            m2.a.a(sbU.toString());
                        }
                        ArrayList arrayList2 = mVar.f9854h;
                        h2.p pVar = (h2.p) arrayList2.get(h2.b0.c(i16, arrayList2));
                        h2.b bVar = pVar.f9859a;
                        int iA = pVar.a(i16);
                        CharSequence charSequence = bVar.f9782e;
                        if (iA < 0 || iA >= charSequence.length()) {
                            StringBuilder sbU2 = h0.b.u("offset(", iA, ") is out of bounds [0,");
                            sbU2.append(charSequence.length());
                            sbU2.append(')');
                            m2.a.a(sbU2.toString());
                        }
                        i2.h hVar = bVar.f9781d;
                        Layout layout = hVar.f11173e;
                        int lineForOffset = layout.getLineForOffset(iA);
                        float f10 = hVar.f(lineForOffset);
                        float fD = hVar.d(lineForOffset);
                        i11 = i13;
                        boolean z11 = layout.getParagraphDirection(lineForOffset) == 1;
                        boolean zIsRtlCharAt = layout.isRtlCharAt(iA);
                        if (!z11 || zIsRtlCharAt) {
                            if (z11 && zIsRtlCharAt) {
                                fG = hVar.h(iA, false);
                                fG2 = hVar.h(iA + 1, true);
                            } else if (zIsRtlCharAt) {
                                fG = hVar.g(iA, false);
                                fG2 = hVar.g(iA + 1, true);
                            } else {
                                fH = hVar.h(iA, false);
                                fH2 = hVar.h(iA + 1, true);
                            }
                            float f11 = fG;
                            fH = fG2;
                            fH2 = f11;
                        } else {
                            fH = hVar.g(iA, false);
                            fH2 = hVar.g(iA + 1, true);
                        }
                        RectF rectF2 = new RectF(fH, f10, fH2, fD);
                        accessibilityNodeInfo = accessibilityNodeInfo2;
                        i12 = i14;
                        long jFloatToRawIntBits = (Float.floatToRawIntBits(pVar.f9864f) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
                        int i17 = (int) (jFloatToRawIntBits >> 32);
                        int i18 = (int) (jFloatToRawIntBits & 4294967295L);
                        f1.c cVar3 = new f1.c(Float.intBitsToFloat(i17) + rectF2.left, Float.intBitsToFloat(i18) + rectF2.top, Float.intBitsToFloat(i17) + rectF2.right, Float.intBitsToFloat(i18) + rectF2.bottom);
                        x1.f1 f1VarD = kVar.d();
                        long jF0 = 0;
                        if (f1VarD != null) {
                            if (!f1VarD.v0().f26506o) {
                                f1VarD = null;
                            }
                            if (f1VarD != null) {
                                jF0 = f1VarD.F0(0L);
                            }
                        }
                        f1.c cVarC = cVar3.c(jF0);
                        float f12 = cVarC.f8407d;
                        float f13 = cVarC.f8405b;
                        float f14 = cVarC.f8406c;
                        f1.c cVarG = kVar.g();
                        float f15 = cVarG.f8405b;
                        float f16 = cVarG.f8407d;
                        float f17 = cVarG.f8406c;
                        float f18 = cVarC.f8404a;
                        boolean z12 = f18 < f17;
                        float f19 = cVarG.f8404a;
                        if ((z12 & (f19 < f14) & (f13 < f16)) && (f15 < f12)) {
                            c4 = ' ';
                            cVar2 = new f1.c(Math.max(f18, f19), Math.max(f13, f15), Math.min(f14, f17), Math.min(f12, f16));
                        } else {
                            c4 = ' ';
                            cVar2 = null;
                        }
                        if (cVar2 != null) {
                            float f20 = cVar2.f8404a;
                            float f21 = cVar2.f8405b;
                            long jFloatToRawIntBits2 = Float.floatToRawIntBits(f20);
                            AndroidComposeView androidComposeView = this.f25792d;
                            long jQ = androidComposeView.q((Float.floatToRawIntBits(f21) & 4294967295L) | (jFloatToRawIntBits2 << c4));
                            long jQ2 = androidComposeView.q((Float.floatToRawIntBits(cVar2.f8407d) & 4294967295L) | (Float.floatToRawIntBits(cVar2.f8406c) << c4));
                            int i19 = (int) (jQ >> c4);
                            int i20 = (int) (jQ2 >> c4);
                            int i21 = (int) (jQ & 4294967295L);
                            int i22 = (int) (jQ2 & 4294967295L);
                            rectF = new RectF(Math.min(Float.intBitsToFloat(i19), Float.intBitsToFloat(i20)), Math.min(Float.intBitsToFloat(i21), Float.intBitsToFloat(i22)), Math.max(Float.intBitsToFloat(i19), Float.intBitsToFloat(i20)), Math.max(Float.intBitsToFloat(i21), Float.intBitsToFloat(i22)));
                        } else {
                            rectF = null;
                        }
                        arrayList.add(rectF);
                    }
                    i15++;
                    i14 = i12;
                    accessibilityNodeInfo2 = accessibilityNodeInfo;
                    i13 = i11;
                    z10 = false;
                }
                accessibilityNodeInfo2.getExtras().putParcelableArray(str, (Parcelable[]) arrayList.toArray(new RectF[0]));
                return;
            }
        }
        io.sentry.android.core.e0.d("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0133, code lost:
    
        if (wt.w.h(r5, r2) == r3) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007e A[Catch: all -> 0x003b, TRY_LEAVE, TryCatch #1 {all -> 0x003b, blocks: (B:13:0x0030, B:25:0x0062, B:29:0x0076, B:31:0x007e, B:34:0x008b, B:36:0x0091, B:46:0x00c0, B:39:0x00a1, B:42:0x00b2, B:44:0x00ba, B:47:0x00c3, B:48:0x00c8, B:49:0x00c9, B:50:0x00ce, B:51:0x00cf, B:53:0x00d7, B:21:0x004c, B:24:0x0053), top: B:74:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x0133 -> B:15:0x0038). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object k(rq.c r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 329
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y1.x.k(rq.c):java.lang.Object");
    }

    public final void l(long j, boolean z10) {
        e2.s sVar;
        int i10;
        if (!br.l.a(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            return;
        }
        u.j jVarS = s();
        if (f1.b.a(j, 9205357640488583168L) || (((9223372034707292159L & j) + 36028792732385279L) & (-9223372034707292160L)) != 0) {
            return;
        }
        if (z10) {
            sVar = e2.p.f7750t;
        } else {
            if (z10) {
                throw new bf.n();
            }
            sVar = e2.p.f7749s;
        }
        Object[] objArr = jVarS.f23080c;
        long[] jArr = jVarS.f23078a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i11 = 0;
        while (true) {
            long j7 = jArr[i11];
            if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8;
                int i13 = 8 - ((~(i11 - length)) >>> 31);
                int i14 = 0;
                while (i14 < i13) {
                    if ((255 & j7) < 128) {
                        e2.l lVar = (e2.l) objArr[(i11 << 3) + i14];
                        t2.h hVar = lVar.f7722b;
                        float f10 = hVar.f22388a;
                        float f11 = hVar.f22389b;
                        i10 = i12;
                        float f12 = hVar.f22390c;
                        float f13 = hVar.f22391d;
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
                        if ((fIntBitsToFloat2 < f13) && ((((fIntBitsToFloat > f10 ? 1 : (fIntBitsToFloat == f10 ? 0 : -1)) >= 0) & ((fIntBitsToFloat > f12 ? 1 : (fIntBitsToFloat == f12 ? 0 : -1)) < 0)) & ((fIntBitsToFloat2 > f11 ? 1 : (fIntBitsToFloat2 == f11 ? 0 : -1)) >= 0))) {
                            Object objG = lVar.f7721a.f7717d.f1191a.g(sVar);
                            if (objG == null) {
                                objG = null;
                            }
                            if (objG != null) {
                                throw new ClassCastException();
                            }
                        } else {
                            continue;
                        }
                    } else {
                        i10 = i12;
                    }
                    j7 >>= i10;
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

    public final void m() {
        Trace.beginSection("sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (u()) {
                x(this.f25792d.getSemanticsOwner().a(), this.H);
            }
            Trace.endSection();
            Trace.beginSection("sendSemanticsPropertyChangeEvents");
            try {
                D(s());
                Trace.endSection();
                Trace.beginSection("updateSemanticsNodesCopyAndPanes");
                try {
                    K();
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    public final AccessibilityEvent n(int i10, int i11) {
        e2.l lVar;
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i11);
        accessibilityEventObtain.setEnabled(true);
        accessibilityEventObtain.setClassName("android.view.View");
        AndroidComposeView androidComposeView = this.f25792d;
        accessibilityEventObtain.setPackageName(androidComposeView.getContext().getPackageName());
        accessibilityEventObtain.setSource(androidComposeView, i10);
        if (u() && (lVar = (e2.l) s().b(i10)) != null) {
            e2.k kVar = lVar.f7721a;
            accessibilityEventObtain.setPassword(kVar.f7717d.f1191a.c(e2.p.F));
            Object objG = kVar.f7717d.f1191a.g(e2.p.f7743m);
            if (objG == null) {
                objG = null;
            }
            boolean zA = br.l.a(objG, Boolean.TRUE);
            if (Build.VERSION.SDK_INT >= 34) {
                u3.r.i(accessibilityEventObtain, zA);
            }
        }
        return accessibilityEventObtain;
    }

    public final g1.f0 o(g1.i0 i0Var, e2.k kVar) {
        x1.f1 f1VarD = kVar.d();
        return i0Var.a(kc.f.V(f1VarD != null ? f1VarD.f23811d : 0L), kVar.f7716c.f24818x, this.f25792d.getDensity());
    }

    public final AccessibilityEvent p(int i10, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent accessibilityEventN = n(i10, 8192);
        if (num != null) {
            accessibilityEventN.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            accessibilityEventN.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            accessibilityEventN.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            accessibilityEventN.getText().add(charSequence);
        }
        return accessibilityEventN;
    }

    public final int q(e2.k kVar) {
        SemanticsConfiguration semanticsConfiguration = kVar.f7717d;
        SemanticsConfiguration semanticsConfiguration2 = kVar.f7717d;
        e2.s sVar = e2.p.f7733a;
        if (!semanticsConfiguration.f1191a.c(e2.p.f7733a)) {
            e2.s sVar2 = e2.p.C;
            if (semanticsConfiguration2.f1191a.c(sVar2)) {
                return (int) (((h2.i0) semanticsConfiguration2.b(sVar2)).f9836a & 4294967295L);
            }
        }
        return this.f25806t;
    }

    public final int r(e2.k kVar) {
        SemanticsConfiguration semanticsConfiguration = kVar.f7717d;
        SemanticsConfiguration semanticsConfiguration2 = kVar.f7717d;
        e2.s sVar = e2.p.f7733a;
        if (!semanticsConfiguration.f1191a.c(e2.p.f7733a)) {
            e2.s sVar2 = e2.p.C;
            if (semanticsConfiguration2.f1191a.c(sVar2)) {
                return (int) (((h2.i0) semanticsConfiguration2.b(sVar2)).f9836a >> 32);
            }
        }
        return this.f25806t;
    }

    public final u.j s() {
        if (this.f25810x) {
            this.f25810x = false;
            AndroidComposeView androidComposeView = this.f25792d;
            this.f25812z = e2.n.b(androidComposeView.getSemanticsOwner());
            if (u()) {
                u.t tVar = this.f25812z;
                Resources resources = androidComposeView.getContext().getResources();
                u.r rVar = this.B;
                rVar.a();
                u.r rVar2 = this.C;
                rVar2.a();
                e2.l lVar = (e2.l) tVar.b(-1);
                e2.k kVar = lVar != null ? lVar.f7721a : null;
                br.l.b(kVar);
                ArrayList arrayListB = e2.v.b(kVar, new j1.a(24, tVar), new j1.a(25, resources), e5.H(kVar));
                int iZ = e5.z(arrayListB);
                int i10 = 1;
                if (1 <= iZ) {
                    while (true) {
                        int i11 = ((e2.k) arrayListB.get(i10 - 1)).f7720g;
                        int i12 = ((e2.k) arrayListB.get(i10)).f7720g;
                        rVar.f(i11, i12);
                        rVar2.f(i12, i11);
                        if (i10 == iZ) {
                            break;
                        }
                        i10++;
                    }
                }
            }
        }
        return this.f25812z;
    }

    public final boolean u() {
        return this.f25795g.isEnabled() && !this.k.isEmpty();
    }

    public final void v(x1.f0 f0Var) {
        if (this.f25808v.add(f0Var)) {
            this.f25809w.c(lq.b0.f15562a);
        }
    }

    public final int w(int i10) {
        if (i10 == this.f25792d.getSemanticsOwner().a().f7720g) {
            return -1;
        }
        return i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void x(e2.k r20, y1.q1 r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            int[] r3 = u.l.f23088a
            u.u r3 = new u.u
            r3.<init>()
            r4 = 4
            java.util.List r5 = e2.k.j(r4, r1)
            x1.f0 r6 = r1.f7716c
            int r7 = r5.size()
            r8 = 0
            r9 = r8
        L1a:
            if (r9 >= r7) goto L40
            java.lang.Object r10 = r5.get(r9)
            e2.k r10 = (e2.k) r10
            u.j r11 = r0.s()
            int r10 = r10.f7720g
            boolean r11 = r11.a(r10)
            if (r11 == 0) goto L3d
            u.u r11 = r2.f25766b
            boolean r11 = r11.b(r10)
            if (r11 != 0) goto L3a
            r0.v(r6)
            return
        L3a:
            r3.a(r10)
        L3d:
            int r9 = r9 + 1
            goto L1a
        L40:
            u.u r2 = r2.f25766b
            int[] r5 = r2.f23111b
            long[] r2 = r2.f23110a
            int r7 = r2.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L8b
            r9 = r8
        L4c:
            r10 = r2[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L86
            int r12 = r9 - r7
            int r12 = ~r12
            int r12 = r12 >>> 31
            r13 = 8
            int r12 = 8 - r12
            r14 = r8
        L66:
            if (r14 >= r12) goto L84
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r10
            r17 = 128(0x80, double:6.3E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L80
            int r15 = r9 << 3
            int r15 = r15 + r14
            r15 = r5[r15]
            boolean r15 = r3.b(r15)
            if (r15 != 0) goto L80
            r0.v(r6)
            return
        L80:
            long r10 = r10 >> r13
            int r14 = r14 + 1
            goto L66
        L84:
            if (r12 != r13) goto L8b
        L86:
            if (r9 == r7) goto L8b
            int r9 = r9 + 1
            goto L4c
        L8b:
            java.util.List r1 = e2.k.j(r4, r1)
            int r2 = r1.size()
        L93:
            if (r8 >= r2) goto Lb9
            java.lang.Object r3 = r1.get(r8)
            e2.k r3 = (e2.k) r3
            u.t r4 = r0.G
            int r5 = r3.f7720g
            java.lang.Object r4 = r4.b(r5)
            y1.q1 r4 = (y1.q1) r4
            if (r4 == 0) goto Lb6
            u.j r5 = r0.s()
            int r6 = r3.f7720g
            boolean r5 = r5.a(r6)
            if (r5 == 0) goto Lb6
            r0.x(r3, r4)
        Lb6:
            int r8 = r8 + 1
            goto L93
        Lb9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y1.x.x(e2.k, y1.q1):void");
    }

    public final boolean y(AccessibilityEvent accessibilityEvent) {
        if (!u()) {
            return false;
        }
        if (accessibilityEvent.getEventType() != 2048) {
            accessibilityEvent.getEventType();
        }
        return ((Boolean) this.f25794f.a(accessibilityEvent)).booleanValue();
    }

    public final boolean z(int i10, int i11, Integer num, List list) {
        if (i10 == Integer.MIN_VALUE || !u()) {
            return false;
        }
        AccessibilityEvent accessibilityEventN = n(i10, i11);
        if (num != null) {
            accessibilityEventN.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            accessibilityEventN.setContentDescription(v2.a.a(list, ",", null, 62));
        }
        return y(accessibilityEventN);
    }
}
