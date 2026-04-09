package l8;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.ViewDataBinding;
import com.wifihacker.whousemywifi.wifirouter.wifisecurity.R;

/* loaded from: classes3.dex */
public class b0 extends a0 {
    public static final ViewDataBinding.i N;
    public static final SparseIntArray O;
    public final LinearLayout L;
    public long M;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(16);
        N = iVar;
        iVar.a(0, new String[]{"view_title"}, new int[]{1}, new int[]{R.layout.view_title});
        SparseIntArray sparseIntArray = new SparseIntArray();
        O = sparseIntArray;
        sparseIntArray.put(R.id.tv_wifi_name, 2);
        sparseIntArray.put(R.id.lv_r_total_device, 3);
        sparseIntArray.put(R.id.tv_r_online_count, 4);
        sparseIntArray.put(R.id.lv_total_device, 5);
        sparseIntArray.put(R.id.tv_online_count, 6);
        sparseIntArray.put(R.id.tv_offline_count, 7);
        sparseIntArray.put(R.id.lv_know_device, 8);
        sparseIntArray.put(R.id.tv_known_device, 9);
        sparseIntArray.put(R.id.tv_stranger_device, 10);
        sparseIntArray.put(R.id.cv_ad_container, 11);
        sparseIntArray.put(R.id.fl_ad_container, 12);
        sparseIntArray.put(R.id.lv_device_detail, 13);
        sparseIntArray.put(R.id.tv_connected_count, 14);
        sparseIntArray.put(R.id.cv_device_detail, 15);
    }

    public b0(androidx.databinding.f fVar, View view) {
        this(fVar, view, ViewDataBinding.C(fVar, view, 16, N, O));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void q() {
        synchronized (this) {
            this.M = 0L;
        }
        ViewDataBinding.s(this.D);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean y() {
        synchronized (this) {
            try {
                if (this.M != 0) {
                    return true;
                }
                return this.D.y();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void z() {
        synchronized (this) {
            this.M = 2L;
        }
        this.D.z();
        F();
    }

    public b0(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 1, (CardView) objArr[11], (CardView) objArr[15], (FrameLayout) objArr[12], (LinearLayout) objArr[13], (LinearLayout) objArr[8], (LinearLayout) objArr[3], (LinearLayout) objArr[5], (u1) objArr[1], (TextView) objArr[14], (TextView) objArr[9], (TextView) objArr[7], (TextView) objArr[6], (TextView) objArr[4], (TextView) objArr[10], (TextView) objArr[2]);
        this.M = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.L = linearLayout;
        linearLayout.setTag(null);
        G(this.D);
        H(view);
        z();
    }
}
