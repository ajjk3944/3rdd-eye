package l8;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.wifihacker.detector.mvp.view.widget.SildingFinishLayout;
import com.wifihacker.whousemywifi.wifirouter.wifisecurity.R;

/* loaded from: classes3.dex */
public class p extends o {
    public static final ViewDataBinding.i M;
    public static final SparseIntArray N;
    public final LinearLayout K;
    public long L;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(15);
        M = iVar;
        iVar.a(1, new String[]{"include_lock_screen_layout"}, new int[]{2}, new int[]{R.layout.include_lock_screen_layout});
        SparseIntArray sparseIntArray = new SparseIntArray();
        N = sparseIntArray;
        sparseIntArray.put(R.id.rl_time, 3);
        sparseIntArray.put(R.id.iv_block_wifi_thief_logo, 4);
        sparseIntArray.put(R.id.tv_app_title, 5);
        sparseIntArray.put(R.id.iv_setting, 6);
        sparseIntArray.put(R.id.tv_local_time, 7);
        sparseIntArray.put(R.id.rl_battery, 8);
        sparseIntArray.put(R.id.tv_battery_bg, 9);
        sparseIntArray.put(R.id.tv_battery_text, 10);
        sparseIntArray.put(R.id.tv_month, 11);
        sparseIntArray.put(R.id.tv_day, 12);
        sparseIntArray.put(R.id.tv_title_info, 13);
        sparseIntArray.put(R.id.tv_unlock, 14);
    }

    public p(androidx.databinding.f fVar, View view) {
        this(fVar, view, ViewDataBinding.C(fVar, view, 15, M, N));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void q() {
        synchronized (this) {
            this.L = 0L;
        }
        ViewDataBinding.s(this.f23298w);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean y() {
        synchronized (this) {
            try {
                if (this.L != 0) {
                    return true;
                }
                return this.f23298w.y();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void z() {
        synchronized (this) {
            this.L = 2L;
        }
        this.f23298w.z();
        F();
    }

    public p(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 1, (o1) objArr[2], (ImageView) objArr[4], (ImageView) objArr[6], (RelativeLayout) objArr[8], (RelativeLayout) objArr[3], (SildingFinishLayout) objArr[0], (TextView) objArr[5], (TextView) objArr[9], (TextView) objArr[10], (TextView) objArr[12], (TextView) objArr[7], (TextView) objArr[11], (TextView) objArr[13], (TextView) objArr[14]);
        this.L = -1L;
        G(this.f23298w);
        LinearLayout linearLayout = (LinearLayout) objArr[1];
        this.K = linearLayout;
        linearLayout.setTag(null);
        this.B.setTag(null);
        H(view);
        z();
    }
}
