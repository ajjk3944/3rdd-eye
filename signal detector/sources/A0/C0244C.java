package a0;

import c5.C0410g;
import com.google.android.gms.internal.ads.C1611nx;
import com.google.android.gms.internal.ads.C1719px;
import com.google.android.gms.internal.ads.C1773qx;
import d5.AbstractC2282j;
import java.io.File;
import java.util.LinkedHashSet;
import java.util.List;
import z5.AbstractC3046w;
import z5.C3028d;
import z5.C3036l;
import z5.C3038n;
import z5.InterfaceC3044u;
import z5.O;
import z5.S;
import z5.Y;

/* renamed from: a0.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0244C implements InterfaceC0252f {

    /* renamed from: h, reason: collision with root package name */
    public static final LinkedHashSet f4552h = new LinkedHashSet();
    public static final Object i = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final C1773qx f4553a;

    /* renamed from: b, reason: collision with root package name */
    public final U0.j f4554b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4555c;

    /* renamed from: d, reason: collision with root package name */
    public final C0410g f4556d;

    /* renamed from: e, reason: collision with root package name */
    public final C5.o f4557e;

    /* renamed from: f, reason: collision with root package name */
    public List f4558f;

    /* renamed from: g, reason: collision with root package name */
    public final c1.g f4559g;

    public C0244C(C1773qx c1773qx, List list, S4.r rVar, InterfaceC3044u interfaceC3044u) {
        C1611nx c1611nx = C1719px.f16259a;
        this.f4553a = c1773qx;
        int i3 = 2;
        this.f4554b = new U0.j(i3, new q(this, null));
        this.f4555c = ".tmp";
        this.f4556d = new C0410g(new C0.y(i3, this));
        this.f4557e = new C5.o(C0246E.f4560a);
        this.f4558f = AbstractC2282j.j0(list);
        this.f4559g = new c1.g(interfaceC3044u, new H5.g(1, this), new C0260n(this, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ab, code lost:
    
        if (r11 != r8) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r4v10, types: [j5.g, p5.p] */
    /* JADX WARN: Type inference failed for: r4v3, types: [j5.g, p5.p] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(a0.C0244C r11, a0.C0257k r12, j5.b r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.C0244C.a(a0.C, a0.k, j5.b):java.lang.Object");
    }

    public final File b() {
        return (File) this.f4556d.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(j5.b r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.C0244C.c(j5.b):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(j5.b r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof a0.v
            if (r0 == 0) goto L13
            r0 = r5
            a0.v r0 = (a0.v) r0
            int r1 = r0.f4625g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4625g = r1
            goto L18
        L13:
            a0.v r0 = new a0.v
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f4623e
            int r1 = r0.f4625g
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            a0.C r0 = r0.f4622d
            R2.a.H(r5)     // Catch: java.lang.Throwable -> L27
            goto L41
        L27:
            r5 = move-exception
            goto L46
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            R2.a.H(r5)
            r0.f4622d = r4     // Catch: java.lang.Throwable -> L44
            r0.f4625g = r2     // Catch: java.lang.Throwable -> L44
            java.lang.Object r5 = r4.c(r0)     // Catch: java.lang.Throwable -> L44
            i5.a r0 = i5.EnumC2380a.f20635a
            if (r5 != r0) goto L41
            return r0
        L41:
            c5.i r5 = c5.C0412i.f5929a
            return r5
        L44:
            r5 = move-exception
            r0 = r4
        L46:
            C5.o r0 = r0.f4557e
            a0.h r1 = new a0.h
            r1.<init>(r5)
            r0.J(r1)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.C0244C.d(j5.b):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(j5.b r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof a0.w
            if (r0 == 0) goto L13
            r0 = r5
            a0.w r0 = (a0.w) r0
            int r1 = r0.f4629g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4629g = r1
            goto L18
        L13:
            a0.w r0 = new a0.w
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f4627e
            int r1 = r0.f4629g
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            a0.C r0 = r0.f4626d
            R2.a.H(r5)     // Catch: java.lang.Throwable -> L27
            goto L4d
        L27:
            r5 = move-exception
            goto L43
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            R2.a.H(r5)
            r0.f4626d = r4     // Catch: java.lang.Throwable -> L41
            r0.f4629g = r2     // Catch: java.lang.Throwable -> L41
            java.lang.Object r5 = r4.c(r0)     // Catch: java.lang.Throwable -> L41
            i5.a r0 = i5.EnumC2380a.f20635a
            if (r5 != r0) goto L4d
            return r0
        L41:
            r5 = move-exception
            r0 = r4
        L43:
            C5.o r0 = r0.f4557e
            a0.h r1 = new a0.h
            r1.<init>(r5)
            r0.J(r1)
        L4d:
            c5.i r5 = c5.C0412i.f5929a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.C0244C.e(j5.b):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v13, types: [a0.C] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v2, types: [a0.x] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [a0.C] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(j5.b r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof a0.x
            if (r0 == 0) goto L13
            r0 = r5
            a0.x r0 = (a0.x) r0
            int r1 = r0.f4634h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4634h = r1
            goto L18
        L13:
            a0.x r0 = new a0.x
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f4632f
            int r1 = r0.f4634h
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            java.io.FileInputStream r1 = r0.f4631e
            a0.C r0 = r0.f4630d
            R2.a.H(r5)     // Catch: java.lang.Throwable -> L29
            goto L54
        L29:
            r5 = move-exception
            goto L5f
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            R2.a.H(r5)
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L65
            java.io.File r5 = r4.b()     // Catch: java.io.FileNotFoundException -> L65
            r1.<init>(r5)     // Catch: java.io.FileNotFoundException -> L65
            com.google.android.gms.internal.ads.nx r5 = com.google.android.gms.internal.ads.C1719px.f16259a     // Catch: java.lang.Throwable -> L5d
            r0.f4630d = r4     // Catch: java.lang.Throwable -> L5d
            r0.f4631e = r1     // Catch: java.lang.Throwable -> L5d
            r0.f4634h = r2     // Catch: java.lang.Throwable -> L5d
            com.google.android.gms.internal.ads.nx r5 = com.google.android.gms.internal.ads.C1611nx.C(r1)     // Catch: java.lang.Exception -> L4c java.lang.Throwable -> L5d
            goto L4e
        L4c:
            com.google.android.gms.internal.ads.nx r5 = com.google.android.gms.internal.ads.C1719px.f16259a     // Catch: java.lang.Throwable -> L5d
        L4e:
            i5.a r0 = i5.EnumC2380a.f20635a
            if (r5 != r0) goto L53
            return r0
        L53:
            r0 = r4
        L54:
            r2 = 0
            a.AbstractC0241a.a(r1, r2)     // Catch: java.io.FileNotFoundException -> L59
            return r5
        L59:
            r5 = move-exception
            goto L67
        L5b:
            r0 = r4
            goto L5f
        L5d:
            r5 = move-exception
            goto L5b
        L5f:
            throw r5     // Catch: java.lang.Throwable -> L60
        L60:
            r2 = move-exception
            a.AbstractC0241a.a(r1, r5)     // Catch: java.io.FileNotFoundException -> L59
            throw r2     // Catch: java.io.FileNotFoundException -> L59
        L65:
            r5 = move-exception
            r0 = r4
        L67:
            java.io.File r0 = r0.b()
            boolean r0 = r0.exists()
            if (r0 != 0) goto L76
            com.google.android.gms.internal.ads.nx r5 = com.google.android.gms.internal.ads.C1719px.f16259a
            com.google.android.gms.internal.ads.nx r5 = com.google.android.gms.internal.ads.C1719px.f16259a
            return r5
        L76:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.C0244C.f(j5.b):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(j5.b r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof a0.y
            if (r0 == 0) goto L13
            r0 = r7
            a0.y r0 = (a0.y) r0
            int r1 = r0.f4639h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4639h = r1
            goto L18
        L13:
            a0.y r0 = new a0.y
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f4637f
            int r1 = r0.f4639h
            r2 = 1
            i5.a r3 = i5.EnumC2380a.f20635a
            if (r1 == 0) goto L69
            if (r1 == r2) goto L65
            r2 = 2
            r4 = 3
            r5 = 0
            if (r1 == r2) goto L44
            if (r1 != r4) goto L3c
            java.lang.Object r1 = r0.f4636e
            a0.C r0 = r0.f4635d
            if (r0 != 0) goto L36
            R2.a.H(r7)     // Catch: java.io.IOException -> L34
            return r1
        L34:
            r7 = move-exception
            goto L5b
        L36:
            java.lang.ClassCastException r7 = new java.lang.ClassCastException
            r7.<init>()
            throw r7
        L3c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L44:
            java.lang.Object r1 = r0.f4636e
            if (r1 != 0) goto L5f
            a0.C r1 = r0.f4635d
            R2.a.H(r7)
            r0.f4635d = r5     // Catch: java.io.IOException -> L34
            r0.f4636e = r7     // Catch: java.io.IOException -> L34
            r0.f4639h = r4     // Catch: java.io.IOException -> L34
            java.lang.Object r0 = r1.j(r0, r7)     // Catch: java.io.IOException -> L34
            if (r0 != r3) goto L5a
            goto L76
        L5a:
            return r7
        L5b:
            com.bumptech.glide.e.b(r5, r7)
            throw r5
        L5f:
            java.lang.ClassCastException r7 = new java.lang.ClassCastException
            r7.<init>()
            throw r7
        L65:
            R2.a.H(r7)
            return r7
        L69:
            R2.a.H(r7)
            r0.f4635d = r6
            r0.f4639h = r2
            java.lang.Object r7 = r6.f(r0)
            if (r7 != r3) goto L77
        L76:
            return r3
        L77:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.C0244C.g(j5.b):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(h5.InterfaceC2375i r10, j5.b r11, p5.p r12) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r11 instanceof a0.z
            if (r0 == 0) goto L13
            r0 = r11
            a0.z r0 = (a0.z) r0
            int r1 = r0.i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.i = r1
            goto L18
        L13:
            a0.z r0 = new a0.z
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.f4643g
            int r1 = r0.i
            java.lang.String r2 = "Data in DataStore was mutated but DataStore is only compatible with Immutable types."
            r3 = 0
            r4 = 0
            r5 = 2
            r6 = 1
            i5.a r7 = i5.EnumC2380a.f20635a
            if (r1 == 0) goto L47
            if (r1 == r6) goto L3b
            if (r1 != r5) goto L33
            java.lang.Object r10 = r0.f4641e
            a0.C r12 = r0.f4640d
            R2.a.H(r11)
            goto La0
        L33:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3b:
            java.lang.Object r10 = r0.f4642f
            java.lang.Object r12 = r0.f4641e
            a0.a r12 = (a0.C0247a) r12
            a0.C r1 = r0.f4640d
            R2.a.H(r11)
            goto L7a
        L47:
            R2.a.H(r11)
            C5.o r11 = r9.f4557e
            java.lang.Object r11 = r11.I()
            a0.a r11 = (a0.C0247a) r11
            java.lang.Object r1 = r11.f4561a
            if (r1 == 0) goto L5b
            int r1 = r1.hashCode()
            goto L5c
        L5b:
            r1 = r3
        L5c:
            int r8 = r11.f4562b
            if (r1 != r8) goto Lb7
            java.lang.Object r1 = r11.f4561a
            a0.A r8 = new a0.A
            r8.<init>(r12, r1, r4)
            r0.f4640d = r9
            r0.f4641e = r11
            r0.f4642f = r1
            r0.i = r6
            java.lang.Object r10 = z5.AbstractC3046w.r(r10, r0, r8)
            if (r10 != r7) goto L76
            goto L9d
        L76:
            r12 = r11
            r11 = r10
            r10 = r1
            r1 = r9
        L7a:
            java.lang.Object r6 = r12.f4561a
            if (r6 == 0) goto L83
            int r6 = r6.hashCode()
            goto L84
        L83:
            r6 = r3
        L84:
            int r12 = r12.f4562b
            if (r6 != r12) goto Lb1
            boolean r12 = q5.i.a(r10, r11)
            if (r12 == 0) goto L8f
            return r10
        L8f:
            r0.f4640d = r1
            r0.f4641e = r11
            r0.f4642f = r4
            r0.i = r5
            java.lang.Object r10 = r1.j(r0, r11)
            if (r10 != r7) goto L9e
        L9d:
            return r7
        L9e:
            r10 = r11
            r12 = r1
        La0:
            C5.o r11 = r12.f4557e
            a0.a r12 = new a0.a
            if (r10 == 0) goto Laa
            int r3 = r10.hashCode()
        Laa:
            r12.<init>(r3, r10)
            r11.J(r12)
            return r10
        Lb1:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            r10.<init>(r2)
            throw r10
        Lb7:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            r10.<init>(r2)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.C0244C.h(h5.i, j5.b, p5.p):java.lang.Object");
    }

    public final Object i(p5.p pVar, j5.b bVar) throws Throwable {
        Object objY;
        C3036l c3036l = new C3036l(true);
        c3036l.B(null);
        this.f4559g.y(new C0257k(pVar, c3036l, (AbstractC0245D) this.f4557e.I(), bVar.getContext()));
        do {
            objY = c3036l.y();
            if (!(objY instanceof O)) {
                if (objY instanceof C3038n) {
                    throw ((C3038n) objY).f24546a;
                }
                return AbstractC3046w.p(objY);
            }
        } while (c3036l.K(objY) < 0);
        Y y3 = new Y(com.bumptech.glide.c.B(bVar), c3036l);
        y3.t();
        y3.v(new C3028d(1, c3036l.C(false, true, new S(1, y3))));
        return y3.s();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.io.File, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.lang.StringBuilder] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(j5.b r7, java.lang.Object r8) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.C0244C.j(j5.b, java.lang.Object):java.lang.Object");
    }
}
