package l8;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.ViewDataBinding;
import com.wifihacker.whousemywifi.wifirouter.wifisecurity.R;

/* loaded from: classes3.dex */
public class p1 extends o1 {
    public static final ViewDataBinding.i J = null;
    public static final SparseIntArray K;
    public final LinearLayout H;
    public long I;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        K = sparseIntArray;
        sparseIntArray.put(R.id.widget_ripple, 1);
        sparseIntArray.put(R.id.widget_leidabo, 2);
        sparseIntArray.put(R.id.router_manager_card, 3);
        sparseIntArray.put(R.id.lv_router_manager, 4);
        sparseIntArray.put(R.id.tv_wifi_you_family, 5);
        sparseIntArray.put(R.id.tv_online_devices, 6);
        sparseIntArray.put(R.id.tv_new_joined_device, 7);
        sparseIntArray.put(R.id.tv_stranger_device_num, 8);
        sparseIntArray.put(R.id.tv_stranger_device, 9);
        sparseIntArray.put(R.id.tv_known_device_num, 10);
        sparseIntArray.put(R.id.tv_known_device, 11);
    }

    public p1(androidx.databinding.f fVar, View view) {
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

    public p1(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (LinearLayout) objArr[4], (CardView) objArr[3], (TextView) objArr[11], (TextView) objArr[10], (TextView) objArr[7], (TextView) objArr[6], (TextView) objArr[9], (TextView) objArr[8], (TextView) objArr[5], (ImageView) objArr[2], (FrameLayout) objArr[1]);
        this.I = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.H = linearLayout;
        linearLayout.setTag(null);
        H(view);
        z();
    }
}
