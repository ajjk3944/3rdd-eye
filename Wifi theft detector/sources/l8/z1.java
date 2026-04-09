package l8;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.ViewDataBinding;
import com.wifihacker.whousemywifi.wifirouter.wifisecurity.R;

/* loaded from: classes3.dex */
public class z1 extends y1 {
    public static final ViewDataBinding.i J = null;
    public static final SparseIntArray K;
    public long I;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        K = sparseIntArray;
        sparseIntArray.put(R.id.lv_wifi_info, 1);
        sparseIntArray.put(R.id.tv_wifi_name, 2);
        sparseIntArray.put(R.id.tv_wifi_mac, 3);
        sparseIntArray.put(R.id.tv_wifi_ip, 4);
        sparseIntArray.put(R.id.lv_wifi_status, 5);
        sparseIntArray.put(R.id.tv_online_count, 6);
        sparseIntArray.put(R.id.lv_previously_count, 7);
        sparseIntArray.put(R.id.tv_previously_count, 8);
        sparseIntArray.put(R.id.cv_wifi_analyzer, 9);
        sparseIntArray.put(R.id.cv_speed_test, 10);
        sparseIntArray.put(R.id.tv_app_ad2, 11);
    }

    public z1(androidx.databinding.f fVar, View view) {
        this(fVar, view, ViewDataBinding.C(fVar, view, 12, J, K));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void q() {
        synchronized (this) {
            this.I = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean y() {
        synchronized (this) {
            try {
                return this.I != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void z() {
        synchronized (this) {
            this.I = 1L;
        }
        F();
    }

    public z1(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (CardView) objArr[10], (CardView) objArr[9], (LinearLayout) objArr[0], (LinearLayout) objArr[7], (LinearLayout) objArr[1], (LinearLayout) objArr[5], (TextView) objArr[11], (TextView) objArr[6], (TextView) objArr[8], (TextView) objArr[4], (TextView) objArr[3], (TextView) objArr[2]);
        this.I = -1L;
        this.f23367y.setTag(null);
        H(view);
        z();
    }
}
