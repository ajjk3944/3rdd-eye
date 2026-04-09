package l8;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import com.wifihacker.whousemywifi.wifirouter.wifisecurity.R;

/* loaded from: classes3.dex */
public class f extends e {
    public static final ViewDataBinding.i A;
    public static final SparseIntArray B;

    /* renamed from: y, reason: collision with root package name */
    public final LinearLayout f23245y;

    /* renamed from: z, reason: collision with root package name */
    public long f23246z;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(3);
        A = iVar;
        iVar.a(0, new String[]{"view_title"}, new int[]{1}, new int[]{R.layout.view_title});
        SparseIntArray sparseIntArray = new SparseIntArray();
        B = sparseIntArray;
        sparseIntArray.put(R.id.fl_password, 2);
    }

    public f(androidx.databinding.f fVar, View view) {
        this(fVar, view, ViewDataBinding.C(fVar, view, 3, A, B));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void q() {
        synchronized (this) {
            this.f23246z = 0L;
        }
        ViewDataBinding.s(this.f23237x);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean y() {
        synchronized (this) {
            try {
                if (this.f23246z != 0) {
                    return true;
                }
                return this.f23237x.y();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void z() {
        synchronized (this) {
            this.f23246z = 2L;
        }
        this.f23237x.z();
        F();
    }

    public f(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 1, (FrameLayout) objArr[2], (u1) objArr[1]);
        this.f23246z = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f23245y = linearLayout;
        linearLayout.setTag(null);
        G(this.f23237x);
        H(view);
        z();
    }
}
