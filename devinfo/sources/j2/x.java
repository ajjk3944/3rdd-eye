package j2;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.res.Resources;
import android.graphics.Path;
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
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.applovin.shadow.okio.Segment;
import com.applovin.shadow.okio.internal.Buffer;
import com.google.android.gms.internal.ads.te0;
import com.liuzh.deviceinfo.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class x extends e4.b implements View.OnAttachStateChangeListener, AccessibilityManager.AccessibilityStateChangeListener, AccessibilityManager.TouchExplorationStateChangeListener {
    public static final x.t O;
    public x.u A;
    public final x.v B;
    public final x.s C;
    public final x.s D;
    public final String E;
    public final String F;
    public final w4.m G;
    public final x.u H;
    public s1 I;
    public boolean J;
    public final x.s K;
    public final ig.l L;
    public final ArrayList M;
    public final w N;

    /* renamed from: d, reason: collision with root package name */
    public final r f27336d;

    /* renamed from: e, reason: collision with root package name */
    public int f27337e = LinearLayoutManager.INVALID_OFFSET;

    /* renamed from: f, reason: collision with root package name */
    public final w f27338f;
    public final AccessibilityManager g;

    /* renamed from: h, reason: collision with root package name */
    public long f27339h;

    /* renamed from: i, reason: collision with root package name */
    public List f27340i;
    public final Handler j;

    /* renamed from: k, reason: collision with root package name */
    public final s f27341k;

    /* renamed from: l, reason: collision with root package name */
    public int f27342l;

    /* renamed from: m, reason: collision with root package name */
    public int f27343m;

    /* renamed from: n, reason: collision with root package name */
    public f4.f f27344n;

    /* renamed from: o, reason: collision with root package name */
    public f4.f f27345o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f27346p;

    /* renamed from: q, reason: collision with root package name */
    public final x.u f27347q;

    /* renamed from: r, reason: collision with root package name */
    public final x.u f27348r;

    /* renamed from: s, reason: collision with root package name */
    public final x.o0 f27349s;

    /* renamed from: t, reason: collision with root package name */
    public final x.o0 f27350t;

    /* renamed from: u, reason: collision with root package name */
    public int f27351u;

    /* renamed from: v, reason: collision with root package name */
    public Integer f27352v;

    /* renamed from: w, reason: collision with root package name */
    public final x.f f27353w;

    /* renamed from: x, reason: collision with root package name */
    public final zk.h f27354x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f27355y;

    /* renamed from: z, reason: collision with root package name */
    public t f27356z;

    static {
        int[] iArr = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
        x.t tVar = x.i.f36902a;
        x.t tVar2 = new x.t(32);
        int i4 = tVar2.f36945b;
        if (i4 < 0) {
            y.a.d("");
            throw null;
        }
        int i10 = i4 + 32;
        int[] iArr2 = tVar2.f36944a;
        if (iArr2.length < i10) {
            int[] iArrCopyOf = Arrays.copyOf(iArr2, Math.max(i10, (iArr2.length * 3) / 2));
            nk.k.d(iArrCopyOf, "copyOf(...)");
            tVar2.f36944a = iArrCopyOf;
        }
        int[] iArr3 = tVar2.f36944a;
        int i11 = tVar2.f36945b;
        if (i4 != i11) {
            zj.m.M(i10, i4, i11, iArr3, iArr3);
        }
        zj.m.Q(i4, 0, 12, iArr, iArr3);
        tVar2.f36945b += 32;
        O = tVar2;
    }

    public x(r rVar) {
        this.f27336d = rVar;
        int i4 = 0;
        this.f27338f = new w(this, i4);
        Object systemService = rVar.getContext().getSystemService("accessibility");
        nk.k.c(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        this.g = (AccessibilityManager) systemService;
        this.f27339h = 100L;
        this.j = new Handler(Looper.getMainLooper());
        this.f27341k = new s(this, i4);
        this.f27342l = LinearLayoutManager.INVALID_OFFSET;
        this.f27343m = LinearLayoutManager.INVALID_OFFSET;
        this.f27347q = new x.u();
        this.f27348r = new x.u();
        this.f27349s = new x.o0(0);
        this.f27350t = new x.o0(0);
        this.f27351u = -1;
        this.f27353w = new x.f(0);
        this.f27354x = com.bumptech.glide.e.f(1, 6, null);
        this.f27355y = true;
        x.u uVar = x.k.f36911a;
        nk.k.c(uVar, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.A = uVar;
        this.B = new x.v();
        this.C = new x.s();
        this.D = new x.s();
        this.E = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.F = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.G = new w4.m(4);
        this.H = new x.u();
        p2.p pVarA = rVar.getSemanticsOwner().a();
        nk.k.c(uVar, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.I = new s1(pVarA, uVar);
        int i10 = x.h.f36899a;
        this.K = new x.s();
        rVar.addOnAttachStateChangeListener(this);
        this.L = new ig.l(2, this);
        this.M = new ArrayList();
        this.N = new w(this, 1);
    }

    public static /* synthetic */ void E(x xVar, int i4, int i10, Integer num, int i11) {
        if ((i11 & 4) != 0) {
            num = null;
        }
        xVar.D(i4, i10, num, null);
    }

    public static Rect L(p1.z zVar, float f10, float f11) {
        if (!(zVar instanceof p1.e0) && !(zVar instanceof p1.f0)) {
            return null;
        }
        o1.c cVarK = zVar.k();
        return new Rect((int) (cVarK.f30366a + f10), (int) (cVarK.f30367b + f11), (int) (cVarK.f30368c + f10), (int) (cVarK.f30369d + f11));
    }

    public static float[] N(p1.z zVar) {
        if (!(zVar instanceof p1.f0)) {
            return null;
        }
        o1.d dVar = ((p1.f0) zVar).f30962f;
        long j = dVar.f30376h;
        long j8 = dVar.g;
        long j9 = dVar.f30375f;
        long j10 = dVar.f30374e;
        return new float[]{Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)), Float.intBitsToFloat((int) (j9 >> 32)), Float.intBitsToFloat((int) (j9 & 4294967295L)), Float.intBitsToFloat((int) (j8 >> 32)), Float.intBitsToFloat((int) (j8 & 4294967295L)), Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L))};
    }

    public static Region O(p1.z zVar, float f10, float f11) {
        if (!(zVar instanceof p1.d0)) {
            return null;
        }
        p1.d0 d0Var = (p1.d0) zVar;
        o1.c cVarE = d0Var.k().e(f10, f11);
        Region region = new Region(new Rect((int) (cVarE.f30366a + 0.0f), (int) (cVarE.f30367b + 0.0f), (int) (cVarE.f30368c + 0.0f), (int) (cVarE.f30369d + 0.0f)));
        Region region2 = new Region();
        p1.j jVar = d0Var.f30953f;
        if (!(jVar instanceof p1.j)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        Path path = jVar.f30986a;
        path.offset(f10, f11);
        region2.setPath(path, region);
        return region2;
    }

    public static CharSequence P(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            int i4 = 100000;
            if (charSequence.length() > 100000) {
                if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
                    i4 = 99999;
                }
                CharSequence charSequenceSubSequence = charSequence.subSequence(0, i4);
                nk.k.c(charSequenceSubSequence, "null cannot be cast to non-null type T of androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.trimToSize");
                return charSequenceSubSequence;
            }
        }
        return charSequence;
    }

    public static String t(p2.p pVar) {
        s2.e eVar;
        if (pVar != null) {
            p2.l lVar = pVar.f31104d;
            x.e0 e0Var = lVar.f31095a;
            p2.w wVar = p2.t.f31114a;
            if (e0Var.c(wVar)) {
                return f3.a.a((List) lVar.d(wVar), ",", null, 62);
            }
            p2.w wVar2 = p2.t.D;
            if (e0Var.c(wVar2)) {
                Object objG = e0Var.g(wVar2);
                if (objG == null) {
                    objG = null;
                }
                s2.e eVar2 = (s2.e) objG;
                if (eVar2 != null) {
                    return eVar2.f33365b;
                }
            } else {
                Object objG2 = e0Var.g(p2.t.f31137z);
                if (objG2 == null) {
                    objG2 = null;
                }
                List list = (List) objG2;
                if (list != null && (eVar = (s2.e) zj.n.d0(list)) != null) {
                    return eVar.f33365b;
                }
            }
        }
        return null;
    }

    public static final boolean x(p2.i iVar, float f10) {
        j0.r0 r0Var = iVar.f31051a;
        if (f10 >= 0.0f || ((Number) r0Var.invoke()).floatValue() <= 0.0f) {
            return f10 > 0.0f && ((Number) r0Var.invoke()).floatValue() < ((Number) iVar.f31052b.invoke()).floatValue();
        }
        return true;
    }

    public static final boolean y(p2.i iVar) {
        j0.r0 r0Var = iVar.f31051a;
        if (((Number) r0Var.invoke()).floatValue() > 0.0f) {
            return true;
        }
        ((Number) r0Var.invoke()).floatValue();
        ((Number) iVar.f31052b.invoke()).floatValue();
        return false;
    }

    public static final boolean z(p2.i iVar) {
        j0.r0 r0Var = iVar.f31051a;
        if (((Number) r0Var.invoke()).floatValue() < ((Number) iVar.f31052b.invoke()).floatValue()) {
            return true;
        }
        ((Number) r0Var.invoke()).floatValue();
        return false;
    }

    public final int A(int i4) {
        if (i4 == this.f27336d.getSemanticsOwner().a().g) {
            return -1;
        }
        return i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void B(p2.p r20, j2.s1 r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            int[] r3 = x.l.f36913a
            x.v r3 = new x.v
            r3.<init>()
            r4 = 4
            java.util.List r5 = p2.p.j(r4, r1)
            i2.e0 r6 = r1.f31103c
            int r7 = r5.size()
            r8 = 0
            r9 = r8
        L1a:
            if (r9 >= r7) goto L40
            java.lang.Object r10 = r5.get(r9)
            p2.p r10 = (p2.p) r10
            x.j r11 = r0.s()
            int r10 = r10.g
            boolean r11 = r11.a(r10)
            if (r11 == 0) goto L3d
            x.v r11 = r2.f27312b
            boolean r11 = r11.b(r10)
            if (r11 != 0) goto L3a
            r0.w(r6)
            return
        L3a:
            r3.a(r10)
        L3d:
            int r9 = r9 + 1
            goto L1a
        L40:
            x.v r2 = r2.f27312b
            int[] r5 = r2.f36948b
            long[] r2 = r2.f36947a
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
            r0.w(r6)
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
            java.util.List r1 = p2.p.j(r4, r1)
            int r2 = r1.size()
        L93:
            if (r8 >= r2) goto Lb9
            java.lang.Object r3 = r1.get(r8)
            p2.p r3 = (p2.p) r3
            x.u r4 = r0.H
            int r5 = r3.g
            java.lang.Object r4 = r4.b(r5)
            j2.s1 r4 = (j2.s1) r4
            if (r4 == 0) goto Lb6
            x.j r5 = r0.s()
            int r6 = r3.g
            boolean r5 = r5.a(r6)
            if (r5 == 0) goto Lb6
            r0.B(r3, r4)
        Lb6:
            int r8 = r8 + 1
            goto L93
        Lb9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j2.x.B(p2.p, j2.s1):void");
    }

    public final boolean C(AccessibilityEvent accessibilityEvent) {
        if (!v()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.f27346p = true;
        }
        try {
            return ((Boolean) this.f27338f.invoke(accessibilityEvent)).booleanValue();
        } finally {
            this.f27346p = false;
        }
    }

    public final boolean D(int i4, int i10, Integer num, List list) {
        if (i4 == Integer.MIN_VALUE || !v()) {
            return false;
        }
        AccessibilityEvent accessibilityEventO = o(i4, i10);
        if (num != null) {
            accessibilityEventO.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            accessibilityEventO.setContentDescription(f3.a.a(list, ",", null, 62));
        }
        return C(accessibilityEventO);
    }

    public final void F(int i4, int i10, String str) {
        AccessibilityEvent accessibilityEventO = o(A(i4), 32);
        accessibilityEventO.setContentChangeTypes(i10);
        if (str != null) {
            accessibilityEventO.getText().add(str);
        }
        C(accessibilityEventO);
    }

    public final void G(int i4) {
        t tVar = this.f27356z;
        if (tVar != null) {
            p2.p pVar = tVar.f27313a;
            if (i4 != pVar.g) {
                return;
            }
            if (SystemClock.uptimeMillis() - tVar.f27318f <= 1000) {
                AccessibilityEvent accessibilityEventO = o(A(pVar.g), 131072);
                accessibilityEventO.setFromIndex(tVar.f27316d);
                accessibilityEventO.setToIndex(tVar.f27317e);
                accessibilityEventO.setAction(tVar.f27314b);
                accessibilityEventO.setMovementGranularity(tVar.f27315c);
                accessibilityEventO.getText().add(t(pVar));
                C(accessibilityEventO);
            }
        }
        this.f27356z = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:223:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0515  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x063d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0132  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void H(x.j r59) {
        /*
            Method dump skipped, instructions count: 1679
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j2.x.H(x.j):void");
    }

    public final void I(i2.e0 e0Var, x.v vVar) {
        p2.l lVarX;
        if (e0Var.H() && !this.f27336d.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(e0Var)) {
            i2.e0 e0Var2 = null;
            if (!e0Var.G.f(8)) {
                e0Var = e0Var.v();
                while (true) {
                    if (e0Var == null) {
                        e0Var = null;
                        break;
                    } else if (e0Var.G.f(8)) {
                        break;
                    } else {
                        e0Var = e0Var.v();
                    }
                }
            }
            if (e0Var == null || (lVarX = e0Var.x()) == null) {
                return;
            }
            if (!lVarX.f31097c) {
                i2.e0 e0VarV = e0Var.v();
                while (true) {
                    if (e0VarV != null) {
                        p2.l lVarX2 = e0VarV.x();
                        if (lVarX2 != null && lVarX2.f31097c) {
                            e0Var2 = e0VarV;
                            break;
                        }
                        e0VarV = e0VarV.v();
                    } else {
                        break;
                    }
                }
                if (e0Var2 != null) {
                    e0Var = e0Var2;
                }
            }
            int i4 = e0Var.f25628b;
            if (vVar.a(i4)) {
                E(this, A(i4), 2048, 1, 8);
            }
        }
    }

    public final void J(i2.e0 e0Var) {
        if (e0Var.H() && !this.f27336d.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(e0Var)) {
            int i4 = e0Var.f25628b;
            p2.i iVar = (p2.i) this.f27347q.b(i4);
            p2.i iVar2 = (p2.i) this.f27348r.b(i4);
            if (iVar == null && iVar2 == null) {
                return;
            }
            AccessibilityEvent accessibilityEventO = o(i4, Buffer.SEGMENTING_THRESHOLD);
            if (iVar != null) {
                accessibilityEventO.setScrollX((int) ((Number) iVar.f31051a.invoke()).floatValue());
                accessibilityEventO.setMaxScrollX((int) ((Number) iVar.f31052b.invoke()).floatValue());
            }
            if (iVar2 != null) {
                accessibilityEventO.setScrollY((int) ((Number) iVar2.f31051a.invoke()).floatValue());
                accessibilityEventO.setMaxScrollY((int) ((Number) iVar2.f31052b.invoke()).floatValue());
            }
            C(accessibilityEventO);
        }
    }

    public final boolean K(p2.p pVar, int i4, int i10, boolean z3) {
        String strT;
        p2.l lVar = pVar.f31104d;
        int i11 = pVar.g;
        p2.w wVar = p2.k.j;
        if (lVar.f31095a.c(wVar) && d0.b(pVar)) {
            mk.f fVar = (mk.f) ((p2.a) pVar.f31104d.d(wVar)).f31037b;
            if (fVar != null) {
                return ((Boolean) fVar.a(Integer.valueOf(i4), Integer.valueOf(i10), Boolean.valueOf(z3))).booleanValue();
            }
        } else if ((i4 != i10 || i10 != this.f27351u) && (strT = t(pVar)) != null) {
            if (i4 < 0 || i4 != i10 || i10 > strT.length()) {
                i4 = -1;
            }
            this.f27351u = i4;
            boolean z10 = strT.length() > 0;
            C(p(A(i11), z10 ? Integer.valueOf(this.f27351u) : null, z10 ? Integer.valueOf(this.f27351u) : null, z10 ? Integer.valueOf(strT.length()) : null, strT));
            G(i11);
            return true;
        }
        return false;
    }

    public final Rect M(float f10, float f11, float f12, float f13) {
        long jFloatToRawIntBits = (Float.floatToRawIntBits(f11) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32);
        r rVar = this.f27336d;
        long jV = rVar.v(jFloatToRawIntBits);
        long jV2 = rVar.v((Float.floatToRawIntBits(f13) & 4294967295L) | (Float.floatToRawIntBits(f12) << 32));
        int i4 = (int) (jV >> 32);
        int i10 = (int) (jV2 >> 32);
        int i11 = (int) (jV & 4294967295L);
        int i12 = (int) (jV2 & 4294967295L);
        return new Rect((int) Math.floor(Math.min(Float.intBitsToFloat(i4), Float.intBitsToFloat(i10))), (int) Math.floor(Math.min(Float.intBitsToFloat(i11), Float.intBitsToFloat(i12))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i4), Float.intBitsToFloat(i10))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i11), Float.intBitsToFloat(i12))));
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x013b, code lost:
    
        r28 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0145, code lost:
    
        if (((r7 & ((~r7) << 6)) & r20) == 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0147, code lost:
    
        r25 = -1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Q() {
        /*
            Method dump skipped, instructions count: 526
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j2.x.Q():void");
    }

    @Override // e4.b
    public final jf.c b(View view) {
        return this.f27341k;
    }

    public final void j(int i4, f4.f fVar, String str, Bundle bundle) {
        p2.p pVar;
        int i10;
        int i11;
        float fH;
        float fH2;
        float fG;
        float fG2;
        int i12;
        RectF rectF;
        AccessibilityNodeInfo accessibilityNodeInfo = fVar.f23651a;
        p2.q qVar = (p2.q) s().b(i4);
        if (qVar == null || (pVar = qVar.f31107a) == null) {
            return;
        }
        i2.e0 e0Var = pVar.f31103c;
        p2.l lVar = pVar.f31104d;
        x.e0 e0Var2 = lVar.f31095a;
        String strT = t(pVar);
        if (nk.k.a(str, this.E)) {
            int iD = this.C.d(i4);
            if (iD != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iD);
                return;
            }
            return;
        }
        if (nk.k.a(str, this.F)) {
            int iD2 = this.D.d(i4);
            if (iD2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iD2);
                return;
            }
            return;
        }
        boolean zC = e0Var2.c(p2.k.f31071a);
        r rVar = this.f27336d;
        boolean z3 = false;
        if (!zC || bundle == null || !nk.k.a(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            p2.w wVar = p2.t.f31135x;
            if (e0Var2.c(wVar) && bundle != null && nk.k.a(str, "androidx.compose.ui.semantics.testTag")) {
                Object objG = e0Var2.g(wVar);
                String str2 = (String) (objG == null ? null : objG);
                if (str2 != null) {
                    accessibilityNodeInfo.getExtras().putCharSequence(str, str2);
                    return;
                }
                return;
            }
            if (nk.k.a(str, "androidx.compose.ui.semantics.id")) {
                accessibilityNodeInfo.getExtras().putInt(str, pVar.g);
                return;
            }
            if (nk.k.a(str, "androidx.compose.ui.semantics.shapeType")) {
                Object objG2 = e0Var2.g(p2.t.M);
                p1.j0 j0Var = (p1.j0) (objG2 == null ? null : objG2);
                if (j0Var != null) {
                    Rect rect = new Rect();
                    accessibilityNodeInfo.getBoundsInScreen(rect);
                    o1.c cVarU = u(pVar, rect, j0Var);
                    float f10 = cVarU.f30367b;
                    float f11 = cVarU.f30366a;
                    p1.z zVarA = j0Var.a(cVarU.c(), e0Var.A, rVar.getDensity());
                    if (zVarA instanceof p1.e0) {
                        accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 0);
                        accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", L(zVarA, f11, f10));
                        return;
                    } else if (zVarA instanceof p1.f0) {
                        accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 1);
                        accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", L(zVarA, f11, f10));
                        accessibilityNodeInfo.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", N(zVarA));
                        return;
                    } else {
                        if (!(zVarA instanceof p1.d0)) {
                            throw new ac.m();
                        }
                        accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 2);
                        accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", O(zVarA, f11, f10));
                        return;
                    }
                }
                return;
            }
            if (nk.k.a(str, "androidx.compose.ui.semantics.shapeRect")) {
                Object objG3 = e0Var2.g(p2.t.M);
                p1.j0 j0Var2 = (p1.j0) (objG3 == null ? null : objG3);
                if (j0Var2 != null) {
                    Rect rect2 = new Rect();
                    accessibilityNodeInfo.getBoundsInScreen(rect2);
                    o1.c cVarU2 = u(pVar, rect2, j0Var2);
                    Rect rectL = L(j0Var2.a(cVarU2.c(), e0Var.A, rVar.getDensity()), cVarU2.f30366a, cVarU2.f30367b);
                    if (rectL != null) {
                        accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", rectL);
                        return;
                    }
                    return;
                }
                return;
            }
            if (nk.k.a(str, "androidx.compose.ui.semantics.shapeCorners")) {
                Object objG4 = e0Var2.g(p2.t.M);
                p1.j0 j0Var3 = (p1.j0) (objG4 == null ? null : objG4);
                if (j0Var3 != null) {
                    Rect rect3 = new Rect();
                    accessibilityNodeInfo.getBoundsInScreen(rect3);
                    float[] fArrN = N(j0Var3.a(u(pVar, rect3, j0Var3).c(), e0Var.A, rVar.getDensity()));
                    if (fArrN != null) {
                        accessibilityNodeInfo.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", fArrN);
                        return;
                    }
                    return;
                }
                return;
            }
            if (nk.k.a(str, "androidx.compose.ui.semantics.shapeRegion")) {
                Object objG5 = e0Var2.g(p2.t.M);
                p1.j0 j0Var4 = (p1.j0) (objG5 == null ? null : objG5);
                if (j0Var4 != null) {
                    Rect rect4 = new Rect();
                    accessibilityNodeInfo.getBoundsInScreen(rect4);
                    o1.c cVarU3 = u(pVar, rect4, j0Var4);
                    Region regionO = O(j0Var4.a(cVarU3.c(), e0Var.A, rVar.getDensity()), cVarU3.f30366a, cVarU3.f30367b);
                    if (regionO != null) {
                        accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", regionO);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        int i13 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
        int i14 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
        if (i14 > 0 && i13 >= 0) {
            if (i13 < (strT != null ? strT.length() : Integer.MAX_VALUE)) {
                s2.e0 e0VarL = d0.l(lVar);
                if (e0VarL == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                int i15 = 0;
                while (i15 < i14) {
                    int i16 = i13 + i15;
                    if (i16 >= e0VarL.f33368a.f33356a.f33365b.length()) {
                        arrayList.add(z3);
                        i10 = i13;
                        i11 = i14;
                        i12 = i15;
                    } else {
                        te0 te0Var = e0VarL.f33369b;
                        s2.e eVar = (s2.e) ((androidx.lifecycle.f1) te0Var.f16795c).f1134b;
                        if (i16 < 0 || i16 >= eVar.f33365b.length()) {
                            StringBuilder sbW = je.u.w(i16, "offset(", ") is out of bounds [0, ");
                            sbW.append(eVar.f33365b.length());
                            sbW.append(')');
                            x2.a.a(sbW.toString());
                        }
                        ArrayList arrayList2 = (ArrayList) te0Var.f16797e;
                        s2.m mVar = (s2.m) arrayList2.get(s2.z.c(i16, arrayList2));
                        s2.a aVar = mVar.f33402a;
                        int iA = mVar.a(i16);
                        CharSequence charSequence = aVar.f33331e;
                        if (iA < 0 || iA >= charSequence.length()) {
                            StringBuilder sbW2 = je.u.w(iA, "offset(", ") is out of bounds [0,");
                            sbW2.append(charSequence.length());
                            sbW2.append(')');
                            x2.a.a(sbW2.toString());
                        }
                        t2.p pVar2 = aVar.f33330d;
                        Layout layout = pVar2.f34144e;
                        int lineForOffset = layout.getLineForOffset(iA);
                        float f12 = pVar2.f(lineForOffset);
                        i10 = i13;
                        float fD = pVar2.d(lineForOffset);
                        i11 = i14;
                        boolean z10 = layout.getParagraphDirection(lineForOffset) == 1;
                        boolean zIsRtlCharAt = layout.isRtlCharAt(iA);
                        if (!z10 || zIsRtlCharAt) {
                            if (z10 && zIsRtlCharAt) {
                                fG = pVar2.h(iA, false);
                                fG2 = pVar2.h(iA + 1, true);
                            } else if (zIsRtlCharAt) {
                                fG = pVar2.g(iA, false);
                                fG2 = pVar2.g(iA + 1, true);
                            } else {
                                fH = pVar2.h(iA, false);
                                fH2 = pVar2.h(iA + 1, true);
                            }
                            float f13 = fG;
                            fH = fG2;
                            fH2 = f13;
                        } else {
                            fH = pVar2.g(iA, false);
                            fH2 = pVar2.g(iA + 1, true);
                        }
                        RectF rectF2 = new RectF(fH, f12, fH2, fD);
                        float f14 = rectF2.left;
                        float f15 = rectF2.top;
                        float f16 = rectF2.right;
                        float f17 = rectF2.bottom;
                        i12 = i15;
                        long jFloatToRawIntBits = (Float.floatToRawIntBits(mVar.f33407f) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
                        int i17 = (int) (jFloatToRawIntBits >> 32);
                        float fIntBitsToFloat = Float.intBitsToFloat(i17) + f14;
                        int i18 = (int) (jFloatToRawIntBits & 4294967295L);
                        o1.c cVar = new o1.c(fIntBitsToFloat, Float.intBitsToFloat(i18) + f15, Float.intBitsToFloat(i17) + f16, Float.intBitsToFloat(i18) + f17);
                        i2.d1 d1VarD = pVar.d();
                        long jE = 0;
                        if (d1VarD != null) {
                            if (!d1VarD.z0().f25565n) {
                                d1VarD = null;
                            }
                            if (d1VarD != null) {
                                jE = d1VarD.E(0L);
                            }
                        }
                        o1.c cVarF = cVar.f(jE);
                        o1.c cVarG = pVar.g();
                        if ((((((cVarF.f30366a > cVarG.f30368c ? 1 : (cVarF.f30366a == cVarG.f30368c ? 0 : -1)) < 0) & ((cVarG.f30366a > cVarF.f30368c ? 1 : (cVarG.f30366a == cVarF.f30368c ? 0 : -1)) < 0)) & ((cVarF.f30367b > cVarG.f30369d ? 1 : (cVarF.f30367b == cVarG.f30369d ? 0 : -1)) < 0)) & ((cVarG.f30367b > cVarF.f30369d ? 1 : (cVarG.f30367b == cVarF.f30369d ? 0 : -1)) < 0) ? cVarF.d(cVarG) : null) != null) {
                            long jV = rVar.v((Float.floatToRawIntBits(r1.f30367b) & 4294967295L) | (Float.floatToRawIntBits(r1.f30366a) << 32));
                            long jV2 = rVar.v((Float.floatToRawIntBits(r1.f30368c) << 32) | (Float.floatToRawIntBits(r1.f30369d) & 4294967295L));
                            int i19 = (int) (jV >> 32);
                            int i20 = (int) (jV2 >> 32);
                            int i21 = (int) (jV & 4294967295L);
                            int i22 = (int) (jV2 & 4294967295L);
                            rectF = new RectF(Math.min(Float.intBitsToFloat(i19), Float.intBitsToFloat(i20)), Math.min(Float.intBitsToFloat(i21), Float.intBitsToFloat(i22)), Math.max(Float.intBitsToFloat(i19), Float.intBitsToFloat(i20)), Math.max(Float.intBitsToFloat(i21), Float.intBitsToFloat(i22)));
                        } else {
                            rectF = null;
                        }
                        arrayList.add(rectF);
                    }
                    i15 = i12 + 1;
                    i14 = i11;
                    i13 = i10;
                    z3 = false;
                }
                accessibilityNodeInfo.getExtras().putParcelableArray(str, (Parcelable[]) arrayList.toArray(new RectF[0]));
                return;
            }
        }
        Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
    }

    public final Rect k(p2.q qVar) {
        d3.j jVar = qVar.f31108b;
        return M(jVar.f21961a, jVar.f21962b, jVar.f21963c, jVar.f21964d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f2, code lost:
    
        if (xk.x.i(r4, r2) == r7) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0077 A[Catch: all -> 0x0037, TryCatch #1 {all -> 0x0037, blocks: (B:13:0x0030, B:24:0x005d, B:28:0x006f, B:30:0x0077, B:32:0x0080, B:34:0x0086, B:35:0x0095, B:37:0x009d, B:20:0x0047, B:23:0x004e), top: B:57:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00f2 -> B:50:0x00f5). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object l(ek.c r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j2.x.l(ek.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m(long r23, int r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j2.x.m(long, int, boolean):boolean");
    }

    public final void n() {
        Trace.beginSection("sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (v()) {
                B(this.f27336d.getSemanticsOwner().a(), this.I);
            }
            Trace.endSection();
            Trace.beginSection("sendSemanticsPropertyChangeEvents");
            try {
                H(s());
                Trace.endSection();
                Trace.beginSection("updateSemanticsNodesCopyAndPanes");
                try {
                    Q();
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    public final AccessibilityEvent o(int i4, int i10) {
        p2.q qVar;
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i10);
        accessibilityEventObtain.setEnabled(true);
        accessibilityEventObtain.setClassName("android.view.View");
        r rVar = this.f27336d;
        accessibilityEventObtain.setPackageName(rVar.getContext().getPackageName());
        accessibilityEventObtain.setSource(rVar, i4);
        if (v() && (qVar = (p2.q) s().b(i4)) != null) {
            p2.p pVar = qVar.f31107a;
            accessibilityEventObtain.setPassword(pVar.f31104d.f31095a.c(p2.t.H));
            Object objG = pVar.f31104d.f31095a.g(p2.t.f31125n);
            if (objG == null) {
                objG = null;
            }
            boolean zA = nk.k.a(objG, Boolean.TRUE);
            if (Build.VERSION.SDK_INT >= 34) {
                e4.e0.l(accessibilityEventObtain, zA);
            }
        }
        return accessibilityEventObtain;
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z3) {
        this.f27340i = null;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z3) {
        this.f27340i = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AccessibilityManager accessibilityManager = this.g;
        if (accessibilityManager.isEnabled()) {
            this.f27340i = null;
        }
        accessibilityManager.addAccessibilityStateChangeListener(this);
        accessibilityManager.addTouchExplorationStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.j.removeCallbacks(this.L);
        AccessibilityManager accessibilityManager = this.g;
        accessibilityManager.removeAccessibilityStateChangeListener(this);
        accessibilityManager.removeTouchExplorationStateChangeListener(this);
    }

    public final AccessibilityEvent p(int i4, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent accessibilityEventO = o(i4, Segment.SIZE);
        if (num != null) {
            accessibilityEventO.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            accessibilityEventO.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            accessibilityEventO.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            accessibilityEventO.getText().add(charSequence);
        }
        return accessibilityEventO;
    }

    public final int q(p2.p pVar) {
        p2.l lVar = pVar.f31104d;
        p2.l lVar2 = pVar.f31104d;
        p2.w wVar = p2.t.f31114a;
        if (!lVar.f31095a.c(p2.t.f31114a)) {
            p2.w wVar2 = p2.t.E;
            if (lVar2.f31095a.c(wVar2)) {
                return (int) (((s2.g0) lVar2.d(wVar2)).f33388a & 4294967295L);
            }
        }
        return this.f27351u;
    }

    public final int r(p2.p pVar) {
        p2.l lVar = pVar.f31104d;
        p2.l lVar2 = pVar.f31104d;
        p2.w wVar = p2.t.f31114a;
        if (!lVar.f31095a.c(p2.t.f31114a)) {
            p2.w wVar2 = p2.t.E;
            if (lVar2.f31095a.c(wVar2)) {
                return (int) (((s2.g0) lVar2.d(wVar2)).f33388a >> 32);
            }
        }
        return this.f27351u;
    }

    public final x.j s() {
        if (this.f27355y) {
            this.f27355y = false;
            r rVar = this.f27336d;
            this.A = p2.s.b(rVar.getSemanticsOwner(), m.f27227c);
            if (v()) {
                x.u uVar = this.A;
                Resources resources = rVar.getContext().getResources();
                x.s sVar = this.C;
                sVar.a();
                x.s sVar2 = this.D;
                sVar2.a();
                p2.q qVar = (p2.q) uVar.b(-1);
                p2.p pVar = qVar != null ? qVar.f31107a : null;
                nk.k.b(pVar);
                ArrayList arrayListB = p2.y.b(pVar, new c2.l0(9, uVar), new c2.l0(10, resources), cm.g.s(pVar));
                int iR = cm.g.r(arrayListB);
                int i4 = 1;
                if (1 <= iR) {
                    while (true) {
                        int i10 = ((p2.p) arrayListB.get(i4 - 1)).g;
                        int i11 = ((p2.p) arrayListB.get(i4)).g;
                        sVar.f(i10, i11);
                        sVar2.f(i11, i10);
                        if (i4 == iR) {
                            break;
                        }
                        i4++;
                    }
                }
            }
        }
        return this.A;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0075 A[LOOP:0: B:4:0x0016->B:36:0x0075, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0078 A[EDGE_INSN: B:47:0x0078->B:37:0x0078 BREAK  A[LOOP:0: B:4:0x0016->B:36:0x0075], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final o1.c u(p2.p r10, android.graphics.Rect r11, p1.j0 r12) {
        /*
            Method dump skipped, instructions count: 198
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j2.x.u(p2.p, android.graphics.Rect, p1.j0):o1.c");
    }

    public final boolean v() {
        AccessibilityManager accessibilityManager = this.g;
        if (!accessibilityManager.isEnabled()) {
            return false;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = this.f27340i;
        if (enabledAccessibilityServiceList == null) {
            enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(-1);
            this.f27340i = enabledAccessibilityServiceList;
        }
        return !enabledAccessibilityServiceList.isEmpty();
    }

    public final void w(i2.e0 e0Var) {
        if (this.f27353w.add(e0Var)) {
            this.f27354x.l(yj.u.f37649a);
        }
    }
}
