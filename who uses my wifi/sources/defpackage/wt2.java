package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class wt2 implements iq3, ig0, kx3, ws2 {
    public static wt2 i;
    public final /* synthetic */ int f;
    public Object g;
    public Object h;

    public /* synthetic */ wt2(Object obj, Object obj2, int i2) {
        this.f = i2;
        this.h = obj;
        this.g = obj2;
    }

    @Override // defpackage.eu2
    /* renamed from: a */
    public Object mo18a() {
        return new yb4((Application) ((ax0) this.g).f, (wl1) ((ls2) this.h).mo18a());
    }

    @Override // defpackage.kx3
    public byte[] b(int i2, byte[] bArr) throws IllegalStateException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        if (i2 > 16) {
            throw new InvalidAlgorithmParameterException("outputLength must not be larger than 16");
        }
        Provider provider = (Provider) this.h;
        SecretKeySpec secretKeySpec = (SecretKeySpec) this.g;
        Mac mac = Mac.getInstance("AESCMAC", provider);
        mac.init(secretKeySpec);
        byte[] bArrDoFinal = mac.doFinal(bArr);
        return i2 == bArrDoFinal.length ? bArrDoFinal : Arrays.copyOf(bArrDoFinal, i2);
    }

    @Override // defpackage.ig0
    public /* synthetic */ void c(r82 r82Var) {
        ((ex2) this.h).B3(r82Var, (String) this.g);
    }

    public void d(int i2) {
        LoudnessCodecController loudnessCodecController = (LoudnessCodecController) this.h;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.h = null;
        }
        LoudnessCodecController loudnessCodecControllerCreate = LoudnessCodecController.create(i2, dq3.f, new yf4());
        this.h = loudnessCodecControllerCreate;
        Iterator it = ((HashSet) this.g).iterator();
        while (it.hasNext()) {
            if (!loudnessCodecControllerCreate.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }

    public void e(o93 o93Var) {
        xs1 xs1Var = new xs1(6, (cz2) this.g);
        ld2 ld2Var = (ld2) ((pq3) this.h);
        n70 n70VarC = ld2Var.c(xs1Var);
        n70VarC.c(new jq3(n70VarC, new f23(this, o93Var, 24), 0), ld2Var);
    }

    public void f(ga4 ga4Var) {
        ((List) this.g).add(ga4Var);
    }

    public void h(Object obj, String str) throws IOException {
        boolean zCommit;
        String str2 = (String) this.g;
        SharedPreferences sharedPreferences = (SharedPreferences) this.h;
        if (obj instanceof String) {
            zCommit = sharedPreferences.edit().putString(str, (String) obj).commit();
        } else if (obj instanceof Long) {
            zCommit = sharedPreferences.edit().putLong(str, ((Long) obj).longValue()).commit();
        } else if (obj instanceof Boolean) {
            zCommit = sharedPreferences.edit().putBoolean(str, ((Boolean) obj).booleanValue()).commit();
        } else {
            if (!(obj instanceof Integer)) {
                String strValueOf = String.valueOf(obj.getClass());
                Log.e("GpidLifecycleSPHandler", ex0.m(new StringBuilder(strValueOf.length() + 33 + String.valueOf(str2).length()), "Unexpected object class ", strValueOf, " for app ", str2));
                throw new IOException(ex0.m(new StringBuilder(str.length() + 25 + String.valueOf(str2).length()), "Failed to store ", str, " for app ", str2));
            }
            zCommit = sharedPreferences.edit().putInt(str, ((Integer) obj).intValue()).commit();
        }
        if (zCommit) {
            return;
        }
        throw new IOException(ex0.m(new StringBuilder(str.length() + 25 + String.valueOf(str2).length()), "Failed to store ", str, " for app ", str2));
    }

    public void i(ga4 ga4Var) {
        ((List) this.h).add(ga4Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.ArrayList] */
    public h2 j(i5 i5Var, fr frVar) throws PackageManager.NameNotFoundException, ah3 {
        Bundle bundle;
        String string;
        Collection collection;
        PackageInfo packageInfo;
        frVar.getClass();
        Application application = (Application) this.g;
        kj1 kj1VarD = new vq2(application, 5).d();
        h2 h2Var = new h2();
        h2Var.e = Collections.EMPTY_MAP;
        h2Var.i = Collections.EMPTY_LIST;
        if (TextUtils.isEmpty(null)) {
            try {
                bundle = application.getPackageManager().getApplicationInfo(application.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                bundle = null;
            }
            string = bundle != null ? bundle.getString("com.google.android.gms.ads.APPLICATION_ID") : null;
            if (TextUtils.isEmpty(string)) {
                throw new ah3("The UMP SDK requires a valid application ID in your AndroidManifest.xml through a com.google.android.gms.ads.APPLICATION_ID meta-data tag.\nExample AndroidManifest:\n    <meta-data\n        android:name=\"com.google.android.gms.ads.APPLICATION_ID\"\n        android:value=\"ca-app-pub-0000000000000000~0000000000\">", 3);
            }
        } else {
            string = null;
        }
        h2Var.a = string;
        if (kj1VarD.g) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(qe2.f);
            collection = arrayList;
        } else {
            collection = Collections.EMPTY_LIST;
        }
        h2Var.i = collection;
        h2Var.e = ((mo1) this.h).a();
        h2Var.d = Boolean.FALSE;
        h2Var.c = Locale.getDefault().toLanguageTag();
        so1 so1Var = new so1();
        so1Var.f = 1;
        int i2 = Build.VERSION.SDK_INT;
        so1Var.h = Integer.valueOf(i2);
        so1Var.g = Build.MODEL;
        so1Var.f = 2;
        h2Var.b = so1Var;
        Configuration configuration = application.getResources().getConfiguration();
        application.getResources().getConfiguration();
        p21 p21Var = new p21();
        Object arrayList2 = Collections.EMPTY_LIST;
        p21Var.i = arrayList2;
        p21Var.f = Integer.valueOf(configuration.screenWidthDp);
        p21Var.g = Integer.valueOf(configuration.screenHeightDp);
        p21Var.h = Double.valueOf(application.getResources().getDisplayMetrics().density);
        if (i2 >= 28) {
            Window window = i5Var.getWindow();
            View decorView = window == null ? null : window.getDecorView();
            WindowInsets rootWindowInsets = decorView == null ? null : decorView.getRootWindowInsets();
            DisplayCutout displayCutout = rootWindowInsets == null ? null : rootWindowInsets.getDisplayCutout();
            if (displayCutout != null) {
                displayCutout.getSafeInsetBottom();
                arrayList2 = new ArrayList();
                for (Rect rect : displayCutout.getBoundingRects()) {
                    if (rect != null) {
                        rf2 rf2Var = new rf2();
                        rf2Var.b = Integer.valueOf(rect.left);
                        rf2Var.c = Integer.valueOf(rect.right);
                        rf2Var.a = Integer.valueOf(rect.top);
                        rf2Var.d = Integer.valueOf(rect.bottom);
                        arrayList2.add(rf2Var);
                    }
                }
            }
        }
        p21Var.i = arrayList2;
        h2Var.f = p21Var;
        try {
            packageInfo = application.getPackageManager().getPackageInfo(application.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException unused2) {
            packageInfo = null;
        }
        t83 t83Var = new t83(18, false);
        t83Var.g = application.getPackageName();
        CharSequence applicationLabel = application.getPackageManager().getApplicationLabel(application.getApplicationInfo());
        t83Var.h = applicationLabel != null ? applicationLabel.toString() : null;
        if (packageInfo != null) {
            t83Var.i = Long.toString(Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode);
        }
        h2Var.g = t83Var;
        h2Var.h = new qd2(4);
        return h2Var;
    }

    public ha4 k() {
        return new ha4((List) this.g, (List) this.h);
    }

    public void l(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (!((HashSet) this.g).remove(mediaCodec) || (loudnessCodecController = (LoudnessCodecController) this.h) == null) {
            return;
        }
        loudnessCodecController.removeMediaCodec(mediaCodec);
    }

    public void m(String str) throws IOException {
        if (((SharedPreferences) this.h).edit().remove(str).commit()) {
            return;
        }
        String str2 = (String) this.g;
        throw new IOException(ex0.m(new StringBuilder(str.length() + 26 + String.valueOf(str2).length()), "Failed to remove ", str, " for app ", str2));
    }

    public void n(np2 np2Var) {
        Iterator it = ((CopyOnWriteArrayList) this.h).iterator();
        while (it.hasNext()) {
            mh4 mh4Var = (mh4) it.next();
            Object obj = mh4Var.b;
            Handler handler = mh4Var.a;
            ve4 ve4Var = new ve4(np2Var, obj, 2);
            String str = v23.a;
            Looper looper = handler.getLooper();
            if (looper.getThread().isAlive()) {
                if (looper == Looper.myLooper()) {
                    ve4Var.run();
                } else {
                    handler.post(ve4Var);
                }
            }
        }
    }

    @Override // defpackage.iq3
    public void p(Object obj) {
        switch (this.f) {
            case 0:
                ((ag2) obj).f1((String) this.g, (y32) this.h);
                break;
            default:
                ((u93) ((bu1) this.h).l).c.P1(new zs1(27, (q93) this.g));
                break;
        }
    }

    @Override // defpackage.iq3
    public void s(Throwable th) {
        switch (this.f) {
            case 0:
                break;
            default:
                ((u93) ((bu1) this.h).l).c.P1(new mr2((q93) this.g, th, 9, false));
                break;
        }
    }

    public /* synthetic */ wt2(Object obj, Object obj2, int i2, boolean z) {
        this.f = i2;
        this.g = obj;
        this.h = obj2;
    }

    public wt2(int i2) {
        this.f = i2;
        switch (i2) {
            case 6:
                wt2 wt2Var = ou1.s;
                this.g = new jr3((jr3) wt2Var.g);
                this.h = Arrays.copyOf((long[]) wt2Var.h, 10);
                break;
            case 13:
                this.g = new HashSet();
                break;
        }
    }

    public wt2(int i2, int i3) {
        List arrayList;
        Object arrayList2;
        this.f = 8;
        if (i2 == 0) {
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList(i2);
        }
        this.g = arrayList;
        if (i3 == 0) {
            arrayList2 = Collections.EMPTY_LIST;
        } else {
            arrayList2 = new ArrayList(i3);
        }
        this.h = arrayList2;
    }

    public wt2(Context context, int i2) {
        this.f = i2;
        switch (i2) {
            case 12:
                this.g = context == null ? null : context.getApplicationContext();
                break;
            default:
                this.g = context.getPackageName();
                this.h = context.getSharedPreferences("paid_storage_sp", 0);
                break;
        }
    }

    public wt2(au2 au2Var, String str, y32 y32Var) {
        this.f = 0;
        this.g = str;
        this.h = y32Var;
        Objects.requireNonNull(au2Var);
    }

    public wt2(byte[] bArr, Provider provider) throws GeneralSecurityException {
        this.f = 7;
        if (yb.x(1)) {
            this.g = new SecretKeySpec(bArr, "AES");
            this.h = provider;
            return;
        }
        throw new GeneralSecurityException("Cannot use AES-CMAC in FIPS-mode, as BoringCrypto module is not available");
    }

    private final void g(Throwable th) {
    }
}
