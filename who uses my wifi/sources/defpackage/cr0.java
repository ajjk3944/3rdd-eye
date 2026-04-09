package defpackage;

import android.view.View;
import com.phuongpn.whousemywifi.networkscanner.RouterAdminActivity;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class cr0 implements View.OnFocusChangeListener {
    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        int i = RouterAdminActivity.F;
        if (z) {
            return;
        }
        i30.j(view);
        RouterAdminActivity.y(view);
    }
}
