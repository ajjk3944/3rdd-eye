package l8;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.ViewDataBinding;
import com.wifihacker.whousemywifi.wifirouter.wifisecurity.R;

/* loaded from: classes3.dex */
public class n1 extends m1 {
    public static final ViewDataBinding.i K = null;
    public static final SparseIntArray L;
    public final LinearLayout I;
    public long J;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(R.id.cv_wifi_info, 1);
        sparseIntArray.put(R.id.tv_net_ip, 2);
        sparseIntArray.put(R.id.tv_wifi_gateway, 3);
        sparseIntArray.put(R.id.tv_wifi_netmask, 4);
        sparseIntArray.put(R.id.tv_wifi_mac, 5);
        sparseIntArray.put(R.id.tv_wifi_dns1, 6);
        sparseIntArray.put(R.id.tv_wifi_dns2, 7);
        sparseIntArray.put(R.id.tv_wifi_broadcast_address, 8);
        sparseIntArray.put(R.id.tv_wifi_frequency, 9);
        sparseIntArray.put(R.id.tv_wifi_channel, 10);
        sparseIntArray.put(R.id.tv_device_ip, 11);
        sparseIntArray.put(R.id.tv_device_mac, 12);
    }

    public n1(androidx.databinding.f fVar, View view) {
        this(fVar, view, ViewDataBinding.C(fVar, view, 13, K, L));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void q() {
        synchronized (this) {
            this.J = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean y() {
        synchronized (this) {
            try {
                return this.J != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void z() {
        synchronized (this) {
            this.J = 1L;
        }
        F();
    }

    public n1(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (CardView) objArr[1], (TextView) objArr[11], (TextView) objArr[12], (TextView) objArr[2], (TextView) objArr[8], (TextView) objArr[10], (TextView) objArr[6], (TextView) objArr[7], (TextView) objArr[9], (TextView) objArr[3], (TextView) objArr[5], (TextView) objArr[4]);
        this.J = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.I = linearLayout;
        linearLayout.setTag(null);
        H(view);
        z();
    }
}
