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

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class uy0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17384a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ vy0 f17385b;

    public /* synthetic */ uy0(vy0 vy0Var, int i4) {
        this.f17384a = i4;
        this.f17385b = vy0Var;
    }

    private final void a() {
        int i4;
        vy0 vy0Var = this.f17385b;
        if (!vy0Var.f17765e || vy0Var.f17770l.getAndSet(true)) {
            return;
        }
        Context context = vy0Var.f17761a;
        String str = vy0Var.j;
        double d10 = vy0Var.f17768i;
        long j = vy0Var.f17769k;
        Locale locale = Locale.getDefault();
        oc ocVarA = pc.A();
        long j8 = Build.VERSION.SDK_INT;
        ocVarA.b();
        ((pc) ocVarA.f14755b).D(j8);
        String str2 = Build.MODEL;
        ocVarA.b();
        ((pc) ocVarA.f14755b).E(str2);
        String language = locale.getLanguage();
        ocVarA.b();
        ((pc) ocVarA.f14755b).F(language);
        String country = locale.getCountry();
        ocVarA.b();
        ((pc) ocVarA.f14755b).G(country);
        ocVarA.b();
        ((pc) ocVarA.f14755b).J(str);
        String packageName = context.getPackageName();
        ocVarA.b();
        ((pc) ocVarA.f14755b).H(packageName);
        ocVarA.b();
        ((pc) ocVarA.f14755b).M(j);
        if (d10 > 0.0d) {
            ocVarA.b();
            ((pc) ocVarA.f14755b).L((int) (1.0d / d10));
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            long j9 = packageManager.getPackageInfo(context.getPackageName(), 0).versionCode;
            ocVarA.b();
            ((pc) ocVarA.f14755b).I(j9);
        } catch (Exception unused) {
        }
        try {
            if (packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                i4 = 5;
            } else if (packageManager.hasSystemFeature("android.hardware.type.watch")) {
                i4 = 4;
            } else if (packageManager.hasSystemFeature("android.hardware.type.pc")) {
                i4 = 7;
            } else {
                UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
                i4 = (uiModeManager == null || uiModeManager.getCurrentModeType() != 4) ? 2 : 6;
            }
            ocVarA.b();
            ((pc) ocVarA.f14755b).N(i4);
        } catch (RuntimeException unused2) {
        }
        pc pcVar = (pc) ocVarA.e();
        synchronized (vy0Var.f17771m) {
            vy0Var.f17774p.f(pcVar);
        }
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        oc ocVar;
        x41 x41VarQ;
        String string;
        switch (this.f17384a) {
            case 0:
                a();
                return;
            default:
                vy0 vy0Var = this.f17385b;
                synchronized (vy0Var.f17771m) {
                    oc ocVar2 = vy0Var.f17774p;
                    on1 on1Var = (on1) ocVar2.f14754a.w(5, null);
                    on1Var.f14755b = ocVar2.d();
                    ocVar = (oc) on1Var;
                }
                synchronized (vy0Var.f17772n) {
                    ArrayList arrayList = vy0Var.f17775q;
                    x41VarQ = x41.q(arrayList);
                    arrayList.clear();
                    vy0Var.f17776r = false;
                }
                int size = x41VarQ.size();
                int i4 = 0;
                int i10 = 0;
                while (i4 < size) {
                    ty0 ty0Var = (ty0) x41VarQ.get(i4);
                    if (i10 >= vy0Var.g) {
                        vy0Var.c((pc) ocVar.e());
                        ocVar.b();
                        ((pc) ocVar.f14755b).C();
                        i10 = 0;
                    }
                    wc wcVarA = xc.A();
                    long j = ty0Var.f16991a;
                    wcVarA.b();
                    ((xc) wcVarA.f14755b).B(j);
                    long j8 = ty0Var.f16992b;
                    wcVarA.b();
                    ((xc) wcVarA.f14755b).C(j8);
                    long j9 = ty0Var.f16995e;
                    wcVarA.b();
                    ((xc) wcVarA.f14755b).F(j9);
                    String str = ty0Var.f16994d;
                    if (str != null) {
                        wcVarA.b();
                        ((xc) wcVarA.f14755b).G(str);
                    }
                    Throwable th2 = ty0Var.f16993c;
                    int i11 = th2 == null ? 2 : 3;
                    wcVarA.b();
                    ((xc) wcVarA.f14755b).H(i11);
                    if (th2 != null) {
                        String name = th2.getClass().getName();
                        wcVarA.b();
                        ((xc) wcVarA.f14755b).D(name);
                        try {
                            StringWriter stringWriter = new StringWriter();
                            try {
                                PrintWriter printWriter = new PrintWriter(stringWriter);
                                try {
                                    th2.printStackTrace(printWriter);
                                    string = stringWriter.toString();
                                    printWriter.close();
                                    stringWriter.close();
                                } catch (Throwable th3) {
                                    try {
                                        printWriter.close();
                                    } catch (Throwable th4) {
                                        th3.addSuppressed(th4);
                                    }
                                    throw th3;
                                    break;
                                }
                            } finally {
                            }
                        } catch (IOException unused) {
                            string = "";
                        }
                        wcVarA.b();
                        ((xc) wcVarA.f14755b).E(string);
                    }
                    xc xcVar = (xc) wcVarA.e();
                    ocVar.b();
                    ((pc) ocVar.f14755b).B(xcVar);
                    i4++;
                    i10++;
                }
                if (i10 > 0) {
                    vy0Var.c((pc) ocVar.e());
                    ocVar.b();
                    ((pc) ocVar.f14755b).C();
                    return;
                }
                return;
        }
    }
}
