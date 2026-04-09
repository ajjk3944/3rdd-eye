package l8;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.wifihacker.whousemywifi.wifirouter.wifisecurity.R;

/* loaded from: classes3.dex */
public class t0 extends s0 {
    public static final ViewDataBinding.i B = null;
    public static final SparseIntArray C;
    public long A;

    /* renamed from: z, reason: collision with root package name */
    public final LinearLayout f23332z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        C = sparseIntArray;
        sparseIntArray.put(R.id.tv_http_tip, 1);
        sparseIntArray.put(R.id.edit_user_name, 2);
        sparseIntArray.put(R.id.edit_pwd, 3);
    }

    public t0(androidx.databinding.f fVar, View view) {
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

    public t0(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (EditText) objArr[3], (EditText) objArr[2], (TextView) objArr[1]);
        this.A = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f23332z = linearLayout;
        linearLayout.setTag(null);
        H(view);
        z();
    }
}
