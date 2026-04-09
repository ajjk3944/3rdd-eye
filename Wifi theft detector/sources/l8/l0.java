package l8;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import com.wifihacker.whousemywifi.wifirouter.wifisecurity.R;

/* loaded from: classes3.dex */
public class l0 extends k0 {
    public static final ViewDataBinding.i A;
    public static final SparseIntArray B;

    /* renamed from: y, reason: collision with root package name */
    public final LinearLayout f23282y;

    /* renamed from: z, reason: collision with root package name */
    public long f23283z;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(3);
        A = iVar;
        iVar.a(0, new String[]{"view_title"}, new int[]{1}, new int[]{R.layout.view_title});
        SparseIntArray sparseIntArray = new SparseIntArray();
        B = sparseIntArray;
        sparseIntArray.put(R.id.lv_whois, 2);
    }

    public l0(androidx.databinding.f fVar, View view) {
        this(fVar, view, ViewDataBinding.C(fVar, view, 3, A, B));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void q() {
        synchronized (this) {
            this.f23283z = 0L;
        }
        ViewDataBinding.s(this.f23277x);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean y() {
        synchronized (this) {
            try {
                if (this.f23283z != 0) {
                    return true;
                }
                return this.f23277x.y();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void z() {
        synchronized (this) {
            this.f23283z = 2L;
        }
        this.f23277x.z();
        F();
    }

    public l0(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 1, (FrameLayout) objArr[2], (u1) objArr[1]);
        this.f23283z = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f23282y = linearLayout;
        linearLayout.setTag(null);
        G(this.f23277x);
        H(view);
        z();
    }
}
