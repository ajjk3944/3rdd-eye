package H2;

import A2.l;
import C.C0632t;
import C.W;
import N7.G8;
import V.f;
import W.A;
import W.AbstractC1630s;
import W.C1617e;
import W.C1618f;
import W.C1622j;
import W.C1626n;
import W.C1628p;
import W.C1635x;
import W.F;
import W.T;
import W.b0;
import android.content.Intent;
import android.content.IntentSender;
import android.hardware.camera2.CameraCaptureSession;
import android.os.Build;
import android.widget.Toast;
import androidx.camera.core.impl.C1696j0;
import androidx.camera.core.impl.C1702m0;
import androidx.camera.core.impl.C1717u0;
import androidx.camera.core.impl.x0;
import c.ActivityC2008f;
import com.applovin.impl.l2;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinPostbackListener;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.services.BackgroundCameraXService;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.ExecutionException;
import w.C5688b;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2024b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f2025c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2026d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2027e;

    public /* synthetic */ d(ActivityC2008f.g gVar, int i, IntentSender.SendIntentException sendIntentException) {
        this.f2024b = 1;
        this.f2026d = gVar;
        this.f2025c = i;
        this.f2027e = sendIntentException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f2025c;
        Object obj = this.f2027e;
        Object obj2 = this.f2026d;
        switch (this.f2024b) {
            case 0:
                I.b bVar = (I.b) obj;
                Boolean bool = BackgroundCameraXService.f22207t;
                BackgroundCameraXService backgroundCameraXService = (BackgroundCameraXService) obj2;
                try {
                    f fVar = (f) bVar.get();
                    x0 x0Var = new x0(C1717u0.J(new W.a().f668a));
                    C1696j0.f(x0Var);
                    W w10 = new W(x0Var);
                    w10.f662q = W.f660x;
                    w10.D(backgroundCameraXService.f22210d.getSurfaceProvider());
                    int i10 = backgroundCameraXService.f22221p.f2429a.getInt("RESOLUTION", 3);
                    C1622j c1622j = Build.VERSION.SDK_INT <= 23 ? (i10 > 1 && i10 != 2) ? i10 == 3 ? C1635x.f13308b : C1635x.f13307a : C1635x.f13309c : i10 == 0 ? C1635x.f13312f : i10 == 1 ? C1635x.f13310d : i10 == 2 ? C1635x.f13309c : i10 == 3 ? C1635x.f13308b : i10 == 4 ? C1635x.f13307a : C1635x.f13311e;
                    C1622j c1622j2 = C1635x.f13309c;
                    List listAsList = Arrays.asList(c1622j, c1622j2, C1635x.f13308b, C1635x.f13307a, C1635x.f13311e);
                    C1617e c1617e = C1628p.f13297a;
                    A a10 = A.a(listAsList, new C1617e(c1622j2, 4));
                    G8 g82 = F.f13077h0;
                    C1618f.a aVarA = AbstractC1630s.a();
                    b0 b0Var = aVarA.f13256a;
                    if (b0Var == null) {
                        throw new IllegalStateException("Property \"videoSpec\" has not been set");
                    }
                    C1626n.a aVarF = b0Var.f();
                    aVarF.f13289a = a10;
                    aVarA.f13256a = aVarF.a();
                    F f10 = new F(aVarA.a(), g82, g82);
                    T.c cVar = T.f13186D;
                    backgroundCameraXService.f22209c = new T<>(new X.a(C1717u0.J(new T.b(f10).f13202a)));
                    fVar.f();
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    l.q("The specified lens facing is invalid.", i != -1);
                    linkedHashSet.add(new C1702m0(i));
                    fVar.c(backgroundCameraXService.f22224s, new C0632t(linkedHashSet), w10, backgroundCameraXService.f22209c);
                    backgroundCameraXService.b();
                    return;
                } catch (InterruptedException e4) {
                    e = e4;
                    e.printStackTrace();
                    Toast.makeText(backgroundCameraXService, "Camera initialization error: " + e.getMessage(), 0).show();
                    return;
                } catch (ExecutionException e10) {
                    e = e10;
                    e.printStackTrace();
                    Toast.makeText(backgroundCameraXService, "Camera initialization error: " + e.getMessage(), 0).show();
                    return;
                }
            case 1:
                ActivityC2008f.g this$0 = (ActivityC2008f.g) obj2;
                kotlin.jvm.internal.l.f(this$0, "this$0");
                IntentSender.SendIntentException e11 = (IntentSender.SendIntentException) obj;
                kotlin.jvm.internal.l.f(e11, "$e");
                this$0.a(i, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", e11));
                return;
            case 2:
                l2.b((AppLovinAdRewardListener) obj2, (AppLovinAd) obj, i);
                return;
            case 3:
                l2.b((AppLovinPostbackListener) obj2, (String) obj, i);
                return;
            default:
                ((C5688b.C0541b) obj2).f47113a.onCaptureSequenceAborted((CameraCaptureSession) obj, i);
                return;
        }
    }

    public /* synthetic */ d(Object obj, int i, int i10, Object obj2) {
        this.f2024b = i10;
        this.f2026d = obj;
        this.f2027e = obj2;
        this.f2025c = i;
    }
}
