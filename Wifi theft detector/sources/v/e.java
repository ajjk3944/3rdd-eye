package v;

import androidx.appcompat.app.z;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public v.b f24584a;

    /* renamed from: b, reason: collision with root package name */
    public b f24585b;

    /* renamed from: c, reason: collision with root package name */
    public String f24586c;

    /* renamed from: d, reason: collision with root package name */
    public int f24587d = 0;

    /* renamed from: e, reason: collision with root package name */
    public String f24588e = null;

    /* renamed from: f, reason: collision with root package name */
    public int f24589f = 0;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f24590g = new ArrayList();

    public class a implements Comparator {
        public a() {
        }

        public int a(c cVar, c cVar2) {
            throw null;
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
            z.a(obj);
            z.a(obj2);
            return a(null, null);
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f24592a;

        /* renamed from: b, reason: collision with root package name */
        public h f24593b;

        /* renamed from: c, reason: collision with root package name */
        public final int f24594c;

        /* renamed from: d, reason: collision with root package name */
        public final int f24595d;

        /* renamed from: e, reason: collision with root package name */
        public final int f24596e;

        /* renamed from: f, reason: collision with root package name */
        public float[] f24597f;

        /* renamed from: g, reason: collision with root package name */
        public double[] f24598g;

        /* renamed from: h, reason: collision with root package name */
        public float[] f24599h;

        /* renamed from: i, reason: collision with root package name */
        public float[] f24600i;

        /* renamed from: j, reason: collision with root package name */
        public float[] f24601j;

        /* renamed from: k, reason: collision with root package name */
        public float[] f24602k;

        /* renamed from: l, reason: collision with root package name */
        public int f24603l;

        /* renamed from: m, reason: collision with root package name */
        public v.b f24604m;

        /* renamed from: n, reason: collision with root package name */
        public double[] f24605n;

        /* renamed from: o, reason: collision with root package name */
        public double[] f24606o;

        /* renamed from: p, reason: collision with root package name */
        public float f24607p;

        public b(int i10, String str, int i11, int i12) {
            h hVar = new h();
            this.f24593b = hVar;
            this.f24594c = 0;
            this.f24595d = 1;
            this.f24596e = 2;
            this.f24603l = i10;
            this.f24592a = i11;
            hVar.e(i10, str);
            this.f24597f = new float[i12];
            this.f24598g = new double[i12];
            this.f24599h = new float[i12];
            this.f24600i = new float[i12];
            this.f24601j = new float[i12];
            this.f24602k = new float[i12];
        }

        public double a(float f10) {
            v.b bVar = this.f24604m;
            if (bVar != null) {
                bVar.d(f10, this.f24605n);
            } else {
                double[] dArr = this.f24605n;
                dArr[0] = this.f24600i[0];
                dArr[1] = this.f24601j[0];
                dArr[2] = this.f24597f[0];
            }
            double[] dArr2 = this.f24605n;
            return dArr2[0] + (this.f24593b.c(f10, dArr2[1]) * this.f24605n[2]);
        }

        public void b(float f10) {
            this.f24607p = f10;
            double[][] dArr = (double[][]) Array.newInstance((Class<?>) Double.TYPE, this.f24598g.length, 3);
            float[] fArr = this.f24597f;
            this.f24605n = new double[fArr.length + 2];
            this.f24606o = new double[fArr.length + 2];
            if (this.f24598g[0] > 0.0d) {
                this.f24593b.a(0.0d, this.f24599h[0]);
            }
            double[] dArr2 = this.f24598g;
            int length = dArr2.length - 1;
            if (dArr2[length] < 1.0d) {
                this.f24593b.a(1.0d, this.f24599h[length]);
            }
            for (int i10 = 0; i10 < dArr.length; i10++) {
                double[] dArr3 = dArr[i10];
                dArr3[0] = this.f24600i[i10];
                dArr3[1] = this.f24601j[i10];
                dArr3[2] = this.f24597f[i10];
                this.f24593b.a(this.f24598g[i10], this.f24599h[i10]);
            }
            this.f24593b.d();
            double[] dArr4 = this.f24598g;
            if (dArr4.length > 1) {
                this.f24604m = v.b.a(0, dArr4, dArr);
            } else {
                this.f24604m = null;
            }
        }
    }

    public static class c {
    }

    public float a(float f10) {
        return (float) this.f24585b.a(f10);
    }

    public void b(String str) {
        this.f24586c = str;
    }

    public void c(float f10) {
        int size = this.f24590g.size();
        if (size == 0) {
            return;
        }
        Collections.sort(this.f24590g, new a());
        double[] dArr = new double[size];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, 3);
        this.f24585b = new b(this.f24587d, this.f24588e, this.f24589f, size);
        Iterator it = this.f24590g.iterator();
        if (it.hasNext()) {
            z.a(it.next());
            throw null;
        }
        this.f24585b.b(f10);
        this.f24584a = v.b.a(0, dArr, dArr2);
    }

    public boolean d() {
        return this.f24589f == 1;
    }

    public String toString() {
        String str = this.f24586c;
        new DecimalFormat("##.##");
        Iterator it = this.f24590g.iterator();
        if (!it.hasNext()) {
            return str;
        }
        z.a(it.next());
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("[");
        throw null;
    }
}
