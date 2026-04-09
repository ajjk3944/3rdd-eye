package defpackage;

import android.net.Uri;
import java.util.ArrayList;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class ek1 implements yp3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cr1 b;

    public /* synthetic */ ek1(cr1 cr1Var, int i) {
        this.a = i;
        this.b = cr1Var;
    }

    @Override // defpackage.yp3
    public final /* synthetic */ n70 c(Object obj) {
        switch (this.a) {
            case 0:
                cr1 cr1Var = this.b;
                return pu1.P(cr1Var.H3("google.afma.nativeAds.getPublisherCustomRenderedImpressionSignals"), new dn1(cr1Var, (ArrayList) obj, 0), cr1Var.l);
            default:
                cr1 cr1Var2 = this.b;
                return pu1.P(cr1Var2.H3("google.afma.nativeAds.getPublisherCustomRenderedClickSignals"), new vn1(0, (Uri) obj), cr1Var2.l);
        }
    }
}
