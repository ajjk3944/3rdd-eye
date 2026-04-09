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
public class n0 extends m0 {

    /* renamed from: a0, reason: collision with root package name */
    public static final ViewDataBinding.i f23296a0;

    /* renamed from: b0, reason: collision with root package name */
    public static final SparseIntArray f23297b0;
    public final LinearLayout Y;
    public long Z;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(29);
        f23296a0 = iVar;
        iVar.a(0, new String[]{"view_title"}, new int[]{1}, new int[]{R.layout.view_title});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f23297b0 = sparseIntArray;
        sparseIntArray.put(R.id.tv_title_device_ip, 2);
        sparseIntArray.put(R.id.tv_device_ip, 3);
        sparseIntArray.put(R.id.lv_device_mac, 4);
        sparseIntArray.put(R.id.tv_title_device_mac, 5);
        sparseIntArray.put(R.id.tv_device_mac, 6);
        sparseIntArray.put(R.id.cv_ad_container, 7);
        sparseIntArray.put(R.id.fl_ad_container, 8);
        sparseIntArray.put(R.id.cv_wifi_info, 9);
        sparseIntArray.put(R.id.lv_net_ip, 10);
        sparseIntArray.put(R.id.tv_title_net_ip, 11);
        sparseIntArray.put(R.id.tv_net_ip, 12);
        sparseIntArray.put(R.id.tv_title_wifi_gateway, 13);
        sparseIntArray.put(R.id.tv_wifi_gateway, 14);
        sparseIntArray.put(R.id.tv_title_wifi_netmask, 15);
        sparseIntArray.put(R.id.tv_wifi_netmask, 16);
        sparseIntArray.put(R.id.tv_title_wifi_mac, 17);
        sparseIntArray.put(R.id.tv_wifi_mac, 18);
        sparseIntArray.put(R.id.tv_title_wifi_dns1, 19);
        sparseIntArray.put(R.id.tv_wifi_dns1, 20);
        sparseIntArray.put(R.id.tv_title_wifi_dns2, 21);
        sparseIntArray.put(R.id.tv_wifi_dns2, 22);
        sparseIntArray.put(R.id.tv_title_wifi_broadcast_address, 23);
        sparseIntArray.put(R.id.tv_wifi_broadcast_address, 24);
        sparseIntArray.put(R.id.tv_title_wifi_frequency, 25);
        sparseIntArray.put(R.id.tv_wifi_frequency, 26);
        sparseIntArray.put(R.id.tv_title_wifi_channel, 27);
        sparseIntArray.put(R.id.tv_wifi_channel, 28);
    }

    public n0(androidx.databinding.f fVar, View view) {
        this(fVar, view, ViewDataBinding.C(fVar, view, 29, f23296a0, f23297b0));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void q() {
        synchronized (this) {
            this.Z = 0L;
        }
        ViewDataBinding.s(this.B);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean y() {
        synchronized (this) {
            try {
                if (this.Z != 0) {
                    return true;
                }
                return this.B.y();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void z() {
        synchronized (this) {
            this.Z = 2L;
        }
        this.B.z();
        F();
    }

    public n0(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 1, (CardView) objArr[7], (CardView) objArr[9], (FrameLayout) objArr[8], (LinearLayout) objArr[4], (LinearLayout) objArr[10], (u1) objArr[1], (TextView) objArr[3], (TextView) objArr[6], (TextView) objArr[12], (TextView) objArr[2], (TextView) objArr[5], (TextView) objArr[11], (TextView) objArr[23], (TextView) objArr[27], (TextView) objArr[19], (TextView) objArr[21], (TextView) objArr[25], (TextView) objArr[13], (TextView) objArr[17], (TextView) objArr[15], (TextView) objArr[24], (TextView) objArr[28], (TextView) objArr[20], (TextView) objArr[22], (TextView) objArr[26], (TextView) objArr[14], (TextView) objArr[18], (TextView) objArr[16]);
        this.Z = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.Y = linearLayout;
        linearLayout.setTag(null);
        G(this.B);
        H(view);
        z();
    }
}
