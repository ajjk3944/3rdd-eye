package k1;

import ac.m;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import androidx.lifecycle.a0;
import c0.h0;
import g2.e0;
import ig.l;
import j2.r;
import j2.s1;
import java.util.ArrayList;
import java.util.List;
import km.y;
import p2.p;
import p2.s;
import x.j;
import x.k;
import x.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class e implements androidx.lifecycle.h, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final r f27792a;

    /* renamed from: b, reason: collision with root package name */
    public final h0 f27793b;

    /* renamed from: c, reason: collision with root package name */
    public h f27794c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f27795d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final long f27796e = 100;

    /* renamed from: f, reason: collision with root package name */
    public a f27797f = a.f27781a;
    public boolean g = true;

    /* renamed from: h, reason: collision with root package name */
    public final zk.h f27798h = com.bumptech.glide.e.f(1, 6, null);

    /* renamed from: i, reason: collision with root package name */
    public final Handler f27799i = new Handler(Looper.getMainLooper());
    public u j;

    /* renamed from: k, reason: collision with root package name */
    public long f27800k;

    /* renamed from: l, reason: collision with root package name */
    public final u f27801l;

    /* renamed from: m, reason: collision with root package name */
    public s1 f27802m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f27803n;

    /* renamed from: o, reason: collision with root package name */
    public final l f27804o;

    public e(r rVar, h0 h0Var) {
        this.f27792a = rVar;
        this.f27793b = h0Var;
        u uVar = k.f36911a;
        nk.k.c(uVar, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.j = uVar;
        this.f27801l = new u();
        p pVarA = rVar.getSemanticsOwner().a();
        nk.k.c(uVar, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.f27802m = new s1(pVarA, uVar);
        this.f27804o = new l(4, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x007d -> B:17:0x0047). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(ek.c r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof k1.c
            if (r0 == 0) goto L13
            r0 = r8
            k1.c r0 = (k1.c) r0
            int r1 = r0.f27790d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27790d = r1
            goto L18
        L13:
            k1.c r0 = new k1.c
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f27788b
            int r1 = r0.f27790d
            r2 = 2
            r3 = 1
            dk.a r4 = dk.a.f22275a
            if (r1 == 0) goto L3a
            if (r1 == r3) goto L34
            if (r1 != r2) goto L2c
            zk.c r1 = r0.f27787a
            ci.b.D(r8)
            goto L47
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L34:
            zk.c r1 = r0.f27787a
            ci.b.D(r8)
            goto L52
        L3a:
            ci.b.D(r8)
            zk.h r8 = r7.f27798h
            r8.getClass()
            zk.c r1 = new zk.c
            r1.<init>(r8)
        L47:
            r0.f27787a = r1
            r0.f27790d = r3
            java.lang.Object r8 = r1.b(r0)
            if (r8 != r4) goto L52
            goto L7f
        L52:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L80
            r1.c()
            boolean r8 = r7.h()
            if (r8 == 0) goto L66
            r7.i()
        L66:
            boolean r8 = r7.f27803n
            if (r8 != 0) goto L73
            r7.f27803n = r3
            android.os.Handler r8 = r7.f27799i
            ig.l r5 = r7.f27804o
            r8.post(r5)
        L73:
            r0.f27787a = r1
            r0.f27790d = r2
            long r5 = r7.f27796e
            java.lang.Object r8 = xk.x.i(r5, r0)
            if (r8 != r4) goto L47
        L7f:
            return r4
        L80:
            yj.u r8 = yj.u.f37649a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.e.a(ek.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(x.j r35) {
        /*
            Method dump skipped, instructions count: 433
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.e.b(x.j):void");
    }

    public final void d(p pVar, mk.e eVar) {
        pVar.getClass();
        List listJ = p.j(4, pVar);
        int size = listJ.size();
        int i4 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = listJ.get(i10);
            if (f().a(((p) obj).g)) {
                eVar.invoke(Integer.valueOf(i4), obj);
                i4++;
            }
        }
    }

    public final j f() {
        if (this.g) {
            this.g = false;
            this.j = s.b(this.f27792a.getSemanticsOwner(), d.f27791a);
            this.f27800k = System.currentTimeMillis();
        }
        return this.j;
    }

    public final boolean h() {
        return this.f27794c != null;
    }

    public final void i() {
        h hVar = this.f27794c;
        if (hVar != null && Build.VERSION.SDK_INT >= 29) {
            ArrayList arrayList = this.f27795d;
            if (arrayList.isEmpty()) {
                return;
            }
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                f fVar = (f) arrayList.get(i4);
                int iOrdinal = fVar.f27807c.ordinal();
                if (iOrdinal == 0) {
                    y yVar = fVar.f27808d;
                    if (yVar != null) {
                        ((l2.a) hVar).d((ViewStructure) yVar.f28522b);
                    }
                } else {
                    if (iOrdinal != 1) {
                        throw new m();
                    }
                    l2.a aVar = (l2.a) hVar;
                    AutofillId autofillIdB = aVar.b(fVar.f27805a);
                    if (autofillIdB != null) {
                        aVar.e(autofillIdB);
                    }
                }
            }
            ((l2.a) hVar).a();
            arrayList.clear();
        }
    }

    public final void j(p pVar, s1 s1Var) {
        d(pVar, new e0(3, s1Var, this));
        List listJ = p.j(4, pVar);
        int size = listJ.size();
        for (int i4 = 0; i4 < size; i4++) {
            p pVar2 = (p) listJ.get(i4);
            j jVarF = f();
            int i10 = pVar2.g;
            if (jVarF.a(i10)) {
                u uVar = this.f27801l;
                if (uVar.a(i10)) {
                    Object objB = uVar.b(i10);
                    if (objB == null) {
                        throw d.h.o("node not present in pruned tree before this change");
                    }
                    j(pVar2, (s1) objB);
                } else {
                    continue;
                }
            }
        }
    }

    public final void k(int i4, String str) {
        h hVar;
        if (Build.VERSION.SDK_INT >= 29 && (hVar = this.f27794c) != null) {
            l2.a aVar = (l2.a) hVar;
            AutofillId autofillIdB = aVar.b(i4);
            if (autofillIdB == null) {
                throw d.h.o("Invalid content capture ID");
            }
            aVar.f(autofillIdB, str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(int r14, p2.p r15) {
        /*
            Method dump skipped, instructions count: 435
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.e.l(int, p2.p):void");
    }

    public final void n(p pVar) {
        if (h()) {
            this.f27795d.add(new f(pVar.g, this.f27800k, g.f27810b, null));
            List listJ = p.j(4, pVar);
            int size = listJ.size();
            for (int i4 = 0; i4 < size; i4++) {
                n((p) listJ.get(i4));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o() {
        /*
            r17 = this;
            r0 = r17
            x.u r1 = r0.f27801l
            r1.c()
            x.j r2 = r0.f()
            int[] r3 = r2.f36905b
            java.lang.Object[] r4 = r2.f36906c
            long[] r2 = r2.f36904a
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
            p2.q r13 = (p2.q) r13
            j2.s1 r15 = new j2.s1
            p2.p r13 = r13.f31107a
            x.j r6 = r0.f()
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
            j2.s1 r1 = new j2.s1
            j2.r r2 = r0.f27792a
            p2.r r2 = r2.getSemanticsOwner()
            p2.p r2 = r2.a()
            x.j r3 = r0.f()
            r1.<init>(r2, r3)
            r0.f27802m = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.e.o():void");
    }

    @Override // androidx.lifecycle.h
    public final void onStart(a0 a0Var) {
        this.f27794c = (h) this.f27793b.invoke();
        l(-1, this.f27792a.getSemanticsOwner().a());
        i();
    }

    @Override // androidx.lifecycle.h
    public final void onStop(a0 a0Var) {
        n(this.f27792a.getSemanticsOwner().a());
        i();
        this.f27794c = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f27799i.removeCallbacks(this.f27804o);
        this.f27794c = null;
    }

    @Override // androidx.lifecycle.h
    public final /* synthetic */ void c(a0 a0Var) {
    }

    @Override // androidx.lifecycle.h
    public final void e(a0 a0Var) {
    }

    @Override // androidx.lifecycle.h
    public final /* synthetic */ void m(a0 a0Var) {
    }

    @Override // androidx.lifecycle.h
    public final void onDestroy(a0 a0Var) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
