package Y4;

import a2.AbstractC0271g;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.PorterDuff;
import android.os.Build;
import android.widget.RelativeLayout;
import com.apm.insight.R;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;

/* loaded from: classes.dex */
public final class S extends AbstractC0271g {
    @Override // a2.AbstractC0271g
    public final void c(BaseViewHolder baseViewHolder, Object obj) {
        T t6 = (T) obj;
        q5.i.e(baseViewHolder, "holder");
        q5.i.e(t6, "item");
        RelativeLayout relativeLayout = (RelativeLayout) baseViewHolder.getView(R.id.wifi_name_bg);
        baseViewHolder.setVisible(R.id.wifi_encryption, t6.f4440h);
        if (Build.VERSION.SDK_INT >= 29) {
            relativeLayout.getBackground().setColorFilter(new BlendModeColorFilter(t6.f4433a, BlendMode.OVERLAY));
        } else {
            relativeLayout.getBackground().setColorFilter(t6.f4433a, PorterDuff.Mode.OVERLAY);
        }
        baseViewHolder.setText(R.id.wifi_name, t6.f4436d);
        baseViewHolder.setText(R.id.wifi_mac, t6.f4437e);
        baseViewHolder.setText(R.id.wifi_frequency, String.valueOf(t6.f4438f));
        baseViewHolder.setText(R.id.wifi_channel, String.valueOf(t6.f4439g));
        baseViewHolder.setText(R.id.wifi_signal_val, String.valueOf(t6.f4434b));
    }
}
