package l8;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.ViewDataBinding;
import com.wifihacker.whousemywifi.wifirouter.wifisecurity.R;

/* loaded from: classes3.dex */
public class d extends c {

    /* renamed from: a0, reason: collision with root package name */
    public static final ViewDataBinding.i f23233a0;

    /* renamed from: b0, reason: collision with root package name */
    public static final SparseIntArray f23234b0;
    public final LinearLayout Y;
    public long Z;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(29);
        f23233a0 = iVar;
        iVar.a(0, new String[]{"view_title"}, new int[]{1}, new int[]{R.layout.view_title});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f23234b0 = sparseIntArray;
        sparseIntArray.put(R.id.base_back_content, 2);
        sparseIntArray.put(R.id.lv_name_top, 3);
        sparseIntArray.put(R.id.activity_devices_detail_device_icon, 4);
        sparseIntArray.put(R.id.activity_devices_detail_device_name, 5);
        sparseIntArray.put(R.id.iv_edit, 6);
        sparseIntArray.put(R.id.device_name, 7);
        sparseIntArray.put(R.id.device_os, 8);
        sparseIntArray.put(R.id.lv_brand, 9);
        sparseIntArray.put(R.id.device_brand, 10);
        sparseIntArray.put(R.id.device_ip, 11);
        sparseIntArray.put(R.id.lv_mac, 12);
        sparseIntArray.put(R.id.device_mac, 13);
        sparseIntArray.put(R.id.lv_gateway, 14);
        sparseIntArray.put(R.id.tv_title_gateway, 15);
        sparseIntArray.put(R.id.tv_gateway, 16);
        sparseIntArray.put(R.id.lv_dns1, 17);
        sparseIntArray.put(R.id.tv_title_dns1, 18);
        sparseIntArray.put(R.id.tv_dns_1, 19);
        sparseIntArray.put(R.id.lv_dns2, 20);
        sparseIntArray.put(R.id.tv_title_dns2, 21);
        sparseIntArray.put(R.id.tv_dns2, 22);
        sparseIntArray.put(R.id.lv_known, 23);
        sparseIntArray.put(R.id.btn_sign, 24);
        sparseIntArray.put(R.id.cv_ad_container, 25);
        sparseIntArray.put(R.id.fl_ad_container, 26);
        sparseIntArray.put(R.id.tv_or_tip, 27);
        sparseIntArray.put(R.id.go_to_route, 28);
    }

    public d(androidx.databinding.f fVar, View view) {
        this(fVar, view, ViewDataBinding.C(fVar, view, 29, f23233a0, f23234b0));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void q() {
        synchronized (this) {
            this.Z = 0L;
        }
        ViewDataBinding.s(this.X);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean y() {
        synchronized (this) {
            try {
                if (this.Z != 0) {
                    return true;
                }
                return this.X.y();
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
        this.X.z();
        F();
    }

    public d(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 1, (AppCompatImageView) objArr[4], (AppCompatTextView) objArr[5], (LinearLayout) objArr[2], (AppCompatButton) objArr[24], (CardView) objArr[25], (TextView) objArr[10], (TextView) objArr[11], (TextView) objArr[13], (TextView) objArr[7], (TextView) objArr[8], (FrameLayout) objArr[26], (Button) objArr[28], (ImageView) objArr[6], (LinearLayout) objArr[9], (LinearLayout) objArr[17], (LinearLayout) objArr[20], (LinearLayout) objArr[14], (RelativeLayout) objArr[23], (LinearLayout) objArr[12], (LinearLayout) objArr[3], (TextView) objArr[19], (TextView) objArr[22], (TextView) objArr[16], (TextView) objArr[27], (TextView) objArr[18], (TextView) objArr[21], (TextView) objArr[15], (u1) objArr[1]);
        this.Z = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.Y = linearLayout;
        linearLayout.setTag(null);
        G(this.X);
        H(view);
        z();
    }
}
