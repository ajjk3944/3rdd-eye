package G2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC1759l;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;

/* compiled from: NotificationPermissionsFragment.java */
/* loaded from: classes.dex */
public class i extends ComponentCallbacksC1759l {
    @Override // androidx.fragment.app.ComponentCallbacksC1759l
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            getArguments().getString("param1");
            getArguments().getString("param2");
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1759l
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_notification_permissions, viewGroup, false);
    }
}
