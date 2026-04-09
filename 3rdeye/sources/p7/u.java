package P7;

import A9.C0575f;
import A9.U;
import P7.x;
import androidx.appcompat.app.AppCompatActivity;
import com.applovin.impl.C2120g0;
import com.applovin.impl.privacy.cmp.a;
import com.google.android.ump.ConsentForm;
import com.google.android.ump.ConsentInformation;
import com.google.android.ump.FormError;
import va.a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class u implements ConsentForm.OnConsentFormDismissedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10814a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10815b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f10816c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f10817d;

    public /* synthetic */ u(Object obj, Object obj2, Object obj3, int i) {
        this.f10814a = i;
        this.f10815b = obj;
        this.f10816c = obj2;
        this.f10817d = obj3;
    }

    @Override // com.google.android.ump.ConsentForm.OnConsentFormDismissedListener
    public final void onConsentFormDismissed(FormError formError) throws Throwable {
        Object obj = this.f10817d;
        Object obj2 = this.f10816c;
        Object obj3 = this.f10815b;
        switch (this.f10814a) {
            case 0:
                if (formError != null) {
                    a.b bVar = va.a.f47104a;
                    bVar.o("x");
                    bVar.c(formError.getErrorCode() + " - " + formError.getMessage(), new Object[0]);
                }
                x xVar = (x) obj3;
                C0575f.e(A9.F.a(U.f212b), null, null, new z(xVar, null), 3);
                ConsentInformation consentInformation = xVar.f10825b;
                p9.l lVar = (p9.l) obj2;
                if (consentInformation == null || consentInformation.getConsentStatus() != 3) {
                    a.b bVar2 = va.a.f47104a;
                    bVar2.o("x");
                    bVar2.c("Consent form cancelled", new Object[0]);
                    x.c cVar = x.c.ERROR;
                    ConsentInformation consentInformation2 = xVar.f10825b;
                    lVar.invoke(new x.b(cVar, "Consent status: " + (consentInformation2 != null ? Integer.valueOf(consentInformation2.getConsentStatus()) : null)));
                } else {
                    lVar.invoke(new x.b(x.c.RESULT_OK, null));
                }
                xVar.f10826c = null;
                xVar.d();
                xVar.f(null);
                xVar.e((AppCompatActivity) obj, null, new v());
                break;
            default:
                ((com.applovin.impl.privacy.cmp.a) obj3).a((C2120g0) obj2, (a.InterfaceC0315a) obj, formError);
                break;
        }
    }
}
