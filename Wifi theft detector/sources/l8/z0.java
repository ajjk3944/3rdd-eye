package l8;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import com.wifihacker.whousemywifi.wifirouter.wifisecurity.R;

/* loaded from: classes3.dex */
public class z0 extends y0 {
    public static final ViewDataBinding.i B = null;
    public static final SparseIntArray C;
    public long A;

    /* renamed from: z, reason: collision with root package name */
    public final LinearLayout f23369z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        C = sparseIntArray;
        sparseIntArray.put(R.id.edit_mac_address, 1);
        sparseIntArray.put(R.id.edit_host_address, 2);
        sparseIntArray.put(R.id.edit_port, 3);
    }

    public z0(androidx.databinding.f fVar, View view) {
        this(fVar, view, ViewDataBinding.C(fVar, view, 4, B, C));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void q() {
        synchronized (this) {
            this.A = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean y() {
        synchronized (this) {
            try {
                return this.A != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void z() {
        synchronized (this) {
            this.A = 1L;
        }
        F();
    }

    public z0(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (EditText) objArr[2], (EditText) objArr[1], (EditText) objArr[3]);
        this.A = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f23369z = linearLayout;
        linearLayout.setTag(null);
        H(view);
        z();
    }
}
