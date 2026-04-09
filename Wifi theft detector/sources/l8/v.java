package l8;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.ViewDataBinding;
import com.wifihacker.whousemywifi.wifirouter.wifisecurity.R;

/* loaded from: classes3.dex */
public class v extends u {
    public static final ViewDataBinding.i J = null;
    public static final SparseIntArray K;
    public final RelativeLayout H;
    public long I;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        K = sparseIntArray;
        sparseIntArray.put(R.id.im_close, 1);
        sparseIntArray.put(R.id.im_logo, 2);
        sparseIntArray.put(R.id.tv_upgrade_title, 3);
        sparseIntArray.put(R.id.tv_upgrade_tip, 4);
        sparseIntArray.put(R.id.tv_intro_1, 5);
        sparseIntArray.put(R.id.tv_intro_2, 6);
        sparseIntArray.put(R.id.tv_intro_3, 7);
        sparseIntArray.put(R.id.lv_price, 8);
        sparseIntArray.put(R.id.tv_price, 9);
        sparseIntArray.put(R.id.tv_h_price, 10);
        sparseIntArray.put(R.id.cv_upgrade_now, 11);
    }

    public v(androidx.databinding.f fVar, View view) {
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

    public v(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (CardView) objArr[11], (ImageView) objArr[1], (ImageView) objArr[2], (LinearLayout) objArr[8], (TextView) objArr[10], (TextView) objArr[5], (TextView) objArr[6], (TextView) objArr[7], (TextView) objArr[9], (TextView) objArr[4], (TextView) objArr[3]);
        this.I = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.H = relativeLayout;
        relativeLayout.setTag(null);
        H(view);
        z();
    }
}
