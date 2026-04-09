package com.google.android.gms.internal.ads;

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

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class zx {

    /* renamed from: r, reason: collision with root package name */
    public static final boolean f19212r;

    /* renamed from: a, reason: collision with root package name */
    public final Context f19213a;

    /* renamed from: b, reason: collision with root package name */
    public final String f19214b;

    /* renamed from: c, reason: collision with root package name */
    public final za.a f19215c;

    /* renamed from: d, reason: collision with root package name */
    public final uk f19216d;

    /* renamed from: e, reason: collision with root package name */
    public final vk f19217e;

    /* renamed from: f, reason: collision with root package name */
    public final ol.i f19218f;
    public final long[] g;

    /* renamed from: h, reason: collision with root package name */
    public final String[] f19219h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f19220i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f19221k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f19222l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f19223m;

    /* renamed from: n, reason: collision with root package name */
    public px f19224n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f19225o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f19226p;

    /* renamed from: q, reason: collision with root package name */
    public long f19227q;

    static {
        f19212r = va.r.g.f36161e.nextInt(100) < ((Integer) va.s.f36163e.f36166c.a(sk.Wd)).intValue();
    }

    public zx(Context context, za.a aVar, String str, vk vkVar, uk ukVar) {
        w4.m mVar = new w4.m(2);
        mVar.f("min_1", Double.MIN_VALUE, 1.0d);
        mVar.f("1_5", 1.0d, 5.0d);
        mVar.f("5_10", 5.0d, 10.0d);
        mVar.f("10_20", 10.0d, 20.0d);
        mVar.f("20_30", 20.0d, 30.0d);
        mVar.f("30_max", 30.0d, Double.MAX_VALUE);
        this.f19218f = new ol.i(mVar);
        this.f19220i = false;
        this.j = false;
        this.f19221k = false;
        this.f19222l = false;
        this.f19227q = -1L;
        this.f19213a = context;
        this.f19215c = aVar;
        this.f19214b = str;
        this.f19217e = vkVar;
        this.f19216d = ukVar;
        String str2 = (String) va.s.f36163e.f36166c.a(sk.f16051b0);
        if (str2 == null) {
            this.f19219h = new String[0];
            this.g = new long[0];
            return;
        }
        String[] strArrSplit = TextUtils.split(str2, ",");
        int length = strArrSplit.length;
        this.f19219h = new String[length];
        this.g = new long[length];
        for (int i4 = 0; i4 < strArrSplit.length; i4++) {
            try {
                this.g[i4] = Long.parseLong(strArrSplit[i4]);
            } catch (NumberFormatException e2) {
                za.i.i("Unable to parse frame hash target time number.", e2);
                this.g[i4] = -1;
            }
        }
    }

    public final void a(px pxVar) {
        uk ukVar = this.f19216d;
        vk vkVar = this.f19217e;
        a80.h(vkVar, ukVar, "vpc2");
        this.f19220i = true;
        vkVar.c("vpn", pxVar.d());
        this.f19224n = pxVar;
    }

    public final void b() {
        Bundle bundleA;
        if (!f19212r || this.f19225o) {
            return;
        }
        Bundle bundleG = r5.c.g("type", "native-player-metrics");
        bundleG.putString("request", this.f19214b);
        bundleG.putString("player", this.f19224n.d());
        ol.i iVar = this.f19218f;
        String[] strArr = (String[]) iVar.f30592c;
        ArrayList arrayList = new ArrayList(strArr.length);
        int i4 = 0;
        while (i4 < strArr.length) {
            String str = strArr[i4];
            double[] dArr = (double[]) iVar.f30594e;
            double[] dArr2 = (double[]) iVar.f30593d;
            int[] iArr = (int[]) iVar.f30595f;
            double d10 = dArr[i4];
            double d11 = dArr2[i4];
            int i10 = iArr[i4];
            arrayList.add(new ya.m(str, d10, d11, i10 / iVar.f30591b, i10));
            i4++;
            iVar = iVar;
            strArr = strArr;
        }
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ya.m mVar = (ya.m) obj;
            String str2 = mVar.f37471a;
            bundleG.putString("fps_c_".concat(String.valueOf(str2)), Integer.toString(mVar.f37475e));
            bundleG.putString("fps_p_".concat(String.valueOf(str2)), Double.toString(mVar.f37474d));
        }
        int i12 = 0;
        while (true) {
            long[] jArr = this.g;
            if (i12 >= jArr.length) {
                break;
            }
            String str3 = this.f19219h[i12];
            if (str3 != null) {
                Long lValueOf = Long.valueOf(jArr[i12]);
                new StringBuilder(lValueOf.toString().length() + 3);
                bundleG.putString("fh_".concat(lValueOf.toString()), str3);
            }
            i12++;
        }
        final ya.f0 f0Var = ua.j.C.f35261c;
        String str4 = this.f19215c.f38129a;
        AtomicReference atomicReference = f0Var.f37443c;
        bundleG.putString("device", ya.f0.Q());
        pk pkVar = sk.f16033a;
        va.s sVar = va.s.f36163e;
        bundleG.putString("eids", TextUtils.join(",", sVar.f36164a.A()));
        boolean zIsEmpty = bundleG.isEmpty();
        final Context context = this.f19213a;
        if (zIsEmpty) {
            za.i.c("Empty or null bundle.");
        } else {
            final String str5 = (String) sVar.f36166c.a(sk.Ob);
            if (!f0Var.f37444d.getAndSet(true)) {
                SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: ya.e0
                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                    public final /* synthetic */ void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str6) {
                        f0Var.f37443c.set(nh.a.A(context, str5));
                    }
                };
                if (TextUtils.isEmpty(str5)) {
                    bundleA = Bundle.EMPTY;
                } else {
                    PreferenceManager.getDefaultSharedPreferences(context).registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
                    bundleA = nh.a.A(context, str5);
                }
                atomicReference.set(bundleA);
            }
            bundleG.putAll((Bundle) atomicReference.get());
        }
        za.d dVar = va.r.g.f36157a;
        za.d.a(context, str4, bundleG, new ya.d0(context, str4));
        this.f19225o = true;
    }

    public final void c(px pxVar) {
        if (this.f19221k && !this.f19222l) {
            if (ya.a0.o() && !this.f19222l) {
                ya.a0.m("VideoMetricsMixin first frame");
            }
            a80.h(this.f19217e, this.f19216d, "vff2");
            this.f19222l = true;
        }
        ua.j.C.f35267k.getClass();
        long jNanoTime = System.nanoTime();
        if (this.f19223m && this.f19226p && this.f19227q != -1) {
            double nanos = TimeUnit.SECONDS.toNanos(1L) / (jNanoTime - this.f19227q);
            ol.i iVar = this.f19218f;
            iVar.f30591b++;
            int i4 = 0;
            while (true) {
                double[] dArr = (double[]) iVar.f30594e;
                if (i4 >= dArr.length) {
                    break;
                }
                double d10 = dArr[i4];
                if (d10 <= nanos && nanos < ((double[]) iVar.f30593d)[i4]) {
                    int[] iArr = (int[]) iVar.f30595f;
                    iArr[i4] = iArr[i4] + 1;
                }
                if (nanos < d10) {
                    break;
                } else {
                    i4++;
                }
            }
        }
        this.f19226p = this.f19223m;
        this.f19227q = jNanoTime;
        long jLongValue = ((Long) va.s.f36163e.f36166c.a(sk.f16068c0)).longValue();
        long jP = pxVar.p();
        int i10 = 0;
        while (true) {
            String[] strArr = this.f19219h;
            if (i10 >= strArr.length) {
                return;
            }
            if (strArr[i10] == null && jLongValue > Math.abs(jP - this.g[i10])) {
                int i11 = 8;
                Bitmap bitmap = pxVar.getBitmap(8, 8);
                long j = 63;
                int i12 = 0;
                long j8 = 0;
                while (i12 < i11) {
                    int i13 = 0;
                    while (i13 < i11) {
                        int pixel = bitmap.getPixel(i13, i12);
                        j8 |= (Color.green(pixel) + (Color.red(pixel) + Color.blue(pixel)) > 128 ? 1L : 0L) << ((int) j);
                        j--;
                        i13++;
                        i11 = 8;
                    }
                    i12++;
                    i11 = 8;
                }
                strArr[i10] = String.format("%016X", Long.valueOf(j8));
                return;
            }
            i10++;
        }
    }

    public final void d() {
        this.f19223m = true;
        if (!this.j || this.f19221k) {
            return;
        }
        a80.h(this.f19217e, this.f19216d, "vfp2");
        this.f19221k = true;
    }
}
