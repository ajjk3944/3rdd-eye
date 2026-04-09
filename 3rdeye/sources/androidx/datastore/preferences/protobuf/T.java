package androidx.datastore.preferences.protobuf;

import N7.B8;
import N7.C1154e9;
import N7.G8;
import androidx.datastore.preferences.protobuf.AbstractC1730h;
import androidx.datastore.preferences.protobuf.AbstractC1733k;
import androidx.datastore.preferences.protobuf.C1740s;
import androidx.datastore.preferences.protobuf.C1746y;
import androidx.datastore.preferences.protobuf.I;
import androidx.datastore.preferences.protobuf.o0;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* compiled from: MessageSchema.java */
/* loaded from: classes.dex */
public final class T<T> implements f0<T> {

    /* renamed from: q, reason: collision with root package name */
    public static final int[] f15558q = new int[0];

    /* renamed from: r, reason: collision with root package name */
    public static final Unsafe f15559r = o0.i();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f15560a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f15561b;

    /* renamed from: c, reason: collision with root package name */
    public final int f15562c;

    /* renamed from: d, reason: collision with root package name */
    public final int f15563d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC1744w f15564e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f15565f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f15566g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f15567h;
    public final int[] i;

    /* renamed from: j, reason: collision with root package name */
    public final int f15568j;

    /* renamed from: k, reason: collision with root package name */
    public final int f15569k;

    /* renamed from: l, reason: collision with root package name */
    public final V f15570l;

    /* renamed from: m, reason: collision with root package name */
    public final F f15571m;

    /* renamed from: n, reason: collision with root package name */
    public final k0<?, ?> f15572n;

    /* renamed from: o, reason: collision with root package name */
    public final AbstractC1738p<?> f15573o;

    /* renamed from: p, reason: collision with root package name */
    public final K f15574p;

    public T(int[] iArr, Object[] objArr, int i, int i10, AbstractC1744w abstractC1744w, boolean z10, int[] iArr2, int i11, int i12, V v10, F f10, k0 k0Var, AbstractC1738p abstractC1738p, K k10) {
        this.f15560a = iArr;
        this.f15561b = objArr;
        this.f15562c = i;
        this.f15563d = i10;
        this.f15566g = androidx.work.s.n(abstractC1744w);
        this.f15567h = z10;
        this.f15565f = abstractC1738p != null && abstractC1738p.e(abstractC1744w);
        this.i = iArr2;
        this.f15568j = i11;
        this.f15569k = i12;
        this.f15570l = v10;
        this.f15571m = f10;
        this.f15572n = k0Var;
        this.f15573o = abstractC1738p;
        this.f15564e = abstractC1744w;
        this.f15574p = k10;
    }

    public static Field E(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder sbK = B8.k("Field ", str, " for ");
            sbK.append(cls.getName());
            sbK.append(" not found. Known fields are ");
            sbK.append(Arrays.toString(declaredFields));
            throw new RuntimeException(sbK.toString());
        }
    }

    public static int H(int i) {
        return (i & 267386880) >>> 20;
    }

    public static void L(int i, Object obj, t0 t0Var) throws IOException {
        if (obj instanceof String) {
            ((C1734l) t0Var).f15660a.D(i, (String) obj);
        } else {
            ((C1734l) t0Var).b(i, (AbstractC1730h) obj);
        }
    }

    public static List p(AbstractC1723a abstractC1723a, long j4) {
        return (List) o0.f15681d.i(abstractC1723a, j4);
    }

    public static T u(N n9, V v10, F f10, k0 k0Var, AbstractC1738p abstractC1738p, K k10) {
        if (n9 instanceof d0) {
            return v((d0) n9, v10, f10, k0Var, abstractC1738p, k10);
        }
        a0 a0Var = a0.PROTO2;
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <T> androidx.datastore.preferences.protobuf.T<T> v(androidx.datastore.preferences.protobuf.d0 r35, androidx.datastore.preferences.protobuf.V r36, androidx.datastore.preferences.protobuf.F r37, androidx.datastore.preferences.protobuf.k0<?, ?> r38, androidx.datastore.preferences.protobuf.AbstractC1738p<?> r39, androidx.datastore.preferences.protobuf.K r40) {
        /*
            Method dump skipped, instructions count: 1045
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.T.v(androidx.datastore.preferences.protobuf.d0, androidx.datastore.preferences.protobuf.V, androidx.datastore.preferences.protobuf.F, androidx.datastore.preferences.protobuf.k0, androidx.datastore.preferences.protobuf.p, androidx.datastore.preferences.protobuf.K):androidx.datastore.preferences.protobuf.T");
    }

    public static long w(int i) {
        return i & 1048575;
    }

    public static <T> int x(T t10, long j4) {
        return ((Integer) o0.f15681d.i(t10, j4)).intValue();
    }

    public static <T> long y(T t10, long j4) {
        return ((Long) o0.f15681d.i(t10, j4)).longValue();
    }

    public final <E> void A(Object obj, long j4, e0 e0Var, f0<E> f0Var, C1737o c1737o) throws IOException {
        e0Var.c(this.f15571m.c(obj, j4), f0Var, c1737o);
    }

    public final <E> void B(Object obj, int i, e0 e0Var, f0<E> f0Var, C1737o c1737o) throws IOException {
        e0Var.d(this.f15571m.c(obj, i & 1048575), f0Var, c1737o);
    }

    public final void C(Object obj, int i, e0 e0Var) throws IOException {
        if ((536870912 & i) != 0) {
            o0.o(obj, i & 1048575, e0Var.readStringRequireUtf8());
        } else if (this.f15566g) {
            o0.o(obj, i & 1048575, e0Var.readString());
        } else {
            o0.o(obj, i & 1048575, e0Var.readBytes());
        }
    }

    public final void D(Object obj, int i, e0 e0Var) throws IOException {
        boolean z10 = (536870912 & i) != 0;
        F f10 = this.f15571m;
        if (z10) {
            e0Var.readStringListRequireUtf8(f10.c(obj, i & 1048575));
        } else {
            e0Var.readStringList(f10.c(obj, i & 1048575));
        }
    }

    public final void F(T t10, int i) {
        if (this.f15567h) {
            return;
        }
        int i10 = this.f15560a[i + 2];
        long j4 = i10 & 1048575;
        o0.m(t10, j4, o0.f15681d.g(t10, j4) | (1 << (i10 >>> 20)));
    }

    public final void G(T t10, int i, int i10) {
        o0.m(t10, this.f15560a[i10 + 2] & 1048575, i);
    }

    public final int I(int i) {
        return this.f15560a[i + 1];
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void J(T r22, androidx.datastore.preferences.protobuf.t0 r23) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1404
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.T.J(java.lang.Object, androidx.datastore.preferences.protobuf.t0):void");
    }

    public final <K, V> void K(t0 t0Var, int i, Object obj, int i10) throws IOException {
        if (obj != null) {
            Object objJ = j(i10);
            K k10 = this.f15574p;
            I.a<?, ?> aVarForMapMetadata = k10.forMapMetadata(objJ);
            J jForMapData = k10.forMapData(obj);
            AbstractC1733k abstractC1733k = ((C1734l) t0Var).f15660a;
            abstractC1733k.getClass();
            for (Map.Entry<K, V> entry : jForMapData.entrySet()) {
                abstractC1733k.F(i, 2);
                abstractC1733k.H(I.a(aVarForMapMetadata, entry.getKey(), entry.getValue()));
                I.b(abstractC1733k, aVarForMapMetadata, entry.getKey(), entry.getValue());
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public final void a(T t10, e0 e0Var, C1737o c1737o) throws Throwable {
        c1737o.getClass();
        q(this.f15572n, this.f15573o, t10, e0Var, c1737o);
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public final int b(AbstractC1723a abstractC1723a) {
        return this.f15567h ? m(abstractC1723a) : l(abstractC1723a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    @Override // androidx.datastore.preferences.protobuf.f0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(androidx.datastore.preferences.protobuf.AbstractC1744w r11, androidx.datastore.preferences.protobuf.AbstractC1744w r12) {
        /*
            Method dump skipped, instructions count: 612
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.T.c(androidx.datastore.preferences.protobuf.w, androidx.datastore.preferences.protobuf.w):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e1 A[PHI: r3
  0x00e1: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:83:0x0216, B:41:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.datastore.preferences.protobuf.f0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int d(androidx.datastore.preferences.protobuf.AbstractC1744w r12) {
        /*
            Method dump skipped, instructions count: 812
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.T.d(androidx.datastore.preferences.protobuf.w):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:184:0x059c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006a  */
    @Override // androidx.datastore.preferences.protobuf.f0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(T r19, androidx.datastore.preferences.protobuf.t0 r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 3388
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.T.e(java.lang.Object, androidx.datastore.preferences.protobuf.t0):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    @Override // androidx.datastore.preferences.protobuf.f0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean f(androidx.datastore.preferences.protobuf.AbstractC1744w r12, androidx.datastore.preferences.protobuf.AbstractC1744w r13) {
        /*
            Method dump skipped, instructions count: 680
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.T.f(androidx.datastore.preferences.protobuf.w, androidx.datastore.preferences.protobuf.w):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean g(AbstractC1744w abstractC1744w, AbstractC1744w abstractC1744w2, int i) {
        return n(abstractC1744w, i) == n(abstractC1744w2, i);
    }

    public final <UT, UB> UB h(Object obj, int i, UB ub, k0<UT, UB> k0Var) {
        C1746y.b bVarI;
        int i10 = this.f15560a[i];
        Object objI = o0.f15681d.i(obj, I(i) & 1048575);
        if (objI == null || (bVarI = i(i)) == null) {
            return ub;
        }
        K k10 = this.f15574p;
        J jForMutableMapData = k10.forMutableMapData(objI);
        I.a<?, ?> aVarForMapMetadata = k10.forMapMetadata(j(i));
        Iterator it = jForMutableMapData.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            ((Integer) entry.getValue()).getClass();
            if (!bVarI.a()) {
                if (ub == null) {
                    ub = (UB) k0Var.m();
                }
                int iA = I.a(aVarForMapMetadata, entry.getKey(), entry.getValue());
                byte[] bArr = new byte[iA];
                Logger logger = AbstractC1733k.f15650b;
                AbstractC1733k.b bVar = new AbstractC1733k.b(bArr, iA);
                try {
                    I.b(bVar, aVarForMapMetadata, entry.getKey(), entry.getValue());
                    if (bVar.f15657e - bVar.f15658f != 0) {
                        throw new IllegalStateException("Did not write as much data as expected.");
                    }
                    k0Var.d(ub, i10, new AbstractC1730h.e(bArr));
                    it.remove();
                } catch (IOException e4) {
                    throw new RuntimeException(e4);
                }
            }
        }
        return ub;
    }

    public final C1746y.b i(int i) {
        return (C1746y.b) this.f15561b[((i / 3) * 2) + 1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0049  */
    /* JADX WARN: Type inference failed for: r4v3, types: [androidx.datastore.preferences.protobuf.f0] */
    /* JADX WARN: Type inference failed for: r4v5, types: [androidx.datastore.preferences.protobuf.f0] */
    /* JADX WARN: Type inference failed for: r4v6, types: [androidx.datastore.preferences.protobuf.f0] */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26, types: [androidx.datastore.preferences.protobuf.f0] */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v30 */
    @Override // androidx.datastore.preferences.protobuf.f0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean isInitialized(T r15) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.T.isInitialized(java.lang.Object):boolean");
    }

    public final Object j(int i) {
        return this.f15561b[(i / 3) * 2];
    }

    public final f0 k(int i) {
        int i10 = (i / 3) * 2;
        Object[] objArr = this.f15561b;
        f0 f0Var = (f0) objArr[i10];
        if (f0Var != null) {
            return f0Var;
        }
        f0<T> f0VarA = b0.f15581c.a((Class) objArr[i10 + 1]);
        objArr[i10] = f0VarA;
        return f0VarA;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int l(AbstractC1723a abstractC1723a) {
        int i;
        int iJ;
        int iM;
        int iJ2;
        int iG;
        int iE;
        int iJ3;
        int i10;
        int iB;
        int iJ4;
        int iF;
        Unsafe unsafe = f15559r;
        int i11 = -1;
        int i12 = 0;
        int iP = 0;
        int i13 = 0;
        while (true) {
            int[] iArr = this.f15560a;
            if (i12 < iArr.length) {
                int I10 = I(i12);
                int i14 = iArr[i12];
                int iH = H(I10);
                if (iH <= 17) {
                    int i15 = iArr[i12 + 2];
                    int i16 = i15 & 1048575;
                    i = 1 << (i15 >>> 20);
                    if (i16 != i11) {
                        i13 = unsafe.getInt(abstractC1723a, i16);
                        i11 = i16;
                    }
                } else {
                    i = 0;
                }
                long j4 = I10 & 1048575;
                switch (iH) {
                    case 0:
                        if ((i & i13) != 0) {
                            iP = G8.p(i14, 8, iP);
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if ((i13 & i) != 0) {
                            iP = G8.p(i14, 4, iP);
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if ((i13 & i) != 0) {
                            long j10 = unsafe.getLong(abstractC1723a, j4);
                            iJ = AbstractC1733k.j(i14);
                            iM = AbstractC1733k.m(j10);
                            iJ4 = iM + iJ;
                            iP += iJ4;
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if ((i13 & i) != 0) {
                            long j11 = unsafe.getLong(abstractC1723a, j4);
                            iJ = AbstractC1733k.j(i14);
                            iM = AbstractC1733k.m(j11);
                            iJ4 = iM + iJ;
                            iP += iJ4;
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if ((i13 & i) != 0) {
                            int i17 = unsafe.getInt(abstractC1723a, j4);
                            iJ2 = AbstractC1733k.j(i14);
                            iG = AbstractC1733k.g(i17);
                            iE = iG + iJ2;
                            iP += iE;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if ((i13 & i) != 0) {
                            iE = AbstractC1733k.e(i14);
                            iP += iE;
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if ((i13 & i) != 0) {
                            iE = AbstractC1733k.d(i14);
                            iP += iE;
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if ((i13 & i) != 0) {
                            iP = G8.p(i14, 1, iP);
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if ((i13 & i) == 0) {
                            break;
                        } else {
                            Object object = unsafe.getObject(abstractC1723a, j4);
                            if (object instanceof AbstractC1730h) {
                                iB = AbstractC1733k.b(i14, (AbstractC1730h) object);
                                iP = iB + iP;
                                break;
                            } else {
                                iJ3 = AbstractC1733k.j(i14);
                                i10 = AbstractC1733k.i((String) object);
                                iB = i10 + iJ3;
                                iP = iB + iP;
                            }
                        }
                    case 9:
                        if ((i13 & i) != 0) {
                            iE = g0.l(i14, unsafe.getObject(abstractC1723a, j4), k(i12));
                            iP += iE;
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if ((i13 & i) != 0) {
                            iE = AbstractC1733k.b(i14, (AbstractC1730h) unsafe.getObject(abstractC1723a, j4));
                            iP += iE;
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if ((i13 & i) != 0) {
                            iE = AbstractC1733k.k(i14, unsafe.getInt(abstractC1723a, j4));
                            iP += iE;
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if ((i13 & i) != 0) {
                            int i18 = unsafe.getInt(abstractC1723a, j4);
                            iJ2 = AbstractC1733k.j(i14);
                            iG = AbstractC1733k.g(i18);
                            iE = iG + iJ2;
                            iP += iE;
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if ((i13 & i) != 0) {
                            iP = G8.p(i14, 4, iP);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if ((i & i13) != 0) {
                            iP = G8.p(i14, 8, iP);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if ((i13 & i) != 0) {
                            int i19 = unsafe.getInt(abstractC1723a, j4);
                            iJ2 = AbstractC1733k.j(i14);
                            iG = AbstractC1733k.l((i19 >> 31) ^ (i19 << 1));
                            iE = iG + iJ2;
                            iP += iE;
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if ((i13 & i) != 0) {
                            long j12 = unsafe.getLong(abstractC1723a, j4);
                            iJ = AbstractC1733k.j(i14);
                            iM = AbstractC1733k.m((j12 >> 63) ^ (j12 << 1));
                            iJ4 = iM + iJ;
                            iP += iJ4;
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if ((i13 & i) != 0) {
                            iE = AbstractC1733k.f(i14, (P) unsafe.getObject(abstractC1723a, j4), k(i12));
                            iP += iE;
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        iE = g0.f(i14, (List) unsafe.getObject(abstractC1723a, j4));
                        iP += iE;
                        break;
                    case 19:
                        iE = g0.d(i14, (List) unsafe.getObject(abstractC1723a, j4));
                        iP += iE;
                        break;
                    case 20:
                        iE = g0.j(i14, (List) unsafe.getObject(abstractC1723a, j4));
                        iP += iE;
                        break;
                    case 21:
                        iE = g0.u(i14, (List) unsafe.getObject(abstractC1723a, j4));
                        iP += iE;
                        break;
                    case 22:
                        iE = g0.h(i14, (List) unsafe.getObject(abstractC1723a, j4));
                        iP += iE;
                        break;
                    case 23:
                        iE = g0.f(i14, (List) unsafe.getObject(abstractC1723a, j4));
                        iP += iE;
                        break;
                    case 24:
                        iE = g0.d(i14, (List) unsafe.getObject(abstractC1723a, j4));
                        iP += iE;
                        break;
                    case 25:
                        List list = (List) unsafe.getObject(abstractC1723a, j4);
                        Class<?> cls = g0.f15599a;
                        int size = list.size();
                        iJ4 = size == 0 ? 0 : (AbstractC1733k.j(i14) + 1) * size;
                        iP += iJ4;
                        break;
                    case 26:
                        iE = g0.r(i14, (List) unsafe.getObject(abstractC1723a, j4));
                        iP += iE;
                        break;
                    case 27:
                        iE = g0.m(i14, (List) unsafe.getObject(abstractC1723a, j4), k(i12));
                        iP += iE;
                        break;
                    case 28:
                        iE = g0.a(i14, (List) unsafe.getObject(abstractC1723a, j4));
                        iP += iE;
                        break;
                    case 29:
                        iE = g0.s(i14, (List) unsafe.getObject(abstractC1723a, j4));
                        iP += iE;
                        break;
                    case 30:
                        iE = g0.b(i14, (List) unsafe.getObject(abstractC1723a, j4));
                        iP += iE;
                        break;
                    case 31:
                        iE = g0.d(i14, (List) unsafe.getObject(abstractC1723a, j4));
                        iP += iE;
                        break;
                    case 32:
                        iE = g0.f(i14, (List) unsafe.getObject(abstractC1723a, j4));
                        iP += iE;
                        break;
                    case 33:
                        iE = g0.n(i14, (List) unsafe.getObject(abstractC1723a, j4));
                        iP += iE;
                        break;
                    case 34:
                        iE = g0.p(i14, (List) unsafe.getObject(abstractC1723a, j4));
                        iP += iE;
                        break;
                    case 35:
                        int iG2 = g0.g((List) unsafe.getObject(abstractC1723a, j4));
                        if (iG2 > 0) {
                            iP = C1154e9.c(iG2, AbstractC1733k.j(i14), iG2, iP);
                            break;
                        } else {
                            break;
                        }
                    case 36:
                        int iE2 = g0.e((List) unsafe.getObject(abstractC1723a, j4));
                        if (iE2 > 0) {
                            iP = C1154e9.c(iE2, AbstractC1733k.j(i14), iE2, iP);
                            break;
                        } else {
                            break;
                        }
                    case 37:
                        int iK = g0.k((List) unsafe.getObject(abstractC1723a, j4));
                        if (iK > 0) {
                            iP = C1154e9.c(iK, AbstractC1733k.j(i14), iK, iP);
                            break;
                        } else {
                            break;
                        }
                    case 38:
                        int iV = g0.v((List) unsafe.getObject(abstractC1723a, j4));
                        if (iV > 0) {
                            iP = C1154e9.c(iV, AbstractC1733k.j(i14), iV, iP);
                            break;
                        } else {
                            break;
                        }
                    case 39:
                        int i20 = g0.i((List) unsafe.getObject(abstractC1723a, j4));
                        if (i20 > 0) {
                            iP = C1154e9.c(i20, AbstractC1733k.j(i14), i20, iP);
                            break;
                        } else {
                            break;
                        }
                    case 40:
                        int iG3 = g0.g((List) unsafe.getObject(abstractC1723a, j4));
                        if (iG3 > 0) {
                            iP = C1154e9.c(iG3, AbstractC1733k.j(i14), iG3, iP);
                            break;
                        } else {
                            break;
                        }
                    case 41:
                        int iE3 = g0.e((List) unsafe.getObject(abstractC1723a, j4));
                        if (iE3 > 0) {
                            iP = C1154e9.c(iE3, AbstractC1733k.j(i14), iE3, iP);
                            break;
                        } else {
                            break;
                        }
                    case 42:
                        List list2 = (List) unsafe.getObject(abstractC1723a, j4);
                        Class<?> cls2 = g0.f15599a;
                        int size2 = list2.size();
                        if (size2 > 0) {
                            iP = C1154e9.c(size2, AbstractC1733k.j(i14), size2, iP);
                            break;
                        } else {
                            break;
                        }
                    case 43:
                        int iT = g0.t((List) unsafe.getObject(abstractC1723a, j4));
                        if (iT > 0) {
                            iP = C1154e9.c(iT, AbstractC1733k.j(i14), iT, iP);
                            break;
                        } else {
                            break;
                        }
                    case 44:
                        int iC = g0.c((List) unsafe.getObject(abstractC1723a, j4));
                        if (iC > 0) {
                            iP = C1154e9.c(iC, AbstractC1733k.j(i14), iC, iP);
                            break;
                        } else {
                            break;
                        }
                    case 45:
                        int iE4 = g0.e((List) unsafe.getObject(abstractC1723a, j4));
                        if (iE4 > 0) {
                            iP = C1154e9.c(iE4, AbstractC1733k.j(i14), iE4, iP);
                            break;
                        } else {
                            break;
                        }
                    case 46:
                        int iG4 = g0.g((List) unsafe.getObject(abstractC1723a, j4));
                        if (iG4 > 0) {
                            iP = C1154e9.c(iG4, AbstractC1733k.j(i14), iG4, iP);
                            break;
                        } else {
                            break;
                        }
                    case 47:
                        int iO = g0.o((List) unsafe.getObject(abstractC1723a, j4));
                        if (iO > 0) {
                            iP = C1154e9.c(iO, AbstractC1733k.j(i14), iO, iP);
                            break;
                        } else {
                            break;
                        }
                    case 48:
                        int iQ = g0.q((List) unsafe.getObject(abstractC1723a, j4));
                        if (iQ > 0) {
                            iP = C1154e9.c(iQ, AbstractC1733k.j(i14), iQ, iP);
                            break;
                        } else {
                            break;
                        }
                    case 49:
                        List list3 = (List) unsafe.getObject(abstractC1723a, j4);
                        f0 f0VarK = k(i12);
                        Class<?> cls3 = g0.f15599a;
                        int size3 = list3.size();
                        if (size3 == 0) {
                            iF = 0;
                        } else {
                            iF = 0;
                            for (int i21 = 0; i21 < size3; i21++) {
                                iF += AbstractC1733k.f(i14, (P) list3.get(i21), f0VarK);
                            }
                        }
                        iP += iF;
                        break;
                    case 50:
                        iE = this.f15574p.getSerializedSize(i14, unsafe.getObject(abstractC1723a, j4), j(i12));
                        iP += iE;
                        break;
                    case 51:
                        if (o(abstractC1723a, i14, i12)) {
                            iP = G8.p(i14, 8, iP);
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (o(abstractC1723a, i14, i12)) {
                            iP = G8.p(i14, 4, iP);
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (o(abstractC1723a, i14, i12)) {
                            long jY = y(abstractC1723a, j4);
                            iJ = AbstractC1733k.j(i14);
                            iM = AbstractC1733k.m(jY);
                            iJ4 = iM + iJ;
                            iP += iJ4;
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (o(abstractC1723a, i14, i12)) {
                            long jY2 = y(abstractC1723a, j4);
                            iJ = AbstractC1733k.j(i14);
                            iM = AbstractC1733k.m(jY2);
                            iJ4 = iM + iJ;
                            iP += iJ4;
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (o(abstractC1723a, i14, i12)) {
                            int iX = x(abstractC1723a, j4);
                            iJ2 = AbstractC1733k.j(i14);
                            iG = AbstractC1733k.g(iX);
                            iE = iG + iJ2;
                            iP += iE;
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (o(abstractC1723a, i14, i12)) {
                            iE = AbstractC1733k.e(i14);
                            iP += iE;
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (o(abstractC1723a, i14, i12)) {
                            iE = AbstractC1733k.d(i14);
                            iP += iE;
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (o(abstractC1723a, i14, i12)) {
                            iP = G8.p(i14, 1, iP);
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (!o(abstractC1723a, i14, i12)) {
                            break;
                        } else {
                            Object object2 = unsafe.getObject(abstractC1723a, j4);
                            if (object2 instanceof AbstractC1730h) {
                                iB = AbstractC1733k.b(i14, (AbstractC1730h) object2);
                                iP = iB + iP;
                                break;
                            } else {
                                iJ3 = AbstractC1733k.j(i14);
                                i10 = AbstractC1733k.i((String) object2);
                                iB = i10 + iJ3;
                                iP = iB + iP;
                            }
                        }
                    case 60:
                        if (o(abstractC1723a, i14, i12)) {
                            iE = g0.l(i14, unsafe.getObject(abstractC1723a, j4), k(i12));
                            iP += iE;
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (o(abstractC1723a, i14, i12)) {
                            iE = AbstractC1733k.b(i14, (AbstractC1730h) unsafe.getObject(abstractC1723a, j4));
                            iP += iE;
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (o(abstractC1723a, i14, i12)) {
                            iE = AbstractC1733k.k(i14, x(abstractC1723a, j4));
                            iP += iE;
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (o(abstractC1723a, i14, i12)) {
                            int iX2 = x(abstractC1723a, j4);
                            iJ2 = AbstractC1733k.j(i14);
                            iG = AbstractC1733k.g(iX2);
                            iE = iG + iJ2;
                            iP += iE;
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (o(abstractC1723a, i14, i12)) {
                            iP = G8.p(i14, 4, iP);
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (o(abstractC1723a, i14, i12)) {
                            iP = G8.p(i14, 8, iP);
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (o(abstractC1723a, i14, i12)) {
                            int iX3 = x(abstractC1723a, j4);
                            iJ2 = AbstractC1733k.j(i14);
                            iG = AbstractC1733k.l((iX3 >> 31) ^ (iX3 << 1));
                            iE = iG + iJ2;
                            iP += iE;
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (o(abstractC1723a, i14, i12)) {
                            long jY3 = y(abstractC1723a, j4);
                            iJ = AbstractC1733k.j(i14);
                            iM = AbstractC1733k.m((jY3 >> 63) ^ (jY3 << 1));
                            iJ4 = iM + iJ;
                            iP += iJ4;
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (o(abstractC1723a, i14, i12)) {
                            iE = AbstractC1733k.f(i14, (P) unsafe.getObject(abstractC1723a, j4), k(i12));
                            iP += iE;
                            break;
                        } else {
                            break;
                        }
                }
                i12 += 3;
            } else {
                k0<?, ?> k0Var = this.f15572n;
                int iH2 = k0Var.h(k0Var.g(abstractC1723a)) + iP;
                if (!this.f15565f) {
                    return iH2;
                }
                C1740s<T> c1740sC = this.f15573o.c(abstractC1723a);
                int i22 = 0;
                int iC2 = 0;
                while (true) {
                    h0 h0Var = c1740sC.f15692a;
                    if (i22 >= h0Var.f15625c.size()) {
                        for (Map.Entry<Object, Object> entry : h0Var.e()) {
                            iC2 += C1740s.c((C1740s.b) entry.getKey(), entry.getValue());
                        }
                        return iH2 + iC2;
                    }
                    Map.Entry<Object, Object> entryD = h0Var.d(i22);
                    iC2 += C1740s.c((C1740s.b) entryD.getKey(), entryD.getValue());
                    i22++;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int m(AbstractC1723a abstractC1723a) {
        int iJ;
        int iM;
        int iJ2;
        int iG;
        int iE;
        int iJ3;
        int i;
        int iB;
        int iJ4;
        int iM2;
        int iF;
        Unsafe unsafe = f15559r;
        int i10 = 0;
        int iP = 0;
        while (true) {
            int[] iArr = this.f15560a;
            if (i10 >= iArr.length) {
                k0<?, ?> k0Var = this.f15572n;
                return k0Var.h(k0Var.g(abstractC1723a)) + iP;
            }
            int I10 = I(i10);
            int iH = H(I10);
            int i11 = iArr[i10];
            long j4 = I10 & 1048575;
            if (iH >= EnumC1741t.DOUBLE_LIST_PACKED.id() && iH <= EnumC1741t.SINT64_LIST_PACKED.id()) {
                int i12 = iArr[i10 + 2];
            }
            switch (iH) {
                case 0:
                    if (n(abstractC1723a, i10)) {
                        iP = G8.p(i11, 8, iP);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (n(abstractC1723a, i10)) {
                        iP = G8.p(i11, 4, iP);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (n(abstractC1723a, i10)) {
                        long jH = o0.f15681d.h(abstractC1723a, j4);
                        iJ = AbstractC1733k.j(i11);
                        iM = AbstractC1733k.m(jH);
                        iE = iM + iJ;
                        iP += iE;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (n(abstractC1723a, i10)) {
                        long jH2 = o0.f15681d.h(abstractC1723a, j4);
                        iJ = AbstractC1733k.j(i11);
                        iM = AbstractC1733k.m(jH2);
                        iE = iM + iJ;
                        iP += iE;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (n(abstractC1723a, i10)) {
                        int iG2 = o0.f15681d.g(abstractC1723a, j4);
                        iJ2 = AbstractC1733k.j(i11);
                        iG = AbstractC1733k.g(iG2);
                        iE = iG + iJ2;
                        iP += iE;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (n(abstractC1723a, i10)) {
                        iE = AbstractC1733k.e(i11);
                        iP += iE;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (n(abstractC1723a, i10)) {
                        iE = AbstractC1733k.d(i11);
                        iP += iE;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (n(abstractC1723a, i10)) {
                        iP = G8.p(i11, 1, iP);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (!n(abstractC1723a, i10)) {
                        break;
                    } else {
                        Object objI = o0.f15681d.i(abstractC1723a, j4);
                        if (objI instanceof AbstractC1730h) {
                            iB = AbstractC1733k.b(i11, (AbstractC1730h) objI);
                            iP = iB + iP;
                            break;
                        } else {
                            iJ3 = AbstractC1733k.j(i11);
                            i = AbstractC1733k.i((String) objI);
                            iB = i + iJ3;
                            iP = iB + iP;
                        }
                    }
                case 9:
                    if (n(abstractC1723a, i10)) {
                        iE = g0.l(i11, o0.f15681d.i(abstractC1723a, j4), k(i10));
                        iP += iE;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (n(abstractC1723a, i10)) {
                        iE = AbstractC1733k.b(i11, (AbstractC1730h) o0.f15681d.i(abstractC1723a, j4));
                        iP += iE;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (n(abstractC1723a, i10)) {
                        iE = AbstractC1733k.k(i11, o0.f15681d.g(abstractC1723a, j4));
                        iP += iE;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (n(abstractC1723a, i10)) {
                        int iG3 = o0.f15681d.g(abstractC1723a, j4);
                        iJ2 = AbstractC1733k.j(i11);
                        iG = AbstractC1733k.g(iG3);
                        iE = iG + iJ2;
                        iP += iE;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (n(abstractC1723a, i10)) {
                        iP = G8.p(i11, 4, iP);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (n(abstractC1723a, i10)) {
                        iP = G8.p(i11, 8, iP);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (n(abstractC1723a, i10)) {
                        int iG4 = o0.f15681d.g(abstractC1723a, j4);
                        iJ2 = AbstractC1733k.j(i11);
                        iG = AbstractC1733k.l((iG4 >> 31) ^ (iG4 << 1));
                        iE = iG + iJ2;
                        iP += iE;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (n(abstractC1723a, i10)) {
                        long jH3 = o0.f15681d.h(abstractC1723a, j4);
                        iJ4 = AbstractC1733k.j(i11);
                        iM2 = AbstractC1733k.m((jH3 >> 63) ^ (jH3 << 1));
                        iE = iM2 + iJ4;
                        iP += iE;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (n(abstractC1723a, i10)) {
                        iE = AbstractC1733k.f(i11, (P) o0.f15681d.i(abstractC1723a, j4), k(i10));
                        iP += iE;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    iE = g0.f(i11, p(abstractC1723a, j4));
                    iP += iE;
                    break;
                case 19:
                    iE = g0.d(i11, p(abstractC1723a, j4));
                    iP += iE;
                    break;
                case 20:
                    iE = g0.j(i11, p(abstractC1723a, j4));
                    iP += iE;
                    break;
                case 21:
                    iE = g0.u(i11, p(abstractC1723a, j4));
                    iP += iE;
                    break;
                case 22:
                    iE = g0.h(i11, p(abstractC1723a, j4));
                    iP += iE;
                    break;
                case 23:
                    iE = g0.f(i11, p(abstractC1723a, j4));
                    iP += iE;
                    break;
                case 24:
                    iE = g0.d(i11, p(abstractC1723a, j4));
                    iP += iE;
                    break;
                case 25:
                    List listP = p(abstractC1723a, j4);
                    Class<?> cls = g0.f15599a;
                    int size = listP.size();
                    iP += size == 0 ? 0 : (AbstractC1733k.j(i11) + 1) * size;
                    break;
                case 26:
                    iE = g0.r(i11, p(abstractC1723a, j4));
                    iP += iE;
                    break;
                case 27:
                    iE = g0.m(i11, p(abstractC1723a, j4), k(i10));
                    iP += iE;
                    break;
                case 28:
                    iE = g0.a(i11, p(abstractC1723a, j4));
                    iP += iE;
                    break;
                case 29:
                    iE = g0.s(i11, p(abstractC1723a, j4));
                    iP += iE;
                    break;
                case 30:
                    iE = g0.b(i11, p(abstractC1723a, j4));
                    iP += iE;
                    break;
                case 31:
                    iE = g0.d(i11, p(abstractC1723a, j4));
                    iP += iE;
                    break;
                case 32:
                    iE = g0.f(i11, p(abstractC1723a, j4));
                    iP += iE;
                    break;
                case 33:
                    iE = g0.n(i11, p(abstractC1723a, j4));
                    iP += iE;
                    break;
                case 34:
                    iE = g0.p(i11, p(abstractC1723a, j4));
                    iP += iE;
                    break;
                case 35:
                    int iG5 = g0.g((List) unsafe.getObject(abstractC1723a, j4));
                    if (iG5 > 0) {
                        iP = C1154e9.c(iG5, AbstractC1733k.j(i11), iG5, iP);
                        break;
                    } else {
                        break;
                    }
                case 36:
                    int iE2 = g0.e((List) unsafe.getObject(abstractC1723a, j4));
                    if (iE2 > 0) {
                        iP = C1154e9.c(iE2, AbstractC1733k.j(i11), iE2, iP);
                        break;
                    } else {
                        break;
                    }
                case 37:
                    int iK = g0.k((List) unsafe.getObject(abstractC1723a, j4));
                    if (iK > 0) {
                        iP = C1154e9.c(iK, AbstractC1733k.j(i11), iK, iP);
                        break;
                    } else {
                        break;
                    }
                case 38:
                    int iV = g0.v((List) unsafe.getObject(abstractC1723a, j4));
                    if (iV > 0) {
                        iP = C1154e9.c(iV, AbstractC1733k.j(i11), iV, iP);
                        break;
                    } else {
                        break;
                    }
                case 39:
                    int i13 = g0.i((List) unsafe.getObject(abstractC1723a, j4));
                    if (i13 > 0) {
                        iP = C1154e9.c(i13, AbstractC1733k.j(i11), i13, iP);
                        break;
                    } else {
                        break;
                    }
                case 40:
                    int iG6 = g0.g((List) unsafe.getObject(abstractC1723a, j4));
                    if (iG6 > 0) {
                        iP = C1154e9.c(iG6, AbstractC1733k.j(i11), iG6, iP);
                        break;
                    } else {
                        break;
                    }
                case 41:
                    int iE3 = g0.e((List) unsafe.getObject(abstractC1723a, j4));
                    if (iE3 > 0) {
                        iP = C1154e9.c(iE3, AbstractC1733k.j(i11), iE3, iP);
                        break;
                    } else {
                        break;
                    }
                case 42:
                    List list = (List) unsafe.getObject(abstractC1723a, j4);
                    Class<?> cls2 = g0.f15599a;
                    int size2 = list.size();
                    if (size2 > 0) {
                        iP = C1154e9.c(size2, AbstractC1733k.j(i11), size2, iP);
                        break;
                    } else {
                        break;
                    }
                case 43:
                    int iT = g0.t((List) unsafe.getObject(abstractC1723a, j4));
                    if (iT > 0) {
                        iP = C1154e9.c(iT, AbstractC1733k.j(i11), iT, iP);
                        break;
                    } else {
                        break;
                    }
                case 44:
                    int iC = g0.c((List) unsafe.getObject(abstractC1723a, j4));
                    if (iC > 0) {
                        iP = C1154e9.c(iC, AbstractC1733k.j(i11), iC, iP);
                        break;
                    } else {
                        break;
                    }
                case 45:
                    int iE4 = g0.e((List) unsafe.getObject(abstractC1723a, j4));
                    if (iE4 > 0) {
                        iP = C1154e9.c(iE4, AbstractC1733k.j(i11), iE4, iP);
                        break;
                    } else {
                        break;
                    }
                case 46:
                    int iG7 = g0.g((List) unsafe.getObject(abstractC1723a, j4));
                    if (iG7 > 0) {
                        iP = C1154e9.c(iG7, AbstractC1733k.j(i11), iG7, iP);
                        break;
                    } else {
                        break;
                    }
                case 47:
                    int iO = g0.o((List) unsafe.getObject(abstractC1723a, j4));
                    if (iO > 0) {
                        iP = C1154e9.c(iO, AbstractC1733k.j(i11), iO, iP);
                        break;
                    } else {
                        break;
                    }
                case 48:
                    int iQ = g0.q((List) unsafe.getObject(abstractC1723a, j4));
                    if (iQ > 0) {
                        iP = C1154e9.c(iQ, AbstractC1733k.j(i11), iQ, iP);
                        break;
                    } else {
                        break;
                    }
                case 49:
                    List listP2 = p(abstractC1723a, j4);
                    f0 f0VarK = k(i10);
                    Class<?> cls3 = g0.f15599a;
                    int size3 = listP2.size();
                    if (size3 == 0) {
                        iF = 0;
                    } else {
                        iF = 0;
                        for (int i14 = 0; i14 < size3; i14++) {
                            iF += AbstractC1733k.f(i11, (P) listP2.get(i14), f0VarK);
                        }
                    }
                    iP += iF;
                    break;
                case 50:
                    iE = this.f15574p.getSerializedSize(i11, o0.f15681d.i(abstractC1723a, j4), j(i10));
                    iP += iE;
                    break;
                case 51:
                    if (o(abstractC1723a, i11, i10)) {
                        iP = G8.p(i11, 8, iP);
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (o(abstractC1723a, i11, i10)) {
                        iP = G8.p(i11, 4, iP);
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (o(abstractC1723a, i11, i10)) {
                        long jY = y(abstractC1723a, j4);
                        iJ = AbstractC1733k.j(i11);
                        iM = AbstractC1733k.m(jY);
                        iE = iM + iJ;
                        iP += iE;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (o(abstractC1723a, i11, i10)) {
                        long jY2 = y(abstractC1723a, j4);
                        iJ = AbstractC1733k.j(i11);
                        iM = AbstractC1733k.m(jY2);
                        iE = iM + iJ;
                        iP += iE;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (o(abstractC1723a, i11, i10)) {
                        int iX = x(abstractC1723a, j4);
                        iJ2 = AbstractC1733k.j(i11);
                        iG = AbstractC1733k.g(iX);
                        iE = iG + iJ2;
                        iP += iE;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (o(abstractC1723a, i11, i10)) {
                        iE = AbstractC1733k.e(i11);
                        iP += iE;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (o(abstractC1723a, i11, i10)) {
                        iE = AbstractC1733k.d(i11);
                        iP += iE;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (o(abstractC1723a, i11, i10)) {
                        iP = G8.p(i11, 1, iP);
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (!o(abstractC1723a, i11, i10)) {
                        break;
                    } else {
                        Object objI2 = o0.f15681d.i(abstractC1723a, j4);
                        if (objI2 instanceof AbstractC1730h) {
                            iB = AbstractC1733k.b(i11, (AbstractC1730h) objI2);
                            iP = iB + iP;
                            break;
                        } else {
                            iJ3 = AbstractC1733k.j(i11);
                            i = AbstractC1733k.i((String) objI2);
                            iB = i + iJ3;
                            iP = iB + iP;
                        }
                    }
                case 60:
                    if (o(abstractC1723a, i11, i10)) {
                        iE = g0.l(i11, o0.f15681d.i(abstractC1723a, j4), k(i10));
                        iP += iE;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (o(abstractC1723a, i11, i10)) {
                        iE = AbstractC1733k.b(i11, (AbstractC1730h) o0.f15681d.i(abstractC1723a, j4));
                        iP += iE;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (o(abstractC1723a, i11, i10)) {
                        iE = AbstractC1733k.k(i11, x(abstractC1723a, j4));
                        iP += iE;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (o(abstractC1723a, i11, i10)) {
                        int iX2 = x(abstractC1723a, j4);
                        iJ2 = AbstractC1733k.j(i11);
                        iG = AbstractC1733k.g(iX2);
                        iE = iG + iJ2;
                        iP += iE;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (o(abstractC1723a, i11, i10)) {
                        iP = G8.p(i11, 4, iP);
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (o(abstractC1723a, i11, i10)) {
                        iP = G8.p(i11, 8, iP);
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (o(abstractC1723a, i11, i10)) {
                        int iX3 = x(abstractC1723a, j4);
                        iJ2 = AbstractC1733k.j(i11);
                        iG = AbstractC1733k.l((iX3 >> 31) ^ (iX3 << 1));
                        iE = iG + iJ2;
                        iP += iE;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (o(abstractC1723a, i11, i10)) {
                        long jY3 = y(abstractC1723a, j4);
                        iJ4 = AbstractC1733k.j(i11);
                        iM2 = AbstractC1733k.m((jY3 >> 63) ^ (jY3 << 1));
                        iE = iM2 + iJ4;
                        iP += iE;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (o(abstractC1723a, i11, i10)) {
                        iE = AbstractC1733k.f(i11, (P) o0.f15681d.i(abstractC1723a, j4), k(i10));
                        iP += iE;
                        break;
                    } else {
                        break;
                    }
            }
            i10 += 3;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public final void makeImmutable(T t10) {
        int[] iArr;
        int i;
        int i10 = this.f15568j;
        while (true) {
            iArr = this.i;
            i = this.f15569k;
            if (i10 >= i) {
                break;
            }
            long jI = I(iArr[i10]) & 1048575;
            Object objI = o0.f15681d.i(t10, jI);
            if (objI != null) {
                o0.o(t10, jI, this.f15574p.toImmutable(objI));
            }
            i10++;
        }
        int length = iArr.length;
        while (i < length) {
            this.f15571m.a(t10, iArr[i]);
            i++;
        }
        this.f15572n.j(t10);
        if (this.f15565f) {
            this.f15573o.f(t10);
        }
    }

    public final boolean n(T t10, int i) {
        if (this.f15567h) {
            int I10 = I(i);
            long j4 = I10 & 1048575;
            switch (H(I10)) {
                case 0:
                    if (o0.f15681d.e(t10, j4) == 0.0d) {
                        return false;
                    }
                    break;
                case 1:
                    if (o0.f15681d.f(t10, j4) == 0.0f) {
                        return false;
                    }
                    break;
                case 2:
                    if (o0.f15681d.h(t10, j4) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (o0.f15681d.h(t10, j4) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (o0.f15681d.g(t10, j4) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (o0.f15681d.h(t10, j4) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (o0.f15681d.g(t10, j4) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return o0.f15681d.c(t10, j4);
                case 8:
                    Object objI = o0.f15681d.i(t10, j4);
                    if (objI instanceof String) {
                        return !((String) objI).isEmpty();
                    }
                    if (objI instanceof AbstractC1730h) {
                        return !AbstractC1730h.f15603c.equals(objI);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (o0.f15681d.i(t10, j4) == null) {
                        return false;
                    }
                    break;
                case 10:
                    return !AbstractC1730h.f15603c.equals(o0.f15681d.i(t10, j4));
                case 11:
                    if (o0.f15681d.g(t10, j4) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (o0.f15681d.g(t10, j4) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (o0.f15681d.g(t10, j4) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (o0.f15681d.h(t10, j4) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (o0.f15681d.g(t10, j4) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (o0.f15681d.h(t10, j4) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (o0.f15681d.i(t10, j4) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            if ((o0.f15681d.g(t10, r7 & 1048575) & (1 << (this.f15560a[i + 2] >>> 20))) == 0) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public final T newInstance() {
        return (T) this.f15570l.a(this.f15564e);
    }

    public final boolean o(T t10, int i, int i10) {
        return o0.f15681d.g(t10, (long) (this.f15560a[i10 + 2] & 1048575)) == i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        r19.n(r2, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:?, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0659 A[Catch: all -> 0x04a1, TryCatch #1 {all -> 0x04a1, blocks: (B:175:0x0654, B:177:0x0659, B:178:0x065e, B:133:0x03ea, B:134:0x03ef, B:135:0x0400, B:136:0x0411, B:137:0x0422, B:138:0x0433, B:139:0x0444, B:140:0x0455, B:141:0x0466, B:142:0x0477, B:144:0x0482, B:147:0x04a4, B:148:0x04b8, B:149:0x04cd, B:150:0x04e2, B:151:0x04f7, B:152:0x050c, B:154:0x051b, B:157:0x0522, B:158:0x0528, B:159:0x0534, B:160:0x0549, B:161:0x055e, B:163:0x0569, B:164:0x0588, B:165:0x059c, B:166:0x05a9, B:167:0x05c0, B:168:0x05d5, B:169:0x05ea, B:170:0x05ff, B:171:0x0614, B:172:0x0628, B:173:0x063e), top: B:195:0x0654 }] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x067e A[LOOP:3: B:186:0x067c->B:187:0x067e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0689  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0664 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <UT, UB, ET extends androidx.datastore.preferences.protobuf.C1740s.b<ET>> void q(androidx.datastore.preferences.protobuf.k0<UT, UB> r19, androidx.datastore.preferences.protobuf.AbstractC1738p<ET> r20, T r21, androidx.datastore.preferences.protobuf.e0 r22, androidx.datastore.preferences.protobuf.C1737o r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1820
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.T.q(androidx.datastore.preferences.protobuf.k0, androidx.datastore.preferences.protobuf.p, java.lang.Object, androidx.datastore.preferences.protobuf.e0, androidx.datastore.preferences.protobuf.o):void");
    }

    public final <K, V> void r(Object obj, int i, Object obj2, C1737o c1737o, e0 e0Var) throws IOException {
        long jI = I(i) & 1048575;
        Object objI = o0.f15681d.i(obj, jI);
        K k10 = this.f15574p;
        if (objI == null) {
            objI = k10.a();
            o0.o(obj, jI, objI);
        } else if (k10.isImmutable(objI)) {
            J jA = k10.a();
            k10.mergeFrom(jA, objI);
            o0.o(obj, jI, jA);
            objI = jA;
        }
        e0Var.b(k10.forMutableMapData(objI), k10.forMapMetadata(obj2), c1737o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void s(AbstractC1744w abstractC1744w, AbstractC1744w abstractC1744w2, int i) {
        long jI = I(i) & 1048575;
        if (n(abstractC1744w2, i)) {
            o0.e eVar = o0.f15681d;
            Object objI = eVar.i(abstractC1744w, jI);
            Object objI2 = eVar.i(abstractC1744w2, jI);
            if (objI != null && objI2 != null) {
                o0.o(abstractC1744w, jI, C1746y.c(objI, objI2));
                F(abstractC1744w, i);
            } else if (objI2 != null) {
                o0.o(abstractC1744w, jI, objI2);
                F(abstractC1744w, i);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void t(AbstractC1744w abstractC1744w, AbstractC1744w abstractC1744w2, int i) {
        int I10 = I(i);
        int i10 = this.f15560a[i];
        long j4 = I10 & 1048575;
        if (o(abstractC1744w2, i10, i)) {
            o0.e eVar = o0.f15681d;
            Object objI = eVar.i(abstractC1744w, j4);
            Object objI2 = eVar.i(abstractC1744w2, j4);
            if (objI != null && objI2 != null) {
                o0.o(abstractC1744w, j4, C1746y.c(objI, objI2));
                G(abstractC1744w, i10, i);
            } else if (objI2 != null) {
                o0.o(abstractC1744w, j4, objI2);
                G(abstractC1744w, i10, i);
            }
        }
    }

    public final int z(int i) {
        if (i >= this.f15562c && i <= this.f15563d) {
            int[] iArr = this.f15560a;
            int length = (iArr.length / 3) - 1;
            int i10 = 0;
            while (i10 <= length) {
                int i11 = (length + i10) >>> 1;
                int i12 = i11 * 3;
                int i13 = iArr[i12];
                if (i == i13) {
                    return i12;
                }
                if (i < i13) {
                    length = i11 - 1;
                } else {
                    i10 = i11 + 1;
                }
            }
        }
        return -1;
    }
}
