package d0;

import android.content.res.AssetManager;
import android.os.Build;
import android.view.ViewConfiguration;
import com.google.android.gms.internal.ads.ur0;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class z0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f21912a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f21913b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f21914c;

    /* renamed from: d, reason: collision with root package name */
    public final Serializable f21915d;

    /* renamed from: e, reason: collision with root package name */
    public Object f21916e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f21917f;
    public Object g;

    /* renamed from: h, reason: collision with root package name */
    public Object f21918h;

    public z0(a4.d dVar, nl.b bVar, ol.k kVar, z0[] z0VarArr) {
        nk.k.e(dVar, "composer");
        this.f21913b = dVar;
        this.f21914c = bVar;
        this.f21915d = kVar;
        this.f21916e = z0VarArr;
        this.f21917f = bVar.f29991a;
        int iOrdinal = kVar.ordinal();
        if (z0VarArr != null) {
            z0 z0Var = z0VarArr[iOrdinal];
            if (z0Var == null && z0Var == this) {
                return;
            }
            z0VarArr[iOrdinal] = this;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(d0.z0 r16, d0.z1 r17, d0.t0 r18, float r19, float r20, ek.c r21) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.z0.a(d0.z0, d0.z1, d0.t0, float, float, ek.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(d0.z0 r11, nk.u r12, nk.r r13, d0.z1 r14, nk.u r15, long r16, ek.c r18) {
        /*
            r0 = r16
            r2 = r18
            boolean r3 = r2 instanceof d0.x0
            if (r3 == 0) goto L17
            r3 = r2
            d0.x0 r3 = (d0.x0) r3
            int r4 = r3.g
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L17
            int r4 = r4 - r5
            r3.g = r4
            goto L1c
        L17:
            d0.x0 r3 = new d0.x0
            r3.<init>(r2)
        L1c:
            java.lang.Object r2 = r3.f21892f
            int r4 = r3.g
            r5 = 1
            if (r4 == 0) goto L3f
            if (r4 != r5) goto L37
            nk.u r11 = r3.f21891e
            d0.z1 r12 = r3.f21890d
            nk.r r0 = r3.f21889c
            nk.u r1 = r3.f21888b
            d0.z0 r3 = r3.f21887a
            ci.b.D(r2)
            r7 = r11
            r6 = r12
            r12 = r1
            r11 = r3
            goto L6a
        L37:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3f:
            ci.b.D(r2)
            r6 = 0
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 >= 0) goto L4b
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            return r11
        L4b:
            al.k r2 = new al.k
            r4 = 0
            r6 = 6
            r2.<init>(r11, r4, r6)
            r3.f21887a = r11
            r3.f21888b = r12
            r3.f21889c = r13
            r3.f21890d = r14
            r3.f21891e = r15
            r3.g = r5
            java.lang.Object r2 = xk.x.F(r0, r2, r3)
            dk.a r0 = dk.a.f22275a
            if (r2 != r0) goto L67
            return r0
        L67:
            r0 = r13
            r6 = r14
            r7 = r15
        L6a:
            d0.t0 r2 = (d0.t0) r2
            if (r2 == 0) goto La4
            java.lang.Object r1 = r12.f29986a
            d0.t0 r1 = (d0.t0) r1
            boolean r1 = r1.f21844c
            long r3 = r2.f21842a
            long r8 = r2.f21843b
            d0.t0 r10 = new d0.t0
            r18 = r1
            r14 = r3
            r16 = r8
            r13 = r10
            r13.<init>(r14, r16, r18)
            r1 = r13
            r12.f29986a = r1
            long r3 = r6.e(r3)
            float r12 = r6.i(r3)
            r0.f29983a = r12
            r12 = 0
            r1 = 30
            a0.m r12 = a0.f.b(r1, r12)
            r7.f29986a = r12
            r11.u(r2)
            float r11 = r0.f29983a
            boolean r11 = d0.s0.a(r11)
            r11 = r11 ^ r5
            goto La5
        La4:
            r11 = 0
        La5:
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.z0.b(d0.z0, nk.u, nk.r, d0.z1, nk.u, long, ek.c):java.lang.Object");
    }

    public static t0 t(zk.h hVar) {
        t0 t0Var = null;
        uk.g gVarR = jm.a.r(new l0(new a6.e(6, hVar), null));
        while (gVarR.hasNext()) {
            t0 t0VarA = (t0) gVarR.next();
            if (t0Var != null) {
                t0VarA = t0Var.a(t0VarA);
            }
            t0Var = t0VarA;
        }
        return t0Var;
    }

    public z0 c(kl.d dVar) {
        z0 z0Var;
        z0[] z0VarArr = (z0[]) this.f21916e;
        nk.k.e(dVar, "descriptor");
        nl.b bVar = (nl.b) this.f21914c;
        ol.k kVarF = ol.g.f(dVar, bVar);
        char c9 = kVarF.f30603a;
        a4.d dVar2 = (a4.d) this.f21913b;
        dVar2.k(c9);
        dVar2.f188a = true;
        String str = (String) this.g;
        if (str != null) {
            String strA = (String) this.f21918h;
            if (strA == null) {
                strA = dVar.a();
            }
            dVar2.i();
            m(str);
            dVar2.k(':');
            m(strA);
            this.g = null;
            this.f21918h = null;
        }
        return ((ol.k) this.f21915d) == kVarF ? this : (z0VarArr == null || (z0Var = z0VarArr[kVarF.ordinal()]) == null) ? new z0(dVar2, bVar, kVarF, z0VarArr) : z0Var;
    }

    public float d(x1 x1Var, float f10) {
        z1 z1Var = (z1) this.f21913b;
        long jH = z1Var.h(z1Var.d(f10));
        z1 z1Var2 = x1Var.f21893a;
        return z1Var.g(z1Var.e(z1Var2.c(z1Var2.f21927k, jH, 1)));
    }

    public void e(kl.d dVar, int i4) {
        a4.d dVar2 = (a4.d) this.f21913b;
        nk.k.e(dVar, "descriptor");
        int iOrdinal = ((ol.k) this.f21915d).ordinal();
        boolean z3 = true;
        if (iOrdinal == 1) {
            if (!dVar2.f188a) {
                dVar2.k(',');
            }
            dVar2.i();
            return;
        }
        if (iOrdinal == 2) {
            if (dVar2.f188a) {
                this.f21912a = true;
                dVar2.i();
                return;
            }
            if (i4 % 2 == 0) {
                dVar2.k(',');
                dVar2.i();
            } else {
                dVar2.k(':');
                dVar2.m();
                z3 = false;
            }
            this.f21912a = z3;
            return;
        }
        if (iOrdinal != 3) {
            if (!dVar2.f188a) {
                dVar2.k(',');
            }
            dVar2.i();
            ol.g.e(dVar, (nl.b) this.f21914c);
            m(dVar.g(i4));
            dVar2.k(':');
            dVar2.m();
            return;
        }
        if (i4 == 0) {
            this.f21912a = true;
        }
        if (i4 == 1) {
            dVar2.k(',');
            dVar2.m();
            this.f21912a = false;
        }
    }

    public void f(int i4) {
        if (this.f21912a) {
            m(String.valueOf(i4));
        } else {
            ((t7.m) ((a4.d) this.f21913b).f189b).B(String.valueOf(i4));
        }
    }

    public void g(long j) {
        if (this.f21912a) {
            m(String.valueOf(j));
        } else {
            ((t7.m) ((a4.d) this.f21913b).f189b).B(String.valueOf(j));
        }
    }

    public void h(kl.d dVar, int i4, long j) {
        nk.k.e(dVar, "descriptor");
        e(dVar, i4);
        g(j);
    }

    public void i() {
        a4.d dVar = (a4.d) this.f21913b;
        dVar.getClass();
        nk.k.e("null", "v");
        ((t7.m) dVar.f189b).B("null");
    }

    public void j(kl.d dVar, int i4, il.a aVar, Object obj) {
        nk.k.e(dVar, "descriptor");
        nk.k.e(aVar, "serializer");
        if (obj != null || ((ur0) this.f21917f).f17302b) {
            nk.k.e(dVar, "descriptor");
            nk.k.e(aVar, "serializer");
            e(dVar, i4);
            if (aVar.d().c()) {
                l(aVar, obj);
            } else if (obj == null) {
                i();
            } else {
                l(aVar, obj);
            }
        }
    }

    public void k(kl.d dVar, int i4, il.a aVar, Object obj) {
        nk.k.e(dVar, "descriptor");
        nk.k.e(aVar, "serializer");
        e(dVar, i4);
        l(aVar, obj);
    }

    public void l(il.a aVar, Object obj) {
        String strDiscriminator;
        nk.k.e(aVar, "serializer");
        ur0 ur0Var = ((nl.b) this.f21914c).f29991a;
        ur0Var.getClass();
        int iOrdinal = ((nl.a) ur0Var.f17306f).ordinal();
        if (iOrdinal == 0) {
            strDiscriminator = null;
        } else {
            if (iOrdinal == 1) {
                ii.a aVarE = aVar.d().e();
                if (nk.k.a(aVarE, kl.f.f28378c) || nk.k.a(aVarE, kl.f.f28381f)) {
                    kl.d dVarD = aVar.d();
                    nk.k.e(dVarD, "<this>");
                    Iterator it = dVarD.getAnnotations().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            strDiscriminator = (String) ur0Var.f17305e;
                            break;
                        }
                        Annotation annotation = (Annotation) it.next();
                        if (annotation instanceof nl.c) {
                            strDiscriminator = ((nl.c) annotation).discriminator();
                            break;
                        }
                    }
                }
            } else if (iOrdinal != 2) {
                throw new ac.m();
            }
            strDiscriminator = null;
        }
        if (strDiscriminator != null) {
            String strA = aVar.d().a();
            this.g = strDiscriminator;
            this.f21918h = strA;
        }
        aVar.b(this, obj);
    }

    public void m(String str) {
        byte b10;
        nk.k.e(str, "value");
        a4.d dVar = (a4.d) this.f21913b;
        dVar.getClass();
        nk.k.e(str, "value");
        t7.m mVar = (t7.m) dVar.f189b;
        mVar.l(mVar.f34473b, str.length() + 2);
        char[] cArr = (char[]) mVar.f34474c;
        int i4 = mVar.f34473b;
        int i10 = i4 + 1;
        cArr[i4] = '\"';
        int length = str.length();
        str.getChars(0, length, cArr, i10);
        int i11 = length + i10;
        int i12 = i10;
        while (i12 < i11) {
            char c9 = cArr[i12];
            byte[] bArr = ol.j.f30597b;
            if (c9 < bArr.length && bArr[c9] != 0) {
                int length2 = str.length();
                for (int i13 = i12 - i10; i13 < length2; i13++) {
                    mVar.l(i12, 2);
                    char cCharAt = str.charAt(i13);
                    byte[] bArr2 = ol.j.f30597b;
                    if (cCharAt >= bArr2.length || (b10 = bArr2[cCharAt]) == 0) {
                        int i14 = i12 + 1;
                        ((char[]) mVar.f34474c)[i12] = cCharAt;
                        i12 = i14;
                    } else {
                        if (b10 == 1) {
                            String str2 = ol.j.f30596a[cCharAt];
                            nk.k.b(str2);
                            mVar.l(i12, str2.length());
                            str2.getChars(0, str2.length(), (char[]) mVar.f34474c, i12);
                            int length3 = str2.length() + i12;
                            mVar.f34473b = length3;
                            i12 = length3;
                        } else {
                            char[] cArr2 = (char[]) mVar.f34474c;
                            cArr2[i12] = '\\';
                            cArr2[i12 + 1] = (char) b10;
                            i12 += 2;
                            mVar.f34473b = i12;
                        }
                    }
                }
                mVar.l(i12, 1);
                ((char[]) mVar.f34474c)[i12] = '\"';
                mVar.f34473b = i12 + 1;
                return;
            }
            i12++;
        }
        cArr[i11] = '\"';
        mVar.f34473b = i11 + 1;
    }

    public void n(kl.d dVar, int i4, String str) {
        nk.k.e(dVar, "descriptor");
        nk.k.e(str, "value");
        e(dVar, i4);
        m(str);
    }

    public void o(kl.d dVar) {
        nk.k.e(dVar, "descriptor");
        ol.k kVar = (ol.k) this.f21915d;
        a4.d dVar2 = (a4.d) this.f21913b;
        dVar2.getClass();
        dVar2.f188a = false;
        dVar2.k(kVar.f30604b);
    }

    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public boolean p(c2.j jVar) {
        long j;
        jf.c cVar = (jf.c) this.f21914c;
        d3.c cVar2 = (d3.c) this.f21916e;
        ViewConfiguration viewConfiguration = (ViewConfiguration) cVar.f27642b;
        int i4 = Build.VERSION.SDK_INT;
        float f10 = -(i4 > 26 ? f2.b(viewConfiguration) : cVar2.I(64));
        float f11 = -(i4 > 26 ? f2.a(viewConfiguration) : cVar2.I(64));
        ?? r12 = jVar.f2626a;
        o1.b bVar = new o1.b(0L);
        int size = r12.size();
        int i10 = 0;
        while (true) {
            j = bVar.f30364a;
            if (i10 >= size) {
                break;
            }
            bVar = new o1.b(o1.b.h(j, ((c2.p) r12.get(i10)).j));
            i10++;
        }
        long jFloatToRawIntBits = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) * f11) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) * f10) & 4294967295L);
        z1 z1Var = (z1) this.f21913b;
        float fI = z1Var.i(z1Var.e(jFloatToRawIntBits));
        return fI != 0.0f ? (fI > 0.0f ? 1 : (fI == 0.0f ? 0 : -1)) > 0 ? z1Var.f21919a.d() : z1Var.f21919a.c() : false ? !(((zk.h) this.f21917f).l(new t0(jFloatToRawIntBits, ((c2.p) zj.n.c0(jVar.f2626a)).f2659b, false)) instanceof zk.n) : this.f21912a;
    }

    public FileInputStream q(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e2) {
            String message = e2.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            ((r5.d) this.f21914c).l();
            return null;
        }
    }

    public void r(int i4, Serializable serializable) {
        ((Executor) this.f21913b).execute(new com.applovin.mediation.nativeAds.adPlacer.a(this, i4, serializable, 8));
    }

    public boolean s(kl.d dVar) {
        ((ur0) this.f21917f).getClass();
        return false;
    }

    public void u(t0 t0Var) {
        yb.i iVar = (yb.i) this.f21918h;
        long j = t0Var.f21843b;
        long j8 = t0Var.f21842a;
        ((d2.d) iVar.f37516b).a(j, Float.intBitsToFloat((int) (j8 >> 32)));
        ((d2.d) iVar.f37517c).a(j, Float.intBitsToFloat((int) (j8 & 4294967295L)));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object v(d0.z1 r5, d0.w0 r6, ek.c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof d0.y0
            if (r0 == 0) goto L13
            r0 = r7
            d0.y0 r0 = (d0.y0) r0
            int r1 = r0.f21901c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21901c = r1
            goto L18
        L13:
            d0.y0 r0 = new d0.y0
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f21899a
            int r1 = r0.f21901c
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            ci.b.D(r7)
            goto L4f
        L25:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2d:
            ci.b.D(r7)
            r4.f21912a = r2
            al.p r7 = new al.p
            r1 = 0
            r3 = 14
            r7.<init>(r5, r6, r1, r3)
            r0.f21901c = r2
            bl.r r5 = new bl.r
            ck.h r6 = r0.getContext()
            r1 = 1
            r5.<init>(r6, r0, r1)
            java.lang.Object r5 = ci.b.B(r5, r2, r5, r7)
            dk.a r6 = dk.a.f22275a
            if (r5 != r6) goto L4f
            return r6
        L4f:
            r5 = 0
            r4.f21912a = r5
            yj.u r5 = yj.u.f37649a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.z0.v(d0.z1, d0.w0, ek.c):java.lang.Object");
    }

    public z0(z1 z1Var, jf.c cVar, c1.g gVar, d3.c cVar2) {
        this.f21913b = z1Var;
        this.f21914c = cVar;
        this.f21915d = gVar;
        this.f21916e = cVar2;
        this.f21917f = com.bumptech.glide.e.f(Integer.MAX_VALUE, 6, null);
        this.f21918h = new yb.i(12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public z0(AssetManager assetManager, Executor executor, r5.d dVar, String str, File file) {
        this.f21912a = false;
        this.f21913b = executor;
        this.f21914c = dVar;
        this.f21917f = str;
        this.f21916e = file;
        int i4 = Build.VERSION.SDK_INT;
        Serializable serializable = null;
        serializable = null;
        if (i4 >= 24) {
            if (i4 >= 31) {
                serializable = r5.e.f32820d;
            } else {
                switch (i4) {
                    case 24:
                    case 25:
                        serializable = r5.e.f32823h;
                        break;
                    case 26:
                        serializable = r5.e.g;
                        break;
                    case 27:
                        serializable = r5.e.f32822f;
                        break;
                    case 28:
                    case 29:
                    case 30:
                        serializable = r5.e.f32821e;
                        break;
                }
            }
        }
        this.f21915d = serializable;
    }
}
