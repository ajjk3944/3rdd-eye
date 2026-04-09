package S4;

import a2.AbstractC0271g;
import android.widget.ImageView;
import com.apm.insight.R;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.lefan.signal.ui.noise.NoiseBean;
import java.text.SimpleDateFormat;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class q extends AbstractC0271g {
    @Override // a2.AbstractC0271g
    public final void c(BaseViewHolder baseViewHolder, Object obj) {
        NoiseBean noiseBean = (NoiseBean) obj;
        q5.i.e(baseViewHolder, "holder");
        q5.i.e(noiseBean, "item");
        baseViewHolder.setText(R.id.min_value, R2.a.k(Float.valueOf(noiseBean.getMinValue()), "%.2f"));
        baseViewHolder.setText(R.id.avg_value, R2.a.k(Float.valueOf(noiseBean.getAvgValue()), "%.2f"));
        baseViewHolder.setText(R.id.max_value, R2.a.k(Float.valueOf(noiseBean.getMaxValue()), "%.2f"));
        ImageView imageView = (ImageView) baseViewHolder.getView(R.id.noise_image);
        float avgValue = noiseBean.getAvgValue();
        if (0.0f <= avgValue && avgValue <= 55.0f) {
            imageView.setColorFilter(-16711936);
        } else if (55.0f <= avgValue && avgValue <= 70.0f) {
            imageView.setColorFilter(-256);
        } else if (70.0f > avgValue || avgValue > 85.0f) {
            imageView.setColorFilter(-65536);
        } else {
            imageView.setColorFilter(-65281);
        }
        String str = null;
        baseViewHolder.setText(R.id.moise_time, new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", F4.e.c(null)).format(Long.valueOf(noiseBean.getTime())));
        String address = noiseBean.getAddress();
        if (address != null) {
            str = address;
        } else if (noiseBean.getLat() != null && noiseBean.getLon() != null) {
            String string = f().getString(R.string.coordinate_info);
            q5.i.d(string, "getString(...)");
            str = String.format(string, Arrays.copyOf(new Object[]{R3.b.j(noiseBean.getLat()), R3.b.j(noiseBean.getLon())}, 2));
        }
        baseViewHolder.setText(R.id.noise_address, str);
    }
}
