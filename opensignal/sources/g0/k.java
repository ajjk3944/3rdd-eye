package g0;

import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.lifecycle.p0;
import com.google.android.gms.internal.measurement.e5;
import e2.p;
import e2.r;
import g1.s;
import h2.j0;
import java.util.HashMap;
import x1.m;
import x1.t1;
import x1.v;
import z0.l;

/* loaded from: classes.dex */
public final class k extends l implements v, m, t1 {
    public j A;

    /* renamed from: p, reason: collision with root package name */
    public String f9186p;

    /* renamed from: q, reason: collision with root package name */
    public j0 f9187q;

    /* renamed from: r, reason: collision with root package name */
    public k2.g f9188r;

    /* renamed from: s, reason: collision with root package name */
    public int f9189s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f9190t;

    /* renamed from: u, reason: collision with root package name */
    public int f9191u;

    /* renamed from: v, reason: collision with root package name */
    public int f9192v;

    /* renamed from: w, reason: collision with root package name */
    public s f9193w;

    /* renamed from: x, reason: collision with root package name */
    public HashMap f9194x;

    /* renamed from: y, reason: collision with root package name */
    public e f9195y;

    /* renamed from: z, reason: collision with root package name */
    public i f9196z;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0015 A[Catch: all -> 0x004a, TryCatch #0 {all -> 0x004a, blocks: (B:3:0x0005, B:5:0x0009, B:10:0x0011, B:13:0x0019, B:15:0x0028, B:16:0x002b, B:18:0x0036, B:20:0x0042, B:23:0x004d, B:24:0x0074, B:12:0x0015), top: B:29:0x0005 }] */
    @Override // x1.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final x1.l0 K(x1.m0 r9, v1.q r10, long r11) {
        /*
            r8 = this;
            java.lang.String r0 = "TextStringSimpleNode::measure"
            android.os.Trace.beginSection(r0)
            g0.j r0 = r8.A     // Catch: java.lang.Throwable -> L4a
            if (r0 == 0) goto L15
            boolean r1 = r0.f9184c     // Catch: java.lang.Throwable -> L4a
            if (r1 == 0) goto Le
            goto Lf
        Le:
            r0 = 0
        Lf:
            if (r0 == 0) goto L15
            g0.e r0 = r0.f9185d     // Catch: java.lang.Throwable -> L4a
            if (r0 != 0) goto L19
        L15:
            g0.e r0 = r8.c0()     // Catch: java.lang.Throwable -> L4a
        L19:
            r0.c(r9)     // Catch: java.lang.Throwable -> L4a
            t2.i r1 = r9.getLayoutDirection()     // Catch: java.lang.Throwable -> L4a
            boolean r11 = r0.a(r11, r1)     // Catch: java.lang.Throwable -> L4a
            h2.r r12 = r0.f9159n     // Catch: java.lang.Throwable -> L4a
            if (r12 == 0) goto L2b
            r12.d()     // Catch: java.lang.Throwable -> L4a
        L2b:
            h2.b r12 = r0.j     // Catch: java.lang.Throwable -> L4a
            br.l.b(r12)     // Catch: java.lang.Throwable -> L4a
            i2.h r12 = r12.f9781d     // Catch: java.lang.Throwable -> L4a
            long r0 = r0.f9157l     // Catch: java.lang.Throwable -> L4a
            if (r11 == 0) goto L74
            r11 = 2
            x1.f1 r2 = x1.k.q(r8, r11)     // Catch: java.lang.Throwable -> L4a
            r2.C0()     // Catch: java.lang.Throwable -> L4a
            java.util.HashMap r2 = r8.f9194x     // Catch: java.lang.Throwable -> L4a
            if (r2 != 0) goto L4d
            java.util.HashMap r2 = new java.util.HashMap     // Catch: java.lang.Throwable -> L4a
            r2.<init>(r11)     // Catch: java.lang.Throwable -> L4a
            r8.f9194x = r2     // Catch: java.lang.Throwable -> L4a
            goto L4d
        L4a:
            r0 = move-exception
            r9 = r0
            goto L9d
        L4d:
            v1.h r11 = v1.c.f23758a     // Catch: java.lang.Throwable -> L4a
            r3 = 0
            float r3 = r12.c(r3)     // Catch: java.lang.Throwable -> L4a
            int r3 = java.lang.Math.round(r3)     // Catch: java.lang.Throwable -> L4a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L4a
            r2.put(r11, r3)     // Catch: java.lang.Throwable -> L4a
            v1.h r11 = v1.c.f23759b     // Catch: java.lang.Throwable -> L4a
            int r3 = r12.f11174f     // Catch: java.lang.Throwable -> L4a
            int r3 = r3 + (-1)
            float r12 = r12.c(r3)     // Catch: java.lang.Throwable -> L4a
            int r12 = java.lang.Math.round(r12)     // Catch: java.lang.Throwable -> L4a
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch: java.lang.Throwable -> L4a
            r2.put(r11, r12)     // Catch: java.lang.Throwable -> L4a
        L74:
            r11 = 32
            long r11 = r0 >> r11
            int r3 = (int) r11     // Catch: java.lang.Throwable -> L4a
            r11 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r11 = r11 & r0
            int r4 = (int) r11     // Catch: java.lang.Throwable -> L4a
            long r11 = dr.a.n(r3, r3, r4, r4)     // Catch: java.lang.Throwable -> L4a
            v1.v r10 = r10.s(r11)     // Catch: java.lang.Throwable -> L4a
            java.util.HashMap r5 = r8.f9194x     // Catch: java.lang.Throwable -> L4a
            br.l.b(r5)     // Catch: java.lang.Throwable -> L4a
            c0.o r7 = new c0.o     // Catch: java.lang.Throwable -> L4a
            r11 = 3
            r7.<init>(r10, r11)     // Catch: java.lang.Throwable -> L4a
            r6 = 0
            r2 = r9
            x1.l0 r9 = r2.h0(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L4a
            android.os.Trace.endSection()
            return r9
        L9d:
            android.os.Trace.endSection()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.k.K(x1.m0, v1.q, long):x1.l0");
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [g0.i] */
    @Override // x1.t1
    public final void O(SemanticsConfiguration semanticsConfiguration) {
        i iVar = this.f9196z;
        i iVar2 = iVar;
        if (iVar == null) {
            final int i10 = 0;
            ?? r02 = new ar.k(this) { // from class: g0.i

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ k f9181d;

                {
                    this.f9181d = this;
                }

                /* JADX WARN: Removed duplicated region for block: B:27:0x00c7  */
                @Override // ar.k
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object a(java.lang.Object r30) {
                    /*
                        Method dump skipped, instructions count: 318
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: g0.i.a(java.lang.Object):java.lang.Object");
                }
            };
            this.f9196z = r02;
            iVar2 = r02;
        }
        h2.f fVar = new h2.f(this.f9186p);
        ir.v[] vVarArr = r.f7759a;
        semanticsConfiguration.d(p.f7754x, e5.H(fVar));
        j jVar = this.A;
        if (jVar != null) {
            boolean z10 = jVar.f9184c;
            e2.s sVar = p.f7756z;
            ir.v[] vVarArr2 = r.f7759a;
            ir.v vVar = vVarArr2[16];
            sVar.a(semanticsConfiguration, Boolean.valueOf(z10));
            h2.f fVar2 = new h2.f(jVar.f9183b);
            e2.s sVar2 = p.f7755y;
            ir.v vVar2 = vVarArr2[15];
            sVar2.a(semanticsConfiguration, fVar2);
        }
        final int i11 = 1;
        semanticsConfiguration.d(e2.g.j, new e2.a(null, new ar.k(this) { // from class: g0.i

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ k f9181d;

            {
                this.f9181d = this;
            }

            @Override // ar.k
            public final Object a(Object v10) {
                /*
                    Method dump skipped, instructions count: 318
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: g0.i.a(java.lang.Object):java.lang.Object");
            }
        }));
        final int i12 = 2;
        semanticsConfiguration.d(e2.g.k, new e2.a(null, new ar.k(this) { // from class: g0.i

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ k f9181d;

            {
                this.f9181d = this;
            }

            @Override // ar.k
            public final Object a(Object v10) {
                /*
                    Method dump skipped, instructions count: 318
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: g0.i.a(java.lang.Object):java.lang.Object");
            }
        }));
        semanticsConfiguration.d(e2.g.f7695l, new e2.a(null, new p0(6, this)));
        semanticsConfiguration.d(e2.g.f7686a, new e2.a(null, iVar2));
    }

    @Override // z0.l
    public final boolean R() {
        return false;
    }

    public final e c0() {
        if (this.f9195y == null) {
            this.f9195y = new e(this.f9186p, this.f9187q, this.f9188r, this.f9189s, this.f9190t, this.f9191u, this.f9192v);
        }
        e eVar = this.f9195y;
        br.l.b(eVar);
        return eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0016  */
    @Override // x1.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(x1.h0 r11) {
        /*
            r10 = this;
            boolean r0 = r10.f26506o
            if (r0 != 0) goto L6
            goto La2
        L6:
            g0.j r0 = r10.A
            if (r0 == 0) goto L16
            boolean r1 = r0.f9184c
            if (r1 == 0) goto Lf
            goto L10
        Lf:
            r0 = 0
        L10:
            if (r0 == 0) goto L16
            g0.e r0 = r0.f9185d
            if (r0 != 0) goto L1a
        L16:
            g0.e r0 = r10.c0()
        L1a:
            h2.b r1 = r0.j
            if (r1 == 0) goto La9
            i1.b r11 = r11.f24844b
            bm.d r11 = r11.f11141c
            g1.p r2 = r11.y()
            boolean r11 = r0.k
            if (r11 == 0) goto L43
            long r3 = r0.f9157l
            r0 = 32
            long r5 = r3 >> r0
            int r0 = (int) r5
            float r5 = (float) r0
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r6
            int r0 = (int) r3
            float r6 = (float) r0
            r2.g()
            r4 = 0
            r7 = 1
            r3 = 0
            r2.l(r3, r4, r5, r6, r7)
        L43:
            h2.j0 r0 = r10.f9187q     // Catch: java.lang.Throwable -> L4f
            h2.c0 r0 = r0.f9840a     // Catch: java.lang.Throwable -> L4f
            r2.l r3 = r0.f9797m     // Catch: java.lang.Throwable -> L4f
            if (r3 != 0) goto L4d
            r2.l r3 = r2.l.f21208b     // Catch: java.lang.Throwable -> L4f
        L4d:
            r6 = r3
            goto L51
        L4f:
            r0 = move-exception
            goto La3
        L51:
            g1.h0 r3 = r0.f9798n     // Catch: java.lang.Throwable -> L4f
            if (r3 != 0) goto L57
            g1.h0 r3 = g1.h0.f9234d     // Catch: java.lang.Throwable -> L4f
        L57:
            r5 = r3
            i1.c r3 = r0.f9799o     // Catch: java.lang.Throwable -> L4f
            if (r3 != 0) goto L5e
            i1.f r3 = i1.f.f11146b     // Catch: java.lang.Throwable -> L4f
        L5e:
            r7 = r3
            r2.o r0 = r0.f9787a     // Catch: java.lang.Throwable -> L4f
            g1.f0 r3 = r0.c()     // Catch: java.lang.Throwable -> L4f
            if (r3 == 0) goto L75
            h2.j0 r0 = r10.f9187q     // Catch: java.lang.Throwable -> L4f
            h2.c0 r0 = r0.f9840a     // Catch: java.lang.Throwable -> L4f
            r2.o r0 = r0.f9787a     // Catch: java.lang.Throwable -> L4f
            float r4 = r0.a()     // Catch: java.lang.Throwable -> L4f
            r1.f(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L4f
            goto L9d
        L75:
            g1.s r0 = r10.f9193w     // Catch: java.lang.Throwable -> L4f
            if (r0 == 0) goto L7e
            long r3 = r0.a()     // Catch: java.lang.Throwable -> L4f
            goto L80
        L7e:
            long r3 = g1.r.f9269g     // Catch: java.lang.Throwable -> L4f
        L80:
            r8 = 16
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r0 == 0) goto L87
            goto L9a
        L87:
            h2.j0 r0 = r10.f9187q     // Catch: java.lang.Throwable -> L4f
            long r3 = r0.b()     // Catch: java.lang.Throwable -> L4f
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r0 == 0) goto L98
            h2.j0 r0 = r10.f9187q     // Catch: java.lang.Throwable -> L4f
            long r3 = r0.b()     // Catch: java.lang.Throwable -> L4f
            goto L9a
        L98:
            long r3 = g1.r.f9264b     // Catch: java.lang.Throwable -> L4f
        L9a:
            r1.e(r2, r3, r5, r6, r7)     // Catch: java.lang.Throwable -> L4f
        L9d:
            if (r11 == 0) goto La2
            r2.n()
        La2:
            return
        La3:
            if (r11 == 0) goto La8
            r2.n()
        La8:
            throw r0
        La9:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r0 = "Internal Error: ParagraphLayoutCache could not provide a Paragraph during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: (layoutCache="
            r11.<init>(r0)
            g0.e r0 = r10.f9195y
            r11.append(r0)
            java.lang.String r0 = ", textSubstitution="
            r11.append(r0)
            g0.j r0 = r10.A
            r11.append(r0)
            r0 = 41
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            b0.a.b(r11)
            bf.n r11 = new bf.n
            r11.<init>()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.k.d(x1.h0):void");
    }
}
