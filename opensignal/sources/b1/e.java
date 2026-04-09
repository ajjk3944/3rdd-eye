package b1;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.f0;
import androidx.lifecycle.v;
import br.l;
import com.google.android.gms.internal.measurement.y3;
import e2.n;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import u.j;
import u.k;
import u.t;
import y1.q1;

/* loaded from: classes.dex */
public final class e implements DefaultLifecycleObserver, View.OnAttachStateChangeListener {
    public t F;
    public long G;
    public final t H;
    public q1 I;
    public boolean J;
    public final f0 K;

    /* renamed from: a, reason: collision with root package name */
    public final AndroidComposeView f2369a;

    /* renamed from: d, reason: collision with root package name */
    public final xp.c f2370d;

    /* renamed from: g, reason: collision with root package name */
    public a2.d f2371g;

    /* renamed from: r, reason: collision with root package name */
    public final ArrayList f2372r = new ArrayList();

    /* renamed from: x, reason: collision with root package name */
    public final long f2373x = 100;

    /* renamed from: y, reason: collision with root package name */
    public a f2374y = a.SHOW_ORIGINAL;
    public boolean B = true;
    public final yt.c D = a.a.b(1, 6, null);
    public final Handler E = new Handler(Looper.getMainLooper());

    public e(AndroidComposeView androidComposeView, xp.c cVar) {
        this.f2369a = androidComposeView;
        this.f2370d = cVar;
        t tVar = k.f23086a;
        l.c(tVar, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.F = tVar;
        this.H = new t();
        e2.k kVarA = androidComposeView.getSemanticsOwner().a();
        l.c(tVar, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.I = new q1(kVarA, tVar);
        this.K = new f0(1, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x007d -> B:17:0x0047). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(rq.c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof b1.c
            if (r0 == 0) goto L13
            r0 = r8
            b1.c r0 = (b1.c) r0
            int r1 = r0.B
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.B = r1
            goto L18
        L13:
            b1.c r0 = new b1.c
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f2364x
            qq.a r1 = qq.a.COROUTINE_SUSPENDED
            int r2 = r0.B
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            yt.b r2 = r0.f2363r
            lf.t1.G(r8)
            goto L47
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L34:
            yt.b r2 = r0.f2363r
            lf.t1.G(r8)
            goto L52
        L3a:
            lf.t1.G(r8)
            yt.c r8 = r7.D
            r8.getClass()
            yt.b r2 = new yt.b
            r2.<init>(r8)
        L47:
            r0.f2363r = r2
            r0.B = r4
            java.lang.Object r8 = r2.b(r0)
            if (r8 != r1) goto L52
            goto L7f
        L52:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L80
            r2.c()
            boolean r8 = r7.e()
            if (r8 == 0) goto L66
            r7.g()
        L66:
            boolean r8 = r7.J
            if (r8 != 0) goto L73
            r7.J = r4
            android.os.Handler r8 = r7.E
            androidx.lifecycle.f0 r5 = r7.K
            r8.post(r5)
        L73:
            r0.f2363r = r2
            r0.B = r3
            long r5 = r7.f2373x
            java.lang.Object r8 = wt.w.h(r5, r0)
            if (r8 != r1) goto L47
        L7f:
            return r1
        L80:
            lq.b0 r8 = lq.b0.f15562a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: b1.e.a(rq.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(u.j r35) {
        /*
            Method dump skipped, instructions count: 433
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b1.e.c(u.j):void");
    }

    public final j d() {
        if (this.B) {
            this.B = false;
            this.F = n.b(this.f2369a.getSemanticsOwner());
            this.G = System.currentTimeMillis();
        }
        return this.F;
    }

    public final boolean e() {
        return this.f2371g != null;
    }

    public final void g() {
        a2.d dVar = this.f2371g;
        if (dVar == null) {
            return;
        }
        Object obj = dVar.f30b;
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        ArrayList arrayList = this.f2372r;
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            f fVar = (f) arrayList.get(i10);
            int i11 = b.f2362a[fVar.f2377c.ordinal()];
            if (i11 == 1) {
                a2.g gVar = fVar.f2378d;
                if (gVar != null) {
                    ViewStructure viewStructure = (ViewStructure) gVar.f31a;
                    if (Build.VERSION.SDK_INT >= 29) {
                        a2.c.e(a2.b.k(obj), viewStructure);
                    }
                }
            } else {
                if (i11 != 2) {
                    throw new bf.n();
                }
                AutofillId autofillIdA = dVar.a(fVar.f2375a);
                if (autofillIdA != null && Build.VERSION.SDK_INT >= 29) {
                    a2.c.f(a2.b.k(obj), autofillIdA);
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            ContentCaptureSession contentCaptureSessionK = a2.b.k(obj);
            a2.a aVarT = y3.t(dVar.f29a);
            Objects.requireNonNull(aVarT);
            a2.c.h(contentCaptureSessionK, a1.a.d(aVarT.f28a), new long[]{Long.MIN_VALUE});
        }
        arrayList.clear();
    }

    public final void i(e2.k kVar, q1 q1Var) {
        d dVar = new d(q1Var, 0, this);
        kVar.getClass();
        List listJ = e2.k.j(4, kVar);
        int size = listJ.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = listJ.get(i11);
            if (d().a(((e2.k) obj).f7720g)) {
                dVar.w(Integer.valueOf(i10), obj);
                i10++;
            }
        }
        List listJ2 = e2.k.j(4, kVar);
        int size2 = listJ2.size();
        for (int i12 = 0; i12 < size2; i12++) {
            e2.k kVar2 = (e2.k) listJ2.get(i12);
            j jVarD = d();
            int i13 = kVar2.f7720g;
            if (jVarD.a(i13)) {
                t tVar = this.H;
                if (tVar.a(i13)) {
                    Object objB = tVar.b(i13);
                    if (objB == null) {
                        throw c7.a.h("node not present in pruned tree before this change");
                    }
                    i(kVar2, (q1) objB);
                } else {
                    continue;
                }
            }
        }
    }

    public final void j(int i10, String str) {
        a2.d dVar;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 29 && (dVar = this.f2371g) != null) {
            AutofillId autofillIdA = dVar.a(i10);
            if (autofillIdA == null) {
                throw c7.a.h("Invalid content capture ID");
            }
            if (i11 >= 29) {
                a2.c.g(a2.b.k(dVar.f30b), autofillIdA, str);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(int r19, e2.k r20) {
        /*
            Method dump skipped, instructions count: 489
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b1.e.k(int, e2.k):void");
    }

    public final void l(e2.k kVar) {
        if (e()) {
            this.f2372r.add(new f(kVar.f7720g, this.G, g.VIEW_DISAPPEAR, null));
            List listJ = e2.k.j(4, kVar);
            int size = listJ.size();
            for (int i10 = 0; i10 < size; i10++) {
                l((e2.k) listJ.get(i10));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m() {
        /*
            r17 = this;
            r0 = r17
            u.t r1 = r0.H
            r1.c()
            u.j r2 = r0.d()
            int[] r3 = r2.f23079b
            java.lang.Object[] r4 = r2.f23080c
            long[] r2 = r2.f23078a
            int r5 = r2.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L5e
            r7 = 0
        L17:
            r8 = r2[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L59
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = 0
        L31:
            if (r12 >= r10) goto L57
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L53
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r3[r13]
            r13 = r4[r13]
            e2.l r13 = (e2.l) r13
            y1.q1 r15 = new y1.q1
            e2.k r13 = r13.f7721a
            u.j r6 = r0.d()
            r15.<init>(r13, r6)
            r1.h(r14, r15)
        L53:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L31
        L57:
            if (r10 != r11) goto L5e
        L59:
            if (r7 == r5) goto L5e
            int r7 = r7 + 1
            goto L17
        L5e:
            y1.q1 r1 = new y1.q1
            androidx.compose.ui.platform.AndroidComposeView r2 = r0.f2369a
            e2.m r2 = r2.getSemanticsOwner()
            e2.k r2 = r2.a()
            u.j r3 = r0.d()
            r1.<init>(r2, r3)
            r0.I = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b1.e.m():void");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(v vVar) {
        this.f2371g = (a2.d) this.f2370d.c();
        k(-1, this.f2369a.getSemanticsOwner().a());
        g();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(v vVar) {
        l(this.f2369a.getSemanticsOwner().a());
        g();
        this.f2371g = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.E.removeCallbacks(this.K);
        this.f2371g = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
