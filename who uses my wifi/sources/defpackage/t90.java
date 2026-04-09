package defpackage;

import android.graphics.DashPathEffect;
import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.github.mikephil.charting.charts.LineChart;
import com.phuongpn.whousemywifi.networkscanner.MainActivity;
import com.phuongpn.whousemywifi.networkscanner.R;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class t90 {
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public final Object f;
    public final Object g;

    public t90() {
        this.a = 3;
        this.g = new bk4[5];
        this.f = new ArrayList();
        this.b = -1;
    }

    public static String i(double d) {
        if (d <= 0.0d) {
            return "0.0 Bps";
        }
        int iLog10 = (int) (Math.log10(d) / Math.log10(1000.0d));
        return new DecimalFormat("#,##0.#").format(d / Math.pow(1000.0d, iLog10)) + " " + new String[]{"Bps", "KBps", "MBps", "GBps", "TBps"}[iLog10];
    }

    public void a(double d, double d2) {
        MainActivity mainActivity = (MainActivity) this.f;
        String str = mainActivity.getString(R.string.txt_down) + ": " + i(d);
        String str2 = mainActivity.getString(R.string.txt_up) + ": " + i(d2);
        f2 f2Var = (f2) this.g;
        j60 j60Var = (j60) ((LineChart) f2Var.h).getData();
        if (j60Var != null) {
            ArrayList arrayList = j60Var.i;
            l60 l60VarD = (l60) j60Var.d(0);
            if (l60VarD == null) {
                l60VarD = d(1);
                j60Var.a(l60VarD);
            }
            l60 l60VarD2 = (l60) j60Var.d(1);
            if (l60VarD2 == null) {
                l60VarD2 = d(2);
                j60Var.a(l60VarD2);
            }
            double d3 = 8000;
            double d4 = d < d3 ? 0.0d : d;
            double d5 = d2 < d3 ? 0.0d : d2;
            j60Var.b(new xs(l60VarD.o.size(), (float) d4), 0);
            j60Var.b(new xs(l60VarD2.o.size(), (float) d5), 1);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((l60) ((q10) obj)).j = false;
            }
            LineChart lineChart = (LineChart) f2Var.h;
            ((l60) arrayList.get(0)).c = str;
            ((l60) arrayList.get(1)).c = str2;
            lineChart.d();
            lineChart.setVisibleXRangeMaximum(10.0f);
            float fE = j60Var.e();
            u61 u61Var = lineChart.w;
            uk1 uk1Var = lineChart.e0;
            bf0 bf0Var = (bf0) bf0.l.b();
            bf0Var.h = u61Var;
            bf0Var.i = fE;
            bf0Var.j = uk1Var;
            bf0Var.k = lineChart;
            if (u61Var.d <= 0.0f || u61Var.c <= 0.0f) {
                lineChart.F.add(bf0Var);
            } else {
                lineChart.post(bf0Var);
            }
            lineChart.invalidate();
        }
    }

    public void b() {
        View view = (View) ((ArrayList) this.f).get(r0.size() - 1);
        rx0 rx0Var = (rx0) view.getLayoutParams();
        this.c = ((StaggeredGridLayoutManager) this.g).r.b(view);
        rx0Var.getClass();
    }

    public void c() {
        ((ArrayList) this.f).clear();
        this.b = Integer.MIN_VALUE;
        this.c = Integer.MIN_VALUE;
        this.d = 0;
    }

    public l60 d(int i) {
        l60 l60Var = new l60();
        l60Var.B = 4;
        l60Var.G = 0.05f;
        l60Var.A = true;
        l60Var.J = false;
        l60Var.z = k41.c(1.0f);
        l60Var.y = 100;
        l60Var.v = false;
        if (i == 1) {
            l60Var.e(this.b);
            l60Var.x = this.c;
            return l60Var;
        }
        l60Var.H = new DashPathEffect(new float[]{10.0f, 5.0f}, 0.0f);
        l60Var.e(this.d);
        l60Var.x = this.e;
        return l60Var;
    }

    public int e() {
        return ((StaggeredGridLayoutManager) this.g).w ? g(r0.size() - 1, -1) : g(0, ((ArrayList) this.f).size());
    }

    public int f() {
        return ((StaggeredGridLayoutManager) this.g).w ? g(0, ((ArrayList) this.f).size()) : g(r0.size() - 1, -1);
    }

    public int g(int i, int i2) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.g;
        int iK = staggeredGridLayoutManager.r.k();
        int iG = staggeredGridLayoutManager.r.g();
        int i3 = i2 > i ? 1 : -1;
        while (i != i2) {
            View view = (View) ((ArrayList) this.f).get(i);
            int iE = staggeredGridLayoutManager.r.e(view);
            int iB = staggeredGridLayoutManager.r.b(view);
            boolean z = iE <= iG;
            boolean z2 = iB >= iK;
            if (z && z2 && (iE < iK || iB > iG)) {
                return ho0.H(view);
            }
            i += i3;
        }
        return -1;
    }

    public Object h(Object obj) {
        i30.m(obj, "key");
        synchronized (((pz) this.g)) {
            f23 f23Var = (f23) this.f;
            f23Var.getClass();
            Object obj2 = ((LinkedHashMap) f23Var.g).get(obj);
            if (obj2 != null) {
                this.d++;
                return obj2;
            }
            this.e++;
            return null;
        }
    }

    public int j(int i) {
        int i2 = this.c;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (((ArrayList) this.f).size() == 0) {
            return i;
        }
        b();
        return this.c;
    }

    public View k(int i, int i2) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.g;
        ArrayList arrayList = (ArrayList) this.f;
        View view = null;
        if (i2 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                View view2 = (View) arrayList.get(size);
                if ((staggeredGridLayoutManager.w && ho0.H(view2) >= i) || ((!staggeredGridLayoutManager.w && ho0.H(view2) <= i) || !view2.hasFocusable())) {
                    break;
                }
                size--;
                view = view2;
            }
            return view;
        }
        int size2 = arrayList.size();
        int i3 = 0;
        while (i3 < size2) {
            View view3 = (View) arrayList.get(i3);
            if ((staggeredGridLayoutManager.w && ho0.H(view3) <= i) || ((!staggeredGridLayoutManager.w && ho0.H(view3) >= i) || !view3.hasFocusable())) {
                break;
            }
            i3++;
            view = view3;
        }
        return view;
    }

    public int l(int i) {
        ArrayList arrayList = (ArrayList) this.f;
        int i2 = this.b;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (arrayList.size() == 0) {
            return i;
        }
        View view = (View) arrayList.get(0);
        rx0 rx0Var = (rx0) view.getLayoutParams();
        this.b = ((StaggeredGridLayoutManager) this.g).r.e(view);
        rx0Var.getClass();
        return this.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c9, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d1, code lost:
    
        throw new java.lang.IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object m(java.lang.Object r6, java.lang.Object r7) {
        /*
            Method dump skipped, instructions count: 214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t90.m(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public void n(int i, float f) {
        bk4 bk4Var;
        bk4[] bk4VarArr = (bk4[]) this.g;
        ArrayList arrayList = (ArrayList) this.f;
        if (this.b != 1) {
            Collections.sort(arrayList, bk.v);
            this.b = 1;
        }
        int i2 = this.e;
        if (i2 > 0) {
            int i3 = i2 - 1;
            this.e = i3;
            bk4Var = bk4VarArr[i3];
        } else {
            bk4Var = new bk4();
        }
        int i4 = this.c;
        this.c = i4 + 1;
        bk4Var.a = i4;
        bk4Var.b = i;
        bk4Var.c = f;
        arrayList.add(bk4Var);
        this.d += i;
        while (true) {
            int i5 = this.d;
            if (i5 <= 2000) {
                return;
            }
            int i6 = i5 - 2000;
            bk4 bk4Var2 = (bk4) arrayList.get(0);
            int i7 = bk4Var2.b;
            if (i7 <= i6) {
                this.d -= i7;
                arrayList.remove(0);
                int i8 = this.e;
                if (i8 < 5) {
                    this.e = i8 + 1;
                    bk4VarArr[i8] = bk4Var2;
                }
            } else {
                bk4Var2.b = i7 - i6;
                this.d -= i6;
            }
        }
    }

    public float o() {
        ArrayList arrayList = (ArrayList) this.f;
        if (this.b != 0) {
            Collections.sort(arrayList, bk.u);
            this.b = 0;
        }
        float f = this.d;
        int i = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            float f2 = 0.5f * f;
            bk4 bk4Var = (bk4) arrayList.get(i2);
            i += bk4Var.b;
            if (i >= f2) {
                return bk4Var.c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((bk4) arrayList.get(arrayList.size() - 1)).c;
    }

    public String toString() {
        String str;
        switch (this.a) {
            case 0:
                synchronized (((pz) this.g)) {
                    try {
                        int i = this.d;
                        int i2 = this.e + i;
                        str = "LruCache[maxSize=" + this.b + ",hits=" + this.d + ",misses=" + this.e + ",hitRate=" + (i2 != 0 ? (i * 100) / i2 : 0) + "%]";
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str;
            default:
                return super.toString();
        }
    }

    public t90(MainActivity mainActivity, f2 f2Var) {
        this.a = 1;
        i30.m(f2Var, "binding");
        this.f = mainActivity;
        this.g = f2Var;
        int iH = i41.h(mainActivity, R.attr.colorOnSurfaceVariant, -16777216);
        this.b = mainActivity.getColor(R.color.colorDownload);
        this.c = mainActivity.getColor(R.color.colorDownloadBg);
        this.d = mainActivity.getColor(R.color.colorUpload);
        this.e = mainActivity.getColor(R.color.colorUploadBg);
        LineChart lineChart = (LineChart) f2Var.h;
        lineChart.setTouchEnabled(false);
        lineChart.getXAxis().a = false;
        lineChart.getAxisLeft().a = false;
        lineChart.getAxisRight().a = false;
        lineChart.setLogEnabled(false);
        lineChart.setDescription(null);
        lineChart.setDragEnabled(false);
        lineChart.setScaleEnabled(false);
        lineChart.setDrawBorders(false);
        lineChart.setPinchZoom(false);
        lineChart.setDrawGridBackground(false);
        lineChart.setAutoScaleMinMaxEnabled(true);
        lineChart.getAxisLeft().B = 0.0f;
        lineChart.getAxisLeft().A = 0.0f;
        lineChart.getAxisLeft().d();
        lineChart.getAxisRight().d();
        lineChart.getAxisRight().A = 0.0f;
        lineChart.getAxisRight().B = 0.0f;
        j60 j60Var = new j60();
        j60Var.a(d(1));
        j60Var.a(d(2));
        lineChart.setData(j60Var);
        k50 legend = lineChart.getLegend();
        legend.k = 6;
        legend.d = k41.c(12.0f);
        legend.e = iH;
        legend.h = 3;
        legend.g = 2;
        for (int i = 1; i < 12; i++) {
            a(0.0d, 0.0d);
        }
    }

    public t90(int i) {
        this.a = 0;
        this.b = i;
        if (i > 0) {
            this.f = new f23();
            this.g = new pz(24);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public t90(StaggeredGridLayoutManager staggeredGridLayoutManager, int i) {
        this.a = 2;
        this.g = staggeredGridLayoutManager;
        this.f = new ArrayList();
        this.b = Integer.MIN_VALUE;
        this.c = Integer.MIN_VALUE;
        this.d = 0;
        this.e = i;
    }
}
