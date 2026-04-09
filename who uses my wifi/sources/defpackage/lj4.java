package defpackage;

import android.content.Context;
import android.media.Spatializer;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class lj4 {
    public static final mm3 k = new mm3();
    public jb4 a;
    public uj4 b;
    public final Object c;
    public final Context d;
    public dj4 e;
    public Thread f;
    public rl g;
    public in2 h;
    public Boolean i;
    public final id4 j;

    public lj4(Context context) {
        id4 id4Var = new id4(11);
        dj4 dj4Var = dj4.F;
        this.c = new Object();
        this.d = context != null ? context.getApplicationContext() : null;
        this.j = id4Var;
        if (dj4Var != null) {
            this.e = dj4Var;
        } else {
            cj4 cj4Var = new cj4(dj4Var);
            cj4Var.a(dj4Var);
            this.e = new dj4(cj4Var);
        }
        this.h = in2.b;
        if (this.e.A && context == null) {
            a30.x("Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    public static String c(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public static int d(ph4 ph4Var, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(ph4Var.d)) {
            return 4;
        }
        String strC = c(str);
        String strC2 = c(ph4Var.d);
        if (strC2 == null || strC == null) {
            return (z && strC2 == null) ? 1 : 0;
        }
        if (strC2.startsWith(strC) || strC.startsWith(strC2)) {
            return 3;
        }
        String str2 = v23.a;
        return strC2.split("-", 2)[0].equals(strC.split("-", 2)[0]) ? 2 : 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
    
        r1 = r1 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ int e(defpackage.ph4 r5, defpackage.xm3 r6) {
        /*
            r0 = 0
            r1 = r0
        L2:
            int r2 = r6.size()
            if (r1 >= r2) goto L2a
            r2 = r0
        L9:
            xm3 r3 = r5.c
            int r4 = r3.size()
            if (r2 >= r4) goto L27
            java.lang.Object r3 = r3.get(r2)
            ui4 r3 = (defpackage.ui4) r3
            java.lang.String r3 = r3.b
            java.lang.Object r4 = r6.get(r1)
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L24
            return r1
        L24:
            int r2 = r2 + 1
            goto L9
        L27:
            int r1 = r1 + 1
            goto L2
        L2a:
            r5 = 2147483647(0x7fffffff, float:NaN)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lj4.e(ph4, xm3):int");
    }

    public static final Pair g(int i, oj4 oj4Var, int[][][] iArr, gj4 gj4Var, Comparator comparator) {
        RandomAccess randomAccessI;
        oj4 oj4Var2 = oj4Var;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 < 2) {
            if (i == oj4Var2.a[i2]) {
                ri4 ri4Var = oj4Var2.b[i2];
                for (int i3 = 0; i3 < ri4Var.a; i3++) {
                    d02 d02VarA = ri4Var.a(i3);
                    sn3 sn3VarE = gj4Var.e(i2, d02VarA, iArr[i2][i3]);
                    int i4 = d02VarA.a;
                    boolean[] zArr = new boolean[i4];
                    int i5 = 0;
                    while (i5 < i4) {
                        int i6 = i5 + 1;
                        jj4 jj4Var = (jj4) sn3VarE.get(i5);
                        int iA = jj4Var.a();
                        if (!zArr[i5] && iA != 0) {
                            if (iA == 1) {
                                randomAccessI = xm3.i(jj4Var);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(jj4Var);
                                for (int i7 = i6; i7 < i4; i7++) {
                                    jj4 jj4Var2 = (jj4) sn3VarE.get(i7);
                                    if (jj4Var2.a() == 2 && jj4Var.b(jj4Var2)) {
                                        arrayList2.add(jj4Var2);
                                        zArr[i7] = true;
                                    }
                                }
                                randomAccessI = arrayList2;
                            }
                            arrayList.add(randomAccessI);
                        }
                        i5 = i6;
                    }
                }
            }
            i2++;
            oj4Var2 = oj4Var;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i8 = 0; i8 < list.size(); i8++) {
            iArr2[i8] = ((jj4) list.get(i8)).h;
        }
        jj4 jj4Var3 = (jj4) list.get(0);
        return Pair.create(new mj4(jj4Var3.g, iArr2), Integer.valueOf(jj4Var3.f));
    }

    public final void a() {
        rl rlVar;
        ej4 ej4Var;
        Handler handler;
        synchronized (this.c) {
            try {
                Thread thread = this.f;
                if (thread != null) {
                    zt0.c0("DefaultTrackSelector is accessed on the wrong thread.", thread == Thread.currentThread());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (Build.VERSION.SDK_INT >= 32 && (rlVar = this.g) != null) {
            Spatializer spatializer = (Spatializer) rlVar.g;
            if (spatializer != null && (ej4Var = (ej4) rlVar.i) != null && (handler = (Handler) rlVar.h) != null) {
                spatializer.removeOnSpatializerStateChangedListener(ej4Var);
                handler.removeCallbacksAndMessages(null);
            }
            this.g = null;
        }
        this.a = null;
        this.b = null;
    }

    public final void b(in2 in2Var) {
        if (this.h.equals(in2Var)) {
            return;
        }
        this.h = in2Var;
        f();
    }

    public final void f() {
        boolean z;
        jb4 jb4Var;
        rl rlVar;
        synchronized (this.c) {
            try {
                z = false;
                if (this.e.A && Build.VERSION.SDK_INT >= 32 && (rlVar = this.g) != null && rlVar.f) {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z || (jb4Var = this.a) == null) {
            return;
        }
        jb4Var.m.b(10);
    }
}
