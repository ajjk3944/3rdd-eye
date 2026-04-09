package defpackage;

import android.content.Context;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class yf1 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ mq1 g;

    public /* synthetic */ yf1(mq1 mq1Var, int i) {
        this.f = i;
        this.g = mq1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f) {
            case 0:
                mq1 mq1Var = this.g;
                mq1Var.d(mq1Var.a);
                return;
            case 1:
                mq1 mq1Var2 = this.g;
                hg4 hg4Var = hg4.C;
                us1 us1Var = hg4Var.o;
                Context context = mq1Var2.a;
                String str = mq1Var2.d;
                String str2 = mq1Var2.e;
                us1Var.getClass();
                iz1 iz1Var = mz1.p5;
                tw1 tw1Var = tw1.e;
                String strJ = us1.j(context, us1Var.k(context, (String) tw1Var.c.a(iz1Var), str, str2).toString(), str2);
                if (TextUtils.isEmpty(strJ)) {
                    gi2.U("Not linked for in app preview.");
                } else {
                    try {
                        JSONObject jSONObject = new JSONObject(strJ.trim());
                        String strOptString = jSONObject.optString("gct");
                        us1Var.f = jSONObject.optString("status");
                        if (((Boolean) tw1Var.c.a(mz1.X9)).booleanValue()) {
                            boolean z = "0".equals(us1Var.f) || "2".equals(us1Var.f);
                            us1Var.f(z);
                            hg4Var.h.g().f(!z ? "" : str);
                        }
                        synchronized (us1Var.a) {
                            us1Var.c = strOptString;
                        }
                        if ("2".equals(us1Var.f)) {
                            gi2.U("Creative is not pushed for this device.");
                            us1Var.i(context, "There was no creative pushed from DFP to the device.", false, false);
                            return;
                        } else if ("1".equals(us1Var.f)) {
                            gi2.U("The app is not linked for creative preview.");
                            us1Var.c(context, str, str2);
                            return;
                        } else {
                            if ("0".equals(us1Var.f)) {
                                gi2.U("Device is linked for in app preview.");
                                us1Var.i(context, "The device is successfully linked for creative preview.", false, true);
                                return;
                            }
                            return;
                        }
                    } catch (JSONException unused) {
                        gi2.q0(5);
                    }
                }
                us1Var.i(context, "In-app preview failed to load because of a system error. Please try again later.", true, true);
                return;
            case 2:
                mq1 mq1Var3 = this.g;
                mq1Var3.getClass();
                us1 us1Var2 = hg4.C.o;
                String str3 = mq1Var3.d;
                String str4 = mq1Var3.e;
                String str5 = mq1Var3.f;
                boolean zH = us1Var2.h();
                Context context2 = mq1Var3.a;
                boolean zB = us1Var2.b(context2, str3, str4);
                synchronized (us1Var2.a) {
                    us1Var2.d = zB;
                }
                if (!us1Var2.h()) {
                    us1Var2.c(context2, str3, str4);
                    return;
                }
                if (!zH && !TextUtils.isEmpty(str5)) {
                    us1Var2.e(context2, str4, str5, str3);
                }
                gi2.U("Device is linked for debug signals.");
                us1Var2.i(context2, "The device is successfully linked for troubleshooting.", false, true);
                return;
            case 3:
                mq1 mq1Var4 = this.g;
                mq1Var4.d(mq1Var4.a);
                return;
            case 4:
                mq1 mq1Var5 = this.g;
                mq1Var5.getClass();
                hg4.C.o.a(mq1Var5.a);
                return;
            case 5:
                mq1 mq1Var6 = this.g;
                mq1Var6.getClass();
                hg4.C.o.a(mq1Var6.a);
                return;
            default:
                mq1 mq1Var7 = this.g;
                mq1Var7.g = 4;
                mq1Var7.b();
                return;
        }
    }
}
