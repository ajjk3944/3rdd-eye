package O4;

import A2.C0117e;
import a2.AbstractC0271g;
import android.view.View;
import com.lefan.signal.network.webSpeed.WebSpeedActivity;
import com.lefan.signal.network.webSpeed.WebSpeedBean;
import d5.AbstractC2282j;
import e2.InterfaceC2302a;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements InterfaceC2302a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WebSpeedActivity f3070a;

    public /* synthetic */ b(WebSpeedActivity webSpeedActivity) {
        this.f3070a = webSpeedActivity;
    }

    @Override // e2.InterfaceC2302a
    public void a(AbstractC0271g abstractC0271g, View view, int i) {
        int i3 = WebSpeedActivity.f18847S;
        WebSpeedActivity webSpeedActivity = this.f3070a;
        WebSpeedBean webSpeedBean = (WebSpeedBean) AbstractC2282j.V(i, webSpeedActivity.f18850Q);
        if (webSpeedBean == null) {
            return;
        }
        l lVar = new l();
        lVar.f3100K0 = new C0117e(10, webSpeedActivity);
        lVar.f3099J0 = webSpeedBean;
        lVar.f0(webSpeedActivity.s(), "web_speed_show");
    }
}
