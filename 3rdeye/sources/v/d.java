package V;

import A2.l;
import C.S;
import H6.C0680q;
import androidx.camera.core.impl.H0;
import androidx.camera.core.impl.J0;
import androidx.camera.core.impl.X;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import r.InterfaceC5503a;
import v.I;
import v.Y;
import v.l0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements InterfaceC5503a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12819a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f12820b;

    public /* synthetic */ d(Object obj, int i) {
        this.f12819a = i;
        this.f12820b = obj;
    }

    @Override // r.InterfaceC5503a
    public final Object apply(Object obj) {
        switch (this.f12819a) {
            case 0:
                return (f) ((C0680q) this.f12820b).invoke(obj);
            case 1:
                return ((AppLovinNativeAdImpl) this.f12820b).lambda$getOpenMeasurementVerificationScriptResources$2((JSONArray) obj);
            default:
                l0 l0Var = (l0) this.f12820b;
                Y y10 = l0Var.f46743d;
                if (l0Var.i == l0.a.SESSION_INITIALIZED) {
                    List<X> listB = l0Var.f46747h.b();
                    ArrayList arrayList = new ArrayList();
                    for (X x10 : listB) {
                        l.k("Surface must be SessionProcessorSurface", x10 instanceof J0);
                        arrayList.add((J0) x10);
                    }
                    l0Var.f46746g = new I(y10, arrayList);
                    S.a("ProcessingCaptureSession", "== onCaptureSessinStarted (id = " + l0Var.f46751m + ")");
                    l0Var.f46740a.i();
                    l0Var.i = l0.a.ON_CAPTURE_SESSION_STARTED;
                    H0 h02 = l0Var.f46745f;
                    if (h02 != null) {
                        l0Var.g(h02);
                    }
                    if (l0Var.f46748j != null) {
                        l0Var.e(l0Var.f46748j);
                        l0Var.f46748j = null;
                    }
                }
                return null;
        }
    }
}
