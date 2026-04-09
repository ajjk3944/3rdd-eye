package l8;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.wifihacker.whousemywifi.wifirouter.wifisecurity.R;

/* loaded from: classes3.dex */
public class x1 extends w1 {
    public static final ViewDataBinding.i C = null;
    public static final SparseIntArray D;
    public long B;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        D = sparseIntArray;
        sparseIntArray.put(R.id.im_index, 1);
        sparseIntArray.put(R.id.tv_mac, 2);
        sparseIntArray.put(R.id.tv_host, 3);
        sparseIntArray.put(R.id.tv_port, 4);
    }

    public x1(androidx.databinding.f fVar, View view) {
        this(fVar, view, ViewDataBinding.C(fVar, view, 5, C, D));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void q() {
        synchronized (this) {
            this.B = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean y() {
        synchronized (this) {
            try {
                return this.B != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void z() {
        synchronized (this) {
            this.B = 1L;
        }
        F();
    }

    public x1(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (ImageView) objArr[1], (RelativeLayout) objArr[0], (TextView) objArr[3], (TextView) objArr[2], (TextView) objArr[4]);
        this.B = -1L;
        this.f23353x.setTag(null);
        H(view);
        z();
    }
}
