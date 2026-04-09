package l8;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.wifihacker.detector.mvp.view.widget.RecyclerViewHeader;
import com.wifihacker.whousemywifi.wifirouter.wifisecurity.R;

/* loaded from: classes3.dex */
public class b1 extends a1 {
    public static final ViewDataBinding.i F;
    public static final SparseIntArray G;
    public long E;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(8);
        F = iVar;
        iVar.a(1, new String[]{"wifi_device_count_layout"}, new int[]{2}, new int[]{R.layout.wifi_device_count_layout});
        SparseIntArray sparseIntArray = new SparseIntArray();
        G = sparseIntArray;
        sparseIntArray.put(R.id.recyclerview_device, 3);
        sparseIntArray.put(R.id.lv_header, 4);
        sparseIntArray.put(R.id.progress_bar_device_fragment, 5);
        sparseIntArray.put(R.id.title_shadow, 6);
        sparseIntArray.put(R.id.fab_device, 7);
    }

    public b1(androidx.databinding.f fVar, View view) {
        this(fVar, view, ViewDataBinding.C(fVar, view, 8, F, G));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void q() {
        synchronized (this) {
            this.E = 0L;
        }
        ViewDataBinding.s(this.D);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean y() {
        synchronized (this) {
            try {
                if (this.E != 0) {
                    return true;
                }
                return this.D.y();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void z() {
        synchronized (this) {
            this.E = 2L;
        }
        this.D.z();
        F();
    }

    public b1(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 1, (FloatingActionButton) objArr[7], (CoordinatorLayout) objArr[0], (LinearLayout) objArr[1], (RecyclerViewHeader) objArr[4], (ProgressBar) objArr[5], (RecyclerView) objArr[3], (View) objArr[6], (y1) objArr[2]);
        this.E = -1L;
        this.f23217x.setTag(null);
        this.f23218y.setTag(null);
        G(this.D);
        H(view);
        z();
    }
}
