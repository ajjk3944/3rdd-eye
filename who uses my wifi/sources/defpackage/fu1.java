package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.widget.ImageView;
import androidx.webkit.ProfileStore;
import dalvik.system.DexClassLoader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class fu1 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ fu1(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    private final void a() {
        xj2 xj2Var = ((pj2) this.g).g.d;
        synchronized (xj2Var) {
            xj2Var.a();
            xj2Var.n = true;
        }
    }

    private final /* synthetic */ void b() {
        fm2 fm2Var = (fm2) this.g;
        synchronized (fm2Var) {
            try {
                wq3 wq3Var = fm2Var.k;
                if (wq3Var.isDone()) {
                    return;
                }
                wq3Var.d(Boolean.TRUE);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final /* synthetic */ void c() {
        im2 im2Var = (im2) this.g;
        synchronized (im2Var.f) {
            try {
                if (im2Var.n) {
                    return;
                }
                im2Var.n = true;
                im2Var.a();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void d() {
        an2 an2Var = (an2) this.g;
        synchronized (an2Var) {
            gi2.Z("Timeout waiting for show call succeed to be called.");
            an2Var.R(new pq2("Timeout for show call succeed."));
            an2Var.k = true;
        }
    }

    @Override // java.lang.Runnable
    public final void run() throws JSONException, InterruptedException {
        LinkedHashMap linkedHashMap;
        String strA;
        mv2 mv2Var;
        tw1 tw1Var;
        long jLongValue;
        long jIntValue;
        boolean zBooleanValue;
        tw1 tw1Var2;
        long j;
        long j2;
        long j3;
        ProfileStore profileStore;
        ProfileStore profileStore2 = null;
        int i = 1;
        switch (this.f) {
            case 0:
                gu1 gu1Var = (gu1) this.g;
                gu1Var.getClass();
                try {
                    jt1 jt1Var = gu1Var.a;
                    DexClassLoader dexClassLoader = jt1Var.c;
                    byte[] bArr = jt1Var.e;
                    String str = gu1Var.b;
                    jt1Var.d.getClass();
                    Class<?> clsLoadClass = dexClassLoader.loadClass(new String(fr.p(str, bArr), "UTF-8"));
                    if (clsLoadClass != null) {
                        byte[] bArr2 = jt1Var.e;
                        String str2 = gu1Var.c;
                        gu1Var.a.d.getClass();
                        gu1Var.d = clsLoadClass.getMethod(new String(fr.p(str2, bArr2), "UTF-8"), gu1Var.e);
                    }
                } catch (at1 | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException unused) {
                } catch (Throwable th) {
                    gu1Var.f.countDown();
                    throw th;
                }
                gu1Var.f.countDown();
                return;
            case 1:
                ((pv1) this.g).d(3);
                return;
            case 2:
                vv1 vv1Var = (vv1) this.g;
                synchronized (vv1Var.h) {
                    if (vv1Var.i.get() && vv1Var.j) {
                        vv1Var.i.set(false);
                        gi2.U("App went background");
                        ArrayList arrayList = vv1Var.k;
                        int size = arrayList.size();
                        int i2 = 0;
                        while (i2 < size) {
                            Object obj = arrayList.get(i2);
                            i2++;
                            try {
                                ((wv1) obj).T(false);
                            } catch (Exception e) {
                                gi2.c0("", e);
                            }
                        }
                    } else {
                        gi2.U("App is still foreground");
                    }
                }
                return;
            case 3:
                ((bu1) this.g).y();
                return;
            case 4:
                so1 so1Var = (so1) this.g;
                synchronized (so1Var) {
                    try {
                        wy0 wy0Var = (wy0) so1Var.h;
                        if (wy0Var.f) {
                            lv1 lv1Var = (lv1) wy0Var.g;
                            byte[] bArr3 = (byte[]) so1Var.g;
                            jv1 jv1Var = (jv1) lv1Var;
                            Parcel parcelU = jv1Var.U();
                            parcelU.writeByteArray(bArr3);
                            jv1Var.M0(parcelU, 5);
                            jv1 jv1Var2 = (jv1) ((lv1) wy0Var.g);
                            Parcel parcelU2 = jv1Var2.U();
                            parcelU2.writeInt(0);
                            jv1Var2.M0(parcelU2, 6);
                            lv1 lv1Var2 = (lv1) wy0Var.g;
                            int i3 = so1Var.f;
                            jv1 jv1Var3 = (jv1) lv1Var2;
                            Parcel parcelU3 = jv1Var3.U();
                            parcelU3.writeInt(i3);
                            jv1Var3.M0(parcelU3, 7);
                            jv1 jv1Var4 = (jv1) ((lv1) wy0Var.g);
                            Parcel parcelU4 = jv1Var4.U();
                            parcelU4.writeIntArray(null);
                            jv1Var4.M0(parcelU4, 4);
                            jv1 jv1Var5 = (jv1) ((lv1) wy0Var.g);
                            jv1Var5.M0(jv1Var5.U(), 3);
                        }
                    } catch (RemoteException unused2) {
                        gi2.q0(3);
                        return;
                    }
                }
                return;
            case 5:
                h2 h2Var = (h2) this.g;
                h2Var.getClass();
                while (true) {
                    try {
                        tz1 tz1Var = (tz1) ((ArrayBlockingQueue) h2Var.a).take();
                        sz1 sz1VarB = tz1Var.b();
                        if (!TextUtils.isEmpty(sz1VarB.f)) {
                            LinkedHashMap linkedHashMap2 = (LinkedHashMap) h2Var.b;
                            synchronized (tz1Var.c) {
                                hg4.C.h.a();
                                linkedHashMap = tz1Var.b;
                            }
                            h2Var.r(h2Var.p(linkedHashMap2, linkedHashMap), sz1VarB);
                        }
                    } catch (InterruptedException unused3) {
                        gi2.q0(5);
                        return;
                    }
                }
            case 6:
                xz1 xz1Var = (xz1) this.g;
                Context context = xz1Var.c;
                if (xz1Var.f != null || context == null || (strA = sl.a(context)) == null || strA.equals(context.getPackageName())) {
                    return;
                }
                xz1Var.a = context.getApplicationContext();
                Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
                if (!TextUtils.isEmpty(strA)) {
                    intent.setPackage(strA);
                }
                context.bindService(intent, xz1Var, 33);
                return;
            case 7:
                ((b02) this.g).d();
                return;
            case 8:
                ((z42) this.g).a();
                return;
            case 9:
                ij ijVar = (ij) this.g;
                if (((vw1) ijVar.f) == null) {
                    return;
                }
                ((vw1) ijVar.f).k();
                Binder.flushPendingCommands();
                return;
            case 10:
                ((AtomicBoolean) this.g).getAndSet(true);
                return;
            case 11:
                jd2 jd2Var = (jd2) this.g;
                while (jd2Var.d.get()) {
                    AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                    lf4.l.post(new fu1(10, atomicBoolean));
                    try {
                        Thread.sleep(jd2Var.e);
                        if (!atomicBoolean.get()) {
                            if (((Boolean) tw1.e.c.a(mz1.ve)).booleanValue() && (mv2Var = jd2Var.b) != null) {
                                lv2 lv2VarA = mv2Var.a();
                                lv2VarA.k("action", "paa");
                                lv2VarA.o();
                            }
                        }
                        do {
                            try {
                                Thread.sleep(jd2Var.f);
                            } catch (InterruptedException unused4) {
                                Thread.currentThread().interrupt();
                            }
                        } while (!atomicBoolean.get());
                    } catch (InterruptedException unused5) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                }
                return;
            case 12:
                ((ae2) this.g).g();
                return;
            case 13:
                ee2 ee2Var = (ee2) ((zd2) this.g);
                boolean z = ee2Var.m;
                ImageView imageView = ee2Var.v;
                if (z && imageView.getParent() != null) {
                    ee2Var.g.removeView(imageView);
                }
                ae2 ae2Var = ee2Var.l;
                if (ae2Var == null || ee2Var.u == null) {
                    return;
                }
                hg4 hg4Var = hg4.C;
                hg4Var.k.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                if (ae2Var.getBitmap(ee2Var.u) != null) {
                    ee2Var.w = true;
                }
                hg4Var.k.getClass();
                long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                if (gi2.R()) {
                    StringBuilder sb = new StringBuilder(String.valueOf(jElapsedRealtime2).length() + 26);
                    sb.append("Spinner frame grab took ");
                    sb.append(jElapsedRealtime2);
                    sb.append("ms");
                    gi2.G(sb.toString());
                }
                if (jElapsedRealtime2 > ee2Var.k) {
                    gi2.i0("Spinner frame grab crossed jank threshold! Suspending spinner.");
                    ee2Var.p = false;
                    ee2Var.u = null;
                    tz1 tz1Var2 = ee2Var.i;
                    if (tz1Var2 != null) {
                        tz1Var2.c("spinner_jank", Long.toString(jElapsedRealtime2));
                        return;
                    }
                    return;
                }
                return;
            case 14:
                hg4.C.A.f.remove((we2) this.g);
                return;
            case 15:
                jf2 jf2Var = (jf2) this.g;
                String strO = jf2.o(jf2Var.j);
                try {
                    iz1 iz1Var = mz1.J;
                    tw1Var = tw1.e;
                    jLongValue = ((Long) tw1Var.c.a(iz1Var)).longValue() * 1000;
                    jIntValue = ((Integer) tw1Var.c.a(mz1.v)).intValue();
                    zBooleanValue = ((Boolean) tw1Var.c.a(mz1.Y1)).booleanValue();
                } catch (Exception e2) {
                    String str3 = jf2Var.j;
                    String message = e2.getMessage();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 34 + String.valueOf(message).length());
                    sb2.append("Failed to preload url ");
                    sb2.append(str3);
                    sb2.append(" Exception: ");
                    sb2.append(message);
                    gi2.i0(sb2.toString());
                    hg4.C.h.e("VideoStreamExoPlayerCache.preload", e2);
                    jf2Var.a();
                    jf2Var.m(jf2Var.j, strO, "error", jf2.p("error", e2));
                }
                synchronized (jf2Var) {
                    hg4.C.k.getClass();
                    if (System.currentTimeMillis() - jf2Var.n > jLongValue) {
                        StringBuilder sb3 = new StringBuilder(String.valueOf(jLongValue).length() + 27);
                        sb3.append("Timeout reached. Limit: ");
                        sb3.append(jLongValue);
                        sb3.append(" ms");
                        throw new IOException(sb3.toString());
                    }
                    if (jf2Var.k) {
                        throw new IOException("Abort requested before buffering finished. ");
                    }
                    if (!jf2Var.l) {
                        mc4 mc4Var = jf2Var.i.l;
                        if (!(mc4Var != null)) {
                            throw new IOException("ExoPlayer was released during preloading.");
                        }
                        long jU1 = mc4Var.U1();
                        if (jU1 > 0) {
                            long jV1 = jf2Var.i.l.V1();
                            if (jV1 != jf2Var.o) {
                                boolean z2 = jV1 > 0;
                                String str4 = jf2Var.j;
                                if (zBooleanValue) {
                                    sf2 sf2Var = jf2Var.i;
                                    j3 = (sf2Var.x == null || !sf2Var.x.u) ? sf2Var.p : 0L;
                                } else {
                                    j3 = -1;
                                }
                                long jQ = zBooleanValue ? jf2Var.i.q() : -1L;
                                long jR = zBooleanValue ? jf2Var.i.r() : -1L;
                                int i4 = sf2.z.get();
                                int i5 = sf2.A.get();
                                wc1 wc1Var = j63.b;
                                tw1Var2 = tw1Var;
                                j = jIntValue;
                                ze2 ze2Var = new ze2(jf2Var, str4, strO, jV1, jU1, j3, jQ, jR, z2, i4, i5);
                                j2 = jV1;
                                jU1 = jU1;
                                wc1Var.post(ze2Var);
                                jf2Var.o = j2;
                            } else {
                                tw1Var2 = tw1Var;
                                j = jIntValue;
                                j2 = jV1;
                            }
                            if (j2 >= jU1) {
                                j63.b.post(new ef2(jf2Var, jf2Var.j, strO, jU1));
                            } else if (jf2Var.i.p >= j && j2 > 0) {
                            }
                        } else {
                            tw1Var2 = tw1Var;
                        }
                        lf4.l.postDelayed(new fu1(15, jf2Var), ((Long) tw1Var2.c.a(mz1.K)).longValue());
                        return;
                    }
                    hg4.C.A.f.remove(jf2Var.m);
                    return;
                }
            case 16:
                jg2 jg2Var = ((sg2) this.g).f;
                n5 n5Var = jg2Var.f.U;
                n5Var.e = true;
                if (n5Var.d) {
                    n5Var.d();
                }
                jh1 jh1VarZ0 = jg2Var.f.z0();
                if (jh1VarZ0 != null) {
                    jh1VarZ0.q.removeView(jh1VarZ0.k);
                    jh1VarZ0.G3(true);
                    return;
                }
                return;
            case 17:
                int i6 = sg2.M;
                h2 h2VarA = hg4.C.h.a();
                String str5 = (String) this.g;
                if (((HashSet) h2VarA.g).contains(str5)) {
                    return;
                }
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                linkedHashMap3.put("sdkVersion", (String) h2VarA.f);
                linkedHashMap3.put("ue", str5);
                h2VarA.r(h2VarA.p((LinkedHashMap) h2VarA.b, linkedHashMap3), null);
                return;
            case 18:
                su2 su2Var = hg4.C.x;
                xb3 xb3Var = ((xz2) this.g).a;
                su2Var.getClass();
                su2.t(new qz2(xb3Var, i));
                return;
            case 19:
                ah2 ah2Var = (ah2) this.g;
                mv2 mv2Var2 = ah2Var.b;
                hg4.C.k.getClass();
                long jElapsedRealtime3 = SystemClock.elapsedRealtime();
                wg2 wg2Var = ah2Var.a;
                wg2Var.getClass();
                if (!ob1.n("MULTI_PROFILE")) {
                    gi2.U("WebViewFeature.MULTI_PROFILE is not supported");
                    return;
                }
                try {
                    profileStore = (ProfileStore) ProfileStore.class.getDeclaredMethod("getInstance", null).invoke(null, null);
                } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalStateException | NoSuchMethodException | InvocationTargetException e3) {
                    gi2.U("Unable to get ProfileStore instance: ".concat(String.valueOf(e3.getMessage())));
                    try {
                        profileStore = (ProfileStore) Class.forName("androidx.webkit.ProfileStore$-CC").getDeclaredMethod("getInstance", null).invoke(null, null);
                    } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalStateException | NoSuchMethodException | InvocationTargetException e4) {
                        gi2.U("Unable to get ProfileStore instance: ".concat(String.valueOf(e4.getMessage())));
                    }
                }
                profileStore2 = profileStore;
                if (profileStore2 == null) {
                    gi2.i0("WebViewCompat failure: No instance");
                    if (((Boolean) tw1.e.c.a(mz1.Be)).booleanValue()) {
                        lv2 lv2VarA2 = mv2Var2.a();
                        lv2VarA2.k("action", "webview_p_f");
                        lv2VarA2.k("webview_p_f", "No instance");
                        lv2VarA2.m();
                        return;
                    }
                    return;
                }
                wg2Var.a = profileStore2.getOrCreateProfile("GMA_WEBVIEW_PROFILE");
                if (((Boolean) tw1.e.c.a(mz1.Be)).booleanValue()) {
                    hg4.C.k.getClass();
                    long jElapsedRealtime4 = SystemClock.elapsedRealtime() - jElapsedRealtime3;
                    lv2 lv2VarA3 = mv2Var2.a();
                    lv2VarA3.k("action", "webview_p_l");
                    lv2VarA3.k("webview_p_l", Long.toString(jElapsedRealtime4));
                    lv2VarA3.m();
                    return;
                }
                return;
            case 20:
                ((ch2) this.g).a();
                return;
            case zy1.zzm /* 21 */:
                ((pj2) this.g).g.d.i();
                return;
            case 22:
                a();
                return;
            case 23:
                ik2 ik2Var = (ik2) this.g;
                x22 x22Var = ik2Var.q.d;
                if (x22Var == null) {
                    return;
                }
                try {
                    ba2 ba2Var = (ba2) ik2Var.s.d();
                    oi0 oi0Var = new oi0(ik2Var.l);
                    Parcel parcelU5 = x22Var.U();
                    iv1.e(parcelU5, ba2Var);
                    iv1.e(parcelU5, oi0Var);
                    x22Var.M0(parcelU5, 1);
                    return;
                } catch (RemoteException e5) {
                    gi2.c0("RemoteException when notifyAdLoad is called", e5);
                    return;
                }
            case 24:
                ((kl2) this.g).c = false;
                return;
            case 25:
                vl2 vl2Var = (vl2) this.g;
                i41.R(vl2Var.h);
                vl2Var.m = true;
                return;
            case 26:
                b();
                return;
            case 27:
                c();
                return;
            case 28:
                d();
                return;
            default:
                ((wr2) this.g).d();
                return;
        }
    }
}
