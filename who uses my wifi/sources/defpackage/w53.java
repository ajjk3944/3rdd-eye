package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.telephony.TelephonyManager;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class w53 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w53(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws PackageManager.NameNotFoundException {
        int i;
        Object objApply;
        boolean zIsActiveNetworkMetered = false;
        switch (this.a) {
            case 0:
                Context context = ((o33) this.b).c;
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                String networkOperator = telephonyManager.getNetworkOperator();
                int phoneType = telephonyManager.getPhoneType();
                hg4 hg4Var = hg4.C;
                lf4 lf4Var = hg4Var.c;
                int iOrdinal = -1;
                if (lf4.c(context, "android.permission.ACCESS_NETWORK_STATE")) {
                    ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    if (activeNetworkInfo != null) {
                        int type = activeNetworkInfo.getType();
                        iOrdinal = activeNetworkInfo.getDetailedState().ordinal();
                        i = type;
                    } else {
                        i = -1;
                    }
                    zIsActiveNetworkMetered = connectivityManager.isActiveNetworkMetered();
                } else {
                    i = -2;
                }
                return new v53(networkOperator, i, hg4Var.f.Y(context), phoneType, zIsActiveNetworkMetered, iOrdinal);
            case 1:
                String str = (String) ((lq3) this.b).f;
                lq3 lq3Var = lq3.g;
                return new g63(str, null);
            case 2:
                return new q33(4, (List) ((g33) this.b).c);
            case 3:
                ((p93) this.b).mo13a();
                return null;
            case 4:
                Context context2 = (Context) ((p21) this.b).f;
                return g82.w(context2, context2.getPackageName(), Integer.toString(context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionCode));
            case 5:
                lg3 lg3Var = (lg3) this.b;
                synchronized (lg3Var) {
                    try {
                        try {
                            FileInputStream fileInputStream = new FileInputStream(lg3Var.a);
                            try {
                                objApply = lg3Var.c.m(fileInputStream);
                                fileInputStream.close();
                            } finally {
                            }
                        } catch (IOException e) {
                            objApply = lg3Var.d.apply(new jg3(e));
                        } catch (jg3 e2) {
                            objApply = lg3Var.d.apply(e2);
                        }
                    } catch (FileNotFoundException unused) {
                        objApply = lg3Var.c.h();
                    }
                }
                return objApply;
            case 6:
                ph3 ph3Var = (ph3) this.b;
                ((wh3) ph3Var.c.d()).a();
                ((gi3) ph3Var.b.d()).a();
                return null;
            case 7:
                ((fj3) ((xi3) this.b).a.d()).a();
                return null;
            case 8:
                return ((z94) this.b).d();
            case 9:
                zj3 zj3Var = (zj3) this.b;
                vn1 vn1Var = new vn1(15, zj3Var);
                synchronized (zj3Var) {
                    gk3 gk3Var = zj3Var.c;
                    rp3 rp3VarP = pu1.P(wl2.h(new lv2(zj3Var.b, zj3Var.e, 9)), vn1Var, zj3Var.d);
                    gk3Var.d(52, rp3VarP);
                    zj3Var.g = rp3VarP;
                }
                return "";
            case 10:
                Context context3 = ((zj3) this.b).b;
                try {
                    return g82.w(context3, context3.getPackageName(), Integer.toString(context3.getPackageManager().getPackageInfo(context3.getPackageName(), 0).versionCode));
                } catch (Throwable unused2) {
                    return null;
                }
            case 11:
                dk3 dk3Var = (dk3) this.b;
                dk3Var.getClass();
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.USER_PRESENT");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
                dk3Var.a.registerReceiver(dk3Var, intentFilter);
                return null;
            default:
                i63 i63Var = lf4.l;
                lf4 lf4Var2 = hg4.C.c;
                return lf4.o((Uri) this.b);
        }
    }

    public /* synthetic */ w53(lq3 lq3Var) {
        this.a = 1;
        lq3 lq3Var2 = lq3.g;
        this.b = lq3Var;
    }
}
