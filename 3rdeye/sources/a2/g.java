package A2;

import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.database.Model;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import t4.C5606d;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements p9.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f16c;

    public /* synthetic */ g(String str, int i) {
        this.f15b = i;
        this.f16c = str;
    }

    @Override // p9.l
    public final Object invoke(Object obj) throws Exception {
        E1.c cVarK0;
        E1.a aVar = (E1.a) obj;
        switch (this.f15b) {
            case 0:
                cVarK0 = aVar.K0("SELECT * FROM Model WHERE name = ?");
                String str = this.f16c;
                try {
                    if (str == null) {
                        cVarK0.f(1);
                    } else {
                        cVarK0.Q(1, str);
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
                } finally {
                }
            default:
                cVarK0 = aVar.K0("SELECT * FROM Model WHERE pack = ?");
                String str2 = this.f16c;
                try {
                    if (str2 == null) {
                        cVarK0.f(1);
                    } else {
                        cVarK0.Q(1, str2);
                    }
                    int iV4 = C5606d.v(cVarK0, FacebookMediationAdapter.KEY_ID);
                    int iV5 = C5606d.v(cVarK0, AppMeasurementSdk.ConditionalUserProperty.NAME);
                    int iV6 = C5606d.v(cVarK0, "pack");
                    ArrayList arrayList2 = new ArrayList();
                    while (cVarK0.x()) {
                        Model model2 = new Model();
                        model2.setId((int) cVarK0.getLong(iV4));
                        String strG02 = null;
                        model2.setName(cVarK0.isNull(iV5) ? null : cVarK0.g0(iV5));
                        if (!cVarK0.isNull(iV6)) {
                            strG02 = cVarK0.g0(iV6);
                        }
                        model2.setPack(strG02);
                        arrayList2.add(model2);
                    }
                    cVarK0.close();
                    return arrayList2;
                } finally {
                }
        }
    }
}
