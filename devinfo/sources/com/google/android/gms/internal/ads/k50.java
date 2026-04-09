package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.NetworkCapabilities;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import java.io.File;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class k50 implements fs1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13032a;

    /* renamed from: b, reason: collision with root package name */
    public final js1 f13033b;

    /* renamed from: c, reason: collision with root package name */
    public final js1 f13034c;

    /* renamed from: d, reason: collision with root package name */
    public final js1 f13035d;

    /* renamed from: e, reason: collision with root package name */
    public final js1 f13036e;

    /* renamed from: f, reason: collision with root package name */
    public final js1 f13037f;
    public final js1 g;

    /* renamed from: h, reason: collision with root package name */
    public final js1 f13038h;

    public k50(a10 a10Var, es1 es1Var, h10 h10Var, b60 b60Var, es1 es1Var2, js1 js1Var, es1 es1Var3) {
        this.f13032a = 2;
        this.f13033b = a10Var;
        this.f13034c = es1Var;
        this.f13035d = h10Var;
        this.f13038h = b60Var;
        this.g = es1Var2;
        this.f13036e = js1Var;
        this.f13037f = es1Var3;
    }

    @Override // com.google.android.gms.internal.ads.js1
    public final Object a() {
        int i4 = this.f13032a;
        js1 js1Var = this.f13038h;
        js1 js1Var2 = this.g;
        js1 js1Var3 = this.f13035d;
        js1 js1Var4 = this.f13034c;
        js1 js1Var5 = this.f13037f;
        js1 js1Var6 = this.f13036e;
        js1 js1Var7 = this.f13033b;
        switch (i4) {
            case 0:
                return new j50(((a10) js1Var7).b(), ((b60) js1Var).b(), ((g10) js1Var4).b(), ((x00) js1Var3).a(), (re0) js1Var6.a(), (cs0) js1Var5.a(), (ff0) js1Var2.a());
            case 1:
                return new kd0(((a10) js1Var7).b(), (oq0) js1Var4.a(), (qd0) js1Var3.a(), ((v40) js1Var5).c(), ((v40) js1Var2).b(), (lh0) js1Var6.a(), (String) ((fs1) js1Var).a());
            case 2:
                return new od0(((a10) js1Var7).b(), (ud0) js1Var4.a(), ((h10) js1Var3).a(), ((b60) js1Var).b(), (String) ((es1) js1Var2).a(), (String) js1Var6.a(), (oe) js1Var5.a());
            case 3:
                return b();
            case 4:
                j10 j10Var = (j10) ((gs1) js1Var3).f11600a;
                ex exVar = fx.f11274a;
                al0.z(exVar);
                return new cj0(j10Var, exVar, ((yv) js1Var6).c(), (rq0) js1Var7.a(), (lc0) ((es1) js1Var5).a(), (od0) ((es1) js1Var2).a(), ((g10) js1Var4).b(), (Context) ((es1) js1Var).a(), new hl(17));
            case 5:
                return new so0((k10) js1Var7.a(), (Context) ((gs1) js1Var6).f11600a, (String) ((gs1) js1Var5).f11600a, (po0) ((es1) js1Var2).a(), (oo0) ((es1) js1Var).a(), ((g10) js1Var4).b(), (qd0) js1Var3.a());
            case 6:
                return new to0((Context) ((gs1) js1Var3).f11600a, (Executor) js1Var7.a(), (va.c3) ((gs1) js1Var6).f11600a, (k10) js1Var4.a(), (uk0) ((es1) js1Var5).a(), (wk0) ((es1) js1Var2).a(), new gq0(), (w70) ((es1) js1Var).a());
            case 7:
                return new rt0(((a10) js1Var7).b(), ((g10) js1Var4).b(), (ScheduledExecutorService) ((es1) js1Var3).a(), (nr0) ((es1) js1Var6).a(), pq0.o(((z00) js1Var5).f18951b.b()), (tb.a) ((es1) js1Var2).a(), (et0) ((es1) js1Var).a());
            case 8:
                return new px0((ny0) ((es1) js1Var7).a(), (ez0) ((es1) js1Var4).a(), (v11) ((es1) js1Var3).a(), (g21) ((es1) js1Var6).a(), (dy0) ((es1) js1Var5).a(), es1.c((es1) js1Var2), (sx0) ((gs1) js1Var).f11600a);
            case 9:
                return new fz0((ExecutorService) js1Var7.a(), es1.c((es1) js1Var5), es1.c(js1Var4), (v11) js1Var3.a(), es1.c((es1) js1Var2), (tx0) js1Var, (sx0) js1Var6.a());
            case 10:
                Context context = (Context) js1Var7.a();
                ExecutorService executorService = (ExecutorService) js1Var4.a();
                lz0 lz0Var = (lz0) js1Var3.a();
                rz0 rz0Var = (rz0) ((es1) js1Var).a();
                File file = (File) js1Var6.a();
                g21 g21Var = (g21) js1Var5.a();
                sx0 sx0Var = (sx0) js1Var2.a();
                e51 e51VarK = e51.k(new uz0("PH59Z8k3dpWxORUT8HU0o+g5WN12ilbJvwpqiSzw0bSm8ti3u+Yy1pYDsitXR/IS", "EBTPDqTGNNE4oafrCuyvamIcg1nistjqiNmDYn1J+fs=", Context.class), new uz0("0t12poYWosmBpngKvXFsIJ660Q+4XUg0b7zXGmPDXQpDG3a/Lo5YnElAjbhGuK/3", "2X8cf0JDVCgUXbkJnirLCT8PfoAeQLAghvQ5pw2PRcc=", new Class[0]), new uz0("DoplGqb2T7yuEuU5Q/qB4xZESNb88h/QJW4dcmkvxhTQcQzfkR6CzgZ/7IxnBujg", "t9POLaVAVF/e8zEpIMQR1NYpTbKPa6FoDXMGzMPACVE=", NetworkCapabilities.class, Long.class, Long.class), new uz0("+u39B3Ru+as7tqO802m94mg9PjfYQkgFzji5XgHtCyBf/YnuIOHxMwz3OLEd09xH", "kRKvziikDPxXOyKPxf3roAGIVsl+QZcLY0mCgeB7yN4=", String.class), new uz0("bnVSgdPP2gLWa4hBN3KENgNw/HH5/Lu+gCRQEGIHMH/zN0uabg0EmprGntHqQpss", "4mb2wE47WPzlH8QFuj7X929jGLgzTiMr8Iu3TogjJ0U=", View.class, Activity.class), new uz0("QtFUhprc0s9rDonjH5m4IrigIFuqmp02TDnBB8cCDzOGBvtX+nN2RsZyZRWOgPcG", "ANcskOtBFoz5qdvK1HjqJ5/70uPKH1zreYbosxrVnAY=", DisplayMetrics.class, View.class), new uz0("+PmnicIB6Ggxqdcyc5KXYWsM1j/GXRihAyryrcphzvI3AMIT+uhHMqbkBoIk/Q9k", "+zCNZC90FxKlnODut7cZO0wgbMEddS2/rBQzUBv6at4=", Long[].class, Integer.class), new uz0("3oTRZjKQOSoYyvNcYQSsDbCCM8OIxNI6HsD2yraLy7cjC5n8lPLLp8aPMOPQzMR5", "MHRGFnzrWite6OUEzeDGE6xEKTeZ1rlshMbJC9yXOH8=", new Class[0]), new uz0("Qx6fKcghp39v3hBS7aGRudr3CfsW9ttl9o6D5CM1a5VL5o9yAVkUDqNE55A7wfv7", "6qdYmVukMTFpVys4cpUndL5YDKVPIertd1vgaMgush0=", Context.class, Integer.class), new uz0("cNPndN+EzA0ppawmtlMhouOhZ8up9MCZv7/NNjE52JSJNgkl5UKlR5xuXAGt5rDT", "maxrbwgAVilcsYV2zOy8o/EZWuXXlpXIbHDx2rc0DB0=", Integer.class, Context.class, Boolean.class), new uz0("4E5LGVIWQ1GEduvP5TN/xg9UMJg1ApPRTsJapm6hD1tpcLj2ORRJ8msrY4RVPfxM", "Dj3g22+8PSWa8Tetil7hQ1gD69SNesarbyARD9M1zvc=", Context.class), new uz0("10eHn0oEJc+Kv4xHAilDadQXUH+Qd7+H1wb3g/5791dKT43oKLnvfFcwz9lBLCYb", "DO5TusvTbmxbLfPhMKcHxON+YLmz+u+OpsMl13dRFcs=", Context.class), new uz0("HAMf3XP8KIibPGIFc5yJF+oNVlSUbFLkUHSZdrZ2Dhl4Bh9ge4/6z6Usrb+mfprj", "vYv0JfNJ2rw4TIvbzqBhbKW0tXWLxxqXfI+gpZUSK1Y=", MotionEvent.class, DisplayMetrics.class), new uz0("LTqeYOkKjRvgMVLXGWwl9QUpPl0hs86RILvnzsnpkgBkbbANt+0KM6wwB7tA8s8M", "qJFn6bhMeF50E1eku7tYH88ZkNeM8ctWC3me80VkO1s=", MotionEvent.class, DisplayMetrics.class));
                al0.z(e51VarK);
                return new sz0(context, executorService, lz0Var, rz0Var, file, g21Var, sx0Var.S(), e51VarK);
            case 11:
                return new zz0((zc) ((gs1) js1Var5).f11600a, (sz0) js1Var7.a(), (Map) ((gs1) js1Var2).f11600a, (Context) js1Var4.a(), (zx0) ((gs1) js1Var).f11600a, (sx0) js1Var3.a(), (g21) js1Var6.a());
            default:
                return new f11((Context) js1Var7.a(), es1.c((es1) js1Var6), (i11) ((es1) js1Var5).a(), (g21) js1Var4.a(), (ExecutorService) js1Var3.a(), (x01) ((es1) js1Var2).a(), (gv0) ((es1) js1Var).a());
        }
    }

    public pi0 b() {
        return new pi0((p10) ((gs1) this.f13034c).f11600a, (Context) ((es1) this.f13035d).a(), (Executor) this.f13033b.a(), (wc0) ((es1) this.f13036e).a(), ((b60) this.f13038h).b(), (z21) ((es1) this.f13037f).a(), (od0) ((es1) this.g).a());
    }

    public k50(a10 a10Var, es1 es1Var, es1 es1Var2, v40 v40Var, v40 v40Var2, es1 es1Var3, fs1 fs1Var) {
        this.f13032a = 1;
        this.f13033b = a10Var;
        this.f13034c = es1Var;
        this.f13035d = es1Var2;
        this.f13037f = v40Var;
        this.g = v40Var2;
        this.f13036e = es1Var3;
        this.f13038h = fs1Var;
    }

    public k50(gs1 gs1Var, yv yvVar, js1 js1Var, es1 es1Var, es1 es1Var2, js1 js1Var2, es1 es1Var3) {
        this.f13032a = 4;
        this.f13035d = gs1Var;
        this.f13036e = yvVar;
        this.f13033b = js1Var;
        this.f13037f = es1Var;
        this.g = es1Var2;
        this.f13034c = js1Var2;
        this.f13038h = es1Var3;
    }

    public k50(gs1 gs1Var, es1 es1Var, es1 es1Var2, es1 es1Var3, es1 es1Var4, tx0 tx0Var, gs1 gs1Var2) {
        this.f13032a = 9;
        this.f13033b = gs1Var;
        this.f13037f = es1Var;
        this.f13034c = es1Var2;
        this.f13035d = es1Var3;
        this.g = es1Var4;
        this.f13038h = tx0Var;
        this.f13036e = gs1Var2;
    }

    public k50(gs1 gs1Var, es1 es1Var, es1 es1Var2, es1 es1Var3, gs1 gs1Var2, es1 es1Var4, es1 es1Var5) {
        this.f13032a = 12;
        this.f13033b = gs1Var;
        this.f13036e = es1Var;
        this.f13037f = es1Var2;
        this.f13034c = es1Var3;
        this.f13035d = gs1Var2;
        this.g = es1Var4;
        this.f13038h = es1Var5;
    }

    public k50(gs1 gs1Var, es1 es1Var, gs1 gs1Var2, gs1 gs1Var3, es1 es1Var2, es1 es1Var3, es1 es1Var4) {
        this.f13032a = 6;
        this.f13035d = gs1Var;
        this.f13033b = es1Var;
        this.f13036e = gs1Var2;
        this.f13034c = gs1Var3;
        this.f13037f = es1Var2;
        this.g = es1Var3;
        this.f13038h = es1Var4;
    }

    public k50(gs1 gs1Var, es1 es1Var, gs1 gs1Var2, gs1 gs1Var3, gs1 gs1Var4, gs1 gs1Var5, es1 es1Var2) {
        this.f13032a = 11;
        this.f13037f = gs1Var;
        this.f13033b = es1Var;
        this.g = gs1Var2;
        this.f13034c = gs1Var3;
        this.f13038h = gs1Var4;
        this.f13035d = gs1Var5;
        this.f13036e = es1Var2;
    }

    public k50(gs1 gs1Var, es1 es1Var, js1 js1Var, es1 es1Var2, b60 b60Var, es1 es1Var3, es1 es1Var4) {
        this.f13032a = 3;
        this.f13034c = gs1Var;
        this.f13035d = es1Var;
        this.f13033b = js1Var;
        this.f13036e = es1Var2;
        this.f13038h = b60Var;
        this.f13037f = es1Var3;
        this.g = es1Var4;
    }

    public k50(gs1 gs1Var, gs1 gs1Var2, es1 es1Var, es1 es1Var2, es1 es1Var3, es1 es1Var4, gs1 gs1Var3) {
        this.f13032a = 10;
        this.f13033b = gs1Var;
        this.f13034c = gs1Var2;
        this.f13035d = es1Var;
        this.f13038h = es1Var2;
        this.f13036e = es1Var3;
        this.f13037f = es1Var4;
        this.g = gs1Var3;
    }

    public k50(gs1 gs1Var, gs1 gs1Var2, gs1 gs1Var3, es1 es1Var, es1 es1Var2, g10 g10Var, es1 es1Var3) {
        this.f13032a = 5;
        this.f13033b = gs1Var;
        this.f13036e = gs1Var2;
        this.f13037f = gs1Var3;
        this.g = es1Var;
        this.f13038h = es1Var2;
        this.f13034c = g10Var;
        this.f13035d = es1Var3;
    }

    public k50(js1 js1Var, b60 b60Var, js1 js1Var2, js1 js1Var3, js1 js1Var4, js1 js1Var5, js1 js1Var6) {
        this.f13032a = 0;
        this.f13033b = js1Var;
        this.f13038h = b60Var;
        this.f13034c = js1Var2;
        this.f13035d = js1Var3;
        this.f13036e = js1Var4;
        this.f13037f = js1Var5;
        this.g = js1Var6;
    }

    public /* synthetic */ k50(js1 js1Var, js1 js1Var2, es1 es1Var, es1 es1Var2, js1 js1Var3, es1 es1Var3, Object obj, int i4) {
        this.f13032a = i4;
        this.f13033b = js1Var;
        this.f13034c = js1Var2;
        this.f13035d = es1Var;
        this.f13036e = es1Var2;
        this.f13037f = js1Var3;
        this.g = es1Var3;
        this.f13038h = (js1) obj;
    }
}
