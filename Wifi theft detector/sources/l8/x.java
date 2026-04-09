package l8;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.wifihacker.whousemywifi.wifirouter.wifisecurity.R;

/* loaded from: classes3.dex */
public class x extends w {
    public static final ViewDataBinding.i A;
    public static final SparseIntArray B;

    /* renamed from: y, reason: collision with root package name */
    public final LinearLayout f23356y;

    /* renamed from: z, reason: collision with root package name */
    public long f23357z;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(3);
        A = iVar;
        iVar.a(0, new String[]{"view_title"}, new int[]{1}, new int[]{R.layout.view_title});
        SparseIntArray sparseIntArray = new SparseIntArray();
        B = sparseIntArray;
        sparseIntArray.put(R.id.tv_version, 2);
    }

    public x(androidx.databinding.f fVar, View view) {
        this(fVar, view, ViewDataBinding.C(fVar, view, 3, A, B));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void q() {
        synchronized (this) {
            this.f23357z = 0L;
        }
        ViewDataBinding.s(this.f23346w);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean y() {
        synchronized (this) {
            try {
                if (this.f23357z != 0) {
                    return true;
                }
                return this.f23346w.y();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void z() {
        synchronized (this) {
            this.f23357z = 2L;
        }
        this.f23346w.z();
        F();
    }

    public x(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 1, (u1) objArr[1], (TextView) objArr[2]);
        this.f23357z = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f23356y = linearLayout;
        linearLayout.setTag(null);
        G(this.f23346w);
        H(view);
        z();
    }
}
