package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class c {

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f2188h = {0, 4, 8};

    /* renamed from: i, reason: collision with root package name */
    public static SparseIntArray f2189i = new SparseIntArray();

    /* renamed from: j, reason: collision with root package name */
    public static SparseIntArray f2190j = new SparseIntArray();

    /* renamed from: a, reason: collision with root package name */
    public boolean f2191a;

    /* renamed from: b, reason: collision with root package name */
    public String f2192b;

    /* renamed from: c, reason: collision with root package name */
    public String f2193c = "";

    /* renamed from: d, reason: collision with root package name */
    public int f2194d = 0;

    /* renamed from: e, reason: collision with root package name */
    public HashMap f2195e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public boolean f2196f = true;

    /* renamed from: g, reason: collision with root package name */
    public HashMap f2197g = new HashMap();

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f2198a;

        /* renamed from: b, reason: collision with root package name */
        public String f2199b;

        /* renamed from: c, reason: collision with root package name */
        public final d f2200c = new d();

        /* renamed from: d, reason: collision with root package name */
        public final C0014c f2201d = new C0014c();

        /* renamed from: e, reason: collision with root package name */
        public final b f2202e = new b();

        /* renamed from: f, reason: collision with root package name */
        public final e f2203f = new e();

        /* renamed from: g, reason: collision with root package name */
        public HashMap f2204g = new HashMap();

        /* renamed from: h, reason: collision with root package name */
        public C0013a f2205h;

        /* renamed from: androidx.constraintlayout.widget.c$a$a, reason: collision with other inner class name */
        public static class C0013a {

            /* renamed from: a, reason: collision with root package name */
            public int[] f2206a = new int[10];

            /* renamed from: b, reason: collision with root package name */
            public int[] f2207b = new int[10];

            /* renamed from: c, reason: collision with root package name */
            public int f2208c = 0;

            /* renamed from: d, reason: collision with root package name */
            public int[] f2209d = new int[10];

            /* renamed from: e, reason: collision with root package name */
            public float[] f2210e = new float[10];

            /* renamed from: f, reason: collision with root package name */
            public int f2211f = 0;

            /* renamed from: g, reason: collision with root package name */
            public int[] f2212g = new int[5];

            /* renamed from: h, reason: collision with root package name */
            public String[] f2213h = new String[5];

            /* renamed from: i, reason: collision with root package name */
            public int f2214i = 0;

            /* renamed from: j, reason: collision with root package name */
            public int[] f2215j = new int[4];

            /* renamed from: k, reason: collision with root package name */
            public boolean[] f2216k = new boolean[4];

            /* renamed from: l, reason: collision with root package name */
            public int f2217l = 0;

            public void a(int i10, float f10) {
                int i11 = this.f2211f;
                int[] iArr = this.f2209d;
                if (i11 >= iArr.length) {
                    this.f2209d = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.f2210e;
                    this.f2210e = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.f2209d;
                int i12 = this.f2211f;
                iArr2[i12] = i10;
                float[] fArr2 = this.f2210e;
                this.f2211f = i12 + 1;
                fArr2[i12] = f10;
            }

            public void b(int i10, int i11) {
                int i12 = this.f2208c;
                int[] iArr = this.f2206a;
                if (i12 >= iArr.length) {
                    this.f2206a = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.f2207b;
                    this.f2207b = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.f2206a;
                int i13 = this.f2208c;
                iArr3[i13] = i10;
                int[] iArr4 = this.f2207b;
                this.f2208c = i13 + 1;
                iArr4[i13] = i11;
            }

            public void c(int i10, String str) {
                int i11 = this.f2214i;
                int[] iArr = this.f2212g;
                if (i11 >= iArr.length) {
                    this.f2212g = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.f2213h;
                    this.f2213h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.f2212g;
                int i12 = this.f2214i;
                iArr2[i12] = i10;
                String[] strArr2 = this.f2213h;
                this.f2214i = i12 + 1;
                strArr2[i12] = str;
            }

            public void d(int i10, boolean z10) {
                int i11 = this.f2217l;
                int[] iArr = this.f2215j;
                if (i11 >= iArr.length) {
                    this.f2215j = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.f2216k;
                    this.f2216k = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.f2215j;
                int i12 = this.f2217l;
                iArr2[i12] = i10;
                boolean[] zArr2 = this.f2216k;
                this.f2217l = i12 + 1;
                zArr2[i12] = z10;
            }

            public void e(a aVar) {
                for (int i10 = 0; i10 < this.f2208c; i10++) {
                    c.N(aVar, this.f2206a[i10], this.f2207b[i10]);
                }
                for (int i11 = 0; i11 < this.f2211f; i11++) {
                    c.M(aVar, this.f2209d[i11], this.f2210e[i11]);
                }
                for (int i12 = 0; i12 < this.f2214i; i12++) {
                    c.O(aVar, this.f2212g[i12], this.f2213h[i12]);
                }
                for (int i13 = 0; i13 < this.f2217l; i13++) {
                    c.P(aVar, this.f2215j[i13], this.f2216k[i13]);
                }
            }
        }

        public void d(a aVar) {
            C0013a c0013a = this.f2205h;
            if (c0013a != null) {
                c0013a.e(aVar);
            }
        }

        public void e(ConstraintLayout.b bVar) {
            b bVar2 = this.f2202e;
            bVar.f2125d = bVar2.f2235i;
            bVar.f2127e = bVar2.f2237j;
            bVar.f2129f = bVar2.f2239k;
            bVar.f2131g = bVar2.f2241l;
            bVar.f2133h = bVar2.f2243m;
            bVar.f2135i = bVar2.f2245n;
            bVar.f2137j = bVar2.f2247o;
            bVar.f2139k = bVar2.f2249p;
            bVar.f2141l = bVar2.f2251q;
            bVar.f2143m = bVar2.f2252r;
            bVar.f2145n = bVar2.f2253s;
            bVar.f2153r = bVar2.f2254t;
            bVar.f2155s = bVar2.f2255u;
            bVar.f2157t = bVar2.f2256v;
            bVar.f2159u = bVar2.f2257w;
            ((ViewGroup.MarginLayoutParams) bVar).leftMargin = bVar2.G;
            ((ViewGroup.MarginLayoutParams) bVar).rightMargin = bVar2.H;
            ((ViewGroup.MarginLayoutParams) bVar).topMargin = bVar2.I;
            ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = bVar2.J;
            bVar.f2166z = bVar2.S;
            bVar.A = bVar2.R;
            bVar.f2163w = bVar2.O;
            bVar.f2165y = bVar2.Q;
            bVar.F = bVar2.f2258x;
            bVar.G = bVar2.f2259y;
            bVar.f2147o = bVar2.A;
            bVar.f2149p = bVar2.B;
            bVar.f2151q = bVar2.C;
            bVar.H = bVar2.f2260z;
            bVar.W = bVar2.D;
            bVar.X = bVar2.E;
            bVar.L = bVar2.U;
            bVar.K = bVar2.V;
            bVar.N = bVar2.X;
            bVar.M = bVar2.W;
            bVar.Z = bVar2.f2244m0;
            bVar.f2120a0 = bVar2.f2246n0;
            bVar.O = bVar2.Y;
            bVar.P = bVar2.Z;
            bVar.S = bVar2.f2220a0;
            bVar.T = bVar2.f2222b0;
            bVar.Q = bVar2.f2224c0;
            bVar.R = bVar2.f2226d0;
            bVar.U = bVar2.f2228e0;
            bVar.V = bVar2.f2230f0;
            bVar.Y = bVar2.F;
            bVar.f2123c = bVar2.f2233h;
            bVar.f2119a = bVar2.f2229f;
            bVar.f2121b = bVar2.f2231g;
            ((ViewGroup.MarginLayoutParams) bVar).width = bVar2.f2225d;
            ((ViewGroup.MarginLayoutParams) bVar).height = bVar2.f2227e;
            String str = bVar2.f2242l0;
            if (str != null) {
                bVar.f2122b0 = str;
            }
            bVar.f2124c0 = bVar2.f2250p0;
            bVar.setMarginStart(bVar2.L);
            bVar.setMarginEnd(this.f2202e.K);
            bVar.b();
        }

        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public a clone() {
            a aVar = new a();
            aVar.f2202e.a(this.f2202e);
            aVar.f2201d.a(this.f2201d);
            aVar.f2200c.a(this.f2200c);
            aVar.f2203f.a(this.f2203f);
            aVar.f2198a = this.f2198a;
            aVar.f2205h = this.f2205h;
            return aVar;
        }

        public final void g(int i10, ConstraintLayout.b bVar) {
            this.f2198a = i10;
            b bVar2 = this.f2202e;
            bVar2.f2235i = bVar.f2125d;
            bVar2.f2237j = bVar.f2127e;
            bVar2.f2239k = bVar.f2129f;
            bVar2.f2241l = bVar.f2131g;
            bVar2.f2243m = bVar.f2133h;
            bVar2.f2245n = bVar.f2135i;
            bVar2.f2247o = bVar.f2137j;
            bVar2.f2249p = bVar.f2139k;
            bVar2.f2251q = bVar.f2141l;
            bVar2.f2252r = bVar.f2143m;
            bVar2.f2253s = bVar.f2145n;
            bVar2.f2254t = bVar.f2153r;
            bVar2.f2255u = bVar.f2155s;
            bVar2.f2256v = bVar.f2157t;
            bVar2.f2257w = bVar.f2159u;
            bVar2.f2258x = bVar.F;
            bVar2.f2259y = bVar.G;
            bVar2.f2260z = bVar.H;
            bVar2.A = bVar.f2147o;
            bVar2.B = bVar.f2149p;
            bVar2.C = bVar.f2151q;
            bVar2.D = bVar.W;
            bVar2.E = bVar.X;
            bVar2.F = bVar.Y;
            bVar2.f2233h = bVar.f2123c;
            bVar2.f2229f = bVar.f2119a;
            bVar2.f2231g = bVar.f2121b;
            bVar2.f2225d = ((ViewGroup.MarginLayoutParams) bVar).width;
            bVar2.f2227e = ((ViewGroup.MarginLayoutParams) bVar).height;
            bVar2.G = ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
            bVar2.H = ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
            bVar2.I = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
            bVar2.J = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
            bVar2.M = bVar.C;
            bVar2.U = bVar.L;
            bVar2.V = bVar.K;
            bVar2.X = bVar.N;
            bVar2.W = bVar.M;
            bVar2.f2244m0 = bVar.Z;
            bVar2.f2246n0 = bVar.f2120a0;
            bVar2.Y = bVar.O;
            bVar2.Z = bVar.P;
            bVar2.f2220a0 = bVar.S;
            bVar2.f2222b0 = bVar.T;
            bVar2.f2224c0 = bVar.Q;
            bVar2.f2226d0 = bVar.R;
            bVar2.f2228e0 = bVar.U;
            bVar2.f2230f0 = bVar.V;
            bVar2.f2242l0 = bVar.f2122b0;
            bVar2.O = bVar.f2163w;
            bVar2.Q = bVar.f2165y;
            bVar2.N = bVar.f2161v;
            bVar2.P = bVar.f2164x;
            bVar2.S = bVar.f2166z;
            bVar2.R = bVar.A;
            bVar2.T = bVar.B;
            bVar2.f2250p0 = bVar.f2124c0;
            bVar2.K = bVar.getMarginEnd();
            this.f2202e.L = bVar.getMarginStart();
        }

        public final void h(int i10, d.a aVar) {
            g(i10, aVar);
            this.f2200c.f2279d = aVar.f2297w0;
            e eVar = this.f2203f;
            eVar.f2283b = aVar.f2300z0;
            eVar.f2284c = aVar.A0;
            eVar.f2285d = aVar.B0;
            eVar.f2286e = aVar.C0;
            eVar.f2287f = aVar.D0;
            eVar.f2288g = aVar.E0;
            eVar.f2289h = aVar.F0;
            eVar.f2291j = aVar.G0;
            eVar.f2292k = aVar.H0;
            eVar.f2293l = aVar.I0;
            eVar.f2295n = aVar.f2299y0;
            eVar.f2294m = aVar.f2298x0;
        }

        public final void i(androidx.constraintlayout.widget.b bVar, int i10, d.a aVar) {
            h(i10, aVar);
            if (bVar instanceof androidx.constraintlayout.widget.a) {
                b bVar2 = this.f2202e;
                bVar2.f2236i0 = 1;
                androidx.constraintlayout.widget.a aVar2 = (androidx.constraintlayout.widget.a) bVar;
                bVar2.f2232g0 = aVar2.getType();
                this.f2202e.f2238j0 = aVar2.getReferencedIds();
                this.f2202e.f2234h0 = aVar2.getMargin();
            }
        }
    }

    public static class b {

        /* renamed from: q0, reason: collision with root package name */
        public static SparseIntArray f2218q0;

        /* renamed from: d, reason: collision with root package name */
        public int f2225d;

        /* renamed from: e, reason: collision with root package name */
        public int f2227e;

        /* renamed from: j0, reason: collision with root package name */
        public int[] f2238j0;

        /* renamed from: k0, reason: collision with root package name */
        public String f2240k0;

        /* renamed from: l0, reason: collision with root package name */
        public String f2242l0;

        /* renamed from: a, reason: collision with root package name */
        public boolean f2219a = false;

        /* renamed from: b, reason: collision with root package name */
        public boolean f2221b = false;

        /* renamed from: c, reason: collision with root package name */
        public boolean f2223c = false;

        /* renamed from: f, reason: collision with root package name */
        public int f2229f = -1;

        /* renamed from: g, reason: collision with root package name */
        public int f2231g = -1;

        /* renamed from: h, reason: collision with root package name */
        public float f2233h = -1.0f;

        /* renamed from: i, reason: collision with root package name */
        public int f2235i = -1;

        /* renamed from: j, reason: collision with root package name */
        public int f2237j = -1;

        /* renamed from: k, reason: collision with root package name */
        public int f2239k = -1;

        /* renamed from: l, reason: collision with root package name */
        public int f2241l = -1;

        /* renamed from: m, reason: collision with root package name */
        public int f2243m = -1;

        /* renamed from: n, reason: collision with root package name */
        public int f2245n = -1;

        /* renamed from: o, reason: collision with root package name */
        public int f2247o = -1;

        /* renamed from: p, reason: collision with root package name */
        public int f2249p = -1;

        /* renamed from: q, reason: collision with root package name */
        public int f2251q = -1;

        /* renamed from: r, reason: collision with root package name */
        public int f2252r = -1;

        /* renamed from: s, reason: collision with root package name */
        public int f2253s = -1;

        /* renamed from: t, reason: collision with root package name */
        public int f2254t = -1;

        /* renamed from: u, reason: collision with root package name */
        public int f2255u = -1;

        /* renamed from: v, reason: collision with root package name */
        public int f2256v = -1;

        /* renamed from: w, reason: collision with root package name */
        public int f2257w = -1;

        /* renamed from: x, reason: collision with root package name */
        public float f2258x = 0.5f;

        /* renamed from: y, reason: collision with root package name */
        public float f2259y = 0.5f;

        /* renamed from: z, reason: collision with root package name */
        public String f2260z = null;
        public int A = -1;
        public int B = 0;
        public float C = 0.0f;
        public int D = -1;
        public int E = -1;
        public int F = -1;
        public int G = 0;
        public int H = 0;
        public int I = 0;
        public int J = 0;
        public int K = 0;
        public int L = 0;
        public int M = 0;
        public int N = Integer.MIN_VALUE;
        public int O = Integer.MIN_VALUE;
        public int P = Integer.MIN_VALUE;
        public int Q = Integer.MIN_VALUE;
        public int R = Integer.MIN_VALUE;
        public int S = Integer.MIN_VALUE;
        public int T = Integer.MIN_VALUE;
        public float U = -1.0f;
        public float V = -1.0f;
        public int W = 0;
        public int X = 0;
        public int Y = 0;
        public int Z = 0;

        /* renamed from: a0, reason: collision with root package name */
        public int f2220a0 = -1;

        /* renamed from: b0, reason: collision with root package name */
        public int f2222b0 = -1;

        /* renamed from: c0, reason: collision with root package name */
        public int f2224c0 = -1;

        /* renamed from: d0, reason: collision with root package name */
        public int f2226d0 = -1;

        /* renamed from: e0, reason: collision with root package name */
        public float f2228e0 = 1.0f;

        /* renamed from: f0, reason: collision with root package name */
        public float f2230f0 = 1.0f;

        /* renamed from: g0, reason: collision with root package name */
        public int f2232g0 = -1;

        /* renamed from: h0, reason: collision with root package name */
        public int f2234h0 = 0;

        /* renamed from: i0, reason: collision with root package name */
        public int f2236i0 = -1;

        /* renamed from: m0, reason: collision with root package name */
        public boolean f2244m0 = false;

        /* renamed from: n0, reason: collision with root package name */
        public boolean f2246n0 = false;

        /* renamed from: o0, reason: collision with root package name */
        public boolean f2248o0 = true;

        /* renamed from: p0, reason: collision with root package name */
        public int f2250p0 = 0;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f2218q0 = sparseIntArray;
            sparseIntArray.append(b0.d.Layout_layout_constraintLeft_toLeftOf, 24);
            f2218q0.append(b0.d.Layout_layout_constraintLeft_toRightOf, 25);
            f2218q0.append(b0.d.Layout_layout_constraintRight_toLeftOf, 28);
            f2218q0.append(b0.d.Layout_layout_constraintRight_toRightOf, 29);
            f2218q0.append(b0.d.Layout_layout_constraintTop_toTopOf, 35);
            f2218q0.append(b0.d.Layout_layout_constraintTop_toBottomOf, 34);
            f2218q0.append(b0.d.Layout_layout_constraintBottom_toTopOf, 4);
            f2218q0.append(b0.d.Layout_layout_constraintBottom_toBottomOf, 3);
            f2218q0.append(b0.d.Layout_layout_constraintBaseline_toBaselineOf, 1);
            f2218q0.append(b0.d.Layout_layout_editor_absoluteX, 6);
            f2218q0.append(b0.d.Layout_layout_editor_absoluteY, 7);
            f2218q0.append(b0.d.Layout_layout_constraintGuide_begin, 17);
            f2218q0.append(b0.d.Layout_layout_constraintGuide_end, 18);
            f2218q0.append(b0.d.Layout_layout_constraintGuide_percent, 19);
            f2218q0.append(b0.d.Layout_android_orientation, 26);
            f2218q0.append(b0.d.Layout_layout_constraintStart_toEndOf, 31);
            f2218q0.append(b0.d.Layout_layout_constraintStart_toStartOf, 32);
            f2218q0.append(b0.d.Layout_layout_constraintEnd_toStartOf, 10);
            f2218q0.append(b0.d.Layout_layout_constraintEnd_toEndOf, 9);
            f2218q0.append(b0.d.Layout_layout_goneMarginLeft, 13);
            f2218q0.append(b0.d.Layout_layout_goneMarginTop, 16);
            f2218q0.append(b0.d.Layout_layout_goneMarginRight, 14);
            f2218q0.append(b0.d.Layout_layout_goneMarginBottom, 11);
            f2218q0.append(b0.d.Layout_layout_goneMarginStart, 15);
            f2218q0.append(b0.d.Layout_layout_goneMarginEnd, 12);
            f2218q0.append(b0.d.Layout_layout_constraintVertical_weight, 38);
            f2218q0.append(b0.d.Layout_layout_constraintHorizontal_weight, 37);
            f2218q0.append(b0.d.Layout_layout_constraintHorizontal_chainStyle, 39);
            f2218q0.append(b0.d.Layout_layout_constraintVertical_chainStyle, 40);
            f2218q0.append(b0.d.Layout_layout_constraintHorizontal_bias, 20);
            f2218q0.append(b0.d.Layout_layout_constraintVertical_bias, 36);
            f2218q0.append(b0.d.Layout_layout_constraintDimensionRatio, 5);
            f2218q0.append(b0.d.Layout_layout_constraintLeft_creator, 76);
            f2218q0.append(b0.d.Layout_layout_constraintTop_creator, 76);
            f2218q0.append(b0.d.Layout_layout_constraintRight_creator, 76);
            f2218q0.append(b0.d.Layout_layout_constraintBottom_creator, 76);
            f2218q0.append(b0.d.Layout_layout_constraintBaseline_creator, 76);
            f2218q0.append(b0.d.Layout_android_layout_marginLeft, 23);
            f2218q0.append(b0.d.Layout_android_layout_marginRight, 27);
            f2218q0.append(b0.d.Layout_android_layout_marginStart, 30);
            f2218q0.append(b0.d.Layout_android_layout_marginEnd, 8);
            f2218q0.append(b0.d.Layout_android_layout_marginTop, 33);
            f2218q0.append(b0.d.Layout_android_layout_marginBottom, 2);
            f2218q0.append(b0.d.Layout_android_layout_width, 22);
            f2218q0.append(b0.d.Layout_android_layout_height, 21);
            f2218q0.append(b0.d.Layout_layout_constraintWidth, 41);
            f2218q0.append(b0.d.Layout_layout_constraintHeight, 42);
            f2218q0.append(b0.d.Layout_layout_constrainedWidth, 41);
            f2218q0.append(b0.d.Layout_layout_constrainedHeight, 42);
            f2218q0.append(b0.d.Layout_layout_wrapBehaviorInParent, 97);
            f2218q0.append(b0.d.Layout_layout_constraintCircle, 61);
            f2218q0.append(b0.d.Layout_layout_constraintCircleRadius, 62);
            f2218q0.append(b0.d.Layout_layout_constraintCircleAngle, 63);
            f2218q0.append(b0.d.Layout_layout_constraintWidth_percent, 69);
            f2218q0.append(b0.d.Layout_layout_constraintHeight_percent, 70);
            f2218q0.append(b0.d.Layout_chainUseRtl, 71);
            f2218q0.append(b0.d.Layout_barrierDirection, 72);
            f2218q0.append(b0.d.Layout_barrierMargin, 73);
            f2218q0.append(b0.d.Layout_constraint_referenced_ids, 74);
            f2218q0.append(b0.d.Layout_barrierAllowsGoneWidgets, 75);
        }

        public void a(b bVar) {
            this.f2219a = bVar.f2219a;
            this.f2225d = bVar.f2225d;
            this.f2221b = bVar.f2221b;
            this.f2227e = bVar.f2227e;
            this.f2229f = bVar.f2229f;
            this.f2231g = bVar.f2231g;
            this.f2233h = bVar.f2233h;
            this.f2235i = bVar.f2235i;
            this.f2237j = bVar.f2237j;
            this.f2239k = bVar.f2239k;
            this.f2241l = bVar.f2241l;
            this.f2243m = bVar.f2243m;
            this.f2245n = bVar.f2245n;
            this.f2247o = bVar.f2247o;
            this.f2249p = bVar.f2249p;
            this.f2251q = bVar.f2251q;
            this.f2252r = bVar.f2252r;
            this.f2253s = bVar.f2253s;
            this.f2254t = bVar.f2254t;
            this.f2255u = bVar.f2255u;
            this.f2256v = bVar.f2256v;
            this.f2257w = bVar.f2257w;
            this.f2258x = bVar.f2258x;
            this.f2259y = bVar.f2259y;
            this.f2260z = bVar.f2260z;
            this.A = bVar.A;
            this.B = bVar.B;
            this.C = bVar.C;
            this.D = bVar.D;
            this.E = bVar.E;
            this.F = bVar.F;
            this.G = bVar.G;
            this.H = bVar.H;
            this.I = bVar.I;
            this.J = bVar.J;
            this.K = bVar.K;
            this.L = bVar.L;
            this.M = bVar.M;
            this.N = bVar.N;
            this.O = bVar.O;
            this.P = bVar.P;
            this.Q = bVar.Q;
            this.R = bVar.R;
            this.S = bVar.S;
            this.T = bVar.T;
            this.U = bVar.U;
            this.V = bVar.V;
            this.W = bVar.W;
            this.X = bVar.X;
            this.Y = bVar.Y;
            this.Z = bVar.Z;
            this.f2220a0 = bVar.f2220a0;
            this.f2222b0 = bVar.f2222b0;
            this.f2224c0 = bVar.f2224c0;
            this.f2226d0 = bVar.f2226d0;
            this.f2228e0 = bVar.f2228e0;
            this.f2230f0 = bVar.f2230f0;
            this.f2232g0 = bVar.f2232g0;
            this.f2234h0 = bVar.f2234h0;
            this.f2236i0 = bVar.f2236i0;
            this.f2242l0 = bVar.f2242l0;
            int[] iArr = bVar.f2238j0;
            if (iArr != null) {
                this.f2238j0 = Arrays.copyOf(iArr, iArr.length);
            } else {
                this.f2238j0 = null;
            }
            this.f2240k0 = bVar.f2240k0;
            this.f2244m0 = bVar.f2244m0;
            this.f2246n0 = bVar.f2246n0;
            this.f2248o0 = bVar.f2248o0;
            this.f2250p0 = bVar.f2250p0;
        }

        public void b(Context context, AttributeSet attributeSet) throws NumberFormatException {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b0.d.Layout);
            this.f2221b = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                int i11 = f2218q0.get(index);
                if (i11 == 80) {
                    this.f2244m0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f2244m0);
                } else if (i11 == 81) {
                    this.f2246n0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f2246n0);
                } else if (i11 != 97) {
                    switch (i11) {
                        case 1:
                            this.f2251q = c.E(typedArrayObtainStyledAttributes, index, this.f2251q);
                            break;
                        case 2:
                            this.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.J);
                            break;
                        case 3:
                            this.f2249p = c.E(typedArrayObtainStyledAttributes, index, this.f2249p);
                            break;
                        case 4:
                            this.f2247o = c.E(typedArrayObtainStyledAttributes, index, this.f2247o);
                            break;
                        case 5:
                            this.f2260z = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 6:
                            this.D = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.D);
                            break;
                        case 7:
                            this.E = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.E);
                            break;
                        case 8:
                            this.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.K);
                            break;
                        case 9:
                            this.f2257w = c.E(typedArrayObtainStyledAttributes, index, this.f2257w);
                            break;
                        case 10:
                            this.f2256v = c.E(typedArrayObtainStyledAttributes, index, this.f2256v);
                            break;
                        case 11:
                            this.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                            break;
                        case 12:
                            this.R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.R);
                            break;
                        case 13:
                            this.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.N);
                            break;
                        case 14:
                            this.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.P);
                            break;
                        case 15:
                            this.S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.S);
                            break;
                        case 16:
                            this.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.O);
                            break;
                        case 17:
                            this.f2229f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f2229f);
                            break;
                        case 18:
                            this.f2231g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f2231g);
                            break;
                        case 19:
                            this.f2233h = typedArrayObtainStyledAttributes.getFloat(index, this.f2233h);
                            break;
                        case 20:
                            this.f2258x = typedArrayObtainStyledAttributes.getFloat(index, this.f2258x);
                            break;
                        case 21:
                            this.f2227e = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f2227e);
                            break;
                        case 22:
                            this.f2225d = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f2225d);
                            break;
                        case 23:
                            this.G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.G);
                            break;
                        case 24:
                            this.f2235i = c.E(typedArrayObtainStyledAttributes, index, this.f2235i);
                            break;
                        case 25:
                            this.f2237j = c.E(typedArrayObtainStyledAttributes, index, this.f2237j);
                            break;
                        case 26:
                            this.F = typedArrayObtainStyledAttributes.getInt(index, this.F);
                            break;
                        case 27:
                            this.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.H);
                            break;
                        case 28:
                            this.f2239k = c.E(typedArrayObtainStyledAttributes, index, this.f2239k);
                            break;
                        case 29:
                            this.f2241l = c.E(typedArrayObtainStyledAttributes, index, this.f2241l);
                            break;
                        case 30:
                            this.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.L);
                            break;
                        case 31:
                            this.f2254t = c.E(typedArrayObtainStyledAttributes, index, this.f2254t);
                            break;
                        case 32:
                            this.f2255u = c.E(typedArrayObtainStyledAttributes, index, this.f2255u);
                            break;
                        case 33:
                            this.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.I);
                            break;
                        case 34:
                            this.f2245n = c.E(typedArrayObtainStyledAttributes, index, this.f2245n);
                            break;
                        case 35:
                            this.f2243m = c.E(typedArrayObtainStyledAttributes, index, this.f2243m);
                            break;
                        case 36:
                            this.f2259y = typedArrayObtainStyledAttributes.getFloat(index, this.f2259y);
                            break;
                        case 37:
                            this.V = typedArrayObtainStyledAttributes.getFloat(index, this.V);
                            break;
                        case 38:
                            this.U = typedArrayObtainStyledAttributes.getFloat(index, this.U);
                            break;
                        case 39:
                            this.W = typedArrayObtainStyledAttributes.getInt(index, this.W);
                            break;
                        case 40:
                            this.X = typedArrayObtainStyledAttributes.getInt(index, this.X);
                            break;
                        case 41:
                            c.F(this, typedArrayObtainStyledAttributes, index, 0);
                            break;
                        case 42:
                            c.F(this, typedArrayObtainStyledAttributes, index, 1);
                            break;
                        default:
                            switch (i11) {
                                case 54:
                                    this.Y = typedArrayObtainStyledAttributes.getInt(index, this.Y);
                                    break;
                                case 55:
                                    this.Z = typedArrayObtainStyledAttributes.getInt(index, this.Z);
                                    break;
                                case 56:
                                    this.f2220a0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f2220a0);
                                    break;
                                case 57:
                                    this.f2222b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f2222b0);
                                    break;
                                case 58:
                                    this.f2224c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f2224c0);
                                    break;
                                case 59:
                                    this.f2226d0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f2226d0);
                                    break;
                                default:
                                    switch (i11) {
                                        case 61:
                                            this.A = c.E(typedArrayObtainStyledAttributes, index, this.A);
                                            break;
                                        case 62:
                                            this.B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.B);
                                            break;
                                        case 63:
                                            this.C = typedArrayObtainStyledAttributes.getFloat(index, this.C);
                                            break;
                                        default:
                                            switch (i11) {
                                                case 69:
                                                    this.f2228e0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                                    break;
                                                case 70:
                                                    this.f2230f0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                                    break;
                                                case 71:
                                                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                                    break;
                                                case 72:
                                                    this.f2232g0 = typedArrayObtainStyledAttributes.getInt(index, this.f2232g0);
                                                    break;
                                                case 73:
                                                    this.f2234h0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f2234h0);
                                                    break;
                                                case 74:
                                                    this.f2240k0 = typedArrayObtainStyledAttributes.getString(index);
                                                    break;
                                                case 75:
                                                    this.f2248o0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f2248o0);
                                                    break;
                                                case 76:
                                                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f2218q0.get(index));
                                                    break;
                                                case 77:
                                                    this.f2242l0 = typedArrayObtainStyledAttributes.getString(index);
                                                    break;
                                                default:
                                                    switch (i11) {
                                                        case 91:
                                                            this.f2252r = c.E(typedArrayObtainStyledAttributes, index, this.f2252r);
                                                            break;
                                                        case 92:
                                                            this.f2253s = c.E(typedArrayObtainStyledAttributes, index, this.f2253s);
                                                            break;
                                                        case 93:
                                                            this.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.M);
                                                            break;
                                                        case 94:
                                                            this.T = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.T);
                                                            break;
                                                        default:
                                                            Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f2218q0.get(index));
                                                            break;
                                                    }
                                            }
                                    }
                            }
                    }
                } else {
                    this.f2250p0 = typedArrayObtainStyledAttributes.getInt(index, this.f2250p0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.c$c, reason: collision with other inner class name */
    public static class C0014c {

        /* renamed from: o, reason: collision with root package name */
        public static SparseIntArray f2261o;

        /* renamed from: a, reason: collision with root package name */
        public boolean f2262a = false;

        /* renamed from: b, reason: collision with root package name */
        public int f2263b = -1;

        /* renamed from: c, reason: collision with root package name */
        public int f2264c = 0;

        /* renamed from: d, reason: collision with root package name */
        public String f2265d = null;

        /* renamed from: e, reason: collision with root package name */
        public int f2266e = -1;

        /* renamed from: f, reason: collision with root package name */
        public int f2267f = 0;

        /* renamed from: g, reason: collision with root package name */
        public float f2268g = Float.NaN;

        /* renamed from: h, reason: collision with root package name */
        public int f2269h = -1;

        /* renamed from: i, reason: collision with root package name */
        public float f2270i = Float.NaN;

        /* renamed from: j, reason: collision with root package name */
        public float f2271j = Float.NaN;

        /* renamed from: k, reason: collision with root package name */
        public int f2272k = -1;

        /* renamed from: l, reason: collision with root package name */
        public String f2273l = null;

        /* renamed from: m, reason: collision with root package name */
        public int f2274m = -3;

        /* renamed from: n, reason: collision with root package name */
        public int f2275n = -1;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f2261o = sparseIntArray;
            sparseIntArray.append(b0.d.Motion_motionPathRotate, 1);
            f2261o.append(b0.d.Motion_pathMotionArc, 2);
            f2261o.append(b0.d.Motion_transitionEasing, 3);
            f2261o.append(b0.d.Motion_drawPath, 4);
            f2261o.append(b0.d.Motion_animateRelativeTo, 5);
            f2261o.append(b0.d.Motion_animateCircleAngleTo, 6);
            f2261o.append(b0.d.Motion_motionStagger, 7);
            f2261o.append(b0.d.Motion_quantizeMotionSteps, 8);
            f2261o.append(b0.d.Motion_quantizeMotionPhase, 9);
            f2261o.append(b0.d.Motion_quantizeMotionInterpolator, 10);
        }

        public void a(C0014c c0014c) {
            this.f2262a = c0014c.f2262a;
            this.f2263b = c0014c.f2263b;
            this.f2265d = c0014c.f2265d;
            this.f2266e = c0014c.f2266e;
            this.f2267f = c0014c.f2267f;
            this.f2270i = c0014c.f2270i;
            this.f2268g = c0014c.f2268g;
            this.f2269h = c0014c.f2269h;
        }

        public void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b0.d.Motion);
            this.f2262a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                switch (f2261o.get(index)) {
                    case 1:
                        this.f2270i = typedArrayObtainStyledAttributes.getFloat(index, this.f2270i);
                        break;
                    case 2:
                        this.f2266e = typedArrayObtainStyledAttributes.getInt(index, this.f2266e);
                        break;
                    case 3:
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            this.f2265d = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        } else {
                            this.f2265d = v.c.f24575c[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                            break;
                        }
                    case 4:
                        this.f2267f = typedArrayObtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f2263b = c.E(typedArrayObtainStyledAttributes, index, this.f2263b);
                        break;
                    case 6:
                        this.f2264c = typedArrayObtainStyledAttributes.getInteger(index, this.f2264c);
                        break;
                    case 7:
                        this.f2268g = typedArrayObtainStyledAttributes.getFloat(index, this.f2268g);
                        break;
                    case 8:
                        this.f2272k = typedArrayObtainStyledAttributes.getInteger(index, this.f2272k);
                        break;
                    case 9:
                        this.f2271j = typedArrayObtainStyledAttributes.getFloat(index, this.f2271j);
                        break;
                    case 10:
                        int i11 = typedArrayObtainStyledAttributes.peekValue(index).type;
                        if (i11 == 1) {
                            int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            this.f2275n = resourceId;
                            if (resourceId != -1) {
                                this.f2274m = -2;
                                break;
                            } else {
                                break;
                            }
                        } else if (i11 == 3) {
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            this.f2273l = string;
                            if (string.indexOf("/") > 0) {
                                this.f2275n = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                this.f2274m = -2;
                                break;
                            } else {
                                this.f2274m = -1;
                                break;
                            }
                        } else {
                            this.f2274m = typedArrayObtainStyledAttributes.getInteger(index, this.f2275n);
                            break;
                        }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public boolean f2276a = false;

        /* renamed from: b, reason: collision with root package name */
        public int f2277b = 0;

        /* renamed from: c, reason: collision with root package name */
        public int f2278c = 0;

        /* renamed from: d, reason: collision with root package name */
        public float f2279d = 1.0f;

        /* renamed from: e, reason: collision with root package name */
        public float f2280e = Float.NaN;

        public void a(d dVar) {
            this.f2276a = dVar.f2276a;
            this.f2277b = dVar.f2277b;
            this.f2279d = dVar.f2279d;
            this.f2280e = dVar.f2280e;
            this.f2278c = dVar.f2278c;
        }

        public void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b0.d.PropertySet);
            this.f2276a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == b0.d.PropertySet_android_alpha) {
                    this.f2279d = typedArrayObtainStyledAttributes.getFloat(index, this.f2279d);
                } else if (index == b0.d.PropertySet_android_visibility) {
                    this.f2277b = typedArrayObtainStyledAttributes.getInt(index, this.f2277b);
                    this.f2277b = c.f2188h[this.f2277b];
                } else if (index == b0.d.PropertySet_visibilityMode) {
                    this.f2278c = typedArrayObtainStyledAttributes.getInt(index, this.f2278c);
                } else if (index == b0.d.PropertySet_motionProgress) {
                    this.f2280e = typedArrayObtainStyledAttributes.getFloat(index, this.f2280e);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class e {

        /* renamed from: o, reason: collision with root package name */
        public static SparseIntArray f2281o;

        /* renamed from: a, reason: collision with root package name */
        public boolean f2282a = false;

        /* renamed from: b, reason: collision with root package name */
        public float f2283b = 0.0f;

        /* renamed from: c, reason: collision with root package name */
        public float f2284c = 0.0f;

        /* renamed from: d, reason: collision with root package name */
        public float f2285d = 0.0f;

        /* renamed from: e, reason: collision with root package name */
        public float f2286e = 1.0f;

        /* renamed from: f, reason: collision with root package name */
        public float f2287f = 1.0f;

        /* renamed from: g, reason: collision with root package name */
        public float f2288g = Float.NaN;

        /* renamed from: h, reason: collision with root package name */
        public float f2289h = Float.NaN;

        /* renamed from: i, reason: collision with root package name */
        public int f2290i = -1;

        /* renamed from: j, reason: collision with root package name */
        public float f2291j = 0.0f;

        /* renamed from: k, reason: collision with root package name */
        public float f2292k = 0.0f;

        /* renamed from: l, reason: collision with root package name */
        public float f2293l = 0.0f;

        /* renamed from: m, reason: collision with root package name */
        public boolean f2294m = false;

        /* renamed from: n, reason: collision with root package name */
        public float f2295n = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f2281o = sparseIntArray;
            sparseIntArray.append(b0.d.Transform_android_rotation, 1);
            f2281o.append(b0.d.Transform_android_rotationX, 2);
            f2281o.append(b0.d.Transform_android_rotationY, 3);
            f2281o.append(b0.d.Transform_android_scaleX, 4);
            f2281o.append(b0.d.Transform_android_scaleY, 5);
            f2281o.append(b0.d.Transform_android_transformPivotX, 6);
            f2281o.append(b0.d.Transform_android_transformPivotY, 7);
            f2281o.append(b0.d.Transform_android_translationX, 8);
            f2281o.append(b0.d.Transform_android_translationY, 9);
            f2281o.append(b0.d.Transform_android_translationZ, 10);
            f2281o.append(b0.d.Transform_android_elevation, 11);
            f2281o.append(b0.d.Transform_transformPivotTarget, 12);
        }

        public void a(e eVar) {
            this.f2282a = eVar.f2282a;
            this.f2283b = eVar.f2283b;
            this.f2284c = eVar.f2284c;
            this.f2285d = eVar.f2285d;
            this.f2286e = eVar.f2286e;
            this.f2287f = eVar.f2287f;
            this.f2288g = eVar.f2288g;
            this.f2289h = eVar.f2289h;
            this.f2290i = eVar.f2290i;
            this.f2291j = eVar.f2291j;
            this.f2292k = eVar.f2292k;
            this.f2293l = eVar.f2293l;
            this.f2294m = eVar.f2294m;
            this.f2295n = eVar.f2295n;
        }

        public void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b0.d.Transform);
            this.f2282a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                switch (f2281o.get(index)) {
                    case 1:
                        this.f2283b = typedArrayObtainStyledAttributes.getFloat(index, this.f2283b);
                        break;
                    case 2:
                        this.f2284c = typedArrayObtainStyledAttributes.getFloat(index, this.f2284c);
                        break;
                    case 3:
                        this.f2285d = typedArrayObtainStyledAttributes.getFloat(index, this.f2285d);
                        break;
                    case 4:
                        this.f2286e = typedArrayObtainStyledAttributes.getFloat(index, this.f2286e);
                        break;
                    case 5:
                        this.f2287f = typedArrayObtainStyledAttributes.getFloat(index, this.f2287f);
                        break;
                    case 6:
                        this.f2288g = typedArrayObtainStyledAttributes.getDimension(index, this.f2288g);
                        break;
                    case 7:
                        this.f2289h = typedArrayObtainStyledAttributes.getDimension(index, this.f2289h);
                        break;
                    case 8:
                        this.f2291j = typedArrayObtainStyledAttributes.getDimension(index, this.f2291j);
                        break;
                    case 9:
                        this.f2292k = typedArrayObtainStyledAttributes.getDimension(index, this.f2292k);
                        break;
                    case 10:
                        this.f2293l = typedArrayObtainStyledAttributes.getDimension(index, this.f2293l);
                        break;
                    case 11:
                        this.f2294m = true;
                        this.f2295n = typedArrayObtainStyledAttributes.getDimension(index, this.f2295n);
                        break;
                    case 12:
                        this.f2290i = c.E(typedArrayObtainStyledAttributes, index, this.f2290i);
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    static {
        f2189i.append(b0.d.Constraint_layout_constraintLeft_toLeftOf, 25);
        f2189i.append(b0.d.Constraint_layout_constraintLeft_toRightOf, 26);
        f2189i.append(b0.d.Constraint_layout_constraintRight_toLeftOf, 29);
        f2189i.append(b0.d.Constraint_layout_constraintRight_toRightOf, 30);
        f2189i.append(b0.d.Constraint_layout_constraintTop_toTopOf, 36);
        f2189i.append(b0.d.Constraint_layout_constraintTop_toBottomOf, 35);
        f2189i.append(b0.d.Constraint_layout_constraintBottom_toTopOf, 4);
        f2189i.append(b0.d.Constraint_layout_constraintBottom_toBottomOf, 3);
        f2189i.append(b0.d.Constraint_layout_constraintBaseline_toBaselineOf, 1);
        f2189i.append(b0.d.Constraint_layout_constraintBaseline_toTopOf, 91);
        f2189i.append(b0.d.Constraint_layout_constraintBaseline_toBottomOf, 92);
        f2189i.append(b0.d.Constraint_layout_editor_absoluteX, 6);
        f2189i.append(b0.d.Constraint_layout_editor_absoluteY, 7);
        f2189i.append(b0.d.Constraint_layout_constraintGuide_begin, 17);
        f2189i.append(b0.d.Constraint_layout_constraintGuide_end, 18);
        f2189i.append(b0.d.Constraint_layout_constraintGuide_percent, 19);
        f2189i.append(b0.d.Constraint_android_orientation, 27);
        f2189i.append(b0.d.Constraint_layout_constraintStart_toEndOf, 32);
        f2189i.append(b0.d.Constraint_layout_constraintStart_toStartOf, 33);
        f2189i.append(b0.d.Constraint_layout_constraintEnd_toStartOf, 10);
        f2189i.append(b0.d.Constraint_layout_constraintEnd_toEndOf, 9);
        f2189i.append(b0.d.Constraint_layout_goneMarginLeft, 13);
        f2189i.append(b0.d.Constraint_layout_goneMarginTop, 16);
        f2189i.append(b0.d.Constraint_layout_goneMarginRight, 14);
        f2189i.append(b0.d.Constraint_layout_goneMarginBottom, 11);
        f2189i.append(b0.d.Constraint_layout_goneMarginStart, 15);
        f2189i.append(b0.d.Constraint_layout_goneMarginEnd, 12);
        f2189i.append(b0.d.Constraint_layout_constraintVertical_weight, 40);
        f2189i.append(b0.d.Constraint_layout_constraintHorizontal_weight, 39);
        f2189i.append(b0.d.Constraint_layout_constraintHorizontal_chainStyle, 41);
        f2189i.append(b0.d.Constraint_layout_constraintVertical_chainStyle, 42);
        f2189i.append(b0.d.Constraint_layout_constraintHorizontal_bias, 20);
        f2189i.append(b0.d.Constraint_layout_constraintVertical_bias, 37);
        f2189i.append(b0.d.Constraint_layout_constraintDimensionRatio, 5);
        f2189i.append(b0.d.Constraint_layout_constraintLeft_creator, 87);
        f2189i.append(b0.d.Constraint_layout_constraintTop_creator, 87);
        f2189i.append(b0.d.Constraint_layout_constraintRight_creator, 87);
        f2189i.append(b0.d.Constraint_layout_constraintBottom_creator, 87);
        f2189i.append(b0.d.Constraint_layout_constraintBaseline_creator, 87);
        f2189i.append(b0.d.Constraint_android_layout_marginLeft, 24);
        f2189i.append(b0.d.Constraint_android_layout_marginRight, 28);
        f2189i.append(b0.d.Constraint_android_layout_marginStart, 31);
        f2189i.append(b0.d.Constraint_android_layout_marginEnd, 8);
        f2189i.append(b0.d.Constraint_android_layout_marginTop, 34);
        f2189i.append(b0.d.Constraint_android_layout_marginBottom, 2);
        f2189i.append(b0.d.Constraint_android_layout_width, 23);
        f2189i.append(b0.d.Constraint_android_layout_height, 21);
        f2189i.append(b0.d.Constraint_layout_constraintWidth, 95);
        f2189i.append(b0.d.Constraint_layout_constraintHeight, 96);
        f2189i.append(b0.d.Constraint_android_visibility, 22);
        f2189i.append(b0.d.Constraint_android_alpha, 43);
        f2189i.append(b0.d.Constraint_android_elevation, 44);
        f2189i.append(b0.d.Constraint_android_rotationX, 45);
        f2189i.append(b0.d.Constraint_android_rotationY, 46);
        f2189i.append(b0.d.Constraint_android_rotation, 60);
        f2189i.append(b0.d.Constraint_android_scaleX, 47);
        f2189i.append(b0.d.Constraint_android_scaleY, 48);
        f2189i.append(b0.d.Constraint_android_transformPivotX, 49);
        f2189i.append(b0.d.Constraint_android_transformPivotY, 50);
        f2189i.append(b0.d.Constraint_android_translationX, 51);
        f2189i.append(b0.d.Constraint_android_translationY, 52);
        f2189i.append(b0.d.Constraint_android_translationZ, 53);
        f2189i.append(b0.d.Constraint_layout_constraintWidth_default, 54);
        f2189i.append(b0.d.Constraint_layout_constraintHeight_default, 55);
        f2189i.append(b0.d.Constraint_layout_constraintWidth_max, 56);
        f2189i.append(b0.d.Constraint_layout_constraintHeight_max, 57);
        f2189i.append(b0.d.Constraint_layout_constraintWidth_min, 58);
        f2189i.append(b0.d.Constraint_layout_constraintHeight_min, 59);
        f2189i.append(b0.d.Constraint_layout_constraintCircle, 61);
        f2189i.append(b0.d.Constraint_layout_constraintCircleRadius, 62);
        f2189i.append(b0.d.Constraint_layout_constraintCircleAngle, 63);
        f2189i.append(b0.d.Constraint_animateRelativeTo, 64);
        f2189i.append(b0.d.Constraint_transitionEasing, 65);
        f2189i.append(b0.d.Constraint_drawPath, 66);
        f2189i.append(b0.d.Constraint_transitionPathRotate, 67);
        f2189i.append(b0.d.Constraint_motionStagger, 79);
        f2189i.append(b0.d.Constraint_android_id, 38);
        f2189i.append(b0.d.Constraint_motionProgress, 68);
        f2189i.append(b0.d.Constraint_layout_constraintWidth_percent, 69);
        f2189i.append(b0.d.Constraint_layout_constraintHeight_percent, 70);
        f2189i.append(b0.d.Constraint_layout_wrapBehaviorInParent, 97);
        f2189i.append(b0.d.Constraint_chainUseRtl, 71);
        f2189i.append(b0.d.Constraint_barrierDirection, 72);
        f2189i.append(b0.d.Constraint_barrierMargin, 73);
        f2189i.append(b0.d.Constraint_constraint_referenced_ids, 74);
        f2189i.append(b0.d.Constraint_barrierAllowsGoneWidgets, 75);
        f2189i.append(b0.d.Constraint_pathMotionArc, 76);
        f2189i.append(b0.d.Constraint_layout_constraintTag, 77);
        f2189i.append(b0.d.Constraint_visibilityMode, 78);
        f2189i.append(b0.d.Constraint_layout_constrainedWidth, 80);
        f2189i.append(b0.d.Constraint_layout_constrainedHeight, 81);
        f2189i.append(b0.d.Constraint_polarRelativeTo, 82);
        f2189i.append(b0.d.Constraint_transformPivotTarget, 83);
        f2189i.append(b0.d.Constraint_quantizeMotionSteps, 84);
        f2189i.append(b0.d.Constraint_quantizeMotionPhase, 85);
        f2189i.append(b0.d.Constraint_quantizeMotionInterpolator, 86);
        SparseIntArray sparseIntArray = f2190j;
        int i10 = b0.d.ConstraintOverride_layout_editor_absoluteY;
        sparseIntArray.append(i10, 6);
        f2190j.append(i10, 7);
        f2190j.append(b0.d.ConstraintOverride_android_orientation, 27);
        f2190j.append(b0.d.ConstraintOverride_layout_goneMarginLeft, 13);
        f2190j.append(b0.d.ConstraintOverride_layout_goneMarginTop, 16);
        f2190j.append(b0.d.ConstraintOverride_layout_goneMarginRight, 14);
        f2190j.append(b0.d.ConstraintOverride_layout_goneMarginBottom, 11);
        f2190j.append(b0.d.ConstraintOverride_layout_goneMarginStart, 15);
        f2190j.append(b0.d.ConstraintOverride_layout_goneMarginEnd, 12);
        f2190j.append(b0.d.ConstraintOverride_layout_constraintVertical_weight, 40);
        f2190j.append(b0.d.ConstraintOverride_layout_constraintHorizontal_weight, 39);
        f2190j.append(b0.d.ConstraintOverride_layout_constraintHorizontal_chainStyle, 41);
        f2190j.append(b0.d.ConstraintOverride_layout_constraintVertical_chainStyle, 42);
        f2190j.append(b0.d.ConstraintOverride_layout_constraintHorizontal_bias, 20);
        f2190j.append(b0.d.ConstraintOverride_layout_constraintVertical_bias, 37);
        f2190j.append(b0.d.ConstraintOverride_layout_constraintDimensionRatio, 5);
        f2190j.append(b0.d.ConstraintOverride_layout_constraintLeft_creator, 87);
        f2190j.append(b0.d.ConstraintOverride_layout_constraintTop_creator, 87);
        f2190j.append(b0.d.ConstraintOverride_layout_constraintRight_creator, 87);
        f2190j.append(b0.d.ConstraintOverride_layout_constraintBottom_creator, 87);
        f2190j.append(b0.d.ConstraintOverride_layout_constraintBaseline_creator, 87);
        f2190j.append(b0.d.ConstraintOverride_android_layout_marginLeft, 24);
        f2190j.append(b0.d.ConstraintOverride_android_layout_marginRight, 28);
        f2190j.append(b0.d.ConstraintOverride_android_layout_marginStart, 31);
        f2190j.append(b0.d.ConstraintOverride_android_layout_marginEnd, 8);
        f2190j.append(b0.d.ConstraintOverride_android_layout_marginTop, 34);
        f2190j.append(b0.d.ConstraintOverride_android_layout_marginBottom, 2);
        f2190j.append(b0.d.ConstraintOverride_android_layout_width, 23);
        f2190j.append(b0.d.ConstraintOverride_android_layout_height, 21);
        f2190j.append(b0.d.ConstraintOverride_layout_constraintWidth, 95);
        f2190j.append(b0.d.ConstraintOverride_layout_constraintHeight, 96);
        f2190j.append(b0.d.ConstraintOverride_android_visibility, 22);
        f2190j.append(b0.d.ConstraintOverride_android_alpha, 43);
        f2190j.append(b0.d.ConstraintOverride_android_elevation, 44);
        f2190j.append(b0.d.ConstraintOverride_android_rotationX, 45);
        f2190j.append(b0.d.ConstraintOverride_android_rotationY, 46);
        f2190j.append(b0.d.ConstraintOverride_android_rotation, 60);
        f2190j.append(b0.d.ConstraintOverride_android_scaleX, 47);
        f2190j.append(b0.d.ConstraintOverride_android_scaleY, 48);
        f2190j.append(b0.d.ConstraintOverride_android_transformPivotX, 49);
        f2190j.append(b0.d.ConstraintOverride_android_transformPivotY, 50);
        f2190j.append(b0.d.ConstraintOverride_android_translationX, 51);
        f2190j.append(b0.d.ConstraintOverride_android_translationY, 52);
        f2190j.append(b0.d.ConstraintOverride_android_translationZ, 53);
        f2190j.append(b0.d.ConstraintOverride_layout_constraintWidth_default, 54);
        f2190j.append(b0.d.ConstraintOverride_layout_constraintHeight_default, 55);
        f2190j.append(b0.d.ConstraintOverride_layout_constraintWidth_max, 56);
        f2190j.append(b0.d.ConstraintOverride_layout_constraintHeight_max, 57);
        f2190j.append(b0.d.ConstraintOverride_layout_constraintWidth_min, 58);
        f2190j.append(b0.d.ConstraintOverride_layout_constraintHeight_min, 59);
        f2190j.append(b0.d.ConstraintOverride_layout_constraintCircleRadius, 62);
        f2190j.append(b0.d.ConstraintOverride_layout_constraintCircleAngle, 63);
        f2190j.append(b0.d.ConstraintOverride_animateRelativeTo, 64);
        f2190j.append(b0.d.ConstraintOverride_transitionEasing, 65);
        f2190j.append(b0.d.ConstraintOverride_drawPath, 66);
        f2190j.append(b0.d.ConstraintOverride_transitionPathRotate, 67);
        f2190j.append(b0.d.ConstraintOverride_motionStagger, 79);
        f2190j.append(b0.d.ConstraintOverride_android_id, 38);
        f2190j.append(b0.d.ConstraintOverride_motionTarget, 98);
        f2190j.append(b0.d.ConstraintOverride_motionProgress, 68);
        f2190j.append(b0.d.ConstraintOverride_layout_constraintWidth_percent, 69);
        f2190j.append(b0.d.ConstraintOverride_layout_constraintHeight_percent, 70);
        f2190j.append(b0.d.ConstraintOverride_chainUseRtl, 71);
        f2190j.append(b0.d.ConstraintOverride_barrierDirection, 72);
        f2190j.append(b0.d.ConstraintOverride_barrierMargin, 73);
        f2190j.append(b0.d.ConstraintOverride_constraint_referenced_ids, 74);
        f2190j.append(b0.d.ConstraintOverride_barrierAllowsGoneWidgets, 75);
        f2190j.append(b0.d.ConstraintOverride_pathMotionArc, 76);
        f2190j.append(b0.d.ConstraintOverride_layout_constraintTag, 77);
        f2190j.append(b0.d.ConstraintOverride_visibilityMode, 78);
        f2190j.append(b0.d.ConstraintOverride_layout_constrainedWidth, 80);
        f2190j.append(b0.d.ConstraintOverride_layout_constrainedHeight, 81);
        f2190j.append(b0.d.ConstraintOverride_polarRelativeTo, 82);
        f2190j.append(b0.d.ConstraintOverride_transformPivotTarget, 83);
        f2190j.append(b0.d.ConstraintOverride_quantizeMotionSteps, 84);
        f2190j.append(b0.d.ConstraintOverride_quantizeMotionPhase, 85);
        f2190j.append(b0.d.ConstraintOverride_quantizeMotionInterpolator, 86);
        f2190j.append(b0.d.ConstraintOverride_layout_wrapBehaviorInParent, 97);
    }

    public static int E(TypedArray typedArray, int i10, int i11) {
        int resourceId = typedArray.getResourceId(i10, i11);
        return resourceId == -1 ? typedArray.getInt(i10, -1) : resourceId;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void F(java.lang.Object r4, android.content.res.TypedArray r5, int r6, int r7) throws java.lang.NumberFormatException {
        /*
            if (r4 != 0) goto L4
            goto L71
        L4:
            android.util.TypedValue r0 = r5.peekValue(r6)
            int r0 = r0.type
            r1 = 3
            if (r0 == r1) goto L72
            r1 = 5
            r2 = 0
            if (r0 == r1) goto L2b
            int r5 = r5.getInt(r6, r2)
            r6 = -4
            r0 = -2
            if (r5 == r6) goto L27
            r6 = -3
            if (r5 == r6) goto L21
            if (r5 == r0) goto L23
            r6 = -1
            if (r5 == r6) goto L23
        L21:
            r5 = r2
            goto L30
        L23:
            r3 = r2
            r2 = r5
            r5 = r3
            goto L30
        L27:
            r2 = 1
            r5 = r2
            r2 = r0
            goto L30
        L2b:
            int r5 = r5.getDimensionPixelSize(r6, r2)
            goto L23
        L30:
            boolean r6 = r4 instanceof androidx.constraintlayout.widget.ConstraintLayout.b
            if (r6 == 0) goto L42
            androidx.constraintlayout.widget.ConstraintLayout$b r4 = (androidx.constraintlayout.widget.ConstraintLayout.b) r4
            if (r7 != 0) goto L3d
            r4.width = r2
            r4.Z = r5
            return
        L3d:
            r4.height = r2
            r4.f2120a0 = r5
            return
        L42:
            boolean r6 = r4 instanceof androidx.constraintlayout.widget.c.b
            if (r6 == 0) goto L54
            androidx.constraintlayout.widget.c$b r4 = (androidx.constraintlayout.widget.c.b) r4
            if (r7 != 0) goto L4f
            r4.f2225d = r2
            r4.f2244m0 = r5
            return
        L4f:
            r4.f2227e = r2
            r4.f2246n0 = r5
            return
        L54:
            boolean r6 = r4 instanceof androidx.constraintlayout.widget.c.a.C0013a
            if (r6 == 0) goto L71
            androidx.constraintlayout.widget.c$a$a r4 = (androidx.constraintlayout.widget.c.a.C0013a) r4
            if (r7 != 0) goto L67
            r6 = 23
            r4.b(r6, r2)
            r6 = 80
            r4.d(r6, r5)
            return
        L67:
            r6 = 21
            r4.b(r6, r2)
            r6 = 81
            r4.d(r6, r5)
        L71:
            return
        L72:
            java.lang.String r5 = r5.getString(r6)
            G(r4, r5, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.c.F(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    public static void G(Object obj, String str, int i10) throws NumberFormatException {
        if (str == null) {
            return;
        }
        int iIndexOf = str.indexOf(61);
        int length = str.length();
        if (iIndexOf <= 0 || iIndexOf >= length - 1) {
            return;
        }
        String strSubstring = str.substring(0, iIndexOf);
        String strSubstring2 = str.substring(iIndexOf + 1);
        if (strSubstring2.length() > 0) {
            String strTrim = strSubstring.trim();
            String strTrim2 = strSubstring2.trim();
            if ("ratio".equalsIgnoreCase(strTrim)) {
                if (obj instanceof ConstraintLayout.b) {
                    ConstraintLayout.b bVar = (ConstraintLayout.b) obj;
                    if (i10 == 0) {
                        ((ViewGroup.MarginLayoutParams) bVar).width = 0;
                    } else {
                        ((ViewGroup.MarginLayoutParams) bVar).height = 0;
                    }
                    H(bVar, strTrim2);
                    return;
                }
                if (obj instanceof b) {
                    ((b) obj).f2260z = strTrim2;
                    return;
                } else {
                    if (obj instanceof a.C0013a) {
                        ((a.C0013a) obj).c(5, strTrim2);
                        return;
                    }
                    return;
                }
            }
            try {
                if ("weight".equalsIgnoreCase(strTrim)) {
                    float f10 = Float.parseFloat(strTrim2);
                    if (obj instanceof ConstraintLayout.b) {
                        ConstraintLayout.b bVar2 = (ConstraintLayout.b) obj;
                        if (i10 == 0) {
                            ((ViewGroup.MarginLayoutParams) bVar2).width = 0;
                            bVar2.K = f10;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) bVar2).height = 0;
                            bVar2.L = f10;
                            return;
                        }
                    }
                    if (obj instanceof b) {
                        b bVar3 = (b) obj;
                        if (i10 == 0) {
                            bVar3.f2225d = 0;
                            bVar3.V = f10;
                            return;
                        } else {
                            bVar3.f2227e = 0;
                            bVar3.U = f10;
                            return;
                        }
                    }
                    if (obj instanceof a.C0013a) {
                        a.C0013a c0013a = (a.C0013a) obj;
                        if (i10 == 0) {
                            c0013a.b(23, 0);
                            c0013a.a(39, f10);
                            return;
                        } else {
                            c0013a.b(21, 0);
                            c0013a.a(40, f10);
                            return;
                        }
                    }
                    return;
                }
                if ("parent".equalsIgnoreCase(strTrim)) {
                    float fMax = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(strTrim2)));
                    if (obj instanceof ConstraintLayout.b) {
                        ConstraintLayout.b bVar4 = (ConstraintLayout.b) obj;
                        if (i10 == 0) {
                            ((ViewGroup.MarginLayoutParams) bVar4).width = 0;
                            bVar4.U = fMax;
                            bVar4.O = 2;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) bVar4).height = 0;
                            bVar4.V = fMax;
                            bVar4.P = 2;
                            return;
                        }
                    }
                    if (obj instanceof b) {
                        b bVar5 = (b) obj;
                        if (i10 == 0) {
                            bVar5.f2225d = 0;
                            bVar5.f2228e0 = fMax;
                            bVar5.Y = 2;
                            return;
                        } else {
                            bVar5.f2227e = 0;
                            bVar5.f2230f0 = fMax;
                            bVar5.Z = 2;
                            return;
                        }
                    }
                    if (obj instanceof a.C0013a) {
                        a.C0013a c0013a2 = (a.C0013a) obj;
                        if (i10 == 0) {
                            c0013a2.b(23, 0);
                            c0013a2.b(54, 2);
                        } else {
                            c0013a2.b(21, 0);
                            c0013a2.b(55, 2);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    public static void H(ConstraintLayout.b bVar, String str) throws NumberFormatException {
        float fAbs = Float.NaN;
        int i10 = -1;
        if (str != null) {
            int length = str.length();
            int iIndexOf = str.indexOf(44);
            int i11 = 0;
            if (iIndexOf > 0 && iIndexOf < length - 1) {
                String strSubstring = str.substring(0, iIndexOf);
                if (strSubstring.equalsIgnoreCase("W")) {
                    i10 = 0;
                } else if (strSubstring.equalsIgnoreCase("H")) {
                    i10 = 1;
                }
                i11 = iIndexOf + 1;
            }
            int iIndexOf2 = str.indexOf(58);
            try {
                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                    String strSubstring2 = str.substring(i11);
                    if (strSubstring2.length() > 0) {
                        fAbs = Float.parseFloat(strSubstring2);
                    }
                } else {
                    String strSubstring3 = str.substring(i11, iIndexOf2);
                    String strSubstring4 = str.substring(iIndexOf2 + 1);
                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                        float f10 = Float.parseFloat(strSubstring3);
                        float f11 = Float.parseFloat(strSubstring4);
                        if (f10 > 0.0f && f11 > 0.0f) {
                            fAbs = i10 == 1 ? Math.abs(f11 / f10) : Math.abs(f10 / f11);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        bVar.H = str;
        bVar.I = fAbs;
        bVar.J = i10;
    }

    public static void J(Context context, a aVar, TypedArray typedArray) throws NumberFormatException {
        int indexCount = typedArray.getIndexCount();
        a.C0013a c0013a = new a.C0013a();
        aVar.f2205h = c0013a;
        aVar.f2201d.f2262a = false;
        aVar.f2202e.f2221b = false;
        aVar.f2200c.f2276a = false;
        aVar.f2203f.f2282a = false;
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArray.getIndex(i10);
            switch (f2190j.get(index)) {
                case 2:
                    c0013a.b(2, typedArray.getDimensionPixelSize(index, aVar.f2202e.J));
                    break;
                case 3:
                case 4:
                case 9:
                case 10:
                case 25:
                case 26:
                case 29:
                case 30:
                case 32:
                case 33:
                case 35:
                case 36:
                case 61:
                case 88:
                case 89:
                case 90:
                case 91:
                case 92:
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f2189i.get(index));
                    break;
                case 5:
                    c0013a.c(5, typedArray.getString(index));
                    break;
                case 6:
                    c0013a.b(6, typedArray.getDimensionPixelOffset(index, aVar.f2202e.D));
                    break;
                case 7:
                    c0013a.b(7, typedArray.getDimensionPixelOffset(index, aVar.f2202e.E));
                    break;
                case 8:
                    c0013a.b(8, typedArray.getDimensionPixelSize(index, aVar.f2202e.K));
                    break;
                case 11:
                    c0013a.b(11, typedArray.getDimensionPixelSize(index, aVar.f2202e.Q));
                    break;
                case 12:
                    c0013a.b(12, typedArray.getDimensionPixelSize(index, aVar.f2202e.R));
                    break;
                case 13:
                    c0013a.b(13, typedArray.getDimensionPixelSize(index, aVar.f2202e.N));
                    break;
                case 14:
                    c0013a.b(14, typedArray.getDimensionPixelSize(index, aVar.f2202e.P));
                    break;
                case 15:
                    c0013a.b(15, typedArray.getDimensionPixelSize(index, aVar.f2202e.S));
                    break;
                case 16:
                    c0013a.b(16, typedArray.getDimensionPixelSize(index, aVar.f2202e.O));
                    break;
                case 17:
                    c0013a.b(17, typedArray.getDimensionPixelOffset(index, aVar.f2202e.f2229f));
                    break;
                case 18:
                    c0013a.b(18, typedArray.getDimensionPixelOffset(index, aVar.f2202e.f2231g));
                    break;
                case 19:
                    c0013a.a(19, typedArray.getFloat(index, aVar.f2202e.f2233h));
                    break;
                case 20:
                    c0013a.a(20, typedArray.getFloat(index, aVar.f2202e.f2258x));
                    break;
                case 21:
                    c0013a.b(21, typedArray.getLayoutDimension(index, aVar.f2202e.f2227e));
                    break;
                case 22:
                    c0013a.b(22, f2188h[typedArray.getInt(index, aVar.f2200c.f2277b)]);
                    break;
                case 23:
                    c0013a.b(23, typedArray.getLayoutDimension(index, aVar.f2202e.f2225d));
                    break;
                case 24:
                    c0013a.b(24, typedArray.getDimensionPixelSize(index, aVar.f2202e.G));
                    break;
                case 27:
                    c0013a.b(27, typedArray.getInt(index, aVar.f2202e.F));
                    break;
                case 28:
                    c0013a.b(28, typedArray.getDimensionPixelSize(index, aVar.f2202e.H));
                    break;
                case 31:
                    c0013a.b(31, typedArray.getDimensionPixelSize(index, aVar.f2202e.L));
                    break;
                case 34:
                    c0013a.b(34, typedArray.getDimensionPixelSize(index, aVar.f2202e.I));
                    break;
                case 37:
                    c0013a.a(37, typedArray.getFloat(index, aVar.f2202e.f2259y));
                    break;
                case 38:
                    int resourceId = typedArray.getResourceId(index, aVar.f2198a);
                    aVar.f2198a = resourceId;
                    c0013a.b(38, resourceId);
                    break;
                case 39:
                    c0013a.a(39, typedArray.getFloat(index, aVar.f2202e.V));
                    break;
                case 40:
                    c0013a.a(40, typedArray.getFloat(index, aVar.f2202e.U));
                    break;
                case 41:
                    c0013a.b(41, typedArray.getInt(index, aVar.f2202e.W));
                    break;
                case 42:
                    c0013a.b(42, typedArray.getInt(index, aVar.f2202e.X));
                    break;
                case 43:
                    c0013a.a(43, typedArray.getFloat(index, aVar.f2200c.f2279d));
                    break;
                case 44:
                    c0013a.d(44, true);
                    c0013a.a(44, typedArray.getDimension(index, aVar.f2203f.f2295n));
                    break;
                case 45:
                    c0013a.a(45, typedArray.getFloat(index, aVar.f2203f.f2284c));
                    break;
                case 46:
                    c0013a.a(46, typedArray.getFloat(index, aVar.f2203f.f2285d));
                    break;
                case 47:
                    c0013a.a(47, typedArray.getFloat(index, aVar.f2203f.f2286e));
                    break;
                case 48:
                    c0013a.a(48, typedArray.getFloat(index, aVar.f2203f.f2287f));
                    break;
                case 49:
                    c0013a.a(49, typedArray.getDimension(index, aVar.f2203f.f2288g));
                    break;
                case 50:
                    c0013a.a(50, typedArray.getDimension(index, aVar.f2203f.f2289h));
                    break;
                case 51:
                    c0013a.a(51, typedArray.getDimension(index, aVar.f2203f.f2291j));
                    break;
                case 52:
                    c0013a.a(52, typedArray.getDimension(index, aVar.f2203f.f2292k));
                    break;
                case 53:
                    c0013a.a(53, typedArray.getDimension(index, aVar.f2203f.f2293l));
                    break;
                case 54:
                    c0013a.b(54, typedArray.getInt(index, aVar.f2202e.Y));
                    break;
                case 55:
                    c0013a.b(55, typedArray.getInt(index, aVar.f2202e.Z));
                    break;
                case 56:
                    c0013a.b(56, typedArray.getDimensionPixelSize(index, aVar.f2202e.f2220a0));
                    break;
                case 57:
                    c0013a.b(57, typedArray.getDimensionPixelSize(index, aVar.f2202e.f2222b0));
                    break;
                case 58:
                    c0013a.b(58, typedArray.getDimensionPixelSize(index, aVar.f2202e.f2224c0));
                    break;
                case 59:
                    c0013a.b(59, typedArray.getDimensionPixelSize(index, aVar.f2202e.f2226d0));
                    break;
                case 60:
                    c0013a.a(60, typedArray.getFloat(index, aVar.f2203f.f2283b));
                    break;
                case 62:
                    c0013a.b(62, typedArray.getDimensionPixelSize(index, aVar.f2202e.B));
                    break;
                case 63:
                    c0013a.a(63, typedArray.getFloat(index, aVar.f2202e.C));
                    break;
                case 64:
                    c0013a.b(64, E(typedArray, index, aVar.f2201d.f2263b));
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        c0013a.c(65, typedArray.getString(index));
                        break;
                    } else {
                        c0013a.c(65, v.c.f24575c[typedArray.getInteger(index, 0)]);
                        break;
                    }
                case 66:
                    c0013a.b(66, typedArray.getInt(index, 0));
                    break;
                case 67:
                    c0013a.a(67, typedArray.getFloat(index, aVar.f2201d.f2270i));
                    break;
                case 68:
                    c0013a.a(68, typedArray.getFloat(index, aVar.f2200c.f2280e));
                    break;
                case 69:
                    c0013a.a(69, typedArray.getFloat(index, 1.0f));
                    break;
                case 70:
                    c0013a.a(70, typedArray.getFloat(index, 1.0f));
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    c0013a.b(72, typedArray.getInt(index, aVar.f2202e.f2232g0));
                    break;
                case 73:
                    c0013a.b(73, typedArray.getDimensionPixelSize(index, aVar.f2202e.f2234h0));
                    break;
                case 74:
                    c0013a.c(74, typedArray.getString(index));
                    break;
                case 75:
                    c0013a.d(75, typedArray.getBoolean(index, aVar.f2202e.f2248o0));
                    break;
                case 76:
                    c0013a.b(76, typedArray.getInt(index, aVar.f2201d.f2266e));
                    break;
                case 77:
                    c0013a.c(77, typedArray.getString(index));
                    break;
                case 78:
                    c0013a.b(78, typedArray.getInt(index, aVar.f2200c.f2278c));
                    break;
                case 79:
                    c0013a.a(79, typedArray.getFloat(index, aVar.f2201d.f2268g));
                    break;
                case 80:
                    c0013a.d(80, typedArray.getBoolean(index, aVar.f2202e.f2244m0));
                    break;
                case 81:
                    c0013a.d(81, typedArray.getBoolean(index, aVar.f2202e.f2246n0));
                    break;
                case 82:
                    c0013a.b(82, typedArray.getInteger(index, aVar.f2201d.f2264c));
                    break;
                case 83:
                    c0013a.b(83, E(typedArray, index, aVar.f2203f.f2290i));
                    break;
                case 84:
                    c0013a.b(84, typedArray.getInteger(index, aVar.f2201d.f2272k));
                    break;
                case 85:
                    c0013a.a(85, typedArray.getFloat(index, aVar.f2201d.f2271j));
                    break;
                case 86:
                    int i11 = typedArray.peekValue(index).type;
                    if (i11 == 1) {
                        aVar.f2201d.f2275n = typedArray.getResourceId(index, -1);
                        c0013a.b(89, aVar.f2201d.f2275n);
                        C0014c c0014c = aVar.f2201d;
                        if (c0014c.f2275n != -1) {
                            c0014c.f2274m = -2;
                            c0013a.b(88, -2);
                            break;
                        } else {
                            break;
                        }
                    } else if (i11 == 3) {
                        aVar.f2201d.f2273l = typedArray.getString(index);
                        c0013a.c(90, aVar.f2201d.f2273l);
                        if (aVar.f2201d.f2273l.indexOf("/") > 0) {
                            aVar.f2201d.f2275n = typedArray.getResourceId(index, -1);
                            c0013a.b(89, aVar.f2201d.f2275n);
                            aVar.f2201d.f2274m = -2;
                            c0013a.b(88, -2);
                            break;
                        } else {
                            aVar.f2201d.f2274m = -1;
                            c0013a.b(88, -1);
                            break;
                        }
                    } else {
                        C0014c c0014c2 = aVar.f2201d;
                        c0014c2.f2274m = typedArray.getInteger(index, c0014c2.f2275n);
                        c0013a.b(88, aVar.f2201d.f2274m);
                        break;
                    }
                case 87:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f2189i.get(index));
                    break;
                case 93:
                    c0013a.b(93, typedArray.getDimensionPixelSize(index, aVar.f2202e.M));
                    break;
                case 94:
                    c0013a.b(94, typedArray.getDimensionPixelSize(index, aVar.f2202e.T));
                    break;
                case 95:
                    F(c0013a, typedArray, index, 0);
                    break;
                case 96:
                    F(c0013a, typedArray, index, 1);
                    break;
                case 97:
                    c0013a.b(97, typedArray.getInt(index, aVar.f2202e.f2250p0));
                    break;
                case 98:
                    if (MotionLayout.f1870c1) {
                        int resourceId2 = typedArray.getResourceId(index, aVar.f2198a);
                        aVar.f2198a = resourceId2;
                        if (resourceId2 == -1) {
                            aVar.f2199b = typedArray.getString(index);
                            break;
                        } else {
                            break;
                        }
                    } else if (typedArray.peekValue(index).type == 3) {
                        aVar.f2199b = typedArray.getString(index);
                        break;
                    } else {
                        aVar.f2198a = typedArray.getResourceId(index, aVar.f2198a);
                        break;
                    }
            }
        }
    }

    public static void M(a aVar, int i10, float f10) {
        if (i10 == 19) {
            aVar.f2202e.f2233h = f10;
            return;
        }
        if (i10 == 20) {
            aVar.f2202e.f2258x = f10;
            return;
        }
        if (i10 == 37) {
            aVar.f2202e.f2259y = f10;
            return;
        }
        if (i10 == 60) {
            aVar.f2203f.f2283b = f10;
            return;
        }
        if (i10 == 63) {
            aVar.f2202e.C = f10;
            return;
        }
        if (i10 == 79) {
            aVar.f2201d.f2268g = f10;
            return;
        }
        if (i10 == 85) {
            aVar.f2201d.f2271j = f10;
            return;
        }
        if (i10 != 87) {
            if (i10 == 39) {
                aVar.f2202e.V = f10;
                return;
            }
            if (i10 == 40) {
                aVar.f2202e.U = f10;
                return;
            }
            switch (i10) {
                case 43:
                    aVar.f2200c.f2279d = f10;
                    break;
                case 44:
                    e eVar = aVar.f2203f;
                    eVar.f2295n = f10;
                    eVar.f2294m = true;
                    break;
                case 45:
                    aVar.f2203f.f2284c = f10;
                    break;
                case 46:
                    aVar.f2203f.f2285d = f10;
                    break;
                case 47:
                    aVar.f2203f.f2286e = f10;
                    break;
                case 48:
                    aVar.f2203f.f2287f = f10;
                    break;
                case 49:
                    aVar.f2203f.f2288g = f10;
                    break;
                case 50:
                    aVar.f2203f.f2289h = f10;
                    break;
                case 51:
                    aVar.f2203f.f2291j = f10;
                    break;
                case 52:
                    aVar.f2203f.f2292k = f10;
                    break;
                case 53:
                    aVar.f2203f.f2293l = f10;
                    break;
                default:
                    switch (i10) {
                        case 67:
                            aVar.f2201d.f2270i = f10;
                            break;
                        case 68:
                            aVar.f2200c.f2280e = f10;
                            break;
                        case 69:
                            aVar.f2202e.f2228e0 = f10;
                            break;
                        case 70:
                            aVar.f2202e.f2230f0 = f10;
                            break;
                        default:
                            Log.w("ConstraintSet", "Unknown attribute 0x");
                            break;
                    }
            }
        }
    }

    public static void N(a aVar, int i10, int i11) {
        if (i10 == 6) {
            aVar.f2202e.D = i11;
            return;
        }
        if (i10 == 7) {
            aVar.f2202e.E = i11;
            return;
        }
        if (i10 == 8) {
            aVar.f2202e.K = i11;
            return;
        }
        if (i10 == 27) {
            aVar.f2202e.F = i11;
            return;
        }
        if (i10 == 28) {
            aVar.f2202e.H = i11;
            return;
        }
        if (i10 == 41) {
            aVar.f2202e.W = i11;
            return;
        }
        if (i10 == 42) {
            aVar.f2202e.X = i11;
            return;
        }
        if (i10 == 61) {
            aVar.f2202e.A = i11;
            return;
        }
        if (i10 == 62) {
            aVar.f2202e.B = i11;
            return;
        }
        if (i10 == 72) {
            aVar.f2202e.f2232g0 = i11;
            return;
        }
        if (i10 == 73) {
            aVar.f2202e.f2234h0 = i11;
            return;
        }
        switch (i10) {
            case 2:
                aVar.f2202e.J = i11;
                break;
            case 11:
                aVar.f2202e.Q = i11;
                break;
            case 12:
                aVar.f2202e.R = i11;
                break;
            case 13:
                aVar.f2202e.N = i11;
                break;
            case 14:
                aVar.f2202e.P = i11;
                break;
            case 15:
                aVar.f2202e.S = i11;
                break;
            case 16:
                aVar.f2202e.O = i11;
                break;
            case 17:
                aVar.f2202e.f2229f = i11;
                break;
            case 18:
                aVar.f2202e.f2231g = i11;
                break;
            case 31:
                aVar.f2202e.L = i11;
                break;
            case 34:
                aVar.f2202e.I = i11;
                break;
            case 38:
                aVar.f2198a = i11;
                break;
            case 64:
                aVar.f2201d.f2263b = i11;
                break;
            case 66:
                aVar.f2201d.f2267f = i11;
                break;
            case 76:
                aVar.f2201d.f2266e = i11;
                break;
            case 78:
                aVar.f2200c.f2278c = i11;
                break;
            case 93:
                aVar.f2202e.M = i11;
                break;
            case 94:
                aVar.f2202e.T = i11;
                break;
            case 97:
                aVar.f2202e.f2250p0 = i11;
                break;
            default:
                switch (i10) {
                    case 21:
                        aVar.f2202e.f2227e = i11;
                        break;
                    case 22:
                        aVar.f2200c.f2277b = i11;
                        break;
                    case 23:
                        aVar.f2202e.f2225d = i11;
                        break;
                    case 24:
                        aVar.f2202e.G = i11;
                        break;
                    default:
                        switch (i10) {
                            case 54:
                                aVar.f2202e.Y = i11;
                                break;
                            case 55:
                                aVar.f2202e.Z = i11;
                                break;
                            case 56:
                                aVar.f2202e.f2220a0 = i11;
                                break;
                            case 57:
                                aVar.f2202e.f2222b0 = i11;
                                break;
                            case 58:
                                aVar.f2202e.f2224c0 = i11;
                                break;
                            case 59:
                                aVar.f2202e.f2226d0 = i11;
                                break;
                            default:
                                switch (i10) {
                                    case 82:
                                        aVar.f2201d.f2264c = i11;
                                        break;
                                    case 83:
                                        aVar.f2203f.f2290i = i11;
                                        break;
                                    case 84:
                                        aVar.f2201d.f2272k = i11;
                                        break;
                                    default:
                                        switch (i10) {
                                            case 87:
                                                break;
                                            case 88:
                                                aVar.f2201d.f2274m = i11;
                                                break;
                                            case 89:
                                                aVar.f2201d.f2275n = i11;
                                                break;
                                            default:
                                                Log.w("ConstraintSet", "Unknown attribute 0x");
                                                break;
                                        }
                                }
                        }
                }
        }
    }

    public static void O(a aVar, int i10, String str) {
        if (i10 == 5) {
            aVar.f2202e.f2260z = str;
            return;
        }
        if (i10 == 65) {
            aVar.f2201d.f2265d = str;
            return;
        }
        if (i10 == 74) {
            aVar.f2202e.f2240k0 = str;
            return;
        }
        if (i10 == 77) {
            aVar.f2202e.f2242l0 = str;
        } else if (i10 != 87) {
            if (i10 != 90) {
                Log.w("ConstraintSet", "Unknown attribute 0x");
            } else {
                aVar.f2201d.f2273l = str;
            }
        }
    }

    public static void P(a aVar, int i10, boolean z10) {
        if (i10 == 44) {
            aVar.f2203f.f2294m = z10;
            return;
        }
        if (i10 == 75) {
            aVar.f2202e.f2248o0 = z10;
            return;
        }
        if (i10 != 87) {
            if (i10 == 80) {
                aVar.f2202e.f2244m0 = z10;
            } else if (i10 != 81) {
                Log.w("ConstraintSet", "Unknown attribute 0x");
            } else {
                aVar.f2202e.f2246n0 = z10;
            }
        }
    }

    public static a m(Context context, XmlPullParser xmlPullParser) throws NumberFormatException {
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlPullParser);
        a aVar = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSetAsAttributeSet, b0.d.ConstraintOverride);
        J(context, aVar, typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        return aVar;
    }

    public int A(int i10) {
        return u(i10).f2200c.f2278c;
    }

    public int B(int i10) {
        return u(i10).f2202e.f2225d;
    }

    public void C(Context context, int i10) throws XmlPullParserException, Resources.NotFoundException, IOException, NumberFormatException {
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    a aVarT = t(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        aVarT.f2202e.f2219a = true;
                    }
                    this.f2197g.put(Integer.valueOf(aVarT.f2198a), aVarT);
                }
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x01ce, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void D(android.content.Context r10, org.xmlpull.v1.XmlPullParser r11) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 560
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.c.D(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }

    public final void I(Context context, a aVar, TypedArray typedArray, boolean z10) throws NumberFormatException {
        if (z10) {
            J(context, aVar, typedArray);
            return;
        }
        int indexCount = typedArray.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArray.getIndex(i10);
            if (index != b0.d.Constraint_android_id && b0.d.Constraint_android_layout_marginStart != index && b0.d.Constraint_android_layout_marginEnd != index) {
                aVar.f2201d.f2262a = true;
                aVar.f2202e.f2221b = true;
                aVar.f2200c.f2276a = true;
                aVar.f2203f.f2282a = true;
            }
            switch (f2189i.get(index)) {
                case 1:
                    b bVar = aVar.f2202e;
                    bVar.f2251q = E(typedArray, index, bVar.f2251q);
                    break;
                case 2:
                    b bVar2 = aVar.f2202e;
                    bVar2.J = typedArray.getDimensionPixelSize(index, bVar2.J);
                    break;
                case 3:
                    b bVar3 = aVar.f2202e;
                    bVar3.f2249p = E(typedArray, index, bVar3.f2249p);
                    break;
                case 4:
                    b bVar4 = aVar.f2202e;
                    bVar4.f2247o = E(typedArray, index, bVar4.f2247o);
                    break;
                case 5:
                    aVar.f2202e.f2260z = typedArray.getString(index);
                    break;
                case 6:
                    b bVar5 = aVar.f2202e;
                    bVar5.D = typedArray.getDimensionPixelOffset(index, bVar5.D);
                    break;
                case 7:
                    b bVar6 = aVar.f2202e;
                    bVar6.E = typedArray.getDimensionPixelOffset(index, bVar6.E);
                    break;
                case 8:
                    b bVar7 = aVar.f2202e;
                    bVar7.K = typedArray.getDimensionPixelSize(index, bVar7.K);
                    break;
                case 9:
                    b bVar8 = aVar.f2202e;
                    bVar8.f2257w = E(typedArray, index, bVar8.f2257w);
                    break;
                case 10:
                    b bVar9 = aVar.f2202e;
                    bVar9.f2256v = E(typedArray, index, bVar9.f2256v);
                    break;
                case 11:
                    b bVar10 = aVar.f2202e;
                    bVar10.Q = typedArray.getDimensionPixelSize(index, bVar10.Q);
                    break;
                case 12:
                    b bVar11 = aVar.f2202e;
                    bVar11.R = typedArray.getDimensionPixelSize(index, bVar11.R);
                    break;
                case 13:
                    b bVar12 = aVar.f2202e;
                    bVar12.N = typedArray.getDimensionPixelSize(index, bVar12.N);
                    break;
                case 14:
                    b bVar13 = aVar.f2202e;
                    bVar13.P = typedArray.getDimensionPixelSize(index, bVar13.P);
                    break;
                case 15:
                    b bVar14 = aVar.f2202e;
                    bVar14.S = typedArray.getDimensionPixelSize(index, bVar14.S);
                    break;
                case 16:
                    b bVar15 = aVar.f2202e;
                    bVar15.O = typedArray.getDimensionPixelSize(index, bVar15.O);
                    break;
                case 17:
                    b bVar16 = aVar.f2202e;
                    bVar16.f2229f = typedArray.getDimensionPixelOffset(index, bVar16.f2229f);
                    break;
                case 18:
                    b bVar17 = aVar.f2202e;
                    bVar17.f2231g = typedArray.getDimensionPixelOffset(index, bVar17.f2231g);
                    break;
                case 19:
                    b bVar18 = aVar.f2202e;
                    bVar18.f2233h = typedArray.getFloat(index, bVar18.f2233h);
                    break;
                case 20:
                    b bVar19 = aVar.f2202e;
                    bVar19.f2258x = typedArray.getFloat(index, bVar19.f2258x);
                    break;
                case 21:
                    b bVar20 = aVar.f2202e;
                    bVar20.f2227e = typedArray.getLayoutDimension(index, bVar20.f2227e);
                    break;
                case 22:
                    d dVar = aVar.f2200c;
                    dVar.f2277b = typedArray.getInt(index, dVar.f2277b);
                    d dVar2 = aVar.f2200c;
                    dVar2.f2277b = f2188h[dVar2.f2277b];
                    break;
                case 23:
                    b bVar21 = aVar.f2202e;
                    bVar21.f2225d = typedArray.getLayoutDimension(index, bVar21.f2225d);
                    break;
                case 24:
                    b bVar22 = aVar.f2202e;
                    bVar22.G = typedArray.getDimensionPixelSize(index, bVar22.G);
                    break;
                case 25:
                    b bVar23 = aVar.f2202e;
                    bVar23.f2235i = E(typedArray, index, bVar23.f2235i);
                    break;
                case 26:
                    b bVar24 = aVar.f2202e;
                    bVar24.f2237j = E(typedArray, index, bVar24.f2237j);
                    break;
                case 27:
                    b bVar25 = aVar.f2202e;
                    bVar25.F = typedArray.getInt(index, bVar25.F);
                    break;
                case 28:
                    b bVar26 = aVar.f2202e;
                    bVar26.H = typedArray.getDimensionPixelSize(index, bVar26.H);
                    break;
                case 29:
                    b bVar27 = aVar.f2202e;
                    bVar27.f2239k = E(typedArray, index, bVar27.f2239k);
                    break;
                case 30:
                    b bVar28 = aVar.f2202e;
                    bVar28.f2241l = E(typedArray, index, bVar28.f2241l);
                    break;
                case 31:
                    b bVar29 = aVar.f2202e;
                    bVar29.L = typedArray.getDimensionPixelSize(index, bVar29.L);
                    break;
                case 32:
                    b bVar30 = aVar.f2202e;
                    bVar30.f2254t = E(typedArray, index, bVar30.f2254t);
                    break;
                case 33:
                    b bVar31 = aVar.f2202e;
                    bVar31.f2255u = E(typedArray, index, bVar31.f2255u);
                    break;
                case 34:
                    b bVar32 = aVar.f2202e;
                    bVar32.I = typedArray.getDimensionPixelSize(index, bVar32.I);
                    break;
                case 35:
                    b bVar33 = aVar.f2202e;
                    bVar33.f2245n = E(typedArray, index, bVar33.f2245n);
                    break;
                case 36:
                    b bVar34 = aVar.f2202e;
                    bVar34.f2243m = E(typedArray, index, bVar34.f2243m);
                    break;
                case 37:
                    b bVar35 = aVar.f2202e;
                    bVar35.f2259y = typedArray.getFloat(index, bVar35.f2259y);
                    break;
                case 38:
                    aVar.f2198a = typedArray.getResourceId(index, aVar.f2198a);
                    break;
                case 39:
                    b bVar36 = aVar.f2202e;
                    bVar36.V = typedArray.getFloat(index, bVar36.V);
                    break;
                case 40:
                    b bVar37 = aVar.f2202e;
                    bVar37.U = typedArray.getFloat(index, bVar37.U);
                    break;
                case 41:
                    b bVar38 = aVar.f2202e;
                    bVar38.W = typedArray.getInt(index, bVar38.W);
                    break;
                case 42:
                    b bVar39 = aVar.f2202e;
                    bVar39.X = typedArray.getInt(index, bVar39.X);
                    break;
                case 43:
                    d dVar3 = aVar.f2200c;
                    dVar3.f2279d = typedArray.getFloat(index, dVar3.f2279d);
                    break;
                case 44:
                    e eVar = aVar.f2203f;
                    eVar.f2294m = true;
                    eVar.f2295n = typedArray.getDimension(index, eVar.f2295n);
                    break;
                case 45:
                    e eVar2 = aVar.f2203f;
                    eVar2.f2284c = typedArray.getFloat(index, eVar2.f2284c);
                    break;
                case 46:
                    e eVar3 = aVar.f2203f;
                    eVar3.f2285d = typedArray.getFloat(index, eVar3.f2285d);
                    break;
                case 47:
                    e eVar4 = aVar.f2203f;
                    eVar4.f2286e = typedArray.getFloat(index, eVar4.f2286e);
                    break;
                case 48:
                    e eVar5 = aVar.f2203f;
                    eVar5.f2287f = typedArray.getFloat(index, eVar5.f2287f);
                    break;
                case 49:
                    e eVar6 = aVar.f2203f;
                    eVar6.f2288g = typedArray.getDimension(index, eVar6.f2288g);
                    break;
                case 50:
                    e eVar7 = aVar.f2203f;
                    eVar7.f2289h = typedArray.getDimension(index, eVar7.f2289h);
                    break;
                case 51:
                    e eVar8 = aVar.f2203f;
                    eVar8.f2291j = typedArray.getDimension(index, eVar8.f2291j);
                    break;
                case 52:
                    e eVar9 = aVar.f2203f;
                    eVar9.f2292k = typedArray.getDimension(index, eVar9.f2292k);
                    break;
                case 53:
                    e eVar10 = aVar.f2203f;
                    eVar10.f2293l = typedArray.getDimension(index, eVar10.f2293l);
                    break;
                case 54:
                    b bVar40 = aVar.f2202e;
                    bVar40.Y = typedArray.getInt(index, bVar40.Y);
                    break;
                case 55:
                    b bVar41 = aVar.f2202e;
                    bVar41.Z = typedArray.getInt(index, bVar41.Z);
                    break;
                case 56:
                    b bVar42 = aVar.f2202e;
                    bVar42.f2220a0 = typedArray.getDimensionPixelSize(index, bVar42.f2220a0);
                    break;
                case 57:
                    b bVar43 = aVar.f2202e;
                    bVar43.f2222b0 = typedArray.getDimensionPixelSize(index, bVar43.f2222b0);
                    break;
                case 58:
                    b bVar44 = aVar.f2202e;
                    bVar44.f2224c0 = typedArray.getDimensionPixelSize(index, bVar44.f2224c0);
                    break;
                case 59:
                    b bVar45 = aVar.f2202e;
                    bVar45.f2226d0 = typedArray.getDimensionPixelSize(index, bVar45.f2226d0);
                    break;
                case 60:
                    e eVar11 = aVar.f2203f;
                    eVar11.f2283b = typedArray.getFloat(index, eVar11.f2283b);
                    break;
                case 61:
                    b bVar46 = aVar.f2202e;
                    bVar46.A = E(typedArray, index, bVar46.A);
                    break;
                case 62:
                    b bVar47 = aVar.f2202e;
                    bVar47.B = typedArray.getDimensionPixelSize(index, bVar47.B);
                    break;
                case 63:
                    b bVar48 = aVar.f2202e;
                    bVar48.C = typedArray.getFloat(index, bVar48.C);
                    break;
                case 64:
                    C0014c c0014c = aVar.f2201d;
                    c0014c.f2263b = E(typedArray, index, c0014c.f2263b);
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        aVar.f2201d.f2265d = typedArray.getString(index);
                        break;
                    } else {
                        aVar.f2201d.f2265d = v.c.f24575c[typedArray.getInteger(index, 0)];
                        break;
                    }
                case 66:
                    aVar.f2201d.f2267f = typedArray.getInt(index, 0);
                    break;
                case 67:
                    C0014c c0014c2 = aVar.f2201d;
                    c0014c2.f2270i = typedArray.getFloat(index, c0014c2.f2270i);
                    break;
                case 68:
                    d dVar4 = aVar.f2200c;
                    dVar4.f2280e = typedArray.getFloat(index, dVar4.f2280e);
                    break;
                case 69:
                    aVar.f2202e.f2228e0 = typedArray.getFloat(index, 1.0f);
                    break;
                case 70:
                    aVar.f2202e.f2230f0 = typedArray.getFloat(index, 1.0f);
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    b bVar49 = aVar.f2202e;
                    bVar49.f2232g0 = typedArray.getInt(index, bVar49.f2232g0);
                    break;
                case 73:
                    b bVar50 = aVar.f2202e;
                    bVar50.f2234h0 = typedArray.getDimensionPixelSize(index, bVar50.f2234h0);
                    break;
                case 74:
                    aVar.f2202e.f2240k0 = typedArray.getString(index);
                    break;
                case 75:
                    b bVar51 = aVar.f2202e;
                    bVar51.f2248o0 = typedArray.getBoolean(index, bVar51.f2248o0);
                    break;
                case 76:
                    C0014c c0014c3 = aVar.f2201d;
                    c0014c3.f2266e = typedArray.getInt(index, c0014c3.f2266e);
                    break;
                case 77:
                    aVar.f2202e.f2242l0 = typedArray.getString(index);
                    break;
                case 78:
                    d dVar5 = aVar.f2200c;
                    dVar5.f2278c = typedArray.getInt(index, dVar5.f2278c);
                    break;
                case 79:
                    C0014c c0014c4 = aVar.f2201d;
                    c0014c4.f2268g = typedArray.getFloat(index, c0014c4.f2268g);
                    break;
                case 80:
                    b bVar52 = aVar.f2202e;
                    bVar52.f2244m0 = typedArray.getBoolean(index, bVar52.f2244m0);
                    break;
                case 81:
                    b bVar53 = aVar.f2202e;
                    bVar53.f2246n0 = typedArray.getBoolean(index, bVar53.f2246n0);
                    break;
                case 82:
                    C0014c c0014c5 = aVar.f2201d;
                    c0014c5.f2264c = typedArray.getInteger(index, c0014c5.f2264c);
                    break;
                case 83:
                    e eVar12 = aVar.f2203f;
                    eVar12.f2290i = E(typedArray, index, eVar12.f2290i);
                    break;
                case 84:
                    C0014c c0014c6 = aVar.f2201d;
                    c0014c6.f2272k = typedArray.getInteger(index, c0014c6.f2272k);
                    break;
                case 85:
                    C0014c c0014c7 = aVar.f2201d;
                    c0014c7.f2271j = typedArray.getFloat(index, c0014c7.f2271j);
                    break;
                case 86:
                    int i11 = typedArray.peekValue(index).type;
                    if (i11 == 1) {
                        aVar.f2201d.f2275n = typedArray.getResourceId(index, -1);
                        C0014c c0014c8 = aVar.f2201d;
                        if (c0014c8.f2275n != -1) {
                            c0014c8.f2274m = -2;
                            break;
                        } else {
                            break;
                        }
                    } else if (i11 == 3) {
                        aVar.f2201d.f2273l = typedArray.getString(index);
                        if (aVar.f2201d.f2273l.indexOf("/") > 0) {
                            aVar.f2201d.f2275n = typedArray.getResourceId(index, -1);
                            aVar.f2201d.f2274m = -2;
                            break;
                        } else {
                            aVar.f2201d.f2274m = -1;
                            break;
                        }
                    } else {
                        C0014c c0014c9 = aVar.f2201d;
                        c0014c9.f2274m = typedArray.getInteger(index, c0014c9.f2275n);
                        break;
                    }
                case 87:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f2189i.get(index));
                    break;
                case 88:
                case 89:
                case 90:
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f2189i.get(index));
                    break;
                case 91:
                    b bVar54 = aVar.f2202e;
                    bVar54.f2252r = E(typedArray, index, bVar54.f2252r);
                    break;
                case 92:
                    b bVar55 = aVar.f2202e;
                    bVar55.f2253s = E(typedArray, index, bVar55.f2253s);
                    break;
                case 93:
                    b bVar56 = aVar.f2202e;
                    bVar56.M = typedArray.getDimensionPixelSize(index, bVar56.M);
                    break;
                case 94:
                    b bVar57 = aVar.f2202e;
                    bVar57.T = typedArray.getDimensionPixelSize(index, bVar57.T);
                    break;
                case 95:
                    F(aVar.f2202e, typedArray, index, 0);
                    break;
                case 96:
                    F(aVar.f2202e, typedArray, index, 1);
                    break;
                case 97:
                    b bVar58 = aVar.f2202e;
                    bVar58.f2250p0 = typedArray.getInt(index, bVar58.f2250p0);
                    break;
            }
        }
    }

    public void K(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            ConstraintLayout.b bVar = (ConstraintLayout.b) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.f2196f && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f2197g.containsKey(Integer.valueOf(id))) {
                this.f2197g.put(Integer.valueOf(id), new a());
            }
            a aVar = (a) this.f2197g.get(Integer.valueOf(id));
            if (aVar != null) {
                if (!aVar.f2202e.f2221b) {
                    aVar.g(id, bVar);
                    if (childAt instanceof androidx.constraintlayout.widget.b) {
                        aVar.f2202e.f2238j0 = ((androidx.constraintlayout.widget.b) childAt).getReferencedIds();
                        if (childAt instanceof androidx.constraintlayout.widget.a) {
                            androidx.constraintlayout.widget.a aVar2 = (androidx.constraintlayout.widget.a) childAt;
                            aVar.f2202e.f2248o0 = aVar2.getAllowsGoneWidget();
                            aVar.f2202e.f2232g0 = aVar2.getType();
                            aVar.f2202e.f2234h0 = aVar2.getMargin();
                        }
                    }
                    aVar.f2202e.f2221b = true;
                }
                d dVar = aVar.f2200c;
                if (!dVar.f2276a) {
                    dVar.f2277b = childAt.getVisibility();
                    aVar.f2200c.f2279d = childAt.getAlpha();
                    aVar.f2200c.f2276a = true;
                }
                e eVar = aVar.f2203f;
                if (!eVar.f2282a) {
                    eVar.f2282a = true;
                    eVar.f2283b = childAt.getRotation();
                    aVar.f2203f.f2284c = childAt.getRotationX();
                    aVar.f2203f.f2285d = childAt.getRotationY();
                    aVar.f2203f.f2286e = childAt.getScaleX();
                    aVar.f2203f.f2287f = childAt.getScaleY();
                    float pivotX = childAt.getPivotX();
                    float pivotY = childAt.getPivotY();
                    if (pivotX != 0.0d || pivotY != 0.0d) {
                        e eVar2 = aVar.f2203f;
                        eVar2.f2288g = pivotX;
                        eVar2.f2289h = pivotY;
                    }
                    aVar.f2203f.f2291j = childAt.getTranslationX();
                    aVar.f2203f.f2292k = childAt.getTranslationY();
                    aVar.f2203f.f2293l = childAt.getTranslationZ();
                    e eVar3 = aVar.f2203f;
                    if (eVar3.f2294m) {
                        eVar3.f2295n = childAt.getElevation();
                    }
                }
            }
        }
    }

    public void L(c cVar) {
        for (Integer num : cVar.f2197g.keySet()) {
            num.intValue();
            a aVar = (a) cVar.f2197g.get(num);
            if (!this.f2197g.containsKey(num)) {
                this.f2197g.put(num, new a());
            }
            a aVar2 = (a) this.f2197g.get(num);
            if (aVar2 != null) {
                b bVar = aVar2.f2202e;
                if (!bVar.f2221b) {
                    bVar.a(aVar.f2202e);
                }
                d dVar = aVar2.f2200c;
                if (!dVar.f2276a) {
                    dVar.a(aVar.f2200c);
                }
                e eVar = aVar2.f2203f;
                if (!eVar.f2282a) {
                    eVar.a(aVar.f2203f);
                }
                C0014c c0014c = aVar2.f2201d;
                if (!c0014c.f2262a) {
                    c0014c.a(aVar.f2201d);
                }
                for (String str : aVar.f2204g.keySet()) {
                    if (!aVar2.f2204g.containsKey(str)) {
                        aVar2.f2204g.put(str, (ConstraintAttribute) aVar.f2204g.get(str));
                    }
                }
            }
        }
    }

    public void Q(boolean z10) {
        this.f2196f = z10;
    }

    public void R(boolean z10) {
        this.f2191a = z10;
    }

    public void g(ConstraintLayout constraintLayout) {
        a aVar;
        int childCount = constraintLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            int id = childAt.getId();
            if (!this.f2197g.containsKey(Integer.valueOf(id))) {
                Log.w("ConstraintSet", "id unknown " + a0.a.d(childAt));
            } else {
                if (this.f2196f && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (this.f2197g.containsKey(Integer.valueOf(id)) && (aVar = (a) this.f2197g.get(Integer.valueOf(id))) != null) {
                    ConstraintAttribute.h(childAt, aVar.f2204g);
                }
            }
        }
    }

    public void h(c cVar) {
        for (a aVar : cVar.f2197g.values()) {
            if (aVar.f2205h != null) {
                if (aVar.f2199b != null) {
                    Iterator it = this.f2197g.keySet().iterator();
                    while (it.hasNext()) {
                        a aVarV = v(((Integer) it.next()).intValue());
                        String str = aVarV.f2202e.f2242l0;
                        if (str != null && aVar.f2199b.matches(str)) {
                            aVar.f2205h.e(aVarV);
                            aVarV.f2204g.putAll((HashMap) aVar.f2204g.clone());
                        }
                    }
                } else {
                    aVar.f2205h.e(v(aVar.f2198a));
                }
            }
        }
    }

    public void i(ConstraintLayout constraintLayout) {
        k(constraintLayout, true);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    public void j(androidx.constraintlayout.widget.b bVar, ConstraintWidget constraintWidget, ConstraintLayout.b bVar2, SparseArray sparseArray) {
        a aVar;
        int id = bVar.getId();
        if (this.f2197g.containsKey(Integer.valueOf(id)) && (aVar = (a) this.f2197g.get(Integer.valueOf(id))) != null && (constraintWidget instanceof x.b)) {
            bVar.o(aVar, (x.b) constraintWidget, bVar2, sparseArray);
        }
    }

    public void k(ConstraintLayout constraintLayout, boolean z10) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f2197g.keySet());
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            int id = childAt.getId();
            if (!this.f2197g.containsKey(Integer.valueOf(id))) {
                Log.w("ConstraintSet", "id unknown " + a0.a.d(childAt));
            } else {
                if (this.f2196f && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (this.f2197g.containsKey(Integer.valueOf(id))) {
                        hashSet.remove(Integer.valueOf(id));
                        a aVar = (a) this.f2197g.get(Integer.valueOf(id));
                        if (aVar != null) {
                            if (childAt instanceof androidx.constraintlayout.widget.a) {
                                aVar.f2202e.f2236i0 = 1;
                                androidx.constraintlayout.widget.a aVar2 = (androidx.constraintlayout.widget.a) childAt;
                                aVar2.setId(id);
                                aVar2.setType(aVar.f2202e.f2232g0);
                                aVar2.setMargin(aVar.f2202e.f2234h0);
                                aVar2.setAllowsGoneWidget(aVar.f2202e.f2248o0);
                                b bVar = aVar.f2202e;
                                int[] iArr = bVar.f2238j0;
                                if (iArr != null) {
                                    aVar2.setReferencedIds(iArr);
                                } else {
                                    String str = bVar.f2240k0;
                                    if (str != null) {
                                        bVar.f2238j0 = s(aVar2, str);
                                        aVar2.setReferencedIds(aVar.f2202e.f2238j0);
                                    }
                                }
                            }
                            ConstraintLayout.b bVar2 = (ConstraintLayout.b) childAt.getLayoutParams();
                            bVar2.b();
                            aVar.e(bVar2);
                            if (z10) {
                                ConstraintAttribute.h(childAt, aVar.f2204g);
                            }
                            childAt.setLayoutParams(bVar2);
                            d dVar = aVar.f2200c;
                            if (dVar.f2278c == 0) {
                                childAt.setVisibility(dVar.f2277b);
                            }
                            childAt.setAlpha(aVar.f2200c.f2279d);
                            childAt.setRotation(aVar.f2203f.f2283b);
                            childAt.setRotationX(aVar.f2203f.f2284c);
                            childAt.setRotationY(aVar.f2203f.f2285d);
                            childAt.setScaleX(aVar.f2203f.f2286e);
                            childAt.setScaleY(aVar.f2203f.f2287f);
                            e eVar = aVar.f2203f;
                            if (eVar.f2290i != -1) {
                                if (((View) childAt.getParent()).findViewById(aVar.f2203f.f2290i) != null) {
                                    float top = (r4.getTop() + r4.getBottom()) / 2.0f;
                                    float left = (r4.getLeft() + r4.getRight()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        childAt.setPivotX(left - childAt.getLeft());
                                        childAt.setPivotY(top - childAt.getTop());
                                    }
                                }
                            } else {
                                if (!Float.isNaN(eVar.f2288g)) {
                                    childAt.setPivotX(aVar.f2203f.f2288g);
                                }
                                if (!Float.isNaN(aVar.f2203f.f2289h)) {
                                    childAt.setPivotY(aVar.f2203f.f2289h);
                                }
                            }
                            childAt.setTranslationX(aVar.f2203f.f2291j);
                            childAt.setTranslationY(aVar.f2203f.f2292k);
                            childAt.setTranslationZ(aVar.f2203f.f2293l);
                            e eVar2 = aVar.f2203f;
                            if (eVar2.f2294m) {
                                childAt.setElevation(eVar2.f2295n);
                            }
                        }
                    } else {
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            a aVar3 = (a) this.f2197g.get(num);
            if (aVar3 != null) {
                if (aVar3.f2202e.f2236i0 == 1) {
                    androidx.constraintlayout.widget.a aVar4 = new androidx.constraintlayout.widget.a(constraintLayout.getContext());
                    aVar4.setId(num.intValue());
                    b bVar3 = aVar3.f2202e;
                    int[] iArr2 = bVar3.f2238j0;
                    if (iArr2 != null) {
                        aVar4.setReferencedIds(iArr2);
                    } else {
                        String str2 = bVar3.f2240k0;
                        if (str2 != null) {
                            bVar3.f2238j0 = s(aVar4, str2);
                            aVar4.setReferencedIds(aVar3.f2202e.f2238j0);
                        }
                    }
                    aVar4.setType(aVar3.f2202e.f2232g0);
                    aVar4.setMargin(aVar3.f2202e.f2234h0);
                    ConstraintLayout.b bVarE = constraintLayout.generateDefaultLayoutParams();
                    aVar4.v();
                    aVar3.e(bVarE);
                    constraintLayout.addView(aVar4, bVarE);
                }
                if (aVar3.f2202e.f2219a) {
                    View eVar3 = new androidx.constraintlayout.widget.e(constraintLayout.getContext());
                    eVar3.setId(num.intValue());
                    ConstraintLayout.b bVarE2 = constraintLayout.generateDefaultLayoutParams();
                    aVar3.e(bVarE2);
                    constraintLayout.addView(eVar3, bVarE2);
                }
            }
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt2 = constraintLayout.getChildAt(i11);
            if (childAt2 instanceof androidx.constraintlayout.widget.b) {
                ((androidx.constraintlayout.widget.b) childAt2).i(constraintLayout);
            }
        }
    }

    public void l(int i10, ConstraintLayout.b bVar) {
        a aVar;
        if (!this.f2197g.containsKey(Integer.valueOf(i10)) || (aVar = (a) this.f2197g.get(Integer.valueOf(i10))) == null) {
            return;
        }
        aVar.e(bVar);
    }

    public void n(Context context, int i10) {
        o((ConstraintLayout) LayoutInflater.from(context).inflate(i10, (ViewGroup) null));
    }

    public void o(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.f2197g.clear();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            ConstraintLayout.b bVar = (ConstraintLayout.b) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.f2196f && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f2197g.containsKey(Integer.valueOf(id))) {
                this.f2197g.put(Integer.valueOf(id), new a());
            }
            a aVar = (a) this.f2197g.get(Integer.valueOf(id));
            if (aVar != null) {
                aVar.f2204g = ConstraintAttribute.b(this.f2195e, childAt);
                aVar.g(id, bVar);
                aVar.f2200c.f2277b = childAt.getVisibility();
                aVar.f2200c.f2279d = childAt.getAlpha();
                aVar.f2203f.f2283b = childAt.getRotation();
                aVar.f2203f.f2284c = childAt.getRotationX();
                aVar.f2203f.f2285d = childAt.getRotationY();
                aVar.f2203f.f2286e = childAt.getScaleX();
                aVar.f2203f.f2287f = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    e eVar = aVar.f2203f;
                    eVar.f2288g = pivotX;
                    eVar.f2289h = pivotY;
                }
                aVar.f2203f.f2291j = childAt.getTranslationX();
                aVar.f2203f.f2292k = childAt.getTranslationY();
                aVar.f2203f.f2293l = childAt.getTranslationZ();
                e eVar2 = aVar.f2203f;
                if (eVar2.f2294m) {
                    eVar2.f2295n = childAt.getElevation();
                }
                if (childAt instanceof androidx.constraintlayout.widget.a) {
                    androidx.constraintlayout.widget.a aVar2 = (androidx.constraintlayout.widget.a) childAt;
                    aVar.f2202e.f2248o0 = aVar2.getAllowsGoneWidget();
                    aVar.f2202e.f2238j0 = aVar2.getReferencedIds();
                    aVar.f2202e.f2232g0 = aVar2.getType();
                    aVar.f2202e.f2234h0 = aVar2.getMargin();
                }
            }
        }
    }

    public void p(c cVar) {
        this.f2197g.clear();
        for (Integer num : cVar.f2197g.keySet()) {
            a aVar = (a) cVar.f2197g.get(num);
            if (aVar != null) {
                this.f2197g.put(num, aVar.clone());
            }
        }
    }

    public void q(androidx.constraintlayout.widget.d dVar) {
        int childCount = dVar.getChildCount();
        this.f2197g.clear();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = dVar.getChildAt(i10);
            d.a aVar = (d.a) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.f2196f && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f2197g.containsKey(Integer.valueOf(id))) {
                this.f2197g.put(Integer.valueOf(id), new a());
            }
            a aVar2 = (a) this.f2197g.get(Integer.valueOf(id));
            if (aVar2 != null) {
                if (childAt instanceof androidx.constraintlayout.widget.b) {
                    aVar2.i((androidx.constraintlayout.widget.b) childAt, id, aVar);
                }
                aVar2.h(id, aVar);
            }
        }
    }

    public void r(int i10, int i11, int i12, float f10) {
        b bVar = u(i10).f2202e;
        bVar.A = i11;
        bVar.B = i12;
        bVar.C = f10;
    }

    public final int[] s(View view, String str) throws IllegalAccessException, IllegalArgumentException {
        int iIntValue;
        Object objG;
        String[] strArrSplit = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i10 = 0;
        int i11 = 0;
        while (i10 < strArrSplit.length) {
            String strTrim = strArrSplit[i10].trim();
            try {
                iIntValue = b0.c.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (objG = ((ConstraintLayout) view.getParent()).g(0, strTrim)) != null && (objG instanceof Integer)) {
                iIntValue = ((Integer) objG).intValue();
            }
            iArr[i11] = iIntValue;
            i10++;
            i11++;
        }
        return i11 != strArrSplit.length ? Arrays.copyOf(iArr, i11) : iArr;
    }

    public final a t(Context context, AttributeSet attributeSet, boolean z10) throws NumberFormatException {
        a aVar = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z10 ? b0.d.ConstraintOverride : b0.d.Constraint);
        I(context, aVar, typedArrayObtainStyledAttributes, z10);
        typedArrayObtainStyledAttributes.recycle();
        return aVar;
    }

    public final a u(int i10) {
        if (!this.f2197g.containsKey(Integer.valueOf(i10))) {
            this.f2197g.put(Integer.valueOf(i10), new a());
        }
        return (a) this.f2197g.get(Integer.valueOf(i10));
    }

    public a v(int i10) {
        if (this.f2197g.containsKey(Integer.valueOf(i10))) {
            return (a) this.f2197g.get(Integer.valueOf(i10));
        }
        return null;
    }

    public int w(int i10) {
        return u(i10).f2202e.f2227e;
    }

    public int[] x() {
        Integer[] numArr = (Integer[]) this.f2197g.keySet().toArray(new Integer[0]);
        int length = numArr.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = numArr[i10].intValue();
        }
        return iArr;
    }

    public a y(int i10) {
        return u(i10);
    }

    public int z(int i10) {
        return u(i10).f2200c.f2277b;
    }
}
