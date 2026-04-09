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

/* loaded from: classes3.dex */
public class f0 extends e0 {
    public static final ViewDataBinding.i D = null;
    public static final SparseIntArray E;
    public final RelativeLayout B;
    public long C;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        E = sparseIntArray;
        sparseIntArray.put(R.id.lv_app, 1);
        sparseIntArray.put(R.id.im_close, 2);
        sparseIntArray.put(R.id.tv_app_name, 3);
        sparseIntArray.put(R.id.lv_ad, 4);
        sparseIntArray.put(R.id.lv_container, 5);
    }

    public f0(androidx.databinding.f fVar, View view) {
        this(fVar, view, ViewDataBinding.C(fVar, view, 6, D, E));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void q() {
        synchronized (this) {
            this.C = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean y() {
        synchronized (this) {
            try {
                return this.C != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void z() {
        synchronized (this) {
            this.C = 1L;
        }
        F();
    }

    public f0(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (ImageView) objArr[2], (LinearLayout) objArr[4], (RelativeLayout) objArr[1], (FrameLayout) objArr[5], (TextView) objArr[3]);
        this.C = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.B = relativeLayout;
        relativeLayout.setTag(null);
        H(view);
        z();
    }
}
