package mn;

import com.staircase3.opensignal.viewcontrollers.Tab_Overview;
import java.util.MissingResourceException;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements dn.g, dn.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Tab_Overview f16898a;

    public /* synthetic */ g(Tab_Overview tab_Overview) {
        this.f16898a = tab_Overview;
    }

    @Override // dn.f
    public void b(String str) {
        Tab_Overview tab_Overview = this.f16898a;
        if (str == null) {
            tab_Overview.getClass();
        } else {
            tab_Overview.i0(str);
        }
    }

    @Override // dn.g
    public void onDismiss() throws MissingResourceException {
        Tab_Overview tab_Overview = this.f16898a;
        tab_Overview.U0 = null;
        tab_Overview.h0();
    }
}
