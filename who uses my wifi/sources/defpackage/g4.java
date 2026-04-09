package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import android.view.View;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class g4 implements iq3, hk1, ch3, t9, u9 {
    public final /* synthetic */ int f;
    public final Object g;
    public Object h;
    public final Object i;
    public final Object j;
    public Object k;

    public g4(Context context, k62 k62Var, e51 e51Var) {
        this.f = 8;
        this.g = new Object();
        this.j = context.getApplicationContext();
        this.k = e51Var;
        this.i = k62Var;
    }

    public static JSONObject i(Context context, e51 e51Var) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            if (((Boolean) s02.d.w()).booleanValue()) {
                jSONObject.put("package_name", context.getPackageName());
            }
            jSONObject.put("js", e51Var.f);
            jSONObject.put("mf", s02.e.w());
            jSONObject.put("cl", "811902923");
            jSONObject.put("rapid_rc", "dev");
            jSONObject.put("rapid_rollup", "HEAD");
            jSONObject.put("admob_module_version", 12451000);
            jSONObject.put("dynamite_local_version", ModuleDescriptor.MODULE_VERSION);
            jSONObject.put("dynamite_version", ar.d(context, false));
            jSONObject.put("container_version", 12451000);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public static qr1 k() {
        fr1 fr1VarC0 = qr1.C0();
        fr1VarC0.h(32768L);
        return (qr1) fr1VarC0.d();
    }

    @Override // defpackage.t9
    public void T(int i) throws InterruptedException {
        try {
            ((LinkedBlockingQueue) this.i).put(k());
        } catch (InterruptedException unused) {
        }
    }

    @Override // defpackage.u9
    public void U(rh rhVar) throws InterruptedException {
        try {
            ((LinkedBlockingQueue) this.i).put(k());
        } catch (InterruptedException unused) {
        }
    }

    @Override // defpackage.t9
    public void Y() {
        yd3 yd3Var;
        LinkedBlockingQueue linkedBlockingQueue = (LinkedBlockingQueue) this.i;
        HandlerThread handlerThread = (HandlerThread) this.k;
        try {
            yd3Var = (yd3) ((vd3) this.g).t();
        } catch (DeadObjectException | IllegalStateException unused) {
            yd3Var = null;
        }
        if (yd3Var != null) {
            try {
                try {
                    wd3 wd3Var = new wd3(1, (String) this.j, (String) this.h);
                    Parcel parcelU = yd3Var.U();
                    iv1.c(parcelU, wd3Var);
                    Parcel parcelY = yd3Var.Y(parcelU, 1);
                    xd3 xd3Var = (xd3) iv1.b(parcelY, xd3.CREATOR);
                    parcelY.recycle();
                    if (xd3Var.g == null) {
                        try {
                            byte[] bArr = xd3Var.h;
                            h54 h54Var = h54.a;
                            int i = u44.a;
                            xd3Var.g = qr1.B0(bArr, h54.b);
                            xd3Var.h = null;
                        } catch (a64 | NullPointerException e) {
                            throw new IllegalStateException(e);
                        }
                    }
                    xd3Var.a();
                    linkedBlockingQueue.put(xd3Var.g);
                } catch (InterruptedException unused2) {
                } catch (Throwable th) {
                    d();
                    handlerThread.quit();
                    throw th;
                }
            } catch (Throwable unused3) {
                linkedBlockingQueue.put(k());
            }
            d();
            handlerThread.quit();
        }
    }

    @Override // defpackage.hk1
    public int a() {
        return ((long[]) this.j).length;
    }

    @Override // defpackage.hk1
    public ArrayList b(long j) {
        Map map = (Map) this.h;
        HashMap map2 = (HashMap) this.i;
        HashMap map3 = (HashMap) this.k;
        gl1 gl1Var = (gl1) this.g;
        ArrayList arrayList = new ArrayList();
        String str = gl1Var.h;
        gl1Var.g(j, str, arrayList);
        TreeMap treeMap = new TreeMap();
        gl1Var.h(j, false, str, treeMap);
        gl1Var.j(j, map, map2, str, treeMap);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Pair pair = (Pair) arrayList.get(i);
            String str2 = (String) map3.get(pair.second);
            if (str2 != null) {
                byte[] bArrDecode = Base64.decode(str2, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                jl1 jl1Var = (jl1) map2.get(pair.first);
                jl1Var.getClass();
                arrayList2.add(new fi2(null, null, null, bitmapDecodeByteArray, jl1Var.c, 0, jl1Var.e, jl1Var.b, 0, Integer.MIN_VALUE, -3.4028235E38f, jl1Var.f, jl1Var.g, jl1Var.j, 0.0f, 0));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            jl1 jl1Var2 = (jl1) map2.get(entry.getKey());
            jl1Var2.getClass();
            uh2 uh2Var = (uh2) entry.getValue();
            CharSequence charSequence = uh2Var.a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (el1 el1Var : (el1[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), el1.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(el1Var), spannableStringBuilder.getSpanEnd(el1Var), (CharSequence) "");
            }
            int i2 = 0;
            while (i2 < spannableStringBuilder.length()) {
                int i3 = i2 + 1;
                if (spannableStringBuilder.charAt(i2) == ' ') {
                    int i4 = i3;
                    while (i4 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i4) == ' ') {
                        i4++;
                    }
                    int i5 = i4 - i3;
                    if (i5 > 0) {
                        spannableStringBuilder.delete(i2, i5 + i2);
                    }
                }
                i2 = i3;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            int i6 = 0;
            while (i6 < spannableStringBuilder.length() - 1) {
                int i7 = i6 + 1;
                if (spannableStringBuilder.charAt(i6) == '\n' && spannableStringBuilder.charAt(i7) == ' ') {
                    spannableStringBuilder.delete(i7, i6 + 2);
                }
                i6 = i7;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            int i8 = 0;
            while (i8 < spannableStringBuilder.length() - 1) {
                int i9 = i8 + 1;
                if (spannableStringBuilder.charAt(i8) == ' ' && spannableStringBuilder.charAt(i9) == '\n') {
                    spannableStringBuilder.delete(i8, i9);
                }
                i8 = i9;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            float f = jl1Var2.c;
            int i10 = jl1Var2.d;
            uh2Var.e = f;
            uh2Var.f = i10;
            uh2Var.g = jl1Var2.e;
            uh2Var.h = jl1Var2.b;
            uh2Var.l = jl1Var2.f;
            float f2 = jl1Var2.i;
            int i11 = jl1Var2.h;
            uh2Var.k = f2;
            uh2Var.j = i11;
            uh2Var.n = jl1Var2.j;
            arrayList2.add(uh2Var.a());
        }
        return arrayList2;
    }

    @Override // defpackage.hk1
    public long c(int i) {
        return ((long[]) this.j)[i];
    }

    @Override // defpackage.ch3
    public void d() {
        switch (this.f) {
            case 11:
                break;
            default:
                vd3 vd3Var = (vd3) this.g;
                if (vd3Var != null) {
                    if (vd3Var.a() || vd3Var.f()) {
                        vd3Var.k();
                        break;
                    }
                }
                break;
        }
    }

    public void e(Object obj, String str) {
        i30.m(str, "key");
        ((LinkedHashMap) this.g).put(str, obj);
        pf0 pf0Var = (pf0) ((LinkedHashMap) this.h).get(str);
        if (pf0Var != null) {
            ((ay0) pf0Var).F(obj);
        }
        pf0 pf0Var2 = (pf0) ((LinkedHashMap) this.i).get(str);
        if (pf0Var2 != null) {
            ((ay0) pf0Var2).F(obj);
        }
    }

    public n70 f() {
        synchronized (this.g) {
            try {
                if (((SharedPreferences) this.h) == null) {
                    this.h = ((Context) this.j).getSharedPreferences("google_ads_flags_meta", 0);
                }
            } finally {
            }
        }
        SharedPreferences sharedPreferences = (SharedPreferences) this.h;
        long j = sharedPreferences != null ? sharedPreferences.getLong("js_last_update", 0L) : 0L;
        hg4.C.k.getClass();
        if (System.currentTimeMillis() - j < ((Long) s02.f.w()).longValue()) {
            return lq3.g;
        }
        return pu1.P(((k62) this.i).a(i((Context) this.j, (e51) this.k)), new vn1(1, this), md2.g);
    }

    public n70 g(String str) {
        eg4 eg4Var = eg4.g;
        if (str != null) {
            if (!((Boolean) tw1.e.c.a(mz1.f)).booleanValue() || !str.isEmpty()) {
                try {
                    return n(1, 0L, str);
                } catch (NullPointerException | RejectedExecutionException unused) {
                    return pu1.r(eg4Var);
                }
            }
        }
        return pu1.r(eg4Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public byte[] l() throws java.lang.Throwable {
        /*
            r9 = this;
            java.lang.Object r0 = r9.k
            byte[] r0 = (byte[]) r0
            r1 = 0
            if (r0 != 0) goto L5c
            java.lang.Object r0 = r9.i
            java.io.File r0 = (java.io.File) r0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L50 java.io.IOException -> L55
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L50 java.io.IOException -> L55
            y44 r0 = defpackage.a54.g     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L56
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L56
            r0.<init>()     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L56
            r3 = 256(0x100, float:3.59E-43)
        L19:
            byte[] r4 = new byte[r3]     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L56
            r5 = 0
            r6 = r5
        L1d:
            if (r6 >= r3) goto L2d
            int r7 = r3 - r6
            int r7 = r2.read(r4, r6, r7)     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L56
            r8 = -1
            if (r7 != r8) goto L29
            goto L2d
        L29:
            int r6 = r6 + r7
            goto L1d
        L2b:
            r0 = move-exception
            goto L4e
        L2d:
            if (r6 != 0) goto L31
            r4 = r1
            goto L35
        L31:
            y44 r4 = defpackage.a54.n(r4, r5, r6)     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L56
        L35:
            if (r4 != 0) goto L43
            a54 r0 = defpackage.a54.o(r0)     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L56
            byte[] r0 = r0.p()     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L56
            defpackage.g82.c(r2)
            goto L5a
        L43:
            r0.add(r4)     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L56
            int r3 = r3 + r3
            r4 = 8192(0x2000, float:1.148E-41)
            int r3 = java.lang.Math.min(r3, r4)     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L56
            goto L19
        L4e:
            r1 = r2
            goto L51
        L50:
            r0 = move-exception
        L51:
            defpackage.g82.c(r1)
            throw r0
        L55:
            r2 = r1
        L56:
            defpackage.g82.c(r2)
            r0 = r1
        L5a:
            r9.k = r0
        L5c:
            java.lang.Object r0 = r9.k
            byte[] r0 = (byte[]) r0
            if (r0 != 0) goto L63
            return r1
        L63:
            int r1 = r0.length
            byte[] r0 = java.util.Arrays.copyOf(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g4.l():byte[]");
    }

    @Override // defpackage.ch3
    public void m(View view) {
        sq0 sq0Var = (sq0) this.i;
        vg0 vg0Var = (vg0) ((b23) this.k).e;
        h83 h83Var = (h83) this.j;
        a83 a83Var = (a83) this.h;
        pd2 pd2Var = (pd2) this.g;
        ju2 ju2Var = new ju2(new f20(vg0Var, a83Var), null, 1);
        xb4 xb4Var = new xb4(h83Var, a83Var, (String) null);
        ei2 ei2Var = (ei2) vg0Var.g;
        di2 di2Var = new di2(ei2Var.b, ei2Var.c, xb4Var, ju2Var);
        ug0 ug0Var = new ug0(vg0Var, di2Var, 26);
        synchronized (sq0Var) {
            sq0Var.g = ug0Var;
        }
        pd2Var.a(di2Var.y());
    }

    public n70 n(final int i, final long j, final String str) {
        final String strL;
        pq3 pq3Var = (qq3) this.h;
        cd4 cd4Var = (cd4) this.g;
        if (i > cd4Var.a) {
            bb3 bb3Var = (bb3) this.i;
            if (bb3Var == null || !cd4Var.d) {
                return pu1.r(eg4.h);
            }
            hg4.C.k.getClass();
            wo1 wo1Var = new wo1(System.currentTimeMillis(), "", str, 2);
            jz2 jz2Var = bb3Var.a;
            jz2Var.getClass();
            jz2Var.a(new mr2(jz2Var, wo1Var, 4, false));
            return pu1.r(eg4.i);
        }
        if (((Boolean) tw1.e.c.a(mz1.k9)).booleanValue()) {
            Uri uri = Uri.parse(str);
            String encodedQuery = uri.getEncodedQuery();
            Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
            builderClearQuery.appendQueryParameter("pa", Integer.toString(i));
            String strValueOf = String.valueOf(builderClearQuery.build());
            strL = ex0.l(new StringBuilder(strValueOf.length() + 1 + String.valueOf(encodedQuery).length()), strValueOf, "&", encodedQuery);
        } else {
            strL = str;
        }
        yp3 yp3Var = new yp3() { // from class: ab3
            @Override // defpackage.yp3
            public final n70 c(Object obj) {
                eg4 eg4Var = (eg4) obj;
                if (eg4Var != eg4.h) {
                    return pu1.r(eg4Var);
                }
                g4 g4Var = this.a;
                cd4 cd4Var2 = (cd4) g4Var.g;
                long j2 = cd4Var2.b;
                int i2 = i;
                if (i2 != 1) {
                    j2 = (long) (cd4Var2.c * j);
                }
                return g4Var.n(i2 + 1, j2, str);
            }
        };
        if (j == 0) {
            final int i2 = 1;
            return pu1.O(((ld2) pq3Var).c(new Callable(this) { // from class: za3
                public final /* synthetic */ g4 b;

                {
                    this.b = this;
                }

                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    switch (i2) {
                    }
                    return this.b.o(strL);
                }
            }), yp3Var, pq3Var);
        }
        final int i3 = 0;
        Callable callable = new Callable(this) { // from class: za3
            public final /* synthetic */ g4 b;

            {
                this.b = this;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                switch (i3) {
                }
                return this.b.o(strL);
            }
        };
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        uq3 uq3Var = (uq3) pq3Var;
        uq3Var.getClass();
        ar3 ar3Var = new ar3(callable);
        return pu1.O(new sq3(ar3Var, uq3Var.h.schedule(ar3Var, j, timeUnit)), yp3Var, uq3Var);
    }

    public eg4 o(String str) {
        ch2 ch2Var;
        ug4 ug4Var = (ug4) this.j;
        iz1 iz1Var = mz1.C9;
        tw1 tw1Var = tw1.e;
        if (((Boolean) tw1Var.c.a(iz1Var)).booleanValue() && (ch2Var = (ch2) this.k) != null) {
            hg4 hg4Var = hg4.C;
            if (hg4Var.c.E(str) || hg4Var.c.F(str)) {
                o94 o94Var = ch2Var.c;
                String strEncodeToString = o94Var != null ? Base64.encodeToString(o94Var.b(), 10) : null;
                HashMap map = new HashMap();
                if (strEncodeToString != null) {
                    map.put((String) tw1Var.c.a(mz1.D9), strEncodeToString);
                }
                return ug4Var.a(str, map);
            }
        }
        return ug4Var.a(str, null);
    }

    @Override // defpackage.iq3
    public void p(Object obj) {
        da3 da3Var;
        da3 da3Var2;
        da3 da3Var3;
        da3 da3Var4;
        switch (this.f) {
            case 5:
                tc2 tc2Var = (tc2) this.h;
                aa3 aa3Var = (aa3) this.i;
                n70 n70Var = (n70) this.g;
                cr1 cr1Var = (cr1) this.k;
                AtomicBoolean atomicBoolean = cr1Var.H;
                l22 l22Var = (l22) obj;
                da3 da3VarK3 = cr1.K3(n70Var, (ad2) this.j);
                atomicBoolean.set(true);
                if (!((Boolean) tw1.e.c.a(mz1.b8)).booleanValue()) {
                    if (tc2Var != null) {
                        try {
                            tc2Var.w("QueryInfo generation has been disabled.");
                        } catch (RemoteException e) {
                            gi2.Z("QueryInfo generation has been disabled.".concat(e.toString()));
                        }
                    }
                    if (!((Boolean) n02.e.w()).booleanValue() || da3VarK3 == null) {
                        return;
                    }
                    aa3Var.m("QueryInfo generation has been disabled.");
                    aa3Var.b(false);
                    da3VarK3.a(aa3Var);
                    da3VarK3.h();
                    return;
                }
                try {
                    try {
                        if (l22Var == null) {
                            if (tc2Var != null) {
                                tc2Var.t3(null, null, null);
                            }
                            aa3Var.b(true);
                            if (!((Boolean) n02.e.w()).booleanValue() || da3VarK3 == null) {
                                return;
                            }
                        } else {
                            try {
                                String str = l22Var.a;
                                if (TextUtils.isEmpty((!TextUtils.isEmpty(l22Var.c) ? new JSONObject(l22Var.c) : new JSONObject(l22Var.b)).optString("request_id", ""))) {
                                    gi2.i0("The request ID is empty in request JSON.");
                                    if (tc2Var != null) {
                                        tc2Var.w("Internal error: request ID is empty in request JSON.");
                                    }
                                    aa3Var.m("Request ID empty");
                                    aa3Var.b(false);
                                    if (!((Boolean) n02.e.w()).booleanValue() || da3VarK3 == null) {
                                        return;
                                    }
                                } else {
                                    Bundle bundle = l22Var.f;
                                    boolean z = cr1Var.v;
                                    String str2 = cr1Var.w;
                                    String str3 = cr1Var.x;
                                    if (z && bundle != null && bundle.getInt(str3, -1) == -1) {
                                        bundle.putInt(str3, cr1Var.y.get());
                                    }
                                    if (cr1Var.u && bundle != null && TextUtils.isEmpty(bundle.getString(str2))) {
                                        if (TextUtils.isEmpty(cr1Var.A)) {
                                            cr1Var.A = hg4.C.c.D(cr1Var.h, cr1Var.z.f);
                                        }
                                        bundle.putString(str2, cr1Var.A);
                                    }
                                    if (tc2Var != null) {
                                        if (TextUtils.isEmpty(l22Var.c)) {
                                            tc2Var.t3(str, bundle, l22Var.b);
                                        } else {
                                            tc2Var.t3(str, bundle, l22Var.c);
                                        }
                                    }
                                    aa3Var.b(true);
                                    if (!((Boolean) n02.e.w()).booleanValue() || da3VarK3 == null) {
                                        return;
                                    }
                                }
                            } catch (JSONException e2) {
                                gi2.i0("Failed to create JSON object from the request string.");
                                if (tc2Var != null) {
                                    String string = e2.toString();
                                    StringBuilder sb = new StringBuilder(string.length() + 33);
                                    sb.append("Internal error for request JSON: ");
                                    sb.append(string);
                                    tc2Var.w(sb.toString());
                                }
                                aa3Var.j(e2);
                                aa3Var.b(false);
                                hg4.C.h.d("SignalGeneratorImpl.generateSignals.onSuccess", e2);
                                if (!((Boolean) n02.e.w()).booleanValue() || da3VarK3 == null) {
                                    return;
                                }
                            }
                        }
                    } catch (RemoteException e3) {
                        aa3Var.j(e3);
                        aa3Var.b(false);
                        gi2.c0("", e3);
                        hg4.C.h.d("SignalGeneratorImpl.generateSignals.onSuccess", e3);
                        if (!((Boolean) n02.e.w()).booleanValue() || da3VarK3 == null) {
                            return;
                        }
                    }
                    da3VarK3.a(aa3Var);
                    da3VarK3.h();
                    return;
                } catch (Throwable th) {
                    if (((Boolean) n02.e.w()).booleanValue() && da3VarK3 != null) {
                        da3VarK3.a(aa3Var);
                        da3VarK3.h();
                    }
                    throw th;
                }
            case 12:
                bu1 bu1Var = (bu1) this.k;
                el2 el2Var = (el2) obj;
                synchronized (bu1Var) {
                    if (el2Var != null) {
                        try {
                            el2Var.b();
                        } finally {
                        }
                    }
                    ((po2) el2Var.g.f.g).g = (s23) ((t83) bu1Var.j).h;
                    ((f23) this.g).w(el2Var);
                    ((th2) bu1Var.h).b().execute(new jl2(this, 1));
                    if (!((Boolean) n02.c.w()).booleanValue() || (da3Var = (da3) this.j) == null) {
                        ea3 ea3Var = (ea3) bu1Var.k;
                        aa3 aa3Var2 = (aa3) this.h;
                        aa3Var2.o(el2Var.a.b);
                        aa3Var2.q0(el2Var.f.f);
                        aa3Var2.b(true);
                        ea3Var.b(aa3Var2.n());
                    } else {
                        da3Var.e(el2Var.a.b);
                        da3Var.g(el2Var.f.f);
                        aa3 aa3Var3 = (aa3) this.h;
                        aa3Var3.b(true);
                        da3Var.a(aa3Var3);
                        da3Var.h();
                    }
                }
                return;
            case 13:
                t63 t63Var = (t63) this.k;
                el2 el2Var2 = (el2) obj;
                synchronized (t63Var) {
                    if (el2Var2 != null) {
                        try {
                            el2Var2.b();
                        } finally {
                        }
                    }
                    t63Var.j = null;
                    if (((Boolean) tw1.e.c.a(mz1.P8)).booleanValue()) {
                        ((po2) el2Var2.g.f.g).i = t63Var.d;
                    }
                    ((y23) this.g).w(el2Var2);
                    if (!((Boolean) n02.c.w()).booleanValue() || (da3Var2 = (da3) this.j) == null) {
                        ea3 ea3Var2 = t63Var.h;
                        aa3 aa3Var4 = (aa3) this.h;
                        aa3Var4.o(el2Var2.a.b);
                        aa3Var4.q0(el2Var2.f.f);
                        aa3Var4.b(true);
                        ea3Var2.b(aa3Var4.n());
                    } else {
                        da3Var2.e(el2Var2.a.b);
                        da3Var2.g(el2Var2.f.f);
                        aa3 aa3Var5 = (aa3) this.h;
                        aa3Var5.b(true);
                        da3Var2.a(aa3Var5);
                        da3Var2.h();
                    }
                }
                return;
            case 14:
                q73 q73Var = (q73) this.k;
                hq2 hq2Var = (hq2) obj;
                synchronized (q73Var) {
                    if (hq2Var != null) {
                        try {
                            hq2Var.b();
                        } finally {
                        }
                    }
                    q73Var.i = null;
                    iz1 iz1Var = mz1.Q8;
                    tw1 tw1Var = tw1.e;
                    if (((Boolean) tw1Var.c.a(iz1Var)).booleanValue()) {
                        ug0 ug0Var = hq2Var.g.f;
                        s23 s23Var = q73Var.d;
                        po2 po2Var = (po2) ug0Var.g;
                        po2Var.g = s23Var;
                        po2Var.j = q73Var.e;
                    }
                    ((y23) this.g).w(hq2Var);
                    if (((Boolean) tw1Var.c.a(iz1Var)).booleanValue()) {
                        final int i = 1;
                        q73Var.b.execute(new Runnable(this) { // from class: o73
                            public final /* synthetic */ g4 g;

                            {
                                this.g = this;
                            }

                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                switch (i) {
                                    case 0:
                                        ((q73) this.g.k).e.e();
                                        break;
                                    default:
                                        ((q73) this.g.k).d.e();
                                        break;
                                }
                            }
                        });
                        final int i2 = 0;
                        q73Var.b.execute(new Runnable(this) { // from class: o73
                            public final /* synthetic */ g4 g;

                            {
                                this.g = this;
                            }

                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                switch (i2) {
                                    case 0:
                                        ((q73) this.g.k).e.e();
                                        break;
                                    default:
                                        ((q73) this.g.k).d.e();
                                        break;
                                }
                            }
                        });
                    }
                    if (!((Boolean) n02.c.w()).booleanValue() || (da3Var3 = (da3) this.j) == null) {
                        ea3 ea3Var3 = q73Var.g;
                        aa3 aa3Var6 = (aa3) this.h;
                        aa3Var6.o(hq2Var.a.b);
                        aa3Var6.q0(hq2Var.f.f);
                        aa3Var6.b(true);
                        ea3Var3.b(aa3Var6.n());
                    } else {
                        da3Var3.e(hq2Var.a.b);
                        da3Var3.g(hq2Var.f.f);
                        aa3 aa3Var7 = (aa3) this.h;
                        aa3Var7.b(true);
                        da3Var3.a(aa3Var7);
                        da3Var3.h();
                    }
                }
                return;
            default:
                v73 v73Var = (v73) this.k;
                iu2 iu2Var = (iu2) obj;
                synchronized (v73Var) {
                    if (iu2Var != null) {
                        try {
                            iu2Var.b();
                        } finally {
                        }
                    }
                    ((po2) iu2Var.g.f.g).j = v73Var.d;
                    ((y23) this.g).w(iu2Var);
                    Executor executor = v73Var.b;
                    s73 s73Var = v73Var.d;
                    Objects.requireNonNull(s73Var);
                    executor.execute(new bs2(19, s73Var));
                    v73Var.d.l();
                    if (!((Boolean) n02.c.w()).booleanValue() || (da3Var4 = (da3) this.j) == null) {
                        ea3 ea3Var4 = v73Var.g;
                        aa3 aa3Var8 = (aa3) this.h;
                        aa3Var8.o(iu2Var.a.b);
                        aa3Var8.q0(iu2Var.f.f);
                        aa3Var8.b(true);
                        ea3Var4.b(aa3Var8.n());
                    } else {
                        da3Var4.e(iu2Var.a.b);
                        da3Var4.g(iu2Var.f.f);
                        aa3 aa3Var9 = (aa3) this.h;
                        aa3Var9.b(true);
                        da3Var4.a(aa3Var9);
                        da3Var4.h();
                    }
                }
                return;
        }
    }

    @Override // defpackage.iq3
    public void s(Throwable th) {
        da3 da3Var;
        da3 da3Var2;
        da3 da3Var3;
        da3 da3Var4;
        switch (this.f) {
            case 5:
                String message = th.getMessage();
                if (((Boolean) tw1.e.c.a(mz1.h8)).booleanValue()) {
                    hg4.C.h.e("SignalGeneratorImpl.generateSignals", th);
                } else {
                    hg4.C.h.d("SignalGeneratorImpl.generateSignals", th);
                }
                da3 da3VarK3 = cr1.K3((n70) this.g, (ad2) this.j);
                if (((Boolean) n02.e.w()).booleanValue() && da3VarK3 != null) {
                    aa3 aa3Var = (aa3) this.i;
                    aa3Var.j(th);
                    aa3Var.b(false);
                    da3VarK3.a(aa3Var);
                    da3VarK3.h();
                }
                tc2 tc2Var = (tc2) this.h;
                if (tc2Var == null) {
                    return;
                }
                try {
                    if (!"Unknown format is no longer supported.".equals(message)) {
                        StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 16);
                        sb.append("Internal error. ");
                        sb.append(message);
                        message = sb.toString();
                    }
                    tc2Var.w(message);
                    return;
                } catch (RemoteException e) {
                    gi2.c0("", e);
                    return;
                }
            case 12:
                aa3 aa3Var2 = (aa3) this.h;
                if (((Boolean) tw1.e.c.a(mz1.h6)).booleanValue()) {
                    gi2.R();
                }
                sh2 sh2Var = (sh2) this.i;
                nx2 nx2VarJ = zt0.J(th, ((nl2) sh2Var.n.d()).l);
                ((vm2) sh2Var.j.d()).d0(nx2VarJ);
                bu1 bu1Var = (bu1) this.k;
                ((th2) bu1Var.h).b().execute(new sz2(this, nx2VarJ, 4));
                yc0.p(nx2VarJ.f, th, "NativeAdLoader.onFailure");
                ((f23) this.g).mo8a();
                if (!((Boolean) n02.c.w()).booleanValue() || (da3Var = (da3) this.j) == null) {
                    ea3 ea3Var = (ea3) bu1Var.k;
                    aa3Var2.k(nx2VarJ);
                    aa3Var2.j(th);
                    aa3Var2.b(false);
                    ea3Var.b(aa3Var2.n());
                    return;
                }
                da3Var.f(nx2VarJ);
                aa3Var2.j(th);
                aa3Var2.b(false);
                da3Var.a(aa3Var2);
                da3Var.h();
                return;
            case 13:
                iz1 iz1Var = mz1.h6;
                tw1 tw1Var = tw1.e;
                if (((Boolean) tw1Var.c.a(iz1Var)).booleanValue()) {
                    gi2.R();
                }
                t63 t63Var = (t63) this.k;
                zh2 zh2Var = (zh2) t63Var.e.l();
                nx2 nx2VarJ2 = zh2Var == null ? zt0.J(th, null) : zt0.J(th, zh2Var.a().l);
                synchronized (t63Var) {
                    try {
                        t63Var.j = null;
                        if (zh2Var != null) {
                            ((vm2) zh2Var.k.d()).d0(nx2VarJ2);
                            if (((Boolean) tw1Var.c.a(mz1.P8)).booleanValue()) {
                                t63Var.b.execute(new sz2(this, nx2VarJ2, 5));
                            }
                        } else {
                            t63Var.d.d0(nx2VarJ2);
                            t63Var.b((r63) this.i).a().a().f.p();
                        }
                        yc0.p(nx2VarJ2.f, th, "AppOpenAdLoader.onFailure");
                        ((y23) this.g).mo8a();
                        if (!((Boolean) n02.c.w()).booleanValue() || (da3Var2 = (da3) this.j) == null) {
                            ea3 ea3Var2 = t63Var.h;
                            aa3 aa3Var3 = (aa3) this.h;
                            aa3Var3.k(nx2VarJ2);
                            aa3Var3.j(th);
                            aa3Var3.b(false);
                            ea3Var2.b(aa3Var3.n());
                        } else {
                            da3Var2.f(nx2VarJ2);
                            aa3 aa3Var4 = (aa3) this.h;
                            aa3Var4.j(th);
                            aa3Var4.b(false);
                            da3Var2.a(aa3Var4);
                            da3Var2.h();
                        }
                    } finally {
                    }
                }
                return;
            case 14:
                iz1 iz1Var2 = mz1.h6;
                tw1 tw1Var2 = tw1.e;
                if (((Boolean) tw1Var2.c.a(iz1Var2)).booleanValue()) {
                    gi2.R();
                }
                ei2 ei2Var = (ei2) this.i;
                final nx2 nx2VarJ3 = zt0.J(th, ((nl2) ei2Var.m.d()).l);
                q73 q73Var = (q73) this.k;
                synchronized (q73Var) {
                    try {
                        q73Var.i = null;
                        ((vm2) ei2Var.i.d()).d0(nx2VarJ3);
                        if (((Boolean) tw1Var2.c.a(mz1.Q8)).booleanValue()) {
                            final int i = 0;
                            q73Var.b.execute(new Runnable(this) { // from class: p73
                                public final /* synthetic */ g4 g;

                                {
                                    this.g = this;
                                }

                                @Override // java.lang.Runnable
                                public final /* synthetic */ void run() {
                                    switch (i) {
                                        case 0:
                                            ((q73) this.g.k).d.d0(nx2VarJ3);
                                            break;
                                        default:
                                            ((q73) this.g.k).e.d0(nx2VarJ3);
                                            break;
                                    }
                                }
                            });
                            final int i2 = 1;
                            q73Var.b.execute(new Runnable(this) { // from class: p73
                                public final /* synthetic */ g4 g;

                                {
                                    this.g = this;
                                }

                                @Override // java.lang.Runnable
                                public final /* synthetic */ void run() {
                                    switch (i2) {
                                        case 0:
                                            ((q73) this.g.k).d.d0(nx2VarJ3);
                                            break;
                                        default:
                                            ((q73) this.g.k).e.d0(nx2VarJ3);
                                            break;
                                    }
                                }
                            });
                        }
                        yc0.p(nx2VarJ3.f, th, "InterstitialAdLoader.onFailure");
                        ((y23) this.g).mo8a();
                        if (!((Boolean) n02.c.w()).booleanValue() || (da3Var3 = (da3) this.j) == null) {
                            ea3 ea3Var3 = q73Var.g;
                            aa3 aa3Var5 = (aa3) this.h;
                            aa3Var5.k(nx2VarJ3);
                            aa3Var5.j(th);
                            aa3Var5.b(false);
                            ea3Var3.b(aa3Var5.n());
                        } else {
                            da3Var3.f(nx2VarJ3);
                            aa3 aa3Var6 = (aa3) this.h;
                            aa3Var6.j(th);
                            aa3Var6.b(false);
                            da3Var3.a(aa3Var6);
                            da3Var3.h();
                        }
                    } finally {
                    }
                }
                return;
            default:
                if (((Boolean) tw1.e.c.a(mz1.h6)).booleanValue()) {
                    gi2.R();
                }
                v73 v73Var = (v73) this.k;
                ji2 ji2Var = (ji2) v73Var.e.l();
                nx2 nx2VarJ4 = ji2Var == null ? zt0.J(th, null) : zt0.J(th, ji2Var.a().l);
                synchronized (v73Var) {
                    try {
                        if (ji2Var != null) {
                            ((vm2) ji2Var.m.d()).d0(nx2VarJ4);
                            v73Var.b.execute(new sz2(this, nx2VarJ4, 7));
                        } else {
                            v73Var.d.d0(nx2VarJ4);
                            v73Var.b((u73) this.i).b().a().f.p();
                        }
                        yc0.p(nx2VarJ4.f, th, "RewardedAdLoader.onFailure");
                        ((y23) this.g).mo8a();
                        if (!((Boolean) n02.c.w()).booleanValue() || (da3Var4 = (da3) this.j) == null) {
                            ea3 ea3Var4 = v73Var.g;
                            aa3 aa3Var7 = (aa3) this.h;
                            aa3Var7.k(nx2VarJ4);
                            aa3Var7.j(th);
                            aa3Var7.b(false);
                            ea3Var4.b(aa3Var7.n());
                        } else {
                            da3Var4.f(nx2VarJ4);
                            aa3 aa3Var8 = (aa3) this.h;
                            aa3Var8.j(th);
                            aa3Var8.b(false);
                            da3Var4.a(aa3Var8);
                            da3Var4.h();
                        }
                    } finally {
                    }
                }
                return;
        }
    }

    public String toString() {
        switch (this.f) {
            case 3:
                List list = (List) this.i;
                StringBuilder sb = new StringBuilder();
                sb.append("FontRequest {mProviderAuthority: " + ((String) this.g) + ", mProviderPackage: " + ((String) this.j) + ", mQuery: " + ((String) this.h) + ", mCertificates:");
                for (int i = 0; i < list.size(); i++) {
                    sb.append(" [");
                    List list2 = (List) list.get(i);
                    for (int i2 = 0; i2 < list2.size(); i2++) {
                        sb.append(" \"");
                        sb.append(Base64.encodeToString((byte[]) list2.get(i2), 0));
                        sb.append("\"");
                    }
                    sb.append(" ]");
                }
                sb.append("}mCertificatesArray: 0");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ g4(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f = i;
        this.g = obj;
        this.j = obj2;
        this.h = obj3;
        this.i = obj4;
        this.k = obj5;
    }

    public /* synthetic */ g4(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, boolean z) {
        this.f = i;
        this.g = obj2;
        this.j = obj3;
        this.h = obj4;
        this.i = obj5;
        this.k = obj;
    }

    public g4(fv1 fv1Var, File file, File file2, File file3) {
        this.f = 18;
        this.g = fv1Var;
        this.j = file;
        this.h = file3;
        this.i = file2;
    }

    public g4(Context context, String str, String str2) throws PackageManager.NameNotFoundException {
        this.f = 17;
        this.j = str;
        this.h = str2;
        HandlerThread handlerThread = new HandlerThread("GassClient");
        this.k = handlerThread;
        handlerThread.start();
        vd3 vd3Var = new vd3(context, handlerThread.getLooper(), this, this, 9200000);
        this.g = vd3Var;
        this.i = new LinkedBlockingQueue();
        vd3Var.n();
    }

    public g4(Context context, jg2 jg2Var, jg2 jg2Var2, mv2 mv2Var) {
        this.f = 9;
        this.g = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.h = jg2Var;
        this.j = jg2Var2;
        this.k = null;
        this.i = mv2Var;
    }

    public g4(gl1 gl1Var, HashMap map, HashMap map2, HashMap map3) {
        this.f = 6;
        this.g = gl1Var;
        this.i = map2;
        this.k = map3;
        this.h = Collections.unmodifiableMap(map);
        TreeSet treeSet = new TreeSet();
        int i = 0;
        gl1Var.f(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        this.j = jArr;
    }

    public g4(f32 f32Var) {
        b22 a22Var;
        this.f = 7;
        this.j = new ArrayList();
        this.i = new j51();
        this.k = new ArrayList();
        this.g = f32Var;
        c22 c22Var = null;
        try {
            List listC = f32Var.c();
            if (listC != null) {
                for (Object obj : listC) {
                    if (obj instanceof IBinder) {
                        IBinder iBinder = (IBinder) obj;
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                        a22Var = iInterfaceQueryLocalInterface instanceof b22 ? (b22) iInterfaceQueryLocalInterface : new a22(iBinder);
                    } else {
                        a22Var = null;
                    }
                    if (a22Var != null) {
                        ((ArrayList) this.j).add(new c22(a22Var));
                    }
                }
            }
        } catch (RemoteException e) {
            gi2.c0("", e);
        }
        try {
            List listX = ((f32) this.g).X();
            if (listX != null) {
                for (Object obj2 : listX) {
                    nq2 nq2VarB3 = obj2 instanceof IBinder ? c63.B3((IBinder) obj2) : null;
                    if (nq2VarB3 != null) {
                        ((ArrayList) this.k).add(new zs3(nq2VarB3));
                    }
                }
            }
        } catch (RemoteException e2) {
            gi2.c0("", e2);
        }
        try {
            b22 b22VarF = ((f32) this.g).f();
            if (b22VarF != null) {
                c22Var = new c22(b22VarF);
            }
        } catch (RemoteException e3) {
            gi2.c0("", e3);
        }
        this.h = c22Var;
        try {
            if (((f32) this.g).m() != null) {
                new ih(((f32) this.g).m());
            }
        } catch (RemoteException e4) {
            gi2.c0("", e4);
        }
    }

    private final void j() {
    }

    @Override // defpackage.ch3
    public void h() {
    }

    public g4(b4 b4Var, c4 c4Var, c4 c4Var2, c4 c4Var3, c4 c4Var4) {
        this.f = 1;
        this.g = b4Var;
        this.h = c4Var;
        this.i = c4Var2;
        this.j = c4Var3;
        this.k = c4Var4;
    }

    public g4(Map map) {
        this.f = 4;
        i30.m(map, "initialState");
        this.g = new LinkedHashMap(map);
        this.j = new LinkedHashMap();
        this.h = new LinkedHashMap();
        this.i = new LinkedHashMap();
        this.k = new pw(1, this);
    }

    public g4(Drawable.Callback callback) {
        this.f = 2;
        this.g = new of0();
        this.j = new HashMap();
        this.h = new HashMap();
        this.k = ".ttf";
        if (!(callback instanceof View)) {
            j80.b("LottieDrawable must be inside of a view for images to work.");
            this.i = null;
        } else {
            this.i = ((View) callback).getContext().getAssets();
        }
    }

    public g4(String str, String str2, String str3, List list) {
        this.f = 3;
        str.getClass();
        this.g = str;
        str2.getClass();
        this.j = str2;
        this.h = str3;
        list.getClass();
        this.i = list;
        this.k = str + "-" + str2 + "-" + str3;
    }
}
