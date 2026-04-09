package A2;

import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.database.Model;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import t4.C5606d;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements p9.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f10b;

    @Override // p9.l
    public final Object invoke(Object obj) throws Exception {
        switch (this.f10b) {
            case 0:
                E1.c cVarK0 = ((E1.a) obj).K0("SELECT * FROM Model");
                try {
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
                    return arrayList;
                } finally {
                    cVarK0.close();
                }
            default:
                E1.c it = (E1.c) obj;
                kotlin.jvm.internal.l.f(it, "it");
                return Boolean.valueOf(it.x());
        }
    }
}
