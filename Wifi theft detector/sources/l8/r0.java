package l8;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.wifihacker.whousemywifi.wifirouter.wifisecurity.R;

/* loaded from: classes3.dex */
public class r0 extends q0 {
    public static final SparseIntArray A;

    /* renamed from: z, reason: collision with root package name */
    public static final ViewDataBinding.i f23318z = null;

    /* renamed from: x, reason: collision with root package name */
    public final FrameLayout f23319x;

    /* renamed from: y, reason: collision with root package name */
    public long f23320y;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        A = sparseIntArray;
        sparseIntArray.put(R.id.tv_item_device_tittle, 1);
    }

    public r0(androidx.databinding.f fVar, View view) {
        this(fVar, view, ViewDataBinding.C(fVar, view, 2, f23318z, A));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void q() {
        synchronized (this) {
            this.f23320y = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean y() {
        synchronized (this) {
            try {
                return this.f23320y != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void z() {
        synchronized (this) {
            this.f23320y = 1L;
        }
        F();
    }

    public r0(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (TextView) objArr[1]);
        this.f23320y = -1L;
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.f23319x = frameLayout;
        frameLayout.setTag(null);
        H(view);
        z();
    }
}
