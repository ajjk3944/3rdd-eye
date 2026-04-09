package l8;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.SwitchCompat;
import androidx.databinding.ViewDataBinding;
import com.wifihacker.whousemywifi.wifirouter.wifisecurity.R;

/* loaded from: classes3.dex */
public class d0 extends c0 {
    public static final ViewDataBinding.i F;
    public static final SparseIntArray G;
    public final LinearLayout D;
    public long E;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(8);
        F = iVar;
        iVar.a(0, new String[]{"view_title"}, new int[]{1}, new int[]{R.layout.view_title});
        SparseIntArray sparseIntArray = new SparseIntArray();
        G = sparseIntArray;
        sparseIntArray.put(R.id.setting_switch_notification, 2);
        sparseIntArray.put(R.id.setting_switch_open_lock_screen, 3);
        sparseIntArray.put(R.id.rl_setting_rate_us, 4);
        sparseIntArray.put(R.id.rl_setting_share, 5);
        sparseIntArray.put(R.id.rl_setting_feedback, 6);
        sparseIntArray.put(R.id.rl_setting_about, 7);
    }

    public d0(androidx.databinding.f fVar, View view) {
        this(fVar, view, ViewDataBinding.C(fVar, view, 8, F, G));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void q() {
        synchronized (this) {
            this.E = 0L;
        }
        ViewDataBinding.s(this.C);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean y() {
        synchronized (this) {
            try {
                if (this.E != 0) {
                    return true;
                }
                return this.C.y();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void z() {
        synchronized (this) {
            this.E = 2L;
        }
        this.C.z();
        F();
    }

    public d0(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 1, (RelativeLayout) objArr[7], (RelativeLayout) objArr[6], (RelativeLayout) objArr[4], (RelativeLayout) objArr[5], (SwitchCompat) objArr[2], (SwitchCompat) objArr[3], (u1) objArr[1]);
        this.E = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.D = linearLayout;
        linearLayout.setTag(null);
        G(this.C);
        H(view);
        z();
    }
}
