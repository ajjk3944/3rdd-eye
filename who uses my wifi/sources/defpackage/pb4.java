package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import android.view.Display;
import android.view.WindowManager;
import android.view.accessibility.CaptioningManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class pb4 {
    public final Object a;
    public final Object b;
    public final li4[] c;
    public boolean d;
    public boolean e;
    public boolean f;
    public qb4 g;
    public boolean h;
    public final boolean[] i;
    public final kg4[] j;
    public final lj4 k;
    public final uu0 l;
    public pb4 m;
    public ri4 n;
    public pj4 o;
    public long p;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [rg4] */
    public pb4(kg4[] kg4VarArr, long j, lj4 lj4Var, rj4 rj4Var, uu0 uu0Var, qb4 qb4Var, pj4 pj4Var) {
        this.j = kg4VarArr;
        this.p = j;
        this.k = lj4Var;
        this.l = uu0Var;
        kh4 kh4Var = qb4Var.a;
        this.b = kh4Var.a;
        this.g = qb4Var;
        this.n = ri4.d;
        this.o = pj4Var;
        this.c = new li4[2];
        this.i = new boolean[2];
        long j2 = qb4Var.b;
        long j3 = qb4Var.d;
        uu0Var.getClass();
        int i = ic4.k;
        Pair pair = (Pair) kh4Var.a;
        Object obj = pair.first;
        kh4 kh4VarA = kh4Var.a(pair.second);
        bc4 bc4Var = (bc4) ((HashMap) uu0Var.j).get(obj);
        bc4Var.getClass();
        ((HashSet) uu0Var.m).add(bc4Var);
        ac4 ac4Var = (ac4) ((HashMap) uu0Var.l).get(bc4Var);
        if (ac4Var != null) {
            ac4Var.a.o(ac4Var.b);
        }
        bc4Var.c.add(kh4VarA);
        dh4 dh4VarC = bc4Var.a.c(kh4VarA, rj4Var, j2);
        ((IdentityHashMap) uu0Var.i).put(dh4VarC, bc4Var);
        uu0Var.m();
        this.a = j3 != -9223372036854775807L ? new rg4(dh4VarC, j3) : dh4VarC;
    }

    public final long a() {
        return this.g.b + this.p;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, mi4] */
    public final boolean b() {
        if (this.e) {
            return !this.f || this.a.j() == Long.MIN_VALUE;
        }
        return false;
    }

    public final boolean c() {
        if (this.e) {
            return b() || d() - this.g.b >= -9223372036854775807L;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, mi4] */
    public final long d() {
        if (!this.e) {
            return this.g.b;
        }
        long j = this.f ? this.a.j() : Long.MIN_VALUE;
        return j == Long.MIN_VALUE ? this.g.e : j;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, jh4] */
    public final void e(oz1 oz1Var) {
        this.e = true;
        this.n = this.a.l();
        pj4 pj4VarF = f(oz1Var);
        qb4 qb4Var = this.g;
        long jMax = qb4Var.b;
        long j = qb4Var.e;
        if (j != -9223372036854775807L && jMax >= j) {
            jMax = Math.max(0L, j - 1);
        }
        long jG = g(pj4VarF, jMax, false, new boolean[2]);
        long j2 = this.p;
        qb4 qb4Var2 = this.g;
        this.p = (qb4Var2.b - jG) + j2;
        this.g = qb4Var2.a(jG);
    }

    public final pj4 f(oz1 oz1Var) {
        dj4 dj4Var;
        boolean z;
        String str;
        int i;
        Point point;
        String languageTag;
        int i2;
        long j;
        boolean z2;
        int i3;
        boolean z3;
        int[] iArr;
        int length;
        xi4 xi4Var;
        long j2;
        long[][] jArr;
        int[] iArr2;
        Object obj;
        mj4[] mj4VarArr;
        int i4;
        d02 d02Var;
        int i5;
        Context context;
        CaptioningManager captioningManager;
        Locale locale;
        Context context2;
        Point point2;
        Point point3;
        String[] strArrSplit;
        int i6;
        Context context3;
        int[] iArr3;
        ri4 ri4Var = this.n;
        lj4 lj4Var = this.k;
        kg4[] kg4VarArr = this.j;
        lj4Var.getClass();
        int[] iArr4 = new int[3];
        d02[][] d02VarArr = new d02[3][];
        int[][][] iArr5 = new int[3][][];
        for (int i7 = 0; i7 < 3; i7++) {
            int i8 = ri4Var.a;
            d02VarArr[i7] = new d02[i8];
            iArr5[i7] = new int[i8][];
        }
        int i9 = 2;
        int[] iArr6 = new int[2];
        for (int i10 = 0; i10 < 2; i10++) {
            kg4VarArr[i10].getClass();
            iArr6[i10] = 8;
        }
        int i11 = 0;
        while (i11 < ri4Var.a) {
            d02 d02VarA = ri4Var.a(i11);
            int i12 = d02VarA.c;
            ph4[] ph4VarArr = d02VarA.d;
            int i13 = d02VarA.a;
            ri4 ri4Var2 = ri4Var;
            int i14 = i9;
            int i15 = 0;
            int i16 = 0;
            boolean z4 = true;
            while (i15 < i9) {
                kg4 kg4Var = kg4VarArr[i15];
                kg4[] kg4VarArr2 = kg4VarArr;
                int i17 = 0;
                int iMax = 0;
                while (i17 < i13) {
                    int i18 = i17;
                    iMax = Math.max(iMax, kg4Var.J(ph4VarArr[i18]) & 7);
                    i17 = i18 + 1;
                }
                boolean z5 = iArr4[i15] == 0;
                if (iMax > i16) {
                    z4 = z5;
                    i16 = iMax;
                    i14 = i15;
                } else if (iMax == i16 && i12 == 5 && !z4 && z5) {
                    i16 = iMax;
                    i14 = i15;
                    z4 = true;
                }
                i15++;
                kg4VarArr = kg4VarArr2;
                i9 = 2;
            }
            kg4[] kg4VarArr3 = kg4VarArr;
            if (i14 == i9) {
                iArr3 = new int[i13];
            } else {
                kg4 kg4Var2 = kg4VarArr3[i14];
                int[] iArr7 = new int[i13];
                for (int i19 = 0; i19 < i13; i19++) {
                    iArr7[i19] = kg4Var2.J(ph4VarArr[i19]);
                }
                iArr3 = iArr7;
            }
            int i20 = iArr4[i14];
            d02VarArr[i14][i20] = d02VarA;
            iArr5[i14][i20] = iArr3;
            iArr4[i14] = i20 + 1;
            i11++;
            ri4Var = ri4Var2;
            kg4VarArr = kg4VarArr3;
            i9 = 2;
        }
        kg4[] kg4VarArr4 = kg4VarArr;
        int i21 = i9;
        ri4[] ri4VarArr = new ri4[i21];
        String[] strArr = new String[i21];
        int[] iArr8 = new int[i21];
        int i22 = 0;
        while (i22 < i21) {
            int i23 = iArr4[i22];
            ri4VarArr[i22] = new ri4((d02[]) v23.m(d02VarArr[i22], i23));
            iArr5[i22] = (int[][]) v23.m(iArr5[i22], i23);
            strArr[i22] = kg4VarArr4[i22].o();
            iArr8[i22] = kg4VarArr4[i22].g;
            i22++;
            i21 = 2;
        }
        int i24 = i21;
        oj4 oj4Var = new oj4(iArr8, ri4VarArr, iArr6, iArr5, new ri4((d02[]) v23.m(d02VarArr[i24], iArr4[i24])));
        synchronized (lj4Var.c) {
            lj4Var.f = Thread.currentThread();
            dj4Var = lj4Var.e;
        }
        if (lj4Var.i == null && (context3 = lj4Var.d) != null) {
            lj4Var.i = Boolean.valueOf(v23.h(context3));
        }
        if (dj4Var.A && Build.VERSION.SDK_INT >= 32 && lj4Var.g == null) {
            lj4Var.g = new rl(lj4Var.d, lj4Var, lj4Var.i);
        }
        int i25 = 2;
        mj4[] mj4VarArr2 = new mj4[2];
        int i26 = 0;
        while (true) {
            if (i26 >= i25) {
                z = false;
                break;
            }
            if (oj4Var.a[i26] == i25 && oj4Var.b[i26].a > 0) {
                z = true;
                break;
            }
            i26++;
            i25 = 2;
        }
        Pair pairG = lj4.g(1, oj4Var, iArr5, new rl(lj4Var, dj4Var, z, iArr6), bk.k);
        if (pairG != null) {
            mj4VarArr2[((Integer) pairG.second).intValue()] = (mj4) pairG.first;
        }
        if (pairG == null) {
            str = null;
        } else {
            mj4 mj4Var = (mj4) pairG.first;
            str = mj4Var.a.d[mj4Var.b[0]].d;
        }
        dj4Var.q.getClass();
        if (!dj4Var.g || (context2 = lj4Var.d) == null) {
            i = 1;
            point = null;
        } else {
            String str2 = v23.a;
            DisplayManager displayManager = (DisplayManager) context2.getSystemService("display");
            Display display = displayManager != null ? displayManager.getDisplay(0) : null;
            if (display == null) {
                WindowManager windowManager = (WindowManager) context2.getSystemService("window");
                windowManager.getClass();
                display = windowManager.getDefaultDisplay();
            }
            if (display.getDisplayId() == 0 && v23.h(context2)) {
                String strL = Build.VERSION.SDK_INT < 28 ? v23.l("sys.display-size") : v23.l("vendor.display-size");
                if (TextUtils.isEmpty(strL)) {
                    i = 1;
                } else {
                    try {
                        strArrSplit = strL.trim().split("x", -1);
                    } catch (NumberFormatException unused) {
                    }
                    if (strArrSplit.length == 2) {
                        int i27 = Integer.parseInt(strArrSplit[0]);
                        i = 1;
                        try {
                            i6 = Integer.parseInt(strArrSplit[1]);
                        } catch (NumberFormatException unused2) {
                        }
                        if (i27 > 0 && i6 > 0) {
                            point3 = new Point(i27, i6);
                            point = point3;
                        }
                    } else {
                        i = 1;
                    }
                    a30.A("Util", "Invalid display size: ".concat(String.valueOf(strL)));
                }
                if ("Sony".equals(Build.MANUFACTURER) && Build.MODEL.startsWith("BRAVIA") && context2.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                    point2 = new Point(3840, 2160);
                }
                point3 = point2;
                point = point3;
            } else {
                i = 1;
            }
            point2 = new Point();
            Display.Mode mode = display.getMode();
            point2.x = mode.getPhysicalWidth();
            point2.y = mode.getPhysicalHeight();
            point3 = point2;
            point = point3;
        }
        int i28 = i;
        String str3 = str;
        Pair pairG2 = lj4.g(2, oj4Var, iArr5, new mc2(dj4Var, str, iArr6, point, 28, false), bk.n);
        int i29 = 4;
        Pair pairG3 = pairG2 == null ? lj4.g(4, oj4Var, iArr5, new rc3(10, dj4Var), bk.l) : null;
        if (pairG3 != null) {
            mj4VarArr2[((Integer) pairG3.second).intValue()] = (mj4) pairG3.first;
        } else if (pairG2 != null) {
            mj4VarArr2[((Integer) pairG2.second).intValue()] = (mj4) pairG2.first;
        }
        if (!dj4Var.t || (context = lj4Var.d) == null || (captioningManager = (CaptioningManager) context.getSystemService("captioning")) == null || !captioningManager.isEnabled() || (locale = captioningManager.getLocale()) == null) {
            languageTag = null;
        } else {
            String str4 = v23.a;
            languageTag = locale.toLanguageTag();
        }
        Pair pairG4 = lj4.g(3, oj4Var, iArr5, new pb3(dj4Var, str3, languageTag), bk.m);
        if (pairG4 != null) {
            mj4VarArr2[((Integer) pairG4.second).intValue()] = (mj4) pairG4.first;
        }
        int i30 = 0;
        while (i30 < 2) {
            int i31 = oj4Var.a[i30];
            if (i31 == 2 || i31 == i28 || i31 == 3 || i31 == i29) {
                mj4VarArr = mj4VarArr2;
                i4 = i30;
            } else {
                ri4 ri4Var3 = oj4Var.b[i30];
                int[][] iArr9 = iArr5[i30];
                d02 d02Var2 = null;
                int i32 = 0;
                int i33 = 0;
                bj4 bj4Var = null;
                while (i32 < ri4Var3.a) {
                    d02 d02VarA2 = ri4Var3.a(i32);
                    int[] iArr10 = iArr9[i32];
                    bj4 bj4Var2 = bj4Var;
                    int i34 = 0;
                    while (i34 < d02VarA2.a) {
                        mj4[] mj4VarArr3 = mj4VarArr2;
                        if (kg4.I(iArr10[i34], dj4Var.B)) {
                            d02Var = d02VarA2;
                            bj4 bj4Var3 = new bj4(d02VarA2.d[i34], iArr10[i34]);
                            if (bj4Var2 != null) {
                                i5 = i30;
                                if (pm3.a.d(bj4Var3.g, bj4Var2.g).d(bj4Var3.f, bj4Var2.f).e() > 0) {
                                }
                            } else {
                                i5 = i30;
                            }
                            bj4Var2 = bj4Var3;
                            i33 = i34;
                            d02Var2 = d02Var;
                        } else {
                            d02Var = d02VarA2;
                            i5 = i30;
                        }
                        i34++;
                        mj4VarArr2 = mj4VarArr3;
                        d02VarA2 = d02Var;
                        i30 = i5;
                    }
                    i32++;
                    bj4Var = bj4Var2;
                }
                mj4VarArr = mj4VarArr2;
                i4 = i30;
                mj4VarArr[i4] = d02Var2 == null ? null : new mj4(d02Var2, new int[]{i33});
            }
            i30 = i4 + 1;
            mj4VarArr2 = mj4VarArr;
            i28 = 1;
            i29 = 4;
        }
        mj4[] mj4VarArr4 = mj4VarArr2;
        Object obj2 = null;
        HashMap map = new HashMap();
        for (int i35 = 0; i35 < 2; i35++) {
            ri4 ri4Var4 = oj4Var.b[i35];
            for (int i36 = 0; i36 < ri4Var4.a; i36++) {
                if (dj4Var.u.get(ri4Var4.a(i36)) != null) {
                    throw new ClassCastException();
                }
            }
        }
        ri4 ri4Var5 = oj4Var.d;
        for (int i37 = 0; i37 < ri4Var5.a; i37++) {
            if (dj4Var.u.get(ri4Var5.a(i37)) != null) {
                throw new ClassCastException();
            }
        }
        int i38 = 0;
        while (true) {
            int i39 = 2;
            if (i38 >= 2) {
                int i40 = 0;
                while (i40 < i39) {
                    ri4 ri4Var6 = oj4Var.b[i40];
                    Map map2 = (Map) dj4Var.D.get(i40);
                    if (map2 != null && map2.containsKey(ri4Var6)) {
                        Map map3 = (Map) dj4Var.D.get(i40);
                        if (map3 != null && map3.get(ri4Var6) != null) {
                            throw new ClassCastException();
                        }
                        mj4VarArr4[i40] = null;
                    }
                    i40++;
                    i39 = 2;
                }
                int i41 = 0;
                while (i41 < i39) {
                    int i42 = oj4Var.a[i41];
                    if (dj4Var.E.get(i41) || dj4Var.v.contains(Integer.valueOf(i42))) {
                        mj4VarArr4[i41] = null;
                    }
                    i41++;
                    i39 = 2;
                }
                id4 id4Var = lj4Var.j;
                lj4Var.b.getClass();
                ArrayList arrayList = new ArrayList();
                int i43 = 0;
                while (true) {
                    i2 = 2;
                    if (i43 >= 2) {
                        break;
                    }
                    mj4 mj4Var2 = mj4VarArr4[i43];
                    if (mj4Var2 == null || mj4Var2.b.length <= 1) {
                        obj = obj2;
                        arrayList.add(obj);
                    } else {
                        vm3 vm3Var = xm3.g;
                        um3 um3Var = new um3(4);
                        um3Var.a(new wi4(0L, 0L));
                        arrayList.add(um3Var);
                        obj = obj2;
                    }
                    i43++;
                    obj2 = obj;
                }
                long[][] jArr2 = new long[2][];
                int i44 = 0;
                while (true) {
                    j = -1;
                    if (i44 >= i2) {
                        break;
                    }
                    mj4 mj4Var3 = mj4VarArr4[i44];
                    if (mj4Var3 == null) {
                        jArr2[i44] = new long[0];
                    } else {
                        int[] iArr11 = mj4Var3.b;
                        jArr2[i44] = new long[iArr11.length];
                        for (int i45 = 0; i45 < iArr11.length; i45++) {
                            long j3 = mj4Var3.a.d[iArr11[i45]].i;
                            long[] jArr3 = jArr2[i44];
                            if (j3 == -1) {
                                j3 = 0;
                            }
                            jArr3[i45] = j3;
                        }
                        Arrays.sort(jArr2[i44]);
                    }
                    i44++;
                    i2 = 2;
                }
                int[] iArr12 = new int[i2];
                long[] jArr4 = new long[i2];
                int i46 = 0;
                while (i46 < i2) {
                    long[] jArr5 = jArr2[i46];
                    jArr4[i46] = jArr5.length == 0 ? 0L : jArr5[0];
                    i46++;
                    i2 = 2;
                }
                xi4.d(arrayList, jArr4);
                pn3 pn3Var = new pn3(new TreeMap(qn3.g), new wc());
                int i47 = 0;
                while (i47 < 2) {
                    int length2 = jArr2[i47].length;
                    if (length2 <= 1) {
                        iArr2 = iArr12;
                        j2 = j;
                        jArr = jArr2;
                    } else {
                        double[] dArr = new double[length2];
                        j2 = j;
                        int i48 = 0;
                        while (true) {
                            long[] jArr6 = jArr2[i47];
                            double dLog = 0.0d;
                            if (i48 >= jArr6.length) {
                                break;
                            }
                            long[][] jArr7 = jArr2;
                            int[] iArr13 = iArr12;
                            long j4 = jArr6[i48];
                            if (j4 != j2) {
                                dLog = Math.log(j4);
                            }
                            dArr[i48] = dLog;
                            i48++;
                            jArr2 = jArr7;
                            iArr12 = iArr13;
                        }
                        jArr = jArr2;
                        iArr2 = iArr12;
                        int i49 = length2 - 1;
                        double d = dArr[i49] - dArr[0];
                        int i50 = 0;
                        while (i50 < i49) {
                            double d2 = dArr[i50];
                            i50++;
                            Double dValueOf = Double.valueOf(d == 0.0d ? 1.0d : (((d2 + dArr[i50]) * 0.5d) - dArr[0]) / d);
                            id4 id4Var2 = id4Var;
                            Integer numValueOf = Integer.valueOf(i47);
                            double d3 = d;
                            Map map4 = pn3Var.i;
                            Collection collection = (Collection) map4.get(dValueOf);
                            if (collection == null) {
                                List list = (List) pn3Var.k.a();
                                if (!list.add(numValueOf)) {
                                    throw new AssertionError("New Collection violated the Collection spec");
                                }
                                pn3Var.j++;
                                map4.put(dValueOf, list);
                            } else if (collection.add(numValueOf)) {
                                pn3Var.j++;
                            }
                            id4Var = id4Var2;
                            d = d3;
                        }
                    }
                    i47++;
                    jArr2 = jArr;
                    iArr12 = iArr2;
                    j = j2;
                    id4Var = id4Var;
                }
                id4 id4Var3 = id4Var;
                long[][] jArr8 = jArr2;
                int[] iArr14 = iArr12;
                Collection collectionA = pn3Var.g;
                if (collectionA == null) {
                    collectionA = pn3Var.a();
                    pn3Var.g = collectionA;
                }
                xm3 xm3VarM = xm3.m(collectionA);
                for (int i51 = 0; i51 < xm3VarM.size(); i51++) {
                    int iIntValue = ((Integer) xm3VarM.get(i51)).intValue();
                    int i52 = iArr14[iIntValue] + 1;
                    iArr14[iIntValue] = i52;
                    jArr4[iIntValue] = jArr8[iIntValue][i52];
                    xi4.d(arrayList, jArr4);
                }
                for (int i53 = 0; i53 < 2; i53++) {
                    if (arrayList.get(i53) != null) {
                        long j5 = jArr4[i53];
                        jArr4[i53] = j5 + j5;
                    }
                }
                xi4.d(arrayList, jArr4);
                ob1.z("initialCapacity", 4);
                Object[] objArrCopyOf = new Object[4];
                int i54 = 0;
                int i55 = 0;
                while (i54 < arrayList.size()) {
                    um3 um3Var2 = (um3) arrayList.get(i54);
                    sn3 sn3VarF = um3Var2 == null ? sn3.j : um3Var2.f();
                    sn3VarF.getClass();
                    int length3 = objArrCopyOf.length;
                    int i56 = i55 + 1;
                    int iD = rm3.d(length3, i56);
                    if (iD > length3) {
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, iD);
                    }
                    objArrCopyOf[i55] = sn3VarF;
                    i54++;
                    i55 = i56;
                }
                sn3 sn3VarO = xm3.o(objArrCopyOf, i55);
                int i57 = 2;
                nj4[] nj4VarArr = new nj4[2];
                int i58 = 0;
                while (i58 < i57) {
                    mj4 mj4Var4 = mj4VarArr4[i58];
                    if (mj4Var4 != null && (length = (iArr = mj4Var4.b).length) != 0) {
                        if (length == 1) {
                            xi4Var = new xi4(mj4Var4.a, new int[]{iArr[0]});
                        } else {
                            d02 d02Var3 = mj4Var4.a;
                            xm3 xm3Var = (xm3) sn3VarO.get(i58);
                            id4Var3.getClass();
                            xi4 xi4Var2 = new xi4(d02Var3, iArr);
                            xm3.m(xm3Var);
                            xi4Var = xi4Var2;
                        }
                        nj4VarArr[i58] = xi4Var;
                    }
                    i58++;
                    i57 = 2;
                }
                jc4[] jc4VarArr = new jc4[i57];
                int i59 = 0;
                while (i59 < i57) {
                    jc4VarArr[i59] = (dj4Var.E.get(i59) || dj4Var.v.contains(Integer.valueOf(oj4Var.a[i59])) || (oj4Var.a[i59] != -2 && nj4VarArr[i59] == null)) ? null : jc4.a;
                    i59++;
                    i57 = 2;
                }
                Pair pairCreate = Pair.create(jc4VarArr, nj4VarArr);
                nj4[] nj4VarArr2 = (nj4[]) pairCreate.second;
                List[] listArr = new List[nj4VarArr2.length];
                for (int i60 = 0; i60 < nj4VarArr2.length; i60++) {
                    nj4 nj4Var = nj4VarArr2[i60];
                    listArr[i60] = nj4Var != null ? xm3.i(nj4Var) : sn3.j;
                }
                um3 um3Var3 = new um3(4);
                for (int i61 = 0; i61 < 2; i61++) {
                    ri4 ri4Var7 = ri4VarArr[i61];
                    List list2 = listArr[i61];
                    int i62 = 0;
                    while (i62 < ri4Var7.a) {
                        d02 d02VarA3 = ri4Var7.a(i62);
                        int i63 = ri4VarArr[i61].a(i62).a;
                        int[] iArr15 = new int[i63];
                        int i64 = 0;
                        int i65 = 0;
                        while (i64 < i63) {
                            List[] listArr2 = listArr;
                            if ((iArr5[i61][i62][i64] & 7) == 4) {
                                iArr15[i65] = i64;
                                i65++;
                            }
                            i64++;
                            listArr = listArr2;
                        }
                        List[] listArr3 = listArr;
                        int[] iArrCopyOf = Arrays.copyOf(iArr15, i65);
                        ri4 ri4Var8 = ri4Var7;
                        int iMin = 16;
                        String str5 = null;
                        int i66 = 0;
                        boolean z6 = false;
                        int i67 = 0;
                        while (i66 < iArrCopyOf.length) {
                            String str6 = ri4VarArr[i61].a(i62).d[iArrCopyOf[i66]].m;
                            int i68 = i67 + 1;
                            if (i67 == 0) {
                                str5 = str6;
                            } else {
                                z6 = (!Objects.equals(str5, str6)) | z6;
                            }
                            iMin = Math.min(iMin, iArr5[i61][i62][i66] & 24);
                            i66++;
                            i67 = i68;
                        }
                        if (z6) {
                            iMin = Math.min(iMin, oj4Var.c[i61]);
                        }
                        boolean z7 = iMin != 0;
                        int i69 = d02VarA3.a;
                        int[] iArr16 = new int[i69];
                        boolean[] zArr = new boolean[i69];
                        int i70 = 0;
                        while (i70 < i69) {
                            iArr16[i70] = iArr5[i61][i62][i70] & 7;
                            int i71 = 0;
                            while (true) {
                                if (i71 >= list2.size()) {
                                    i3 = i69;
                                    z3 = false;
                                    break;
                                }
                                nj4 nj4Var2 = (nj4) list2.get(i71);
                                i3 = i69;
                                if (nj4Var2.a().equals(d02VarA3) && nj4Var2.m0(i70) != -1) {
                                    z3 = true;
                                    break;
                                }
                                i71++;
                                i69 = i3;
                            }
                            zArr[i70] = z3;
                            i70++;
                            i69 = i3;
                        }
                        um3Var3.a(new c42(d02VarA3, z7, iArr16, zArr));
                        i62++;
                        ri4Var7 = ri4Var8;
                        listArr = listArr3;
                    }
                }
                ri4 ri4Var9 = oj4Var.d;
                for (int i72 = 0; i72 < ri4Var9.a; i72++) {
                    d02 d02VarA4 = ri4Var9.a(i72);
                    int i73 = d02VarA4.a;
                    int[] iArr17 = new int[i73];
                    Arrays.fill(iArr17, 0);
                    um3Var3.a(new c42(d02VarA4, false, iArr17, new boolean[i73]));
                }
                pj4 pj4Var = new pj4((jc4[]) pairCreate.first, (nj4[]) pairCreate.second, new o42(um3Var3.f()), oj4Var);
                nj4[] nj4VarArr3 = (nj4[]) pj4Var.h;
                for (int i74 = 0; i74 < pj4Var.f; i74++) {
                    if (pj4Var.a(i74)) {
                        if (nj4VarArr3[i74] == null) {
                            kg4VarArr4[i74].getClass();
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        zt0.b0(z2);
                    } else {
                        zt0.b0(nj4VarArr3[i74] == null);
                    }
                }
                for (nj4 nj4Var3 : nj4VarArr3) {
                }
                return pj4Var;
            }
            if (map.get(Integer.valueOf(oj4Var.a[i38])) != null) {
                throw new ClassCastException();
            }
            i38++;
        }
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, jh4] */
    public final long g(pj4 pj4Var, long j, boolean z, boolean[] zArr) {
        kg4[] kg4VarArr;
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= pj4Var.f) {
                break;
            }
            if (z || !pj4Var.c(this.o, i)) {
                z2 = false;
            }
            this.i[i] = z2;
            i++;
        }
        int i2 = 0;
        while (true) {
            kg4VarArr = this.j;
            if (i2 >= 2) {
                break;
            }
            kg4VarArr[i2].getClass();
            i2++;
        }
        l();
        this.o = pj4Var;
        if (this.m == null) {
            int i3 = 0;
            while (true) {
                pj4 pj4Var2 = this.o;
                if (i3 >= pj4Var2.f) {
                    break;
                }
                pj4Var2.a(i3);
                nj4 nj4Var = ((nj4[]) this.o.h)[i3];
                i3++;
            }
        }
        nj4[] nj4VarArr = (nj4[]) pj4Var.h;
        ?? r5 = this.a;
        boolean[] zArr2 = this.i;
        li4[] li4VarArr = this.c;
        long jM = r5.m(nj4VarArr, zArr2, li4VarArr, zArr, j);
        for (int i4 = 0; i4 < 2; i4++) {
            kg4VarArr[i4].getClass();
        }
        this.f = false;
        for (int i5 = 0; i5 < 2; i5++) {
            if (li4VarArr[i5] != null) {
                zt0.b0(pj4Var.a(i5));
                kg4VarArr[i5].getClass();
                this.f = true;
            } else {
                zt0.b0(nj4VarArr[i5] == null);
            }
        }
        return jM;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, jh4] */
    public final void h() {
        l();
        ?? r0 = this.a;
        try {
            boolean z = r0 instanceof rg4;
            uu0 uu0Var = this.l;
            if (z) {
                uu0Var.g(((rg4) r0).f);
            } else {
                uu0Var.g(r0);
            }
        } catch (RuntimeException e) {
            a30.C("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    public final pb4 i() {
        return this.m;
    }

    public final ri4 j() {
        return this.n;
    }

    public final pj4 k() {
        return this.o;
    }

    public final void l() {
        if (this.m != null) {
            return;
        }
        int i = 0;
        while (true) {
            pj4 pj4Var = this.o;
            if (i >= pj4Var.f) {
                return;
            }
            pj4Var.a(i);
            nj4 nj4Var = ((nj4[]) this.o.h)[i];
            i++;
        }
    }
}
