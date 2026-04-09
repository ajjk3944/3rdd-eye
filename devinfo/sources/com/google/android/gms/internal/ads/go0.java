package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class go0 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11567a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11568b;

    public /* synthetic */ go0(int i4, Object obj) {
        this.f11567a = i4;
        this.f11568b = obj;
    }

    private final /* synthetic */ Object a() {
        x11 x11Var = (x11) this.f11568b;
        hu huVar = new hu(14, x11Var);
        synchronized (x11Var) {
            g21 g21Var = x11Var.f18261b;
            x71 x71VarG = yo0.G(jm.a.n(new rt(24, x11Var.f18260a, x11Var.f18262c)), huVar, x11Var.f18263d);
            g21Var.e(52, x71VarG);
            x11Var.f18265f = x71VarG;
        }
        return "";
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws PackageManager.NameNotFoundException {
        Object objApply;
        Object objF;
        boolean z3 = true;
        boolean z10 = true;
        Object obj = null;
        switch (this.f11567a) {
            case 0:
                String str = (String) ((s81) this.f11568b).f15908a;
                s81 s81Var = s81.f15906b;
                return new pm0(z10 ? 1 : 0, str, obj);
            case 1:
                return new um0(3, (List) ((xl0) this.f11568b).f18422c);
            case 2:
                ((or0) this.f11568b).mo161b();
                return null;
            case 3:
                Context context = (Context) ((aw) this.f11568b).f9451b;
                return al0.i(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
            case 4:
                ky0 ky0Var = (ky0) this.f11568b;
                synchronized (ky0Var) {
                    try {
                        try {
                            FileInputStream fileInputStream = new FileInputStream(ky0Var.f13289a);
                            try {
                                objF = ky0Var.f13291c.f(fileInputStream);
                                fileInputStream.close();
                            } catch (Throwable th2) {
                                try {
                                    fileInputStream.close();
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                }
                                throw th2;
                            }
                        } catch (FileNotFoundException unused) {
                            objApply = ky0Var.f13291c.zzc();
                            return objApply;
                        } catch (IOException e2) {
                            objApply = ky0Var.f13292d.apply(new hy0(e2));
                            return objApply;
                        }
                    } catch (hy0 e10) {
                        objApply = ky0Var.f13292d.apply(e10);
                        return objApply;
                    }
                }
                return objF;
            case 5:
                fz0 fz0Var = (fz0) this.f11568b;
                ((lz0) fz0Var.f11314c.a()).a();
                ((sz0) fz0Var.f11313b.a()).a();
                return null;
            case 6:
                return ((cs1) this.f11568b).a();
            case 7:
                m11 m11Var = (m11) this.f11568b;
                g21 g21Var = m11Var.f13729i;
                ky0 ky0Var2 = m11Var.f13723b;
                ky0 ky0Var3 = m11Var.f13725d;
                cs1 cs1Var = m11Var.f13727f;
                try {
                    File file = ky0Var2.f13289a;
                    File file2 = ky0Var2.f13289a;
                    if (file.exists()) {
                        File file3 = ((ky0) cs1Var.a()).f13289a;
                        File file4 = ((ky0) m11Var.f13726e.a()).f13289a;
                        try {
                            if (file3.exists()) {
                                File parentFile = file4.getParentFile();
                                if (parentFile != null) {
                                    mq0.W(parentFile);
                                }
                                mq0.x(file4);
                                mq0.J(file3, file4);
                            }
                            File file5 = ky0Var3.f13289a;
                            File file6 = m11Var.f13724c.f13289a;
                            try {
                                if (file5.exists()) {
                                    mq0.x(file6);
                                    mq0.J(file5, file6);
                                }
                                File file7 = m11Var.f13722a.f13289a;
                                try {
                                    if (file.exists()) {
                                        mq0.x(file7);
                                        mq0.J(file, file7);
                                    }
                                    file2.delete();
                                    ((ky0) cs1Var.a()).f13289a.delete();
                                    ky0Var3.f13289a.delete();
                                } catch (IOException | SecurityException e11) {
                                    g21Var.d(15313, e11);
                                    ky0Var2.f13289a.delete();
                                    ((ky0) cs1Var.a()).f13289a.delete();
                                    ky0Var3.f13289a.delete();
                                    z3 = false;
                                    return new Boolean(z3);
                                }
                            } catch (IOException | SecurityException e12) {
                                g21Var.d(15312, e12);
                            }
                        } catch (IOException e13) {
                            e = e13;
                            g21Var.d(15311, e);
                            ky0Var2.f13289a.delete();
                            ((ky0) cs1Var.a()).f13289a.delete();
                            ky0Var3.f13289a.delete();
                            z3 = false;
                            return new Boolean(z3);
                        } catch (SecurityException e14) {
                            e = e14;
                            g21Var.d(15311, e);
                            ky0Var2.f13289a.delete();
                            ((ky0) cs1Var.a()).f13289a.delete();
                            ky0Var3.f13289a.delete();
                            z3 = false;
                            return new Boolean(z3);
                        }
                        return new Boolean(z3);
                    }
                    file2.delete();
                    ((ky0) cs1Var.a()).f13289a.delete();
                    ky0Var3.f13289a.delete();
                    z3 = false;
                    return new Boolean(z3);
                } catch (Throwable th4) {
                    ky0Var2.f13289a.delete();
                    ((ky0) cs1Var.a()).f13289a.delete();
                    ky0Var3.f13289a.delete();
                    throw th4;
                }
            case 8:
                return a();
            case 9:
                Context context2 = ((y11) this.f11568b).f18601a;
                try {
                    return al0.i(context2, context2.getPackageName(), Integer.toString(context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionCode));
                } catch (Throwable unused2) {
                    return null;
                }
            default:
                c21 c21Var = (c21) this.f11568b;
                c21Var.getClass();
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.USER_PRESENT");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
                c21Var.f9939a.registerReceiver(c21Var, intentFilter);
                return null;
        }
    }

    public /* synthetic */ go0(s81 s81Var) {
        this.f11567a = 0;
        s81 s81Var2 = s81.f15906b;
        this.f11568b = s81Var;
    }
}
