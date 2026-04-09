package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import m.f;
import m.g;
import m.i;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* renamed from: b, reason: collision with root package name */
    SparseArray<View> f1273b;

    /* renamed from: c, reason: collision with root package name */
    private ArrayList<androidx.constraintlayout.widget.a> f1274c;

    /* renamed from: d, reason: collision with root package name */
    private final ArrayList<f> f1275d;

    /* renamed from: e, reason: collision with root package name */
    g f1276e;

    /* renamed from: f, reason: collision with root package name */
    private int f1277f;

    /* renamed from: g, reason: collision with root package name */
    private int f1278g;

    /* renamed from: h, reason: collision with root package name */
    private int f1279h;

    /* renamed from: i, reason: collision with root package name */
    private int f1280i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f1281j;

    /* renamed from: k, reason: collision with root package name */
    private int f1282k;

    /* renamed from: l, reason: collision with root package name */
    private b f1283l;

    /* renamed from: m, reason: collision with root package name */
    private int f1284m;

    /* renamed from: n, reason: collision with root package name */
    private HashMap<String, Integer> f1285n;

    /* renamed from: o, reason: collision with root package name */
    private int f1286o;

    /* renamed from: p, reason: collision with root package name */
    private int f1287p;

    /* renamed from: q, reason: collision with root package name */
    int f1288q;

    /* renamed from: r, reason: collision with root package name */
    int f1289r;

    /* renamed from: s, reason: collision with root package name */
    int f1290s;

    /* renamed from: t, reason: collision with root package name */
    int f1291t;

    public static class a extends ViewGroup.MarginLayoutParams {
        public float A;
        public String B;
        float C;
        int D;
        public float E;
        public float F;
        public int G;
        public int H;
        public int I;
        public int J;
        public int K;
        public int L;
        public int M;
        public int N;
        public float O;
        public float P;
        public int Q;
        public int R;
        public int S;
        public boolean T;
        public boolean U;
        boolean V;
        boolean W;
        boolean X;
        boolean Y;
        boolean Z;

        /* renamed from: a, reason: collision with root package name */
        public int f1292a;

        /* renamed from: a0, reason: collision with root package name */
        boolean f1293a0;

        /* renamed from: b, reason: collision with root package name */
        public int f1294b;

        /* renamed from: b0, reason: collision with root package name */
        int f1295b0;

        /* renamed from: c, reason: collision with root package name */
        public float f1296c;

        /* renamed from: c0, reason: collision with root package name */
        int f1297c0;

        /* renamed from: d, reason: collision with root package name */
        public int f1298d;

        /* renamed from: d0, reason: collision with root package name */
        int f1299d0;

        /* renamed from: e, reason: collision with root package name */
        public int f1300e;

        /* renamed from: e0, reason: collision with root package name */
        int f1301e0;

        /* renamed from: f, reason: collision with root package name */
        public int f1302f;

        /* renamed from: f0, reason: collision with root package name */
        int f1303f0;

        /* renamed from: g, reason: collision with root package name */
        public int f1304g;

        /* renamed from: g0, reason: collision with root package name */
        int f1305g0;

        /* renamed from: h, reason: collision with root package name */
        public int f1306h;

        /* renamed from: h0, reason: collision with root package name */
        float f1307h0;

        /* renamed from: i, reason: collision with root package name */
        public int f1308i;

        /* renamed from: i0, reason: collision with root package name */
        int f1309i0;

        /* renamed from: j, reason: collision with root package name */
        public int f1310j;

        /* renamed from: j0, reason: collision with root package name */
        int f1311j0;

        /* renamed from: k, reason: collision with root package name */
        public int f1312k;

        /* renamed from: k0, reason: collision with root package name */
        float f1313k0;

        /* renamed from: l, reason: collision with root package name */
        public int f1314l;

        /* renamed from: l0, reason: collision with root package name */
        f f1315l0;

        /* renamed from: m, reason: collision with root package name */
        public int f1316m;

        /* renamed from: m0, reason: collision with root package name */
        public boolean f1317m0;

        /* renamed from: n, reason: collision with root package name */
        public int f1318n;

        /* renamed from: o, reason: collision with root package name */
        public float f1319o;

        /* renamed from: p, reason: collision with root package name */
        public int f1320p;

        /* renamed from: q, reason: collision with root package name */
        public int f1321q;

        /* renamed from: r, reason: collision with root package name */
        public int f1322r;

        /* renamed from: s, reason: collision with root package name */
        public int f1323s;

        /* renamed from: t, reason: collision with root package name */
        public int f1324t;

        /* renamed from: u, reason: collision with root package name */
        public int f1325u;

        /* renamed from: v, reason: collision with root package name */
        public int f1326v;

        /* renamed from: w, reason: collision with root package name */
        public int f1327w;

        /* renamed from: x, reason: collision with root package name */
        public int f1328x;

        /* renamed from: y, reason: collision with root package name */
        public int f1329y;

        /* renamed from: z, reason: collision with root package name */
        public float f1330z;

        /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$a$a, reason: collision with other inner class name */
        private static class C0009a {

            /* renamed from: a, reason: collision with root package name */
            public static final SparseIntArray f1331a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f1331a = sparseIntArray;
                sparseIntArray.append(n.c.I, 8);
                sparseIntArray.append(n.c.J, 9);
                sparseIntArray.append(n.c.L, 10);
                sparseIntArray.append(n.c.M, 11);
                sparseIntArray.append(n.c.R, 12);
                sparseIntArray.append(n.c.Q, 13);
                sparseIntArray.append(n.c.f3002q, 14);
                sparseIntArray.append(n.c.f3000p, 15);
                sparseIntArray.append(n.c.f2996n, 16);
                sparseIntArray.append(n.c.f3004r, 2);
                sparseIntArray.append(n.c.f3006t, 3);
                sparseIntArray.append(n.c.f3005s, 4);
                sparseIntArray.append(n.c.Z, 49);
                sparseIntArray.append(n.c.f2971a0, 50);
                sparseIntArray.append(n.c.f3010x, 5);
                sparseIntArray.append(n.c.f3011y, 6);
                sparseIntArray.append(n.c.f3012z, 7);
                sparseIntArray.append(n.c.f2972b, 1);
                sparseIntArray.append(n.c.N, 17);
                sparseIntArray.append(n.c.O, 18);
                sparseIntArray.append(n.c.f3009w, 19);
                sparseIntArray.append(n.c.f3008v, 20);
                sparseIntArray.append(n.c.f2977d0, 21);
                sparseIntArray.append(n.c.f2983g0, 22);
                sparseIntArray.append(n.c.f2979e0, 23);
                sparseIntArray.append(n.c.f2973b0, 24);
                sparseIntArray.append(n.c.f2981f0, 25);
                sparseIntArray.append(n.c.f2975c0, 26);
                sparseIntArray.append(n.c.E, 29);
                sparseIntArray.append(n.c.S, 30);
                sparseIntArray.append(n.c.f3007u, 44);
                sparseIntArray.append(n.c.G, 45);
                sparseIntArray.append(n.c.U, 46);
                sparseIntArray.append(n.c.F, 47);
                sparseIntArray.append(n.c.T, 48);
                sparseIntArray.append(n.c.f2992l, 27);
                sparseIntArray.append(n.c.f2990k, 28);
                sparseIntArray.append(n.c.V, 31);
                sparseIntArray.append(n.c.A, 32);
                sparseIntArray.append(n.c.X, 33);
                sparseIntArray.append(n.c.W, 34);
                sparseIntArray.append(n.c.Y, 35);
                sparseIntArray.append(n.c.C, 36);
                sparseIntArray.append(n.c.B, 37);
                sparseIntArray.append(n.c.D, 38);
                sparseIntArray.append(n.c.H, 39);
                sparseIntArray.append(n.c.P, 40);
                sparseIntArray.append(n.c.K, 41);
                sparseIntArray.append(n.c.f2998o, 42);
                sparseIntArray.append(n.c.f2994m, 43);
            }
        }

        public a(int i2, int i3) {
            super(i2, i3);
            this.f1292a = -1;
            this.f1294b = -1;
            this.f1296c = -1.0f;
            this.f1298d = -1;
            this.f1300e = -1;
            this.f1302f = -1;
            this.f1304g = -1;
            this.f1306h = -1;
            this.f1308i = -1;
            this.f1310j = -1;
            this.f1312k = -1;
            this.f1314l = -1;
            this.f1316m = -1;
            this.f1318n = 0;
            this.f1319o = 0.0f;
            this.f1320p = -1;
            this.f1321q = -1;
            this.f1322r = -1;
            this.f1323s = -1;
            this.f1324t = -1;
            this.f1325u = -1;
            this.f1326v = -1;
            this.f1327w = -1;
            this.f1328x = -1;
            this.f1329y = -1;
            this.f1330z = 0.5f;
            this.A = 0.5f;
            this.B = null;
            this.C = 0.0f;
            this.D = 1;
            this.E = -1.0f;
            this.F = -1.0f;
            this.G = 0;
            this.H = 0;
            this.I = 0;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 1.0f;
            this.P = 1.0f;
            this.Q = -1;
            this.R = -1;
            this.S = -1;
            this.T = false;
            this.U = false;
            this.V = true;
            this.W = true;
            this.X = false;
            this.Y = false;
            this.Z = false;
            this.f1293a0 = false;
            this.f1295b0 = -1;
            this.f1297c0 = -1;
            this.f1299d0 = -1;
            this.f1301e0 = -1;
            this.f1303f0 = -1;
            this.f1305g0 = -1;
            this.f1307h0 = 0.5f;
            this.f1315l0 = new f();
            this.f1317m0 = false;
        }

        public a(Context context, AttributeSet attributeSet) throws NumberFormatException {
            String str;
            int i2;
            float fAbs;
            super(context, attributeSet);
            this.f1292a = -1;
            this.f1294b = -1;
            this.f1296c = -1.0f;
            this.f1298d = -1;
            this.f1300e = -1;
            this.f1302f = -1;
            this.f1304g = -1;
            this.f1306h = -1;
            this.f1308i = -1;
            this.f1310j = -1;
            this.f1312k = -1;
            this.f1314l = -1;
            this.f1316m = -1;
            this.f1318n = 0;
            this.f1319o = 0.0f;
            this.f1320p = -1;
            this.f1321q = -1;
            this.f1322r = -1;
            this.f1323s = -1;
            this.f1324t = -1;
            this.f1325u = -1;
            this.f1326v = -1;
            this.f1327w = -1;
            this.f1328x = -1;
            this.f1329y = -1;
            this.f1330z = 0.5f;
            this.A = 0.5f;
            this.B = null;
            this.C = 0.0f;
            this.D = 1;
            this.E = -1.0f;
            this.F = -1.0f;
            this.G = 0;
            this.H = 0;
            this.I = 0;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 1.0f;
            this.P = 1.0f;
            this.Q = -1;
            this.R = -1;
            this.S = -1;
            this.T = false;
            this.U = false;
            this.V = true;
            this.W = true;
            this.X = false;
            this.Y = false;
            this.Z = false;
            this.f1293a0 = false;
            this.f1295b0 = -1;
            this.f1297c0 = -1;
            this.f1299d0 = -1;
            this.f1301e0 = -1;
            this.f1303f0 = -1;
            this.f1305g0 = -1;
            this.f1307h0 = 0.5f;
            this.f1315l0 = new f();
            this.f1317m0 = false;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n.c.f2970a);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i3);
                int i4 = C0009a.f1331a.get(index);
                switch (i4) {
                    case 1:
                        this.S = typedArrayObtainStyledAttributes.getInt(index, this.S);
                        continue;
                    case 2:
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f1316m);
                        this.f1316m = resourceId;
                        if (resourceId == -1) {
                            this.f1316m = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 3:
                        this.f1318n = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1318n);
                        continue;
                    case 4:
                        float f2 = typedArrayObtainStyledAttributes.getFloat(index, this.f1319o) % 360.0f;
                        this.f1319o = f2;
                        if (f2 < 0.0f) {
                            this.f1319o = (360.0f - f2) % 360.0f;
                        } else {
                            continue;
                        }
                    case 5:
                        this.f1292a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1292a);
                        continue;
                    case 6:
                        this.f1294b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1294b);
                        continue;
                    case 7:
                        this.f1296c = typedArrayObtainStyledAttributes.getFloat(index, this.f1296c);
                        continue;
                    case 8:
                        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1298d);
                        this.f1298d = resourceId2;
                        if (resourceId2 == -1) {
                            this.f1298d = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 9:
                        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1300e);
                        this.f1300e = resourceId3;
                        if (resourceId3 == -1) {
                            this.f1300e = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 10:
                        int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1302f);
                        this.f1302f = resourceId4;
                        if (resourceId4 == -1) {
                            this.f1302f = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 11:
                        int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1304g);
                        this.f1304g = resourceId5;
                        if (resourceId5 == -1) {
                            this.f1304g = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 12:
                        int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1306h);
                        this.f1306h = resourceId6;
                        if (resourceId6 == -1) {
                            this.f1306h = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 13:
                        int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1308i);
                        this.f1308i = resourceId7;
                        if (resourceId7 == -1) {
                            this.f1308i = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 14:
                        int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1310j);
                        this.f1310j = resourceId8;
                        if (resourceId8 == -1) {
                            this.f1310j = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 15:
                        int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1312k);
                        this.f1312k = resourceId9;
                        if (resourceId9 == -1) {
                            this.f1312k = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 16:
                        int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1314l);
                        this.f1314l = resourceId10;
                        if (resourceId10 == -1) {
                            this.f1314l = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 17:
                        int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1320p);
                        this.f1320p = resourceId11;
                        if (resourceId11 == -1) {
                            this.f1320p = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 18:
                        int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1321q);
                        this.f1321q = resourceId12;
                        if (resourceId12 == -1) {
                            this.f1321q = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 19:
                        int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1322r);
                        this.f1322r = resourceId13;
                        if (resourceId13 == -1) {
                            this.f1322r = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 20:
                        int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1323s);
                        this.f1323s = resourceId14;
                        if (resourceId14 == -1) {
                            this.f1323s = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 21:
                        this.f1324t = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1324t);
                        continue;
                    case 22:
                        this.f1325u = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1325u);
                        continue;
                    case 23:
                        this.f1326v = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1326v);
                        continue;
                    case 24:
                        this.f1327w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1327w);
                        continue;
                    case 25:
                        this.f1328x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1328x);
                        continue;
                    case 26:
                        this.f1329y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1329y);
                        continue;
                    case 27:
                        this.T = typedArrayObtainStyledAttributes.getBoolean(index, this.T);
                        continue;
                    case 28:
                        this.U = typedArrayObtainStyledAttributes.getBoolean(index, this.U);
                        continue;
                    case 29:
                        this.f1330z = typedArrayObtainStyledAttributes.getFloat(index, this.f1330z);
                        continue;
                    case 30:
                        this.A = typedArrayObtainStyledAttributes.getFloat(index, this.A);
                        continue;
                    case 31:
                        int i5 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.I = i5;
                        if (i5 == 1) {
                            str = "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.";
                            break;
                        }
                    case 32:
                        int i6 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.J = i6;
                        if (i6 == 1) {
                            str = "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.";
                            break;
                        }
                    case 33:
                        try {
                            this.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.K);
                            continue;
                        } catch (Exception unused) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.K) == -2) {
                                this.K = -2;
                            }
                        }
                    case 34:
                        try {
                            this.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.M);
                            continue;
                        } catch (Exception unused2) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.M) == -2) {
                                this.M = -2;
                            }
                        }
                    case 35:
                        this.O = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.O));
                        continue;
                    case 36:
                        try {
                            this.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.L);
                            continue;
                        } catch (Exception unused3) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.L) == -2) {
                                this.L = -2;
                            }
                        }
                    case 37:
                        try {
                            this.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.N);
                            continue;
                        } catch (Exception unused4) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.N) == -2) {
                                this.N = -2;
                            }
                        }
                    case 38:
                        this.P = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.P));
                        continue;
                    default:
                        switch (i4) {
                            case 44:
                                String string = typedArrayObtainStyledAttributes.getString(index);
                                this.B = string;
                                this.C = Float.NaN;
                                this.D = -1;
                                if (string != null) {
                                    int length = string.length();
                                    int iIndexOf = this.B.indexOf(44);
                                    if (iIndexOf <= 0 || iIndexOf >= length - 1) {
                                        i2 = 0;
                                    } else {
                                        String strSubstring = this.B.substring(0, iIndexOf);
                                        if (strSubstring.equalsIgnoreCase("W")) {
                                            this.D = 0;
                                        } else if (strSubstring.equalsIgnoreCase("H")) {
                                            this.D = 1;
                                        }
                                        i2 = iIndexOf + 1;
                                    }
                                    int iIndexOf2 = this.B.indexOf(58);
                                    if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                                        String strSubstring2 = this.B.substring(i2);
                                        if (strSubstring2.length() > 0) {
                                            fAbs = Float.parseFloat(strSubstring2);
                                            this.C = fAbs;
                                            break;
                                        } else {
                                            break;
                                        }
                                    } else {
                                        String strSubstring3 = this.B.substring(i2, iIndexOf2);
                                        String strSubstring4 = this.B.substring(iIndexOf2 + 1);
                                        if (strSubstring3.length() <= 0 || strSubstring4.length() <= 0) {
                                            break;
                                        } else {
                                            try {
                                                float f3 = Float.parseFloat(strSubstring3);
                                                float f4 = Float.parseFloat(strSubstring4);
                                                if (f3 <= 0.0f || f4 <= 0.0f) {
                                                    break;
                                                } else {
                                                    fAbs = this.D == 1 ? Math.abs(f4 / f3) : Math.abs(f3 / f4);
                                                    this.C = fAbs;
                                                }
                                            } catch (NumberFormatException unused5) {
                                                break;
                                            }
                                        }
                                    }
                                } else {
                                    break;
                                }
                                break;
                            case 45:
                                this.E = typedArrayObtainStyledAttributes.getFloat(index, this.E);
                                break;
                            case 46:
                                this.F = typedArrayObtainStyledAttributes.getFloat(index, this.F);
                                break;
                            case 47:
                                this.G = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.H = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.Q = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.Q);
                                break;
                            case 50:
                                this.R = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.R);
                                continue;
                        }
                        break;
                }
                Log.e("ConstraintLayout", str);
            }
            typedArrayObtainStyledAttributes.recycle();
            a();
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1292a = -1;
            this.f1294b = -1;
            this.f1296c = -1.0f;
            this.f1298d = -1;
            this.f1300e = -1;
            this.f1302f = -1;
            this.f1304g = -1;
            this.f1306h = -1;
            this.f1308i = -1;
            this.f1310j = -1;
            this.f1312k = -1;
            this.f1314l = -1;
            this.f1316m = -1;
            this.f1318n = 0;
            this.f1319o = 0.0f;
            this.f1320p = -1;
            this.f1321q = -1;
            this.f1322r = -1;
            this.f1323s = -1;
            this.f1324t = -1;
            this.f1325u = -1;
            this.f1326v = -1;
            this.f1327w = -1;
            this.f1328x = -1;
            this.f1329y = -1;
            this.f1330z = 0.5f;
            this.A = 0.5f;
            this.B = null;
            this.C = 0.0f;
            this.D = 1;
            this.E = -1.0f;
            this.F = -1.0f;
            this.G = 0;
            this.H = 0;
            this.I = 0;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 1.0f;
            this.P = 1.0f;
            this.Q = -1;
            this.R = -1;
            this.S = -1;
            this.T = false;
            this.U = false;
            this.V = true;
            this.W = true;
            this.X = false;
            this.Y = false;
            this.Z = false;
            this.f1293a0 = false;
            this.f1295b0 = -1;
            this.f1297c0 = -1;
            this.f1299d0 = -1;
            this.f1301e0 = -1;
            this.f1303f0 = -1;
            this.f1305g0 = -1;
            this.f1307h0 = 0.5f;
            this.f1315l0 = new f();
            this.f1317m0 = false;
        }

        public void a() {
            this.Y = false;
            this.V = true;
            this.W = true;
            int i2 = ((ViewGroup.MarginLayoutParams) this).width;
            if (i2 == -2 && this.T) {
                this.V = false;
                this.I = 1;
            }
            int i3 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i3 == -2 && this.U) {
                this.W = false;
                this.J = 1;
            }
            if (i2 == 0 || i2 == -1) {
                this.V = false;
                if (i2 == 0 && this.I == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.T = true;
                }
            }
            if (i3 == 0 || i3 == -1) {
                this.W = false;
                if (i3 == 0 && this.J == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.U = true;
                }
            }
            if (this.f1296c == -1.0f && this.f1292a == -1 && this.f1294b == -1) {
                return;
            }
            this.Y = true;
            this.V = true;
            this.W = true;
            if (!(this.f1315l0 instanceof i)) {
                this.f1315l0 = new i();
            }
            ((i) this.f1315l0).M0(this.S);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0060  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0066  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x007c  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0084  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x00d8  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        @android.annotation.TargetApi(17)
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void resolveLayoutDirection(int r7) {
            /*
                Method dump skipped, instructions count: 261
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.a.resolveLayoutDirection(int):void");
        }
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        super(context, attributeSet);
        this.f1273b = new SparseArray<>();
        this.f1274c = new ArrayList<>(4);
        this.f1275d = new ArrayList<>(100);
        this.f1276e = new g();
        this.f1277f = 0;
        this.f1278g = 0;
        this.f1279h = Integer.MAX_VALUE;
        this.f1280i = Integer.MAX_VALUE;
        this.f1281j = true;
        this.f1282k = 7;
        this.f1283l = null;
        this.f1284m = -1;
        this.f1285n = new HashMap<>();
        this.f1286o = -1;
        this.f1287p = -1;
        this.f1288q = -1;
        this.f1289r = -1;
        this.f1290s = 0;
        this.f1291t = 0;
        g(attributeSet);
    }

    private final f d(int i2) {
        if (i2 == 0) {
            return this.f1276e;
        }
        View viewFindViewById = this.f1273b.get(i2);
        if (viewFindViewById == null && (viewFindViewById = findViewById(i2)) != null && viewFindViewById != this && viewFindViewById.getParent() == this) {
            onViewAdded(viewFindViewById);
        }
        if (viewFindViewById == this) {
            return this.f1276e;
        }
        if (viewFindViewById == null) {
            return null;
        }
        return ((a) viewFindViewById.getLayoutParams()).f1315l0;
    }

    private void g(AttributeSet attributeSet) throws XmlPullParserException, IOException {
        this.f1276e.W(this);
        this.f1273b.put(getId(), this);
        this.f1283l = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, n.c.f2970a);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == n.c.f2978e) {
                    this.f1277f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1277f);
                } else if (index == n.c.f2980f) {
                    this.f1278g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1278g);
                } else if (index == n.c.f2974c) {
                    this.f1279h = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1279h);
                } else if (index == n.c.f2976d) {
                    this.f1280i = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1280i);
                } else if (index == n.c.f2985h0) {
                    this.f1282k = typedArrayObtainStyledAttributes.getInt(index, this.f1282k);
                } else if (index == n.c.f2986i) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        b bVar = new b();
                        this.f1283l = bVar;
                        bVar.e(getContext(), resourceId);
                    } catch (Resources.NotFoundException unused) {
                        this.f1283l = null;
                    }
                    this.f1284m = resourceId;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f1276e.c1(this.f1282k);
    }

    private void h(int i2, int i3) {
        boolean z2;
        boolean z3;
        int baseline;
        int childMeasureSpec;
        int childMeasureSpec2;
        boolean z4;
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                a aVar = (a) childAt.getLayoutParams();
                f fVar = aVar.f1315l0;
                if (!aVar.Y && !aVar.Z) {
                    fVar.x0(childAt.getVisibility());
                    int measuredWidth = ((ViewGroup.MarginLayoutParams) aVar).width;
                    int measuredHeight = ((ViewGroup.MarginLayoutParams) aVar).height;
                    boolean z5 = aVar.V;
                    if (z5 || (z4 = aVar.W) || (!z5 && aVar.I == 1) || measuredWidth == -1 || (!z4 && (aVar.J == 1 || measuredHeight == -1))) {
                        if (measuredWidth == 0) {
                            childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingLeft, -2);
                            z2 = true;
                        } else if (measuredWidth == -1) {
                            childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingLeft, -1);
                            z2 = false;
                        } else {
                            z2 = measuredWidth == -2;
                            childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingLeft, measuredWidth);
                        }
                        if (measuredHeight == 0) {
                            childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, paddingTop, -2);
                            z3 = true;
                        } else if (measuredHeight == -1) {
                            childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, paddingTop, -1);
                            z3 = false;
                        } else {
                            z3 = measuredHeight == -2;
                            childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, paddingTop, measuredHeight);
                        }
                        childAt.measure(childMeasureSpec, childMeasureSpec2);
                        fVar.z0(measuredWidth == -2);
                        fVar.c0(measuredHeight == -2);
                        measuredWidth = childAt.getMeasuredWidth();
                        measuredHeight = childAt.getMeasuredHeight();
                    } else {
                        z2 = false;
                        z3 = false;
                    }
                    fVar.y0(measuredWidth);
                    fVar.b0(measuredHeight);
                    if (z2) {
                        fVar.B0(measuredWidth);
                    }
                    if (z3) {
                        fVar.A0(measuredHeight);
                    }
                    if (aVar.X && (baseline = childAt.getBaseline()) != -1) {
                        fVar.V(baseline);
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0299 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x029b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void i(int r25, int r26) {
        /*
            Method dump skipped, instructions count: 682
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.i(int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x03a1  */
    /* JADX WARN: Type inference failed for: r23v0, types: [android.view.ViewGroup, androidx.constraintlayout.widget.ConstraintLayout] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v39 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void j() throws java.lang.IllegalAccessException, android.content.res.Resources.NotFoundException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 979
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.j():void");
    }

    private void l(int i2, int i3) {
        int iMin;
        f.b bVar;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        f.b bVar2 = f.b.FIXED;
        getLayoutParams();
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                bVar = f.b.WRAP_CONTENT;
            } else if (mode != 1073741824) {
                bVar = bVar2;
            } else {
                iMin = Math.min(this.f1279h, size) - paddingLeft;
                bVar = bVar2;
            }
            iMin = 0;
        } else {
            iMin = size;
            bVar = f.b.WRAP_CONTENT;
        }
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 == 0) {
                bVar2 = f.b.WRAP_CONTENT;
            } else if (mode2 == 1073741824) {
                size2 = Math.min(this.f1280i, size2) - paddingTop;
            }
            size2 = 0;
        } else {
            bVar2 = f.b.WRAP_CONTENT;
        }
        this.f1276e.m0(0);
        this.f1276e.l0(0);
        this.f1276e.g0(bVar);
        this.f1276e.y0(iMin);
        this.f1276e.u0(bVar2);
        this.f1276e.b0(size2);
        this.f1276e.m0((this.f1277f - getPaddingLeft()) - getPaddingRight());
        this.f1276e.l0((this.f1278g - getPaddingTop()) - getPaddingBottom());
    }

    private void n() throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        int childCount = getChildCount();
        boolean z2 = false;
        int i2 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            if (getChildAt(i2).isLayoutRequested()) {
                z2 = true;
                break;
            }
            i2++;
        }
        if (z2) {
            this.f1275d.clear();
            j();
        }
    }

    private void o() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt instanceof e) {
                ((e) childAt).a(this);
            }
        }
        int size = this.f1274c.size();
        if (size > 0) {
            for (int i3 = 0; i3 < size; i3++) {
                this.f1274c.get(i3).d(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public a generateDefaultLayoutParams() {
        return new a(-2, -2);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i2, layoutParams);
        if (Build.VERSION.SDK_INT < 14) {
            onViewAdded(view);
        }
    }

    @Override // android.view.ViewGroup
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    public Object c(int i2, Object obj) {
        if (i2 != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap<String, Integer> map = this.f1285n;
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return this.f1285n.get(str);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) throws NumberFormatException {
        Object tag;
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = getWidth();
            float height = getHeight();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i3 = Integer.parseInt(strArrSplit[0]);
                        int i4 = Integer.parseInt(strArrSplit[1]);
                        int i5 = Integer.parseInt(strArrSplit[2]);
                        int i6 = (int) ((i3 / 1080.0f) * width);
                        int i7 = (int) ((i4 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f2 = i6;
                        float f3 = i7;
                        float f4 = i6 + ((int) ((i5 / 1080.0f) * width));
                        canvas.drawLine(f2, f3, f4, f3, paint);
                        float f5 = i7 + ((int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height));
                        canvas.drawLine(f4, f3, f4, f5, paint);
                        canvas.drawLine(f4, f5, f2, f5, paint);
                        canvas.drawLine(f2, f5, f2, f3, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f2, f3, f4, f5, paint);
                        canvas.drawLine(f2, f5, f4, f3, paint);
                    }
                }
            }
        }
    }

    public View e(int i2) {
        return this.f1273b.get(i2);
    }

    public final f f(View view) {
        if (view == this) {
            return this.f1276e;
        }
        if (view == null) {
            return null;
        }
        return ((a) view.getLayoutParams()).f1315l0;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    public int getMaxHeight() {
        return this.f1280i;
    }

    public int getMaxWidth() {
        return this.f1279h;
    }

    public int getMinHeight() {
        return this.f1278g;
    }

    public int getMinWidth() {
        return this.f1277f;
    }

    public int getOptimizationLevel() {
        return this.f1276e.R0();
    }

    public void k(int i2, Object obj, Object obj2) {
        if (i2 == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.f1285n == null) {
                this.f1285n = new HashMap<>();
            }
            String strSubstring = (String) obj;
            int iIndexOf = strSubstring.indexOf("/");
            if (iIndexOf != -1) {
                strSubstring = strSubstring.substring(iIndexOf + 1);
            }
            this.f1285n.put(strSubstring, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    protected void m(String str) {
        this.f1276e.K0();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        View content;
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            a aVar = (a) childAt.getLayoutParams();
            f fVar = aVar.f1315l0;
            if ((childAt.getVisibility() != 8 || aVar.Y || aVar.Z || zIsInEditMode) && !aVar.f1293a0) {
                int iP = fVar.p();
                int iQ = fVar.q();
                int iD = fVar.D() + iP;
                int iR = fVar.r() + iQ;
                childAt.layout(iP, iQ, iD, iR);
                if ((childAt instanceof e) && (content = ((e) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(iP, iQ, iD, iR);
                }
            }
        }
        int size = this.f1274c.size();
        if (size > 0) {
            for (int i7 = 0; i7 < size; i7++) {
                this.f1274c.get(i7).c(this);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x011d  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r21, int r22) throws java.lang.IllegalAccessException, android.content.res.Resources.NotFoundException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 916
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        if (Build.VERSION.SDK_INT >= 14) {
            super.onViewAdded(view);
        }
        f fVarF = f(view);
        if ((view instanceof d) && !(fVarF instanceof i)) {
            a aVar = (a) view.getLayoutParams();
            i iVar = new i();
            aVar.f1315l0 = iVar;
            aVar.Y = true;
            iVar.M0(aVar.S);
        }
        if (view instanceof androidx.constraintlayout.widget.a) {
            androidx.constraintlayout.widget.a aVar2 = (androidx.constraintlayout.widget.a) view;
            aVar2.f();
            ((a) view.getLayoutParams()).Z = true;
            if (!this.f1274c.contains(aVar2)) {
                this.f1274c.add(aVar2);
            }
        }
        this.f1273b.put(view.getId(), view);
        this.f1281j = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        if (Build.VERSION.SDK_INT >= 14) {
            super.onViewRemoved(view);
        }
        this.f1273b.remove(view.getId());
        f fVarF = f(view);
        this.f1276e.L0(fVarF);
        this.f1274c.remove(view);
        this.f1275d.remove(fVarF);
        this.f1281j = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        super.removeView(view);
        if (Build.VERSION.SDK_INT < 14) {
            onViewRemoved(view);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
        this.f1281j = true;
        this.f1286o = -1;
        this.f1287p = -1;
        this.f1288q = -1;
        this.f1289r = -1;
        this.f1290s = 0;
        this.f1291t = 0;
    }

    public void setConstraintSet(b bVar) {
        this.f1283l = bVar;
    }

    @Override // android.view.View
    public void setId(int i2) {
        this.f1273b.remove(getId());
        super.setId(i2);
        this.f1273b.put(getId(), this);
    }

    public void setMaxHeight(int i2) {
        if (i2 == this.f1280i) {
            return;
        }
        this.f1280i = i2;
        requestLayout();
    }

    public void setMaxWidth(int i2) {
        if (i2 == this.f1279h) {
            return;
        }
        this.f1279h = i2;
        requestLayout();
    }

    public void setMinHeight(int i2) {
        if (i2 == this.f1278g) {
            return;
        }
        this.f1278g = i2;
        requestLayout();
    }

    public void setMinWidth(int i2) {
        if (i2 == this.f1277f) {
            return;
        }
        this.f1277f = i2;
        requestLayout();
    }

    public void setOptimizationLevel(int i2) {
        this.f1276e.c1(i2);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
