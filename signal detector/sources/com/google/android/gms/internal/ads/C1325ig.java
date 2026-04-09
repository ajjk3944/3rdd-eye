package com.google.android.gms.internal.ads;

import a.AbstractC0241a;
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
import q2.C2841s;
import t2.AbstractC2907C;
import t2.C2911G;
import u2.C2951a;

/* renamed from: com.google.android.gms.internal.ads.ig, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1325ig {

    /* renamed from: r, reason: collision with root package name */
    public static final boolean f14732r;

    /* renamed from: a, reason: collision with root package name */
    public final Context f14733a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14734b;

    /* renamed from: c, reason: collision with root package name */
    public final C2951a f14735c;

    /* renamed from: d, reason: collision with root package name */
    public final J9 f14736d;

    /* renamed from: e, reason: collision with root package name */
    public final L9 f14737e;

    /* renamed from: f, reason: collision with root package name */
    public final C0.s f14738f;

    /* renamed from: g, reason: collision with root package name */
    public final long[] f14739g;

    /* renamed from: h, reason: collision with root package name */
    public final String[] f14740h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f14741j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f14742k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f14743l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f14744m;

    /* renamed from: n, reason: collision with root package name */
    public AbstractC0827Yf f14745n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f14746o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f14747p;

    /* renamed from: q, reason: collision with root package name */
    public long f14748q;

    static {
        f14732r = q2.r.f23260g.f23265e.nextInt(100) < ((Integer) C2841s.f23267e.f23270c.a(H9.Ud)).intValue();
    }

    public C1325ig(Context context, C2951a c2951a, String str, L9 l9, J9 j9) {
        o.a1 a1Var = new o.a1(2);
        a1Var.m("min_1", Double.MIN_VALUE, 1.0d);
        a1Var.m("1_5", 1.0d, 5.0d);
        a1Var.m("5_10", 5.0d, 10.0d);
        a1Var.m("10_20", 10.0d, 20.0d);
        a1Var.m("20_30", 20.0d, 30.0d);
        a1Var.m("30_max", 30.0d, Double.MAX_VALUE);
        this.f14738f = new C0.s(a1Var);
        this.i = false;
        this.f14741j = false;
        this.f14742k = false;
        this.f14743l = false;
        this.f14748q = -1L;
        this.f14733a = context;
        this.f14735c = c2951a;
        this.f14734b = str;
        this.f14737e = l9;
        this.f14736d = j9;
        String str2 = (String) C2841s.f23267e.f23270c.a(H9.b0);
        if (str2 == null) {
            this.f14740h = new String[0];
            this.f14739g = new long[0];
            return;
        }
        String[] strArrSplit = TextUtils.split(str2, ",");
        int length = strArrSplit.length;
        this.f14740h = new String[length];
        this.f14739g = new long[length];
        for (int i = 0; i < strArrSplit.length; i++) {
            try {
                this.f14739g[i] = Long.parseLong(strArrSplit[i]);
            } catch (NumberFormatException e6) {
                u2.k.i("Unable to parse frame hash target time number.", e6);
                this.f14739g[i] = -1;
            }
        }
    }

    public final void a(AbstractC0827Yf abstractC0827Yf) {
        J9 j9 = this.f14736d;
        L9 l9 = this.f14737e;
        AbstractC0933bL.g(l9, j9, "vpc2");
        this.i = true;
        l9.c("vpn", abstractC0827Yf.d());
        this.f14745n = abstractC0827Yf;
    }

    public final void b() {
        Bundle bundleF;
        if (!f14732r || this.f14746o) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("type", "native-player-metrics");
        bundle.putString("request", this.f14734b);
        bundle.putString("player", this.f14745n.d());
        C0.s sVar = this.f14738f;
        String[] strArr = (String[]) sVar.f1101b;
        ArrayList arrayList = new ArrayList(strArr.length);
        int i = 0;
        while (i < strArr.length) {
            String str = strArr[i];
            double[] dArr = (double[]) sVar.f1103d;
            double[] dArr2 = (double[]) sVar.f1102c;
            int[] iArr = (int[]) sVar.f1104e;
            double d6 = dArr[i];
            double d7 = dArr2[i];
            int i3 = iArr[i];
            arrayList.add(new t2.p(str, d6, d7, i3 / sVar.f1100a, i3));
            i++;
            sVar = sVar;
            strArr = strArr;
        }
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayList.get(i6);
            i6++;
            t2.p pVar = (t2.p) obj;
            String str2 = pVar.f23642a;
            bundle.putString("fps_c_".concat(String.valueOf(str2)), Integer.toString(pVar.f23646e));
            bundle.putString("fps_p_".concat(String.valueOf(str2)), Double.toString(pVar.f23645d));
        }
        int i7 = 0;
        while (true) {
            long[] jArr = this.f14739g;
            if (i7 >= jArr.length) {
                break;
            }
            String str3 = this.f14740h[i7];
            if (str3 != null) {
                Long lValueOf = Long.valueOf(jArr[i7]);
                new StringBuilder(lValueOf.toString().length() + 3);
                bundle.putString("fh_".concat(lValueOf.toString()), str3);
            }
            i7++;
        }
        final C2911G c2911g = p2.j.f22785C.f22790c;
        String str4 = this.f14735c.f23784a;
        AtomicReference atomicReference = c2911g.f23579c;
        bundle.putString("device", C2911G.Q());
        E9 e9 = H9.f8707a;
        C2841s c2841s = C2841s.f23267e;
        bundle.putString("eids", TextUtils.join(",", c2841s.f23268a.C()));
        boolean zIsEmpty = bundle.isEmpty();
        final Context context = this.f14733a;
        if (zIsEmpty) {
            u2.k.c("Empty or null bundle.");
        } else {
            final String str5 = (String) c2841s.f23270c.a(H9.Mb);
            if (!c2911g.f23580d.getAndSet(true)) {
                SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: t2.F
                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                    public final /* synthetic */ void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str6) {
                        c2911g.f23579c.set(AbstractC0241a.F(context, str5));
                    }
                };
                if (TextUtils.isEmpty(str5)) {
                    bundleF = Bundle.EMPTY;
                } else {
                    PreferenceManager.getDefaultSharedPreferences(context).registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
                    bundleF = AbstractC0241a.F(context, str5);
                }
                atomicReference.set(bundleF);
            }
            bundle.putAll((Bundle) atomicReference.get());
        }
        u2.f fVar = q2.r.f23260g.f23261a;
        u2.f.a(context, str4, bundle, new V2.h(context, 28, str4));
        this.f14746o = true;
    }

    public final void c(AbstractC0827Yf abstractC0827Yf) {
        if (this.f14742k && !this.f14743l) {
            if (AbstractC2907C.o() && !this.f14743l) {
                AbstractC2907C.m("VideoMetricsMixin first frame");
            }
            AbstractC0933bL.g(this.f14737e, this.f14736d, "vff2");
            this.f14743l = true;
        }
        p2.j.f22785C.f22797k.getClass();
        long jNanoTime = System.nanoTime();
        if (this.f14744m && this.f14747p && this.f14748q != -1) {
            double nanos = TimeUnit.SECONDS.toNanos(1L) / (jNanoTime - this.f14748q);
            C0.s sVar = this.f14738f;
            sVar.f1100a++;
            int i = 0;
            while (true) {
                double[] dArr = (double[]) sVar.f1103d;
                if (i >= dArr.length) {
                    break;
                }
                double d6 = dArr[i];
                if (d6 <= nanos && nanos < ((double[]) sVar.f1102c)[i]) {
                    int[] iArr = (int[]) sVar.f1104e;
                    iArr[i] = iArr[i] + 1;
                }
                if (nanos < d6) {
                    break;
                } else {
                    i++;
                }
            }
        }
        this.f14747p = this.f14744m;
        this.f14748q = jNanoTime;
        long jLongValue = ((Long) C2841s.f23267e.f23270c.a(H9.f8720c0)).longValue();
        long jK = abstractC0827Yf.k();
        int i3 = 0;
        while (true) {
            String[] strArr = this.f14740h;
            if (i3 >= strArr.length) {
                return;
            }
            if (strArr[i3] == null && jLongValue > Math.abs(jK - this.f14739g[i3])) {
                int i6 = 8;
                Bitmap bitmap = abstractC0827Yf.getBitmap(8, 8);
                long j6 = 63;
                int i7 = 0;
                long j7 = 0;
                while (i7 < i6) {
                    int i8 = 0;
                    while (i8 < i6) {
                        int pixel = bitmap.getPixel(i8, i7);
                        j7 |= (Color.green(pixel) + (Color.red(pixel) + Color.blue(pixel)) > 128 ? 1L : 0L) << ((int) j6);
                        j6--;
                        i8++;
                        i6 = 8;
                    }
                    i7++;
                    i6 = 8;
                }
                strArr[i3] = String.format("%016X", Long.valueOf(j7));
                return;
            }
            i3++;
        }
    }

    public final void d() {
        this.f14744m = true;
        if (!this.f14741j || this.f14742k) {
            return;
        }
        AbstractC0933bL.g(this.f14737e, this.f14736d, "vfp2");
        this.f14742k = true;
    }
}
