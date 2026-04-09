package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.c;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class b {

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f1338b = {0, 4, 8};

    /* renamed from: c, reason: collision with root package name */
    private static SparseIntArray f1339c;

    /* renamed from: a, reason: collision with root package name */
    private HashMap<Integer, C0010b> f1340a = new HashMap<>();

    /* renamed from: androidx.constraintlayout.widget.b$b, reason: collision with other inner class name */
    private static class C0010b {
        public int A;
        public int B;
        public int C;
        public int D;
        public int E;
        public int F;
        public int G;
        public int H;
        public int I;
        public int J;
        public int K;
        public int L;
        public int M;
        public int N;
        public int O;
        public int P;
        public float Q;
        public float R;
        public int S;
        public int T;
        public float U;
        public boolean V;
        public float W;
        public float X;
        public float Y;
        public float Z;

        /* renamed from: a, reason: collision with root package name */
        boolean f1341a;

        /* renamed from: a0, reason: collision with root package name */
        public float f1342a0;

        /* renamed from: b, reason: collision with root package name */
        public int f1343b;

        /* renamed from: b0, reason: collision with root package name */
        public float f1344b0;

        /* renamed from: c, reason: collision with root package name */
        public int f1345c;

        /* renamed from: c0, reason: collision with root package name */
        public float f1346c0;

        /* renamed from: d, reason: collision with root package name */
        int f1347d;

        /* renamed from: d0, reason: collision with root package name */
        public float f1348d0;

        /* renamed from: e, reason: collision with root package name */
        public int f1349e;

        /* renamed from: e0, reason: collision with root package name */
        public float f1350e0;

        /* renamed from: f, reason: collision with root package name */
        public int f1351f;

        /* renamed from: f0, reason: collision with root package name */
        public float f1352f0;

        /* renamed from: g, reason: collision with root package name */
        public float f1353g;

        /* renamed from: g0, reason: collision with root package name */
        public float f1354g0;

        /* renamed from: h, reason: collision with root package name */
        public int f1355h;

        /* renamed from: h0, reason: collision with root package name */
        public boolean f1356h0;

        /* renamed from: i, reason: collision with root package name */
        public int f1357i;

        /* renamed from: i0, reason: collision with root package name */
        public boolean f1358i0;

        /* renamed from: j, reason: collision with root package name */
        public int f1359j;

        /* renamed from: j0, reason: collision with root package name */
        public int f1360j0;

        /* renamed from: k, reason: collision with root package name */
        public int f1361k;

        /* renamed from: k0, reason: collision with root package name */
        public int f1362k0;

        /* renamed from: l, reason: collision with root package name */
        public int f1363l;

        /* renamed from: l0, reason: collision with root package name */
        public int f1364l0;

        /* renamed from: m, reason: collision with root package name */
        public int f1365m;

        /* renamed from: m0, reason: collision with root package name */
        public int f1366m0;

        /* renamed from: n, reason: collision with root package name */
        public int f1367n;

        /* renamed from: n0, reason: collision with root package name */
        public int f1368n0;

        /* renamed from: o, reason: collision with root package name */
        public int f1369o;

        /* renamed from: o0, reason: collision with root package name */
        public int f1370o0;

        /* renamed from: p, reason: collision with root package name */
        public int f1371p;

        /* renamed from: p0, reason: collision with root package name */
        public float f1372p0;

        /* renamed from: q, reason: collision with root package name */
        public int f1373q;

        /* renamed from: q0, reason: collision with root package name */
        public float f1374q0;

        /* renamed from: r, reason: collision with root package name */
        public int f1375r;
        public boolean r0;

        /* renamed from: s, reason: collision with root package name */
        public int f1376s;
        public int s0;

        /* renamed from: t, reason: collision with root package name */
        public int f1377t;
        public int t0;

        /* renamed from: u, reason: collision with root package name */
        public float f1378u;
        public int[] u0;

        /* renamed from: v, reason: collision with root package name */
        public float f1379v;
        public String v0;

        /* renamed from: w, reason: collision with root package name */
        public String f1380w;

        /* renamed from: x, reason: collision with root package name */
        public int f1381x;

        /* renamed from: y, reason: collision with root package name */
        public int f1382y;

        /* renamed from: z, reason: collision with root package name */
        public float f1383z;

        private C0010b() {
            this.f1341a = false;
            this.f1349e = -1;
            this.f1351f = -1;
            this.f1353g = -1.0f;
            this.f1355h = -1;
            this.f1357i = -1;
            this.f1359j = -1;
            this.f1361k = -1;
            this.f1363l = -1;
            this.f1365m = -1;
            this.f1367n = -1;
            this.f1369o = -1;
            this.f1371p = -1;
            this.f1373q = -1;
            this.f1375r = -1;
            this.f1376s = -1;
            this.f1377t = -1;
            this.f1378u = 0.5f;
            this.f1379v = 0.5f;
            this.f1380w = null;
            this.f1381x = -1;
            this.f1382y = 0;
            this.f1383z = 0.0f;
            this.A = -1;
            this.B = -1;
            this.C = -1;
            this.D = -1;
            this.E = -1;
            this.F = -1;
            this.G = -1;
            this.H = -1;
            this.I = -1;
            this.J = 0;
            this.K = -1;
            this.L = -1;
            this.M = -1;
            this.N = -1;
            this.O = -1;
            this.P = -1;
            this.Q = 0.0f;
            this.R = 0.0f;
            this.S = 0;
            this.T = 0;
            this.U = 1.0f;
            this.V = false;
            this.W = 0.0f;
            this.X = 0.0f;
            this.Y = 0.0f;
            this.Z = 0.0f;
            this.f1342a0 = 1.0f;
            this.f1344b0 = 1.0f;
            this.f1346c0 = Float.NaN;
            this.f1348d0 = Float.NaN;
            this.f1350e0 = 0.0f;
            this.f1352f0 = 0.0f;
            this.f1354g0 = 0.0f;
            this.f1356h0 = false;
            this.f1358i0 = false;
            this.f1360j0 = 0;
            this.f1362k0 = 0;
            this.f1364l0 = -1;
            this.f1366m0 = -1;
            this.f1368n0 = -1;
            this.f1370o0 = -1;
            this.f1372p0 = 1.0f;
            this.f1374q0 = 1.0f;
            this.r0 = false;
            this.s0 = -1;
            this.t0 = -1;
        }

        private void e(int i2, ConstraintLayout.a aVar) {
            this.f1347d = i2;
            this.f1355h = aVar.f1298d;
            this.f1357i = aVar.f1300e;
            this.f1359j = aVar.f1302f;
            this.f1361k = aVar.f1304g;
            this.f1363l = aVar.f1306h;
            this.f1365m = aVar.f1308i;
            this.f1367n = aVar.f1310j;
            this.f1369o = aVar.f1312k;
            this.f1371p = aVar.f1314l;
            this.f1373q = aVar.f1320p;
            this.f1375r = aVar.f1321q;
            this.f1376s = aVar.f1322r;
            this.f1377t = aVar.f1323s;
            this.f1378u = aVar.f1330z;
            this.f1379v = aVar.A;
            this.f1380w = aVar.B;
            this.f1381x = aVar.f1316m;
            this.f1382y = aVar.f1318n;
            this.f1383z = aVar.f1319o;
            this.A = aVar.Q;
            this.B = aVar.R;
            this.C = aVar.S;
            this.f1353g = aVar.f1296c;
            this.f1349e = aVar.f1292a;
            this.f1351f = aVar.f1294b;
            this.f1343b = ((ViewGroup.MarginLayoutParams) aVar).width;
            this.f1345c = ((ViewGroup.MarginLayoutParams) aVar).height;
            this.D = ((ViewGroup.MarginLayoutParams) aVar).leftMargin;
            this.E = ((ViewGroup.MarginLayoutParams) aVar).rightMargin;
            this.F = ((ViewGroup.MarginLayoutParams) aVar).topMargin;
            this.G = ((ViewGroup.MarginLayoutParams) aVar).bottomMargin;
            this.Q = aVar.F;
            this.R = aVar.E;
            this.T = aVar.H;
            this.S = aVar.G;
            boolean z2 = aVar.T;
            this.f1356h0 = z2;
            this.f1358i0 = aVar.U;
            this.f1360j0 = aVar.I;
            this.f1362k0 = aVar.J;
            this.f1356h0 = z2;
            this.f1364l0 = aVar.M;
            this.f1366m0 = aVar.N;
            this.f1368n0 = aVar.K;
            this.f1370o0 = aVar.L;
            this.f1372p0 = aVar.O;
            this.f1374q0 = aVar.P;
            if (Build.VERSION.SDK_INT >= 17) {
                this.H = aVar.getMarginEnd();
                this.I = aVar.getMarginStart();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f(int i2, c.a aVar) {
            e(i2, aVar);
            this.U = aVar.f1385n0;
            this.X = aVar.f1388q0;
            this.Y = aVar.r0;
            this.Z = aVar.s0;
            this.f1342a0 = aVar.t0;
            this.f1344b0 = aVar.u0;
            this.f1346c0 = aVar.v0;
            this.f1348d0 = aVar.w0;
            this.f1350e0 = aVar.x0;
            this.f1352f0 = aVar.y0;
            this.f1354g0 = aVar.z0;
            this.W = aVar.f1387p0;
            this.V = aVar.f1386o0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g(androidx.constraintlayout.widget.a aVar, int i2, c.a aVar2) {
            f(i2, aVar2);
            if (aVar instanceof n.a) {
                this.t0 = 1;
                n.a aVar3 = (n.a) aVar;
                this.s0 = aVar3.getType();
                this.u0 = aVar3.getReferencedIds();
            }
        }

        public void c(ConstraintLayout.a aVar) {
            aVar.f1298d = this.f1355h;
            aVar.f1300e = this.f1357i;
            aVar.f1302f = this.f1359j;
            aVar.f1304g = this.f1361k;
            aVar.f1306h = this.f1363l;
            aVar.f1308i = this.f1365m;
            aVar.f1310j = this.f1367n;
            aVar.f1312k = this.f1369o;
            aVar.f1314l = this.f1371p;
            aVar.f1320p = this.f1373q;
            aVar.f1321q = this.f1375r;
            aVar.f1322r = this.f1376s;
            aVar.f1323s = this.f1377t;
            ((ViewGroup.MarginLayoutParams) aVar).leftMargin = this.D;
            ((ViewGroup.MarginLayoutParams) aVar).rightMargin = this.E;
            ((ViewGroup.MarginLayoutParams) aVar).topMargin = this.F;
            ((ViewGroup.MarginLayoutParams) aVar).bottomMargin = this.G;
            aVar.f1328x = this.P;
            aVar.f1329y = this.O;
            aVar.f1330z = this.f1378u;
            aVar.A = this.f1379v;
            aVar.f1316m = this.f1381x;
            aVar.f1318n = this.f1382y;
            aVar.f1319o = this.f1383z;
            aVar.B = this.f1380w;
            aVar.Q = this.A;
            aVar.R = this.B;
            aVar.F = this.Q;
            aVar.E = this.R;
            aVar.H = this.T;
            aVar.G = this.S;
            aVar.T = this.f1356h0;
            aVar.U = this.f1358i0;
            aVar.I = this.f1360j0;
            aVar.J = this.f1362k0;
            aVar.M = this.f1364l0;
            aVar.N = this.f1366m0;
            aVar.K = this.f1368n0;
            aVar.L = this.f1370o0;
            aVar.O = this.f1372p0;
            aVar.P = this.f1374q0;
            aVar.S = this.C;
            aVar.f1296c = this.f1353g;
            aVar.f1292a = this.f1349e;
            aVar.f1294b = this.f1351f;
            ((ViewGroup.MarginLayoutParams) aVar).width = this.f1343b;
            ((ViewGroup.MarginLayoutParams) aVar).height = this.f1345c;
            if (Build.VERSION.SDK_INT >= 17) {
                aVar.setMarginStart(this.I);
                aVar.setMarginEnd(this.H);
            }
            aVar.a();
        }

        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public C0010b clone() {
            C0010b c0010b = new C0010b();
            c0010b.f1341a = this.f1341a;
            c0010b.f1343b = this.f1343b;
            c0010b.f1345c = this.f1345c;
            c0010b.f1349e = this.f1349e;
            c0010b.f1351f = this.f1351f;
            c0010b.f1353g = this.f1353g;
            c0010b.f1355h = this.f1355h;
            c0010b.f1357i = this.f1357i;
            c0010b.f1359j = this.f1359j;
            c0010b.f1361k = this.f1361k;
            c0010b.f1363l = this.f1363l;
            c0010b.f1365m = this.f1365m;
            c0010b.f1367n = this.f1367n;
            c0010b.f1369o = this.f1369o;
            c0010b.f1371p = this.f1371p;
            c0010b.f1373q = this.f1373q;
            c0010b.f1375r = this.f1375r;
            c0010b.f1376s = this.f1376s;
            c0010b.f1377t = this.f1377t;
            c0010b.f1378u = this.f1378u;
            c0010b.f1379v = this.f1379v;
            c0010b.f1380w = this.f1380w;
            c0010b.A = this.A;
            c0010b.B = this.B;
            c0010b.f1378u = this.f1378u;
            c0010b.f1378u = this.f1378u;
            c0010b.f1378u = this.f1378u;
            c0010b.f1378u = this.f1378u;
            c0010b.f1378u = this.f1378u;
            c0010b.C = this.C;
            c0010b.D = this.D;
            c0010b.E = this.E;
            c0010b.F = this.F;
            c0010b.G = this.G;
            c0010b.H = this.H;
            c0010b.I = this.I;
            c0010b.J = this.J;
            c0010b.K = this.K;
            c0010b.L = this.L;
            c0010b.M = this.M;
            c0010b.N = this.N;
            c0010b.O = this.O;
            c0010b.P = this.P;
            c0010b.Q = this.Q;
            c0010b.R = this.R;
            c0010b.S = this.S;
            c0010b.T = this.T;
            c0010b.U = this.U;
            c0010b.V = this.V;
            c0010b.W = this.W;
            c0010b.X = this.X;
            c0010b.Y = this.Y;
            c0010b.Z = this.Z;
            c0010b.f1342a0 = this.f1342a0;
            c0010b.f1344b0 = this.f1344b0;
            c0010b.f1346c0 = this.f1346c0;
            c0010b.f1348d0 = this.f1348d0;
            c0010b.f1350e0 = this.f1350e0;
            c0010b.f1352f0 = this.f1352f0;
            c0010b.f1354g0 = this.f1354g0;
            c0010b.f1356h0 = this.f1356h0;
            c0010b.f1358i0 = this.f1358i0;
            c0010b.f1360j0 = this.f1360j0;
            c0010b.f1362k0 = this.f1362k0;
            c0010b.f1364l0 = this.f1364l0;
            c0010b.f1366m0 = this.f1366m0;
            c0010b.f1368n0 = this.f1368n0;
            c0010b.f1370o0 = this.f1370o0;
            c0010b.f1372p0 = this.f1372p0;
            c0010b.f1374q0 = this.f1374q0;
            c0010b.s0 = this.s0;
            c0010b.t0 = this.t0;
            int[] iArr = this.u0;
            if (iArr != null) {
                c0010b.u0 = Arrays.copyOf(iArr, iArr.length);
            }
            c0010b.f1381x = this.f1381x;
            c0010b.f1382y = this.f1382y;
            c0010b.f1383z = this.f1383z;
            c0010b.r0 = this.r0;
            return c0010b;
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f1339c = sparseIntArray;
        sparseIntArray.append(n.c.h1, 25);
        f1339c.append(n.c.i1, 26);
        f1339c.append(n.c.k1, 29);
        f1339c.append(n.c.l1, 30);
        f1339c.append(n.c.q1, 36);
        f1339c.append(n.c.p1, 35);
        f1339c.append(n.c.P0, 4);
        f1339c.append(n.c.O0, 3);
        f1339c.append(n.c.M0, 1);
        f1339c.append(n.c.y1, 6);
        f1339c.append(n.c.z1, 7);
        f1339c.append(n.c.W0, 17);
        f1339c.append(n.c.X0, 18);
        f1339c.append(n.c.Y0, 19);
        f1339c.append(n.c.f2991k0, 27);
        f1339c.append(n.c.m1, 32);
        f1339c.append(n.c.n1, 33);
        f1339c.append(n.c.V0, 10);
        f1339c.append(n.c.U0, 9);
        f1339c.append(n.c.C1, 13);
        f1339c.append(n.c.F1, 16);
        f1339c.append(n.c.D1, 14);
        f1339c.append(n.c.A1, 11);
        f1339c.append(n.c.E1, 15);
        f1339c.append(n.c.B1, 12);
        f1339c.append(n.c.t1, 40);
        f1339c.append(n.c.f1, 39);
        f1339c.append(n.c.e1, 41);
        f1339c.append(n.c.s1, 42);
        f1339c.append(n.c.d1, 20);
        f1339c.append(n.c.r1, 37);
        f1339c.append(n.c.T0, 5);
        f1339c.append(n.c.g1, 75);
        f1339c.append(n.c.o1, 75);
        f1339c.append(n.c.j1, 75);
        f1339c.append(n.c.N0, 75);
        f1339c.append(n.c.L0, 75);
        f1339c.append(n.c.f3001p0, 24);
        f1339c.append(n.c.r0, 28);
        f1339c.append(n.c.D0, 31);
        f1339c.append(n.c.E0, 8);
        f1339c.append(n.c.f3003q0, 34);
        f1339c.append(n.c.s0, 2);
        f1339c.append(n.c.f2997n0, 23);
        f1339c.append(n.c.f2999o0, 21);
        f1339c.append(n.c.f2995m0, 22);
        f1339c.append(n.c.t0, 43);
        f1339c.append(n.c.G0, 44);
        f1339c.append(n.c.B0, 45);
        f1339c.append(n.c.C0, 46);
        f1339c.append(n.c.A0, 60);
        f1339c.append(n.c.y0, 47);
        f1339c.append(n.c.z0, 48);
        f1339c.append(n.c.u0, 49);
        f1339c.append(n.c.v0, 50);
        f1339c.append(n.c.w0, 51);
        f1339c.append(n.c.x0, 52);
        f1339c.append(n.c.F0, 53);
        f1339c.append(n.c.u1, 54);
        f1339c.append(n.c.Z0, 55);
        f1339c.append(n.c.v1, 56);
        f1339c.append(n.c.a1, 57);
        f1339c.append(n.c.w1, 58);
        f1339c.append(n.c.b1, 59);
        f1339c.append(n.c.Q0, 61);
        f1339c.append(n.c.S0, 62);
        f1339c.append(n.c.R0, 63);
        f1339c.append(n.c.f2993l0, 38);
        f1339c.append(n.c.x1, 69);
        f1339c.append(n.c.c1, 70);
        f1339c.append(n.c.J0, 71);
        f1339c.append(n.c.I0, 72);
        f1339c.append(n.c.K0, 73);
        f1339c.append(n.c.H0, 74);
    }

    private int[] c(View view, String str) throws IllegalAccessException, IllegalArgumentException {
        int iIntValue;
        Object objC;
        String[] strArrSplit = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < strArrSplit.length) {
            String strTrim = strArrSplit[i2].trim();
            try {
                iIntValue = n.b.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (objC = ((ConstraintLayout) view.getParent()).c(0, strTrim)) != null && (objC instanceof Integer)) {
                iIntValue = ((Integer) objC).intValue();
            }
            iArr[i3] = iIntValue;
            i2++;
            i3++;
        }
        return i3 != strArrSplit.length ? Arrays.copyOf(iArr, i3) : iArr;
    }

    private C0010b d(Context context, AttributeSet attributeSet) {
        C0010b c0010b = new C0010b();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n.c.f2989j0);
        g(c0010b, typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        return c0010b;
    }

    private static int f(TypedArray typedArray, int i2, int i3) {
        int resourceId = typedArray.getResourceId(i2, i3);
        return resourceId == -1 ? typedArray.getInt(i2, -1) : resourceId;
    }

    private void g(C0010b c0010b, TypedArray typedArray) {
        StringBuilder sb;
        String str;
        int indexCount = typedArray.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArray.getIndex(i2);
            int i3 = f1339c.get(index);
            switch (i3) {
                case 1:
                    c0010b.f1371p = f(typedArray, index, c0010b.f1371p);
                    break;
                case 2:
                    c0010b.G = typedArray.getDimensionPixelSize(index, c0010b.G);
                    break;
                case 3:
                    c0010b.f1369o = f(typedArray, index, c0010b.f1369o);
                    break;
                case 4:
                    c0010b.f1367n = f(typedArray, index, c0010b.f1367n);
                    break;
                case 5:
                    c0010b.f1380w = typedArray.getString(index);
                    break;
                case 6:
                    c0010b.A = typedArray.getDimensionPixelOffset(index, c0010b.A);
                    break;
                case 7:
                    c0010b.B = typedArray.getDimensionPixelOffset(index, c0010b.B);
                    break;
                case 8:
                    c0010b.H = typedArray.getDimensionPixelSize(index, c0010b.H);
                    break;
                case 9:
                    c0010b.f1377t = f(typedArray, index, c0010b.f1377t);
                    break;
                case 10:
                    c0010b.f1376s = f(typedArray, index, c0010b.f1376s);
                    break;
                case 11:
                    c0010b.N = typedArray.getDimensionPixelSize(index, c0010b.N);
                    break;
                case 12:
                    c0010b.O = typedArray.getDimensionPixelSize(index, c0010b.O);
                    break;
                case 13:
                    c0010b.K = typedArray.getDimensionPixelSize(index, c0010b.K);
                    break;
                case 14:
                    c0010b.M = typedArray.getDimensionPixelSize(index, c0010b.M);
                    break;
                case 15:
                    c0010b.P = typedArray.getDimensionPixelSize(index, c0010b.P);
                    break;
                case 16:
                    c0010b.L = typedArray.getDimensionPixelSize(index, c0010b.L);
                    break;
                case 17:
                    c0010b.f1349e = typedArray.getDimensionPixelOffset(index, c0010b.f1349e);
                    break;
                case 18:
                    c0010b.f1351f = typedArray.getDimensionPixelOffset(index, c0010b.f1351f);
                    break;
                case 19:
                    c0010b.f1353g = typedArray.getFloat(index, c0010b.f1353g);
                    break;
                case 20:
                    c0010b.f1378u = typedArray.getFloat(index, c0010b.f1378u);
                    break;
                case 21:
                    c0010b.f1345c = typedArray.getLayoutDimension(index, c0010b.f1345c);
                    break;
                case 22:
                    int i4 = typedArray.getInt(index, c0010b.J);
                    c0010b.J = i4;
                    c0010b.J = f1338b[i4];
                    break;
                case 23:
                    c0010b.f1343b = typedArray.getLayoutDimension(index, c0010b.f1343b);
                    break;
                case 24:
                    c0010b.D = typedArray.getDimensionPixelSize(index, c0010b.D);
                    break;
                case 25:
                    c0010b.f1355h = f(typedArray, index, c0010b.f1355h);
                    break;
                case 26:
                    c0010b.f1357i = f(typedArray, index, c0010b.f1357i);
                    break;
                case 27:
                    c0010b.C = typedArray.getInt(index, c0010b.C);
                    break;
                case 28:
                    c0010b.E = typedArray.getDimensionPixelSize(index, c0010b.E);
                    break;
                case 29:
                    c0010b.f1359j = f(typedArray, index, c0010b.f1359j);
                    break;
                case 30:
                    c0010b.f1361k = f(typedArray, index, c0010b.f1361k);
                    break;
                case 31:
                    c0010b.I = typedArray.getDimensionPixelSize(index, c0010b.I);
                    break;
                case 32:
                    c0010b.f1373q = f(typedArray, index, c0010b.f1373q);
                    break;
                case 33:
                    c0010b.f1375r = f(typedArray, index, c0010b.f1375r);
                    break;
                case 34:
                    c0010b.F = typedArray.getDimensionPixelSize(index, c0010b.F);
                    break;
                case 35:
                    c0010b.f1365m = f(typedArray, index, c0010b.f1365m);
                    break;
                case 36:
                    c0010b.f1363l = f(typedArray, index, c0010b.f1363l);
                    break;
                case 37:
                    c0010b.f1379v = typedArray.getFloat(index, c0010b.f1379v);
                    break;
                case 38:
                    c0010b.f1347d = typedArray.getResourceId(index, c0010b.f1347d);
                    break;
                case 39:
                    c0010b.R = typedArray.getFloat(index, c0010b.R);
                    break;
                case 40:
                    c0010b.Q = typedArray.getFloat(index, c0010b.Q);
                    break;
                case 41:
                    c0010b.S = typedArray.getInt(index, c0010b.S);
                    break;
                case 42:
                    c0010b.T = typedArray.getInt(index, c0010b.T);
                    break;
                case 43:
                    c0010b.U = typedArray.getFloat(index, c0010b.U);
                    break;
                case 44:
                    c0010b.V = true;
                    c0010b.W = typedArray.getDimension(index, c0010b.W);
                    break;
                case 45:
                    c0010b.Y = typedArray.getFloat(index, c0010b.Y);
                    break;
                case 46:
                    c0010b.Z = typedArray.getFloat(index, c0010b.Z);
                    break;
                case 47:
                    c0010b.f1342a0 = typedArray.getFloat(index, c0010b.f1342a0);
                    break;
                case 48:
                    c0010b.f1344b0 = typedArray.getFloat(index, c0010b.f1344b0);
                    break;
                case 49:
                    c0010b.f1346c0 = typedArray.getFloat(index, c0010b.f1346c0);
                    break;
                case 50:
                    c0010b.f1348d0 = typedArray.getFloat(index, c0010b.f1348d0);
                    break;
                case 51:
                    c0010b.f1350e0 = typedArray.getDimension(index, c0010b.f1350e0);
                    break;
                case 52:
                    c0010b.f1352f0 = typedArray.getDimension(index, c0010b.f1352f0);
                    break;
                case 53:
                    c0010b.f1354g0 = typedArray.getDimension(index, c0010b.f1354g0);
                    break;
                default:
                    switch (i3) {
                        case 60:
                            c0010b.X = typedArray.getFloat(index, c0010b.X);
                            break;
                        case 61:
                            c0010b.f1381x = f(typedArray, index, c0010b.f1381x);
                            break;
                        case 62:
                            c0010b.f1382y = typedArray.getDimensionPixelSize(index, c0010b.f1382y);
                            break;
                        case 63:
                            c0010b.f1383z = typedArray.getFloat(index, c0010b.f1383z);
                            break;
                        default:
                            switch (i3) {
                                case 69:
                                    c0010b.f1372p0 = typedArray.getFloat(index, 1.0f);
                                    continue;
                                case 70:
                                    c0010b.f1374q0 = typedArray.getFloat(index, 1.0f);
                                    continue;
                                case 71:
                                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                    continue;
                                case 72:
                                    c0010b.s0 = typedArray.getInt(index, c0010b.s0);
                                    continue;
                                case 73:
                                    c0010b.v0 = typedArray.getString(index);
                                    continue;
                                case 74:
                                    c0010b.r0 = typedArray.getBoolean(index, c0010b.r0);
                                    continue;
                                case 75:
                                    sb = new StringBuilder();
                                    str = "unused attribute 0x";
                                    break;
                                default:
                                    sb = new StringBuilder();
                                    str = "Unknown attribute 0x";
                                    break;
                            }
                            sb.append(str);
                            sb.append(Integer.toHexString(index));
                            sb.append("   ");
                            sb.append(f1339c.get(index));
                            Log.w("ConstraintSet", sb.toString());
                            break;
                    }
            }
        }
    }

    void a(ConstraintLayout constraintLayout) throws IllegalAccessException, IllegalArgumentException {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f1340a.keySet());
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraintLayout.getChildAt(i2);
            int id = childAt.getId();
            if (id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (this.f1340a.containsKey(Integer.valueOf(id))) {
                hashSet.remove(Integer.valueOf(id));
                C0010b c0010b = this.f1340a.get(Integer.valueOf(id));
                if (childAt instanceof n.a) {
                    c0010b.t0 = 1;
                }
                int i3 = c0010b.t0;
                if (i3 != -1 && i3 == 1) {
                    n.a aVar = (n.a) childAt;
                    aVar.setId(id);
                    aVar.setType(c0010b.s0);
                    aVar.setAllowsGoneWidget(c0010b.r0);
                    int[] iArr = c0010b.u0;
                    if (iArr != null) {
                        aVar.setReferencedIds(iArr);
                    } else {
                        String str = c0010b.v0;
                        if (str != null) {
                            int[] iArrC = c(aVar, str);
                            c0010b.u0 = iArrC;
                            aVar.setReferencedIds(iArrC);
                        }
                    }
                }
                ConstraintLayout.a aVar2 = (ConstraintLayout.a) childAt.getLayoutParams();
                c0010b.c(aVar2);
                childAt.setLayoutParams(aVar2);
                childAt.setVisibility(c0010b.J);
                int i4 = Build.VERSION.SDK_INT;
                if (i4 >= 17) {
                    childAt.setAlpha(c0010b.U);
                    childAt.setRotation(c0010b.X);
                    childAt.setRotationX(c0010b.Y);
                    childAt.setRotationY(c0010b.Z);
                    childAt.setScaleX(c0010b.f1342a0);
                    childAt.setScaleY(c0010b.f1344b0);
                    if (!Float.isNaN(c0010b.f1346c0)) {
                        childAt.setPivotX(c0010b.f1346c0);
                    }
                    if (!Float.isNaN(c0010b.f1348d0)) {
                        childAt.setPivotY(c0010b.f1348d0);
                    }
                    childAt.setTranslationX(c0010b.f1350e0);
                    childAt.setTranslationY(c0010b.f1352f0);
                    if (i4 >= 21) {
                        childAt.setTranslationZ(c0010b.f1354g0);
                        if (c0010b.V) {
                            childAt.setElevation(c0010b.W);
                        }
                    }
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            C0010b c0010b2 = this.f1340a.get(num);
            int i5 = c0010b2.t0;
            if (i5 != -1 && i5 == 1) {
                n.a aVar3 = new n.a(constraintLayout.getContext());
                aVar3.setId(num.intValue());
                int[] iArr2 = c0010b2.u0;
                if (iArr2 != null) {
                    aVar3.setReferencedIds(iArr2);
                } else {
                    String str2 = c0010b2.v0;
                    if (str2 != null) {
                        int[] iArrC2 = c(aVar3, str2);
                        c0010b2.u0 = iArrC2;
                        aVar3.setReferencedIds(iArrC2);
                    }
                }
                aVar3.setType(c0010b2.s0);
                ConstraintLayout.a aVarA = constraintLayout.generateDefaultLayoutParams();
                aVar3.f();
                c0010b2.c(aVarA);
                constraintLayout.addView(aVar3, aVarA);
            }
            if (c0010b2.f1341a) {
                View dVar = new d(constraintLayout.getContext());
                dVar.setId(num.intValue());
                ConstraintLayout.a aVarA2 = constraintLayout.generateDefaultLayoutParams();
                c0010b2.c(aVarA2);
                constraintLayout.addView(dVar, aVarA2);
            }
        }
    }

    public void b(c cVar) {
        int childCount = cVar.getChildCount();
        this.f1340a.clear();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = cVar.getChildAt(i2);
            c.a aVar = (c.a) childAt.getLayoutParams();
            int id = childAt.getId();
            if (id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f1340a.containsKey(Integer.valueOf(id))) {
                this.f1340a.put(Integer.valueOf(id), new C0010b());
            }
            C0010b c0010b = this.f1340a.get(Integer.valueOf(id));
            if (childAt instanceof androidx.constraintlayout.widget.a) {
                c0010b.g((androidx.constraintlayout.widget.a) childAt, id, aVar);
            }
            c0010b.f(id, aVar);
        }
    }

    public void e(Context context, int i2) throws XmlPullParserException, Resources.NotFoundException, IOException {
        XmlResourceParser xml = context.getResources().getXml(i2);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    C0010b c0010bD = d(context, Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        c0010bD.f1341a = true;
                    }
                    this.f1340a.put(Integer.valueOf(c0010bD.f1347d), c0010bD);
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
    }
}
