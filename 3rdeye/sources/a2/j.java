package A2;

import android.app.Activity;
import b9.C1992A;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.database.Model;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.zipoapps.premiumhelper.ui.rate.f;
import java.util.ArrayList;
import t4.C5606d;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements p9.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f21b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f22c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f23d;

    public /* synthetic */ j(int i, Object obj, Object obj2) {
        this.f21b = i;
        this.f22c = obj;
        this.f23d = obj2;
    }

    @Override // p9.l
    public final Object invoke(Object obj) throws Exception {
        switch (this.f21b) {
            case 0:
                E1.c cVarK0 = ((E1.a) obj).K0("SELECT * FROM Model WHERE name = ? AND pack=?");
                String str = (String) this.f22c;
                try {
                    if (str == null) {
                        cVarK0.f(1);
                    } else {
                        cVarK0.Q(1, str);
                    }
                    String str2 = (String) this.f23d;
                    if (str2 == null) {
                        cVarK0.f(2);
                    } else {
                        cVarK0.Q(2, str2);
                    }
                    int iV = C5606d.v(cVarK0, FacebookMediationAdapter.KEY_ID);
                    int iV2 = C5606d.v(cVarK0, AppMeasurementSdk.ConditionalUserProperty.NAME);
                    int iV3 = C5606d.v(cVarK0, "pack");
                    ArrayList arrayList = new ArrayList();
                    while (cVarK0.x()) {
                        Model model = new Model();
                        model.setId((int) cVarK0.getLong(iV));
                        String strG0 = null;
                        model.setName(cVarK0.isNull(iV2) ? null : cVarK0.g0(iV2));
                        if (!cVarK0.isNull(iV3)) {
                            strG0 = cVarK0.g0(iV3);
                        }
                        model.setPack(strG0);
                        arrayList.add(model);
                    }
                    cVarK0.close();
                    return arrayList;
                } catch (Throwable th) {
                    cVarK0.close();
                    throw th;
                }
            default:
                f.c result = (f.c) obj;
                kotlin.jvm.internal.l.f(result, "result");
                boolean z10 = result != f.c.NONE;
                A8.k kVar = (A8.k) this.f22c;
                kVar.f142h = z10;
                A8.k.f(kVar, (Activity) this.f23d, 2);
                return C1992A.f18074a;
        }
    }
}
