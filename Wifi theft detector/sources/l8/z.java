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
public class z extends y {
    public static final ViewDataBinding.i D = null;
    public static final SparseIntArray E;
    public final LinearLayout B;
    public long C;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        E = sparseIntArray;
        sparseIntArray.put(R.id.rl_widget_scanning, 1);
        sparseIntArray.put(R.id.widget_ripple, 2);
        sparseIntArray.put(R.id.widget_leidabo, 3);
        sparseIntArray.put(R.id.widget_reading_glass, 4);
        sparseIntArray.put(R.id.tv_online_count, 5);
    }

    public z(androidx.databinding.f fVar, View view) {
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

    public z(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (RelativeLayout) objArr[1], (TextView) objArr[5], (ImageView) objArr[3], (ImageView) objArr[4], (FrameLayout) objArr[2]);
        this.C = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.B = linearLayout;
        linearLayout.setTag(null);
        H(view);
        z();
    }
}
