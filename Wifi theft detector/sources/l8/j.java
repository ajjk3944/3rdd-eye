package l8;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.ViewDataBinding;
import com.wifihacker.whousemywifi.wifirouter.wifisecurity.R;

/* loaded from: classes3.dex */
public class j extends i {
    public static final ViewDataBinding.i B;
    public static final SparseIntArray C;
    public long A;

    /* renamed from: z, reason: collision with root package name */
    public final LinearLayout f23270z;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(4);
        B = iVar;
        iVar.a(0, new String[]{"view_title"}, new int[]{1}, new int[]{R.layout.view_title});
        SparseIntArray sparseIntArray = new SparseIntArray();
        C = sparseIntArray;
        sparseIntArray.put(R.id.cv_router_notice, 2);
        sparseIntArray.put(R.id.tv_router_notice, 3);
    }

    public j(androidx.databinding.f fVar, View view) {
        this(fVar, view, ViewDataBinding.C(fVar, view, 4, B, C));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void q() {
        synchronized (this) {
            this.A = 0L;
        }
        ViewDataBinding.s(this.f23261x);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean y() {
        synchronized (this) {
            try {
                if (this.A != 0) {
                    return true;
                }
                return this.f23261x.y();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void z() {
        synchronized (this) {
            this.A = 2L;
        }
        this.f23261x.z();
        F();
    }

    public j(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 1, (CardView) objArr[2], (u1) objArr[1], (TextView) objArr[3]);
        this.A = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f23270z = linearLayout;
        linearLayout.setTag(null);
        G(this.f23261x);
        H(view);
        z();
    }
}
