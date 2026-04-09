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

/* loaded from: classes.dex */
public final /* synthetic */ class Zs implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12978a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f12979b;

    public /* synthetic */ Zs(int i, Object obj) {
        this.f12978a = i;
        this.f12979b = obj;
    }

    private final /* synthetic */ Object a() {
        C1463lA c1463lA = (C1463lA) this.f12979b;
        C1754qe c1754qe = new C1754qe(14, c1463lA);
        synchronized (c1463lA) {
            C1948uA c1948uA = c1463lA.f15355c;
            C1358jD c1358jDG = AbstractC1984ut.G(R3.b.m(new Vu(c1463lA.f15354b, c1463lA.f15357e)), c1754qe, c1463lA.f15356d);
            c1948uA.e(52, c1358jDG);
            c1463lA.f15359g = c1358jDG;
        }
        return "";
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws PackageManager.NameNotFoundException {
        Object objApply;
        Object objG;
        boolean z6 = true;
        switch (this.f12978a) {
            case 0:
                String str = (String) ((ED) this.f12979b).f7930a;
                ED ed = ED.f7928b;
                return new C1714ps(str, 1, null);
            case 1:
                return new C2145xs(3, (List) ((Yr) this.f12979b).f12716c);
            case 2:
                ((Iu) this.f12979b).mo12a();
                return null;
            case 3:
                Context context = (Context) ((C1431kf) this.f12979b).f15173b;
                return Cr.e(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
            case 4:
                C2043vy c2043vy = (C2043vy) this.f12979b;
                synchronized (c2043vy) {
                    try {
                        FileInputStream fileInputStream = new FileInputStream(c2043vy.f17372a);
                        try {
                            objG = c2043vy.f17374c.g(fileInputStream);
                            fileInputStream.close();
                        } catch (Throwable th) {
                            try {
                                fileInputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (C1881sy e6) {
                        objApply = c2043vy.f17375d.apply(e6);
                        return objApply;
                    } catch (FileNotFoundException unused) {
                        objApply = c2043vy.f17374c.f();
                        return objApply;
                    } catch (IOException e7) {
                        objApply = c2043vy.f17375d.apply(new C1881sy(e7));
                        return objApply;
                    }
                }
                return objG;
            case 5:
                Sy sy = (Sy) this.f12979b;
                ((Yy) sy.f11295c.c()).a();
                ((C1291hz) sy.f11294b.c()).a();
                return null;
            case 6:
                return ((InterfaceC1692pN) this.f12979b).c();
            case 7:
                Zz zz = (Zz) this.f12979b;
                C1948uA c1948uA = zz.i;
                C2043vy c2043vy2 = zz.f12999b;
                C2043vy c2043vy3 = zz.f13001d;
                InterfaceC1692pN interfaceC1692pN = zz.f13003f;
                try {
                    File file = c2043vy2.f17372a;
                    File file2 = c2043vy2.f17372a;
                    if (file.exists()) {
                        File file3 = ((C2043vy) interfaceC1692pN.c()).f17372a;
                        File file4 = ((C2043vy) zz.f13002e.c()).f17372a;
                        try {
                            if (file3.exists()) {
                                File parentFile = file4.getParentFile();
                                if (parentFile != null) {
                                    AbstractC0582Jp.Y(parentFile);
                                }
                                AbstractC0582Jp.x(file4);
                                AbstractC0582Jp.K(file3, file4);
                            }
                            File file5 = c2043vy3.f17372a;
                            File file6 = zz.f13000c.f17372a;
                            try {
                                if (file5.exists()) {
                                    AbstractC0582Jp.x(file6);
                                    AbstractC0582Jp.K(file5, file6);
                                }
                                File file7 = zz.f12998a.f17372a;
                                try {
                                    if (file.exists()) {
                                        AbstractC0582Jp.x(file7);
                                        AbstractC0582Jp.K(file, file7);
                                    }
                                    file2.delete();
                                    ((C2043vy) interfaceC1692pN.c()).f17372a.delete();
                                    c2043vy3.f17372a.delete();
                                } catch (IOException | SecurityException e8) {
                                    c1948uA.d(15313, e8);
                                    c2043vy2.f17372a.delete();
                                    ((C2043vy) interfaceC1692pN.c()).f17372a.delete();
                                    c2043vy3.f17372a.delete();
                                    z6 = false;
                                    return new Boolean(z6);
                                }
                            } catch (IOException | SecurityException e9) {
                                c1948uA.d(15312, e9);
                            }
                        } catch (IOException e10) {
                            e = e10;
                            c1948uA.d(15311, e);
                            c2043vy2.f17372a.delete();
                            ((C2043vy) interfaceC1692pN.c()).f17372a.delete();
                            c2043vy3.f17372a.delete();
                            z6 = false;
                            return new Boolean(z6);
                        } catch (SecurityException e11) {
                            e = e11;
                            c1948uA.d(15311, e);
                            c2043vy2.f17372a.delete();
                            ((C2043vy) interfaceC1692pN.c()).f17372a.delete();
                            c2043vy3.f17372a.delete();
                            z6 = false;
                            return new Boolean(z6);
                        }
                        return new Boolean(z6);
                    }
                    file2.delete();
                    ((C2043vy) interfaceC1692pN.c()).f17372a.delete();
                    c2043vy3.f17372a.delete();
                    z6 = false;
                    return new Boolean(z6);
                } catch (Throwable th3) {
                    c2043vy2.f17372a.delete();
                    ((C2043vy) interfaceC1692pN.c()).f17372a.delete();
                    c2043vy3.f17372a.delete();
                    throw th3;
                }
            case 8:
                return a();
            case 9:
                Context context2 = ((C1463lA) this.f12979b).f15354b;
                try {
                    return Cr.e(context2, context2.getPackageName(), Integer.toString(context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionCode));
                } catch (Throwable unused2) {
                    return null;
                }
            default:
                C1679pA c1679pA = (C1679pA) this.f12979b;
                c1679pA.getClass();
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.USER_PRESENT");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
                c1679pA.f16143a.registerReceiver(c1679pA, intentFilter);
                return null;
        }
    }

    public /* synthetic */ Zs(ED ed) {
        this.f12978a = 0;
        ED ed2 = ED.f7928b;
        this.f12979b = ed;
    }
}
