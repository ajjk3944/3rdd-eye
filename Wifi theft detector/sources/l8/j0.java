package l8;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.wifihacker.detector.mvp.view.widget.CustomRecyclerView;
import com.wifihacker.whousemywifi.wifirouter.wifisecurity.R;

/* loaded from: classes3.dex */
public class j0 extends i0 {
    public static final ViewDataBinding.i B;
    public static final SparseIntArray C;
    public long A;

    /* renamed from: z, reason: collision with root package name */
    public final RelativeLayout f23271z;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(4);
        B = iVar;
        iVar.a(0, new String[]{"view_title"}, new int[]{1}, new int[]{R.layout.view_title});
        SparseIntArray sparseIntArray = new SparseIntArray();
        C = sparseIntArray;
        sparseIntArray.put(R.id.tv_content_tip, 2);
        sparseIntArray.put(R.id.rv_wake_history, 3);
    }

    public j0(androidx.databinding.f fVar, View view) {
        this(fVar, view, ViewDataBinding.C(fVar, view, 4, B, C));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void q() {
        synchronized (this) {
            this.A = 0L;
        }
        ViewDataBinding.s(this.f23265y);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean y() {
        synchronized (this) {
            try {
                if (this.A != 0) {
                    return true;
                }
                return this.f23265y.y();
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
        this.f23265y.z();
        F();
    }

    public j0(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 1, (CustomRecyclerView) objArr[3], (TextView) objArr[2], (u1) objArr[1]);
        this.A = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.f23271z = relativeLayout;
        relativeLayout.setTag(null);
        G(this.f23265y);
        H(view);
        z();
    }
}
