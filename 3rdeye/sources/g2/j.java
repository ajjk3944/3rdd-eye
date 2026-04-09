package G2;

import B0.g;
import J8.S;
import P7.C1484a;
import P7.x;
import android.content.Intent;
import android.content.res.Resources;
import android.util.TypedValue;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.lifecycle.Q;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.activity.DetectInfraredActivity;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.activity.TricksActivity;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.permissions.PermissionProcessBar;
import com.zipoapps.premiumhelper.support.ContactSupportActivity;
import f8.AbstractActivityC4340c;
import f8.AbstractC4342e;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import java.util.LinkedHashMap;
import p9.InterfaceC5480a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements InterfaceC5480a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1895b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1896c;

    public /* synthetic */ j(Object obj, int i) {
        this.f1895b = i;
        this.f1896c = obj;
    }

    @Override // p9.InterfaceC5480a
    public final Object invoke() {
        int i = 2;
        Object obj = null;
        Object obj2 = this.f1896c;
        switch (this.f1895b) {
            case 0:
                PermissionProcessBar permissionProcessBar = (PermissionProcessBar) obj2;
                permissionProcessBar.f22195j = 1;
                permissionProcessBar.o(1);
                Button button = permissionProcessBar.f22197l;
                Resources resources = permissionProcessBar.getResources();
                ThreadLocal<TypedValue> threadLocal = B0.g.f359a;
                button.setBackground(g.a.a(resources, R.drawable.next_step_2, null));
                permissionProcessBar.n(new k());
                return null;
            case 1:
                return new x(((C1484a) obj2).f10714a);
            case 2:
                U7.f fVar = (U7.f) obj2;
                return new U7.b(new S(new B8.c(new G1.e(fVar, 6), i), fVar.f12509c.g("interstitial_capping_timestamp"), false), new S(new B8.c(new B8.c(fVar, 3), i), fVar.f12509c.g("interstitial_capping_timestamp"), false));
            case 3:
                int i10 = AbstractActivityC4340c.i;
                return (TextView) ((AbstractActivityC4340c) obj2).findViewById(R.id.tvPriceCurrent);
            case 4:
                AbstractC4342e abstractC4342e = (AbstractC4342e) obj2;
                if (abstractC4342e.f37835e) {
                    return "start_like_pro";
                }
                Q q10 = abstractC4342e.f37833c;
                LinkedHashMap linkedHashMap = q10.f16092a;
                try {
                    obj = linkedHashMap.get(AdRevenueConstants.SOURCE_KEY);
                } catch (ClassCastException unused) {
                    linkedHashMap.remove(AdRevenueConstants.SOURCE_KEY);
                    q10.f16095d.remove(AdRevenueConstants.SOURCE_KEY);
                }
                String str = (String) obj;
                return str == null ? "relaunch" : str;
            case 5:
                int i11 = ContactSupportActivity.f37060f;
                return (EditText) ((ContactSupportActivity) obj2).findViewById(R.id.edit_text);
            default:
                int i12 = TricksActivity.f22117m;
                TricksActivity tricksActivity = (TricksActivity) obj2;
                tricksActivity.getClass();
                tricksActivity.startActivity(new Intent(tricksActivity, (Class<?>) DetectInfraredActivity.class));
                tricksActivity.f22123k.dismiss();
                return null;
        }
    }
}
