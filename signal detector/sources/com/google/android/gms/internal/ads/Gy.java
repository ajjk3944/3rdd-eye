package com.google.android.gms.internal.ads;

import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Locale;

/* loaded from: classes.dex */
public final /* synthetic */ class Gy implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8487a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Hy f8488b;

    public /* synthetic */ Gy(Hy hy, int i) {
        this.f8487a = i;
        this.f8488b = hy;
    }

    private final void a() {
        int i;
        Hy hy = this.f8488b;
        if (!hy.f9033e || hy.f9039l.getAndSet(true)) {
            return;
        }
        Context context = hy.f9029a;
        String str = hy.f9037j;
        double d6 = hy.i;
        long j6 = hy.f9038k;
        Locale locale = Locale.getDefault();
        H5 h5A = I5.A();
        long j7 = Build.VERSION.SDK_INT;
        h5A.b();
        ((I5) h5A.f13551b).D(j7);
        String str2 = Build.MODEL;
        h5A.b();
        ((I5) h5A.f13551b).E(str2);
        String language = locale.getLanguage();
        h5A.b();
        ((I5) h5A.f13551b).F(language);
        String country = locale.getCountry();
        h5A.b();
        ((I5) h5A.f13551b).G(country);
        h5A.b();
        ((I5) h5A.f13551b).J(str);
        String packageName = context.getPackageName();
        h5A.b();
        ((I5) h5A.f13551b).H(packageName);
        h5A.b();
        ((I5) h5A.f13551b).M(j6);
        if (d6 > 0.0d) {
            h5A.b();
            ((I5) h5A.f13551b).L((int) (1.0d / d6));
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            long j8 = packageManager.getPackageInfo(context.getPackageName(), 0).versionCode;
            h5A.b();
            ((I5) h5A.f13551b).I(j8);
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
            h5A.b();
            ((I5) h5A.f13551b).N(i);
        } catch (RuntimeException unused2) {
        }
        I5 i52 = (I5) h5A.d();
        synchronized (hy.f9040m) {
            hy.f9043p.e(i52);
        }
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        H5 h52;
        LB lbM;
        String string;
        switch (this.f8487a) {
            case 0:
                a();
                return;
            default:
                Hy hy = this.f8488b;
                synchronized (hy.f9040m) {
                    H5 h53 = hy.f9043p;
                    AbstractC0987cL abstractC0987cL = (AbstractC0987cL) h53.f13550a.w(5, null);
                    abstractC0987cL.f13551b = h53.c();
                    h52 = (H5) abstractC0987cL;
                }
                synchronized (hy.f9041n) {
                    ArrayList arrayList = hy.f9044q;
                    lbM = LB.m(arrayList);
                    arrayList.clear();
                    hy.f9045r = false;
                }
                int size = lbM.size();
                int i = 0;
                int i3 = 0;
                while (i < size) {
                    Fy fy = (Fy) lbM.get(i);
                    if (i3 >= hy.f9035g) {
                        hy.c((I5) h52.d());
                        h52.b();
                        ((I5) h52.f13551b).C();
                        i3 = 0;
                    }
                    P5 p5A = Q5.A();
                    long j6 = fy.f8238a;
                    p5A.b();
                    ((Q5) p5A.f13551b).B(j6);
                    long j7 = fy.f8239b;
                    p5A.b();
                    ((Q5) p5A.f13551b).C(j7);
                    long j8 = fy.f8242e;
                    p5A.b();
                    ((Q5) p5A.f13551b).F(j8);
                    String str = fy.f8241d;
                    if (str != null) {
                        p5A.b();
                        ((Q5) p5A.f13551b).G(str);
                    }
                    Throwable th = fy.f8240c;
                    int i6 = th == null ? 2 : 3;
                    p5A.b();
                    ((Q5) p5A.f13551b).H(i6);
                    if (th != null) {
                        String name = th.getClass().getName();
                        p5A.b();
                        ((Q5) p5A.f13551b).D(name);
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
                        } catch (IOException unused) {
                            string = "";
                        }
                        p5A.b();
                        ((Q5) p5A.f13551b).E(string);
                    }
                    Q5 q52 = (Q5) p5A.d();
                    h52.b();
                    ((I5) h52.f13551b).B(q52);
                    i++;
                    i3++;
                }
                if (i3 > 0) {
                    hy.c((I5) h52.d());
                    h52.b();
                    ((I5) h52.f13551b).C();
                    return;
                }
                return;
        }
    }
}
