package com.bumptech.glide;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.c0;
import androidx.lifecycle.e1;
import androidx.lifecycle.s;
import b5.q0;
import b5.u0;
import b5.z;
import com.applovin.shadow.okio.Segment;
import com.google.android.gms.internal.ads.xz;
import com.google.android.gms.internal.measurement.j4;
import com.google.android.gms.internal.measurement.z3;
import i2.w1;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import n1.q;
import u0.a2;
import u0.e2;
import u0.r;
import u0.t;
import u0.v1;
import x.a0;
import x.e0;
import x.f0;
import x.l0;
import x.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class f {
    public static void A(Window window, boolean z3) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 35) {
            a4.a.y(window, z3);
        } else {
            if (i4 >= 30) {
                a4.a.x(window, z3);
                return;
            }
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z3 ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    public static final void B(z zVar, String str, Bundle bundle) {
        u0 u0VarS = zVar.s();
        q0 q0Var = (q0) u0VarS.f1888n.get(str);
        if (q0Var == null || ((c0) q0Var.f1852a).f1110d.compareTo(s.f1183d) < 0) {
            u0VarS.f1887m.put(str, bundle);
        } else {
            q0Var.d(bundle, str);
        }
        if (u0.K(2)) {
            Log.v("FragmentManager", "Setting fragment result with key " + str + " and result " + bundle);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [a8.a, h1.j] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    public static final ArrayList C(a2 a2Var, int i4, Integer num) {
        ?? jVar = new h1.j(a2Var);
        int iQ = a2Var.q(i4);
        u0.a aVarA = a2Var.a(i4);
        while (i4 >= 0) {
            jVar.v(a2Var.i(i4), a2Var.k(i4) ? a2Var.p(i4, a2Var.f34729b) : u0.l.f34851a, a2Var.f34728a.i(i4), num);
            if (iQ >= 0) {
                u0.a aVar = aVarA;
                aVarA = a2Var.a(iQ);
                i4 = iQ;
                iQ = a2Var.q(iQ);
                num = aVar;
            } else {
                i4 = iQ;
                num = aVarA;
            }
        }
        return (ArrayList) jVar.f218b;
    }

    public static void D(Parcel parcel, int i4, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int iO = O(parcel, i4);
        parcel.writeBundle(bundle);
        P(parcel, iO);
    }

    public static void E(Parcel parcel, int i4, byte[] bArr) {
        if (bArr == null) {
            return;
        }
        int iO = O(parcel, i4);
        parcel.writeByteArray(bArr);
        P(parcel, iO);
    }

    public static void F(Parcel parcel, int i4, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int iO = O(parcel, i4);
        parcel.writeStrongBinder(iBinder);
        P(parcel, iO);
    }

    public static void G(Parcel parcel, int i4, List list) {
        if (list == null) {
            return;
        }
        int iO = O(parcel, i4);
        int size = list.size();
        parcel.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            parcel.writeInt(((Integer) list.get(i10)).intValue());
        }
        P(parcel, iO);
    }

    public static void H(Parcel parcel, int i4, Parcelable parcelable, int i10) {
        if (parcelable == null) {
            return;
        }
        int iO = O(parcel, i4);
        parcelable.writeToParcel(parcel, i10);
        P(parcel, iO);
    }

    public static void I(Parcel parcel, int i4, String str) {
        if (str == null) {
            return;
        }
        int iO = O(parcel, i4);
        parcel.writeString(str);
        P(parcel, iO);
    }

    public static void J(Parcel parcel, int i4, String[] strArr) {
        if (strArr == null) {
            return;
        }
        int iO = O(parcel, i4);
        parcel.writeStringArray(strArr);
        P(parcel, iO);
    }

    public static void K(Parcel parcel, int i4, List list) {
        if (list == null) {
            return;
        }
        int iO = O(parcel, i4);
        parcel.writeStringList(list);
        P(parcel, iO);
    }

    public static void L(Parcel parcel, int i4, Parcelable[] parcelableArr, int i10) {
        if (parcelableArr == null) {
            return;
        }
        int iO = O(parcel, i4);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i10);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        P(parcel, iO);
    }

    public static void M(Parcel parcel, int i4, List list) {
        if (list == null) {
            return;
        }
        int iO = O(parcel, i4);
        int size = list.size();
        parcel.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            Parcelable parcelable = (Parcelable) list.get(i10);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, 0);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        P(parcel, iO);
    }

    public static void N(Parcel parcel, int i4, int i10) {
        parcel.writeInt(i4 | (i10 << 16));
    }

    public static int O(Parcel parcel, int i4) {
        parcel.writeInt(i4 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void P(Parcel parcel, int i4) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i4 - 4);
        parcel.writeInt(iDataPosition - i4);
        parcel.setDataPosition(iDataPosition);
    }

    public static final d3.e a(Context context) {
        float f10 = context.getResources().getConfiguration().fontScale;
        float f11 = context.getResources().getDisplayMetrics().density;
        e3.a aVarA = e3.b.a(f10);
        if (aVarA == null) {
            aVarA = new d3.m(f10);
        }
        return new d3.e(f11, f10, aVarA);
    }

    public static final o1.d b(float f10, float f11, float f12, float f13, long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        long jFloatToRawIntBits = (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (4294967295L & Float.floatToRawIntBits(fIntBitsToFloat2));
        return new o1.d(f10, f11, f12, f13, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits);
    }

    public static final void c(e0 e0Var, Object obj, Object obj2) {
        int iF = e0Var.f(obj);
        boolean z3 = iF < 0;
        Object obj3 = z3 ? null : e0Var.f36875c[iF];
        if (obj3 != null) {
            if (obj3 instanceof f0) {
                ((f0) obj3).a(obj2);
            } else if (obj3 != obj2) {
                f0 f0Var = new f0();
                f0Var.a(obj3);
                f0Var.a(obj2);
                obj2 = f0Var;
            }
            obj2 = obj3;
        }
        if (!z3) {
            e0Var.f36875c[iF] = obj2;
            return;
        }
        int i4 = ~iF;
        e0Var.f36874b[i4] = obj;
        e0Var.f36875c[i4] = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object d(zk.u r4, mk.a r5, ek.c r6) {
        /*
            boolean r0 = r6 instanceof zk.s
            if (r0 == 0) goto L13
            r0 = r6
            zk.s r0 = (zk.s) r0
            int r1 = r0.f38374c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f38374c = r1
            goto L18
        L13:
            zk.s r0 = new zk.s
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f38373b
            int r1 = r0.f38374c
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            mk.a r5 = r0.f38372a
            ci.b.D(r6)     // Catch: java.lang.Throwable -> L27
            goto L64
        L27:
            r4 = move-exception
            goto L6a
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            ci.b.D(r6)
            ck.h r6 = r0.getContext()
            xk.s r1 = xk.s.f37235b
            ck.f r6 = r6.O(r1)
            if (r6 != r4) goto L6e
            r0.f38372a = r5     // Catch: java.lang.Throwable -> L27
            r0.f38374c = r2     // Catch: java.lang.Throwable -> L27
            xk.h r6 = new xk.h     // Catch: java.lang.Throwable -> L27
            ck.c r0 = a.a.r(r0)     // Catch: java.lang.Throwable -> L27
            r6.<init>(r2, r0)     // Catch: java.lang.Throwable -> L27
            r6.s()     // Catch: java.lang.Throwable -> L27
            c2.d0 r0 = new c2.d0     // Catch: java.lang.Throwable -> L27
            r1 = 4
            r0.<init>(r1, r6)     // Catch: java.lang.Throwable -> L27
            zk.t r4 = (zk.t) r4     // Catch: java.lang.Throwable -> L27
            r4.j0(r0)     // Catch: java.lang.Throwable -> L27
            java.lang.Object r4 = r6.r()     // Catch: java.lang.Throwable -> L27
            dk.a r6 = dk.a.f22275a
            if (r4 != r6) goto L64
            return r6
        L64:
            r5.invoke()
            yj.u r4 = yj.u.f37649a
            return r4
        L6a:
            r5.invoke()
            throw r4
        L6e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "awaitClose() can only be invoked from the producer context"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.f.d(zk.u, mk.a, ek.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [a8.a, h1.j] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [u0.a] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Integer] */
    public static final List e(e2 e2Var, Integer num, int i4, Integer num2) {
        int iE;
        int iS;
        a0 a0Var;
        if (e2Var.f34799w || e2Var.p() == 0) {
            return zj.s.f38317a;
        }
        ?? jVar = new h1.j(e2Var);
        if (num2 != null) {
            iE = num2.intValue();
        } else {
            iE = e2Var.f34798v;
            if (iE < 0) {
                iE = e2Var.E(i4, e2Var.f34780b);
            }
        }
        if (num == 0) {
            int iN = e2Var.f34786i - e2Var.N(e2Var.r(i4), e2Var.f34780b);
            u uVar = e2Var.f34795s;
            num = Integer.valueOf(iN + ((uVar == null || (a0Var = (a0) uVar.b(i4)) == null) ? 0 : a0Var.f36847b));
        }
        int iR = e2Var.r(i4) * 5;
        int[] iArr = e2Var.f34780b;
        if (iR < iArr.length) {
            iS = e2Var.s(i4);
        } else {
            int iE2 = iE >= 0 ? e2Var.E(iE, iArr) : iE;
            iS = e2Var.s(iE);
            int i10 = iE;
            iE = iE2;
            i4 = i10;
        }
        while (i4 >= 0) {
            jVar.v(iS, (e2Var.f34780b[(e2Var.r(i4) * 5) + 1] & 536870912) != 0 ? e2Var.t(i4) : u0.l.f34851a, e2Var.O(i4), num);
            num = e2Var.b(i4);
            if (iE >= 0) {
                int iE3 = e2Var.E(iE, e2Var.f34780b);
                iS = e2Var.s(iE);
                int i11 = iE;
                iE = iE3;
                i4 = i11;
            } else {
                i4 = iE;
            }
        }
        return (ArrayList) jVar.f218b;
    }

    public static void f(Object obj, Object obj2) {
        if (obj == null) {
            String strValueOf = String.valueOf(obj2);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 24);
            sb2.append("null key in entry: null=");
            sb2.append(strValueOf);
            throw new NullPointerException(sb2.toString());
        }
        if (obj2 != null) {
            return;
        }
        String strValueOf2 = String.valueOf(obj);
        StringBuilder sb3 = new StringBuilder(strValueOf2.length() + 26);
        sb3.append("null value in entry: ");
        sb3.append(strValueOf2);
        sb3.append("=null");
        throw new NullPointerException(sb3.toString());
    }

    public static void g(int i4, String str) {
        if (i4 >= 0) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + 40);
        sb2.append(str);
        sb2.append(" cannot be negative but was: ");
        sb2.append(i4);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static final boolean h(n1.s sVar, boolean z3) {
        int iOrdinal = sVar.u0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                n1.s sVarI = z3.i(sVar);
                if (!(sVarI != null ? h(sVarI, z3) : true)) {
                    return false;
                }
                sVar.q0(q.f29545b, q.f29546c);
                return true;
            }
            if (iOrdinal == 2) {
                return z3;
            }
            if (iOrdinal != 3) {
                throw new ac.m();
            }
        }
        return true;
    }

    public static e0 i() {
        long[] jArr = l0.f36914a;
        return new e0();
    }

    public static e1 j(Class cls) throws IllegalAccessException, NoSuchMethodException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            if (!Modifier.isPublic(declaredConstructor.getModifiers())) {
                throw new RuntimeException("Cannot create an instance of " + cls);
            }
            try {
                Object objNewInstance = declaredConstructor.newInstance(null);
                nk.k.b(objNewInstance);
                return (e1) objNewInstance;
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("Cannot create an instance of " + cls, e2);
            } catch (InstantiationException e10) {
                throw new RuntimeException("Cannot create an instance of " + cls, e10);
            }
        } catch (NoSuchMethodException e11) {
            throw new RuntimeException("Cannot create an instance of " + cls, e11);
        }
    }

    public static final Integer k(a2 a2Var, t tVar, int i4, int i10) {
        Integer numK;
        int[] iArr = a2Var.f34729b;
        while (true) {
            if (i4 >= i10) {
                return null;
            }
            int i11 = iArr[(i4 * 5) + 3] + i4;
            if (a2Var.j(i4) && a2Var.i(i4) == 206 && nk.k.a(a2Var.p(i4, iArr), r.f34951e)) {
                Object objH = a2Var.h(i4, 0);
                v1 v1Var = objH instanceof v1 ? (v1) objH : null;
                Object obj = v1Var != null ? v1Var.f34990a : null;
                u0.n nVar = obj instanceof u0.n ? (u0.n) obj : null;
                if (nVar != null && nVar.f34876a.equals(tVar)) {
                    return Integer.valueOf(i4);
                }
            }
            if (a2Var.d(i4) && (numK = k(a2Var, tVar, i4 + 1, i11)) != null) {
                return Integer.valueOf(numK.intValue());
            }
            i4 = i11;
        }
    }

    public static final ck.h l(t5.s sVar, ek.c cVar) {
        if (!sVar.j()) {
            cl.d dVar = sVar.f34279a;
            if (dVar != null) {
                return dVar.f2910a;
            }
            nk.k.k("coroutineScope");
            throw null;
        }
        if (cVar.getContext().O(t5.u.f34290a) != null) {
            throw new ClassCastException();
        }
        cl.d dVar2 = sVar.f34279a;
        if (dVar2 != null) {
            return dVar2.f2910a;
        }
        nk.k.k("coroutineScope");
        throw null;
    }

    public static final boolean m(o1.d dVar) {
        long j = dVar.f30374e;
        return (j >>> 32) == (4294967295L & j) && j == dVar.f30375f && j == dVar.g && j == dVar.f30376h;
    }

    public static boolean n(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return j4.p(context);
        }
        return true;
    }

    public static final Object r(t5.s sVar, boolean z3, boolean z10, mk.c cVar) {
        nk.k.e(sVar, "db");
        sVar.a();
        if (!sVar.j() || sVar.k() || sVar.f34285h.get() == null) {
            return cm.g.J(new z5.b(null, cVar, sVar, z3, z10));
        }
        throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [mk.c, nk.l] */
    public static final n1.b s(n1.s sVar, int i4) {
        int iOrdinal = sVar.u0().ordinal();
        n1.b bVar = n1.b.f29510a;
        if (iOrdinal != 0) {
            n1.b bVar2 = n1.b.f29511b;
            if (iOrdinal == 1) {
                n1.s sVarI = z3.i(sVar);
                if (sVarI == null) {
                    throw new IllegalArgumentException("ActiveParent with no focused child");
                }
                n1.b bVarS = s(sVarI, i4);
                if (bVarS == bVar) {
                    bVarS = null;
                }
                if (bVarS != null) {
                    return bVarS;
                }
                if (sVar.f29551q) {
                    return bVar;
                }
                sVar.f29551q = true;
                try {
                    n1.n nVarR0 = sVar.r0();
                    n1.a aVar = new n1.a(i4);
                    xz xzVar = (xz) ((j2.r) i2.k.t(sVar)).getFocusOwner();
                    n1.s sVarH = xzVar.h();
                    nVarR0.f29538k.invoke(aVar);
                    n1.s sVarH2 = xzVar.h();
                    if (!aVar.f29509b) {
                        return (sVarH == sVarH2 || sVarH2 == null) ? bVar : n1.p.f29542d == n1.p.f29541c ? bVar2 : n1.b.f29512c;
                    }
                    n1.p pVar = n1.p.f29540b;
                    return bVar2;
                } finally {
                    sVar.f29551q = false;
                }
            }
            if (iOrdinal == 2) {
                return bVar2;
            }
            if (iOrdinal != 3) {
                throw new ac.m();
            }
        }
        return bVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [mk.c, nk.l] */
    public static final n1.b t(n1.s sVar, int i4) {
        if (!sVar.f29552r) {
            sVar.f29552r = true;
            try {
                n1.n nVarR0 = sVar.r0();
                n1.a aVar = new n1.a(i4);
                xz xzVar = (xz) ((j2.r) i2.k.t(sVar)).getFocusOwner();
                n1.s sVarH = xzVar.h();
                nVarR0.j.invoke(aVar);
                n1.s sVarH2 = xzVar.h();
                boolean z3 = aVar.f29509b;
                n1.b bVar = n1.b.f29511b;
                if (z3) {
                    n1.p pVar = n1.p.f29540b;
                    return bVar;
                }
                if (sVarH != sVarH2 && sVarH2 != null) {
                    return n1.p.f29542d == n1.p.f29541c ? bVar : n1.b.f29512c;
                }
            } finally {
                sVar.f29552r = false;
            }
        }
        return n1.b.f29510a;
    }

    public static final n1.b u(n1.s sVar, int i4) {
        i1.m mVarE;
        com.google.android.gms.internal.consent_sdk.a0 a0Var;
        int iOrdinal = sVar.u0().ordinal();
        n1.b bVar = n1.b.f29510a;
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                n1.s sVarI = z3.i(sVar);
                if (sVarI != null) {
                    return s(sVarI, i4);
                }
                throw new IllegalArgumentException("ActiveParent with no focused child");
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new ac.m();
                }
                if (!sVar.f25554a.f25565n) {
                    f2.a.b("visitAncestors called on an unattached node");
                }
                i1.m mVar = sVar.f25554a.f25558e;
                i2.e0 e0VarS = i2.k.s(sVar);
                loop0: while (true) {
                    if (e0VarS == null) {
                        mVarE = null;
                        break;
                    }
                    if ((((i1.m) e0VarS.G.g).f25557d & Segment.SHARE_MINIMUM) != 0) {
                        while (mVar != null) {
                            if ((mVar.f25556c & Segment.SHARE_MINIMUM) != 0) {
                                mVarE = mVar;
                                w0.e eVar = null;
                                while (mVarE != null) {
                                    if (mVarE instanceof n1.s) {
                                        break loop0;
                                    }
                                    if ((mVarE.f25556c & Segment.SHARE_MINIMUM) != 0 && (mVarE instanceof i2.j)) {
                                        int i10 = 0;
                                        for (i1.m mVar2 = ((i2.j) mVarE).f25691p; mVar2 != null; mVar2 = mVar2.f25559f) {
                                            if ((mVar2.f25556c & Segment.SHARE_MINIMUM) != 0) {
                                                i10++;
                                                if (i10 == 1) {
                                                    mVarE = mVar2;
                                                } else {
                                                    if (eVar == null) {
                                                        eVar = new w0.e(new i1.m[16]);
                                                    }
                                                    if (mVarE != null) {
                                                        eVar.b(mVarE);
                                                        mVarE = null;
                                                    }
                                                    eVar.b(mVar2);
                                                }
                                            }
                                        }
                                        if (i10 == 1) {
                                        }
                                    }
                                    mVarE = i2.k.e(eVar);
                                }
                            }
                            mVar = mVar.f25558e;
                        }
                    }
                    e0VarS = e0VarS.v();
                    mVar = (e0VarS == null || (a0Var = e0VarS.G) == null) ? null : (w1) a0Var.f19259f;
                }
                n1.s sVar2 = (n1.s) mVarE;
                if (sVar2 == null) {
                    return bVar;
                }
                int iOrdinal2 = sVar2.u0().ordinal();
                if (iOrdinal2 == 0) {
                    return t(sVar2, i4);
                }
                if (iOrdinal2 == 1) {
                    return u(sVar2, i4);
                }
                if (iOrdinal2 == 2) {
                    return n1.b.f29511b;
                }
                if (iOrdinal2 != 3) {
                    throw new ac.m();
                }
                n1.b bVarU = u(sVar2, i4);
                n1.b bVar2 = bVarU != bVar ? bVarU : null;
                return bVar2 == null ? t(sVar2, i4) : bVar2;
            }
        }
        return bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x021a A[ADDED_TO_REGION, LOOP:9: B:153:0x021a->B:160:0x022c, LOOP_START, PHI: r12
  0x021a: PHI (r12v3 int) = (r12v2 int), (r12v4 int) binds: [B:152:0x0218, B:160:0x022c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x023a  */
    /* JADX WARN: Type inference failed for: r4v27, types: [java.lang.Object, java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean v(n1.s r18) {
        /*
            Method dump skipped, instructions count: 585
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.f.v(n1.s):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object w(t5.s r7, boolean r8, a0.q0 r9, ek.c r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof z5.d
            if (r0 == 0) goto L13
            r0 = r10
            z5.d r0 = (z5.d) r0
            int r1 = r0.f37927e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f37927e = r1
            goto L18
        L13:
            z5.d r0 = new z5.d
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f37926d
            int r1 = r0.f37927e
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            dk.a r6 = dk.a.f22275a
            if (r1 == 0) goto L44
            if (r1 == r5) goto L40
            if (r1 == r4) goto L36
            if (r1 != r3) goto L2e
            ci.b.D(r10)
            return r10
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            boolean r8 = r0.f37925c
            a0.q0 r9 = r0.f37924b
            t5.s r7 = r0.f37923a
            ci.b.D(r10)
            goto L77
        L40:
            ci.b.D(r10)
            return r10
        L44:
            ci.b.D(r10)
            boolean r10 = r7.j()
            if (r10 == 0) goto L68
            boolean r10 = r7.m()
            if (r10 == 0) goto L68
            boolean r10 = r7.k()
            if (r10 == 0) goto L68
            z5.e r10 = new z5.e
            r10.<init>(r2, r9, r7, r8)
            r0.f37927e = r5
            java.lang.Object r7 = r7.q(r8, r10, r0)
            if (r7 != r6) goto L67
            goto L8a
        L67:
            return r7
        L68:
            r0.f37923a = r7
            r0.f37924b = r9
            r0.f37925c = r8
            r0.f37927e = r4
            ck.h r10 = l(r7, r0)
            if (r10 != r6) goto L77
            goto L8a
        L77:
            ck.h r10 = (ck.h) r10
            z5.c r1 = new z5.c
            r1.<init>(r2, r9, r7, r8)
            r0.f37923a = r2
            r0.f37924b = r2
            r0.f37927e = r3
            java.lang.Object r7 = xk.x.E(r10, r1, r0)
            if (r7 != r6) goto L8b
        L8a:
            return r6
        L8b:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.f.w(t5.s, boolean, a0.q0, ek.c):java.lang.Object");
    }

    public static final boolean x(String str) {
        nk.k.e(str, "method");
        return (str.equals("GET") || str.equals("HEAD")) ? false : true;
    }

    public static final boolean y(e0 e0Var, Object obj, Object obj2) {
        Object objG = e0Var.g(obj);
        if (objG == null) {
            return false;
        }
        if (!(objG instanceof f0)) {
            if (!objG.equals(obj2)) {
                return false;
            }
            e0Var.k(obj);
            return true;
        }
        f0 f0Var = (f0) objG;
        boolean zL = f0Var.l(obj2);
        if (zL && f0Var.g()) {
            e0Var.k(obj);
        }
        return zL;
    }

    public static final void z(e0 e0Var, Object obj) {
        boolean zG;
        long[] jArr = e0Var.f36873a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i4 = 0;
        while (true) {
            long j = jArr[i4];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i10 = 8 - ((~(i4 - length)) >>> 31);
                for (int i11 = 0; i11 < i10; i11++) {
                    if ((255 & j) < 128) {
                        int i12 = (i4 << 3) + i11;
                        Object obj2 = e0Var.f36874b[i12];
                        Object obj3 = e0Var.f36875c[i12];
                        if (obj3 instanceof f0) {
                            f0 f0Var = (f0) obj3;
                            f0Var.l(obj);
                            zG = f0Var.g();
                        } else {
                            zG = obj3 == obj;
                        }
                        if (zG) {
                            e0Var.l(i12);
                        }
                    }
                    j >>= 8;
                }
                if (i10 != 8) {
                    return;
                }
            }
            if (i4 == length) {
                return;
            } else {
                i4++;
            }
        }
    }

    public void p() {
    }

    public void q() {
    }

    public void o(int i4) {
    }
}
