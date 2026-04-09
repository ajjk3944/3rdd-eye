package A8;

import A9.C0575f;
import A9.F;
import A9.U;
import P7.C1484a;
import P7.C1486c;
import P7.x;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.ActivityC1762o;
import b9.C1992A;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.Purchase;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import com.zipoapps.premiumhelper.e;
import com.zipoapps.premiumhelper.ui.rate.f;
import i8.C4461a;
import p9.InterfaceC5480a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class i implements p9.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f126b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f127c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f128d;

    public /* synthetic */ i(int i, Object obj, Object obj2) {
        this.f126b = i;
        this.f127c = obj;
        this.f128d = obj2;
    }

    @Override // p9.l
    public final Object invoke(Object obj) {
        switch (this.f126b) {
            case 0:
                f.c result = (f.c) obj;
                kotlin.jvm.internal.l.f(result, "result");
                boolean z10 = result != f.c.NONE;
                k kVar = (k) this.f127c;
                kVar.f142h = z10;
                k.f(kVar, (ActivityC1762o) this.f128d, 2);
                break;
            case 1:
                kotlin.jvm.internal.l.f((e8.d) obj, "<unused var>");
                Context context = (Context) this.f127c;
                String string = context.getString(R.string.permissions_required);
                kotlin.jvm.internal.l.e(string, "getString(...)");
                String string2 = context.getString(R.string.rationale_permission);
                kotlin.jvm.internal.l.e(string2, "getString(...)");
                String string3 = context.getString(R.string.OK);
                kotlin.jvm.internal.l.e(string3, "getString(...)");
                e8.f.d(context, (e8.d) this.f128d, string, string2, string3);
                break;
            case 2:
                x.b status = (x.b) obj;
                kotlin.jvm.internal.l.f(status, "status");
                C0575f.e(F.a(U.f212b), null, null, new C1486c(status, (C1484a) this.f128d, null), 3);
                ((InterfaceC5480a) this.f127c).invoke();
                if (status.f10833a == x.c.RESULT_OK) {
                    com.zipoapps.premiumhelper.e.f37006D.getClass();
                    C4461a c4461a = e.a.a().f37021k;
                    kotlin.jvm.internal.l.f(c4461a, "<this>");
                    c4461a.u("First_consent_accepted", new Bundle[0]);
                }
                break;
            default:
                BillingResult response = (BillingResult) obj;
                kotlin.jvm.internal.l.f(response, "response");
                boolean zI = k8.F.i(response);
                k8.t tVar = (k8.t) this.f127c;
                Purchase purchase = (Purchase) this.f128d;
                if (zI) {
                    tVar.m().a("Auto Acknowledge " + purchase + " result: " + response.getResponseCode(), new Object[0]);
                } else {
                    tVar.m().c("Auto Acknowledge " + purchase + " failed " + response.getResponseCode(), new Object[0]);
                }
                break;
        }
        return C1992A.f18074a;
    }
}
