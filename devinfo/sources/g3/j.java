package g3;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.a0;
import androidx.lifecycle.y0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.z0;
import c2.d0;
import c2.j0;
import c2.l0;
import c2.y;
import com.google.android.gms.internal.measurement.d5;
import com.liuzh.deviceinfo.R;
import e4.c2;
import e4.m0;
import e4.v0;
import g2.n0;
import i2.e0;
import i2.m1;
import i2.n1;
import i2.o1;
import i2.w1;
import i2.z1;
import j2.i2;
import java.util.LinkedHashMap;
import p1.z;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class j extends ViewGroup implements e4.r, u0.h, n1, e4.s {

    /* renamed from: a, reason: collision with root package name */
    public final b2.e f24478a;

    /* renamed from: b, reason: collision with root package name */
    public final View f24479b;

    /* renamed from: c, reason: collision with root package name */
    public final m1 f24480c;

    /* renamed from: d, reason: collision with root package name */
    public mk.a f24481d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f24482e;

    /* renamed from: f, reason: collision with root package name */
    public mk.a f24483f;
    public mk.a g;

    /* renamed from: h, reason: collision with root package name */
    public i1.n f24484h;

    /* renamed from: i, reason: collision with root package name */
    public mk.c f24485i;
    public d3.c j;

    /* renamed from: k, reason: collision with root package name */
    public mk.c f24486k;

    /* renamed from: l, reason: collision with root package name */
    public a0 f24487l;

    /* renamed from: m, reason: collision with root package name */
    public a6.f f24488m;

    /* renamed from: n, reason: collision with root package name */
    public final int[] f24489n;

    /* renamed from: o, reason: collision with root package name */
    public long f24490o;

    /* renamed from: p, reason: collision with root package name */
    public c2 f24491p;

    /* renamed from: q, reason: collision with root package name */
    public mk.c f24492q;

    /* renamed from: r, reason: collision with root package name */
    public final i f24493r;

    /* renamed from: s, reason: collision with root package name */
    public final i f24494s;

    /* renamed from: t, reason: collision with root package name */
    public mk.c f24495t;

    /* renamed from: u, reason: collision with root package name */
    public final int[] f24496u;

    /* renamed from: v, reason: collision with root package name */
    public int f24497v;

    /* renamed from: w, reason: collision with root package name */
    public int f24498w;

    /* renamed from: x, reason: collision with root package name */
    public final z0 f24499x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f24500y;

    /* renamed from: z, reason: collision with root package name */
    public final e0 f24501z;

    public j(Context context, u0.o oVar, int i4, b2.e eVar, View view, m1 m1Var) {
        super(context);
        this.f24478a = eVar;
        this.f24479b = view;
        this.f24480c = m1Var;
        LinkedHashMap linkedHashMap = i2.f27186a;
        setTag(R.id.androidx_compose_ui_view_composition_context, oVar);
        int i10 = 0;
        setSaveFromParentEnabled(false);
        addView(view);
        x xVar = (x) this;
        v0.r(this, new b(xVar));
        m0.j(this, this);
        this.f24481d = h.f24474d;
        this.f24483f = h.f24473c;
        this.g = h.f24472b;
        this.f24484h = i1.k.f25553a;
        this.j = d5.a();
        int i11 = 2;
        this.f24489n = new int[2];
        this.f24490o = 0L;
        int i12 = 1;
        this.f24493r = new i(xVar, i12);
        this.f24494s = new i(xVar, i10);
        this.f24496u = new int[2];
        this.f24497v = LinearLayoutManager.INVALID_OFFSET;
        this.f24498w = LinearLayoutManager.INVALID_OFFSET;
        this.f24499x = new z0();
        e0 e0Var = new e0(3);
        e0Var.f25640p = xVar;
        i1.n nVarB = ((i2.v0) b2.g.a(eVar)).b(new p2.b(c.f24456d, true));
        y yVar = new y();
        yVar.f2697a = new c2.a0(xVar, i10);
        d0 d0Var = new d0();
        d0 d0Var2 = yVar.f2698b;
        if (d0Var2 != null) {
            d0Var2.f2600b = null;
        }
        yVar.f2698b = d0Var;
        d0Var.f2600b = yVar;
        setOnRequestDisallowInterceptTouchEvent$ui(d0Var);
        i1.n nVarB2 = n0.h(m1.f.a(nVarB.b(yVar), new f(xVar, e0Var, xVar)), new d(xVar, e0Var, i11)).b(new o(new c2.a0(xVar, i11)));
        e0Var.d0(this.f24484h.b(nVarB2));
        this.f24485i = new c2.w(i12, e0Var, nVarB2);
        e0Var.Z(this.j);
        this.f24486k = new l0(i11, e0Var);
        e0Var.N = new d(xVar, e0Var, i10);
        e0Var.O = new c2.a0(xVar, i12);
        e0Var.c0(new e(xVar, e0Var));
        this.f24501z = e0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final o1 getSnapshotObserver() {
        if (!isAttachedToWindow()) {
            f2.a.b("Expected AndroidViewHolder to be attached when observing reads.");
        }
        return ((j2.r) this.f24480c).getSnapshotObserver();
    }

    public static final int l(x xVar, int i4, int i10, int i11) {
        return (i11 >= 0 || i4 == i10) ? View.MeasureSpec.makeMeasureSpec(ci.b.e(i11, i4, i10), 1073741824) : (i11 != -2 || i10 == Integer.MAX_VALUE) ? (i11 != -1 || i10 == Integer.MAX_VALUE) ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(i10, 1073741824) : View.MeasureSpec.makeMeasureSpec(i10, LinearLayoutManager.INVALID_OFFSET);
    }

    public static v3.b m(v3.b bVar, int i4, int i10, int i11, int i12) {
        int i13 = bVar.f35793a - i4;
        if (i13 < 0) {
            i13 = 0;
        }
        int i14 = bVar.f35794b - i10;
        if (i14 < 0) {
            i14 = 0;
        }
        int i15 = bVar.f35795c - i11;
        if (i15 < 0) {
            i15 = 0;
        }
        int i16 = bVar.f35796d - i12;
        return v3.b.c(i13, i14, i15, i16 >= 0 ? i16 : 0);
    }

    @Override // u0.h
    public final void a() {
        this.g.invoke();
    }

    @Override // u0.h
    public final void b() {
        this.f24483f.invoke();
        removeAllViewsInLayout();
    }

    @Override // e4.q
    public final void c(int i4, View view) {
        z0 z0Var = this.f24499x;
        if (i4 == 1) {
            z0Var.f1564b = 0;
        } else {
            z0Var.f1563a = 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29, types: [i1.m] */
    /* JADX WARN: Type inference failed for: r1v38, types: [i2.z1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v39 */
    @Override // e4.r
    public final void d(View view, int i4, int i10, int i11, int i12, int i13, int[] iArr) {
        char c9;
        long j;
        char c10;
        com.google.android.gms.internal.consent_sdk.a0 a0Var;
        i1.m mVarE;
        if (this.f24479b.isNestedScrollingEnabled()) {
            char c11 = 65535;
            float f10 = -1;
            char c12 = ' ';
            long j8 = 4294967295L;
            long jFloatToRawIntBits = (Float.floatToRawIntBits(i4 * f10) << 32) | (Float.floatToRawIntBits(i10 * f10) & 4294967295L);
            long jFloatToRawIntBits2 = (Float.floatToRawIntBits(i12 * f10) & 4294967295L) | (Float.floatToRawIntBits(i11 * f10) << 32);
            int i14 = i13 == 0 ? 1 : 2;
            b2.j jVar = this.f24478a.f1641a;
            b2.j jVar2 = null;
            if (jVar == null || !jVar.f25565n) {
                c9 = ' ';
                j = 4294967295L;
                c10 = 0;
            } else {
                if (!jVar.f25554a.f25565n) {
                    f2.a.b("visitAncestors called on an unattached node");
                }
                i1.m mVar = jVar.f25554a.f25558e;
                e0 e0VarS = i2.k.s(jVar);
                loop0: while (true) {
                    if (e0VarS == null) {
                        c9 = c12;
                        j = j8;
                        break;
                    }
                    c9 = c12;
                    if ((((i1.m) e0VarS.G.g).f25557d & 262144) != 0) {
                        while (mVar != null) {
                            if ((mVar.f25556c & 262144) != 0) {
                                w0.e eVar = null;
                                i2.j jVar3 = mVar;
                                while (jVar3 != 0) {
                                    char c13 = c11;
                                    if (jVar3 instanceof z1) {
                                        ?? r12 = (z1) jVar3;
                                        j = j8;
                                        if (nk.k.a(jVar.f1658r, r12.e()) && b2.j.class == r12.getClass()) {
                                            jVar2 = r12;
                                            break loop0;
                                        }
                                    } else {
                                        j = j8;
                                        if ((jVar3.f25556c & 262144) != 0 && (jVar3 instanceof i2.j)) {
                                            i1.m mVar2 = jVar3.f25691p;
                                            int i15 = 0;
                                            mVarE = jVar3;
                                            while (mVar2 != null) {
                                                mVarE = mVarE;
                                                if ((mVar2.f25556c & 262144) != 0) {
                                                    i15++;
                                                    if (i15 == 1) {
                                                        mVarE = mVar2;
                                                    } else {
                                                        w0.e eVar2 = eVar == null ? new w0.e(new i1.m[16]) : eVar;
                                                        if (mVarE != null) {
                                                            eVar2.b(mVarE);
                                                            mVarE = null;
                                                        }
                                                        eVar2.b(mVar2);
                                                        eVar = eVar2;
                                                    }
                                                }
                                                mVar2 = mVar2.f25559f;
                                                mVarE = mVarE;
                                            }
                                            if (i15 == 1) {
                                            }
                                            c11 = c13;
                                            j8 = j;
                                            jVar3 = mVarE;
                                        }
                                        mVarE = i2.k.e(eVar);
                                        c11 = c13;
                                        j8 = j;
                                        jVar3 = mVarE;
                                    }
                                    mVarE = i2.k.e(eVar);
                                    c11 = c13;
                                    j8 = j;
                                    jVar3 = mVarE;
                                }
                            }
                            mVar = mVar.f25558e;
                            c11 = c11;
                            j8 = j8;
                        }
                    }
                    char c14 = c11;
                    long j9 = j8;
                    e0VarS = e0VarS.v();
                    mVar = (e0VarS == null || (a0Var = e0VarS.G) == null) ? null : (w1) a0Var.f19259f;
                    c12 = c9;
                    c11 = c14;
                    j8 = j9;
                }
                c10 = 0;
                jVar2 = jVar2;
            }
            long jU = jVar2 != null ? jVar2.U(jFloatToRawIntBits, jFloatToRawIntBits2, i14) : 0L;
            iArr[c10] = pk.a.s(Float.intBitsToFloat((int) (jU >> c9))) * (-1);
            iArr[1] = pk.a.s(Float.intBitsToFloat((int) (jU & j))) * (-1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11, types: [i1.m] */
    /* JADX WARN: Type inference failed for: r11v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8, types: [i1.m] */
    /* JADX WARN: Type inference failed for: r11v9, types: [i2.z1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3, types: [w0.e] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6, types: [w0.e] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    @Override // e4.q
    public final void e(View view, int i4, int i10, int i11, int i12, int i13) {
        b2.j jVar;
        b2.j jVar2;
        com.google.android.gms.internal.consent_sdk.a0 a0Var;
        if (this.f24479b.isNestedScrollingEnabled()) {
            float f10 = -1;
            long jFloatToRawIntBits = (Float.floatToRawIntBits(i4 * f10) << 32) | (Float.floatToRawIntBits(i10 * f10) & 4294967295L);
            long jFloatToRawIntBits2 = (Float.floatToRawIntBits(i11 * f10) << 32) | (Float.floatToRawIntBits(i12 * f10) & 4294967295L);
            int i14 = i13 == 0 ? 1 : 2;
            b2.j jVar3 = this.f24478a.f1641a;
            if (jVar3 == null || !jVar3.f25565n) {
                jVar = null;
            } else {
                if (!jVar3.f25554a.f25565n) {
                    f2.a.b("visitAncestors called on an unattached node");
                }
                i1.m mVar = jVar3.f25554a.f25558e;
                e0 e0VarS = i2.k.s(jVar3);
                loop0: while (true) {
                    if (e0VarS == null) {
                        jVar2 = null;
                        break;
                    }
                    if ((((i1.m) e0VarS.G.g).f25557d & 262144) != 0) {
                        while (mVar != null) {
                            if ((mVar.f25556c & 262144) != 0) {
                                i2.j jVarE = mVar;
                                ?? eVar = 0;
                                while (jVarE != 0) {
                                    if (jVarE instanceof z1) {
                                        ?? r11 = (z1) jVarE;
                                        if (nk.k.a(jVar3.f1658r, r11.e()) && b2.j.class == r11.getClass()) {
                                            jVar2 = r11;
                                            break loop0;
                                        }
                                    } else if ((jVarE.f25556c & 262144) != 0 && (jVarE instanceof i2.j)) {
                                        i1.m mVar2 = jVarE.f25691p;
                                        int i15 = 0;
                                        jVarE = jVarE;
                                        eVar = eVar;
                                        while (mVar2 != null) {
                                            if ((mVar2.f25556c & 262144) != 0) {
                                                i15++;
                                                eVar = eVar;
                                                if (i15 == 1) {
                                                    jVarE = mVar2;
                                                } else {
                                                    if (eVar == 0) {
                                                        eVar = new w0.e(new i1.m[16]);
                                                    }
                                                    if (jVarE != 0) {
                                                        eVar.b(jVarE);
                                                        jVarE = 0;
                                                    }
                                                    eVar.b(mVar2);
                                                }
                                            }
                                            mVar2 = mVar2.f25559f;
                                            jVarE = jVarE;
                                            eVar = eVar;
                                        }
                                        if (i15 == 1) {
                                        }
                                    }
                                    jVarE = i2.k.e(eVar);
                                }
                            }
                            mVar = mVar.f25558e;
                        }
                    }
                    e0VarS = e0VarS.v();
                    mVar = (e0VarS == null || (a0Var = e0VarS.G) == null) ? null : (w1) a0Var.f19259f;
                }
                jVar = jVar2;
            }
            if (jVar != null) {
                jVar.U(jFloatToRawIntBits, jFloatToRawIntBits2, i14);
            }
        }
    }

    @Override // e4.q
    public final boolean f(View view, View view2, int i4, int i10) {
        return ((i4 & 2) == 0 && (i4 & 1) == 0) ? false : true;
    }

    @Override // e4.q
    public final void g(View view, View view2, int i4, int i10) {
        z0 z0Var = this.f24499x;
        if (i10 == 1) {
            z0Var.f1564b = i4;
        } else {
            z0Var.f1563a = i4;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        int[] iArr = this.f24496u;
        getLocationInWindow(iArr);
        int i4 = iArr[0];
        region.op(i4, iArr[1], getWidth() + i4, getHeight() + iArr[1], Region.Op.DIFFERENCE);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    public final d3.c getDensity() {
        return this.j;
    }

    public final View getInteropView() {
        return this.f24479b;
    }

    public final e0 getLayoutNode() {
        return this.f24501z;
    }

    @Override // android.view.View
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.f24479b.getLayoutParams();
        return layoutParams == null ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    public final a0 getLifecycleOwner() {
        return this.f24487l;
    }

    public final i1.n getModifier() {
        return this.f24484h;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        z0 z0Var = this.f24499x;
        return z0Var.f1564b | z0Var.f1563a;
    }

    public final mk.c getOnDensityChanged$ui() {
        return this.f24486k;
    }

    public final mk.c getOnModifierChanged$ui() {
        return this.f24485i;
    }

    public final mk.c getOnRequestDisallowInterceptTouchEvent$ui() {
        return this.f24495t;
    }

    public final mk.a getRelease() {
        return this.g;
    }

    public final mk.a getReset() {
        return this.f24483f;
    }

    public final a6.f getSavedStateRegistryOwner() {
        return this.f24488m;
    }

    public final mk.a getUpdate() {
        return this.f24481d;
    }

    public final View getView() {
        return this.f24479b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v16, types: [i2.z1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8, types: [i1.m] */
    @Override // e4.q
    public final void h(View view, int i4, int i10, int[] iArr, int i11) {
        char c9;
        long j;
        com.google.android.gms.internal.consent_sdk.a0 a0Var;
        char c10;
        i1.m mVarE;
        long j8;
        if (this.f24479b.isNestedScrollingEnabled()) {
            char c11 = 65535;
            float f10 = -1;
            char c12 = ' ';
            long j9 = 4294967295L;
            long jFloatToRawIntBits = (Float.floatToRawIntBits(i10 * f10) & 4294967295L) | (Float.floatToRawIntBits(i4 * f10) << 32);
            int i12 = i11 == 0 ? 1 : 2;
            b2.j jVar = this.f24478a.f1641a;
            b2.j jVar2 = null;
            if (jVar == null || !jVar.f25565n) {
                c9 = ' ';
                j = 4294967295L;
            } else {
                if (!jVar.f25554a.f25565n) {
                    f2.a.b("visitAncestors called on an unattached node");
                }
                i1.m mVar = jVar.f25554a.f25558e;
                e0 e0VarS = i2.k.s(jVar);
                loop0: while (true) {
                    if (e0VarS == null) {
                        c9 = c12;
                        break;
                    }
                    if ((((i1.m) e0VarS.G.g).f25557d & 262144) != 0) {
                        while (mVar != null) {
                            if ((mVar.f25556c & 262144) != 0) {
                                w0.e eVar = null;
                                i2.j jVar3 = mVar;
                                while (jVar3 != 0) {
                                    c9 = c12;
                                    if (jVar3 instanceof z1) {
                                        ?? r14 = (z1) jVar3;
                                        c10 = c11;
                                        if (nk.k.a(jVar.f1658r, r14.e()) && b2.j.class == r14.getClass()) {
                                            jVar2 = r14;
                                            break loop0;
                                        }
                                    } else {
                                        c10 = c11;
                                        if ((jVar3.f25556c & 262144) != 0 && (jVar3 instanceof i2.j)) {
                                            i1.m mVar2 = jVar3.f25691p;
                                            int i13 = 0;
                                            mVarE = jVar3;
                                            while (mVar2 != null) {
                                                long j10 = j9;
                                                if ((mVar2.f25556c & 262144) != 0) {
                                                    i13++;
                                                    if (i13 == 1) {
                                                        mVarE = mVar2;
                                                    } else {
                                                        w0.e eVar2 = eVar == null ? new w0.e(new i1.m[16]) : eVar;
                                                        if (mVarE != null) {
                                                            eVar2.b(mVarE);
                                                            mVarE = null;
                                                        }
                                                        eVar2.b(mVar2);
                                                        eVar = eVar2;
                                                    }
                                                }
                                                mVar2 = mVar2.f25559f;
                                                j9 = j10;
                                                mVarE = mVarE;
                                            }
                                            j8 = j9;
                                            if (i13 == 1) {
                                            }
                                            c12 = c9;
                                            c11 = c10;
                                            j9 = j8;
                                            jVar3 = mVarE;
                                        }
                                        mVarE = i2.k.e(eVar);
                                        c12 = c9;
                                        c11 = c10;
                                        j9 = j8;
                                        jVar3 = mVarE;
                                    }
                                    j8 = j9;
                                    mVarE = i2.k.e(eVar);
                                    c12 = c9;
                                    c11 = c10;
                                    j9 = j8;
                                    jVar3 = mVarE;
                                }
                            }
                            mVar = mVar.f25558e;
                            c12 = c12;
                            c11 = c11;
                            j9 = j9;
                        }
                    }
                    char c13 = c12;
                    char c14 = c11;
                    long j11 = j9;
                    e0VarS = e0VarS.v();
                    mVar = (e0VarS == null || (a0Var = e0VarS.G) == null) ? null : (w1) a0Var.f19259f;
                    c12 = c13;
                    c11 = c14;
                    j9 = j11;
                }
                j = j9;
                jVar2 = jVar2;
            }
            long jY = jVar2 != null ? jVar2.y(i12, jFloatToRawIntBits) : 0L;
            iArr[0] = pk.a.s(Float.intBitsToFloat((int) (jY >> c9))) * (-1);
            iArr[1] = pk.a.s(Float.intBitsToFloat((int) (jY & j))) * (-1);
        }
    }

    @Override // i2.n1
    public final boolean i() {
        return isAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        if (!this.f24500y) {
            this.f24501z.C();
            return null;
        }
        this.f24479b.postOnAnimation(new a(0, this.f24494s));
        return null;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f24479b.isNestedScrollingEnabled();
    }

    @Override // e4.s
    public final c2 j(View view, c2 c2Var) {
        this.f24491p = new c2(c2Var);
        return n(c2Var);
    }

    public final c2 n(c2 c2Var) {
        e4.z1 z1Var = c2Var.f22315a;
        v3.b bVarG = z1Var.g(-1);
        v3.b bVar = v3.b.f35792e;
        if (!bVarG.equals(bVar) || !z1Var.h(-9).equals(bVar) || z1Var.f() != null) {
            i2.q qVar = (i2.q) this.f24501z.G.f19257d;
            if (qVar.R.f25565n) {
                long jD = ii.a.D(qVar.E(0L));
                int i4 = (int) (jD >> 32);
                if (i4 < 0) {
                    i4 = 0;
                }
                int i10 = (int) (jD & 4294967295L);
                if (i10 < 0) {
                    i10 = 0;
                }
                long jM = n0.f(qVar).m();
                int i11 = (int) (jM >> 32);
                int i12 = (int) (jM & 4294967295L);
                long j = qVar.f24410c;
                long jD2 = ii.a.D(qVar.E((Float.floatToRawIntBits((int) (j >> 32)) << 32) | (Float.floatToRawIntBits((int) (j & 4294967295L)) & 4294967295L)));
                int i13 = i11 - ((int) (jD2 >> 32));
                if (i13 < 0) {
                    i13 = 0;
                }
                int i14 = i12 - ((int) (4294967295L & jD2));
                int i15 = i14 >= 0 ? i14 : 0;
                if (i4 != 0 || i10 != 0 || i13 != 0 || i15 != 0) {
                    return c2Var.f22315a.n(i4, i10, i13, i15);
                }
            }
        }
        return c2Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f24493r.invoke();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        if (!this.f24500y) {
            this.f24501z.C();
        } else {
            this.f24479b.postOnAnimation(new a(0, this.f24494s));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onDetachedFromWindow() {
        /*
            r22 = this;
            r1 = r22
            super.onDetachedFromWindow()
            i2.o1 r0 = r1.getSnapshotObserver()
            g1.u r0 = r0.f25732a
            java.lang.Object r2 = r0.g
            monitor-enter(r2)
            w0.e r0 = r0.f24291f     // Catch: java.lang.Throwable -> L96
            int r3 = r0.f36399c     // Catch: java.lang.Throwable -> L96
            r5 = 0
            r6 = 0
        L14:
            if (r5 >= r3) goto L9c
            java.lang.Object[] r7 = r0.f36397a     // Catch: java.lang.Throwable -> L96
            r7 = r7[r5]     // Catch: java.lang.Throwable -> L96
            g1.t r7 = (g1.t) r7     // Catch: java.lang.Throwable -> L96
            x.e0 r8 = r7.f24280f     // Catch: java.lang.Throwable -> L96
            java.lang.Object r8 = r8.k(r1)     // Catch: java.lang.Throwable -> L96
            x.z r8 = (x.z) r8     // Catch: java.lang.Throwable -> L96
            if (r8 != 0) goto L29
        L26:
            r16 = r5
            goto L80
        L29:
            java.lang.Object[] r9 = r8.f36966b     // Catch: java.lang.Throwable -> L96
            int[] r10 = r8.f36967c     // Catch: java.lang.Throwable -> L96
            long[] r8 = r8.f36965a     // Catch: java.lang.Throwable -> L96
            int r11 = r8.length     // Catch: java.lang.Throwable -> L96
            int r11 = r11 + (-2)
            if (r11 < 0) goto L26
            r12 = 0
        L35:
            r13 = r8[r12]     // Catch: java.lang.Throwable -> L96
            r16 = r5
            long r4 = ~r13     // Catch: java.lang.Throwable -> L96
            r17 = 7
            long r4 = r4 << r17
            long r4 = r4 & r13
            r17 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r4 = r4 & r17
            int r4 = (r4 > r17 ? 1 : (r4 == r17 ? 0 : -1))
            if (r4 == 0) goto L79
            int r4 = r12 - r11
            int r4 = ~r4     // Catch: java.lang.Throwable -> L96
            int r4 = r4 >>> 31
            r5 = 8
            int r4 = 8 - r4
            r15 = 0
        L54:
            if (r15 >= r4) goto L77
            r18 = 255(0xff, double:1.26E-321)
            long r18 = r13 & r18
            r20 = 128(0x80, double:6.3E-322)
            int r18 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
            if (r18 >= 0) goto L6e
            int r18 = r12 << 3
            int r18 = r18 + r15
            r19 = r5
            r5 = r9[r18]     // Catch: java.lang.Throwable -> L96
            r18 = r10[r18]     // Catch: java.lang.Throwable -> L96
            r7.c(r1, r5)     // Catch: java.lang.Throwable -> L96
            goto L70
        L6e:
            r19 = r5
        L70:
            long r13 = r13 >> r19
            int r15 = r15 + 1
            r5 = r19
            goto L54
        L77:
            if (r4 != r5) goto L80
        L79:
            if (r12 == r11) goto L80
            int r12 = r12 + 1
            r5 = r16
            goto L35
        L80:
            x.e0 r4 = r7.f24280f     // Catch: java.lang.Throwable -> L96
            boolean r4 = r4.j()     // Catch: java.lang.Throwable -> L96
            if (r4 != 0) goto L8b
            int r6 = r6 + 1
            goto L98
        L8b:
            if (r6 <= 0) goto L98
            java.lang.Object[] r4 = r0.f36397a     // Catch: java.lang.Throwable -> L96
            int r5 = r16 - r6
            r7 = r4[r16]     // Catch: java.lang.Throwable -> L96
            r4[r5] = r7     // Catch: java.lang.Throwable -> L96
            goto L98
        L96:
            r0 = move-exception
            goto La8
        L98:
            int r5 = r16 + 1
            goto L14
        L9c:
            java.lang.Object[] r4 = r0.f36397a     // Catch: java.lang.Throwable -> L96
            int r5 = r3 - r6
            r6 = 0
            zj.m.U(r5, r3, r6, r4)     // Catch: java.lang.Throwable -> L96
            r0.f36399c = r5     // Catch: java.lang.Throwable -> L96
            monitor-exit(r2)
            return
        La8:
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g3.j.onDetachedFromWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i4, int i10, int i11, int i12) {
        this.f24479b.layout(0, 0, i11 - i4, i12 - i10);
    }

    @Override // android.view.View
    public final void onMeasure(int i4, int i10) {
        View view = this.f24479b;
        if (view.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(i4), View.MeasureSpec.getSize(i10));
            return;
        }
        if (view.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
            return;
        }
        view.measure(i4, i10);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
        this.f24497v = i4;
        this.f24498w = i10;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f10, float f11, boolean z3) {
        if (!this.f24479b.isNestedScrollingEnabled()) {
            return false;
        }
        xk.x.v(this.f24478a.c(), null, null, new g(z3, this, pd.b.a(f10 * (-1.0f), f11 * (-1.0f)), null), 3);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        if (!this.f24479b.isNestedScrollingEnabled()) {
            return false;
        }
        xk.x.v(this.f24478a.c(), null, null, new j0(this, pd.b.a(f10 * (-1.0f), f11 * (-1.0f)), null, 1), 3);
        return false;
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i4) {
        super.onWindowVisibilityChanged(i4);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z3) {
        mk.c cVar = this.f24492q;
        if (cVar == null) {
            return true;
        }
        cVar.invoke(rect != null ? z.v(rect) : null);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z3) {
        mk.c cVar = this.f24495t;
        if (cVar != null) {
            cVar.invoke(Boolean.valueOf(z3));
        }
        super.requestDisallowInterceptTouchEvent(z3);
    }

    public final void setDensity(d3.c cVar) {
        if (cVar != this.j) {
            this.j = cVar;
            mk.c cVar2 = this.f24486k;
            if (cVar2 != null) {
                cVar2.invoke(cVar);
            }
        }
    }

    public final void setLifecycleOwner(a0 a0Var) {
        if (a0Var != this.f24487l) {
            this.f24487l = a0Var;
            y0.h(this, a0Var);
        }
    }

    public final void setModifier(i1.n nVar) {
        if (nVar != this.f24484h) {
            this.f24484h = nVar;
            mk.c cVar = this.f24485i;
            if (cVar != null) {
                cVar.invoke(nVar);
            }
        }
    }

    public final void setOnDensityChanged$ui(mk.c cVar) {
        this.f24486k = cVar;
    }

    public final void setOnModifierChanged$ui(mk.c cVar) {
        this.f24485i = cVar;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui(mk.c cVar) {
        this.f24495t = cVar;
    }

    public final void setRelease(mk.a aVar) {
        this.g = aVar;
    }

    public final void setReset(mk.a aVar) {
        this.f24483f = aVar;
    }

    public final void setSavedStateRegistryOwner(a6.f fVar) {
        if (fVar != this.f24488m) {
            this.f24488m = fVar;
            d5.u(this, fVar);
        }
    }

    public final void setUpdate(mk.a aVar) {
        this.f24481d = aVar;
        this.f24482e = true;
        this.f24493r.invoke();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }
}
