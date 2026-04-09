package l8;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.wifihacker.whousemywifi.wifirouter.wifisecurity.R;
import com.youdao.material.views.WYProgressView;

/* loaded from: classes3.dex */
public class h0 extends g0 {
    public static final ViewDataBinding.i E = null;
    public static final SparseIntArray F;
    public final RelativeLayout C;
    public long D;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        F = sparseIntArray;
        sparseIntArray.put(R.id.im_logo, 1);
        sparseIntArray.put(R.id.tv_app_name, 2);
        sparseIntArray.put(R.id.tv_app_tip, 3);
        sparseIntArray.put(R.id.progress_wheel, 4);
        sparseIntArray.put(R.id.lv_container, 5);
        sparseIntArray.put(R.id.lv_bottom_content, 6);
    }

    public h0(androidx.databinding.f fVar, View view) {
        this(fVar, view, ViewDataBinding.C(fVar, view, 7, E, F));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void q() {
        synchronized (this) {
            this.D = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean y() {
        synchronized (this) {
            try {
                return this.D != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void z() {
        synchronized (this) {
            this.D = 1L;
        }
        F();
    }

    public h0(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (ImageView) objArr[1], (LinearLayout) objArr[6], (FrameLayout) objArr[5], (WYProgressView) objArr[4], (TextView) objArr[2], (TextView) objArr[3]);
        this.D = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.C = relativeLayout;
        relativeLayout.setTag(null);
        H(view);
        z();
    }
}
