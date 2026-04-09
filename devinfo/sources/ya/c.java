package ya;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.pk;
import com.google.android.gms.internal.ads.sk;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37400a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f37401b;

    public /* synthetic */ c(g gVar, int i4) {
        this.f37400a = i4;
        this.f37401b = gVar;
    }

    private final void a() {
        g gVar = this.f37401b;
        gVar.getClass();
        t5.p pVar = ua.j.C.f35271o;
        String str = gVar.f37453d;
        String str2 = gVar.f37454e;
        String str3 = gVar.f37455f;
        boolean zO = pVar.o();
        Context context = gVar.f37450a;
        boolean zI = pVar.i(context, str, str2);
        synchronized (pVar.f34254c) {
            pVar.f34252a = zI;
        }
        if (!pVar.o()) {
            pVar.j(context, str, str2);
            return;
        }
        if (!zO && !TextUtils.isEmpty(str3)) {
            pVar.l(context, str2, str3, str);
        }
        za.i.c("Device is linked for debug signals.");
        pVar.p(context, "The device is successfully linked for troubleshooting.", false, true);
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f37400a) {
            case 0:
                g gVar = this.f37401b;
                gVar.d(gVar.f37450a);
                return;
            case 1:
                g gVar2 = this.f37401b;
                ua.j jVar = ua.j.C;
                t5.p pVar = jVar.f35271o;
                Context context = gVar2.f37450a;
                String str = gVar2.f37453d;
                String str2 = gVar2.f37454e;
                pVar.getClass();
                pk pkVar = sk.J5;
                va.s sVar = va.s.f36163e;
                String strQ = t5.p.q(context, pVar.r(context, (String) sVar.f36166c.a(pkVar), str, str2).toString(), str2);
                if (TextUtils.isEmpty(strQ)) {
                    za.i.c("Not linked for in app preview.");
                } else {
                    try {
                        JSONObject jSONObject = new JSONObject(strQ.trim());
                        String strOptString = jSONObject.optString("gct");
                        pVar.f34257f = jSONObject.optString("status");
                        if (((Boolean) sVar.f36166c.a(sk.f16387wa)).booleanValue()) {
                            String str3 = (String) pVar.f34257f;
                            boolean z3 = "0".equals(str3) || "2".equals(str3);
                            pVar.m(z3);
                            jVar.f35265h.i().i(!z3 ? "" : str);
                        }
                        synchronized (pVar.f34254c) {
                            pVar.f34256e = strOptString;
                        }
                        String str4 = (String) pVar.f34257f;
                        if ("2".equals(str4)) {
                            za.i.c("Creative is not pushed for this device.");
                            pVar.p(context, "There was no creative pushed from DFP to the device.", false, false);
                            return;
                        } else if ("1".equals(str4)) {
                            za.i.c("The app is not linked for creative preview.");
                            pVar.j(context, str, str2);
                            return;
                        } else {
                            if ("0".equals(str4)) {
                                za.i.c("Device is linked for in app preview.");
                                pVar.p(context, "The device is successfully linked for creative preview.", false, true);
                                return;
                            }
                            return;
                        }
                    } catch (JSONException e2) {
                        za.i.i("Fail to get in app preview response json.", e2);
                    }
                }
                pVar.p(context, "In-app preview failed to load because of a system error. Please try again later.", true, true);
                return;
            case 2:
                a();
                return;
            case 3:
                g gVar3 = this.f37401b;
                gVar3.d(gVar3.f37450a);
                return;
            case 4:
                g gVar4 = this.f37401b;
                gVar4.getClass();
                ua.j.C.f35271o.h(gVar4.f37450a);
                return;
            case 5:
                g gVar5 = this.f37401b;
                gVar5.getClass();
                ua.j.C.f35271o.h(gVar5.f37450a);
                return;
            default:
                g gVar6 = this.f37401b;
                gVar6.g = 4;
                gVar6.b();
                return;
        }
    }
}
