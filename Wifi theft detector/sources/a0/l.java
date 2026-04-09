package a0;

import android.content.Context;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.appcompat.app.z;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.c;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import z.b;
import z.c;
import z.e;

/* loaded from: classes.dex */
public class l {
    public HashMap A;
    public HashMap B;
    public HashMap C;
    public j[] D;
    public int E;
    public int F;
    public View G;
    public int H;
    public float I;
    public Interpolator J;
    public boolean K;

    /* renamed from: b, reason: collision with root package name */
    public View f42b;

    /* renamed from: c, reason: collision with root package name */
    public int f43c;

    /* renamed from: d, reason: collision with root package name */
    public String f44d;

    /* renamed from: j, reason: collision with root package name */
    public v.b[] f50j;

    /* renamed from: k, reason: collision with root package name */
    public v.b f51k;

    /* renamed from: o, reason: collision with root package name */
    public float f55o;

    /* renamed from: p, reason: collision with root package name */
    public float f56p;

    /* renamed from: q, reason: collision with root package name */
    public int[] f57q;

    /* renamed from: r, reason: collision with root package name */
    public double[] f58r;

    /* renamed from: s, reason: collision with root package name */
    public double[] f59s;

    /* renamed from: t, reason: collision with root package name */
    public String[] f60t;

    /* renamed from: u, reason: collision with root package name */
    public int[] f61u;

    /* renamed from: a, reason: collision with root package name */
    public Rect f41a = new Rect();

    /* renamed from: e, reason: collision with root package name */
    public int f45e = -1;

    /* renamed from: f, reason: collision with root package name */
    public o f46f = new o();

    /* renamed from: g, reason: collision with root package name */
    public o f47g = new o();

    /* renamed from: h, reason: collision with root package name */
    public k f48h = new k();

    /* renamed from: i, reason: collision with root package name */
    public k f49i = new k();

    /* renamed from: l, reason: collision with root package name */
    public float f52l = Float.NaN;

    /* renamed from: m, reason: collision with root package name */
    public float f53m = 0.0f;

    /* renamed from: n, reason: collision with root package name */
    public float f54n = 1.0f;

    /* renamed from: v, reason: collision with root package name */
    public int f62v = 4;

    /* renamed from: w, reason: collision with root package name */
    public float[] f63w = new float[4];

    /* renamed from: x, reason: collision with root package name */
    public ArrayList f64x = new ArrayList();

    /* renamed from: y, reason: collision with root package name */
    public float[] f65y = new float[1];

    /* renamed from: z, reason: collision with root package name */
    public ArrayList f66z = new ArrayList();

    public class a implements Interpolator {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ v.c f67a;

        public a(v.c cVar) {
            this.f67a = cVar;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            return (float) this.f67a.a(f10);
        }
    }

    public l(View view) {
        int i10 = c.f12a;
        this.E = i10;
        this.F = i10;
        this.G = null;
        this.H = i10;
        this.I = Float.NaN;
        this.J = null;
        this.K = false;
        B(view);
    }

    public static Interpolator o(Context context, int i10, String str, int i11) {
        if (i10 == -2) {
            return AnimationUtils.loadInterpolator(context, i11);
        }
        if (i10 == -1) {
            return new a(v.c.c(str));
        }
        if (i10 == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (i10 == 1) {
            return new AccelerateInterpolator();
        }
        if (i10 == 2) {
            return new DecelerateInterpolator();
        }
        if (i10 == 4) {
            return new BounceInterpolator();
        }
        if (i10 != 5) {
            return null;
        }
        return new OvershootInterpolator();
    }

    public void A(z.d dVar, View view, int i10, int i11, int i12) {
        o oVar = this.f46f;
        oVar.f75c = 0.0f;
        oVar.f76d = 0.0f;
        Rect rect = new Rect();
        if (i10 == 1 || i10 == 2) {
            throw null;
        }
        this.f46f.m(rect.left, rect.top, rect.width(), rect.height());
        throw null;
    }

    public void B(View view) {
        this.f42b = view;
        this.f43c = view.getId();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.b) {
            this.f44d = ((ConstraintLayout.b) layoutParams).a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v3 */
    public void C(int i10, int i11, float f10, long j10) {
        String[] strArr;
        int i12;
        ConstraintAttribute constraintAttribute;
        z.e eVarG;
        Integer num;
        z.c cVarF;
        new HashSet();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashMap map = new HashMap();
        int i13 = this.E;
        if (i13 != c.f12a) {
            this.f46f.f83k = i13;
        }
        this.f48h.g(this.f49i, hashSet2);
        ArrayList arrayList = this.f66z;
        Object obj = null;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                z.a(it.next());
                throw null;
            }
        }
        int i14 = 0;
        boolean z10 = true;
        if (!hashSet2.isEmpty()) {
            this.B = new HashMap();
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                String str = (String) it2.next();
                if (str.startsWith("CUSTOM,")) {
                    SparseArray sparseArray = new SparseArray();
                    String str2 = str.split(",")[1];
                    Iterator it3 = this.f66z.iterator();
                    if (it3.hasNext()) {
                        z.a(it3.next());
                        throw null;
                    }
                    cVarF = z.c.e(str, sparseArray);
                } else {
                    cVarF = z.c.f(str);
                }
                if (cVarF != null) {
                    cVarF.c(str);
                    this.B.put(str, cVarF);
                }
            }
            ArrayList arrayList2 = this.f66z;
            if (arrayList2 != null) {
                int size = arrayList2.size();
                int i15 = 0;
                while (i15 < size) {
                    Object obj2 = arrayList2.get(i15);
                    i15++;
                    z.a(obj2);
                }
            }
            this.f48h.a(this.B, 0);
            this.f49i.a(this.B, 100);
            for (String str3 : this.B.keySet()) {
                int iIntValue = (!map.containsKey(str3) || (num = (Integer) map.get(str3)) == null) ? 0 : num.intValue();
                v.j jVar = (v.j) this.B.get(str3);
                if (jVar != null) {
                    jVar.d(iIntValue);
                }
            }
        }
        if (!hashSet.isEmpty()) {
            if (this.A == null) {
                this.A = new HashMap();
            }
            Iterator it4 = hashSet.iterator();
            while (it4.hasNext()) {
                String str4 = (String) it4.next();
                if (!this.A.containsKey(str4)) {
                    if (str4.startsWith("CUSTOM,")) {
                        SparseArray sparseArray2 = new SparseArray();
                        String str5 = str4.split(",")[1];
                        Iterator it5 = this.f66z.iterator();
                        if (it5.hasNext()) {
                            z.a(it5.next());
                            throw null;
                        }
                        eVarG = z.e.f(str4, sparseArray2);
                    } else {
                        eVarG = z.e.g(str4, j10);
                    }
                    if (eVarG != null) {
                        eVarG.c(str4);
                        this.A.put(str4, eVarG);
                    }
                }
            }
            ArrayList arrayList3 = this.f66z;
            if (arrayList3 != null) {
                int size2 = arrayList3.size();
                int i16 = 0;
                while (i16 < size2) {
                    Object obj3 = arrayList3.get(i16);
                    i16++;
                    z.a(obj3);
                }
            }
            for (String str6 : this.A.keySet()) {
                ((z.e) this.A.get(str6)).d(map.containsKey(str6) ? ((Integer) map.get(str6)).intValue() : 0);
            }
        }
        int size3 = this.f64x.size();
        int i17 = size3 + 2;
        o[] oVarArr = new o[i17];
        oVarArr[0] = this.f46f;
        oVarArr[size3 + 1] = this.f47g;
        if (this.f64x.size() > 0 && this.f45e == -1) {
            this.f45e = 0;
        }
        ArrayList arrayList4 = this.f64x;
        int size4 = arrayList4.size();
        int i18 = 0;
        int i19 = 1;
        while (i18 < size4) {
            Object obj4 = arrayList4.get(i18);
            i18++;
            oVarArr[i19] = (o) obj4;
            i19++;
        }
        HashSet hashSet4 = new HashSet();
        for (String str7 : this.f47g.f87o.keySet()) {
            if (this.f46f.f87o.containsKey(str7)) {
                if (!hashSet2.contains("CUSTOM," + str7)) {
                    hashSet4.add(str7);
                }
            }
        }
        String[] strArr2 = (String[]) hashSet4.toArray(new String[0]);
        this.f60t = strArr2;
        this.f61u = new int[strArr2.length];
        int i20 = 0;
        while (true) {
            strArr = this.f60t;
            if (i20 >= strArr.length) {
                break;
            }
            String str8 = strArr[i20];
            this.f61u[i20] = 0;
            int i21 = 0;
            while (true) {
                if (i21 >= i17) {
                    break;
                }
                if (oVarArr[i21].f87o.containsKey(str8) && (constraintAttribute = (ConstraintAttribute) oVarArr[i21].f87o.get(str8)) != null) {
                    int[] iArr = this.f61u;
                    iArr[i20] = iArr[i20] + constraintAttribute.f();
                    break;
                }
                i21++;
            }
            i20++;
        }
        boolean z11 = oVarArr[0].f83k != c.f12a;
        int length = 18 + strArr.length;
        boolean[] zArr = new boolean[length];
        for (int i22 = 1; i22 < i17; i22++) {
            oVarArr[i22].d(oVarArr[i22 - 1], zArr, this.f60t, z11);
        }
        int i23 = 0;
        for (int i24 = 1; i24 < length; i24++) {
            if (zArr[i24]) {
                i23++;
            }
        }
        this.f57q = new int[i23];
        int i25 = 2;
        int iMax = Math.max(2, i23);
        this.f58r = new double[iMax];
        this.f59s = new double[iMax];
        int i26 = 0;
        for (int i27 = 1; i27 < length; i27++) {
            if (zArr[i27]) {
                this.f57q[i26] = i27;
                i26++;
            }
        }
        int[] iArr2 = {i17, this.f57q.length};
        Class cls = Double.TYPE;
        double[][] dArr = (double[][]) Array.newInstance((Class<?>) cls, iArr2);
        double[] dArr2 = new double[i17];
        for (int i28 = 0; i28 < i17; i28++) {
            oVarArr[i28].f(dArr[i28], this.f57q);
            dArr2[i28] = oVarArr[i28].f75c;
        }
        int i29 = 0;
        while (true) {
            int[] iArr3 = this.f57q;
            if (i29 >= iArr3.length) {
                break;
            }
            if (iArr3[i29] < o.f72t.length) {
                String string = o.f72t[this.f57q[i29]] + " [";
                int i30 = 0;
                while (i30 < i17) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(string);
                    int i31 = i29;
                    sb.append(dArr[i30][i31]);
                    string = sb.toString();
                    i30++;
                    z10 = z10;
                    i29 = i31;
                }
            }
            i29++;
            z10 = z10;
        }
        boolean z12 = z10;
        this.f50j = new v.b[this.f60t.length + 1];
        int i32 = 0;
        while (true) {
            String[] strArr3 = this.f60t;
            if (i32 >= strArr3.length) {
                break;
            }
            String str9 = strArr3[i32];
            Object obj5 = obj;
            Object[] objArr = obj5;
            int i33 = i14;
            int i34 = i33;
            double[] dArr3 = obj5;
            while (i33 < i17) {
                dArr3 = dArr3;
                if (oVarArr[i33].l(str9)) {
                    if (objArr == null) {
                        int[] iArr4 = new int[i25];
                        iArr4[z12 ? 1 : 0] = oVarArr[i33].j(str9);
                        iArr4[i14] = i17;
                        objArr = (double[][]) Array.newInstance((Class<?>) cls, iArr4);
                        dArr3 = new double[i17];
                    }
                    o oVar = oVarArr[i33];
                    i12 = i32;
                    dArr3[i34] = oVar.f75c;
                    oVar.i(str9, objArr[i34], 0);
                    i34++;
                } else {
                    i12 = i32;
                }
                i33++;
                i32 = i12;
                i25 = 2;
                i14 = 0;
                dArr3 = dArr3;
            }
            i32++;
            this.f50j[i32] = v.b.a(this.f45e, Arrays.copyOf(dArr3, i34), (double[][]) Arrays.copyOf(objArr, i34));
            i25 = 2;
            obj = null;
            i14 = 0;
        }
        int i35 = 0;
        this.f50j[0] = v.b.a(this.f45e, dArr2, dArr);
        if (oVarArr[0].f83k != c.f12a) {
            int[] iArr5 = new int[i17];
            double[] dArr4 = new double[i17];
            int[] iArr6 = new int[2];
            iArr6[z12 ? 1 : 0] = 2;
            iArr6[0] = i17;
            double[][] dArr5 = (double[][]) Array.newInstance((Class<?>) cls, iArr6);
            for (int i36 = 0; i36 < i17; i36++) {
                iArr5[i36] = oVarArr[i36].f83k;
                dArr4[i36] = r7.f75c;
                double[] dArr6 = dArr5[i36];
                dArr6[0] = r7.f77e;
                dArr6[z12 ? 1 : 0] = r7.f78f;
            }
            i35 = 0;
            this.f51k = v.b.b(iArr5, dArr4, dArr5);
        }
        this.C = new HashMap();
        if (this.f66z != null) {
            Iterator it6 = hashSet3.iterator();
            float fQ = Float.NaN;
            while (it6.hasNext()) {
                String str10 = (String) it6.next();
                z.b bVarE = z.b.e(str10);
                if (bVarE != null) {
                    if (bVarE.d() && Float.isNaN(fQ)) {
                        fQ = q();
                    }
                    bVarE.b(str10);
                    this.C.put(str10, bVarE);
                }
            }
            ArrayList arrayList5 = this.f66z;
            int size5 = arrayList5.size();
            int i37 = i35;
            while (i37 < size5) {
                Object obj6 = arrayList5.get(i37);
                i37++;
                z.a(obj6);
            }
            Iterator it7 = this.C.values().iterator();
            while (it7.hasNext()) {
                ((z.b) it7.next()).c(fQ);
            }
        }
    }

    public void D(l lVar) {
        this.f46f.p(lVar, lVar.f46f);
        this.f47g.p(lVar, lVar.f47g);
    }

    public void a(ArrayList arrayList) {
        this.f66z.addAll(arrayList);
    }

    public int b(float[] fArr, int[] iArr) {
        if (fArr == null) {
            return 0;
        }
        double[] dArrG = this.f50j[0].g();
        if (iArr != null) {
            ArrayList arrayList = this.f64x;
            int size = arrayList.size();
            int i10 = 0;
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                iArr[i10] = ((o) obj).f88p;
                i10++;
            }
        }
        int i12 = 0;
        for (int i13 = 0; i13 < dArrG.length; i13++) {
            this.f50j[0].d(dArrG[i13], this.f58r);
            this.f46f.g(dArrG[i13], this.f57q, this.f58r, fArr, i12);
            i12 += 2;
        }
        return i12 / 2;
    }

    public void c(float[] fArr, int i10) {
        int i11 = i10;
        float f10 = 1.0f;
        float f11 = 1.0f / (i11 - 1);
        HashMap map = this.B;
        v.j jVar = map == null ? null : (v.j) map.get("translationX");
        HashMap map2 = this.B;
        v.j jVar2 = map2 == null ? null : (v.j) map2.get("translationY");
        HashMap map3 = this.C;
        z.b bVar = map3 == null ? null : (z.b) map3.get("translationX");
        HashMap map4 = this.C;
        z.b bVar2 = map4 != null ? (z.b) map4.get("translationY") : null;
        int i12 = 0;
        while (i12 < i11) {
            float fMin = i12 * f11;
            float f12 = this.f54n;
            float f13 = 0.0f;
            if (f12 != f10) {
                float f14 = this.f53m;
                if (fMin < f14) {
                    fMin = 0.0f;
                }
                if (fMin > f14 && fMin < 1.0d) {
                    fMin = Math.min((fMin - f14) * f12, f10);
                }
            }
            double dA = fMin;
            v.c cVar = this.f46f.f73a;
            ArrayList arrayList = this.f64x;
            int size = arrayList.size();
            float f15 = Float.NaN;
            int i13 = 0;
            while (i13 < size) {
                Object obj = arrayList.get(i13);
                i13++;
                o oVar = (o) obj;
                float f16 = f11;
                v.c cVar2 = oVar.f73a;
                if (cVar2 != null) {
                    float f17 = oVar.f75c;
                    if (f17 < fMin) {
                        f13 = f17;
                        cVar = cVar2;
                    } else if (Float.isNaN(f15)) {
                        f15 = oVar.f75c;
                    }
                }
                f11 = f16;
            }
            float f18 = f11;
            if (cVar != null) {
                if (Float.isNaN(f15)) {
                    f15 = 1.0f;
                }
                dA = (((float) cVar.a((fMin - f13) / r17)) * (f15 - f13)) + f13;
            }
            this.f50j[0].d(dA, this.f58r);
            v.b bVar3 = this.f51k;
            if (bVar3 != null) {
                double[] dArr = this.f58r;
                if (dArr.length > 0) {
                    bVar3.d(dA, dArr);
                }
            }
            int i14 = i12 * 2;
            this.f46f.g(dA, this.f57q, this.f58r, fArr, i14);
            if (bVar != null) {
                fArr[i14] = fArr[i14] + bVar.a(fMin);
            } else if (jVar != null) {
                fArr[i14] = fArr[i14] + jVar.a(fMin);
            }
            if (bVar2 != null) {
                int i15 = i14 + 1;
                fArr[i15] = fArr[i15] + bVar2.a(fMin);
            } else if (jVar2 != null) {
                int i16 = i14 + 1;
                fArr[i16] = fArr[i16] + jVar2.a(fMin);
            }
            i12++;
            i11 = i10;
            f11 = f18;
            f10 = 1.0f;
        }
    }

    public void d(float f10, float[] fArr, int i10) {
        this.f50j[0].d(f(f10, null), this.f58r);
        this.f46f.k(this.f57q, this.f58r, fArr, i10);
    }

    public void e(boolean z10) {
        j[] jVarArr;
        if (!"button".equals(a0.a.d(this.f42b)) || (jVarArr = this.D) == null || jVarArr.length <= 0) {
            return;
        }
        j jVar = jVarArr[0];
        throw null;
    }

    public final float f(float f10, float[] fArr) {
        float f11 = 0.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f12 = this.f54n;
            if (f12 != 1.0d) {
                float f13 = this.f53m;
                if (f10 < f13) {
                    f10 = 0.0f;
                }
                if (f10 > f13 && f10 < 1.0d) {
                    f10 = Math.min((f10 - f13) * f12, 1.0f);
                }
            }
        }
        v.c cVar = this.f46f.f73a;
        ArrayList arrayList = this.f64x;
        int size = arrayList.size();
        float f14 = Float.NaN;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            o oVar = (o) obj;
            v.c cVar2 = oVar.f73a;
            if (cVar2 != null) {
                float f15 = oVar.f75c;
                if (f15 < f10) {
                    cVar = cVar2;
                    f11 = f15;
                } else if (Float.isNaN(f14)) {
                    f14 = oVar.f75c;
                }
            }
        }
        if (cVar != null) {
            float f16 = (Float.isNaN(f14) ? 1.0f : f14) - f11;
            double d10 = (f10 - f11) / f16;
            f10 = (((float) cVar.a(d10)) * f16) + f11;
            if (fArr != null) {
                fArr[0] = (float) cVar.b(d10);
            }
        }
        return f10;
    }

    public int g() {
        return this.f46f.f84l;
    }

    public void h(double d10, float[] fArr, float[] fArr2) {
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.f50j[0].d(d10, dArr);
        this.f50j[0].f(d10, dArr2);
        Arrays.fill(fArr2, 0.0f);
        this.f46f.h(d10, this.f57q, dArr, fArr, dArr2, fArr2);
    }

    public float i() {
        return this.f55o;
    }

    public float j() {
        return this.f56p;
    }

    public void k(float f10, float f11, float f12, float[] fArr) {
        double[] dArr;
        float f13 = f(f10, this.f65y);
        v.b[] bVarArr = this.f50j;
        int i10 = 0;
        if (bVarArr == null) {
            o oVar = this.f47g;
            float f14 = oVar.f77e;
            o oVar2 = this.f46f;
            float f15 = f14 - oVar2.f77e;
            float f16 = oVar.f78f - oVar2.f78f;
            float f17 = (oVar.f79g - oVar2.f79g) + f15;
            float f18 = (oVar.f80h - oVar2.f80h) + f16;
            fArr[0] = (f15 * (1.0f - f11)) + (f17 * f11);
            fArr[1] = (f16 * (1.0f - f12)) + (f18 * f12);
            return;
        }
        double d10 = f13;
        bVarArr[0].f(d10, this.f59s);
        this.f50j[0].d(d10, this.f58r);
        float f19 = this.f65y[0];
        while (true) {
            dArr = this.f59s;
            if (i10 >= dArr.length) {
                break;
            }
            dArr[i10] = dArr[i10] * f19;
            i10++;
        }
        v.b bVar = this.f51k;
        if (bVar == null) {
            this.f46f.n(f11, f12, fArr, this.f57q, dArr, this.f58r);
            return;
        }
        double[] dArr2 = this.f58r;
        if (dArr2.length > 0) {
            bVar.d(d10, dArr2);
            this.f51k.f(d10, this.f59s);
            this.f46f.n(f11, f12, fArr, this.f57q, this.f59s, this.f58r);
        }
    }

    public int l() {
        int iMax = this.f46f.f74b;
        ArrayList arrayList = this.f64x;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            iMax = Math.max(iMax, ((o) obj).f74b);
        }
        return Math.max(iMax, this.f47g.f74b);
    }

    public float m() {
        return this.f47g.f77e;
    }

    public float n() {
        return this.f47g.f78f;
    }

    public o p(int i10) {
        return (o) this.f64x.get(i10);
    }

    public final float q() {
        float[] fArr = new float[2];
        float f10 = 1.0f / 99;
        double d10 = 0.0d;
        double d11 = 0.0d;
        int i10 = 0;
        float fHypot = 0.0f;
        while (i10 < 100) {
            float f11 = i10 * f10;
            double dA = f11;
            v.c cVar = this.f46f.f73a;
            ArrayList arrayList = this.f64x;
            int size = arrayList.size();
            float f12 = Float.NaN;
            int i11 = 0;
            float f13 = 0.0f;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                float f14 = f10;
                o oVar = (o) obj;
                int i12 = i10;
                v.c cVar2 = oVar.f73a;
                if (cVar2 != null) {
                    float f15 = oVar.f75c;
                    if (f15 < f11) {
                        f13 = f15;
                        cVar = cVar2;
                    } else if (Float.isNaN(f12)) {
                        f12 = oVar.f75c;
                    }
                }
                i10 = i12;
                f10 = f14;
            }
            float f16 = f10;
            int i13 = i10;
            if (cVar != null) {
                if (Float.isNaN(f12)) {
                    f12 = 1.0f;
                }
                dA = (((float) cVar.a((f11 - f13) / r16)) * (f12 - f13)) + f13;
            }
            this.f50j[0].d(dA, this.f58r);
            float f17 = fHypot;
            this.f46f.g(dA, this.f57q, this.f58r, fArr, 0);
            fHypot = i13 > 0 ? (float) (f17 + Math.hypot(d11 - fArr[1], d10 - fArr[0])) : f17;
            d10 = fArr[0];
            d11 = fArr[1];
            i10 = i13 + 1;
            f10 = f16;
        }
        return fHypot;
    }

    public View r() {
        return this.f42b;
    }

    public boolean s(View view, float f10, long j10, v.d dVar) {
        e.d dVar2;
        boolean zI;
        View view2;
        int i10;
        View view3;
        Throwable th;
        float f11;
        double d10;
        View view4 = view;
        float f12 = f(f10, null);
        int i11 = this.H;
        if (i11 != c.f12a) {
            float f13 = 1.0f / i11;
            float fFloor = ((float) Math.floor(f12 / f13)) * f13;
            float f14 = (f12 % f13) / f13;
            if (!Float.isNaN(this.I)) {
                f14 = (f14 + this.I) % 1.0f;
            }
            Interpolator interpolator = this.J;
            f12 = ((interpolator != null ? interpolator.getInterpolation(f14) : ((double) f14) > 0.5d ? 1.0f : 0.0f) * f13) + fFloor;
        }
        float f15 = f12;
        HashMap map = this.B;
        if (map != null) {
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                ((z.c) it.next()).g(view4, f15);
            }
        }
        HashMap map2 = this.A;
        if (map2 != null) {
            dVar2 = null;
            boolean zH = false;
            for (z.e eVar : map2.values()) {
                if (eVar instanceof e.d) {
                    dVar2 = (e.d) eVar;
                } else {
                    zH |= eVar.h(view4, f15, j10, dVar);
                    view4 = view;
                }
            }
            zI = zH;
        } else {
            dVar2 = null;
            zI = false;
        }
        v.b[] bVarArr = this.f50j;
        if (bVarArr != null) {
            double d11 = f15;
            bVarArr[0].d(d11, this.f58r);
            this.f50j[0].f(d11, this.f59s);
            v.b bVar = this.f51k;
            if (bVar != null) {
                double[] dArr = this.f58r;
                if (dArr.length > 0) {
                    bVar.d(d11, dArr);
                    this.f51k.f(d11, this.f59s);
                }
            }
            if (this.K) {
                view3 = view;
                th = null;
                f11 = 0.0f;
                d10 = d11;
            } else {
                th = null;
                d10 = d11;
                f11 = 0.0f;
                this.f46f.o(f15, view, this.f57q, this.f58r, this.f59s, null);
                f15 = f15;
                view3 = view;
            }
            if (this.F != c.f12a) {
                if (this.G == null) {
                    this.G = ((View) view3.getParent()).findViewById(this.F);
                }
                if (this.G != null) {
                    float top = (r1.getTop() + this.G.getBottom()) / 2.0f;
                    float left = (this.G.getLeft() + this.G.getRight()) / 2.0f;
                    if (view3.getRight() - view3.getLeft() > 0 && view3.getBottom() - view3.getTop() > 0) {
                        view3.setPivotX(left - view3.getLeft());
                        view3.setPivotY(top - view3.getTop());
                    }
                }
            }
            HashMap map3 = this.B;
            if (map3 != null) {
                for (v.j jVar : map3.values()) {
                    if (jVar instanceof c.d) {
                        double[] dArr2 = this.f59s;
                        if (dArr2.length > 1) {
                            ((c.d) jVar).h(view3, f15, dArr2[0], dArr2[1]);
                        }
                    }
                    view3 = view;
                }
            }
            if (dVar2 != null) {
                double[] dArr3 = this.f59s;
                view2 = view;
                i10 = 1;
                float f16 = f15;
                f15 = f16;
                zI |= dVar2.i(view2, dVar, f16, j10, dArr3[0], dArr3[1]);
            } else {
                view2 = view;
                i10 = 1;
            }
            int i12 = i10;
            while (true) {
                v.b[] bVarArr2 = this.f50j;
                if (i12 >= bVarArr2.length) {
                    break;
                }
                bVarArr2[i12].e(d10, this.f63w);
                ((ConstraintAttribute) this.f46f.f87o.get(this.f60t[i12 - 1])).i(view2, this.f63w);
                i12++;
            }
            k kVar = this.f48h;
            if (kVar.f16b == 0) {
                if (f15 <= f11) {
                    view2.setVisibility(kVar.f17c);
                } else if (f15 >= 1.0f) {
                    view2.setVisibility(this.f49i.f17c);
                } else if (this.f49i.f17c != kVar.f17c) {
                    view2.setVisibility(0);
                }
            }
            j[] jVarArr = this.D;
            if (jVarArr != null && jVarArr.length > 0) {
                j jVar2 = jVarArr[0];
                throw th;
            }
        } else {
            view2 = view;
            i10 = 1;
            o oVar = this.f46f;
            float f17 = oVar.f77e;
            o oVar2 = this.f47g;
            float f18 = f17 + ((oVar2.f77e - f17) * f15);
            float f19 = oVar.f78f;
            float f20 = f19 + ((oVar2.f78f - f19) * f15);
            float f21 = oVar.f79g;
            float f22 = oVar2.f79g;
            float f23 = oVar.f80h;
            float f24 = oVar2.f80h;
            float f25 = f18 + 0.5f;
            int i13 = (int) f25;
            float f26 = f20 + 0.5f;
            int i14 = (int) f26;
            int i15 = (int) (f25 + ((f22 - f21) * f15) + f21);
            int i16 = (int) (f26 + ((f24 - f23) * f15) + f23);
            int i17 = i15 - i13;
            int i18 = i16 - i14;
            if (f22 != f21 || f24 != f23) {
                view2.measure(View.MeasureSpec.makeMeasureSpec(i17, 1073741824), View.MeasureSpec.makeMeasureSpec(i18, 1073741824));
            }
            view2.layout(i13, i14, i15, i16);
        }
        HashMap map4 = this.C;
        if (map4 != null) {
            for (z.b bVar2 : map4.values()) {
                if (bVar2 instanceof b.d) {
                    double[] dArr4 = this.f59s;
                    ((b.d) bVar2).g(view2, f15, dArr4[0], dArr4[i10]);
                } else {
                    bVar2.f(view2, f15);
                }
            }
        }
        return zI;
    }

    public final void t(o oVar) {
        oVar.m((int) this.f42b.getX(), (int) this.f42b.getY(), this.f42b.getWidth(), this.f42b.getHeight());
    }

    public String toString() {
        return " start: x: " + this.f46f.f77e + " y: " + this.f46f.f78f + " end: x: " + this.f47g.f77e + " y: " + this.f47g.f78f;
    }

    public void u(Rect rect, Rect rect2, int i10, int i11, int i12) {
        if (i10 == 1) {
            int i13 = rect.left + rect.right;
            rect2.left = ((rect.top + rect.bottom) - rect.width()) / 2;
            rect2.top = i12 - ((i13 + rect.height()) / 2);
            rect2.right = rect2.left + rect.width();
            rect2.bottom = rect2.top + rect.height();
            return;
        }
        if (i10 == 2) {
            int i14 = rect.left + rect.right;
            rect2.left = i11 - (((rect.top + rect.bottom) + rect.width()) / 2);
            rect2.top = (i14 - rect.height()) / 2;
            rect2.right = rect2.left + rect.width();
            rect2.bottom = rect2.top + rect.height();
            return;
        }
        if (i10 == 3) {
            int i15 = rect.left + rect.right;
            rect2.left = ((rect.height() / 2) + rect.top) - (i15 / 2);
            rect2.top = i12 - ((i15 + rect.height()) / 2);
            rect2.right = rect2.left + rect.width();
            rect2.bottom = rect2.top + rect.height();
            return;
        }
        if (i10 != 4) {
            return;
        }
        int i16 = rect.left + rect.right;
        rect2.left = i11 - (((rect.bottom + rect.top) + rect.width()) / 2);
        rect2.top = (i16 - rect.height()) / 2;
        rect2.right = rect2.left + rect.width();
        rect2.bottom = rect2.top + rect.height();
    }

    public void v(View view) {
        o oVar = this.f46f;
        oVar.f75c = 0.0f;
        oVar.f76d = 0.0f;
        this.K = true;
        oVar.m(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        this.f47g.m(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        this.f48h.j(view);
        this.f49i.j(view);
    }

    public void w(Rect rect, androidx.constraintlayout.widget.c cVar, int i10, int i11) {
        l lVar;
        int i12 = cVar.f2194d;
        if (i12 != 0) {
            lVar = this;
            lVar.u(rect, this.f41a, i12, i10, i11);
            rect = lVar.f41a;
        } else {
            lVar = this;
        }
        o oVar = lVar.f47g;
        oVar.f75c = 1.0f;
        oVar.f76d = 1.0f;
        t(oVar);
        lVar.f47g.m(rect.left, rect.top, rect.width(), rect.height());
        lVar.f47g.a(cVar.y(lVar.f43c));
        lVar.f49i.i(rect, cVar, i12, lVar.f43c);
    }

    public void x(int i10) {
        this.E = i10;
    }

    public void y(View view) {
        o oVar = this.f46f;
        oVar.f75c = 0.0f;
        oVar.f76d = 0.0f;
        oVar.m(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        this.f48h.j(view);
    }

    public void z(Rect rect, androidx.constraintlayout.widget.c cVar, int i10, int i11) {
        l lVar;
        Rect rect2;
        int i12 = cVar.f2194d;
        if (i12 != 0) {
            lVar = this;
            rect2 = rect;
            lVar.u(rect2, this.f41a, i12, i10, i11);
        } else {
            lVar = this;
            rect2 = rect;
        }
        o oVar = lVar.f46f;
        oVar.f75c = 0.0f;
        oVar.f76d = 0.0f;
        t(oVar);
        lVar.f46f.m(rect2.left, rect2.top, rect2.width(), rect2.height());
        c.a aVarY = cVar.y(lVar.f43c);
        lVar.f46f.a(aVarY);
        lVar.f52l = aVarY.f2201d.f2268g;
        lVar.f48h.i(rect2, cVar, i12, lVar.f43c);
        lVar.F = aVarY.f2203f.f2290i;
        c.C0014c c0014c = aVarY.f2201d;
        lVar.H = c0014c.f2272k;
        lVar.I = c0014c.f2271j;
        Context context = lVar.f42b.getContext();
        c.C0014c c0014c2 = aVarY.f2201d;
        lVar.J = o(context, c0014c2.f2274m, c0014c2.f2273l, c0014c2.f2275n);
    }
}
