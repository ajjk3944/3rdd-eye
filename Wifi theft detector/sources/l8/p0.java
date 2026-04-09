package l8;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.databinding.ViewDataBinding;
import com.wifihacker.whousemywifi.wifirouter.wifisecurity.R;

/* loaded from: classes3.dex */
public class p0 extends o0 {
    public static final ViewDataBinding.i G = null;
    public static final SparseIntArray H;
    public long F;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        H = sparseIntArray;
        sparseIntArray.put(R.id.iv_device_icon, 1);
        sparseIntArray.put(R.id.ll_item_brand, 2);
        sparseIntArray.put(R.id.tv_item_device_name, 3);
        sparseIntArray.put(R.id.ll_device_name, 4);
        sparseIntArray.put(R.id.tv_device_brand, 5);
        sparseIntArray.put(R.id.ll_ip_address, 6);
        sparseIntArray.put(R.id.tv_item_ip, 7);
        sparseIntArray.put(R.id.btn_sign, 8);
    }

    public p0(androidx.databinding.f fVar, View view) {
        this(fVar, view, ViewDataBinding.C(fVar, view, 9, G, H));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void q() {
        synchronized (this) {
            this.F = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean y() {
        synchronized (this) {
            try {
                return this.F != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void z() {
        synchronized (this) {
            this.F = 1L;
        }
        F();
    }

    public p0(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (AppCompatButton) objArr[8], (ImageView) objArr[1], (LinearLayout) objArr[4], (LinearLayout) objArr[6], (LinearLayout) objArr[2], (LinearLayout) objArr[0], (TextView) objArr[5], (TextView) objArr[3], (TextView) objArr[7]);
        this.F = -1L;
        this.B.setTag(null);
        H(view);
        z();
    }
}
