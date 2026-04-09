package t2;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.E9;
import com.google.android.gms.internal.ads.H9;
import org.json.JSONException;
import org.json.JSONObject;
import q2.C2841s;

/* renamed from: t2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC2919c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23599a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2925i f23600b;

    public /* synthetic */ RunnableC2919c(C2925i c2925i, int i) {
        this.f23599a = i;
        this.f23600b = c2925i;
    }

    private final void a() {
        C2925i c2925i = this.f23600b;
        c2925i.getClass();
        C2928l c2928l = p2.j.f22785C.f22801o;
        String str = c2925i.f23617d;
        String str2 = c2925i.f23618e;
        String str3 = c2925i.f23619f;
        boolean zH = c2928l.h();
        Context context = c2925i.f23614a;
        boolean zB = c2928l.b(context, str, str2);
        synchronized (c2928l.f23631a) {
            c2928l.f23634d = zB;
        }
        if (!c2928l.h()) {
            c2928l.c(context, str, str2);
            return;
        }
        if (!zH && !TextUtils.isEmpty(str3)) {
            c2928l.e(context, str2, str3, str);
        }
        u2.k.c("Device is linked for debug signals.");
        c2928l.i(context, "The device is successfully linked for troubleshooting.", false, true);
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23599a) {
            case 0:
                C2925i c2925i = this.f23600b;
                c2925i.d(c2925i.f23614a);
                return;
            case 1:
                C2925i c2925i2 = this.f23600b;
                p2.j jVar = p2.j.f22785C;
                C2928l c2928l = jVar.f22801o;
                Context context = c2925i2.f23614a;
                String str = c2925i2.f23617d;
                String str2 = c2925i2.f23618e;
                c2928l.getClass();
                E9 e9 = H9.J5;
                C2841s c2841s = C2841s.f23267e;
                String strJ = C2928l.j(context, c2928l.k(context, (String) c2841s.f23270c.a(e9), str, str2).toString(), str2);
                if (TextUtils.isEmpty(strJ)) {
                    u2.k.c("Not linked for in app preview.");
                } else {
                    try {
                        JSONObject jSONObject = new JSONObject(strJ.trim());
                        String strOptString = jSONObject.optString("gct");
                        c2928l.f23636f = jSONObject.optString("status");
                        if (((Boolean) c2841s.f23270c.a(H9.ua)).booleanValue()) {
                            String str3 = c2928l.f23636f;
                            boolean z6 = "0".equals(str3) || "2".equals(str3);
                            c2928l.f(z6);
                            jVar.f22795h.i().i(!z6 ? "" : str);
                        }
                        synchronized (c2928l.f23631a) {
                            c2928l.f23633c = strOptString;
                        }
                        String str4 = c2928l.f23636f;
                        if ("2".equals(str4)) {
                            u2.k.c("Creative is not pushed for this device.");
                            c2928l.i(context, "There was no creative pushed from DFP to the device.", false, false);
                            return;
                        } else if ("1".equals(str4)) {
                            u2.k.c("The app is not linked for creative preview.");
                            c2928l.c(context, str, str2);
                            return;
                        } else {
                            if ("0".equals(str4)) {
                                u2.k.c("Device is linked for in app preview.");
                                c2928l.i(context, "The device is successfully linked for creative preview.", false, true);
                                return;
                            }
                            return;
                        }
                    } catch (JSONException e6) {
                        u2.k.i("Fail to get in app preview response json.", e6);
                    }
                }
                c2928l.i(context, "In-app preview failed to load because of a system error. Please try again later.", true, true);
                return;
            case 2:
                a();
                return;
            case 3:
                C2925i c2925i3 = this.f23600b;
                c2925i3.d(c2925i3.f23614a);
                return;
            case 4:
                C2925i c2925i4 = this.f23600b;
                c2925i4.getClass();
                p2.j.f22785C.f22801o.a(c2925i4.f23614a);
                return;
            case 5:
                C2925i c2925i5 = this.f23600b;
                c2925i5.getClass();
                p2.j.f22785C.f22801o.a(c2925i5.f23614a);
                return;
            default:
                C2925i c2925i6 = this.f23600b;
                c2925i6.f23620g = 4;
                c2925i6.b();
                return;
        }
    }
}
