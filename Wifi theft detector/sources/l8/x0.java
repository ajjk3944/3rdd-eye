package l8;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import com.wifihacker.whousemywifi.wifirouter.wifisecurity.R;

/* loaded from: classes3.dex */
public class x0 extends w0 {
    public static final ViewDataBinding.i D = null;
    public static final SparseIntArray E;
    public final LinearLayout B;
    public long C;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        E = sparseIntArray;
        sparseIntArray.put(R.id.edit_ping_count, 1);
        sparseIntArray.put(R.id.edit_port_timeout, 2);
        sparseIntArray.put(R.id.edit_packet_size, 3);
        sparseIntArray.put(R.id.edit_time_to_live, 4);
        sparseIntArray.put(R.id.edit_pings_interval, 5);
    }

    public x0(androidx.databinding.f fVar, View view) {
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

    public x0(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (EditText) objArr[3], (EditText) objArr[1], (EditText) objArr[5], (EditText) objArr[2], (EditText) objArr[4]);
        this.C = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.B = linearLayout;
        linearLayout.setTag(null);
        H(view);
        z();
    }
}
