package androidx.constraintlayout.widget;

import N7.B8;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.b;
import androidx.constraintlayout.widget.e;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.s;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
import q0.C5487a;

/* compiled from: ConstraintSet.java */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f15311d = {0, 4, 8};

    /* renamed from: e, reason: collision with root package name */
    public static final SparseIntArray f15312e;

    /* renamed from: f, reason: collision with root package name */
    public static final SparseIntArray f15313f;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap<String, androidx.constraintlayout.widget.b> f15314a = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f15315b = true;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap<Integer, a> f15316c = new HashMap<>();

    /* compiled from: ConstraintSet.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f15317a;

        /* renamed from: b, reason: collision with root package name */
        public final C0234d f15318b;

        /* renamed from: c, reason: collision with root package name */
        public final c f15319c;

        /* renamed from: d, reason: collision with root package name */
        public final b f15320d;

        /* renamed from: e, reason: collision with root package name */
        public final e f15321e;

        /* renamed from: f, reason: collision with root package name */
        public HashMap<String, androidx.constraintlayout.widget.b> f15322f;

        /* compiled from: ConstraintSet.java */
        /* renamed from: androidx.constraintlayout.widget.d$a$a, reason: collision with other inner class name */
        public static class C0233a {

            /* renamed from: a, reason: collision with root package name */
            public int[] f15323a = new int[10];

            /* renamed from: b, reason: collision with root package name */
            public int[] f15324b = new int[10];

            /* renamed from: c, reason: collision with root package name */
            public int f15325c = 0;

            /* renamed from: d, reason: collision with root package name */
            public int[] f15326d = new int[10];

            /* renamed from: e, reason: collision with root package name */
            public float[] f15327e = new float[10];

            /* renamed from: f, reason: collision with root package name */
            public int f15328f = 0;

            /* renamed from: g, reason: collision with root package name */
            public int[] f15329g = new int[5];

            /* renamed from: h, reason: collision with root package name */
            public String[] f15330h = new String[5];
            public int i = 0;

            /* renamed from: j, reason: collision with root package name */
            public int[] f15331j = new int[4];

            /* renamed from: k, reason: collision with root package name */
            public boolean[] f15332k = new boolean[4];

            /* renamed from: l, reason: collision with root package name */
            public int f15333l = 0;

            public final void a(float f10, int i) {
                int i10 = this.f15328f;
                int[] iArr = this.f15326d;
                if (i10 >= iArr.length) {
                    this.f15326d = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.f15327e;
                    this.f15327e = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.f15326d;
                int i11 = this.f15328f;
                iArr2[i11] = i;
                float[] fArr2 = this.f15327e;
                this.f15328f = i11 + 1;
                fArr2[i11] = f10;
            }

            public final void b(int i, int i10) {
                int i11 = this.f15325c;
                int[] iArr = this.f15323a;
                if (i11 >= iArr.length) {
                    this.f15323a = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.f15324b;
                    this.f15324b = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.f15323a;
                int i12 = this.f15325c;
                iArr3[i12] = i;
                int[] iArr4 = this.f15324b;
                this.f15325c = i12 + 1;
                iArr4[i12] = i10;
            }

            public final void c(int i, String str) {
                int i10 = this.i;
                int[] iArr = this.f15329g;
                if (i10 >= iArr.length) {
                    this.f15329g = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.f15330h;
                    this.f15330h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.f15329g;
                int i11 = this.i;
                iArr2[i11] = i;
                String[] strArr2 = this.f15330h;
                this.i = i11 + 1;
                strArr2[i11] = str;
            }

            public final void d(int i, boolean z10) {
                int i10 = this.f15333l;
                int[] iArr = this.f15331j;
                if (i10 >= iArr.length) {
                    this.f15331j = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.f15332k;
                    this.f15332k = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.f15331j;
                int i11 = this.f15333l;
                iArr2[i11] = i;
                boolean[] zArr2 = this.f15332k;
                this.f15333l = i11 + 1;
                zArr2[i11] = z10;
            }
        }

        public a() {
            C0234d c0234d = new C0234d();
            c0234d.f15410a = 0;
            c0234d.f15411b = 0;
            c0234d.f15412c = 1.0f;
            c0234d.f15413d = Float.NaN;
            this.f15318b = c0234d;
            c cVar = new c();
            cVar.f15402a = -1;
            cVar.f15403b = 0;
            cVar.f15404c = -1;
            cVar.f15405d = Float.NaN;
            cVar.f15406e = Float.NaN;
            cVar.f15407f = Float.NaN;
            cVar.f15408g = -1;
            cVar.f15409h = null;
            cVar.i = -1;
            this.f15319c = cVar;
            this.f15320d = new b();
            e eVar = new e();
            eVar.f15415a = 0.0f;
            eVar.f15416b = 0.0f;
            eVar.f15417c = 0.0f;
            eVar.f15418d = 1.0f;
            eVar.f15419e = 1.0f;
            eVar.f15420f = Float.NaN;
            eVar.f15421g = Float.NaN;
            eVar.f15422h = -1;
            eVar.i = 0.0f;
            eVar.f15423j = 0.0f;
            eVar.f15424k = 0.0f;
            eVar.f15425l = false;
            eVar.f15426m = 0.0f;
            this.f15321e = eVar;
            this.f15322f = new HashMap<>();
        }

        public final void a(ConstraintLayout.b bVar) {
            b bVar2 = this.f15320d;
            bVar.f15248e = bVar2.f15375h;
            bVar.f15250f = bVar2.i;
            bVar.f15252g = bVar2.f15378j;
            bVar.f15254h = bVar2.f15380k;
            bVar.i = bVar2.f15382l;
            bVar.f15257j = bVar2.f15384m;
            bVar.f15259k = bVar2.f15386n;
            bVar.f15261l = bVar2.f15388o;
            bVar.f15263m = bVar2.f15390p;
            bVar.f15265n = bVar2.f15391q;
            bVar.f15267o = bVar2.f15392r;
            bVar.f15274s = bVar2.f15393s;
            bVar.f15275t = bVar2.f15394t;
            bVar.f15276u = bVar2.f15395u;
            bVar.f15277v = bVar2.f15396v;
            ((ViewGroup.MarginLayoutParams) bVar).leftMargin = bVar2.f15340F;
            ((ViewGroup.MarginLayoutParams) bVar).rightMargin = bVar2.f15341G;
            ((ViewGroup.MarginLayoutParams) bVar).topMargin = bVar2.f15342H;
            ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = bVar2.f15343I;
            bVar.f15214A = bVar2.f15352R;
            bVar.f15215B = bVar2.f15351Q;
            bVar.f15279x = bVar2.f15348N;
            bVar.f15281z = bVar2.f15350P;
            bVar.f15218E = bVar2.f15397w;
            bVar.f15219F = bVar2.f15398x;
            bVar.f15269p = bVar2.f15400z;
            bVar.f15271q = bVar2.f15335A;
            bVar.f15273r = bVar2.f15336B;
            bVar.f15220G = bVar2.f15399y;
            bVar.f15233T = bVar2.f15337C;
            bVar.f15234U = bVar2.f15338D;
            bVar.f15222I = bVar2.f15354T;
            bVar.f15221H = bVar2.f15355U;
            bVar.f15224K = bVar2.f15357W;
            bVar.f15223J = bVar2.f15356V;
            bVar.f15236W = bVar2.f15383l0;
            bVar.f15237X = bVar2.f15385m0;
            bVar.f15225L = bVar2.f15358X;
            bVar.f15226M = bVar2.f15359Y;
            bVar.f15229P = bVar2.f15360Z;
            bVar.f15230Q = bVar2.f15362a0;
            bVar.f15227N = bVar2.f15364b0;
            bVar.f15228O = bVar2.f15366c0;
            bVar.f15231R = bVar2.f15368d0;
            bVar.f15232S = bVar2.f15370e0;
            bVar.f15235V = bVar2.f15339E;
            bVar.f15244c = bVar2.f15371f;
            bVar.f15240a = bVar2.f15367d;
            bVar.f15242b = bVar2.f15369e;
            ((ViewGroup.MarginLayoutParams) bVar).width = bVar2.f15363b;
            ((ViewGroup.MarginLayoutParams) bVar).height = bVar2.f15365c;
            String str = bVar2.f15381k0;
            if (str != null) {
                bVar.f15238Y = str;
            }
            bVar.f15239Z = bVar2.f15389o0;
            bVar.setMarginStart(bVar2.f15345K);
            bVar.setMarginEnd(bVar2.f15344J);
            bVar.a();
        }

        public final void b(int i, ConstraintLayout.b bVar) {
            this.f15317a = i;
            int i10 = bVar.f15248e;
            b bVar2 = this.f15320d;
            bVar2.f15375h = i10;
            bVar2.i = bVar.f15250f;
            bVar2.f15378j = bVar.f15252g;
            bVar2.f15380k = bVar.f15254h;
            bVar2.f15382l = bVar.i;
            bVar2.f15384m = bVar.f15257j;
            bVar2.f15386n = bVar.f15259k;
            bVar2.f15388o = bVar.f15261l;
            bVar2.f15390p = bVar.f15263m;
            bVar2.f15391q = bVar.f15265n;
            bVar2.f15392r = bVar.f15267o;
            bVar2.f15393s = bVar.f15274s;
            bVar2.f15394t = bVar.f15275t;
            bVar2.f15395u = bVar.f15276u;
            bVar2.f15396v = bVar.f15277v;
            bVar2.f15397w = bVar.f15218E;
            bVar2.f15398x = bVar.f15219F;
            bVar2.f15399y = bVar.f15220G;
            bVar2.f15400z = bVar.f15269p;
            bVar2.f15335A = bVar.f15271q;
            bVar2.f15336B = bVar.f15273r;
            bVar2.f15337C = bVar.f15233T;
            bVar2.f15338D = bVar.f15234U;
            bVar2.f15339E = bVar.f15235V;
            bVar2.f15371f = bVar.f15244c;
            bVar2.f15367d = bVar.f15240a;
            bVar2.f15369e = bVar.f15242b;
            bVar2.f15363b = ((ViewGroup.MarginLayoutParams) bVar).width;
            bVar2.f15365c = ((ViewGroup.MarginLayoutParams) bVar).height;
            bVar2.f15340F = ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
            bVar2.f15341G = ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
            bVar2.f15342H = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
            bVar2.f15343I = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
            bVar2.f15346L = bVar.f15217D;
            bVar2.f15354T = bVar.f15222I;
            bVar2.f15355U = bVar.f15221H;
            bVar2.f15357W = bVar.f15224K;
            bVar2.f15356V = bVar.f15223J;
            bVar2.f15383l0 = bVar.f15236W;
            bVar2.f15385m0 = bVar.f15237X;
            bVar2.f15358X = bVar.f15225L;
            bVar2.f15359Y = bVar.f15226M;
            bVar2.f15360Z = bVar.f15229P;
            bVar2.f15362a0 = bVar.f15230Q;
            bVar2.f15364b0 = bVar.f15227N;
            bVar2.f15366c0 = bVar.f15228O;
            bVar2.f15368d0 = bVar.f15231R;
            bVar2.f15370e0 = bVar.f15232S;
            bVar2.f15381k0 = bVar.f15238Y;
            bVar2.f15348N = bVar.f15279x;
            bVar2.f15350P = bVar.f15281z;
            bVar2.f15347M = bVar.f15278w;
            bVar2.f15349O = bVar.f15280y;
            bVar2.f15352R = bVar.f15214A;
            bVar2.f15351Q = bVar.f15215B;
            bVar2.f15353S = bVar.f15216C;
            bVar2.f15389o0 = bVar.f15239Z;
            bVar2.f15344J = bVar.getMarginEnd();
            bVar2.f15345K = bVar.getMarginStart();
        }

        public final void c(int i, e.a aVar) {
            b(i, aVar);
            this.f15318b.f15412c = aVar.f15431r0;
            float f10 = aVar.f15434u0;
            e eVar = this.f15321e;
            eVar.f15415a = f10;
            eVar.f15416b = aVar.f15435v0;
            eVar.f15417c = aVar.f15436w0;
            eVar.f15418d = aVar.f15437x0;
            eVar.f15419e = aVar.f15438y0;
            eVar.f15420f = aVar.f15439z0;
            eVar.f15421g = aVar.f15427A0;
            eVar.i = aVar.f15428B0;
            eVar.f15423j = aVar.f15429C0;
            eVar.f15424k = aVar.f15430D0;
            eVar.f15426m = aVar.f15433t0;
            eVar.f15425l = aVar.f15432s0;
        }

        public final Object clone() throws CloneNotSupportedException {
            a aVar = new a();
            b bVar = aVar.f15320d;
            bVar.getClass();
            b bVar2 = this.f15320d;
            bVar.f15361a = bVar2.f15361a;
            bVar.f15363b = bVar2.f15363b;
            bVar.f15365c = bVar2.f15365c;
            bVar.f15367d = bVar2.f15367d;
            bVar.f15369e = bVar2.f15369e;
            bVar.f15371f = bVar2.f15371f;
            bVar.f15373g = bVar2.f15373g;
            bVar.f15375h = bVar2.f15375h;
            bVar.i = bVar2.i;
            bVar.f15378j = bVar2.f15378j;
            bVar.f15380k = bVar2.f15380k;
            bVar.f15382l = bVar2.f15382l;
            bVar.f15384m = bVar2.f15384m;
            bVar.f15386n = bVar2.f15386n;
            bVar.f15388o = bVar2.f15388o;
            bVar.f15390p = bVar2.f15390p;
            bVar.f15391q = bVar2.f15391q;
            bVar.f15392r = bVar2.f15392r;
            bVar.f15393s = bVar2.f15393s;
            bVar.f15394t = bVar2.f15394t;
            bVar.f15395u = bVar2.f15395u;
            bVar.f15396v = bVar2.f15396v;
            bVar.f15397w = bVar2.f15397w;
            bVar.f15398x = bVar2.f15398x;
            bVar.f15399y = bVar2.f15399y;
            bVar.f15400z = bVar2.f15400z;
            bVar.f15335A = bVar2.f15335A;
            bVar.f15336B = bVar2.f15336B;
            bVar.f15337C = bVar2.f15337C;
            bVar.f15338D = bVar2.f15338D;
            bVar.f15339E = bVar2.f15339E;
            bVar.f15340F = bVar2.f15340F;
            bVar.f15341G = bVar2.f15341G;
            bVar.f15342H = bVar2.f15342H;
            bVar.f15343I = bVar2.f15343I;
            bVar.f15344J = bVar2.f15344J;
            bVar.f15345K = bVar2.f15345K;
            bVar.f15346L = bVar2.f15346L;
            bVar.f15347M = bVar2.f15347M;
            bVar.f15348N = bVar2.f15348N;
            bVar.f15349O = bVar2.f15349O;
            bVar.f15350P = bVar2.f15350P;
            bVar.f15351Q = bVar2.f15351Q;
            bVar.f15352R = bVar2.f15352R;
            bVar.f15353S = bVar2.f15353S;
            bVar.f15354T = bVar2.f15354T;
            bVar.f15355U = bVar2.f15355U;
            bVar.f15356V = bVar2.f15356V;
            bVar.f15357W = bVar2.f15357W;
            bVar.f15358X = bVar2.f15358X;
            bVar.f15359Y = bVar2.f15359Y;
            bVar.f15360Z = bVar2.f15360Z;
            bVar.f15362a0 = bVar2.f15362a0;
            bVar.f15364b0 = bVar2.f15364b0;
            bVar.f15366c0 = bVar2.f15366c0;
            bVar.f15368d0 = bVar2.f15368d0;
            bVar.f15370e0 = bVar2.f15370e0;
            bVar.f15372f0 = bVar2.f15372f0;
            bVar.f15374g0 = bVar2.f15374g0;
            bVar.f15376h0 = bVar2.f15376h0;
            bVar.f15381k0 = bVar2.f15381k0;
            int[] iArr = bVar2.f15377i0;
            if (iArr == null || bVar2.f15379j0 != null) {
                bVar.f15377i0 = null;
            } else {
                bVar.f15377i0 = Arrays.copyOf(iArr, iArr.length);
            }
            bVar.f15379j0 = bVar2.f15379j0;
            bVar.f15383l0 = bVar2.f15383l0;
            bVar.f15385m0 = bVar2.f15385m0;
            bVar.f15387n0 = bVar2.f15387n0;
            bVar.f15389o0 = bVar2.f15389o0;
            c cVar = aVar.f15319c;
            cVar.getClass();
            c cVar2 = this.f15319c;
            cVar2.getClass();
            cVar.f15402a = cVar2.f15402a;
            cVar.f15404c = cVar2.f15404c;
            cVar.f15406e = cVar2.f15406e;
            cVar.f15405d = cVar2.f15405d;
            C0234d c0234d = aVar.f15318b;
            C0234d c0234d2 = this.f15318b;
            c0234d.f15410a = c0234d2.f15410a;
            c0234d.f15412c = c0234d2.f15412c;
            c0234d.f15413d = c0234d2.f15413d;
            c0234d.f15411b = c0234d2.f15411b;
            e eVar = aVar.f15321e;
            eVar.getClass();
            e eVar2 = this.f15321e;
            eVar2.getClass();
            eVar.f15415a = eVar2.f15415a;
            eVar.f15416b = eVar2.f15416b;
            eVar.f15417c = eVar2.f15417c;
            eVar.f15418d = eVar2.f15418d;
            eVar.f15419e = eVar2.f15419e;
            eVar.f15420f = eVar2.f15420f;
            eVar.f15421g = eVar2.f15421g;
            eVar.f15422h = eVar2.f15422h;
            eVar.i = eVar2.i;
            eVar.f15423j = eVar2.f15423j;
            eVar.f15424k = eVar2.f15424k;
            eVar.f15425l = eVar2.f15425l;
            eVar.f15426m = eVar2.f15426m;
            aVar.f15317a = this.f15317a;
            return aVar;
        }
    }

    /* compiled from: ConstraintSet.java */
    public static class b {

        /* renamed from: p0, reason: collision with root package name */
        public static final SparseIntArray f15334p0;

        /* renamed from: b, reason: collision with root package name */
        public int f15363b;

        /* renamed from: c, reason: collision with root package name */
        public int f15365c;

        /* renamed from: i0, reason: collision with root package name */
        public int[] f15377i0;

        /* renamed from: j0, reason: collision with root package name */
        public String f15379j0;

        /* renamed from: k0, reason: collision with root package name */
        public String f15381k0;

        /* renamed from: a, reason: collision with root package name */
        public boolean f15361a = false;

        /* renamed from: d, reason: collision with root package name */
        public int f15367d = -1;

        /* renamed from: e, reason: collision with root package name */
        public int f15369e = -1;

        /* renamed from: f, reason: collision with root package name */
        public float f15371f = -1.0f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f15373g = true;

        /* renamed from: h, reason: collision with root package name */
        public int f15375h = -1;
        public int i = -1;

        /* renamed from: j, reason: collision with root package name */
        public int f15378j = -1;

        /* renamed from: k, reason: collision with root package name */
        public int f15380k = -1;

        /* renamed from: l, reason: collision with root package name */
        public int f15382l = -1;

        /* renamed from: m, reason: collision with root package name */
        public int f15384m = -1;

        /* renamed from: n, reason: collision with root package name */
        public int f15386n = -1;

        /* renamed from: o, reason: collision with root package name */
        public int f15388o = -1;

        /* renamed from: p, reason: collision with root package name */
        public int f15390p = -1;

        /* renamed from: q, reason: collision with root package name */
        public int f15391q = -1;

        /* renamed from: r, reason: collision with root package name */
        public int f15392r = -1;

        /* renamed from: s, reason: collision with root package name */
        public int f15393s = -1;

        /* renamed from: t, reason: collision with root package name */
        public int f15394t = -1;

        /* renamed from: u, reason: collision with root package name */
        public int f15395u = -1;

        /* renamed from: v, reason: collision with root package name */
        public int f15396v = -1;

        /* renamed from: w, reason: collision with root package name */
        public float f15397w = 0.5f;

        /* renamed from: x, reason: collision with root package name */
        public float f15398x = 0.5f;

        /* renamed from: y, reason: collision with root package name */
        public String f15399y = null;

        /* renamed from: z, reason: collision with root package name */
        public int f15400z = -1;

        /* renamed from: A, reason: collision with root package name */
        public int f15335A = 0;

        /* renamed from: B, reason: collision with root package name */
        public float f15336B = 0.0f;

        /* renamed from: C, reason: collision with root package name */
        public int f15337C = -1;

        /* renamed from: D, reason: collision with root package name */
        public int f15338D = -1;

        /* renamed from: E, reason: collision with root package name */
        public int f15339E = -1;

        /* renamed from: F, reason: collision with root package name */
        public int f15340F = 0;

        /* renamed from: G, reason: collision with root package name */
        public int f15341G = 0;

        /* renamed from: H, reason: collision with root package name */
        public int f15342H = 0;

        /* renamed from: I, reason: collision with root package name */
        public int f15343I = 0;

        /* renamed from: J, reason: collision with root package name */
        public int f15344J = 0;

        /* renamed from: K, reason: collision with root package name */
        public int f15345K = 0;

        /* renamed from: L, reason: collision with root package name */
        public int f15346L = 0;

        /* renamed from: M, reason: collision with root package name */
        public int f15347M = RecyclerView.UNDEFINED_DURATION;

        /* renamed from: N, reason: collision with root package name */
        public int f15348N = RecyclerView.UNDEFINED_DURATION;

        /* renamed from: O, reason: collision with root package name */
        public int f15349O = RecyclerView.UNDEFINED_DURATION;

        /* renamed from: P, reason: collision with root package name */
        public int f15350P = RecyclerView.UNDEFINED_DURATION;

        /* renamed from: Q, reason: collision with root package name */
        public int f15351Q = RecyclerView.UNDEFINED_DURATION;

        /* renamed from: R, reason: collision with root package name */
        public int f15352R = RecyclerView.UNDEFINED_DURATION;

        /* renamed from: S, reason: collision with root package name */
        public int f15353S = RecyclerView.UNDEFINED_DURATION;

        /* renamed from: T, reason: collision with root package name */
        public float f15354T = -1.0f;

        /* renamed from: U, reason: collision with root package name */
        public float f15355U = -1.0f;

        /* renamed from: V, reason: collision with root package name */
        public int f15356V = 0;

        /* renamed from: W, reason: collision with root package name */
        public int f15357W = 0;

        /* renamed from: X, reason: collision with root package name */
        public int f15358X = 0;

        /* renamed from: Y, reason: collision with root package name */
        public int f15359Y = 0;

        /* renamed from: Z, reason: collision with root package name */
        public int f15360Z = 0;

        /* renamed from: a0, reason: collision with root package name */
        public int f15362a0 = 0;

        /* renamed from: b0, reason: collision with root package name */
        public int f15364b0 = 0;

        /* renamed from: c0, reason: collision with root package name */
        public int f15366c0 = 0;

        /* renamed from: d0, reason: collision with root package name */
        public float f15368d0 = 1.0f;

        /* renamed from: e0, reason: collision with root package name */
        public float f15370e0 = 1.0f;

        /* renamed from: f0, reason: collision with root package name */
        public int f15372f0 = -1;

        /* renamed from: g0, reason: collision with root package name */
        public int f15374g0 = 0;

        /* renamed from: h0, reason: collision with root package name */
        public int f15376h0 = -1;

        /* renamed from: l0, reason: collision with root package name */
        public boolean f15383l0 = false;

        /* renamed from: m0, reason: collision with root package name */
        public boolean f15385m0 = false;

        /* renamed from: n0, reason: collision with root package name */
        public boolean f15387n0 = true;

        /* renamed from: o0, reason: collision with root package name */
        public int f15389o0 = 0;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f15334p0 = sparseIntArray;
            sparseIntArray.append(43, 24);
            sparseIntArray.append(44, 25);
            sparseIntArray.append(46, 28);
            sparseIntArray.append(47, 29);
            sparseIntArray.append(52, 35);
            sparseIntArray.append(51, 34);
            sparseIntArray.append(24, 4);
            sparseIntArray.append(23, 3);
            sparseIntArray.append(19, 1);
            sparseIntArray.append(61, 6);
            sparseIntArray.append(62, 7);
            sparseIntArray.append(31, 17);
            sparseIntArray.append(32, 18);
            sparseIntArray.append(33, 19);
            sparseIntArray.append(15, 90);
            sparseIntArray.append(0, 26);
            sparseIntArray.append(48, 31);
            sparseIntArray.append(49, 32);
            sparseIntArray.append(30, 10);
            sparseIntArray.append(29, 9);
            sparseIntArray.append(66, 13);
            sparseIntArray.append(69, 16);
            sparseIntArray.append(67, 14);
            sparseIntArray.append(64, 11);
            sparseIntArray.append(68, 15);
            sparseIntArray.append(65, 12);
            sparseIntArray.append(55, 38);
            sparseIntArray.append(41, 37);
            sparseIntArray.append(40, 39);
            sparseIntArray.append(54, 40);
            sparseIntArray.append(39, 20);
            sparseIntArray.append(53, 36);
            sparseIntArray.append(28, 5);
            sparseIntArray.append(42, 91);
            sparseIntArray.append(50, 91);
            sparseIntArray.append(45, 91);
            sparseIntArray.append(22, 91);
            sparseIntArray.append(18, 91);
            sparseIntArray.append(3, 23);
            sparseIntArray.append(5, 27);
            sparseIntArray.append(7, 30);
            sparseIntArray.append(8, 8);
            sparseIntArray.append(4, 33);
            sparseIntArray.append(6, 2);
            sparseIntArray.append(1, 22);
            sparseIntArray.append(2, 21);
            sparseIntArray.append(56, 41);
            sparseIntArray.append(34, 42);
            sparseIntArray.append(17, 41);
            sparseIntArray.append(16, 42);
            sparseIntArray.append(71, 76);
            sparseIntArray.append(25, 61);
            sparseIntArray.append(27, 62);
            sparseIntArray.append(26, 63);
            sparseIntArray.append(60, 69);
            sparseIntArray.append(38, 70);
            sparseIntArray.append(12, 71);
            sparseIntArray.append(10, 72);
            sparseIntArray.append(11, 73);
            sparseIntArray.append(13, 74);
            sparseIntArray.append(9, 75);
        }

        public final void a(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u0.d.f46503f);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                SparseIntArray sparseIntArray = f15334p0;
                int i10 = sparseIntArray.get(index);
                switch (i10) {
                    case 1:
                        this.f15390p = d.f(typedArrayObtainStyledAttributes, index, this.f15390p);
                        break;
                    case 2:
                        this.f15343I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f15343I);
                        break;
                    case 3:
                        this.f15388o = d.f(typedArrayObtainStyledAttributes, index, this.f15388o);
                        break;
                    case 4:
                        this.f15386n = d.f(typedArrayObtainStyledAttributes, index, this.f15386n);
                        break;
                    case 5:
                        this.f15399y = typedArrayObtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.f15337C = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f15337C);
                        break;
                    case 7:
                        this.f15338D = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f15338D);
                        break;
                    case 8:
                        this.f15344J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f15344J);
                        break;
                    case 9:
                        this.f15396v = d.f(typedArrayObtainStyledAttributes, index, this.f15396v);
                        break;
                    case 10:
                        this.f15395u = d.f(typedArrayObtainStyledAttributes, index, this.f15395u);
                        break;
                    case 11:
                        this.f15350P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f15350P);
                        break;
                    case 12:
                        this.f15351Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f15351Q);
                        break;
                    case 13:
                        this.f15347M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f15347M);
                        break;
                    case 14:
                        this.f15349O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f15349O);
                        break;
                    case 15:
                        this.f15352R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f15352R);
                        break;
                    case 16:
                        this.f15348N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f15348N);
                        break;
                    case 17:
                        this.f15367d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f15367d);
                        break;
                    case 18:
                        this.f15369e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f15369e);
                        break;
                    case 19:
                        this.f15371f = typedArrayObtainStyledAttributes.getFloat(index, this.f15371f);
                        break;
                    case 20:
                        this.f15397w = typedArrayObtainStyledAttributes.getFloat(index, this.f15397w);
                        break;
                    case 21:
                        this.f15365c = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f15365c);
                        break;
                    case 22:
                        this.f15363b = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f15363b);
                        break;
                    case 23:
                        this.f15340F = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f15340F);
                        break;
                    case 24:
                        this.f15375h = d.f(typedArrayObtainStyledAttributes, index, this.f15375h);
                        break;
                    case 25:
                        this.i = d.f(typedArrayObtainStyledAttributes, index, this.i);
                        break;
                    case 26:
                        this.f15339E = typedArrayObtainStyledAttributes.getInt(index, this.f15339E);
                        break;
                    case 27:
                        this.f15341G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f15341G);
                        break;
                    case 28:
                        this.f15378j = d.f(typedArrayObtainStyledAttributes, index, this.f15378j);
                        break;
                    case 29:
                        this.f15380k = d.f(typedArrayObtainStyledAttributes, index, this.f15380k);
                        break;
                    case 30:
                        this.f15345K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f15345K);
                        break;
                    case 31:
                        this.f15393s = d.f(typedArrayObtainStyledAttributes, index, this.f15393s);
                        break;
                    case 32:
                        this.f15394t = d.f(typedArrayObtainStyledAttributes, index, this.f15394t);
                        break;
                    case 33:
                        this.f15342H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f15342H);
                        break;
                    case 34:
                        this.f15384m = d.f(typedArrayObtainStyledAttributes, index, this.f15384m);
                        break;
                    case 35:
                        this.f15382l = d.f(typedArrayObtainStyledAttributes, index, this.f15382l);
                        break;
                    case 36:
                        this.f15398x = typedArrayObtainStyledAttributes.getFloat(index, this.f15398x);
                        break;
                    case 37:
                        this.f15355U = typedArrayObtainStyledAttributes.getFloat(index, this.f15355U);
                        break;
                    case 38:
                        this.f15354T = typedArrayObtainStyledAttributes.getFloat(index, this.f15354T);
                        break;
                    case 39:
                        this.f15356V = typedArrayObtainStyledAttributes.getInt(index, this.f15356V);
                        break;
                    case 40:
                        this.f15357W = typedArrayObtainStyledAttributes.getInt(index, this.f15357W);
                        break;
                    case 41:
                        d.g(this, typedArrayObtainStyledAttributes, index, 0);
                        break;
                    case 42:
                        d.g(this, typedArrayObtainStyledAttributes, index, 1);
                        break;
                    default:
                        switch (i10) {
                            case 61:
                                this.f15400z = d.f(typedArrayObtainStyledAttributes, index, this.f15400z);
                                break;
                            case 62:
                                this.f15335A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f15335A);
                                break;
                            case 63:
                                this.f15336B = typedArrayObtainStyledAttributes.getFloat(index, this.f15336B);
                                break;
                            default:
                                switch (i10) {
                                    case 69:
                                        this.f15368d0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 70:
                                        this.f15370e0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 71:
                                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                        break;
                                    case 72:
                                        this.f15372f0 = typedArrayObtainStyledAttributes.getInt(index, this.f15372f0);
                                        break;
                                    case 73:
                                        this.f15374g0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f15374g0);
                                        break;
                                    case 74:
                                        this.f15379j0 = typedArrayObtainStyledAttributes.getString(index);
                                        break;
                                    case 75:
                                        this.f15387n0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f15387n0);
                                        break;
                                    case 76:
                                        this.f15389o0 = typedArrayObtainStyledAttributes.getInt(index, this.f15389o0);
                                        break;
                                    case 77:
                                        this.f15391q = d.f(typedArrayObtainStyledAttributes, index, this.f15391q);
                                        break;
                                    case 78:
                                        this.f15392r = d.f(typedArrayObtainStyledAttributes, index, this.f15392r);
                                        break;
                                    case 79:
                                        this.f15353S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f15353S);
                                        break;
                                    case 80:
                                        this.f15346L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f15346L);
                                        break;
                                    case 81:
                                        this.f15358X = typedArrayObtainStyledAttributes.getInt(index, this.f15358X);
                                        break;
                                    case 82:
                                        this.f15359Y = typedArrayObtainStyledAttributes.getInt(index, this.f15359Y);
                                        break;
                                    case 83:
                                        this.f15362a0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f15362a0);
                                        break;
                                    case 84:
                                        this.f15360Z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f15360Z);
                                        break;
                                    case 85:
                                        this.f15366c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f15366c0);
                                        break;
                                    case 86:
                                        this.f15364b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f15364b0);
                                        break;
                                    case 87:
                                        this.f15383l0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f15383l0);
                                        break;
                                    case 88:
                                        this.f15385m0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f15385m0);
                                        break;
                                    case 89:
                                        this.f15381k0 = typedArrayObtainStyledAttributes.getString(index);
                                        break;
                                    case 90:
                                        this.f15373g = typedArrayObtainStyledAttributes.getBoolean(index, this.f15373g);
                                        break;
                                    case 91:
                                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                                        break;
                                    default:
                                        Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                                        break;
                                }
                        }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* compiled from: ConstraintSet.java */
    public static class c {

        /* renamed from: j, reason: collision with root package name */
        public static final SparseIntArray f15401j;

        /* renamed from: a, reason: collision with root package name */
        public int f15402a;

        /* renamed from: b, reason: collision with root package name */
        public int f15403b;

        /* renamed from: c, reason: collision with root package name */
        public int f15404c;

        /* renamed from: d, reason: collision with root package name */
        public float f15405d;

        /* renamed from: e, reason: collision with root package name */
        public float f15406e;

        /* renamed from: f, reason: collision with root package name */
        public float f15407f;

        /* renamed from: g, reason: collision with root package name */
        public int f15408g;

        /* renamed from: h, reason: collision with root package name */
        public String f15409h;
        public int i;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f15401j = sparseIntArray;
            sparseIntArray.append(3, 1);
            sparseIntArray.append(5, 2);
            sparseIntArray.append(9, 3);
            sparseIntArray.append(2, 4);
            sparseIntArray.append(1, 5);
            sparseIntArray.append(0, 6);
            sparseIntArray.append(4, 7);
            sparseIntArray.append(8, 8);
            sparseIntArray.append(7, 9);
            sparseIntArray.append(6, 10);
        }

        public final void a(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u0.d.f46504g);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                switch (f15401j.get(index)) {
                    case 1:
                        this.f15406e = typedArrayObtainStyledAttributes.getFloat(index, this.f15406e);
                        break;
                    case 2:
                        this.f15404c = typedArrayObtainStyledAttributes.getInt(index, this.f15404c);
                        break;
                    case 3:
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            typedArrayObtainStyledAttributes.getString(index);
                            break;
                        } else {
                            String str = C5487a.f45316b[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                            break;
                        }
                    case 4:
                        typedArrayObtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f15402a = d.f(typedArrayObtainStyledAttributes, index, this.f15402a);
                        break;
                    case 6:
                        this.f15403b = typedArrayObtainStyledAttributes.getInteger(index, this.f15403b);
                        break;
                    case 7:
                        this.f15405d = typedArrayObtainStyledAttributes.getFloat(index, this.f15405d);
                        break;
                    case 8:
                        this.f15408g = typedArrayObtainStyledAttributes.getInteger(index, this.f15408g);
                        break;
                    case 9:
                        this.f15407f = typedArrayObtainStyledAttributes.getFloat(index, this.f15407f);
                        break;
                    case 10:
                        int i10 = typedArrayObtainStyledAttributes.peekValue(index).type;
                        if (i10 == 1) {
                            this.i = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            break;
                        } else if (i10 == 3) {
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            this.f15409h = string;
                            if (string.indexOf("/") > 0) {
                                this.i = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                break;
                            } else {
                                break;
                            }
                        } else {
                            typedArrayObtainStyledAttributes.getInteger(index, this.i);
                            break;
                        }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* compiled from: ConstraintSet.java */
    /* renamed from: androidx.constraintlayout.widget.d$d, reason: collision with other inner class name */
    public static class C0234d {

        /* renamed from: a, reason: collision with root package name */
        public int f15410a;

        /* renamed from: b, reason: collision with root package name */
        public int f15411b;

        /* renamed from: c, reason: collision with root package name */
        public float f15412c;

        /* renamed from: d, reason: collision with root package name */
        public float f15413d;

        public final void a(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u0.d.i);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 1) {
                    this.f15412c = typedArrayObtainStyledAttributes.getFloat(index, this.f15412c);
                } else if (index == 0) {
                    int i10 = typedArrayObtainStyledAttributes.getInt(index, this.f15410a);
                    this.f15410a = i10;
                    this.f15410a = d.f15311d[i10];
                } else if (index == 4) {
                    this.f15411b = typedArrayObtainStyledAttributes.getInt(index, this.f15411b);
                } else if (index == 3) {
                    this.f15413d = typedArrayObtainStyledAttributes.getFloat(index, this.f15413d);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* compiled from: ConstraintSet.java */
    public static class e {

        /* renamed from: n, reason: collision with root package name */
        public static final SparseIntArray f15414n;

        /* renamed from: a, reason: collision with root package name */
        public float f15415a;

        /* renamed from: b, reason: collision with root package name */
        public float f15416b;

        /* renamed from: c, reason: collision with root package name */
        public float f15417c;

        /* renamed from: d, reason: collision with root package name */
        public float f15418d;

        /* renamed from: e, reason: collision with root package name */
        public float f15419e;

        /* renamed from: f, reason: collision with root package name */
        public float f15420f;

        /* renamed from: g, reason: collision with root package name */
        public float f15421g;

        /* renamed from: h, reason: collision with root package name */
        public int f15422h;
        public float i;

        /* renamed from: j, reason: collision with root package name */
        public float f15423j;

        /* renamed from: k, reason: collision with root package name */
        public float f15424k;

        /* renamed from: l, reason: collision with root package name */
        public boolean f15425l;

        /* renamed from: m, reason: collision with root package name */
        public float f15426m;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f15414n = sparseIntArray;
            sparseIntArray.append(6, 1);
            sparseIntArray.append(7, 2);
            sparseIntArray.append(8, 3);
            sparseIntArray.append(4, 4);
            sparseIntArray.append(5, 5);
            sparseIntArray.append(0, 6);
            sparseIntArray.append(1, 7);
            sparseIntArray.append(2, 8);
            sparseIntArray.append(3, 9);
            sparseIntArray.append(9, 10);
            sparseIntArray.append(10, 11);
            sparseIntArray.append(11, 12);
        }

        public final void a(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u0.d.f46507k);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                switch (f15414n.get(index)) {
                    case 1:
                        this.f15415a = typedArrayObtainStyledAttributes.getFloat(index, this.f15415a);
                        break;
                    case 2:
                        this.f15416b = typedArrayObtainStyledAttributes.getFloat(index, this.f15416b);
                        break;
                    case 3:
                        this.f15417c = typedArrayObtainStyledAttributes.getFloat(index, this.f15417c);
                        break;
                    case 4:
                        this.f15418d = typedArrayObtainStyledAttributes.getFloat(index, this.f15418d);
                        break;
                    case 5:
                        this.f15419e = typedArrayObtainStyledAttributes.getFloat(index, this.f15419e);
                        break;
                    case 6:
                        this.f15420f = typedArrayObtainStyledAttributes.getDimension(index, this.f15420f);
                        break;
                    case 7:
                        this.f15421g = typedArrayObtainStyledAttributes.getDimension(index, this.f15421g);
                        break;
                    case 8:
                        this.i = typedArrayObtainStyledAttributes.getDimension(index, this.i);
                        break;
                    case 9:
                        this.f15423j = typedArrayObtainStyledAttributes.getDimension(index, this.f15423j);
                        break;
                    case 10:
                        this.f15424k = typedArrayObtainStyledAttributes.getDimension(index, this.f15424k);
                        break;
                    case 11:
                        this.f15425l = true;
                        this.f15426m = typedArrayObtainStyledAttributes.getDimension(index, this.f15426m);
                        break;
                    case 12:
                        this.f15422h = d.f(typedArrayObtainStyledAttributes, index, this.f15422h);
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f15312e = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f15313f = sparseIntArray2;
        sparseIntArray.append(82, 25);
        sparseIntArray.append(83, 26);
        sparseIntArray.append(85, 29);
        sparseIntArray.append(86, 30);
        sparseIntArray.append(92, 36);
        sparseIntArray.append(91, 35);
        sparseIntArray.append(63, 4);
        sparseIntArray.append(62, 3);
        sparseIntArray.append(58, 1);
        sparseIntArray.append(60, 91);
        sparseIntArray.append(59, 92);
        sparseIntArray.append(101, 6);
        sparseIntArray.append(102, 7);
        sparseIntArray.append(70, 17);
        sparseIntArray.append(71, 18);
        sparseIntArray.append(72, 19);
        sparseIntArray.append(54, 99);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(87, 32);
        sparseIntArray.append(88, 33);
        sparseIntArray.append(69, 10);
        sparseIntArray.append(68, 9);
        sparseIntArray.append(106, 13);
        sparseIntArray.append(109, 16);
        sparseIntArray.append(107, 14);
        sparseIntArray.append(104, 11);
        sparseIntArray.append(108, 15);
        sparseIntArray.append(105, 12);
        sparseIntArray.append(95, 40);
        sparseIntArray.append(80, 39);
        sparseIntArray.append(79, 41);
        sparseIntArray.append(94, 42);
        sparseIntArray.append(78, 20);
        sparseIntArray.append(93, 37);
        sparseIntArray.append(67, 5);
        sparseIntArray.append(81, 87);
        sparseIntArray.append(90, 87);
        sparseIntArray.append(84, 87);
        sparseIntArray.append(61, 87);
        sparseIntArray.append(57, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(96, 95);
        sparseIntArray.append(73, 96);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(97, 54);
        sparseIntArray.append(74, 55);
        sparseIntArray.append(98, 56);
        sparseIntArray.append(75, 57);
        sparseIntArray.append(99, 58);
        sparseIntArray.append(76, 59);
        sparseIntArray.append(64, 61);
        sparseIntArray.append(66, 62);
        sparseIntArray.append(65, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(121, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(122, 67);
        sparseIntArray.append(113, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(112, 68);
        sparseIntArray.append(100, 69);
        sparseIntArray.append(77, 70);
        sparseIntArray.append(111, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(114, 76);
        sparseIntArray.append(89, 77);
        sparseIntArray.append(123, 78);
        sparseIntArray.append(56, 80);
        sparseIntArray.append(55, 81);
        sparseIntArray.append(116, 82);
        sparseIntArray.append(120, 83);
        sparseIntArray.append(119, 84);
        sparseIntArray.append(118, 85);
        sparseIntArray.append(117, 86);
        sparseIntArray2.append(85, 6);
        sparseIntArray2.append(85, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(89, 13);
        sparseIntArray2.append(92, 16);
        sparseIntArray2.append(90, 14);
        sparseIntArray2.append(87, 11);
        sparseIntArray2.append(91, 15);
        sparseIntArray2.append(88, 12);
        sparseIntArray2.append(78, 40);
        sparseIntArray2.append(71, 39);
        sparseIntArray2.append(70, 41);
        sparseIntArray2.append(77, 42);
        sparseIntArray2.append(69, 20);
        sparseIntArray2.append(76, 37);
        sparseIntArray2.append(60, 5);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(75, 87);
        sparseIntArray2.append(73, 87);
        sparseIntArray2.append(57, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(79, 95);
        sparseIntArray2.append(64, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(80, 54);
        sparseIntArray2.append(65, 55);
        sparseIntArray2.append(81, 56);
        sparseIntArray2.append(66, 57);
        sparseIntArray2.append(82, 58);
        sparseIntArray2.append(67, 59);
        sparseIntArray2.append(59, 62);
        sparseIntArray2.append(58, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(105, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(106, 67);
        sparseIntArray2.append(96, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(97, 98);
        sparseIntArray2.append(95, 68);
        sparseIntArray2.append(83, 69);
        sparseIntArray2.append(68, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(98, 76);
        sparseIntArray2.append(74, 77);
        sparseIntArray2.append(107, 78);
        sparseIntArray2.append(55, 80);
        sparseIntArray2.append(54, 81);
        sparseIntArray2.append(100, 82);
        sparseIntArray2.append(104, 83);
        sparseIntArray2.append(103, 84);
        sparseIntArray2.append(102, 85);
        sparseIntArray2.append(101, 86);
        sparseIntArray2.append(94, 97);
    }

    public static int[] c(androidx.constraintlayout.widget.a aVar, String str) throws IllegalAccessException, IllegalArgumentException {
        int iIntValue;
        String[] strArrSplit = str.split(StringUtils.COMMA);
        Context context = aVar.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i = 0;
        int i10 = 0;
        while (i < strArrSplit.length) {
            String strTrim = strArrSplit[i].trim();
            Integer num = null;
            try {
                iIntValue = u0.c.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, FacebookMediationAdapter.KEY_ID, context.getPackageName());
            }
            if (iIntValue == 0 && aVar.isInEditMode() && (aVar.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) aVar.getParent();
                if (s.n(strTrim)) {
                    HashMap<String, Integer> map = constraintLayout.f15208n;
                    if (map != null && map.containsKey(strTrim)) {
                        num = constraintLayout.f15208n.get(strTrim);
                    }
                } else {
                    constraintLayout.getClass();
                }
                if (num != null && (num instanceof Integer)) {
                    iIntValue = num.intValue();
                }
            }
            iArr[i10] = iIntValue;
            i++;
            i10++;
        }
        return i10 != strArrSplit.length ? Arrays.copyOf(iArr, i10) : iArr;
    }

    public static a d(Context context, AttributeSet attributeSet, boolean z10) {
        int i;
        int i10;
        String str;
        a aVar = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z10 ? u0.d.f46500c : u0.d.f46498a);
        int[] iArr = f15311d;
        String[] strArr = C5487a.f45316b;
        SparseIntArray sparseIntArray = f15312e;
        C0234d c0234d = aVar.f15318b;
        e eVar = aVar.f15321e;
        c cVar = aVar.f15319c;
        b bVar = aVar.f15320d;
        String str2 = "Unknown attribute 0x";
        if (z10) {
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            a.C0233a c0233a = new a.C0233a();
            cVar.getClass();
            bVar.getClass();
            eVar.getClass();
            int i11 = 0;
            while (i11 < indexCount) {
                int i12 = indexCount;
                int index = typedArrayObtainStyledAttributes.getIndex(i11);
                int i13 = i11;
                switch (f15313f.get(index)) {
                    case 2:
                        str = str2;
                        c0233a.b(2, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.f15343I));
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
                        StringBuilder sb = new StringBuilder(str2);
                        str = str2;
                        sb.append(Integer.toHexString(index));
                        sb.append("   ");
                        sb.append(sparseIntArray.get(index));
                        Log.w("ConstraintSet", sb.toString());
                        break;
                    case 5:
                        str = str2;
                        c0233a.c(5, typedArrayObtainStyledAttributes.getString(index));
                        break;
                    case 6:
                        str = str2;
                        c0233a.b(6, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, bVar.f15337C));
                        break;
                    case 7:
                        str = str2;
                        c0233a.b(7, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, bVar.f15338D));
                        break;
                    case 8:
                        str = str2;
                        c0233a.b(8, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.f15344J));
                        break;
                    case 11:
                        str = str2;
                        c0233a.b(11, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.f15350P));
                        break;
                    case 12:
                        str = str2;
                        c0233a.b(12, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.f15351Q));
                        break;
                    case 13:
                        str = str2;
                        c0233a.b(13, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.f15347M));
                        break;
                    case 14:
                        str = str2;
                        c0233a.b(14, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.f15349O));
                        break;
                    case 15:
                        str = str2;
                        c0233a.b(15, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.f15352R));
                        break;
                    case 16:
                        str = str2;
                        c0233a.b(16, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.f15348N));
                        break;
                    case 17:
                        str = str2;
                        c0233a.b(17, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, bVar.f15367d));
                        break;
                    case 18:
                        str = str2;
                        c0233a.b(18, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, bVar.f15369e));
                        break;
                    case 19:
                        str = str2;
                        c0233a.a(typedArrayObtainStyledAttributes.getFloat(index, bVar.f15371f), 19);
                        break;
                    case 20:
                        str = str2;
                        c0233a.a(typedArrayObtainStyledAttributes.getFloat(index, bVar.f15397w), 20);
                        break;
                    case 21:
                        str = str2;
                        c0233a.b(21, typedArrayObtainStyledAttributes.getLayoutDimension(index, bVar.f15365c));
                        break;
                    case 22:
                        str = str2;
                        c0233a.b(22, iArr[typedArrayObtainStyledAttributes.getInt(index, c0234d.f15410a)]);
                        break;
                    case 23:
                        str = str2;
                        c0233a.b(23, typedArrayObtainStyledAttributes.getLayoutDimension(index, bVar.f15363b));
                        break;
                    case 24:
                        str = str2;
                        c0233a.b(24, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.f15340F));
                        break;
                    case 27:
                        str = str2;
                        c0233a.b(27, typedArrayObtainStyledAttributes.getInt(index, bVar.f15339E));
                        break;
                    case 28:
                        str = str2;
                        c0233a.b(28, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.f15341G));
                        break;
                    case 31:
                        str = str2;
                        c0233a.b(31, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.f15345K));
                        break;
                    case 34:
                        str = str2;
                        c0233a.b(34, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.f15342H));
                        break;
                    case 37:
                        str = str2;
                        c0233a.a(typedArrayObtainStyledAttributes.getFloat(index, bVar.f15398x), 37);
                        break;
                    case 38:
                        str = str2;
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, aVar.f15317a);
                        aVar.f15317a = resourceId;
                        c0233a.b(38, resourceId);
                        break;
                    case 39:
                        str = str2;
                        c0233a.a(typedArrayObtainStyledAttributes.getFloat(index, bVar.f15355U), 39);
                        break;
                    case 40:
                        str = str2;
                        c0233a.a(typedArrayObtainStyledAttributes.getFloat(index, bVar.f15354T), 40);
                        break;
                    case 41:
                        str = str2;
                        c0233a.b(41, typedArrayObtainStyledAttributes.getInt(index, bVar.f15356V));
                        break;
                    case 42:
                        str = str2;
                        c0233a.b(42, typedArrayObtainStyledAttributes.getInt(index, bVar.f15357W));
                        break;
                    case 43:
                        str = str2;
                        c0233a.a(typedArrayObtainStyledAttributes.getFloat(index, c0234d.f15412c), 43);
                        break;
                    case 44:
                        str = str2;
                        c0233a.d(44, true);
                        c0233a.a(typedArrayObtainStyledAttributes.getDimension(index, eVar.f15426m), 44);
                        break;
                    case 45:
                        str = str2;
                        c0233a.a(typedArrayObtainStyledAttributes.getFloat(index, eVar.f15416b), 45);
                        break;
                    case 46:
                        str = str2;
                        c0233a.a(typedArrayObtainStyledAttributes.getFloat(index, eVar.f15417c), 46);
                        break;
                    case 47:
                        str = str2;
                        c0233a.a(typedArrayObtainStyledAttributes.getFloat(index, eVar.f15418d), 47);
                        break;
                    case 48:
                        str = str2;
                        c0233a.a(typedArrayObtainStyledAttributes.getFloat(index, eVar.f15419e), 48);
                        break;
                    case 49:
                        str = str2;
                        c0233a.a(typedArrayObtainStyledAttributes.getDimension(index, eVar.f15420f), 49);
                        break;
                    case 50:
                        str = str2;
                        c0233a.a(typedArrayObtainStyledAttributes.getDimension(index, eVar.f15421g), 50);
                        break;
                    case 51:
                        str = str2;
                        c0233a.a(typedArrayObtainStyledAttributes.getDimension(index, eVar.i), 51);
                        break;
                    case 52:
                        str = str2;
                        c0233a.a(typedArrayObtainStyledAttributes.getDimension(index, eVar.f15423j), 52);
                        break;
                    case 53:
                        str = str2;
                        c0233a.a(typedArrayObtainStyledAttributes.getDimension(index, eVar.f15424k), 53);
                        break;
                    case 54:
                        str = str2;
                        c0233a.b(54, typedArrayObtainStyledAttributes.getInt(index, bVar.f15358X));
                        break;
                    case 55:
                        str = str2;
                        c0233a.b(55, typedArrayObtainStyledAttributes.getInt(index, bVar.f15359Y));
                        break;
                    case 56:
                        str = str2;
                        c0233a.b(56, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.f15360Z));
                        break;
                    case 57:
                        str = str2;
                        c0233a.b(57, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.f15362a0));
                        break;
                    case 58:
                        str = str2;
                        c0233a.b(58, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.f15364b0));
                        break;
                    case 59:
                        str = str2;
                        c0233a.b(59, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.f15366c0));
                        break;
                    case 60:
                        str = str2;
                        c0233a.a(typedArrayObtainStyledAttributes.getFloat(index, eVar.f15415a), 60);
                        break;
                    case 62:
                        str = str2;
                        c0233a.b(62, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.f15335A));
                        break;
                    case 63:
                        str = str2;
                        c0233a.a(typedArrayObtainStyledAttributes.getFloat(index, bVar.f15336B), 63);
                        break;
                    case 64:
                        str = str2;
                        c0233a.b(64, f(typedArrayObtainStyledAttributes, index, cVar.f15402a));
                        break;
                    case 65:
                        str = str2;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type != 3) {
                            c0233a.c(65, strArr[typedArrayObtainStyledAttributes.getInteger(index, 0)]);
                            break;
                        } else {
                            c0233a.c(65, typedArrayObtainStyledAttributes.getString(index));
                            break;
                        }
                    case 66:
                        str = str2;
                        c0233a.b(66, typedArrayObtainStyledAttributes.getInt(index, 0));
                        break;
                    case 67:
                        str = str2;
                        c0233a.a(typedArrayObtainStyledAttributes.getFloat(index, cVar.f15406e), 67);
                        break;
                    case 68:
                        str = str2;
                        c0233a.a(typedArrayObtainStyledAttributes.getFloat(index, c0234d.f15413d), 68);
                        break;
                    case 69:
                        str = str2;
                        c0233a.a(typedArrayObtainStyledAttributes.getFloat(index, 1.0f), 69);
                        break;
                    case 70:
                        str = str2;
                        c0233a.a(typedArrayObtainStyledAttributes.getFloat(index, 1.0f), 70);
                        break;
                    case 71:
                        str = str2;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        str = str2;
                        c0233a.b(72, typedArrayObtainStyledAttributes.getInt(index, bVar.f15372f0));
                        break;
                    case 73:
                        str = str2;
                        c0233a.b(73, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.f15374g0));
                        break;
                    case 74:
                        str = str2;
                        c0233a.c(74, typedArrayObtainStyledAttributes.getString(index));
                        break;
                    case 75:
                        str = str2;
                        c0233a.d(75, typedArrayObtainStyledAttributes.getBoolean(index, bVar.f15387n0));
                        break;
                    case 76:
                        str = str2;
                        c0233a.b(76, typedArrayObtainStyledAttributes.getInt(index, cVar.f15404c));
                        break;
                    case 77:
                        str = str2;
                        c0233a.c(77, typedArrayObtainStyledAttributes.getString(index));
                        break;
                    case 78:
                        str = str2;
                        c0233a.b(78, typedArrayObtainStyledAttributes.getInt(index, c0234d.f15411b));
                        break;
                    case 79:
                        str = str2;
                        c0233a.a(typedArrayObtainStyledAttributes.getFloat(index, cVar.f15405d), 79);
                        break;
                    case 80:
                        str = str2;
                        c0233a.d(80, typedArrayObtainStyledAttributes.getBoolean(index, bVar.f15383l0));
                        break;
                    case 81:
                        str = str2;
                        c0233a.d(81, typedArrayObtainStyledAttributes.getBoolean(index, bVar.f15385m0));
                        break;
                    case 82:
                        str = str2;
                        c0233a.b(82, typedArrayObtainStyledAttributes.getInteger(index, cVar.f15403b));
                        break;
                    case 83:
                        str = str2;
                        c0233a.b(83, f(typedArrayObtainStyledAttributes, index, eVar.f15422h));
                        break;
                    case 84:
                        str = str2;
                        c0233a.b(84, typedArrayObtainStyledAttributes.getInteger(index, cVar.f15408g));
                        break;
                    case 85:
                        str = str2;
                        c0233a.a(typedArrayObtainStyledAttributes.getFloat(index, cVar.f15407f), 85);
                        break;
                    case 86:
                        str = str2;
                        int i14 = typedArrayObtainStyledAttributes.peekValue(index).type;
                        if (i14 != 1) {
                            if (i14 != 3) {
                                c0233a.b(88, typedArrayObtainStyledAttributes.getInteger(index, cVar.i));
                                break;
                            } else {
                                String string = typedArrayObtainStyledAttributes.getString(index);
                                cVar.f15409h = string;
                                c0233a.c(90, string);
                                if (cVar.f15409h.indexOf("/") <= 0) {
                                    c0233a.b(88, -1);
                                    break;
                                } else {
                                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                    cVar.i = resourceId2;
                                    c0233a.b(89, resourceId2);
                                    c0233a.b(88, -2);
                                    break;
                                }
                            }
                        } else {
                            int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            cVar.i = resourceId3;
                            c0233a.b(89, resourceId3);
                            if (cVar.i != -1) {
                                c0233a.b(88, -2);
                                break;
                            }
                        }
                        break;
                    case 87:
                        str = str2;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                        break;
                    case 93:
                        str = str2;
                        c0233a.b(93, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.f15346L));
                        break;
                    case 94:
                        str = str2;
                        c0233a.b(94, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.f15353S));
                        break;
                    case 95:
                        str = str2;
                        g(c0233a, typedArrayObtainStyledAttributes, index, 0);
                        break;
                    case 96:
                        str = str2;
                        g(c0233a, typedArrayObtainStyledAttributes, index, 1);
                        continue;
                        i11 = i13 + 1;
                        indexCount = i12;
                        str2 = str;
                    case 97:
                        str = str2;
                        c0233a.b(97, typedArrayObtainStyledAttributes.getInt(index, bVar.f15389o0));
                        break;
                    case 98:
                        str = str2;
                        int i15 = t0.d.f46349I;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type != 3) {
                            aVar.f15317a = typedArrayObtainStyledAttributes.getResourceId(index, aVar.f15317a);
                            break;
                        } else {
                            typedArrayObtainStyledAttributes.getString(index);
                            break;
                        }
                    case 99:
                        str = str2;
                        c0233a.d(99, typedArrayObtainStyledAttributes.getBoolean(index, bVar.f15373g));
                        break;
                }
                i11 = i13 + 1;
                indexCount = i12;
                str2 = str;
            }
        } else {
            int i16 = 1;
            int indexCount2 = typedArrayObtainStyledAttributes.getIndexCount();
            int i17 = 0;
            while (i17 < indexCount2) {
                int index2 = typedArrayObtainStyledAttributes.getIndex(i17);
                if (index2 != i16 && 23 != index2) {
                    if (24 != index2) {
                        cVar.getClass();
                        bVar.getClass();
                        eVar.getClass();
                    }
                }
                switch (sparseIntArray.get(index2)) {
                    case 1:
                        i = indexCount2;
                        bVar.f15390p = f(typedArrayObtainStyledAttributes, index2, bVar.f15390p);
                        i10 = 1;
                        break;
                    case 2:
                        i = indexCount2;
                        bVar.f15343I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, bVar.f15343I);
                        i10 = 1;
                        break;
                    case 3:
                        i = indexCount2;
                        bVar.f15388o = f(typedArrayObtainStyledAttributes, index2, bVar.f15388o);
                        i10 = 1;
                        break;
                    case 4:
                        i = indexCount2;
                        bVar.f15386n = f(typedArrayObtainStyledAttributes, index2, bVar.f15386n);
                        i10 = 1;
                        break;
                    case 5:
                        i = indexCount2;
                        bVar.f15399y = typedArrayObtainStyledAttributes.getString(index2);
                        i10 = 1;
                        break;
                    case 6:
                        i = indexCount2;
                        bVar.f15337C = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, bVar.f15337C);
                        i10 = 1;
                        break;
                    case 7:
                        i = indexCount2;
                        bVar.f15338D = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, bVar.f15338D);
                        i10 = 1;
                        break;
                    case 8:
                        i = indexCount2;
                        bVar.f15344J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, bVar.f15344J);
                        i10 = 1;
                        break;
                    case 9:
                        i = indexCount2;
                        bVar.f15396v = f(typedArrayObtainStyledAttributes, index2, bVar.f15396v);
                        i10 = 1;
                        break;
                    case 10:
                        i = indexCount2;
                        bVar.f15395u = f(typedArrayObtainStyledAttributes, index2, bVar.f15395u);
                        i10 = 1;
                        break;
                    case 11:
                        i = indexCount2;
                        bVar.f15350P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, bVar.f15350P);
                        i10 = 1;
                        break;
                    case 12:
                        i = indexCount2;
                        bVar.f15351Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, bVar.f15351Q);
                        i10 = 1;
                        break;
                    case 13:
                        i = indexCount2;
                        bVar.f15347M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, bVar.f15347M);
                        i10 = 1;
                        break;
                    case 14:
                        i = indexCount2;
                        bVar.f15349O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, bVar.f15349O);
                        i10 = 1;
                        break;
                    case 15:
                        i = indexCount2;
                        bVar.f15352R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, bVar.f15352R);
                        i10 = 1;
                        break;
                    case 16:
                        i = indexCount2;
                        bVar.f15348N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, bVar.f15348N);
                        i10 = 1;
                        break;
                    case 17:
                        i = indexCount2;
                        bVar.f15367d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, bVar.f15367d);
                        i10 = 1;
                        break;
                    case 18:
                        i = indexCount2;
                        bVar.f15369e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, bVar.f15369e);
                        i10 = 1;
                        break;
                    case 19:
                        i = indexCount2;
                        bVar.f15371f = typedArrayObtainStyledAttributes.getFloat(index2, bVar.f15371f);
                        i10 = 1;
                        break;
                    case 20:
                        i = indexCount2;
                        bVar.f15397w = typedArrayObtainStyledAttributes.getFloat(index2, bVar.f15397w);
                        i10 = 1;
                        break;
                    case 21:
                        i = indexCount2;
                        bVar.f15365c = typedArrayObtainStyledAttributes.getLayoutDimension(index2, bVar.f15365c);
                        i10 = 1;
                        break;
                    case 22:
                        i = indexCount2;
                        int i18 = typedArrayObtainStyledAttributes.getInt(index2, c0234d.f15410a);
                        c0234d.f15410a = i18;
                        c0234d.f15410a = iArr[i18];
                        i10 = 1;
                        break;
                    case 23:
                        i = indexCount2;
                        bVar.f15363b = typedArrayObtainStyledAttributes.getLayoutDimension(index2, bVar.f15363b);
                        i10 = 1;
                        break;
                    case 24:
                        i = indexCount2;
                        bVar.f15340F = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, bVar.f15340F);
                        i10 = 1;
                        break;
                    case 25:
                        i = indexCount2;
                        bVar.f15375h = f(typedArrayObtainStyledAttributes, index2, bVar.f15375h);
                        i10 = 1;
                        break;
                    case 26:
                        i = indexCount2;
                        bVar.i = f(typedArrayObtainStyledAttributes, index2, bVar.i);
                        i10 = 1;
                        break;
                    case 27:
                        i = indexCount2;
                        bVar.f15339E = typedArrayObtainStyledAttributes.getInt(index2, bVar.f15339E);
                        i10 = 1;
                        break;
                    case 28:
                        i = indexCount2;
                        bVar.f15341G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, bVar.f15341G);
                        i10 = 1;
                        break;
                    case 29:
                        i = indexCount2;
                        bVar.f15378j = f(typedArrayObtainStyledAttributes, index2, bVar.f15378j);
                        i10 = 1;
                        break;
                    case 30:
                        i = indexCount2;
                        bVar.f15380k = f(typedArrayObtainStyledAttributes, index2, bVar.f15380k);
                        i10 = 1;
                        break;
                    case 31:
                        i = indexCount2;
                        bVar.f15345K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, bVar.f15345K);
                        i10 = 1;
                        break;
                    case 32:
                        i = indexCount2;
                        bVar.f15393s = f(typedArrayObtainStyledAttributes, index2, bVar.f15393s);
                        i10 = 1;
                        break;
                    case 33:
                        i = indexCount2;
                        bVar.f15394t = f(typedArrayObtainStyledAttributes, index2, bVar.f15394t);
                        i10 = 1;
                        break;
                    case 34:
                        i = indexCount2;
                        bVar.f15342H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, bVar.f15342H);
                        i10 = 1;
                        break;
                    case 35:
                        i = indexCount2;
                        bVar.f15384m = f(typedArrayObtainStyledAttributes, index2, bVar.f15384m);
                        i10 = 1;
                        break;
                    case 36:
                        i = indexCount2;
                        bVar.f15382l = f(typedArrayObtainStyledAttributes, index2, bVar.f15382l);
                        i10 = 1;
                        break;
                    case 37:
                        i = indexCount2;
                        bVar.f15398x = typedArrayObtainStyledAttributes.getFloat(index2, bVar.f15398x);
                        i10 = 1;
                        break;
                    case 38:
                        i = indexCount2;
                        aVar.f15317a = typedArrayObtainStyledAttributes.getResourceId(index2, aVar.f15317a);
                        i10 = 1;
                        break;
                    case 39:
                        i = indexCount2;
                        bVar.f15355U = typedArrayObtainStyledAttributes.getFloat(index2, bVar.f15355U);
                        i10 = 1;
                        break;
                    case 40:
                        i = indexCount2;
                        bVar.f15354T = typedArrayObtainStyledAttributes.getFloat(index2, bVar.f15354T);
                        i10 = 1;
                        break;
                    case 41:
                        i = indexCount2;
                        bVar.f15356V = typedArrayObtainStyledAttributes.getInt(index2, bVar.f15356V);
                        i10 = 1;
                        break;
                    case 42:
                        i = indexCount2;
                        bVar.f15357W = typedArrayObtainStyledAttributes.getInt(index2, bVar.f15357W);
                        i10 = 1;
                        break;
                    case 43:
                        i = indexCount2;
                        c0234d.f15412c = typedArrayObtainStyledAttributes.getFloat(index2, c0234d.f15412c);
                        i10 = 1;
                        break;
                    case 44:
                        i = indexCount2;
                        eVar.f15425l = true;
                        eVar.f15426m = typedArrayObtainStyledAttributes.getDimension(index2, eVar.f15426m);
                        i10 = 1;
                        break;
                    case 45:
                        i = indexCount2;
                        eVar.f15416b = typedArrayObtainStyledAttributes.getFloat(index2, eVar.f15416b);
                        i10 = 1;
                        break;
                    case 46:
                        i = indexCount2;
                        eVar.f15417c = typedArrayObtainStyledAttributes.getFloat(index2, eVar.f15417c);
                        i10 = 1;
                        break;
                    case 47:
                        i = indexCount2;
                        eVar.f15418d = typedArrayObtainStyledAttributes.getFloat(index2, eVar.f15418d);
                        i10 = 1;
                        break;
                    case 48:
                        i = indexCount2;
                        eVar.f15419e = typedArrayObtainStyledAttributes.getFloat(index2, eVar.f15419e);
                        i10 = 1;
                        break;
                    case 49:
                        i = indexCount2;
                        eVar.f15420f = typedArrayObtainStyledAttributes.getDimension(index2, eVar.f15420f);
                        i10 = 1;
                        break;
                    case 50:
                        i = indexCount2;
                        eVar.f15421g = typedArrayObtainStyledAttributes.getDimension(index2, eVar.f15421g);
                        i10 = 1;
                        break;
                    case 51:
                        i = indexCount2;
                        eVar.i = typedArrayObtainStyledAttributes.getDimension(index2, eVar.i);
                        i10 = 1;
                        break;
                    case 52:
                        i = indexCount2;
                        eVar.f15423j = typedArrayObtainStyledAttributes.getDimension(index2, eVar.f15423j);
                        i10 = 1;
                        break;
                    case 53:
                        i = indexCount2;
                        eVar.f15424k = typedArrayObtainStyledAttributes.getDimension(index2, eVar.f15424k);
                        i10 = 1;
                        break;
                    case 54:
                        i = indexCount2;
                        bVar.f15358X = typedArrayObtainStyledAttributes.getInt(index2, bVar.f15358X);
                        i10 = 1;
                        break;
                    case 55:
                        i = indexCount2;
                        bVar.f15359Y = typedArrayObtainStyledAttributes.getInt(index2, bVar.f15359Y);
                        i10 = 1;
                        break;
                    case 56:
                        i = indexCount2;
                        bVar.f15360Z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, bVar.f15360Z);
                        i10 = 1;
                        break;
                    case 57:
                        i = indexCount2;
                        bVar.f15362a0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, bVar.f15362a0);
                        i10 = 1;
                        break;
                    case 58:
                        i = indexCount2;
                        bVar.f15364b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, bVar.f15364b0);
                        i10 = 1;
                        break;
                    case 59:
                        i = indexCount2;
                        bVar.f15366c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, bVar.f15366c0);
                        i10 = 1;
                        break;
                    case 60:
                        i = indexCount2;
                        eVar.f15415a = typedArrayObtainStyledAttributes.getFloat(index2, eVar.f15415a);
                        i10 = 1;
                        break;
                    case 61:
                        i = indexCount2;
                        bVar.f15400z = f(typedArrayObtainStyledAttributes, index2, bVar.f15400z);
                        i10 = 1;
                        break;
                    case 62:
                        i = indexCount2;
                        bVar.f15335A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, bVar.f15335A);
                        i10 = 1;
                        break;
                    case 63:
                        i = indexCount2;
                        bVar.f15336B = typedArrayObtainStyledAttributes.getFloat(index2, bVar.f15336B);
                        i10 = 1;
                        break;
                    case 64:
                        i = indexCount2;
                        cVar.f15402a = f(typedArrayObtainStyledAttributes, index2, cVar.f15402a);
                        i10 = 1;
                        break;
                    case 65:
                        i = indexCount2;
                        if (typedArrayObtainStyledAttributes.peekValue(index2).type == 3) {
                            typedArrayObtainStyledAttributes.getString(index2);
                            cVar.getClass();
                            i10 = 1;
                            break;
                        } else {
                            String str3 = strArr[typedArrayObtainStyledAttributes.getInteger(index2, 0)];
                            cVar.getClass();
                            i10 = 1;
                        }
                    case 66:
                        i = indexCount2;
                        typedArrayObtainStyledAttributes.getInt(index2, 0);
                        cVar.getClass();
                        i10 = 1;
                        break;
                    case 67:
                        i = indexCount2;
                        cVar.f15406e = typedArrayObtainStyledAttributes.getFloat(index2, cVar.f15406e);
                        i10 = 1;
                        break;
                    case 68:
                        i = indexCount2;
                        c0234d.f15413d = typedArrayObtainStyledAttributes.getFloat(index2, c0234d.f15413d);
                        i10 = 1;
                        break;
                    case 69:
                        i = indexCount2;
                        bVar.f15368d0 = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        i10 = 1;
                        break;
                    case 70:
                        i = indexCount2;
                        bVar.f15370e0 = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        i10 = 1;
                        break;
                    case 71:
                        i = indexCount2;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        i10 = 1;
                        break;
                    case 72:
                        i = indexCount2;
                        bVar.f15372f0 = typedArrayObtainStyledAttributes.getInt(index2, bVar.f15372f0);
                        i10 = 1;
                        break;
                    case 73:
                        i = indexCount2;
                        bVar.f15374g0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, bVar.f15374g0);
                        i10 = 1;
                        break;
                    case 74:
                        i = indexCount2;
                        bVar.f15379j0 = typedArrayObtainStyledAttributes.getString(index2);
                        i10 = 1;
                        break;
                    case 75:
                        i = indexCount2;
                        bVar.f15387n0 = typedArrayObtainStyledAttributes.getBoolean(index2, bVar.f15387n0);
                        i10 = 1;
                        break;
                    case 76:
                        i = indexCount2;
                        cVar.f15404c = typedArrayObtainStyledAttributes.getInt(index2, cVar.f15404c);
                        i10 = 1;
                        break;
                    case 77:
                        i = indexCount2;
                        bVar.f15381k0 = typedArrayObtainStyledAttributes.getString(index2);
                        i10 = 1;
                        break;
                    case 78:
                        i = indexCount2;
                        c0234d.f15411b = typedArrayObtainStyledAttributes.getInt(index2, c0234d.f15411b);
                        i10 = 1;
                        break;
                    case 79:
                        i = indexCount2;
                        cVar.f15405d = typedArrayObtainStyledAttributes.getFloat(index2, cVar.f15405d);
                        i10 = 1;
                        break;
                    case 80:
                        i = indexCount2;
                        bVar.f15383l0 = typedArrayObtainStyledAttributes.getBoolean(index2, bVar.f15383l0);
                        i10 = 1;
                        break;
                    case 81:
                        i = indexCount2;
                        bVar.f15385m0 = typedArrayObtainStyledAttributes.getBoolean(index2, bVar.f15385m0);
                        i10 = 1;
                        break;
                    case 82:
                        i = indexCount2;
                        cVar.f15403b = typedArrayObtainStyledAttributes.getInteger(index2, cVar.f15403b);
                        i10 = 1;
                        break;
                    case 83:
                        i = indexCount2;
                        eVar.f15422h = f(typedArrayObtainStyledAttributes, index2, eVar.f15422h);
                        i10 = 1;
                        break;
                    case 84:
                        i = indexCount2;
                        cVar.f15408g = typedArrayObtainStyledAttributes.getInteger(index2, cVar.f15408g);
                        i10 = 1;
                        break;
                    case 85:
                        i = indexCount2;
                        cVar.f15407f = typedArrayObtainStyledAttributes.getFloat(index2, cVar.f15407f);
                        i10 = 1;
                        break;
                    case 86:
                        i = indexCount2;
                        int i19 = typedArrayObtainStyledAttributes.peekValue(index2).type;
                        if (i19 == 1) {
                            cVar.i = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                        } else if (i19 == 3) {
                            String string2 = typedArrayObtainStyledAttributes.getString(index2);
                            cVar.f15409h = string2;
                            if (string2.indexOf("/") > 0) {
                                cVar.i = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                            }
                        } else {
                            typedArrayObtainStyledAttributes.getInteger(index2, cVar.i);
                        }
                        i10 = 1;
                        break;
                    case 87:
                        i = indexCount2;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index2) + "   " + sparseIntArray.get(index2));
                        i10 = 1;
                        break;
                    case 88:
                    case 89:
                    case 90:
                    default:
                        i = indexCount2;
                        Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index2) + "   " + sparseIntArray.get(index2));
                        i10 = 1;
                        break;
                    case 91:
                        i = indexCount2;
                        bVar.f15391q = f(typedArrayObtainStyledAttributes, index2, bVar.f15391q);
                        i10 = 1;
                        break;
                    case 92:
                        i = indexCount2;
                        bVar.f15392r = f(typedArrayObtainStyledAttributes, index2, bVar.f15392r);
                        i10 = 1;
                        break;
                    case 93:
                        i = indexCount2;
                        bVar.f15346L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, bVar.f15346L);
                        i10 = 1;
                        break;
                    case 94:
                        i = indexCount2;
                        bVar.f15353S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, bVar.f15353S);
                        i10 = 1;
                        break;
                    case 95:
                        i = indexCount2;
                        g(bVar, typedArrayObtainStyledAttributes, index2, 0);
                        i10 = 1;
                        break;
                    case 96:
                        i = indexCount2;
                        g(bVar, typedArrayObtainStyledAttributes, index2, 1);
                        i10 = 1;
                        break;
                    case 97:
                        i = indexCount2;
                        bVar.f15389o0 = typedArrayObtainStyledAttributes.getInt(index2, bVar.f15389o0);
                        i10 = 1;
                        break;
                }
                i17++;
                indexCount2 = i;
                i16 = i10;
            }
            if (bVar.f15379j0 != null) {
                bVar.f15377i0 = null;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return aVar;
    }

    public static int f(TypedArray typedArray, int i, int i10) {
        int resourceId = typedArray.getResourceId(i, i10);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void g(java.lang.Object r7, android.content.res.TypedArray r8, int r9, int r10) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.d.g(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    public static void h(ConstraintLayout.b bVar, String str) {
        if (str != null) {
            int length = str.length();
            int iIndexOf = str.indexOf(44);
            int i = -1;
            if (iIndexOf > 0 && iIndexOf < length - 1) {
                String strSubstring = str.substring(0, iIndexOf);
                i = strSubstring.equalsIgnoreCase("W") ? 0 : strSubstring.equalsIgnoreCase("H") ? 1 : -1;
                i = iIndexOf + 1;
            }
            int iIndexOf2 = str.indexOf(58);
            try {
                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                    String strSubstring2 = str.substring(i);
                    if (strSubstring2.length() > 0) {
                        Float.parseFloat(strSubstring2);
                    }
                } else {
                    String strSubstring3 = str.substring(i, iIndexOf2);
                    String strSubstring4 = str.substring(iIndexOf2 + 1);
                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                        float f10 = Float.parseFloat(strSubstring3);
                        float f11 = Float.parseFloat(strSubstring4);
                        if (f10 > 0.0f && f11 > 0.0f) {
                            if (i == 1) {
                                Math.abs(f11 / f10);
                            } else {
                                Math.abs(f10 / f11);
                            }
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        bVar.f15220G = str;
    }

    public final void a(ConstraintLayout constraintLayout) {
        HashSet hashSet;
        int i;
        HashSet hashSet2;
        int i10;
        String resourceEntryName;
        d dVar = this;
        int i11 = 1;
        int childCount = constraintLayout.getChildCount();
        HashMap<Integer, a> map = dVar.f15316c;
        HashSet hashSet3 = new HashSet(map.keySet());
        int i12 = 0;
        while (i12 < childCount) {
            View childAt = constraintLayout.getChildAt(i12);
            int id = childAt.getId();
            if (!map.containsKey(Integer.valueOf(id))) {
                StringBuilder sb = new StringBuilder("id unknown ");
                try {
                    resourceEntryName = childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                    resourceEntryName = "UNKNOWN";
                }
                sb.append(resourceEntryName);
                Log.w("ConstraintSet", sb.toString());
            } else {
                if (dVar.f15315b && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (map.containsKey(Integer.valueOf(id))) {
                        hashSet3.remove(Integer.valueOf(id));
                        a aVar = map.get(Integer.valueOf(id));
                        if (aVar != null) {
                            if (childAt instanceof androidx.constraintlayout.widget.a) {
                                b bVar = aVar.f15320d;
                                bVar.f15376h0 = i11;
                                androidx.constraintlayout.widget.a aVar2 = (androidx.constraintlayout.widget.a) childAt;
                                aVar2.setId(id);
                                aVar2.setType(bVar.f15372f0);
                                aVar2.setMargin(bVar.f15374g0);
                                aVar2.setAllowsGoneWidget(bVar.f15387n0);
                                int[] iArr = bVar.f15377i0;
                                if (iArr != null) {
                                    aVar2.setReferencedIds(iArr);
                                } else {
                                    String str = bVar.f15379j0;
                                    if (str != null) {
                                        int[] iArrC = c(aVar2, str);
                                        bVar.f15377i0 = iArrC;
                                        aVar2.setReferencedIds(iArrC);
                                    }
                                }
                            }
                            ConstraintLayout.b bVar2 = (ConstraintLayout.b) childAt.getLayoutParams();
                            bVar2.a();
                            aVar.a(bVar2);
                            HashMap<String, androidx.constraintlayout.widget.b> map2 = aVar.f15322f;
                            Class<?> cls = childAt.getClass();
                            for (String str2 : map2.keySet()) {
                                androidx.constraintlayout.widget.b bVar3 = map2.get(str2);
                                String strD = !bVar3.f15295a ? s.d("set", str2) : str2;
                                try {
                                    hashSet2 = hashSet3;
                                } catch (IllegalAccessException e4) {
                                    e = e4;
                                    hashSet2 = hashSet3;
                                } catch (NoSuchMethodException e10) {
                                    e = e10;
                                    hashSet2 = hashSet3;
                                } catch (InvocationTargetException e11) {
                                    e = e11;
                                    hashSet2 = hashSet3;
                                }
                                try {
                                    int i13 = b.a.f15303a[bVar3.f15297c.ordinal()];
                                    Class<?> cls2 = Float.TYPE;
                                    Class<?> cls3 = Integer.TYPE;
                                    switch (i13) {
                                        case 1:
                                            i10 = i12;
                                            cls.getMethod(strD, cls3).invoke(childAt, Integer.valueOf(bVar3.f15298d));
                                            break;
                                        case 2:
                                            i10 = i12;
                                            cls.getMethod(strD, Boolean.TYPE).invoke(childAt, Boolean.valueOf(bVar3.f15301g));
                                            break;
                                        case 3:
                                            i10 = i12;
                                            cls.getMethod(strD, CharSequence.class).invoke(childAt, bVar3.f15300f);
                                            break;
                                        case 4:
                                            i10 = i12;
                                            cls.getMethod(strD, cls3).invoke(childAt, Integer.valueOf(bVar3.f15302h));
                                            break;
                                        case 5:
                                            i10 = i12;
                                            Method method = cls.getMethod(strD, Drawable.class);
                                            ColorDrawable colorDrawable = new ColorDrawable();
                                            colorDrawable.setColor(bVar3.f15302h);
                                            method.invoke(childAt, colorDrawable);
                                            break;
                                        case 6:
                                            i10 = i12;
                                            cls.getMethod(strD, cls3).invoke(childAt, Integer.valueOf(bVar3.f15298d));
                                            break;
                                        case 7:
                                            i10 = i12;
                                            cls.getMethod(strD, cls2).invoke(childAt, Float.valueOf(bVar3.f15299e));
                                            break;
                                        case 8:
                                            i10 = i12;
                                            try {
                                                cls.getMethod(strD, cls2).invoke(childAt, Float.valueOf(bVar3.f15299e));
                                            } catch (IllegalAccessException e12) {
                                                e = e12;
                                                StringBuilder sbK = B8.k(" Custom Attribute \"", str2, "\" not found on ");
                                                sbK.append(cls.getName());
                                                Log.e("TransitionLayout", sbK.toString());
                                                e.printStackTrace();
                                                hashSet3 = hashSet2;
                                                i12 = i10;
                                            } catch (NoSuchMethodException e13) {
                                                e = e13;
                                                Log.e("TransitionLayout", e.getMessage());
                                                Log.e("TransitionLayout", " Custom Attribute \"" + str2 + "\" not found on " + cls.getName());
                                                Log.e("TransitionLayout", cls.getName() + " must have a method " + strD);
                                                hashSet3 = hashSet2;
                                                i12 = i10;
                                            } catch (InvocationTargetException e14) {
                                                e = e14;
                                                StringBuilder sbK2 = B8.k(" Custom Attribute \"", str2, "\" not found on ");
                                                sbK2.append(cls.getName());
                                                Log.e("TransitionLayout", sbK2.toString());
                                                e.printStackTrace();
                                                hashSet3 = hashSet2;
                                                i12 = i10;
                                            }
                                        default:
                                            i10 = i12;
                                            break;
                                    }
                                } catch (IllegalAccessException e15) {
                                    e = e15;
                                    i10 = i12;
                                    StringBuilder sbK3 = B8.k(" Custom Attribute \"", str2, "\" not found on ");
                                    sbK3.append(cls.getName());
                                    Log.e("TransitionLayout", sbK3.toString());
                                    e.printStackTrace();
                                    hashSet3 = hashSet2;
                                    i12 = i10;
                                } catch (NoSuchMethodException e16) {
                                    e = e16;
                                    i10 = i12;
                                    Log.e("TransitionLayout", e.getMessage());
                                    Log.e("TransitionLayout", " Custom Attribute \"" + str2 + "\" not found on " + cls.getName());
                                    Log.e("TransitionLayout", cls.getName() + " must have a method " + strD);
                                    hashSet3 = hashSet2;
                                    i12 = i10;
                                } catch (InvocationTargetException e17) {
                                    e = e17;
                                    i10 = i12;
                                    StringBuilder sbK22 = B8.k(" Custom Attribute \"", str2, "\" not found on ");
                                    sbK22.append(cls.getName());
                                    Log.e("TransitionLayout", sbK22.toString());
                                    e.printStackTrace();
                                    hashSet3 = hashSet2;
                                    i12 = i10;
                                }
                                hashSet3 = hashSet2;
                                i12 = i10;
                            }
                            hashSet = hashSet3;
                            i = i12;
                            childAt.setLayoutParams(bVar2);
                            C0234d c0234d = aVar.f15318b;
                            if (c0234d.f15411b == 0) {
                                childAt.setVisibility(c0234d.f15410a);
                            }
                            childAt.setAlpha(c0234d.f15412c);
                            e eVar = aVar.f15321e;
                            childAt.setRotation(eVar.f15415a);
                            childAt.setRotationX(eVar.f15416b);
                            childAt.setRotationY(eVar.f15417c);
                            childAt.setScaleX(eVar.f15418d);
                            childAt.setScaleY(eVar.f15419e);
                            if (eVar.f15422h != -1) {
                                if (((View) childAt.getParent()).findViewById(eVar.f15422h) != null) {
                                    float bottom = (r1.getBottom() + r1.getTop()) / 2.0f;
                                    float right = (r1.getRight() + r1.getLeft()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        childAt.setPivotX(right - childAt.getLeft());
                                        childAt.setPivotY(bottom - childAt.getTop());
                                    }
                                }
                            } else {
                                if (!Float.isNaN(eVar.f15420f)) {
                                    childAt.setPivotX(eVar.f15420f);
                                }
                                if (!Float.isNaN(eVar.f15421g)) {
                                    childAt.setPivotY(eVar.f15421g);
                                }
                            }
                            childAt.setTranslationX(eVar.i);
                            childAt.setTranslationY(eVar.f15423j);
                            childAt.setTranslationZ(eVar.f15424k);
                            if (eVar.f15425l) {
                                childAt.setElevation(eVar.f15426m);
                            }
                        }
                    } else {
                        hashSet = hashSet3;
                        i = i12;
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                }
                i12 = i + 1;
                dVar = this;
                hashSet3 = hashSet;
                i11 = 1;
            }
            hashSet = hashSet3;
            i = i12;
            i12 = i + 1;
            dVar = this;
            hashSet3 = hashSet;
            i11 = 1;
        }
        Iterator it = hashSet3.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            a aVar3 = map.get(num);
            if (aVar3 != null) {
                b bVar4 = aVar3.f15320d;
                if (bVar4.f15376h0 == 1) {
                    Context context = constraintLayout.getContext();
                    androidx.constraintlayout.widget.a aVar4 = new androidx.constraintlayout.widget.a(context);
                    aVar4.f15304b = new int[32];
                    aVar4.f15310h = null;
                    aVar4.i = new HashMap<>();
                    aVar4.f15306d = context;
                    aVar4.g(null);
                    aVar4.setVisibility(8);
                    aVar4.setId(num.intValue());
                    int[] iArr2 = bVar4.f15377i0;
                    if (iArr2 != null) {
                        aVar4.setReferencedIds(iArr2);
                    } else {
                        String str3 = bVar4.f15379j0;
                        if (str3 != null) {
                            int[] iArrC2 = c(aVar4, str3);
                            bVar4.f15377i0 = iArrC2;
                            aVar4.setReferencedIds(iArrC2);
                        }
                    }
                    aVar4.setType(bVar4.f15372f0);
                    aVar4.setMargin(bVar4.f15374g0);
                    u0.e eVar2 = ConstraintLayout.f15196s;
                    ConstraintLayout.b bVar5 = new ConstraintLayout.b();
                    aVar4.i();
                    aVar3.a(bVar5);
                    constraintLayout.addView(aVar4, bVar5);
                }
                if (bVar4.f15361a) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    u0.e eVar3 = ConstraintLayout.f15196s;
                    ConstraintLayout.b bVar6 = new ConstraintLayout.b();
                    aVar3.a(bVar6);
                    constraintLayout.addView(guideline, bVar6);
                }
            }
        }
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt2 = constraintLayout.getChildAt(i14);
            if (childAt2 instanceof androidx.constraintlayout.widget.c) {
                ((androidx.constraintlayout.widget.c) childAt2).e(constraintLayout);
            }
        }
    }

    public final void b(ConstraintLayout constraintLayout) {
        int i;
        int i10;
        d dVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap<Integer, a> map = dVar.f15316c;
        map.clear();
        int i11 = 0;
        while (i11 < childCount) {
            View childAt = constraintLayout.getChildAt(i11);
            ConstraintLayout.b bVar = (ConstraintLayout.b) childAt.getLayoutParams();
            int id = childAt.getId();
            if (dVar.f15315b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!map.containsKey(Integer.valueOf(id))) {
                map.put(Integer.valueOf(id), new a());
            }
            a aVar = map.get(Integer.valueOf(id));
            if (aVar == null) {
                i = childCount;
            } else {
                HashMap<String, androidx.constraintlayout.widget.b> map2 = dVar.f15314a;
                HashMap<String, androidx.constraintlayout.widget.b> map3 = new HashMap<>();
                Class<?> cls = childAt.getClass();
                for (String str : map2.keySet()) {
                    androidx.constraintlayout.widget.b bVar2 = map2.get(str);
                    try {
                        if (str.equals("BackgroundColor")) {
                            map3.put(str, new androidx.constraintlayout.widget.b(bVar2, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                            i10 = childCount;
                        } else {
                            i10 = childCount;
                            try {
                                map3.put(str, new androidx.constraintlayout.widget.b(bVar2, cls.getMethod("getMap" + str, new Class[0]).invoke(childAt, new Object[0])));
                            } catch (IllegalAccessException e4) {
                                e = e4;
                                e.printStackTrace();
                                childCount = i10;
                            } catch (NoSuchMethodException e10) {
                                e = e10;
                                e.printStackTrace();
                                childCount = i10;
                            } catch (InvocationTargetException e11) {
                                e = e11;
                                e.printStackTrace();
                                childCount = i10;
                            }
                        }
                    } catch (IllegalAccessException e12) {
                        e = e12;
                        i10 = childCount;
                    } catch (NoSuchMethodException e13) {
                        e = e13;
                        i10 = childCount;
                    } catch (InvocationTargetException e14) {
                        e = e14;
                        i10 = childCount;
                    }
                    childCount = i10;
                }
                i = childCount;
                aVar.f15322f = map3;
                aVar.b(id, bVar);
                int visibility = childAt.getVisibility();
                C0234d c0234d = aVar.f15318b;
                c0234d.f15410a = visibility;
                c0234d.f15412c = childAt.getAlpha();
                float rotation = childAt.getRotation();
                e eVar = aVar.f15321e;
                eVar.f15415a = rotation;
                eVar.f15416b = childAt.getRotationX();
                eVar.f15417c = childAt.getRotationY();
                eVar.f15418d = childAt.getScaleX();
                eVar.f15419e = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    eVar.f15420f = pivotX;
                    eVar.f15421g = pivotY;
                }
                eVar.i = childAt.getTranslationX();
                eVar.f15423j = childAt.getTranslationY();
                eVar.f15424k = childAt.getTranslationZ();
                if (eVar.f15425l) {
                    eVar.f15426m = childAt.getElevation();
                }
                if (childAt instanceof androidx.constraintlayout.widget.a) {
                    androidx.constraintlayout.widget.a aVar2 = (androidx.constraintlayout.widget.a) childAt;
                    boolean allowsGoneWidget = aVar2.getAllowsGoneWidget();
                    b bVar3 = aVar.f15320d;
                    bVar3.f15387n0 = allowsGoneWidget;
                    bVar3.f15377i0 = aVar2.getReferencedIds();
                    bVar3.f15372f0 = aVar2.getType();
                    bVar3.f15374g0 = aVar2.getMargin();
                }
            }
            i11++;
            dVar = this;
            childCount = i;
        }
    }

    public final void e(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    a aVarD = d(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        aVarD.f15320d.f15361a = true;
                    }
                    this.f15316c.put(Integer.valueOf(aVarD.f15317a), aVarD);
                }
            }
        } catch (IOException e4) {
            e4.printStackTrace();
        } catch (XmlPullParserException e10) {
            e10.printStackTrace();
        }
    }
}
