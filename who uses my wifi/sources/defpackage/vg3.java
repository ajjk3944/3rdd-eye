package defpackage;

import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Locale;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class vg3 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ wg3 g;

    public /* synthetic */ vg3(wg3 wg3Var, int i) {
        this.f = i;
        this.g = wg3Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        int i;
        rq1 rq1Var;
        xm3 xm3VarM;
        String string;
        switch (this.f) {
            case 0:
                wg3 wg3Var = this.g;
                if (!wg3Var.e || wg3Var.l.getAndSet(true)) {
                    return;
                }
                Context context = wg3Var.a;
                String str = wg3Var.j;
                double d = wg3Var.i;
                long j = wg3Var.k;
                Locale locale = Locale.getDefault();
                rq1 rq1VarA = sq1.A();
                long j2 = Build.VERSION.SDK_INT;
                rq1VarA.b();
                ((sq1) rq1VarA.g).D(j2);
                String str2 = Build.MODEL;
                rq1VarA.b();
                ((sq1) rq1VarA.g).E(str2);
                String language = locale.getLanguage();
                rq1VarA.b();
                ((sq1) rq1VarA.g).F(language);
                String country = locale.getCountry();
                rq1VarA.b();
                ((sq1) rq1VarA.g).G(country);
                rq1VarA.b();
                ((sq1) rq1VarA.g).J(str);
                String packageName = context.getPackageName();
                rq1VarA.b();
                ((sq1) rq1VarA.g).H(packageName);
                rq1VarA.b();
                ((sq1) rq1VarA.g).M(j);
                if (d > 0.0d) {
                    rq1VarA.b();
                    ((sq1) rq1VarA.g).L((int) (1.0d / d));
                }
                PackageManager packageManager = context.getPackageManager();
                try {
                    long j3 = packageManager.getPackageInfo(context.getPackageName(), 0).versionCode;
                    rq1VarA.b();
                    ((sq1) rq1VarA.g).I(j3);
                } catch (Exception unused) {
                }
                try {
                    if (packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                        i = 5;
                    } else if (packageManager.hasSystemFeature("android.hardware.type.watch")) {
                        i = 4;
                    } else if (packageManager.hasSystemFeature("android.hardware.type.pc")) {
                        i = 7;
                    } else {
                        UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
                        i = (uiModeManager == null || uiModeManager.getCurrentModeType() != 4) ? 2 : 6;
                    }
                    rq1VarA.b();
                    ((sq1) rq1VarA.g).N(i);
                } catch (RuntimeException unused2) {
                }
                sq1 sq1Var = (sq1) rq1VarA.d();
                synchronized (wg3Var.m) {
                    wg3Var.p.e(sq1Var);
                }
                return;
            default:
                wg3 wg3Var2 = this.g;
                synchronized (wg3Var2.m) {
                    rq1 rq1Var2 = wg3Var2.p;
                    n54 n54Var = (n54) rq1Var2.f.w(5, null);
                    n54Var.g = rq1Var2.c();
                    rq1Var = (rq1) n54Var;
                }
                synchronized (wg3Var2.n) {
                    ArrayList arrayList = wg3Var2.q;
                    xm3VarM = xm3.m(arrayList);
                    arrayList.clear();
                    wg3Var2.r = false;
                }
                int size = xm3VarM.size();
                int i2 = 0;
                int i3 = 0;
                while (i2 < size) {
                    ug3 ug3Var = (ug3) xm3VarM.get(i2);
                    if (i3 >= wg3Var2.g) {
                        wg3Var2.c((sq1) rq1Var.d());
                        rq1Var.b();
                        ((sq1) rq1Var.g).C();
                        i3 = 0;
                    }
                    zq1 zq1VarA = ar1.A();
                    long j4 = ug3Var.a;
                    zq1VarA.b();
                    ((ar1) zq1VarA.g).B(j4);
                    long j5 = ug3Var.b;
                    zq1VarA.b();
                    ((ar1) zq1VarA.g).C(j5);
                    long j6 = ug3Var.e;
                    zq1VarA.b();
                    ((ar1) zq1VarA.g).F(j6);
                    String str3 = ug3Var.d;
                    if (str3 != null) {
                        zq1VarA.b();
                        ((ar1) zq1VarA.g).G(str3);
                    }
                    Throwable th = ug3Var.c;
                    int i4 = th == null ? 2 : 3;
                    zq1VarA.b();
                    ((ar1) zq1VarA.g).H(i4);
                    if (th != null) {
                        String name = th.getClass().getName();
                        zq1VarA.b();
                        ((ar1) zq1VarA.g).D(name);
                        try {
                            StringWriter stringWriter = new StringWriter();
                            try {
                                PrintWriter printWriter = new PrintWriter(stringWriter);
                                try {
                                    th.printStackTrace(printWriter);
                                    string = stringWriter.toString();
                                    printWriter.close();
                                    stringWriter.close();
                                } catch (Throwable th2) {
                                    try {
                                        printWriter.close();
                                    } catch (Throwable th3) {
                                        th2.addSuppressed(th3);
                                    }
                                    throw th2;
                                    break;
                                }
                            } finally {
                            }
                        } catch (IOException unused3) {
                            string = "";
                        }
                        zq1VarA.b();
                        ((ar1) zq1VarA.g).E(string);
                    }
                    ar1 ar1Var = (ar1) zq1VarA.d();
                    rq1Var.b();
                    ((sq1) rq1Var.g).B(ar1Var);
                    i2++;
                    i3++;
                }
                if (i3 > 0) {
                    wg3Var2.c((sq1) rq1Var.d());
                    rq1Var.b();
                    ((sq1) rq1Var.g).C();
                    return;
                }
                return;
        }
    }
}
