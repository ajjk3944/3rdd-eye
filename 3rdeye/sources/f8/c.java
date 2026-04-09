package F8;

import H0.f;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.ActivityC1762o;
import c.C2023u;
import com.applovin.impl.DialogC2140q;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.permissions.BackgroundPermissions;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.permissions.PermissionProcessBar;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.services.BackgroundCameraXService;
import com.github.appintro.AppIntroBase;
import f8.AbstractActivityC4340c;
import kotlin.jvm.internal.l;
import p4.C5457g;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1718b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1719c;

    public /* synthetic */ c(Object obj, int i) {
        this.f1718b = i;
        this.f1719c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C2023u onBackPressedDispatcher;
        Object obj = this.f1719c;
        switch (this.f1718b) {
            case 0:
                e eVar = (e) obj;
                f fVar = eVar.f1726b;
                if (fVar == null) {
                    l.l("binding");
                    throw null;
                }
                ConstraintLayout logsOpenLayout = (ConstraintLayout) fVar.f1985e;
                l.e(logsOpenLayout, "logsOpenLayout");
                if (logsOpenLayout.getVisibility() != 0) {
                    ActivityC1762o activity = eVar.getActivity();
                    if (activity == null || (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) == null) {
                        return;
                    }
                    onBackPressedDispatcher.d();
                    return;
                }
                f fVar2 = eVar.f1726b;
                if (fVar2 == null) {
                    l.l("binding");
                    throw null;
                }
                ConstraintLayout logsOpenLayout2 = (ConstraintLayout) fVar2.f1985e;
                l.e(logsOpenLayout2, "logsOpenLayout");
                logsOpenLayout2.setVisibility(8);
                f fVar3 = eVar.f1726b;
                if (fVar3 == null) {
                    l.l("binding");
                    throw null;
                }
                ImageView ivShareLog = (ImageView) fVar3.f1984d;
                l.e(ivShareLog, "ivShareLog");
                ivShareLog.setVisibility(8);
                f fVar4 = eVar.f1726b;
                if (fVar4 == null) {
                    l.l("binding");
                    throw null;
                }
                ((WebView) fVar4.f1986f).clearHistory();
                f fVar5 = eVar.f1726b;
                if (fVar5 != null) {
                    ((WebView) fVar5.f1986f).loadUrl("about:blank");
                    return;
                } else {
                    l.l("binding");
                    throw null;
                }
            case 1:
                BackgroundPermissions backgroundPermissions = (BackgroundPermissions) obj;
                backgroundPermissions.f22189j.dismiss();
                backgroundPermissions.finish();
                return;
            case 2:
                ((PermissionProcessBar) obj).f22198m.dismiss();
                return;
            case 3:
                Boolean bool = BackgroundCameraXService.f22207t;
                BackgroundCameraXService backgroundCameraXService = (BackgroundCameraXService) obj;
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - backgroundCameraXService.f22223r < 1000) {
                    return;
                }
                backgroundCameraXService.f22223r = jCurrentTimeMillis;
                try {
                    backgroundCameraXService.b();
                    return;
                } catch (Exception e4) {
                    va.a.a(e4);
                    Toast.makeText(backgroundCameraXService, R.string.error_in_capturing_the_video, 0).show();
                    return;
                }
            case 4:
                S5.f this$0 = (S5.f) obj;
                l.f(this$0, "this$0");
                if (this$0.f11918c.f11927B) {
                    this$0.d();
                    return;
                }
                return;
            case 5:
                ((DialogC2140q) obj).a(view);
                return;
            case 6:
                ((MaxNativeAd) obj).performClick();
                return;
            case 7:
                AppIntroBase.m9onCreate$lambda0((AppIntroBase) obj, view);
                return;
            case 8:
                int i = AbstractActivityC4340c.i;
                ((AbstractActivityC4340c) obj).k().g();
                return;
            default:
                ((C5457g) obj).u();
                return;
        }
    }
}
