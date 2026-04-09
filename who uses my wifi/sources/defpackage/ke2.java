package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ke2 {
    public static final boolean r;
    public final Context a;
    public final String b;
    public final e51 c;
    public final rz1 d;
    public final tz1 e;
    public final pj4 f;
    public final long[] g;
    public final String[] h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public ae2 n;
    public boolean o;
    public boolean p;
    public long q;

    static {
        r = sv1.f.e.nextInt(100) < ((Integer) tw1.e.c.a(mz1.xd)).intValue();
    }

    public ke2(Context context, e51 e51Var, String str, tz1 tz1Var, rz1 rz1Var) {
        t83 t83Var = new t83(15);
        t83Var.T("min_1", Double.MIN_VALUE, 1.0d);
        t83Var.T("1_5", 1.0d, 5.0d);
        t83Var.T("5_10", 5.0d, 10.0d);
        t83Var.T("10_20", 10.0d, 20.0d);
        t83Var.T("20_30", 20.0d, 30.0d);
        t83Var.T("30_max", 30.0d, Double.MAX_VALUE);
        this.f = new pj4(t83Var);
        this.i = false;
        this.j = false;
        this.k = false;
        this.l = false;
        this.q = -1L;
        this.a = context;
        this.c = e51Var;
        this.b = str;
        this.e = tz1Var;
        this.d = rz1Var;
        String str2 = (String) tw1.e.c.a(mz1.M);
        if (str2 == null) {
            this.h = new String[0];
            this.g = new long[0];
            return;
        }
        String[] strArrSplit = TextUtils.split(str2, ",");
        int length = strArrSplit.length;
        this.h = new String[length];
        this.g = new long[length];
        for (int i = 0; i < strArrSplit.length; i++) {
            try {
                this.g[i] = Long.parseLong(strArrSplit[i]);
            } catch (NumberFormatException unused) {
                gi2.q0(5);
                this.g[i] = -1;
            }
        }
    }

    public final void a(ae2 ae2Var) {
        rz1 rz1Var = this.d;
        tz1 tz1Var = this.e;
        pu1.t(tz1Var, rz1Var, "vpc2");
        this.i = true;
        tz1Var.c("vpn", ae2Var.d());
        this.n = ae2Var;
    }

    public final void b() {
        Bundle bundleU;
        if (!r || this.o) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("type", "native-player-metrics");
        bundle.putString("request", this.b);
        bundle.putString("player", this.n.d());
        pj4 pj4Var = this.f;
        String[] strArr = (String[]) pj4Var.g;
        ArrayList arrayList = new ArrayList(strArr.length);
        int i = 0;
        while (i < strArr.length) {
            String str = strArr[i];
            double[] dArr = (double[]) pj4Var.i;
            double[] dArr2 = (double[]) pj4Var.h;
            int[] iArr = (int[]) pj4Var.j;
            double d = dArr[i];
            double d2 = dArr2[i];
            int i2 = iArr[i];
            arrayList.add(new rw1(str, d, d2, i2 / pj4Var.f, i2));
            i++;
            pj4Var = pj4Var;
            strArr = strArr;
        }
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            rw1 rw1Var = (rw1) obj;
            String str2 = rw1Var.a;
            bundle.putString("fps_c_".concat(String.valueOf(str2)), Integer.toString(rw1Var.e));
            bundle.putString("fps_p_".concat(String.valueOf(str2)), Double.toString(rw1Var.d));
        }
        int i4 = 0;
        while (true) {
            long[] jArr = this.g;
            if (i4 >= jArr.length) {
                break;
            }
            String str3 = this.h[i4];
            if (str3 != null) {
                Long lValueOf = Long.valueOf(jArr[i4]);
                new StringBuilder(lValueOf.toString().length() + 3);
                bundle.putString("fh_".concat(lValueOf.toString()), str3);
            }
            i4++;
        }
        final lf4 lf4Var = hg4.C.c;
        String str4 = this.c.f;
        AtomicReference atomicReference = lf4Var.c;
        bundle.putString("device", lf4.O());
        iz1 iz1Var = mz1.a;
        tw1 tw1Var = tw1.e;
        bundle.putString("eids", TextUtils.join(",", tw1Var.a.H()));
        boolean zIsEmpty = bundle.isEmpty();
        final Context context = this.a;
        if (zIsEmpty) {
            gi2.U("Empty or null bundle.");
        } else {
            final String str5 = (String) tw1Var.c.a(mz1.pb);
            if (!lf4Var.d.getAndSet(true)) {
                SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: qc4
                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                    public final /* synthetic */ void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str6) {
                        lf4Var.c.set(yc0.u(context, str5));
                    }
                };
                if (TextUtils.isEmpty(str5)) {
                    bundleU = Bundle.EMPTY;
                } else {
                    PreferenceManager.getDefaultSharedPreferences(context).registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
                    bundleU = yc0.u(context, str5);
                }
                atomicReference.set(bundleU);
            }
            bundle.putAll((Bundle) atomicReference.get());
        }
        j63 j63Var = sv1.f.a;
        j63.a(context, str4, bundle, new lv2(context, str4, 14));
        this.o = true;
    }

    public final void c(ae2 ae2Var) {
        if (this.k && !this.l) {
            if (gi2.R() && !this.l) {
                gi2.G("VideoMetricsMixin first frame");
            }
            pu1.t(this.e, this.d, "vff2");
            this.l = true;
        }
        hg4.C.k.getClass();
        long jNanoTime = System.nanoTime();
        if (this.m && this.p && this.q != -1) {
            double nanos = TimeUnit.SECONDS.toNanos(1L) / (jNanoTime - this.q);
            pj4 pj4Var = this.f;
            pj4Var.f++;
            int i = 0;
            while (true) {
                double[] dArr = (double[]) pj4Var.i;
                if (i >= dArr.length) {
                    break;
                }
                double d = dArr[i];
                if (d <= nanos && nanos < ((double[]) pj4Var.h)[i]) {
                    int[] iArr = (int[]) pj4Var.j;
                    iArr[i] = iArr[i] + 1;
                }
                if (nanos < d) {
                    break;
                } else {
                    i++;
                }
            }
        }
        this.p = this.m;
        this.q = jNanoTime;
        long jLongValue = ((Long) tw1.e.c.a(mz1.N)).longValue();
        long jK = ae2Var.k();
        int i2 = 0;
        while (true) {
            String[] strArr = this.h;
            if (i2 >= strArr.length) {
                return;
            }
            if (strArr[i2] == null && jLongValue > Math.abs(jK - this.g[i2])) {
                int i3 = 8;
                Bitmap bitmap = ae2Var.getBitmap(8, 8);
                long j = 63;
                int i4 = 0;
                long j2 = 0;
                while (i4 < i3) {
                    int i5 = 0;
                    while (i5 < i3) {
                        int pixel = bitmap.getPixel(i5, i4);
                        j2 |= (Color.green(pixel) + (Color.red(pixel) + Color.blue(pixel)) > 128 ? 1L : 0L) << ((int) j);
                        j--;
                        i5++;
                        i3 = 8;
                    }
                    i4++;
                    i3 = 8;
                }
                strArr[i2] = String.format("%016X", Long.valueOf(j2));
                return;
            }
            i2++;
        }
    }

    public final void d() {
        this.m = true;
        if (!this.j || this.k) {
            return;
        }
        pu1.t(this.e, this.d, "vfp2");
        this.k = true;
    }
}
