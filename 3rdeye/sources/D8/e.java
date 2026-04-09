package D8;

import D8.i;
import D9.J;
import K6.C0713c;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.ActivityC1762o;
import com.applovin.impl.DialogC2140q;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.activity.MainActivity;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.permissions.PermissionProcessBar;
import com.github.appintro.AppIntroBase;
import com.vungle.ads.L;
import com.zipoapps.premiumhelper.e;
import com.zipoapps.premiumhelper.ui.rate.RateBarDialog;
import com.zipoapps.premiumhelper.ui.settings.secret.PhSecretSettingsActivity;
import java.util.List;
import o.C5376D;
import r7.k;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1096b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1097c;

    public /* synthetic */ e(Object obj, int i) {
        this.f1096b = i;
        this.f1097c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj = this.f1097c;
        switch (this.f1096b) {
            case 0:
                int i = PhSecretSettingsActivity.f37161f;
                J j4 = ((i) ((PhSecretSettingsActivity) obj).f37162c.getValue()).f1105b;
                Object value = j4.getValue();
                i.b.c cVar = value instanceof i.b.c ? (i.b.c) value : null;
                if (cVar != null) {
                    boolean z10 = !cVar.f1112d;
                    List<n> totoParams = cVar.f1109a;
                    kotlin.jvm.internal.l.f(totoParams, "totoParams");
                    i.a source = cVar.f1110b;
                    kotlin.jvm.internal.l.f(source, "source");
                    j4.g(null, new i.b.c(totoParams, source, cVar.f1111c, z10));
                    break;
                }
                break;
            case 1:
                PermissionProcessBar permissionProcessBar = (PermissionProcessBar) obj;
                permissionProcessBar.f22198m.dismiss();
                permissionProcessBar.startActivity(new Intent(permissionProcessBar, (Class<?>) MainActivity.class));
                permissionProcessBar.finish();
                break;
            case 2:
                Q6.a this$0 = (Q6.a) obj;
                kotlin.jvm.internal.l.f(this$0, "this$0");
                this$0.f11311b.invoke();
                break;
            case 3:
                ((com.applovin.impl.mediation.debugger.ui.testmode.a) obj).a(view);
                break;
            case 4:
                ((DialogC2140q) obj).b(view);
                break;
            case 5:
                AppIntroBase.m10onCreate$lambda1((AppIntroBase) obj, view);
                break;
            case 6:
                L.m15registerViewForInteraction$lambda2((L) obj, view);
                break;
            case 7:
                r7.k this$02 = (r7.k) obj;
                kotlin.jvm.internal.l.f(this$02, "this$0");
                T6.b bVar = this$02.f45799y;
                if (bVar != null) {
                    C0713c.y(this$02, bVar);
                }
                k.a aVar = this$02.f45800z;
                C5376D c5376d = aVar.f44534d;
                if (c5376d != null) {
                    c5376d.setSelectionAfterHeaderView();
                }
                aVar.show();
                break;
            case 8:
                ((RateBarDialog) obj).dismissAllowingStateLoss();
                break;
            default:
                com.zipoapps.premiumhelper.ui.rate.e eVar = (com.zipoapps.premiumhelper.ui.rate.e) obj;
                Bundle arguments = eVar.getArguments();
                boolean zB = kotlin.jvm.internal.l.b(arguments != null ? arguments.getString("arg_rate_source", null) : null, "relaunch");
                com.zipoapps.premiumhelper.e.f37006D.getClass();
                com.zipoapps.premiumhelper.e eVarA = e.a.a();
                ActivityC1762o activityC1762oRequireActivity = eVar.requireActivity();
                kotlin.jvm.internal.l.e(activityC1762oRequireActivity, "requireActivity(...)");
                eVarA.f37015d.g(activityC1762oRequireActivity, zB);
                e.a.a().i.m("positive");
                e.a.a().f37021k.s("Rate_us_positive", new Bundle[0]);
                eVar.f37112c = true;
                eVar.dismissAllowingStateLoss();
                break;
        }
    }
}
